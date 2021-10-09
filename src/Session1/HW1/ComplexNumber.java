package Session1.HW1;


class ComplexNumber {
    private int r, i;
    ComplexNumber(int r, int i) {
         this.r = r;
         this.i = i;
    }

    ComplexNumber add(ComplexNumber n){
        int a, b;
        a = this.r + n.r;
        b = this.i + n.i;
        return new ComplexNumber(a, b);
    }
    ComplexNumber minus(ComplexNumber n){
        int a, b;
        a = this.r - n.r;
        b = this.i - n.i;
        return new ComplexNumber(a, b);
    }
    ComplexNumber multiply(ComplexNumber n){
        int a, b;
        a = this.r * n.r - this.i * n.i;
        b = this.r * n.i + this.i * n.r;
        return new ComplexNumber(a, b);
    }
    ComplexNumber divide(ComplexNumber n){
        int a, b;
        a = this.r / n.r + this.i / n.i;
        b = this.r / n.i - this.i / n.r;
        return new ComplexNumber(a, b);
    }

    @Override
    public String toString() {
        String res;
        if (this.i >= 0) {
            res = String.valueOf(this.r) + "+" + String.valueOf(this.i) + "i";
        }
        else {
            res = String.valueOf(this.r) + String.valueOf(this.i) + "i";
        }
        return res.replace("1i", "i");
    }
}
