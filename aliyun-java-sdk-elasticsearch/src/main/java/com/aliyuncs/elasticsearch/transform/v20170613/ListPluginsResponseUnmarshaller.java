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

import com.aliyuncs.elasticsearch.model.v20170613.ListPluginsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListPluginsResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListPluginsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPluginsResponseUnmarshaller {

	public static ListPluginsResponse unmarshall(ListPluginsResponse listPluginsResponse, UnmarshallerContext _ctx) {
		
		listPluginsResponse.setRequestId(_ctx.stringValue("ListPluginsResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListPluginsResponse.Headers.X-Total-Count"));
		listPluginsResponse.setHeaders(headers);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPluginsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setName(_ctx.stringValue("ListPluginsResponse.Result["+ i +"].name"));
			resultItem.setState(_ctx.stringValue("ListPluginsResponse.Result["+ i +"].state"));
			resultItem.setSource(_ctx.stringValue("ListPluginsResponse.Result["+ i +"].source"));
			resultItem.setDescription(_ctx.stringValue("ListPluginsResponse.Result["+ i +"].description"));

			result.add(resultItem);
		}
		listPluginsResponse.setResult(result);
	 
	 	return listPluginsResponse;
	}
}