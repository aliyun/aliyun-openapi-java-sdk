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

import com.aliyuncs.elasticsearch.model.v20170613.ListDeprecatedTemplatesResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListDeprecatedTemplatesResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListDeprecatedTemplatesResponse.ResultItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListDeprecatedTemplatesResponse.ResultItem.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeprecatedTemplatesResponseUnmarshaller {

	public static ListDeprecatedTemplatesResponse unmarshall(ListDeprecatedTemplatesResponse listDeprecatedTemplatesResponse, UnmarshallerContext _ctx) {
		
		listDeprecatedTemplatesResponse.setRequestId(_ctx.stringValue("ListDeprecatedTemplatesResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.longValue("ListDeprecatedTemplatesResponse.Headers.X-Total-Count"));
		listDeprecatedTemplatesResponse.setHeaders(headers);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDeprecatedTemplatesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDataStream(_ctx.booleanValue("ListDeprecatedTemplatesResponse.Result["+ i +"].dataStream"));
			resultItem.setIndexTemplate(_ctx.stringValue("ListDeprecatedTemplatesResponse.Result["+ i +"].indexTemplate"));
			resultItem.setOrder(_ctx.longValue("ListDeprecatedTemplatesResponse.Result["+ i +"].order"));
			resultItem.setVersion(_ctx.stringValue("ListDeprecatedTemplatesResponse.Result["+ i +"].version"));

			List<String> indexPatterns = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDeprecatedTemplatesResponse.Result["+ i +"].indexPatterns.Length"); j++) {
				indexPatterns.add(_ctx.stringValue("ListDeprecatedTemplatesResponse.Result["+ i +"].indexPatterns["+ j +"]"));
			}
			resultItem.setIndexPatterns(indexPatterns);

			Template template = new Template();
			template.setAliases(_ctx.stringValue("ListDeprecatedTemplatesResponse.Result["+ i +"].template.aliases"));
			template.setMappings(_ctx.stringValue("ListDeprecatedTemplatesResponse.Result["+ i +"].template.mappings"));
			template.setSettings(_ctx.stringValue("ListDeprecatedTemplatesResponse.Result["+ i +"].template.settings"));
			resultItem.setTemplate(template);

			result.add(resultItem);
		}
		listDeprecatedTemplatesResponse.setResult(result);
	 
	 	return listDeprecatedTemplatesResponse;
	}
}