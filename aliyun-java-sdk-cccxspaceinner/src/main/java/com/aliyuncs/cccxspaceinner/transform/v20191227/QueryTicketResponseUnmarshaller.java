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

import com.aliyuncs.cccxspaceinner.model.v20191227.QueryTicketResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.QueryTicketResponse.Data;
import com.aliyuncs.cccxspaceinner.model.v20191227.QueryTicketResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTicketResponseUnmarshaller {

	public static QueryTicketResponse unmarshall(QueryTicketResponse queryTicketResponse, UnmarshallerContext _ctx) {
		
		queryTicketResponse.setSuccess(_ctx.booleanValue("QueryTicketResponse.Success"));
		queryTicketResponse.setCode(_ctx.stringValue("QueryTicketResponse.Code"));
		queryTicketResponse.setMessage(_ctx.stringValue("QueryTicketResponse.Message"));

		Data data = new Data();
		data.setPageSize(_ctx.longValue("QueryTicketResponse.Data.PageSize"));
		data.setTotalResults(_ctx.integerValue("QueryTicketResponse.Data.TotalResults"));
		data.setCurrentPage(_ctx.integerValue("QueryTicketResponse.Data.CurrentPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTicketResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setId(_ctx.longValue("QueryTicketResponse.Data.List["+ i +"].Id"));
			listItem.setQuestionInfo(_ctx.stringValue("QueryTicketResponse.Data.List["+ i +"].QuestionInfo"));
			listItem.setCaseStatus(_ctx.stringValue("QueryTicketResponse.Data.List["+ i +"].CaseStatus"));
			listItem.setSrType(_ctx.stringValue("QueryTicketResponse.Data.List["+ i +"].SrType"));
			listItem.setExtAttrs(_ctx.stringValue("QueryTicketResponse.Data.List["+ i +"].ExtAttrs"));
			listItem.setGmtCreate(_ctx.longValue("QueryTicketResponse.Data.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(_ctx.longValue("QueryTicketResponse.Data.List["+ i +"].GmtModified"));
			listItem.setCaseId(_ctx.longValue("QueryTicketResponse.Data.List["+ i +"].CaseId"));

			list.add(listItem);
		}
		data.setList(list);
		queryTicketResponse.setData(data);
	 
	 	return queryTicketResponse;
	}
}