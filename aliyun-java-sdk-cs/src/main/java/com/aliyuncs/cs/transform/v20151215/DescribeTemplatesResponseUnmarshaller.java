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
import com.aliyuncs.cs.model.v20151215.DescribeTemplatesResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTemplatesResponseUnmarshaller {

	public static DescribeTemplatesResponse unmarshall(DescribeTemplatesResponse describeTemplatesResponse, UnmarshallerContext _ctx) {
		

		Page_info page_info = new Page_info();
		page_info.setPage_number(_ctx.longValue("DescribeTemplatesResponse.page_info.page_number"));
		page_info.setPage_size(_ctx.longValue("DescribeTemplatesResponse.page_info.page_size"));
		page_info.setTotal_count(_ctx.longValue("DescribeTemplatesResponse.page_info.total_count"));
		describeTemplatesResponse.setPage_info(page_info);

		List<Template> templates = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTemplatesResponse.templates.Length"); i++) {
			Template template = new Template();
			template.setAcl(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].acl"));
			template.setId(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].id"));
			template.setName(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].name"));
			template.setDescription(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].description"));
			template.setTags(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].tags"));
			template.setTemplate(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].template"));
			template.setTemplate_type(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].template_type"));
			template.setCreated(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].created"));
			template.setUpdated(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].updated"));
			template.setTemplate_with_hist_id(_ctx.stringValue("DescribeTemplatesResponse.templates["+ i +"].template_with_hist_id"));

			templates.add(template);
		}
		describeTemplatesResponse.setTemplates(templates);
	 
	 	return describeTemplatesResponse;
	}
}