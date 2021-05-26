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

import com.aliyuncs.cccxspaceinner.model.v20191227.PageQueryTicketResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.PageQueryTicketResponse.Data;
import com.aliyuncs.cccxspaceinner.model.v20191227.PageQueryTicketResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageQueryTicketResponseUnmarshaller {

	public static PageQueryTicketResponse unmarshall(PageQueryTicketResponse pageQueryTicketResponse, UnmarshallerContext _ctx) {
		
		pageQueryTicketResponse.setMessage(_ctx.stringValue("PageQueryTicketResponse.Message"));
		pageQueryTicketResponse.setCode(_ctx.stringValue("PageQueryTicketResponse.Code"));
		pageQueryTicketResponse.setSuccess(_ctx.booleanValue("PageQueryTicketResponse.Success"));

		Data data = new Data();
		data.setTotalResults(_ctx.integerValue("PageQueryTicketResponse.Data.TotalResults"));
		data.setCurrentPage(_ctx.integerValue("PageQueryTicketResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("PageQueryTicketResponse.Data.PageSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("PageQueryTicketResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setCaseId(_ctx.longValue("PageQueryTicketResponse.Data.List["+ i +"].CaseId"));
			listItem.setGmtCreate(_ctx.longValue("PageQueryTicketResponse.Data.List["+ i +"].GmtCreate"));
			listItem.setSrType(_ctx.stringValue("PageQueryTicketResponse.Data.List["+ i +"].SrType"));
			listItem.setGmtModified(_ctx.longValue("PageQueryTicketResponse.Data.List["+ i +"].GmtModified"));
			listItem.setQuestionInfo(_ctx.stringValue("PageQueryTicketResponse.Data.List["+ i +"].QuestionInfo"));
			listItem.setCaseStatus(_ctx.stringValue("PageQueryTicketResponse.Data.List["+ i +"].CaseStatus"));
			listItem.setExtAttrs(_ctx.stringValue("PageQueryTicketResponse.Data.List["+ i +"].ExtAttrs"));
			listItem.setId(_ctx.longValue("PageQueryTicketResponse.Data.List["+ i +"].Id"));

			list.add(listItem);
		}
		data.setList(list);
		pageQueryTicketResponse.setData(data);
	 
	 	return pageQueryTicketResponse;
	}
}