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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cccxspaceinner.model.v20191227.QueryTicketActionResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.QueryTicketActionResponse.Data;
import com.aliyuncs.cccxspaceinner.model.v20191227.QueryTicketActionResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTicketActionResponseUnmarshaller {

	public static QueryTicketActionResponse unmarshall(QueryTicketActionResponse queryTicketActionResponse, UnmarshallerContext _ctx) {
		
		queryTicketActionResponse.setRequestId(_ctx.stringValue("QueryTicketActionResponse.RequestId"));
		queryTicketActionResponse.setSuccess(_ctx.booleanValue("QueryTicketActionResponse.Success"));
		queryTicketActionResponse.setCode(_ctx.stringValue("QueryTicketActionResponse.Code"));
		queryTicketActionResponse.setMessage(_ctx.stringValue("QueryTicketActionResponse.Message"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("QueryTicketActionResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("QueryTicketActionResponse.Data.CurrentPage"));
		data.setTotalResults(_ctx.integerValue("QueryTicketActionResponse.Data.TotalResults"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTicketActionResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setOperator(_ctx.longValue("QueryTicketActionResponse.Data.List["+ i +"].Operator"));
			listItem.setOperatorRole(_ctx.integerValue("QueryTicketActionResponse.Data.List["+ i +"].OperatorRole"));
			listItem.setHideType(_ctx.integerValue("QueryTicketActionResponse.Data.List["+ i +"].HideType"));
			listItem.setMemo(_ctx.stringValue("QueryTicketActionResponse.Data.List["+ i +"].Memo"));
			listItem.setBizId(_ctx.longValue("QueryTicketActionResponse.Data.List["+ i +"].BizId"));
			listItem.setBizIdStr(_ctx.stringValue("QueryTicketActionResponse.Data.List["+ i +"].BizIdStr"));
			listItem.setBizType(_ctx.integerValue("QueryTicketActionResponse.Data.List["+ i +"].BizType"));
			listItem.setBizTenantId(_ctx.longValue("QueryTicketActionResponse.Data.List["+ i +"].BizTenantId"));
			listItem.setAcceptor(_ctx.longValue("QueryTicketActionResponse.Data.List["+ i +"].Acceptor"));
			listItem.setAcceptorRole(_ctx.integerValue("QueryTicketActionResponse.Data.List["+ i +"].AcceptorRole"));
			listItem.setActionType(_ctx.integerValue("QueryTicketActionResponse.Data.List["+ i +"].ActionType"));
			listItem.setActionCode(_ctx.integerValue("QueryTicketActionResponse.Data.List["+ i +"].ActionCode"));
			listItem.setBuId(_ctx.integerValue("QueryTicketActionResponse.Data.List["+ i +"].BuId"));
			listItem.setTaskId(_ctx.longValue("QueryTicketActionResponse.Data.List["+ i +"].TaskId"));
			listItem.setBuyerId(_ctx.longValue("QueryTicketActionResponse.Data.List["+ i +"].BuyerId"));

			list.add(listItem);
		}
		data.setList(list);
		queryTicketActionResponse.setData(data);
	 
	 	return queryTicketActionResponse;
	}
}