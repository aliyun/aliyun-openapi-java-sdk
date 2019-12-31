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

package com.aliyuncs.mpserverless.transform.v20190615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpserverless.model.v20190615.ListDingtalkOpenPlatformConfigsResponse;
import com.aliyuncs.mpserverless.model.v20190615.ListDingtalkOpenPlatformConfigsResponse.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDingtalkOpenPlatformConfigsResponseUnmarshaller {

	public static ListDingtalkOpenPlatformConfigsResponse unmarshall(ListDingtalkOpenPlatformConfigsResponse listDingtalkOpenPlatformConfigsResponse, UnmarshallerContext _ctx) {
		
		listDingtalkOpenPlatformConfigsResponse.setRequestId(_ctx.stringValue("ListDingtalkOpenPlatformConfigsResponse.RequestId"));
		listDingtalkOpenPlatformConfigsResponse.setHttpStatusCode(_ctx.stringValue("ListDingtalkOpenPlatformConfigsResponse.HttpStatusCode"));
		listDingtalkOpenPlatformConfigsResponse.setSuccess(_ctx.booleanValue("ListDingtalkOpenPlatformConfigsResponse.Success"));
		listDingtalkOpenPlatformConfigsResponse.setCode(_ctx.stringValue("ListDingtalkOpenPlatformConfigsResponse.Code"));
		listDingtalkOpenPlatformConfigsResponse.setMessage(_ctx.stringValue("ListDingtalkOpenPlatformConfigsResponse.Message"));

		List<Config> configs = new ArrayList<Config>();
		for (int i = 0; i < _ctx.lengthValue("ListDingtalkOpenPlatformConfigsResponse.Configs.Length"); i++) {
			Config config = new Config();
			config.setAppId(_ctx.stringValue("ListDingtalkOpenPlatformConfigsResponse.Configs["+ i +"].AppId"));
			config.setAppSecret(_ctx.stringValue("ListDingtalkOpenPlatformConfigsResponse.Configs["+ i +"].AppSecret"));
			config.setCreateTime(_ctx.stringValue("ListDingtalkOpenPlatformConfigsResponse.Configs["+ i +"].CreateTime"));
			config.setUpdateTime(_ctx.stringValue("ListDingtalkOpenPlatformConfigsResponse.Configs["+ i +"].UpdateTime"));

			configs.add(config);
		}
		listDingtalkOpenPlatformConfigsResponse.setConfigs(configs);
	 
	 	return listDingtalkOpenPlatformConfigsResponse;
	}
}