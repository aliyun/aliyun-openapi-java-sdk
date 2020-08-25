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

import com.aliyuncs.sofa.model.v20190815.QueryDTXActionParamResponse;
import com.aliyuncs.sofa.model.v20190815.QueryDTXActionParamResponse.ParamsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDTXActionParamResponseUnmarshaller {

	public static QueryDTXActionParamResponse unmarshall(QueryDTXActionParamResponse queryDTXActionParamResponse, UnmarshallerContext _ctx) {
		
		queryDTXActionParamResponse.setRequestId(_ctx.stringValue("QueryDTXActionParamResponse.RequestId"));
		queryDTXActionParamResponse.setResultCode(_ctx.stringValue("QueryDTXActionParamResponse.ResultCode"));
		queryDTXActionParamResponse.setResultMessage(_ctx.stringValue("QueryDTXActionParamResponse.ResultMessage"));

		List<ParamsItem> params = new ArrayList<ParamsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDTXActionParamResponse.Params.Length"); i++) {
			ParamsItem paramsItem = new ParamsItem();
			paramsItem.setKey(_ctx.stringValue("QueryDTXActionParamResponse.Params["+ i +"].Key"));
			paramsItem.setValue(_ctx.stringValue("QueryDTXActionParamResponse.Params["+ i +"].Value"));

			params.add(paramsItem);
		}
		queryDTXActionParamResponse.setParams(params);
	 
	 	return queryDTXActionParamResponse;
	}
}