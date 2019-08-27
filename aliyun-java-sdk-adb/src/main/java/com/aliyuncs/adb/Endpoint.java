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

package com.aliyuncs.adb;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "adb.aliyuncs.com");
            put("cn-beijing", "adb.aliyuncs.com");
            put("ap-south-1", "adb.ap-northeast-1.aliyuncs.com");
            put("me-east-1", "adb.ap-northeast-1.aliyuncs.com");
            put("cn-qingdao", "adb.aliyuncs.com");
            put("cn-shanghai", "adb.aliyuncs.com");
            put("cn-hongkong", "adb.aliyuncs.com");
            put("ap-southeast-1", "adb.aliyuncs.com");
            put("ap-southeast-2", "adb.ap-northeast-1.aliyuncs.com");
            put("eu-central-1", "adb.ap-northeast-1.aliyuncs.com");
            put("cn-huhehaote", "adb.aliyuncs.com");
            put("ap-southeast-5", "adb.ap-northeast-1.aliyuncs.com");
            put("us-east-1", "adb.aliyuncs.com");
            put("us-west-1", "adb.aliyuncs.com");
            put("cn-hangzhou", "adb.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
