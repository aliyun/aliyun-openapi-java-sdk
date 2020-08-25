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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreIterationqueryappsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreIterationqueryappsResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreIterationqueryappsResponse unmarshall(QueryLinkedeploycoreDeploycoreIterationqueryappsResponse queryLinkedeploycoreDeploycoreIterationqueryappsResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreIterationqueryappsResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreIterationqueryappsResponse.RequestId"));
		queryLinkedeploycoreDeploycoreIterationqueryappsResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreIterationqueryappsResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreIterationqueryappsResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreIterationqueryappsResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreIterationqueryappsResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreIterationqueryappsResponse.Message"));
		queryLinkedeploycoreDeploycoreIterationqueryappsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreIterationqueryappsResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreIterationqueryappsResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreIterationqueryappsResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreIterationqueryappsResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreIterationqueryappsResponse.Data["+ i +"]"));
		}
		queryLinkedeploycoreDeploycoreIterationqueryappsResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreIterationqueryappsResponse;
	}
}