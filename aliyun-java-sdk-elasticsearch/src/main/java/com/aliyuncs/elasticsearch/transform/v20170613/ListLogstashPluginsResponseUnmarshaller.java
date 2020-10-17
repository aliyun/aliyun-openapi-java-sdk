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

import com.aliyuncs.elasticsearch.model.v20170613.ListLogstashPluginsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListLogstashPluginsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLogstashPluginsResponseUnmarshaller {

	public static ListLogstashPluginsResponse unmarshall(ListLogstashPluginsResponse listLogstashPluginsResponse, UnmarshallerContext _ctx) {
		
		listLogstashPluginsResponse.setRequestId(_ctx.stringValue("ListLogstashPluginsResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLogstashPluginsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setName(_ctx.stringValue("ListLogstashPluginsResponse.Result["+ i +"].name"));
			resultItem.setState(_ctx.stringValue("ListLogstashPluginsResponse.Result["+ i +"].state"));
			resultItem.setSource(_ctx.stringValue("ListLogstashPluginsResponse.Result["+ i +"].source"));
			resultItem.setDescription(_ctx.stringValue("ListLogstashPluginsResponse.Result["+ i +"].description"));
			resultItem.setSpecificationUrl(_ctx.stringValue("ListLogstashPluginsResponse.Result["+ i +"].specificationUrl"));

			result.add(resultItem);
		}
		listLogstashPluginsResponse.setResult(result);
	 
	 	return listLogstashPluginsResponse;
	}
}