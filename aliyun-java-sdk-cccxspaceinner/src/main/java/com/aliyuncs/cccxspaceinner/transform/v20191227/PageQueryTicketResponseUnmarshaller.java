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
		data.setPageSize(_ctx.integerValue("PageQueryTicketResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("PageQueryTicketResponse.Data.CurrentPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("PageQueryTicketResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setCaseId(_ctx.longValue("PageQueryTicketResponse.Data.List["+ i +"].CaseId"));
			listItem.setGmtCreate(_ctx.longValue("PageQueryTicketResponse.Data.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(_ctx.longValue("PageQueryTicketResponse.Data.List["+ i +"].GmtModified"));
			listItem.setTemplateId(_ctx.stringValue("PageQueryTicketResponse.Data.List["+ i +"].TemplateId"));
			listItem.setTitle(_ctx.stringValue("PageQueryTicketResponse.Data.List["+ i +"].Title"));
			listItem.setQuestionInfo(_ctx.stringValue("PageQueryTicketResponse.Data.List["+ i +"].QuestionInfo"));
			listItem.setBizId(_ctx.stringValue("PageQueryTicketResponse.Data.List["+ i +"].BizId"));
			listItem.setMemberId(_ctx.stringValue("PageQueryTicketResponse.Data.List["+ i +"].MemberId"));
			listItem.setMemberName(_ctx.stringValue("PageQueryTicketResponse.Data.List["+ i +"].MemberName"));
			listItem.setServicerId(_ctx.longValue("PageQueryTicketResponse.Data.List["+ i +"].ServicerId"));
			listItem.setServicerName(_ctx.stringValue("PageQueryTicketResponse.Data.List["+ i +"].ServicerName"));
			listItem.setOwnerId(_ctx.longValue("PageQueryTicketResponse.Data.List["+ i +"].OwnerId"));
			listItem.setOwnerName(_ctx.stringValue("PageQueryTicketResponse.Data.List["+ i +"].OwnerName"));
			listItem.setCaseStatus(_ctx.stringValue("PageQueryTicketResponse.Data.List["+ i +"].CaseStatus"));
			listItem.setExtAttrs(_ctx.stringValue("PageQueryTicketResponse.Data.List["+ i +"].ExtAttrs"));

			list.add(listItem);
		}
		data.setList(list);
		pageQueryTicketResponse.setData(data);
	 
	 	return pageQueryTicketResponse;
	}
}