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

package com.aliyuncs.datav_outer.transform.v20190402;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datav_outer.model.v20190402.ListTemplateByWorkspaceResponse;
import com.aliyuncs.datav_outer.model.v20190402.ListTemplateByWorkspaceResponse.TemplateInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTemplateByWorkspaceResponseUnmarshaller {

	public static ListTemplateByWorkspaceResponse unmarshall(ListTemplateByWorkspaceResponse listTemplateByWorkspaceResponse, UnmarshallerContext _ctx) {
		
		listTemplateByWorkspaceResponse.setRequestId(_ctx.stringValue("ListTemplateByWorkspaceResponse.RequestId"));

		List<TemplateInstance> templates = new ArrayList<TemplateInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListTemplateByWorkspaceResponse.Templates.Length"); i++) {
			TemplateInstance templateInstance = new TemplateInstance();
			templateInstance.setId(_ctx.longValue("ListTemplateByWorkspaceResponse.Templates["+ i +"].Id"));
			templateInstance.setName(_ctx.stringValue("ListTemplateByWorkspaceResponse.Templates["+ i +"].Name"));
			templateInstance.setSnapshot(_ctx.stringValue("ListTemplateByWorkspaceResponse.Templates["+ i +"].Snapshot"));
			templateInstance.setThumbnail(_ctx.stringValue("ListTemplateByWorkspaceResponse.Templates["+ i +"].Thumbnail"));
			templateInstance.setSize(_ctx.stringValue("ListTemplateByWorkspaceResponse.Templates["+ i +"].Size"));

			templates.add(templateInstance);
		}
		listTemplateByWorkspaceResponse.setTemplates(templates);
	 
	 	return listTemplateByWorkspaceResponse;
	}
}