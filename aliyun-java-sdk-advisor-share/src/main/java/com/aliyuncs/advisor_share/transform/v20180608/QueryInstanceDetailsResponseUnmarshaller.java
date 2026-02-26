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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.QueryInstanceDetailsResponse;
import com.aliyuncs.advisor_share.model.v20180608.QueryInstanceDetailsResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.QueryInstanceDetailsResponse.Data.AdviceItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInstanceDetailsResponseUnmarshaller {

	public static QueryInstanceDetailsResponse unmarshall(QueryInstanceDetailsResponse queryInstanceDetailsResponse, UnmarshallerContext _ctx) {
		
		queryInstanceDetailsResponse.setSuccess(_ctx.booleanValue("QueryInstanceDetailsResponse.Success"));

		Data data = new Data();
		data.setChargeType(_ctx.stringValue("QueryInstanceDetailsResponse.Data.ChargeType"));
		data.setInstanceId(_ctx.stringValue("QueryInstanceDetailsResponse.Data.InstanceId"));
		data.setPayOfCurrentMonth(_ctx.doubleValue("QueryInstanceDetailsResponse.Data.PayOfCurrentMonth"));
		data.setResourceSpec(_ctx.stringValue("QueryInstanceDetailsResponse.Data.ResourceSpec"));
		data.setDepartmentName(_ctx.stringValue("QueryInstanceDetailsResponse.Data.DepartmentName"));
		data.setAppName(_ctx.stringValue("QueryInstanceDetailsResponse.Data.AppName"));
		data.setUserId(_ctx.stringValue("QueryInstanceDetailsResponse.Data.UserId"));

		List<AdviceItemsItem> adviceItems = new ArrayList<AdviceItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryInstanceDetailsResponse.Data.AdviceItems.Length"); i++) {
			AdviceItemsItem adviceItemsItem = new AdviceItemsItem();
			adviceItemsItem.setAdvice(_ctx.stringValue("QueryInstanceDetailsResponse.Data.AdviceItems["+ i +"].Advice"));
			adviceItemsItem.setRuleType(_ctx.stringValue("QueryInstanceDetailsResponse.Data.AdviceItems["+ i +"].RuleType"));

			adviceItems.add(adviceItemsItem);
		}
		data.setAdviceItems(adviceItems);
		queryInstanceDetailsResponse.setData(data);
	 
	 	return queryInstanceDetailsResponse;
	}
}