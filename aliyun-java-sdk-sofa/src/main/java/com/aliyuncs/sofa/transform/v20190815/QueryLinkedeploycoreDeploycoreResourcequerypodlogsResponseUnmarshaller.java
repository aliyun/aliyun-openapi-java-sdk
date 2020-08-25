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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse unmarshall(QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse queryLinkedeploycoreDeploycoreResourcequerypodlogsResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreResourcequerypodlogsResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse.RequestId"));
		queryLinkedeploycoreDeploycoreResourcequerypodlogsResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreResourcequerypodlogsResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreResourcequerypodlogsResponse.setData(_ctx.stringValue("QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse.Data"));
		queryLinkedeploycoreDeploycoreResourcequerypodlogsResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse.Message"));
		queryLinkedeploycoreDeploycoreResourcequerypodlogsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreResourcequerypodlogsResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreResourcequerypodlogsResponse.Success"));
	 
	 	return queryLinkedeploycoreDeploycoreResourcequerypodlogsResponse;
	}
}