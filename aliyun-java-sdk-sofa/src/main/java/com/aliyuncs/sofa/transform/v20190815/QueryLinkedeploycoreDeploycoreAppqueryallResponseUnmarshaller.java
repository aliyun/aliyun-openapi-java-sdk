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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppqueryallResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreAppqueryallResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreAppqueryallResponse unmarshall(QueryLinkedeploycoreDeploycoreAppqueryallResponse queryLinkedeploycoreDeploycoreAppqueryallResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreAppqueryallResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryallResponse.RequestId"));
		queryLinkedeploycoreDeploycoreAppqueryallResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryallResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreAppqueryallResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryallResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreAppqueryallResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryallResponse.Message"));
		queryLinkedeploycoreDeploycoreAppqueryallResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppqueryallResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreAppqueryallResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreAppqueryallResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreAppqueryallResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppqueryallResponse.Data["+ i +"]"));
		}
		queryLinkedeploycoreDeploycoreAppqueryallResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreAppqueryallResponse;
	}
}