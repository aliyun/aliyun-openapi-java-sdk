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

import com.aliyuncs.elasticsearch.model.v20170613.DescribeComponentIndexResponse;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeComponentIndexResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeComponentIndexResponse.Result.Template;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeComponentIndexResponseUnmarshaller {

	public static DescribeComponentIndexResponse unmarshall(DescribeComponentIndexResponse describeComponentIndexResponse, UnmarshallerContext _ctx) {
		
		describeComponentIndexResponse.setRequestId(_ctx.stringValue("DescribeComponentIndexResponse.RequestId"));

		Result result = new Result();
		result.set_Meta(_ctx.mapValue("DescribeComponentIndexResponse.Result._meta"));

		Template template = new Template();
		template.setAliases(_ctx.mapValue("DescribeComponentIndexResponse.Result.template.aliases"));
		template.setMappings(_ctx.mapValue("DescribeComponentIndexResponse.Result.template.mappings"));
		template.setSettings(_ctx.mapValue("DescribeComponentIndexResponse.Result.template.settings"));
		result.setTemplate(template);
		describeComponentIndexResponse.setResult(result);
	 
	 	return describeComponentIndexResponse;
	}
}