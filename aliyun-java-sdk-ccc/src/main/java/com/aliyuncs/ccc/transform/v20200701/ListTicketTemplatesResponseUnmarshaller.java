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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListTicketTemplatesResponse;
import com.aliyuncs.ccc.model.v20200701.ListTicketTemplatesResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListTicketTemplatesResponse.Data.ListItem;
import com.aliyuncs.ccc.model.v20200701.ListTicketTemplatesResponse.Data.ListItem.TicketField;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTicketTemplatesResponseUnmarshaller {

	public static ListTicketTemplatesResponse unmarshall(ListTicketTemplatesResponse listTicketTemplatesResponse, UnmarshallerContext _ctx) {
		
		listTicketTemplatesResponse.setRequestId(_ctx.stringValue("ListTicketTemplatesResponse.RequestId"));
		listTicketTemplatesResponse.setHttpStatusCode(_ctx.integerValue("ListTicketTemplatesResponse.HttpStatusCode"));
		listTicketTemplatesResponse.setCode(_ctx.stringValue("ListTicketTemplatesResponse.Code"));
		listTicketTemplatesResponse.setMessage(_ctx.stringValue("ListTicketTemplatesResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListTicketTemplatesResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ListTicketTemplatesResponse.Params["+ i +"]"));
		}
		listTicketTemplatesResponse.setParams(params);

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListTicketTemplatesResponse.Data.TotalCount"));
		data.setPageNumber(_ctx.integerValue("ListTicketTemplatesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListTicketTemplatesResponse.Data.PageSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTicketTemplatesResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setInstanceId(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].InstanceId"));
			listItem.setTemplateId(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].TemplateId"));
			listItem.setName(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].Name"));
			listItem.setState(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].State"));
			listItem.setEditor(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].Editor"));
			listItem.setProcessDefinition(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].ProcessDefinition"));
			listItem.setUpdatedTime(_ctx.longValue("ListTicketTemplatesResponse.Data.List["+ i +"].UpdatedTime"));
			listItem.setCategoryId(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].CategoryId"));
			listItem.setAppliedVersion(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].AppliedVersion"));
			listItem.setLatestVersion(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].LatestVersion"));

			List<TicketField> ticketFields = new ArrayList<TicketField>();
			for (int j = 0; j < _ctx.lengthValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields.Length"); j++) {
				TicketField ticketField = new TicketField();
				ticketField.setDisplayName(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].DisplayName"));
				ticketField.setDescription(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].Description"));
				ticketField.setName(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].Name"));
				ticketField.setDataType(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].DataType"));
				ticketField.setPattern(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].Pattern"));
				ticketField.setPatternErrorMessage(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].PatternErrorMessage"));
				ticketField.setMinLength(_ctx.integerValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].MinLength"));
				ticketField.setMaxLength(_ctx.integerValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].MaxLength"));
				ticketField.setMinimum(_ctx.doubleValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].Minimum"));
				ticketField.setMaximum(_ctx.doubleValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].Maximum"));
				ticketField.setRequired(_ctx.booleanValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].Required"));
				ticketField.setSystem(_ctx.booleanValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].System"));
				ticketField.setDisabled(_ctx.booleanValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].Disabled"));
				ticketField.setArray(_ctx.booleanValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].Array"));
				ticketField.setReadOnly(_ctx.booleanValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].ReadOnly"));
				ticketField.setEditorType(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].EditorType"));
				ticketField.setAttribute(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].Attribute"));
				ticketField.setDisplayOrder(_ctx.integerValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].DisplayOrder"));
				ticketField.setCreatedTime(_ctx.longValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].CreatedTime"));
				ticketField.setUpdatedTime(_ctx.longValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].UpdatedTime"));
				ticketField.setCreator(_ctx.stringValue("ListTicketTemplatesResponse.Data.List["+ i +"].TicketFields["+ j +"].Creator"));

				ticketFields.add(ticketField);
			}
			listItem.setTicketFields(ticketFields);

			list.add(listItem);
		}
		data.setList(list);
		listTicketTemplatesResponse.setData(data);
	 
	 	return listTicketTemplatesResponse;
	}
}