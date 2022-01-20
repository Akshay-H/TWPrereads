class RnaTranscription {

    String transcribe(String dnaStrand) {
        String s="";
        for(int i=0;i<dnaStrand.length();i++)
        {
            if(dnaStrand.charAt(i)=='G')
                s=s+'C';
            else if(dnaStrand.charAt(i)=='C')
                s=s+'G';
            else if(dnaStrand.charAt(i)=='T')
                s=s+'A';
            else if(dnaStrand.charAt(i)=='A')
                s=s+'U';
        }
        return s;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
