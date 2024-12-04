import java.util.*;

class RandomizedSet {
    ArrayList<Integer> a; 
     Random random;      
    public RandomizedSet() {
        a = new ArrayList<>();
        random = new Random();
    }
    public boolean insert(int val) {
        if (a.contains(val)) {
            return false; 
        }
        a.add(val); 
        return true;
    }

    
    public boolean remove(int val) {
        int index = a.indexOf(val);
        if (index == -1) {
            return false; 
        }
        int lastValue = a.get(a.size() - 1);
        a.set(index, lastValue);
        a.remove(a.size() - 1);
        return true;
    }

    
    public int getRandom() {
        int randomIndex = random.nextInt(a.size()); //
        return a.get(randomIndex); 
    }

}

 class Main {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();

        System.out.println(randomizedSet.insert(1)); 
        System.out.println(randomizedSet.remove(2)); 
        System.out.println(randomizedSet.insert(2)); 
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(1)); 
        System.out.println(randomizedSet.insert(2)); 
        System.out.println(randomizedSet.getRandom()); 
    
}
}