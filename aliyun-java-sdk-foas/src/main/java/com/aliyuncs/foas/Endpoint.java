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

package com.aliyuncs.foas;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("ap-south-1", "foas.ap-northeast-1.aliyuncs.com");
            put("cn-hongkong", "foas.aliyuncs.com");
            put("eu-west-1", "foas.ap-northeast-1.aliyuncs.com");
            put("ap-southeast-2", "foas.ap-northeast-1.aliyuncs.com");
            put("eu-central-1", "foas.ap-northeast-1.aliyuncs.com");
            put("cn-huhehaote", "foas.aliyuncs.com");
            put("cn-shenzhen-finance-1", "foas.aliyuncs.com");
            put("ap-southeast-5", "foas.ap-northeast-1.aliyuncs.com");
            put("us-east-1", "foas.ap-northeast-1.aliyuncs.com");
            put("me-east-1", "foas.ap-northeast-1.aliyuncs.com");
            put("us-west-1", "foas.ap-northeast-1.aliyuncs.com");
            put("cn-chengdu", "foas.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
