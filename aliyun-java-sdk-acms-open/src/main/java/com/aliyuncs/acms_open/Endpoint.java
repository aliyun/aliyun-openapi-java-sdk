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

package com.aliyuncs.acms_open;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "acm.cn-shenzhen.aliyuncs.com");
            put("cn-beijing", "acm.cn-beijing.aliyuncs.com");
            put("cn-shenzhen-finance-1", "acm.cn-shenzhen-finance-1.aliyuncs.com");
            put("cn-north-2-gov-1", "acm.cn-north-2-gov-1.aliyuncs.com");
            put("cn-qingdao", "acm.cn-qingdao.aliyuncs.com");
            put("cn-shanghai", "acm.cn-shanghai.aliyuncs.com");
            put("cn-shanghai-finance-1", "acm.cn-shanghai-finance-1.aliyuncs.com");
            put("cn-hongkong", "acm.cn-hongkong.aliyuncs.com");
            put("cn-hangzhou-finance", "acm.cn-hangzhou-finance.aliyuncs.com");
            put("ap-southeast-1", "acm.ap-southeast-1.aliyuncs.com");
            put("ap-southeast-2", "acm.ap-southeast-2.aliyuncs.com");
            put("eu-central-1", "acm.eu-central-1.aliyuncs.com");
            put("us-east-1", "acm.us-east-1.aliyuncs.com");
            put("cn-zhangjiakou", "acm.cn-zhangjiakou.aliyuncs.com");
            put("us-west-1", "acm.us-west-1.aliyuncs.com");
            put("cn-hangzhou", "acm.cn-hangzhou.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
