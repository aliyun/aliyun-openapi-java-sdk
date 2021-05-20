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

import com.aliyuncs.elasticsearch.model.v20170613.ListIndexTemplatesResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListIndexTemplatesResponse.ResultItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListIndexTemplatesResponse.ResultItem.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIndexTemplatesResponseUnmarshaller {

	public static ListIndexTemplatesResponse unmarshall(ListIndexTemplatesResponse listIndexTemplatesResponse, UnmarshallerContext _ctx) {
		
		listIndexTemplatesResponse.setRequestId(_ctx.stringValue("ListIndexTemplatesResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIndexTemplatesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setIndexTemplate(_ctx.stringValue("ListIndexTemplatesResponse.Result["+ i +"].indexTemplate"));
			resultItem.setDataStream(_ctx.booleanValue("ListIndexTemplatesResponse.Result["+ i +"].dataStream"));
			resultItem.setPriority(_ctx.integerValue("ListIndexTemplatesResponse.Result["+ i +"].priority"));
			resultItem.setIlmPolicy(_ctx.stringValue("ListIndexTemplatesResponse.Result["+ i +"].ilmPolicy"));

			List<String> indexPatterns = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListIndexTemplatesResponse.Result["+ i +"].indexPatterns.Length"); j++) {
				indexPatterns.add(_ctx.stringValue("ListIndexTemplatesResponse.Result["+ i +"].indexPatterns["+ j +"]"));
			}
			resultItem.setIndexPatterns(indexPatterns);

			Template template = new Template();
			template.setSettings(_ctx.stringValue("ListIndexTemplatesResponse.Result["+ i +"].template.settings"));
			template.setMappings(_ctx.stringValue("ListIndexTemplatesResponse.Result["+ i +"].template.mappings"));
			template.setAliases(_ctx.stringValue("ListIndexTemplatesResponse.Result["+ i +"].template.aliases"));
			resultItem.setTemplate(template);

			result.add(resultItem);
		}
		listIndexTemplatesResponse.setResult(result);
	 
	 	return listIndexTemplatesResponse;
	}
}