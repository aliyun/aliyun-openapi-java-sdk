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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListSystemAggregationRulesResponse;
import com.aliyuncs.sas.model.v20181203.ListSystemAggregationRulesResponse.AggregationListItem;
import com.aliyuncs.sas.model.v20181203.ListSystemAggregationRulesResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSystemAggregationRulesResponseUnmarshaller {

	public static ListSystemAggregationRulesResponse unmarshall(ListSystemAggregationRulesResponse listSystemAggregationRulesResponse, UnmarshallerContext _ctx) {
		
		listSystemAggregationRulesResponse.setRequestId(_ctx.stringValue("ListSystemAggregationRulesResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListSystemAggregationRulesResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListSystemAggregationRulesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListSystemAggregationRulesResponse.PageInfo.TotalCount"));
		listSystemAggregationRulesResponse.setPageInfo(pageInfo);

		List<AggregationListItem> aggregationList = new ArrayList<AggregationListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSystemAggregationRulesResponse.AggregationList.Length"); i++) {
			AggregationListItem aggregationListItem = new AggregationListItem();
			aggregationListItem.setId(_ctx.integerValue("ListSystemAggregationRulesResponse.AggregationList["+ i +"].Id"));
			aggregationListItem.setRuleCount(_ctx.integerValue("ListSystemAggregationRulesResponse.AggregationList["+ i +"].RuleCount"));
			aggregationListItem.setName(_ctx.stringValue("ListSystemAggregationRulesResponse.AggregationList["+ i +"].Name"));

			aggregationList.add(aggregationListItem);
		}
		listSystemAggregationRulesResponse.setAggregationList(aggregationList);
	 
	 	return listSystemAggregationRulesResponse;
	}
}