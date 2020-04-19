void CImageProDoc::Convolve(unsigned char **inputImg, 
   unsigned char **resultImg, int cols, int rows, float mask[][3], int bias, int depth) 
{ 
   int i, j, x, y; 
   int red, green, blue; 
   int sum; 
   unsigned char **tmpImg; 
   // 기억장소 할당 
   tmpImg = (unsigned char **) malloc((imageHeight + 2)* sizeof(unsigned char *)); 

   for (i = 0; i < imageHeight + 2; i++) 
        tmpImg[i] = (unsigned char *) malloc((imageWidth + 2) * depth);  

// 0-삽입을 위해 0으로 초기화 
   for (y = 0; y < imageHeight + 2; y++) 
       for (x = 0; x < (imageWidth + 2) * depth; x++) 
           tmpImg[y][x] = 0; 

// 영상 복사 
   for (y = 1; y < imageHeight + 1; y++) 
       for (x = 1; x < imageWidth + 1; x++) 
          if (depth == 1) tmpImg[y][x] = inputImg[y-1][x-1]; 
          else if (depth == 3) { 
             tmpImg[y][3*x] = inputImg[y-1][3*(x-1)]; 
             tmpImg[y][3*x+1] = inputImg[y-1][3*(x-1)+1]; 
             tmpImg[y][3*x+2] = inputImg[y-1][3*(x-1)+2]; 
          }


