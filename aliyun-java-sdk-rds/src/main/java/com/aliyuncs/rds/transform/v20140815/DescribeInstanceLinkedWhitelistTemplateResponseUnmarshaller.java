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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeInstanceLinkedWhitelistTemplateResponse;
import com.aliyuncs.rds.model.v20140815.DescribeInstanceLinkedWhitelistTemplateResponse.Data;
import com.aliyuncs.rds.model.v20140815.DescribeInstanceLinkedWhitelistTemplateResponse.Data.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceLinkedWhitelistTemplateResponseUnmarshaller {

	public static DescribeInstanceLinkedWhitelistTemplateResponse unmarshall(DescribeInstanceLinkedWhitelistTemplateResponse describeInstanceLinkedWhitelistTemplateResponse, UnmarshallerContext _ctx) {
		
		describeInstanceLinkedWhitelistTemplateResponse.setRequestId(_ctx.stringValue("DescribeInstanceLinkedWhitelistTemplateResponse.RequestId"));
		describeInstanceLinkedWhitelistTemplateResponse.setSuccess(_ctx.booleanValue("DescribeInstanceLinkedWhitelistTemplateResponse.Success"));
		describeInstanceLinkedWhitelistTemplateResponse.setCode(_ctx.stringValue("DescribeInstanceLinkedWhitelistTemplateResponse.Code"));
		describeInstanceLinkedWhitelistTemplateResponse.setMessage(_ctx.stringValue("DescribeInstanceLinkedWhitelistTemplateResponse.Message"));
		describeInstanceLinkedWhitelistTemplateResponse.setHttpStatusCode(_ctx.integerValue("DescribeInstanceLinkedWhitelistTemplateResponse.HttpStatusCode"));

		Data data = new Data();
		data.setInsName(_ctx.stringValue("DescribeInstanceLinkedWhitelistTemplateResponse.Data.InsName"));

		List<Template> templates = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceLinkedWhitelistTemplateResponse.Data.Templates.Length"); i++) {
			Template template = new Template();
			template.setId(_ctx.integerValue("DescribeInstanceLinkedWhitelistTemplateResponse.Data.Templates["+ i +"].Id"));
			template.setUserId(_ctx.integerValue("DescribeInstanceLinkedWhitelistTemplateResponse.Data.Templates["+ i +"].UserId"));
			template.setTemplateId(_ctx.integerValue("DescribeInstanceLinkedWhitelistTemplateResponse.Data.Templates["+ i +"].TemplateId"));
			template.setTemplateName(_ctx.stringValue("DescribeInstanceLinkedWhitelistTemplateResponse.Data.Templates["+ i +"].TemplateName"));
			template.setIps(_ctx.stringValue("DescribeInstanceLinkedWhitelistTemplateResponse.Data.Templates["+ i +"].Ips"));

			templates.add(template);
		}
		data.setTemplates(templates);
		describeInstanceLinkedWhitelistTemplateResponse.setData(data);
	 
	 	return describeInstanceLinkedWhitelistTemplateResponse;
	}
}