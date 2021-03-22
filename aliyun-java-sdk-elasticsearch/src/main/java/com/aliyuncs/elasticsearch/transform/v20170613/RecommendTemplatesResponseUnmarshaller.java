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

import com.aliyuncs.elasticsearch.model.v20170613.RecommendTemplatesResponse;
import com.aliyuncs.elasticsearch.model.v20170613.RecommendTemplatesResponse.TemplateConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecommendTemplatesResponseUnmarshaller {

	public static RecommendTemplatesResponse unmarshall(RecommendTemplatesResponse recommendTemplatesResponse, UnmarshallerContext _ctx) {
		
		recommendTemplatesResponse.setRequestId(_ctx.stringValue("RecommendTemplatesResponse.RequestId"));

		List<TemplateConfig> result = new ArrayList<TemplateConfig>();
		for (int i = 0; i < _ctx.lengthValue("RecommendTemplatesResponse.Result.Length"); i++) {
			TemplateConfig templateConfig = new TemplateConfig();
			templateConfig.setTemplateName(_ctx.stringValue("RecommendTemplatesResponse.Result["+ i +"].templateName"));
			templateConfig.setContent(_ctx.stringValue("RecommendTemplatesResponse.Result["+ i +"].content"));

			result.add(templateConfig);
		}
		recommendTemplatesResponse.setResult(result);
	 
	 	return recommendTemplatesResponse;
	}
}