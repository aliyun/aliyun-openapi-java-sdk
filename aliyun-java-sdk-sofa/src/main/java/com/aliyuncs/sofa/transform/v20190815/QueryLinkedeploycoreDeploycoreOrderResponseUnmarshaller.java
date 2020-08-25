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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreOrderResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreOrderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreOrderResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreOrderResponse unmarshall(QueryLinkedeploycoreDeploycoreOrderResponse queryLinkedeploycoreDeploycoreOrderResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreOrderResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderResponse.RequestId"));
		queryLinkedeploycoreDeploycoreOrderResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreOrderResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreOrderResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderResponse.Message"));
		queryLinkedeploycoreDeploycoreOrderResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreOrderResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreOrderResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreOrderResponse.Success"));

		Data data = new Data();
		data.setCurrent(_ctx.longValue("QueryLinkedeploycoreDeploycoreOrderResponse.Data.Current"));
		data.setSize(_ctx.longValue("QueryLinkedeploycoreDeploycoreOrderResponse.Data.Size"));
		data.setTotal(_ctx.longValue("QueryLinkedeploycoreDeploycoreOrderResponse.Data.Total"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreOrderResponse.Data.Result.Length"); i++) {
			result.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderResponse.Data.Result["+ i +"]"));
		}
		data.setResult(result);
		queryLinkedeploycoreDeploycoreOrderResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreOrderResponse;
	}
}