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

package com.aliyuncs.webplus.transform.v20190320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.webplus.model.v20190320.DescribeConfigTemplatesResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeConfigTemplatesResponse.ConfigTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigTemplatesResponseUnmarshaller {

	public static DescribeConfigTemplatesResponse unmarshall(DescribeConfigTemplatesResponse describeConfigTemplatesResponse, UnmarshallerContext _ctx) {
		
		describeConfigTemplatesResponse.setRequestId(_ctx.stringValue("DescribeConfigTemplatesResponse.RequestId"));
		describeConfigTemplatesResponse.setCode(_ctx.stringValue("DescribeConfigTemplatesResponse.Code"));
		describeConfigTemplatesResponse.setMessage(_ctx.stringValue("DescribeConfigTemplatesResponse.Message"));
		describeConfigTemplatesResponse.setPageNumber(_ctx.integerValue("DescribeConfigTemplatesResponse.PageNumber"));
		describeConfigTemplatesResponse.setPageSize(_ctx.integerValue("DescribeConfigTemplatesResponse.PageSize"));
		describeConfigTemplatesResponse.setTotalCount(_ctx.integerValue("DescribeConfigTemplatesResponse.TotalCount"));

		List<ConfigTemplate> configTemplates = new ArrayList<ConfigTemplate>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigTemplatesResponse.ConfigTemplates.Length"); i++) {
			ConfigTemplate configTemplate = new ConfigTemplate();
			configTemplate.setTemplateId(_ctx.stringValue("DescribeConfigTemplatesResponse.ConfigTemplates["+ i +"].TemplateId"));
			configTemplate.setAppId(_ctx.stringValue("DescribeConfigTemplatesResponse.ConfigTemplates["+ i +"].AppId"));
			configTemplate.setStackId(_ctx.stringValue("DescribeConfigTemplatesResponse.ConfigTemplates["+ i +"].StackId"));
			configTemplate.setPkgVersionId(_ctx.stringValue("DescribeConfigTemplatesResponse.ConfigTemplates["+ i +"].PkgVersionId"));
			configTemplate.setTemplateName(_ctx.stringValue("DescribeConfigTemplatesResponse.ConfigTemplates["+ i +"].TemplateName"));
			configTemplate.setAppName(_ctx.stringValue("DescribeConfigTemplatesResponse.ConfigTemplates["+ i +"].AppName"));
			configTemplate.setCreateTime(_ctx.longValue("DescribeConfigTemplatesResponse.ConfigTemplates["+ i +"].CreateTime"));
			configTemplate.setUpdateTime(_ctx.longValue("DescribeConfigTemplatesResponse.ConfigTemplates["+ i +"].UpdateTime"));
			configTemplate.setStackName(_ctx.stringValue("DescribeConfigTemplatesResponse.ConfigTemplates["+ i +"].StackName"));
			configTemplate.setPkgVersionLabel(_ctx.stringValue("DescribeConfigTemplatesResponse.ConfigTemplates["+ i +"].PkgVersionLabel"));
			configTemplate.setTemplateDescription(_ctx.stringValue("DescribeConfigTemplatesResponse.ConfigTemplates["+ i +"].TemplateDescription"));

			configTemplates.add(configTemplate);
		}
		describeConfigTemplatesResponse.setConfigTemplates(configTemplates);
	 
	 	return describeConfigTemplatesResponse;
	}
}