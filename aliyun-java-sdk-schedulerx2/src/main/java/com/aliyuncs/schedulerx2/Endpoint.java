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

package com.aliyuncs.schedulerx2;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "schedulerx.cn-shenzhen.aliyuncs.com");
            put("cn-beijing", "schedulerx.cn-beijing.aliyuncs.com");
            put("cn-shanghai", "schedulerx.cn-shanghai.aliyuncs.com");
            put("cn-hangzhou", "schedulerx.cn-hangzhou.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
