#include <stdio.h>
#include <time.h>

// 피보나치 반복문
int Loop(int num);

int main(int argc, const char* argv[])
{
 int caculation; // 피보나치 수열의 n번째 받는 변수
 clock_t start, end; // 시작과 끝. 시간 측정 변수
 double result; // 실행 시간. 알고리즘 걸리는 측정 변수

 printf("항의 숫자를 입력해라\n");
 scanf("%d", &caculation);
 start = clock(); // 시작시간
 printf("반복문 피보나치 수열의 합= %d\n", Loop(caculation));
 end = clock(); // 끝시간
 result = (double)(end - start);
 printf("반복문 소요 시간= %fms\n", result);
   return 0;  
} 