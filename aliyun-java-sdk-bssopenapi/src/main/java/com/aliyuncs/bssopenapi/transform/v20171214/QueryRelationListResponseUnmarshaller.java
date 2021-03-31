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

import com.aliyuncs.bssopenapi.model.v20171214.QueryRelationListResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryRelationListResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryRelationListResponse.Data.FinancialRelationInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRelationListResponseUnmarshaller {

	public static QueryRelationListResponse unmarshall(QueryRelationListResponse queryRelationListResponse, UnmarshallerContext _ctx) {
		
		queryRelationListResponse.setRequestId(_ctx.stringValue("QueryRelationListResponse.RequestId"));
		queryRelationListResponse.setCode(_ctx.stringValue("QueryRelationListResponse.Code"));
		queryRelationListResponse.setSuccess(_ctx.booleanValue("QueryRelationListResponse.Success"));
		queryRelationListResponse.setMessage(_ctx.stringValue("QueryRelationListResponse.Message"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("QueryRelationListResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QueryRelationListResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QueryRelationListResponse.Data.TotalCount"));

		List<FinancialRelationInfoListItem> financialRelationInfoList = new ArrayList<FinancialRelationInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRelationListResponse.Data.FinancialRelationInfoList.Length"); i++) {
			FinancialRelationInfoListItem financialRelationInfoListItem = new FinancialRelationInfoListItem();
			financialRelationInfoListItem.setRelationId(_ctx.longValue("QueryRelationListResponse.Data.FinancialRelationInfoList["+ i +"].RelationId"));
			financialRelationInfoListItem.setAccountType(_ctx.stringValue("QueryRelationListResponse.Data.FinancialRelationInfoList["+ i +"].AccountType"));
			financialRelationInfoListItem.setAccountId(_ctx.longValue("QueryRelationListResponse.Data.FinancialRelationInfoList["+ i +"].AccountId"));
			financialRelationInfoListItem.setAccountName(_ctx.stringValue("QueryRelationListResponse.Data.FinancialRelationInfoList["+ i +"].AccountName"));
			financialRelationInfoListItem.setAccountNickName(_ctx.stringValue("QueryRelationListResponse.Data.FinancialRelationInfoList["+ i +"].AccountNickName"));
			financialRelationInfoListItem.setRelationType(_ctx.stringValue("QueryRelationListResponse.Data.FinancialRelationInfoList["+ i +"].RelationType"));
			financialRelationInfoListItem.setState(_ctx.stringValue("QueryRelationListResponse.Data.FinancialRelationInfoList["+ i +"].State"));
			financialRelationInfoListItem.setSetupTime(_ctx.stringValue("QueryRelationListResponse.Data.FinancialRelationInfoList["+ i +"].SetupTime"));
			financialRelationInfoListItem.setStartTime(_ctx.stringValue("QueryRelationListResponse.Data.FinancialRelationInfoList["+ i +"].StartTime"));
			financialRelationInfoListItem.setEndTime(_ctx.stringValue("QueryRelationListResponse.Data.FinancialRelationInfoList["+ i +"].EndTime"));

			financialRelationInfoList.add(financialRelationInfoListItem);
		}
		data.setFinancialRelationInfoList(financialRelationInfoList);
		queryRelationListResponse.setData(data);
	 
	 	return queryRelationListResponse;
	}
}