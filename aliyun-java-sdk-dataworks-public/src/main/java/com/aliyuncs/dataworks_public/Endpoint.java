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

package com.aliyuncs.dataworks_public;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "dataworks.cn-shenzhen.aliyuncs.com");
            put("cn-beijing", "dataworks.cn-beijing.aliyuncs.com");
            put("ap-south-1", "dataworks.ap-south-1.aliyuncs.com");
            put("eu-west-1", "dataworks.eu-west-1.aliyuncs.com");
            put("ap-northeast-1", "dataworks.ap-northeast-1.aliyuncs.com");
            put("cn-shenzhen-finance-1", "dataworks.aliyuncs.com");
            put("me-east-1", "dataworks.me-east-1.aliyuncs.com");
            put("cn-chengdu", "dataworks.cn-chengdu.aliyuncs.com");
            put("cn-north-2-gov-1", "dataworks.aliyuncs.com");
            put("cn-qingdao", "dataworks.aliyuncs.com");
            put("cn-shanghai", "dataworks.cn-shanghai.aliyuncs.com");
            put("cn-shanghai-finance-1", "dataworks.aliyuncs.com");
            put("cn-hongkong", "dataworks.cn-hongkong.aliyuncs.com");
            put("cn-hangzhou-finance", "dataworks.aliyuncs.com");
            put("ap-southeast-1", "dataworks.ap-southeast-1.aliyuncs.com");
            put("ap-southeast-2", "dataworks.ap-southeast-2.aliyuncs.com");
            put("ap-southeast-3", "dataworks.ap-southeast-3.aliyuncs.com");
            put("eu-central-1", "dataworks.eu-central-1.aliyuncs.com");
            put("cn-huhehaote", "dataworks.aliyuncs.com");
            put("ap-southeast-5", "dataworks.ap-southeast-5.aliyuncs.com");
            put("us-east-1", "dataworks.us-east-1.aliyuncs.com");
            put("cn-zhangjiakou", "dataworks.aliyuncs.com");
            put("us-west-1", "dataworks.us-west-1.aliyuncs.com");
            put("cn-hangzhou", "dataworks.cn-hangzhou.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
