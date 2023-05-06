#include<stdio.h>
int addition(int no1,int no2)
{
    int ans = 0;
    ans = no1+no2;
    return ans;
}
int main()
{
    int value1 = 12 , value2 = 29;
    int ret = 0;
    int(*ptr) (int , int);
    ptr = addition;
    ret = ptr(value1 , value2);
    printf("%d\n",ret);
    return 0;
}