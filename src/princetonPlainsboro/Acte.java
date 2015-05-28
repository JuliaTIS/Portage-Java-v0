package princetonPlainsboro;

class Acte {
    private Code code;
    private int coef;
    
    public Acte(Code code, int coef) {
        this.code = code;
        this.coef = coef;
        }
    
    public String toString() {
        return getCode().toString() + ", coefficient : " + getCoef();
        }
    
    public double cout() {
        return getCode().calculerCout(getCoef());
        }

    /**
     * @return the code
     */
    public Code getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(Code code) {
        this.code = code;
    }

    /**
     * @return the coef
     */
    public int getCoef() {
        return coef;
    }

    /**
     * @param coef the coef to set
     */
    public void setCoef(int coef) {
        this.coef = coef;
    }
    }
