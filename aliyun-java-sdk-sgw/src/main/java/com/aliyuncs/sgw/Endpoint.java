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

package com.aliyuncs.sgw;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "sgw.cn-shanghai.aliyuncs.com");
            put("cn-qingdao", "sgw.cn-shanghai.aliyuncs.com");
            put("cn-beijing", "sgw.cn-shanghai.aliyuncs.com");
            put("cn-hongkong", "sgw.cn-shanghai.aliyuncs.com");
            put("cn-huhehaote", "sgw.cn-shanghai.aliyuncs.com");
            put("us-east-1", "sgw.us-west-1.aliyuncs.com");
            put("cn-zhangjiakou", "sgw.cn-shanghai.aliyuncs.com");
            put("cn-chengdu", "sgw.cn-shanghai.aliyuncs.com");
            put("cn-hangzhou", "sgw.cn-shanghai.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
