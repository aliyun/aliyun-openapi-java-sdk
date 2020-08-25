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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreProfilequeryglobalResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse unmarshall(QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse queryLinkedeploycoreDeploycoreProfilequeryglobalResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreProfilequeryglobalResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.RequestId"));
		queryLinkedeploycoreDeploycoreProfilequeryglobalResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreProfilequeryglobalResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreProfilequeryglobalResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.Message"));
		queryLinkedeploycoreDeploycoreProfilequeryglobalResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreProfilequeryglobalResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.Data.AppName"));
		data.setAppServiceId(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.Data.AppServiceId"));
		data.setDetail(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.Data.Detail"));
		data.setEnvName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.Data.EnvName"));
		data.setGmtCreate(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.Data.GmtModified"));
		data.setId(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.Data.Id"));
		data.setParentId(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.Data.ParentId"));
		data.setTenantName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse.Data.TenantName"));
		queryLinkedeploycoreDeploycoreProfilequeryglobalResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreProfilequeryglobalResponse;
	}
}