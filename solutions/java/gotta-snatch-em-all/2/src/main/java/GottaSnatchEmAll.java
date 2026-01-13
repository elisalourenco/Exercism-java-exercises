import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> collection = new java.util.HashSet<>(cards);
        return collection;
    }

    static boolean addCard(String card, Set<String> collection) {
        if (collection.contains(card)) {
            return false;
        } else {
            collection.add(card);
            return true;
        }
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean my_set_no = false;
        boolean their_set_no = false;

        if (myCollection.isEmpty() || theirCollection.isEmpty()) {
            return false;
        }

        for (String card : myCollection) {
            if (!theirCollection.contains(card)) {
                my_set_no = true;
                break;
            }
        }
        for (String card : theirCollection) {
            if (!myCollection.contains(card)) {
                their_set_no = true;
                break;
            }
        }
        if (my_set_no || their_set_no) {
            return true;
        }
        return false;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common_collection = new java.util.HashSet<>();
        List<HashSet<String>> hashSets = collections.stream().map(HashSet::new).collect(Collectors.toList());

        for (int i = 0; i < hashSets.size(); i++) {
            for (String card : hashSets.get(i)) {
                boolean is_common = true;
                for (int j = 0; j < hashSets.size(); j++) {
                    if (i != j && !hashSets.get(j).contains(card)) {
                        is_common = false;
                        break;
                    }
                }
                if (is_common) {
                    common_collection.add(card);
                }
            }
        }
        return common_collection;

    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all_collection = new java.util.HashSet<>();
        for (Set<String> collection : collections) {
            all_collection.addAll(collection);
        }
        return all_collection;

    }
}
