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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse unmarshall(QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse queryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.RequestId"));
		queryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.Message"));
		queryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.Data.AppName"));
		data.setAppServiceId(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.Data.AppServiceId"));
		data.setDetail(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.Data.Detail"));
		data.setEnvName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.Data.EnvName"));
		data.setGmtCreate(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.Data.GmtModified"));
		data.setId(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.Data.Id"));
		data.setParentId(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.Data.ParentId"));
		data.setTenantName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.Data.TenantName"));
		queryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse;
	}
}