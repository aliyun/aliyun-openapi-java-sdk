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

import com.aliyuncs.rds.model.v20140815.DescribeWhitelistTemplateResponse;
import com.aliyuncs.rds.model.v20140815.DescribeWhitelistTemplateResponse.Data;
import com.aliyuncs.rds.model.v20140815.DescribeWhitelistTemplateResponse.Data.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWhitelistTemplateResponseUnmarshaller {

	public static DescribeWhitelistTemplateResponse unmarshall(DescribeWhitelistTemplateResponse describeWhitelistTemplateResponse, UnmarshallerContext _ctx) {
		
		describeWhitelistTemplateResponse.setRequestId(_ctx.stringValue("DescribeWhitelistTemplateResponse.RequestId"));
		describeWhitelistTemplateResponse.setCode(_ctx.stringValue("DescribeWhitelistTemplateResponse.Code"));
		describeWhitelistTemplateResponse.setHttpStatusCode(_ctx.integerValue("DescribeWhitelistTemplateResponse.HttpStatusCode"));
		describeWhitelistTemplateResponse.setMessage(_ctx.stringValue("DescribeWhitelistTemplateResponse.Message"));
		describeWhitelistTemplateResponse.setSuccess(_ctx.booleanValue("DescribeWhitelistTemplateResponse.Success"));

		Data data = new Data();

		Template template = new Template();
		template.setId(_ctx.integerValue("DescribeWhitelistTemplateResponse.Data.Template.Id"));
		template.setIps(_ctx.stringValue("DescribeWhitelistTemplateResponse.Data.Template.Ips"));
		template.setTemplateId(_ctx.integerValue("DescribeWhitelistTemplateResponse.Data.Template.TemplateId"));
		template.setTemplateName(_ctx.stringValue("DescribeWhitelistTemplateResponse.Data.Template.TemplateName"));
		template.setUserId(_ctx.integerValue("DescribeWhitelistTemplateResponse.Data.Template.UserId"));
		data.setTemplate(template);
		describeWhitelistTemplateResponse.setData(data);
	 
	 	return describeWhitelistTemplateResponse;
	}
}