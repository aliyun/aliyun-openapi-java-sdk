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

import com.aliyuncs.elasticsearch.model.v20170613.ListTagsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListTagsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagsResponseUnmarshaller {

	public static ListTagsResponse unmarshall(ListTagsResponse listTagsResponse, UnmarshallerContext _ctx) {
		
		listTagsResponse.setRequestId(_ctx.stringValue("ListTagsResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTagsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setTagKey(_ctx.stringValue("ListTagsResponse.Result["+ i +"].TagKey"));
			resultItem.setTagValue(_ctx.stringValue("ListTagsResponse.Result["+ i +"].TagValue"));

			result.add(resultItem);
		}
		listTagsResponse.setResult(result);
	 
	 	return listTagsResponse;
	}
}