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

package com.aliyuncs.cloudapi;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "apigateway.cn-shenzhen.aliyuncs.com");
            put("cn-beijing", "apigateway.cn-beijing.aliyuncs.com");
            put("ap-south-1", "apigateway.ap-south-1.aliyuncs.com");
            put("eu-west-1", "apigateway.eu-west-1.aliyuncs.com");
            put("ap-northeast-1", "apigateway.ap-northeast-1.aliyuncs.com");
            put("cn-shenzhen-finance-1", "apigateway.aliyuncs.com");
            put("me-east-1", "apigateway.me-east-1.aliyuncs.com");
            put("cn-chengdu", "apigateway.cn-chengdu.aliyuncs.com");
            put("cn-north-2-gov-1", "apigateway.cn-north-2-gov-1.aliyuncs.com");
            put("cn-qingdao", "apigateway.cn-qingdao.aliyuncs.com");
            put("cn-shanghai", "apigateway.cn-shanghai.aliyuncs.com");
            put("cn-shanghai-finance-1", "apigateway.aliyuncs.com");
            put("cn-hongkong", "apigateway.cn-hongkong.aliyuncs.com");
            put("cn-hangzhou-finance", "apigateway.aliyuncs.com");
            put("ap-southeast-1", "apigateway.ap-southeast-1.aliyuncs.com");
            put("ap-southeast-2", "apigateway.ap-southeast-2.aliyuncs.com");
            put("ap-southeast-3", "apigateway.ap-southeast-3.aliyuncs.com");
            put("eu-central-1", "apigateway.eu-central-1.aliyuncs.com");
            put("cn-huhehaote", "apigateway.cn-huhehaote.aliyuncs.com");
            put("ap-southeast-5", "apigateway.ap-southeast-5.aliyuncs.com");
            put("us-east-1", "apigateway.us-east-1.aliyuncs.com");
            put("cn-zhangjiakou", "apigateway.cn-zhangjiakou.aliyuncs.com");
            put("us-west-1", "apigateway.us-west-1.aliyuncs.com");
            put("cn-hangzhou", "apigateway.cn-hangzhou.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
