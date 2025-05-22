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

import com.aliyuncs.rds.model.v20140815.DescribeAllWhitelistTemplateResponse;
import com.aliyuncs.rds.model.v20140815.DescribeAllWhitelistTemplateResponse.Data;
import com.aliyuncs.rds.model.v20140815.DescribeAllWhitelistTemplateResponse.Data.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAllWhitelistTemplateResponseUnmarshaller {

	public static DescribeAllWhitelistTemplateResponse unmarshall(DescribeAllWhitelistTemplateResponse describeAllWhitelistTemplateResponse, UnmarshallerContext _ctx) {
		
		describeAllWhitelistTemplateResponse.setRequestId(_ctx.stringValue("DescribeAllWhitelistTemplateResponse.RequestId"));
		describeAllWhitelistTemplateResponse.setCode(_ctx.stringValue("DescribeAllWhitelistTemplateResponse.Code"));
		describeAllWhitelistTemplateResponse.setHttpStatusCode(_ctx.integerValue("DescribeAllWhitelistTemplateResponse.HttpStatusCode"));
		describeAllWhitelistTemplateResponse.setMessage(_ctx.stringValue("DescribeAllWhitelistTemplateResponse.Message"));
		describeAllWhitelistTemplateResponse.setSuccess(_ctx.booleanValue("DescribeAllWhitelistTemplateResponse.Success"));

		Data data = new Data();
		data.setCurrPageNumbers(_ctx.integerValue("DescribeAllWhitelistTemplateResponse.Data.CurrPageNumbers"));
		data.setHasNext(_ctx.booleanValue("DescribeAllWhitelistTemplateResponse.Data.HasNext"));
		data.setHasPrev(_ctx.booleanValue("DescribeAllWhitelistTemplateResponse.Data.HasPrev"));
		data.setMaxRecordsPerPage(_ctx.integerValue("DescribeAllWhitelistTemplateResponse.Data.MaxRecordsPerPage"));
		data.setTotalPageNumbers(_ctx.integerValue("DescribeAllWhitelistTemplateResponse.Data.TotalPageNumbers"));
		data.setTotalRecords(_ctx.integerValue("DescribeAllWhitelistTemplateResponse.Data.TotalRecords"));

		List<Template> templates = new ArrayList<Template>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAllWhitelistTemplateResponse.Data.Templates.Length"); i++) {
			Template template = new Template();
			template.setId(_ctx.integerValue("DescribeAllWhitelistTemplateResponse.Data.Templates["+ i +"].Id"));
			template.setIps(_ctx.stringValue("DescribeAllWhitelistTemplateResponse.Data.Templates["+ i +"].Ips"));
			template.setTemplateId(_ctx.integerValue("DescribeAllWhitelistTemplateResponse.Data.Templates["+ i +"].TemplateId"));
			template.setTemplateName(_ctx.stringValue("DescribeAllWhitelistTemplateResponse.Data.Templates["+ i +"].TemplateName"));
			template.setUserId(_ctx.integerValue("DescribeAllWhitelistTemplateResponse.Data.Templates["+ i +"].UserId"));

			templates.add(template);
		}
		data.setTemplates(templates);
		describeAllWhitelistTemplateResponse.setData(data);
	 
	 	return describeAllWhitelistTemplateResponse;
	}
}