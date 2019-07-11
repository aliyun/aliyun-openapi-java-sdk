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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.QueryConfigCenterResponse;
import com.aliyuncs.edas.model.v20170801.QueryConfigCenterResponse.ConfigCenterInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryConfigCenterResponseUnmarshaller {

	public static QueryConfigCenterResponse unmarshall(QueryConfigCenterResponse queryConfigCenterResponse, UnmarshallerContext _ctx) {
		
		queryConfigCenterResponse.setRequestId(_ctx.stringValue("QueryConfigCenterResponse.RequestId"));
		queryConfigCenterResponse.setCode(_ctx.integerValue("QueryConfigCenterResponse.Code"));
		queryConfigCenterResponse.setMessage(_ctx.stringValue("QueryConfigCenterResponse.Message"));

		ConfigCenterInfo configCenterInfo = new ConfigCenterInfo();
		configCenterInfo.setContent(_ctx.stringValue("QueryConfigCenterResponse.configCenterInfo.Content"));
		configCenterInfo.setDataId(_ctx.stringValue("QueryConfigCenterResponse.configCenterInfo.DataId"));
		configCenterInfo.setGroup(_ctx.stringValue("QueryConfigCenterResponse.configCenterInfo.Group"));
		configCenterInfo.setId(_ctx.stringValue("QueryConfigCenterResponse.configCenterInfo.Id"));
		configCenterInfo.setAppName(_ctx.stringValue("QueryConfigCenterResponse.configCenterInfo.AppName"));
		queryConfigCenterResponse.setConfigCenterInfo(configCenterInfo);
	 
	 	return queryConfigCenterResponse;
	}
}