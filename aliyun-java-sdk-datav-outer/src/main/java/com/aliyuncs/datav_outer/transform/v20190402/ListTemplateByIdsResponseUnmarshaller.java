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

import com.aliyuncs.datav_outer.model.v20190402.ListTemplateByIdsResponse;
import com.aliyuncs.datav_outer.model.v20190402.ListTemplateByIdsResponse.TemplateInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTemplateByIdsResponseUnmarshaller {

	public static ListTemplateByIdsResponse unmarshall(ListTemplateByIdsResponse listTemplateByIdsResponse, UnmarshallerContext _ctx) {
		
		listTemplateByIdsResponse.setRequestId(_ctx.stringValue("ListTemplateByIdsResponse.RequestId"));

		List<TemplateInstance> templates = new ArrayList<TemplateInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListTemplateByIdsResponse.Templates.Length"); i++) {
			TemplateInstance templateInstance = new TemplateInstance();
			templateInstance.setID(_ctx.stringValue("ListTemplateByIdsResponse.Templates["+ i +"].ID"));
			templateInstance.setName(_ctx.stringValue("ListTemplateByIdsResponse.Templates["+ i +"].Name"));
			templateInstance.setConfig(_ctx.stringValue("ListTemplateByIdsResponse.Templates["+ i +"].Config"));
			templateInstance.setWorkspaceId(_ctx.stringValue("ListTemplateByIdsResponse.Templates["+ i +"].WorkspaceId"));
			templateInstance.setThumbnail(_ctx.stringValue("ListTemplateByIdsResponse.Templates["+ i +"].Thumbnail"));
			templateInstance.setSize(_ctx.stringValue("ListTemplateByIdsResponse.Templates["+ i +"].Size"));

			templates.add(templateInstance);
		}
		listTemplateByIdsResponse.setTemplates(templates);
	 
	 	return listTemplateByIdsResponse;
	}
}