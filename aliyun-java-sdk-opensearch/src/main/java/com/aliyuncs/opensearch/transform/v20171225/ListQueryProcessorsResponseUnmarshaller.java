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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.ListQueryProcessorsResponse;
import com.aliyuncs.opensearch.model.v20171225.ListQueryProcessorsResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQueryProcessorsResponseUnmarshaller {

	public static ListQueryProcessorsResponse unmarshall(ListQueryProcessorsResponse listQueryProcessorsResponse, UnmarshallerContext _ctx) {
		
		listQueryProcessorsResponse.setRequestId(_ctx.stringValue("ListQueryProcessorsResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQueryProcessorsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setName(_ctx.stringValue("ListQueryProcessorsResponse.result["+ i +"].name"));
			resultItem.setActive(_ctx.booleanValue("ListQueryProcessorsResponse.result["+ i +"].active"));
			resultItem.setDomain(_ctx.stringValue("ListQueryProcessorsResponse.result["+ i +"].domain"));
			resultItem.setCreated(_ctx.integerValue("ListQueryProcessorsResponse.result["+ i +"].created"));
			resultItem.setUpdated(_ctx.integerValue("ListQueryProcessorsResponse.result["+ i +"].updated"));

			List<String> indexes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListQueryProcessorsResponse.result["+ i +"].indexes.Length"); j++) {
				indexes.add(_ctx.stringValue("ListQueryProcessorsResponse.result["+ i +"].indexes["+ j +"]"));
			}
			resultItem.setIndexes(indexes);

			List<Map<Object, Object>> processors = _ctx.listMapValue("ListQueryProcessorsResponse.result["+ i +"].processors");
			resultItem.setProcessors(processors);

			result.add(resultItem);
		}
		listQueryProcessorsResponse.setResult(result);
	 
	 	return listQueryProcessorsResponse;
	}
}