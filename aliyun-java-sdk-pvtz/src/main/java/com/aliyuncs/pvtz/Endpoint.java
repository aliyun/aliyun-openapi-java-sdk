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

package com.aliyuncs.pvtz;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "pvtz.cn-shenzhen.aliyuncs.com");
            put("cn-beijing", "pvtz.cn-beijing.aliyuncs.com");
            put("cn-shanghai", "pvtz.cn-shanghai.aliyuncs.com");
            put("cn-hongkong", "pvtz.cn-hongkong.aliyuncs.com");
            put("ap-southeast-1", "pvtz.ap-southeast-1.aliyuncs.com");
            put("ap-southeast-3", "pvtz.ap-southeast-3.aliyuncs.com");
            put("eu-central-1", "pvtz.eu-central-1.aliyuncs.com");
            put("cn-huhehaote", "pvtz.cn-huhehaote.aliyuncs.com");
            put("ap-southeast-5", "pvtz.ap-southeast-5.aliyuncs.com");
            put("cn-zhangjiakou", "pvtz.cn-zhangjiakou.aliyuncs.com");
            put("cn-chengdu", "pvtz.cn-chengdu.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "central";
}
