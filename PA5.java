int[] arr1 = {1, 3, 5, 7, 9};
int[] arr2 = {2, 4, 6, 8, 10};
int[] arr3 = {1, 2, 3, 4, 5};

int[] silence(int sound){
  int size = sound;
  int[] soundSilence = new int[size];
  for(int i = 0; i < size; i += 1){
    soundSilence[i] = 0;
  }
  return soundSilence;
}
int[] test1 = silence(5);
int[] exp1 =  { 0, 0, 0, 0, 0};
int[] test2 = silence(6);
int[] exp2 =  { 0, 0, 0, 0, 0, 0};
int[] test3 = silence(7);
int[] exp3 =  { 0, 0, 0, 0, 0, 0, 0};

int[] crop(int[] sound, int start, int end){
  int size = end - start;
  int[] newArray = new int[size];
  for(int i = 0; i < size; i += 1){
    newArray[i] = sound[start + i];
  }
  return newArray;
}
int[] test4 = crop(arr1, 0, 2);
int[] exp4 = {1, 3};
int[] test5 = crop(arr2, 0, 2);
int[] exp5 = {2, 4};
int[] test6 = crop(arr3, 0, 2);
int[] exp6 = {1, 2};

int[] sineSound(int length, int frequency, int amplitude){
  int size = length;
  int[] newArray = new int[size];
  for(int i = 0; i < size; i += 1){
    newArray[i] = doubleToInt(sin(2*PI*frequency*i/22050)*amplitude);
  }
  return newArray;
}
int[] test7 = sineSound(5,50,5000);
int[] exp7 =  { 0, 71, 142, 213, 284 };
int[] test8 = sineSound(6,60,6000);
int[] exp8 = { 0, 102, 205, 307, 410, 512 };
int[] test9 = sineSound(7,70,7000);
int[] exp9 = { 0, 139, 279, 418, 557, 696, 835 };

int[] cosineSound(int length, int frequency, int amplitude){
  int size = length;
  int[] newArray = new int[size];
  for(int i = 0; i < size; i += 1){
    newArray[i] = doubleToInt((cos((2*PI*i/22050)*frequency))*amplitude);
  }
  return newArray;
}
int[] test10 = cosineSound(5,50,5000);
int[] exp10 = { 5000, 4999, 4997, 4995, 4991 };
int[] test11 = cosineSound(6,60,6000);
int[] exp11 = { 6000, 5999, 5996, 5992, 5985, 5978 };
int[] test12 = cosineSound(7,70,7000);
int[] exp12 = { 7000, 6998, 6994, 6987, 6977, 6965, 6949 };

int[] addSounds(int[] sound1, int[] sound2){
  int size = sound1.length;
  int[] newArray = new int[size];
  for(int i = 0; i < size; i += 1){
    newArray[i] = sound1[i] + sound2[i];
  }
  return newArray;
}
int[] test13 = addSounds(arr1, arr2);
int[] exp13 = { 3, 7, 11, 15, 19 };
int[] test14 = addSounds(arr1, arr3);
int[] exp14 = { 2, 5, 8, 11, 14 };
int[] test15 = addSounds(arr2, arr3);
int[] exp15 = { 3, 6, 9, 12, 15 };

int[] multiplySounds(int[] sound1, int[] sound2){
  int size = sound1.length;
  int[] newArray = new int[size];
  for(int i = 0; i < size; i += 1){
    newArray[i] = sound1[i] * sound2[i];
  }
  return newArray;
}
int[] test16 = multiplySounds(arr1, arr2);
int[] exp16 = { 2, 12, 30, 56, 90 };
int[] test17 = multiplySounds(arr1, arr3);
int[] exp17 = { 1, 6, 15, 28, 45 };
int[] test18 = multiplySounds(arr2, arr3);
int[] exp18 = { 2, 8, 18, 32, 50 };

int[] changeVolume(int[] sound, double num){
  int size = sound.length;
  int[] soundSilence = new int[size];
  for(int i = 0; i < size; i += 1){
    soundSilence[i] = doubleToInt(sound[i] * num);
  }
  return soundSilence;
}
int[] test18 = changeVolume(arr1, 2);
int[] exp18 = { 2, 6, 10, 14, 18 };
int[] test19 = changeVolume(arr2, 2);
int[] exp19 = { 4, 8, 12, 16, 20 };
int[] test20 = changeVolume(arr3, 2);
int[] exp20 = { 2, 4, 6, 8, 10 };
