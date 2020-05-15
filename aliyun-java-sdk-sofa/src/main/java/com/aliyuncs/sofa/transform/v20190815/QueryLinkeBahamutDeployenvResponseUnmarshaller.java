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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutDeployenvResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutDeployenvResponseUnmarshaller {

	public static QueryLinkeBahamutDeployenvResponse unmarshall(QueryLinkeBahamutDeployenvResponse queryLinkeBahamutDeployenvResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutDeployenvResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutDeployenvResponse.RequestId"));
		queryLinkeBahamutDeployenvResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutDeployenvResponse.ResultCode"));
		queryLinkeBahamutDeployenvResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutDeployenvResponse.ResultMessage"));
		queryLinkeBahamutDeployenvResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutDeployenvResponse.ErrorMessage"));
		queryLinkeBahamutDeployenvResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutDeployenvResponse.Message"));
		queryLinkeBahamutDeployenvResponse.setResult(_ctx.stringValue("QueryLinkeBahamutDeployenvResponse.Result"));
		queryLinkeBahamutDeployenvResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutDeployenvResponse.Success"));
	 
	 	return queryLinkeBahamutDeployenvResponse;
	}
}