class Hello {
    static class Thing {
        public int size;

        Thing() {
            size = 0;
        }
    }

    public static void main(String[] args) {
        Thing thing1 = new Thing();
        System.out.println("Hello, World!");
    }
}