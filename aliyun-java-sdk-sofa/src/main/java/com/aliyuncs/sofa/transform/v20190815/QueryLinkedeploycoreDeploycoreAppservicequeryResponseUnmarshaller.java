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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppservicequeryResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppservicequeryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreAppservicequeryResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreAppservicequeryResponse unmarshall(QueryLinkedeploycoreDeploycoreAppservicequeryResponse queryLinkedeploycoreDeploycoreAppservicequeryResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreAppservicequeryResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryResponse.RequestId"));
		queryLinkedeploycoreDeploycoreAppservicequeryResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreAppservicequeryResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreAppservicequeryResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryResponse.Message"));
		queryLinkedeploycoreDeploycoreAppservicequeryResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreAppservicequeryResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreAppservicequeryResponse.Success"));

		Data data = new Data();
		data.setCurrent(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryResponse.Data.Current"));
		data.setSize(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryResponse.Data.Size"));
		data.setTotal(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryResponse.Data.Total"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreAppservicequeryResponse.Data.Result.Length"); i++) {
			result.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryResponse.Data.Result["+ i +"]"));
		}
		data.setResult(result);
		queryLinkedeploycoreDeploycoreAppservicequeryResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreAppservicequeryResponse;
	}
}