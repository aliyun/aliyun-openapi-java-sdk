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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.DescribeDeprecatedTemplateResponse;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeDeprecatedTemplateResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeDeprecatedTemplateResponse.Result.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeprecatedTemplateResponseUnmarshaller {

	public static DescribeDeprecatedTemplateResponse unmarshall(DescribeDeprecatedTemplateResponse describeDeprecatedTemplateResponse, UnmarshallerContext _ctx) {
		
		describeDeprecatedTemplateResponse.setRequestId(_ctx.stringValue("DescribeDeprecatedTemplateResponse.RequestId"));

		Result result = new Result();
		result.setDataStream(_ctx.booleanValue("DescribeDeprecatedTemplateResponse.Result.dataStream"));
		result.setIndexTemplate(_ctx.stringValue("DescribeDeprecatedTemplateResponse.Result.indexTemplate"));
		result.setOrder(_ctx.longValue("DescribeDeprecatedTemplateResponse.Result.order"));
		result.setVersion(_ctx.stringValue("DescribeDeprecatedTemplateResponse.Result.version"));

		List<String> indexPatterns = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeprecatedTemplateResponse.Result.indexPatterns.Length"); i++) {
			indexPatterns.add(_ctx.stringValue("DescribeDeprecatedTemplateResponse.Result.indexPatterns["+ i +"]"));
		}
		result.setIndexPatterns(indexPatterns);

		Template template = new Template();
		template.setAliases(_ctx.stringValue("DescribeDeprecatedTemplateResponse.Result.template.aliases"));
		template.setMappings(_ctx.stringValue("DescribeDeprecatedTemplateResponse.Result.template.mappings"));
		template.setSettings(_ctx.stringValue("DescribeDeprecatedTemplateResponse.Result.template.settings"));
		result.setTemplate(template);
		describeDeprecatedTemplateResponse.setResult(result);
	 
	 	return describeDeprecatedTemplateResponse;
	}
}