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

package com.aliyuncs.adcp;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "adcp.cn-shenzhen.aliyuncs.com");
            put("cn-beijing", "adcp.cn-beijing.aliyuncs.com");
            put("cn-wulanchabu", "adcp.cn-wulanchabu.aliyuncs.com");
            put("ap-south-1", "adcp.ap-south-1.aliyuncs.com");
            put("eu-west-1", "adcp-vpc.eu-west-1.aliyuncs.com");
            put("ap-northeast-1", "adcp.ap-northeast-1.aliyuncs.com");
            put("me-east-1", "adcp.me-east-1.aliyuncs.com");
            put("cn-chengdu", "adcp-vpc.cn-chengdu.aliyuncs.com");
            put("cn-qingdao", "adcp.cn-qingdao.aliyuncs.com");
            put("cn-shanghai", "adcp.cn-shanghai.aliyuncs.com");
            put("cn-shanghai-finance-1", "adcp-vpc.cn-shanghai-finance-1.aliyuncs.com");
            put("cn-hongkong", "adcp.cn-hongkong.aliyuncs.com");
            put("cn-heyuan", "adcp.cn-heyuan.aliyuncs.com");
            put("ap-southeast-1", "adcp.ap-southeast-1.aliyuncs.com");
            put("ap-southeast-2", "adcp.ap-southeast-2.aliyuncs.com");
            put("ap-southeast-3", "adcp.ap-southeast-3.aliyuncs.com");
            put("eu-central-1", "adcp.eu-central-1.aliyuncs.com");
            put("cn-huhehaote", "adcp.cn-huhehaote.aliyuncs.com");
            put("ap-southeast-5", "adcp.ap-southeast-5.aliyuncs.com");
            put("us-east-1", "adcp.us-east-1.aliyuncs.com");
            put("cn-zhangjiakou", "adcp.cn-zhangjiakou.aliyuncs.com");
            put("us-west-1", "adcp.us-west-1.aliyuncs.com");
            put("cn-hangzhou", "adcp.cn-hangzhou.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "central";
}
