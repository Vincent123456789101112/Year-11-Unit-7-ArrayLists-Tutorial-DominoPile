public class Domino {
    public int top;
    public int bottom;

    Domino(){

        this.top = 0;
        this.bottom = 0;

    }
    Domino(int top, int bottom){

        this.top = top;
        this.bottom = bottom;

    }

    public int getTop(){

        return top;

    }

    public int getBottom(){

        return bottom;

    }

    public String toString(){

        return top + "/" + bottom;

    }

    public void setTop(int top){

        this.top = top;

    }

    public void setBottom(int bottom){

        this.bottom = bottom;

    }

    public void flip(){

        int a = top;
        int b = bottom;
        bottom = a;
        top = b;

    }

    public void settle(){

        if(top > bottom){

            flip();

        }

    }

    //compareTo(Domino other)
    public int compareTo(Domino other) {

        if(Math.min(top, bottom) < Math.min(other.top, other.bottom)) {

            return -1;

        } else if (Math.min(top, bottom) > Math.min(other.top, other.bottom)) {

            return 1;

        } else {

            if(Math.max(top, bottom) < Math.max(other.top, other.bottom)) {

                return -1;

            } else if (Math.max(top, bottom) > Math.max(other.top, other.bottom)) {

                return 1;

            } else {

                return 0;

            }

        }

    }

    public int compareToWeight(Domino other){

        int a = top + bottom;
        int b = other.top + other.bottom;

        if(a > b){

            return 1;

        }

        else if(a < b){

            return -1;

        }

        return 0;

    }

    public boolean canConnect(Domino other){

        if (top == other.top){

            return true;

        } else if (top == other.bottom){

            return true;

        } else if (bottom == other.top){

            return true;

        } else if (bottom == other.bottom){

            return true;

        }

        return false;
    }




}
