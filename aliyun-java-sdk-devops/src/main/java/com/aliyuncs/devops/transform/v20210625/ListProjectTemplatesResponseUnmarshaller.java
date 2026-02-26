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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListProjectTemplatesResponse;
import com.aliyuncs.devops.model.v20210625.ListProjectTemplatesResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectTemplatesResponseUnmarshaller {

	public static ListProjectTemplatesResponse unmarshall(ListProjectTemplatesResponse listProjectTemplatesResponse, UnmarshallerContext _ctx) {
		
		listProjectTemplatesResponse.setRequestId(_ctx.stringValue("ListProjectTemplatesResponse.requestId"));
		listProjectTemplatesResponse.setErrorMsg(_ctx.stringValue("ListProjectTemplatesResponse.errorMsg"));
		listProjectTemplatesResponse.setErrorCode(_ctx.stringValue("ListProjectTemplatesResponse.errorCode"));
		listProjectTemplatesResponse.setSuccess(_ctx.booleanValue("ListProjectTemplatesResponse.success"));

		List<Template> templates = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectTemplatesResponse.templates.Length"); i++) {
			Template template = new Template();
			template.setCreator(_ctx.stringValue("ListProjectTemplatesResponse.templates["+ i +"].creator"));
			template.setDescription(_ctx.stringValue("ListProjectTemplatesResponse.templates["+ i +"].description"));
			template.setGmtCreate(_ctx.longValue("ListProjectTemplatesResponse.templates["+ i +"].gmtCreate"));
			template.setGmtModified(_ctx.longValue("ListProjectTemplatesResponse.templates["+ i +"].gmtModified"));
			template.setType(_ctx.longValue("ListProjectTemplatesResponse.templates["+ i +"].type"));
			template.setIcon(_ctx.stringValue("ListProjectTemplatesResponse.templates["+ i +"].icon"));
			template.setIdentifier(_ctx.stringValue("ListProjectTemplatesResponse.templates["+ i +"].identifier"));
			template.setModifier(_ctx.stringValue("ListProjectTemplatesResponse.templates["+ i +"].modifier"));
			template.setName(_ctx.stringValue("ListProjectTemplatesResponse.templates["+ i +"].name"));
			template.setNameEn(_ctx.stringValue("ListProjectTemplatesResponse.templates["+ i +"].nameEn"));
			template.setResourceCategory(_ctx.stringValue("ListProjectTemplatesResponse.templates["+ i +"].resourceCategory"));
			template.setCopyFrom(_ctx.stringValue("ListProjectTemplatesResponse.templates["+ i +"].copyFrom"));
			template.setResourceType(_ctx.stringValue("ListProjectTemplatesResponse.templates["+ i +"].resourceType"));
			template.setSpaceIdentifier(_ctx.stringValue("ListProjectTemplatesResponse.templates["+ i +"].spaceIdentifier"));
			template.setSpaceType(_ctx.stringValue("ListProjectTemplatesResponse.templates["+ i +"].spaceType"));

			templates.add(template);
		}
		listProjectTemplatesResponse.setTemplates(templates);
	 
	 	return listProjectTemplatesResponse;
	}
}