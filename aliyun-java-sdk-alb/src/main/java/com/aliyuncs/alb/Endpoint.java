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

package com.aliyuncs.alb;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "alb.cn-shenzhen.aliyuncs.com");
            put("cn-beijing", "alb.cn-beijing.aliyuncs.com");
            put("cn-wulanchabu", "alb.cn-wulanchabu.aliyuncs.com");
            put("ap-south-1", "alb.ap-south-1.aliyuncs.com");
            put("eu-west-1", "alb.eu-west-1.aliyuncs.com");
            put("ap-northeast-1", "alb.ap-northeast-1.aliyuncs.com");
            put("cn-chengdu", "alb.cn-chengdu.aliyuncs.com");
            put("cn-qingdao", "alb.cn-qingdao.aliyuncs.com");
            put("cn-shanghai", "alb.cn-shanghai.aliyuncs.com");
            put("cn-hongkong", "alb.cn-hongkong.aliyuncs.com");
            put("ap-southeast-1", "alb.ap-southeast-1.aliyuncs.com");
            put("ap-southeast-2", "alb.ap-southeast-2.aliyuncs.com");
            put("eu-central-1", "alb.eu-central-1.aliyuncs.com");
            put("ap-southeast-3", "alb.ap-southeast-3.aliyuncs.com");
            put("cn-huhehaote", "alb.cn-huhehaote.aliyuncs.com");
            put("ap-southeast-5", "alb.ap-southeast-5.aliyuncs.com");
            put("us-east-1", "alb.us-east-1.aliyuncs.com");
            put("cn-zhangjiakou", "alb.cn-zhangjiakou.aliyuncs.com");
            put("us-west-1", "alb.us-west-1.aliyuncs.com");
            put("cn-hangzhou", "alb.cn-hangzhou.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "central";
}
