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

import com.aliyuncs.datav_outer.model.v20190402.CreateTemplateByScreenResponse;
import com.aliyuncs.datav_outer.model.v20190402.CreateTemplateByScreenResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTemplateByScreenResponseUnmarshaller {

	public static CreateTemplateByScreenResponse unmarshall(CreateTemplateByScreenResponse createTemplateByScreenResponse, UnmarshallerContext _ctx) {
		
		createTemplateByScreenResponse.setRequestId(_ctx.stringValue("CreateTemplateByScreenResponse.RequestId"));

		Template template = new Template();
		template.setTemplateId(_ctx.integerValue("CreateTemplateByScreenResponse.Template.TemplateId"));
		template.setName(_ctx.stringValue("CreateTemplateByScreenResponse.Template.Name"));
		template.setThumbnail(_ctx.stringValue("CreateTemplateByScreenResponse.Template.Thumbnail"));
		createTemplateByScreenResponse.setTemplate(template);
	 
	 	return createTemplateByScreenResponse;
	}
}