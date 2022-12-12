package Honja5;

/*
for 문으로 배열 복사
- 배열 간 항복 값들을 복사하려면 for문 사용하거나 System.arraycopy() 메소드 사용
 */
public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1, 2, 3 };
        int[] newIntArray = new int[5];

        for(int i=0; i<oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }

        for(int i=0; i<newIntArray.length; i++) {
            System.out.println(newIntArray[i] + ", ");
        }
    }
}
