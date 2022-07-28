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

package com.aliyuncs.eas;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "pai-eas.cn-shenzhen.aliyuncs.com");
            put("cn-beijing", "pai-eas.cn-beijing.aliyuncs.com");
            put("ap-south-1", "pai-eas.ap-south-1.aliyuncs.com");
            put("cn-north-2-gov-1", "pai-eas.cn-north-2-gov-1.aliyuncs.com");
            put("cn-chengdu", "pai-eas.cn-chengdu.aliyuncs.com");
            put("cn-shanghai", "pai-eas.cn-shanghai.aliyuncs.com");
            put("cn-shanghai-finance-1", "pai-eas.cn-shanghai-finance-1.aliyuncs.com");
            put("cn-hongkong", "pai-eas.cn-hongkong.aliyuncs.com");
            put("ap-southeast-1", "pai-eas.ap-southeast-1.aliyuncs.com");
            put("eu-central-1", "pai-eas.eu-central-1.aliyuncs.com");
            put("ap-southeast-5", "pai-eas.ap-southeast-5.aliyuncs.com");
            put("us-east-1", "pai-eas.us-east-1.aliyuncs.com");
            put("cn-zhangjiakou", "pai-eas.cn-zhangjiakou.aliyuncs.com");
            put("us-west-1", "pai-eas.us-west-1.aliyuncs.com");
            put("cn-hangzhou", "pai-eas.cn-hangzhou.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
