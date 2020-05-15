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

package com.aliyuncs.oos.transform.v20190601;

import com.aliyuncs.oos.model.v20190601.GetExecutionTemplateResponse;
import com.aliyuncs.oos.model.v20190601.GetExecutionTemplateResponse.Template;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetExecutionTemplateResponseUnmarshaller {

	public static GetExecutionTemplateResponse unmarshall(GetExecutionTemplateResponse getExecutionTemplateResponse, UnmarshallerContext _ctx) {
		
		getExecutionTemplateResponse.setRequestId(_ctx.stringValue("GetExecutionTemplateResponse.RequestId"));
		getExecutionTemplateResponse.setContent(_ctx.stringValue("GetExecutionTemplateResponse.Content"));

		Template template = new Template();
		template.setTemplateName(_ctx.stringValue("GetExecutionTemplateResponse.Template.TemplateName"));
		template.setTemplateId(_ctx.stringValue("GetExecutionTemplateResponse.Template.TemplateId"));
		template.setCreatedDate(_ctx.stringValue("GetExecutionTemplateResponse.Template.CreatedDate"));
		template.setCreatedBy(_ctx.stringValue("GetExecutionTemplateResponse.Template.CreatedBy"));
		template.setUpdatedDate(_ctx.stringValue("GetExecutionTemplateResponse.Template.UpdatedDate"));
		template.setUpdatedBy(_ctx.stringValue("GetExecutionTemplateResponse.Template.UpdatedBy"));
		template.setHash(_ctx.stringValue("GetExecutionTemplateResponse.Template.Hash"));
		template.setDescription(_ctx.stringValue("GetExecutionTemplateResponse.Template.Description"));
		template.setShareType(_ctx.stringValue("GetExecutionTemplateResponse.Template.ShareType"));
		template.setTemplateFormat(_ctx.stringValue("GetExecutionTemplateResponse.Template.TemplateFormat"));
		template.setTemplateVersion(_ctx.stringValue("GetExecutionTemplateResponse.Template.TemplateVersion"));
		template.setTags(_ctx.mapValue("GetExecutionTemplateResponse.Template.Tags"));
		getExecutionTemplateResponse.setTemplate(template);
	 
	 	return getExecutionTemplateResponse;
	}
}