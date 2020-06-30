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

package com.aliyuncs.ddi;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("ap-south-1", "ddi.ap-south-1.aliyuncs.com");
            put("eu-west-1", "ddi.eu-west-1.aliyuncs.com");
            put("ap-northeast-1", "ddi.ap-northeast-1.aliyuncs.com");
            put("me-east-1", "ddi.me-east-1.aliyuncs.com");
            put("cn-chengdu", "ddi.cn-chengdu.aliyuncs.com");
            put("cn-qingdao", "ddi.cn-qingdao.aliyuncs.com");
            put("cn-hongkong", "ddi.cn-hongkong.aliyuncs.com");
            put("ap-southeast-2", "ddi.ap-southeast-2.aliyuncs.com");
            put("ap-southeast-3", "ddi.ap-southeast-3.aliyuncs.com");
            put("eu-central-1", "ddi.eu-central-1.aliyuncs.com");
            put("cn-huhehaote", "ddi.cn-huhehaote.aliyuncs.com");
            put("ap-southeast-5", "ddi.ap-southeast-5.aliyuncs.com");
            put("us-east-1", "ddi.us-east-1.aliyuncs.com");
            put("cn-zhangjiakou", "ddi.cn-zhangjiakou.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "central";
}
