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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppquerybranchResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppquerybranchResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreAppquerybranchResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreAppquerybranchResponse unmarshall(QueryLinkedeploycoreDeploycoreAppquerybranchResponse queryLinkedeploycoreDeploycoreAppquerybranchResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreAppquerybranchResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchResponse.RequestId"));
		queryLinkedeploycoreDeploycoreAppquerybranchResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreAppquerybranchResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreAppquerybranchResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchResponse.Message"));
		queryLinkedeploycoreDeploycoreAppquerybranchResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppquerybranchResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreAppquerybranchResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreAppquerybranchResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreAppquerybranchResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBranch(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchResponse.Data["+ i +"].Branch"));
			dataItem.setCodeUrl(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchResponse.Data["+ i +"].CodeUrl"));
			dataItem.setKey(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchResponse.Data["+ i +"].Key"));

			data.add(dataItem);
		}
		queryLinkedeploycoreDeploycoreAppquerybranchResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreAppquerybranchResponse;
	}
}