class Solution {
    public int compress(char[] chars) {
        char temp=chars[0];
        int st=0,cnt=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]==temp){
                cnt++;
            }
            else{
                if(cnt==1){
                    chars[st]=chars[i-1];
                    st++;
                }
                else{
                     chars[st]=chars[i-1];
                     st++;
                     String count=cnt+"";
                     for(int j=0;j<count.length();j++){
                        chars[st++]=count.charAt(j);
                     }
                            
                }
                cnt=1;
                temp=chars[i];
            }
        }
        System.out.println(cnt);
        chars[st++]=chars[chars.length-1];
        if(cnt>1){
             String count=cnt+"";
             for(int i=0;i<count.length();i++){
                    chars[st++]=count.charAt(i);
             }

        }

        return st;
    }
}
