package LRUCache;

public class Main {
    private static LRUCache cache=new LRUCache(2);
    public static void main(String[] args){

        //Khi cache rỗng
        System.out.println(cache.get(1));

        //Đưa vào cache một phần tử
        cache.set(1,1);
        System.out.println("\n"+cache.get(1));
        System.out.println(cache.get(2));

        //Đưa vào 2 phần tử
        cache.set(2,4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));

        //Đưa vào phần tử mới => phần tử cũ nhất sẽ bị loại, trả về -1
        cache.set(3,9);
        System.out.println("\n"+cache.get(1));
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));

        //Kiểm tra tính "mới" của phần tử
        cache.set(1,1);
        cache.set(2,4);
        System.out.println("\n" +cache.get(1));
        cache.set(3,9);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));
        //"key 1" được set trước
        // nhưng sau đó lại được "get", nên "key 1" sẽ "mới" hơn "key 2"
        //=> khi thêm vào phần tử mới, "key 2" sẽ bị remove
    }
}
