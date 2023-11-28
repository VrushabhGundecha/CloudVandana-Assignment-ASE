package CloudVandanaAssignment;

public class ShuffleArray {
	
	private static int[] shuffleArray(int[] array) {
		
		for(int i = array.length - 1; i > 0; i--) {
			int randomIndex = (int) (Math.random() * (i + 1));
			int temp = array[i];
			array[i] = array[randomIndex];
			array[randomIndex] = temp;
		}
		return array;
	}
	
	public static void main(String[] args) {
		
		int array[] = {1, 2, 3, 4, 5, 6, 7};
		shuffleArray(array);
		
		System.out.println("Shuffled array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
	}
}
