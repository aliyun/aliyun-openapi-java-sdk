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

import com.aliyuncs.ccc.model.v20200701.GetTicketTemplateResponse;
import com.aliyuncs.ccc.model.v20200701.GetTicketTemplateResponse.Data;
import com.aliyuncs.ccc.model.v20200701.GetTicketTemplateResponse.Data.TicketField;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTicketTemplateResponseUnmarshaller {

	public static GetTicketTemplateResponse unmarshall(GetTicketTemplateResponse getTicketTemplateResponse, UnmarshallerContext _ctx) {
		
		getTicketTemplateResponse.setRequestId(_ctx.stringValue("GetTicketTemplateResponse.RequestId"));
		getTicketTemplateResponse.setHttpStatusCode(_ctx.integerValue("GetTicketTemplateResponse.HttpStatusCode"));
		getTicketTemplateResponse.setCode(_ctx.stringValue("GetTicketTemplateResponse.Code"));
		getTicketTemplateResponse.setMessage(_ctx.stringValue("GetTicketTemplateResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTicketTemplateResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("GetTicketTemplateResponse.Params["+ i +"]"));
		}
		getTicketTemplateResponse.setParams(params);

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("GetTicketTemplateResponse.Data.InstanceId"));
		data.setTemplateId(_ctx.stringValue("GetTicketTemplateResponse.Data.TemplateId"));
		data.setName(_ctx.stringValue("GetTicketTemplateResponse.Data.Name"));
		data.setState(_ctx.stringValue("GetTicketTemplateResponse.Data.State"));
		data.setEditor(_ctx.stringValue("GetTicketTemplateResponse.Data.Editor"));
		data.setCategoryId(_ctx.stringValue("GetTicketTemplateResponse.Data.CategoryId"));
		data.setProcessDefinition(_ctx.stringValue("GetTicketTemplateResponse.Data.ProcessDefinition"));
		data.setUpdatedTime(_ctx.longValue("GetTicketTemplateResponse.Data.UpdatedTime"));

		List<TicketField> ticketFields = new ArrayList<TicketField>();
		for (int i = 0; i < _ctx.lengthValue("GetTicketTemplateResponse.Data.TicketFields.Length"); i++) {
			TicketField ticketField = new TicketField();
			ticketField.setDisplayName(_ctx.stringValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].DisplayName"));
			ticketField.setDescription(_ctx.stringValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].Description"));
			ticketField.setName(_ctx.stringValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].Name"));
			ticketField.setDataType(_ctx.stringValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].DataType"));
			ticketField.setPattern(_ctx.stringValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].Pattern"));
			ticketField.setPatternErrorMessage(_ctx.stringValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].PatternErrorMessage"));
			ticketField.setMinLength(_ctx.integerValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].MinLength"));
			ticketField.setMaxLength(_ctx.integerValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].MaxLength"));
			ticketField.setMinimum(_ctx.doubleValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].Minimum"));
			ticketField.setMaximum(_ctx.doubleValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].Maximum"));
			ticketField.setRequired(_ctx.booleanValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].Required"));
			ticketField.setSystem(_ctx.booleanValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].System"));
			ticketField.setDisabled(_ctx.booleanValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].Disabled"));
			ticketField.setArray(_ctx.booleanValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].Array"));
			ticketField.setReadOnly(_ctx.booleanValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].ReadOnly"));
			ticketField.setEditorType(_ctx.stringValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].EditorType"));
			ticketField.setAttributes(_ctx.stringValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].Attributes"));
			ticketField.setDisplayOrder(_ctx.integerValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].DisplayOrder"));
			ticketField.setCreatedTime(_ctx.longValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].CreatedTime"));
			ticketField.setUpdatedTime(_ctx.longValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].UpdatedTime"));
			ticketField.setCreator(_ctx.stringValue("GetTicketTemplateResponse.Data.TicketFields["+ i +"].Creator"));

			ticketFields.add(ticketField);
		}
		data.setTicketFields(ticketFields);
		getTicketTemplateResponse.setData(data);
	 
	 	return getTicketTemplateResponse;
	}
}