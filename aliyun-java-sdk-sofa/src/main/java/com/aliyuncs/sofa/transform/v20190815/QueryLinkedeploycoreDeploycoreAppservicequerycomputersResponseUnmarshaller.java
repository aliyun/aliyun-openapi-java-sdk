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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse unmarshall(QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse queryLinkedeploycoreDeploycoreAppservicequerycomputersResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.RequestId"));
		queryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.Message"));
		queryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.Success"));

		Data data = new Data();
		data.setCurrent(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.Data.Current"));
		data.setSize(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.Data.Size"));
		data.setTotal(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.Data.Total"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.Data.Result.Length"); i++) {
			result.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.Data.Result["+ i +"]"));
		}
		data.setResult(result);
		queryLinkedeploycoreDeploycoreAppservicequerycomputersResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreAppservicequerycomputersResponse;
	}
}