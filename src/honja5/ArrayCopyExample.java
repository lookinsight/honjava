package Honja5;

/*
System.arraycopy() 로 배열 복사

- System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
- src 매개값은 원본 배열, srcPos 는 원본 배열에서 복사할 항목의 시작 인덱스, dest 매개값은 새 배열,
  destPos 는 새 배열에서 붙여넣은 시작 인덱스, length 는 복사할 개수
- 원본 배열 arr1 이고 새 배열이 arr2 일 경우 arr1의 모든 항목을 arr2에 복사하려면?
   > System.arraycopy(arr1, 0, arr2, 0, arr1.length);
 */
public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = { "java", "array", "copy" };
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for(int i=0; i<newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
