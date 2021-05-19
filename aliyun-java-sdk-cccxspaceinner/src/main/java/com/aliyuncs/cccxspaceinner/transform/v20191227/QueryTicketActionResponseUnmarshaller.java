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
		queryTicketActionResponse.setMessage(_ctx.stringValue("QueryTicketActionResponse.Message"));
		queryTicketActionResponse.setCode(_ctx.stringValue("QueryTicketActionResponse.Code"));
		queryTicketActionResponse.setSuccess(_ctx.booleanValue("QueryTicketActionResponse.Success"));

		Data data = new Data();
		data.setTotalResults(_ctx.integerValue("QueryTicketActionResponse.Data.TotalResults"));
		data.setCurrentPage(_ctx.integerValue("QueryTicketActionResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryTicketActionResponse.Data.PageSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTicketActionResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setBizTenantId(_ctx.longValue("QueryTicketActionResponse.Data.List["+ i +"].BizTenantId"));
			listItem.setActionType(_ctx.integerValue("QueryTicketActionResponse.Data.List["+ i +"].ActionType"));
			listItem.setMemo(_ctx.stringValue("QueryTicketActionResponse.Data.List["+ i +"].Memo"));
			listItem.setBizId(_ctx.longValue("QueryTicketActionResponse.Data.List["+ i +"].BizId"));
			listItem.setAcceptorRole(_ctx.integerValue("QueryTicketActionResponse.Data.List["+ i +"].AcceptorRole"));
			listItem.setHideType(_ctx.integerValue("QueryTicketActionResponse.Data.List["+ i +"].HideType"));
			listItem.setBuyerId(_ctx.longValue("QueryTicketActionResponse.Data.List["+ i +"].BuyerId"));
			listItem.setBizType(_ctx.integerValue("QueryTicketActionResponse.Data.List["+ i +"].BizType"));
			listItem.setBuId(_ctx.integerValue("QueryTicketActionResponse.Data.List["+ i +"].BuId"));
			listItem.setActionCode(_ctx.integerValue("QueryTicketActionResponse.Data.List["+ i +"].ActionCode"));
			listItem.setBizIdStr(_ctx.stringValue("QueryTicketActionResponse.Data.List["+ i +"].BizIdStr"));
			listItem.setOperatorRole(_ctx.integerValue("QueryTicketActionResponse.Data.List["+ i +"].OperatorRole"));
			listItem.setAcceptor(_ctx.longValue("QueryTicketActionResponse.Data.List["+ i +"].Acceptor"));
			listItem.setOperator(_ctx.longValue("QueryTicketActionResponse.Data.List["+ i +"].Operator"));
			listItem.setTaskId(_ctx.longValue("QueryTicketActionResponse.Data.List["+ i +"].TaskId"));

			list.add(listItem);
		}
		data.setList(list);
		queryTicketActionResponse.setData(data);
	 
	 	return queryTicketActionResponse;
	}
}