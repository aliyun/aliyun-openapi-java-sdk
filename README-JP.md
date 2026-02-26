[English](./README.md) | [简体中文](./README-CN.md) | 日本語

<p align="center">
<a href=" https://www.alibabacloud.com"><img src="https://aliyunsdk-pages.alicdn.com/icons/Aliyun.svg"></a>
</p>

<h1 align="center">Alibaba Cloud SDK for Java (V1.0)</h1>

<p align="center">
<a href="https://search.maven.org/search?q=g:%22com.aliyun%22%20AND%20a:%22aliyun-java-sdk-core%22"><img src="https://img.shields.io/maven-central/v/com.aliyun/aliyun-java-sdk-core.svg?label=Maven%20Central" alt="Latest Stable Version"/></a>
<a href="https://travis-ci.org/aliyun/aliyun-openapi-java-sdk"><img src="https://travis-ci.org/aliyun/aliyun-openapi-java-sdk.svg?branch=master"/></a>
<a href="https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk"><img src="https://codecov.io/gh/aliyun/aliyun-openapi-java-sdk/branch/master/graph/badge.svg"/></a>
<a href="https://ci.appveyor.com/project/aliyun/aliyun-openapi-java-sdk"><img src="https://ci.appveyor.com/api/projects/status/levg38kb55k0pn1v/branch/master?svg=true"/></a>
</p>

