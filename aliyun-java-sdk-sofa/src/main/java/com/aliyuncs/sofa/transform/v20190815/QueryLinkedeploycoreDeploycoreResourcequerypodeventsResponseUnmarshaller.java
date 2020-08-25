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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse unmarshall(QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse queryLinkedeploycoreDeploycoreResourcequerypodeventsResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreResourcequerypodeventsResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse.RequestId"));
		queryLinkedeploycoreDeploycoreResourcequerypodeventsResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreResourcequerypodeventsResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreResourcequerypodeventsResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse.Message"));
		queryLinkedeploycoreDeploycoreResourcequerypodeventsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreResourcequerypodeventsResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse.Data["+ i +"]"));
		}
		queryLinkedeploycoreDeploycoreResourcequerypodeventsResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreResourcequerypodeventsResponse;
	}
}