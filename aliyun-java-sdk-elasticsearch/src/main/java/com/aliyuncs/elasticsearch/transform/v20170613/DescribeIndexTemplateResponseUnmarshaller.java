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

import com.aliyuncs.elasticsearch.model.v20170613.DescribeIndexTemplateResponse;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeIndexTemplateResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeIndexTemplateResponse.Result.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIndexTemplateResponseUnmarshaller {

	public static DescribeIndexTemplateResponse unmarshall(DescribeIndexTemplateResponse describeIndexTemplateResponse, UnmarshallerContext _ctx) {
		
		describeIndexTemplateResponse.setRequestId(_ctx.stringValue("DescribeIndexTemplateResponse.RequestId"));

		Result result = new Result();
		result.setIndexTemplate(_ctx.stringValue("DescribeIndexTemplateResponse.Result.indexTemplate"));
		result.setDataStream(_ctx.booleanValue("DescribeIndexTemplateResponse.Result.dataStream"));
		result.setPriority(_ctx.integerValue("DescribeIndexTemplateResponse.Result.priority"));
		result.setIlmPolicy(_ctx.stringValue("DescribeIndexTemplateResponse.Result.ilmPolicy"));

		List<String> indexPatterns = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIndexTemplateResponse.Result.indexPatterns.Length"); i++) {
			indexPatterns.add(_ctx.stringValue("DescribeIndexTemplateResponse.Result.indexPatterns["+ i +"]"));
		}
		result.setIndexPatterns(indexPatterns);

		Template template = new Template();
		template.setSettings(_ctx.stringValue("DescribeIndexTemplateResponse.Result.template.settings"));
		template.setMappings(_ctx.stringValue("DescribeIndexTemplateResponse.Result.template.mappings"));
		template.setAliases(_ctx.stringValue("DescribeIndexTemplateResponse.Result.template.aliases"));
		result.setTemplate(template);
		describeIndexTemplateResponse.setResult(result);
	 
	 	return describeIndexTemplateResponse;
	}
}