> ⚠️ **重要なお知らせ**：Alibaba Cloud V1.0 Java SDK はベーシックセキュリティメンテナンス段階に移行しており、今後のご利用は推奨されません。新規ユーザーは[V2.0 Java SDK](https://github.com/aliyun/alibabacloud-java-sdk)を直接ご利用ください。既にV1.0 Java SDKをご利用いただいているユーザーも、[V2.0 Java SDK](https://github.com/aliyun/alibabacloud-java-sdk)への移行をお勧めします。V2.0 Java SDKの使用方法については、[ヘルプセンターのドキュメント](https://help.aliyun.com/zh/sdk/developer-reference/v2-java-sdk)および[Alibaba Cloud OpenAPI Developer Portal](https://next.api.aliyun.com/)を参照してください。

Alibaba Cloud SDK for Java (V1.0)を使用すると、Elastic Compute Service (ECS)、Server Load Balancer (SLB)、CloudMonitorなどのAlibaba Cloudサービスにアクセスできます。API関連のタスク（署名やリクエストの構築など）を処理する必要なく、Alibaba Cloudサービスにアクセスできます。

このドキュメントでは、Alibaba Cloud SDK for Java (V1.0)の取得方法と呼び出し方法を紹介します。

Alibaba Cloud SDK for Java (V1.0)の使用中に問題が発生した場合は、GitHubで[Issueを提出](https://github.com/aliyun/aliyun-openapi-java-sdk/issues/new)してください。

## ⚠️ 移行に関する注意事項

**Alibaba Cloud V1.0 Java SDK はベーシックセキュリティメンテナンス段階に移行しており、今後のご利用は推奨されません。**

### なぜV2.0に移行する必要があるのか？
- **より良いパフォーマンス**：改善されたアーキテクチャと最適化されたパフォーマンス
- **強化されたセキュリティ**：現代的なセキュリティプラクティスと認証情報管理
- **継続的なメンテナンス**：継続的な更新とバグ修正
- **より豊富な機能**：新機能と改善されたAPI設計

### 移行リソース
- **V2.0 SDKリポジトリ**：[https://github.com/aliyun/alibabacloud-java-sdk](https://github.com/aliyun/alibabacloud-java-sdk)
- **V2.0ドキュメント**：[https://help.aliyun.com/zh/sdk/developer-reference/v2-java-sdk](https://help.aliyun.com/zh/sdk/developer-reference/v2-java-sdk)
- **V1/V2 SDKの違い**：[https://help.aliyun.com/zh/sdk/product-overview/differences-between-v1-and-v2-sdks](https://help.aliyun.com/zh/sdk/product-overview/differences-between-v1-and-v2-sdks)

## 必要条件

- Alibaba Cloud SDK for Javaを使用するには、Alibaba Cloudアカウントと`AccessKey ID`および`AccessKey Secret`が必要です。[RAMコンソール](https://ram.console.aliyun.com "RAM console")でAccessKeyを作成・表示するか、システム管理者に連絡してください。

- Alibaba Cloud SDK for Javaを使用して製品のAPIにアクセスするには、必要に応じて[Alibaba Cloudコンソール](https://home.console.aliyun.com/?spm=5176.doc52740.2.4.QKZk8w)で製品を有効化する必要があります。

- Alibaba Cloud Java SDKにはJDK 1.6以降が必要です。

## インストール

Apache Mavenを使用してJavaプロジェクトを管理する場合、プロジェクトのpom.xmlファイルに対応する依存関係を追加するだけで済みます。各クラウド製品のMaven依存関係は[Alibaba Cloud開発者リソース](https://help.aliyun.com/learn/developer.html)でダウンロードできます。

使用する製品開発キットに関係なく、`aliyun-java-sdk-core`ライブラリをインストールする必要があります。たとえば、ECS SDKを呼び出すには、`aliyun-java-sdk-core`ライブラリと`aliyun-java-sdk-ecs`ライブラリをインストールする必要があります。

Ecs SDKの使用例として、`pom.xml`ファイルで以下の2つの依存関係を宣言するだけで済みます。

```xml
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-core</artifactId>
    <version>[4.4.9,5.0.0)</version>
</dependency>
<dependency>
    <groupId>com.aliyun</groupId>
    <artifactId>aliyun-java-sdk-ecs</artifactId>
    <version>[4.16.0,5.0.0)</version>
</dependency>
```

mavenが中央リポジトリからjarパッケージをダウンロードしない場合は、これらの依存関係をpom.xmlファイルに追加する必要があり、そうしないとNoClassDefFoundError例外が報告されます。
```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.5</version>
</dependency>
<dependency>
    <groupId>io.opentracing</groupId>
    <artifactId>opentracing-api</artifactId>
    <version>0.33.0</version>
</dependency>
<dependency>
    <groupId>io.opentracing</groupId>
    <artifactId>opentracing-util</artifactId>
    <version>0.33.0</version>
</dependency>
```

## トラブルシューティング
[Troubleshoot](https://troubleshoot.api.aliyun.com/?source=github_sdk)は、OpenAPI診断サービスを提供し、`RequestID`または`エラーメッセージ`を通じて、開発者が迅速に問題を特定し、解決策を提供します。

## クイックスタート

以下のコード例は、Alibaba Cloud SDK for Java (V1.0)を使用する3つの主要ステップを示しています：

1. `DefaultAcsClient`インスタンスを作成して初期化する。

2. APIリクエストを作成し、パラメータを設定する。

3. リクエストを開始し、応答または例外を処理する。

```java
package com.testprogram;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.ecs.model.v20140526.*;
public class Main {
    public static void main(String[] args) {
        // DefaultAcsClientインスタンスを作成して初期化
        DefaultProfile profile = DefaultProfile.getProfile(
            "<your-region-id>",          // リージョンID
            "<your-access-key-id>",      // RAMアカウントのAccessKey ID
            "<your-access-key-secret>"); // RAMアカウントのAccessKey Secret
        IAcsClient client = new DefaultAcsClient(profile);
        // APIリクエストを作成し、パラメータを設定
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        request.setPageSize(10);
        // リクエストを開始し、応答または例外を処理
        DescribeInstancesResponse response;
        try {
            response = client.getAcsResponse(request);
            for (DescribeInstancesResponse.Instance instance:response.getInstances()) {
                System.out.println(instance.getPublicIpAddress());
            }
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
```

## ドキュメント
* [Requirements](./docs/0-Requirements-EN.md)
* [Installation](./docs/1-Installation-EN.md)
* [Client & Credentials](./docs/2-Client-EN.md)
* [Connection Pool](./docs/3-Pool-EN.md)
* [Timeout](./docs/4-Timeout-EN.md)
* [HTTPS Configurations](./docs/5-HTTPS-EN.md)
* [Proxy Configurations](./docs/6-Proxy-EN.md)
* [Debug](./docs/7-Debug-EN.md)
* [Log](./docs/8-Log-EN.md)
* [Exception](./docs/9-Exception-EN.md)
* [Endpoint](./docs/10-Endpoint-EN.md)

## 問題
[Issueを開く](https://github.com/aliyun/aliyun-openapi-java-sdk/issues/new)、ガイドラインに準拠していない問題は直ちに閉じられる場合があります。

## 変更履歴
各リリースの詳細な変更は[リリースノート](./aliyun-java-sdk-core/ChangeLog.txt)に記録されています。

## 貢献
プルリクエストを作成する前に、[貢献ガイド](CONTRIBUTING.md)を必ずお読みください。

## 参考文献
* [Alibaba Cloud Regions & Endpoints](https://developer.aliyun.com/endpoints)
* [Alibaba Cloud OpenAPI Developer Portal](https://next.api.aliyun.com/)
* [最新リリース](https://github.com/aliyun/aliyun-openapi-java-sdk)
* [V2.0 Java SDKリポジトリ](https://github.com/aliyun/alibabacloud-java-sdk)
* [V2.0 Java SDKドキュメント](https://help.aliyun.com/zh/sdk/developer-reference/v2-java-sdk)

## ライセンス
[Apache-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Copyright (c) 2009-present, Alibaba Cloud All rights reserved.
