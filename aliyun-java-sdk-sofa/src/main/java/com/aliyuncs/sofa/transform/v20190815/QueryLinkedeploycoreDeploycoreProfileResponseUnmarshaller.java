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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreProfileResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreProfileResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreProfileResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreProfileResponse unmarshall(QueryLinkedeploycoreDeploycoreProfileResponse queryLinkedeploycoreDeploycoreProfileResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreProfileResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfileResponse.RequestId"));
		queryLinkedeploycoreDeploycoreProfileResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfileResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreProfileResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfileResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreProfileResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfileResponse.Message"));
		queryLinkedeploycoreDeploycoreProfileResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfileResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreProfileResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreProfileResponse.Success"));

		Data data = new Data();
		data.setCurrent(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfileResponse.Data.Current"));
		data.setSize(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfileResponse.Data.Size"));
		data.setTotal(_ctx.longValue("QueryLinkedeploycoreDeploycoreProfileResponse.Data.Total"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreProfileResponse.Data.Result.Length"); i++) {
			result.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProfileResponse.Data.Result["+ i +"]"));
		}
		data.setResult(result);
		queryLinkedeploycoreDeploycoreProfileResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreProfileResponse;
	}
}