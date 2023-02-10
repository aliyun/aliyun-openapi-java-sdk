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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.ListTemplatesResponse;
import com.aliyuncs.ros.model.v20190910.ListTemplatesResponse.Template;
import com.aliyuncs.ros.model.v20190910.ListTemplatesResponse.Template.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTemplatesResponseUnmarshaller {

	public static ListTemplatesResponse unmarshall(ListTemplatesResponse listTemplatesResponse, UnmarshallerContext _ctx) {
		
		listTemplatesResponse.setRequestId(_ctx.stringValue("ListTemplatesResponse.RequestId"));
		listTemplatesResponse.setTotalCount(_ctx.integerValue("ListTemplatesResponse.TotalCount"));
		listTemplatesResponse.setPageSize(_ctx.integerValue("ListTemplatesResponse.PageSize"));
		listTemplatesResponse.setPageNumber(_ctx.integerValue("ListTemplatesResponse.PageNumber"));

		List<Template> templates = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("ListTemplatesResponse.Templates.Length"); i++) {
			Template template = new Template();
			template.setTemplateARN(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateARN"));
			template.setUpdateTime(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].UpdateTime"));
			template.setDescription(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].Description"));
			template.setCreateTime(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].CreateTime"));
			template.setTemplateName(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateName"));
			template.setTemplateVersion(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateVersion"));
			template.setTemplateId(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].TemplateId"));
			template.setOwnerId(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].OwnerId"));
			template.setShareType(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].ShareType"));
			template.setResourceGroupId(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].ResourceGroupId"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListTemplatesResponse.Templates["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("ListTemplatesResponse.Templates["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			template.setTags(tags);

			templates.add(template);
		}
		listTemplatesResponse.setTemplates(templates);
	 
	 	return listTemplatesResponse;
	}
}