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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryAIActionResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryAIActionResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAIActionResponseUnmarshaller {

	public static QueryAIActionResponse unmarshall(QueryAIActionResponse queryAIActionResponse, UnmarshallerContext _ctx) {
		
		queryAIActionResponse.setRequestId(_ctx.stringValue("QueryAIActionResponse.RequestId"));
		queryAIActionResponse.setSuccess(_ctx.booleanValue("QueryAIActionResponse.Success"));
		queryAIActionResponse.setErrorMessage(_ctx.stringValue("QueryAIActionResponse.ErrorMessage"));
		queryAIActionResponse.setCode(_ctx.stringValue("QueryAIActionResponse.Code"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAIActionResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setActionId(_ctx.stringValue("QueryAIActionResponse.Data["+ i +"].ActionId"));
			dataItem.setPlanId(_ctx.stringValue("QueryAIActionResponse.Data["+ i +"].PlanId"));
			dataItem.setActionTemplateId(_ctx.stringValue("QueryAIActionResponse.Data["+ i +"].ActionTemplateId"));
			dataItem.setActionIndex(_ctx.integerValue("QueryAIActionResponse.Data["+ i +"].ActionIndex"));
			dataItem.setAlgo(_ctx.stringValue("QueryAIActionResponse.Data["+ i +"].Algo"));
			dataItem.setAction(_ctx.stringValue("QueryAIActionResponse.Data["+ i +"].Action"));
			dataItem.setAlgoConfig(_ctx.stringValue("QueryAIActionResponse.Data["+ i +"].AlgoConfig"));
			dataItem.setActionConfig(_ctx.stringValue("QueryAIActionResponse.Data["+ i +"].ActionConfig"));

			data.add(dataItem);
		}
		queryAIActionResponse.setData(data);
	 
	 	return queryAIActionResponse;
	}
}