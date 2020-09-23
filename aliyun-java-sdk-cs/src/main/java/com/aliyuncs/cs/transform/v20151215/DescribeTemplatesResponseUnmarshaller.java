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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.DescribeTemplatesResponse;
import com.aliyuncs.cs.model.v20151215.DescribeTemplatesResponse.Page_info;
import com.aliyuncs.cs.model.v20151215.DescribeTemplatesResponse.TemplatesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTemplatesResponseUnmarshaller {

	public static DescribeTemplatesResponse unmarshall(DescribeTemplatesResponse describeTemplatesResponse, UnmarshallerContext _ctx) {
		

		Page_info page_info = new Page_info();
		page_info.setPage_number(_ctx.longValue("DescribeTemplatesResponse.page_info.page_number"));
		page_info.setTotal_count(_ctx.longValue("DescribeTemplatesResponse.page_info.total_count"));
		page_info.setPage_size(_ctx.longValue("DescribeTemplatesResponse.page_info.page_size"));
		describeTemplatesResponse.setPage_info(page_info);

		List<TemplatesItem> templates = new ArrayList<TemplatesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTemplatesResponse.templates.Length"); i++) {
			TemplatesItem templatesItem = new TemplatesItem();
			templatesItem.setTemplate(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].template"));
			templatesItem.setCreated(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].created"));
			templatesItem.setName(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].name"));
			templatesItem.setDescription(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].description"));
			templatesItem.setTemplate_type(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].template_type"));
			templatesItem.setId(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].id"));
			templatesItem.setAcl(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].acl"));
			templatesItem.setUpdated(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].updated"));
			templatesItem.setTags(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].tags"));

			templates.add(templatesItem);
		}
		describeTemplatesResponse.setTemplates(templates);
	 
	 	return describeTemplatesResponse;
	}
}