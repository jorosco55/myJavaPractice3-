public class cube {

    int length;
    int breadth;
    int height;

    public int getCubeVolume(){
        return (length * breadth * height);
    }

    cube () {
        length = 10;
        breadth = 20;
        height = 30;
    }

    cube (int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

}
