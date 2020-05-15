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

package com.aliyuncs.quickbi_public;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-hongkong", "quickbi-public-share.aliyuncs.com");
            put("ap-southeast-1", "quickbi-public-share.aliyuncs.com");
            put("ap-southeast-3", "quickbi-public-share.aliyuncs.com");
            put("eu-central-1", "quickbi-public-share.aliyuncs.com");
            put("cn-hangzhou", "quickbi-public-share.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "central";
}
