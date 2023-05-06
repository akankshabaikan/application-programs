#include<stdio.h>
struct demo
{int i;
int j;
int *ip;
float *fp;
};
int main()
{
 struct demo obj;
int no = 90;
float f = 90.62;
obj.i = 11;
obj.j = 21;
obj.ip = &no;
obj.fp = &f;

return 0;
}