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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.DescribeCostBudgetsSummaryResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeCostBudgetsSummaryResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeCostBudgetsSummaryResponse.Data.Item;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCostBudgetsSummaryResponseUnmarshaller {

	public static DescribeCostBudgetsSummaryResponse unmarshall(DescribeCostBudgetsSummaryResponse describeCostBudgetsSummaryResponse, UnmarshallerContext _ctx) {
		
		describeCostBudgetsSummaryResponse.setRequestId(_ctx.stringValue("DescribeCostBudgetsSummaryResponse.RequestId"));
		describeCostBudgetsSummaryResponse.setSuccess(_ctx.booleanValue("DescribeCostBudgetsSummaryResponse.Success"));
		describeCostBudgetsSummaryResponse.setCode(_ctx.stringValue("DescribeCostBudgetsSummaryResponse.Code"));
		describeCostBudgetsSummaryResponse.setMessage(_ctx.stringValue("DescribeCostBudgetsSummaryResponse.Message"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("DescribeCostBudgetsSummaryResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("DescribeCostBudgetsSummaryResponse.Data.MaxResults"));
		data.setTotalCount(_ctx.integerValue("DescribeCostBudgetsSummaryResponse.Data.TotalCount"));
		data.setHostId(_ctx.stringValue("DescribeCostBudgetsSummaryResponse.Data.HostId"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCostBudgetsSummaryResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setBudgetName(_ctx.stringValue("DescribeCostBudgetsSummaryResponse.Data.Items["+ i +"].BudgetName"));
			item.setBudgetStatus(_ctx.stringValue("DescribeCostBudgetsSummaryResponse.Data.Items["+ i +"].BudgetStatus"));
			item.setBudgetType(_ctx.stringValue("DescribeCostBudgetsSummaryResponse.Data.Items["+ i +"].BudgetType"));
			item.setBudget(_ctx.mapValue("DescribeCostBudgetsSummaryResponse.Data.Items["+ i +"].Budget"));
			item.setCalculatedValues(_ctx.mapValue("DescribeCostBudgetsSummaryResponse.Data.Items["+ i +"].CalculatedValues"));
			item.setConsumePeriod(_ctx.mapValue("DescribeCostBudgetsSummaryResponse.Data.Items["+ i +"].ConsumePeriod"));

			items.add(item);
		}
		data.setItems(items);
		describeCostBudgetsSummaryResponse.setData(data);
	 
	 	return describeCostBudgetsSummaryResponse;
	}
}