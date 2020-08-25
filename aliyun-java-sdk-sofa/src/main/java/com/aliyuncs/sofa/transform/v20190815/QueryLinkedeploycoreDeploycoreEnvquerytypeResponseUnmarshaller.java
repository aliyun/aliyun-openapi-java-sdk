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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreEnvquerytypeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreEnvquerytypeResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreEnvquerytypeResponse unmarshall(QueryLinkedeploycoreDeploycoreEnvquerytypeResponse queryLinkedeploycoreDeploycoreEnvquerytypeResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreEnvquerytypeResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvquerytypeResponse.RequestId"));
		queryLinkedeploycoreDeploycoreEnvquerytypeResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvquerytypeResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreEnvquerytypeResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvquerytypeResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreEnvquerytypeResponse.setData(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvquerytypeResponse.Data"));
		queryLinkedeploycoreDeploycoreEnvquerytypeResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvquerytypeResponse.Message"));
		queryLinkedeploycoreDeploycoreEnvquerytypeResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreEnvquerytypeResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreEnvquerytypeResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreEnvquerytypeResponse.Success"));
	 
	 	return queryLinkedeploycoreDeploycoreEnvquerytypeResponse;
	}
}