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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryStatementsResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryStatementsResponse.Model;
import com.aliyuncs.linkedmall.model.v20180116.QueryStatementsResponse.Model.StatementListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryStatementsResponseUnmarshaller {

	public static QueryStatementsResponse unmarshall(QueryStatementsResponse queryStatementsResponse, UnmarshallerContext _ctx) {
		
		queryStatementsResponse.setRequestId(_ctx.stringValue("QueryStatementsResponse.RequestId"));
		queryStatementsResponse.setCode(_ctx.stringValue("QueryStatementsResponse.Code"));
		queryStatementsResponse.setMessage(_ctx.stringValue("QueryStatementsResponse.Message"));
		queryStatementsResponse.setSubCode(_ctx.stringValue("QueryStatementsResponse.SubCode"));
		queryStatementsResponse.setSubMessage(_ctx.stringValue("QueryStatementsResponse.SubMessage"));
		queryStatementsResponse.setLogsId(_ctx.stringValue("QueryStatementsResponse.LogsId"));
		queryStatementsResponse.setSuccess(_ctx.booleanValue("QueryStatementsResponse.Success"));
		queryStatementsResponse.setTotalCount(_ctx.longValue("QueryStatementsResponse.TotalCount"));

		Model model = new Model();
		model.setPageSize(_ctx.integerValue("QueryStatementsResponse.Model.PageSize"));
		model.setPageNumber(_ctx.integerValue("QueryStatementsResponse.Model.PageNumber"));
		model.setTotalCount(_ctx.integerValue("QueryStatementsResponse.Model.TotalCount"));

		List<StatementListItem> statementList = new ArrayList<StatementListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryStatementsResponse.Model.StatementList.Length"); i++) {
			StatementListItem statementListItem = new StatementListItem();
			statementListItem.setCreateDate(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].CreateDate"));
			statementListItem.setModifiedDate(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].ModifiedDate"));
			statementListItem.setSettleNo(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].SettleNo"));
			statementListItem.setTenantId(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].TenantId"));
			statementListItem.setPayeeId(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].PayeeId"));
			statementListItem.setPayeeName(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].PayeeName"));
			statementListItem.setPayeeAccountId(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].PayeeAccountId"));
			statementListItem.setPayeeAccountName(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].PayeeAccountName"));
			statementListItem.setPayeeAccountNo(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].PayeeAccountNo"));
			statementListItem.setSettleAmount(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].SettleAmount"));
			statementListItem.setStartTime(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].StartTime"));
			statementListItem.setEndTime(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].EndTime"));
			statementListItem.setSettleStatus(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].SettleStatus"));
			statementListItem.setStatusMessage(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].StatusMessage"));
			statementListItem.setAttributes(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].Attributes"));
			statementListItem.setExtInfo(_ctx.stringValue("QueryStatementsResponse.Model.StatementList["+ i +"].ExtInfo"));

			statementList.add(statementListItem);
		}
		model.setStatementList(statementList);
		queryStatementsResponse.setModel(model);
	 
	 	return queryStatementsResponse;
	}
}