# springboot-cmdline-hello1

Spring Bootでコマンドラインアプリのサンプル。加えてプロファイル切替の実験

# 使い方

```sh
./gradlw bootJar
```
で `build/libs/hello1-0.0.1-SNAPSHOT.jar` にFat JARができるので、
以下のように試す。
(GitHubのreleasesにもjar置いときます)

内蔵のプロファイルはdev(default)とprod

```sh
java -jar build/libs/hello1-0.0.1-SNAPSHOT.jar test1 test2
java -Dspring.profiles.active=prod -jar build/libs/hello1-0.0.1-SNAPSHOT.jar test3 test4
SPRING_PROFILES_ACTIVE=prod java -jar build/libs/hello1-0.0.1-SNAPSHOT.jar test5 test6
java -jar build/libs/hello1-0.0.1-SNAPSHOT.jar test7 test8 --spring.profiles.active=prod
java -Dtest.msg=xxxx -jar hello1-0.0.1-SNAPSHOT.jar
```

- 存在しないプロファイルを指定するとどうなるか? 
- 環境変数とオプションで異なるプロファイルを指定するとどうなるか? 
  
とかも試してみて。


# 参考

- [7\.3\. Profiles](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#features.profiles)
- [12\.2\.6\. Set the Active Spring Profiles](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#features.profiles)
- [7\.3\. プロファイル](https://spring.pleiades.io/spring-boot/docs/2.5.4/reference/htmlsingle/#features.profiles) - 日本語
- [12\.2\.6\. アクティブ Spring プロファイルを設定する](https://spring.pleiades.io/spring-boot/docs/2.5.4/reference/htmlsingle/#features.profiles) - 日本語

