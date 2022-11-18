public class Valores implements ValoresITF {
    public int[] vetor = new int[10];



    @Override
    public boolean InsertValue(int value) {
        if (value > 0) {
            for (int i = 0; i <= this.vetor.length; i++) {
                if (vetor[i] == 0) {
                    this.vetor[i] = value;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int DeleteValue(int position) {
        for (int i = 0; i <= this.vetor.length; i++) {
            if (vetor[i] > 0) {
                break;
            } else {
                return -1;
            }
        }
        int valueDeleted = this.vetor[position];
        this.vetor[position] = 0;
        return valueDeleted;
    }

    @Override
    public int SizeVector() {
        int count = 0;
        for (int i: vetor) {
            if (i != 0) {
                count++;
            }
        }

        return count;
    }
}
