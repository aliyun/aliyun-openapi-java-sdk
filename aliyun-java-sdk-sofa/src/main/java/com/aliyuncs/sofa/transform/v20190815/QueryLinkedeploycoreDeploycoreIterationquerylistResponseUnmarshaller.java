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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreIterationquerylistResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreIterationquerylistResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreIterationquerylistResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreIterationquerylistResponse unmarshall(QueryLinkedeploycoreDeploycoreIterationquerylistResponse queryLinkedeploycoreDeploycoreIterationquerylistResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreIterationquerylistResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreIterationquerylistResponse.RequestId"));
		queryLinkedeploycoreDeploycoreIterationquerylistResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreIterationquerylistResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreIterationquerylistResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreIterationquerylistResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreIterationquerylistResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreIterationquerylistResponse.Message"));
		queryLinkedeploycoreDeploycoreIterationquerylistResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreIterationquerylistResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreIterationquerylistResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreIterationquerylistResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreIterationquerylistResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setIterationId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreIterationquerylistResponse.Data["+ i +"].IterationId"));
			dataItem.setIterationName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreIterationquerylistResponse.Data["+ i +"].IterationName"));

			data.add(dataItem);
		}
		queryLinkedeploycoreDeploycoreIterationquerylistResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreIterationquerylistResponse;
	}
}