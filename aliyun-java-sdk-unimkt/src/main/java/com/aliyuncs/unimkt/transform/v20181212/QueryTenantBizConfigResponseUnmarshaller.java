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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.QueryTenantBizConfigResponse;
import com.aliyuncs.unimkt.model.v20181212.QueryTenantBizConfigResponse.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTenantBizConfigResponseUnmarshaller {

	public static QueryTenantBizConfigResponse unmarshall(QueryTenantBizConfigResponse queryTenantBizConfigResponse, UnmarshallerContext _ctx) {
		
		queryTenantBizConfigResponse.setRequestId(_ctx.stringValue("QueryTenantBizConfigResponse.RequestId"));
		queryTenantBizConfigResponse.setCode(_ctx.stringValue("QueryTenantBizConfigResponse.Code"));
		queryTenantBizConfigResponse.setSuccess(_ctx.booleanValue("QueryTenantBizConfigResponse.Success"));
		queryTenantBizConfigResponse.setMessage(_ctx.stringValue("QueryTenantBizConfigResponse.Message"));

		List<Config> model = new ArrayList<Config>();
		for (int i = 0; i < _ctx.lengthValue("QueryTenantBizConfigResponse.Model.Length"); i++) {
			Config config = new Config();
			config.setBizId(_ctx.stringValue("QueryTenantBizConfigResponse.Model["+ i +"].BizId"));
			config.setKey(_ctx.stringValue("QueryTenantBizConfigResponse.Model["+ i +"].Key"));
			config.setValue(_ctx.stringValue("QueryTenantBizConfigResponse.Model["+ i +"].Value"));
			config.setConfigValueType(_ctx.stringValue("QueryTenantBizConfigResponse.Model["+ i +"].ConfigValueType"));
			config.setConfigDescription(_ctx.stringValue("QueryTenantBizConfigResponse.Model["+ i +"].ConfigDescription"));

			model.add(config);
		}
		queryTenantBizConfigResponse.setModel(model);
	 
	 	return queryTenantBizConfigResponse;
	}
}