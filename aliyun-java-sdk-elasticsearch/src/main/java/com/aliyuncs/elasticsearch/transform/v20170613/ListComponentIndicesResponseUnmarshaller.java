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

import com.aliyuncs.elasticsearch.model.v20170613.ListComponentIndicesResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListComponentIndicesResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListComponentIndicesResponse.ResultItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListComponentIndicesResponse.ResultItem.Content;
import com.aliyuncs.elasticsearch.model.v20170613.ListComponentIndicesResponse.ResultItem.Content.Template;
import com.aliyuncs.elasticsearch.model.v20170613.ListComponentIndicesResponse.ResultItem.Content.Template.Settings;
import com.aliyuncs.elasticsearch.model.v20170613.ListComponentIndicesResponse.ResultItem.Content.Template.Settings.Index;
import com.aliyuncs.elasticsearch.model.v20170613.ListComponentIndicesResponse.ResultItem.Content.Template.Settings.Index.Lifecycle;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListComponentIndicesResponseUnmarshaller {

	public static ListComponentIndicesResponse unmarshall(ListComponentIndicesResponse listComponentIndicesResponse, UnmarshallerContext _ctx) {
		
		listComponentIndicesResponse.setRequestId(_ctx.stringValue("ListComponentIndicesResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.longValue("ListComponentIndicesResponse.Headers.X-Total-Count"));
		listComponentIndicesResponse.setHeaders(headers);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListComponentIndicesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setName(_ctx.stringValue("ListComponentIndicesResponse.Result["+ i +"].name"));

			List<String> composed = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListComponentIndicesResponse.Result["+ i +"].composed.Length"); j++) {
				composed.add(_ctx.stringValue("ListComponentIndicesResponse.Result["+ i +"].composed["+ j +"]"));
			}
			resultItem.setComposed(composed);

			Content content = new Content();
			content.setVersion(_ctx.longValue("ListComponentIndicesResponse.Result["+ i +"].content.version"));
			content.set_Meta(_ctx.mapValue("ListComponentIndicesResponse.Result["+ i +"].content._meta"));

			Template template = new Template();

			Settings settings = new Settings();

			Index index = new Index();
			index.setCodec(_ctx.stringValue("ListComponentIndicesResponse.Result["+ i +"].content.template.settings.index.codec"));

			Lifecycle lifecycle = new Lifecycle();
			lifecycle.setName(_ctx.stringValue("ListComponentIndicesResponse.Result["+ i +"].content.template.settings.index.lifecycle.name"));
			index.setLifecycle(lifecycle);
			settings.setIndex(index);
			template.setSettings(settings);
			content.setTemplate(template);
			resultItem.setContent(content);

			result.add(resultItem);
		}
		listComponentIndicesResponse.setResult(result);
	 
	 	return listComponentIndicesResponse;
	}
}