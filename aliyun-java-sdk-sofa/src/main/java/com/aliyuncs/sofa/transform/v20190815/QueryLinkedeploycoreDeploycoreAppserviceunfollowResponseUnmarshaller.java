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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppserviceunfollowResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreAppserviceunfollowResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreAppserviceunfollowResponse unmarshall(QueryLinkedeploycoreDeploycoreAppserviceunfollowResponse queryLinkedeploycoreDeploycoreAppserviceunfollowResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreAppserviceunfollowResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppserviceunfollowResponse.RequestId"));
		queryLinkedeploycoreDeploycoreAppserviceunfollowResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppserviceunfollowResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreAppserviceunfollowResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppserviceunfollowResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreAppserviceunfollowResponse.setData(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreAppserviceunfollowResponse.Data"));
		queryLinkedeploycoreDeploycoreAppserviceunfollowResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppserviceunfollowResponse.Message"));
		queryLinkedeploycoreDeploycoreAppserviceunfollowResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppserviceunfollowResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreAppserviceunfollowResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreAppserviceunfollowResponse.Success"));
	 
	 	return queryLinkedeploycoreDeploycoreAppserviceunfollowResponse;
	}
}