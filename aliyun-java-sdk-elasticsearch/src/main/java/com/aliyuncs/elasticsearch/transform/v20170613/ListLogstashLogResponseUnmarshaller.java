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

import com.aliyuncs.elasticsearch.model.v20170613.ListLogstashLogResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListLogstashLogResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLogstashLogResponseUnmarshaller {

	public static ListLogstashLogResponse unmarshall(ListLogstashLogResponse listLogstashLogResponse, UnmarshallerContext _ctx) {
		
		listLogstashLogResponse.setRequestId(_ctx.stringValue("ListLogstashLogResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLogstashLogResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setTimestamp(_ctx.longValue("ListLogstashLogResponse.Result["+ i +"].timestamp"));
			resultItem.setHost(_ctx.stringValue("ListLogstashLogResponse.Result["+ i +"].host"));
			resultItem.setLevel(_ctx.stringValue("ListLogstashLogResponse.Result["+ i +"].level"));
			resultItem.setContent(_ctx.stringValue("ListLogstashLogResponse.Result["+ i +"].content"));
			resultItem.setInstanceId(_ctx.stringValue("ListLogstashLogResponse.Result["+ i +"].instanceId"));

			result.add(resultItem);
		}
		listLogstashLogResponse.setResult(result);
	 
	 	return listLogstashLogResponse;
	}
}