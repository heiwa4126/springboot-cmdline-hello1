# springboot-cmdline-hello1

Spring Bootでコマンドラインアプリのサンプル。加えてプロファイル切替の実験

# 使い方

```sh
./gradlw bootJar
```
で `build/libs/hello1-0.0.1-SNAPSHOT.jar` にFat JARができるので、
以下のように試す。

内蔵のプロファイルはdev(default)とprod

```sh
java -jar build/libs/hello1-0.0.1-SNAPSHOT.jar test1 test2
java -Dspring.profiles.active=prod -jar build/libs/hello1-0.0.1-SNAPSHOT.jar test3 test4
SPRING_PROFILES_ACTIVE=prod java -jar build/libs/hello1-0.0.1-SNAPSHOT.jar test5 test6
java -jar build/libs/hello1-0.0.1-SNAPSHOT.jar test7 test8 --spring.profiles.active=prod　
```

存在しないプロファイルを指定するとどうなるか? とかも試してみて。
