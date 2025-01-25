# service-loader-test

ServiceLoaderの速度検証に利用したコードです。

# 結果

ServiceLoader、Reflectionのそれぞれで10万回呼び出しをおこなった際にかかった時間。

|呼び出し方|時間|
|---|---|
|ServiceLoader|約30ms|
|Reflection|約130ms|

ServiceLoaderは下記の処理に時間がかかっていました。

```java
ServiceLoader<IService> loader = ServiceLoader.load(IService.class);
```

loadを使いまわさずに毎回実行すると、`13506ms`かかりました。

# その他

Eclipse等でdebug実行する場合は、META-INFを作るために下記の実行が必要です。

```bash
./gradlew makeServiceFile
```
