if(i>=A.size()){return;}
        
if(sum==b){
a.add(list);
sum-=list.get(list.size()-1);
list.remove(list.size()-1);
i++;
}
else if(sum>b){
sum-=list.get(list.size()-1);
list.remove(list.size()-1);

i++;

//return;
}
list.add(A.get(i));
sum+=A.get(i);




System.out.println(sum);


if(i>=A.size()){return;}


answer(a,list,A,b,sum,i);
return;
}





int x=i;int t=0;
while(t!=1000){
    System.out.print(sum);
    list.add(A.get(i));
    sum=sum+A.get(i);
    if(list.get(0)!=A.get(x)){break;}
    if(sum==b){
        a.add(list);
       sum-=list.get(list.size()-1);
        list.remove(list.size()-1);

        i++;
    }
    if(sum>b){
        sum-=list.get(list.size()-1);
        list.remove(list.size()-1);

        i++;
    }
    if(i==A.size()-1){
        sum-=list.get(list.size()-1);
        list.remove(list.size()-1);
        i=x+1;
    }
    t++;
 
}