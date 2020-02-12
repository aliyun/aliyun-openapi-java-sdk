/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dbs;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "dbs-api.cn-hangzhou.aliyuncs.com");
            put("cn-beijing", "dbs-api.cn-hangzhou.aliyuncs.com");
            put("ap-south-1", "dbs-api.ap-south-1.aliyuncs.com");
            put("eu-west-1", "dbs-api.eu-west-1.aliyuncs.com");
            put("ap-northeast-1", "dbs-api.ap-northeast-1.aliyuncs.com");
            put("cn-shenzhen-finance-1", "dbs-api.cn-hangzhou.aliyuncs.com");
            put("me-east-1", "dbs-api.me-east-1.aliyuncs.com");
            put("cn-qingdao", "dbs-api.cn-hangzhou.aliyuncs.com");
            put("cn-shanghai", "dbs-api.cn-hangzhou.aliyuncs.com");
            put("cn-shanghai-finance-1", "dbs-api.cn-hangzhou.aliyuncs.com");
            put("cn-hongkong", "dbs-api.cn-hangzhou.aliyuncs.com");
            put("cn-hangzhou-finance", "dbs-api.cn-hangzhou.aliyuncs.com");
            put("ap-southeast-1", "dbs-api.ap-southeast-1.aliyuncs.com");
            put("cn-huhehaote", "dbs-api.cn-huhehaote.aliyuncs.com");
            put("us-east-1", "dbs.cn-hangzhou.aliyuncs.com");
            put("cn-zhangjiakou", "dbs-api.cn-hangzhou.aliyuncs.com");
            put("us-west-1", "dbs.cn-hangzhou.aliyuncs.com");
            put("cn-hangzhou", "dbs-api.cn-hangzhou.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
