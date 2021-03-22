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

import com.aliyuncs.elasticsearch.model.v20170613.ListSearchLogResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListSearchLogResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListSearchLogResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSearchLogResponseUnmarshaller {

	public static ListSearchLogResponse unmarshall(ListSearchLogResponse listSearchLogResponse, UnmarshallerContext _ctx) {
		
		listSearchLogResponse.setRequestId(_ctx.stringValue("ListSearchLogResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListSearchLogResponse.Headers.X-Total-Count"));
		listSearchLogResponse.setHeaders(headers);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSearchLogResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setTimestamp(_ctx.longValue("ListSearchLogResponse.Result["+ i +"].timestamp"));
			resultItem.setHost(_ctx.stringValue("ListSearchLogResponse.Result["+ i +"].host"));
			resultItem.setInstanceId(_ctx.stringValue("ListSearchLogResponse.Result["+ i +"].instanceId"));
			resultItem.setContentCollection(_ctx.mapValue("ListSearchLogResponse.Result["+ i +"].contentCollection"));
			resultItem.setLevel(_ctx.stringValue("ListSearchLogResponse.Result["+ i +"].level"));
			resultItem.setContent(_ctx.stringValue("ListSearchLogResponse.Result["+ i +"].content"));

			result.add(resultItem);
		}
		listSearchLogResponse.setResult(result);
	 
	 	return listSearchLogResponse;
	}
}