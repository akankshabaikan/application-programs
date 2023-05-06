#include<stdio.h>
int main()
{
    int no = 11;
    int *iptr = &no;

    char ch = 'b';
    char *cptr = &ch;

    double d = 56.1414;
    double *dptr = &d;

    printf("%d\n",no);
    printf("%c\n",ch);
    printf("%d\n",d);
    
    printf("%dn",&no);
    printf("%c\n",&ch);
    printf("%d\n",&d);

    printf("%d\n",&iptr);
    printf("%c\n",&cptr);
    printf("%d\n",&dptr);

    printf("%d\n",*iptr);
    printf("%c\n",*cptr);
    printf("%d\n",*dptr);

    return 0;

}