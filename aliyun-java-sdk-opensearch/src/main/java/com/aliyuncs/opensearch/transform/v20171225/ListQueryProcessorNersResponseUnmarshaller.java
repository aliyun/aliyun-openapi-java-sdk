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

import com.aliyuncs.opensearch.model.v20171225.ListQueryProcessorNersResponse;
import com.aliyuncs.opensearch.model.v20171225.ListQueryProcessorNersResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQueryProcessorNersResponseUnmarshaller {

	public static ListQueryProcessorNersResponse unmarshall(ListQueryProcessorNersResponse listQueryProcessorNersResponse, UnmarshallerContext _ctx) {
		
		listQueryProcessorNersResponse.setRequestId(_ctx.stringValue("ListQueryProcessorNersResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQueryProcessorNersResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setTag(_ctx.stringValue("ListQueryProcessorNersResponse.result["+ i +"].tag"));
			resultItem.setPriority(_ctx.stringValue("ListQueryProcessorNersResponse.result["+ i +"].priority"));
			resultItem.setOrder(_ctx.integerValue("ListQueryProcessorNersResponse.result["+ i +"].order"));
			resultItem.setLabel(_ctx.stringValue("ListQueryProcessorNersResponse.result["+ i +"].label"));

			result.add(resultItem);
		}
		listQueryProcessorNersResponse.setResult(result);
	 
	 	return listQueryProcessorNersResponse;
	}
}