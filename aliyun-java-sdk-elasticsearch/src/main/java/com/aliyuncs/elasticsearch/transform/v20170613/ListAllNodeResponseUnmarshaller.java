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

import com.aliyuncs.elasticsearch.model.v20170613.ListAllNodeResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListAllNodeResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllNodeResponseUnmarshaller {

	public static ListAllNodeResponse unmarshall(ListAllNodeResponse listAllNodeResponse, UnmarshallerContext _ctx) {
		
		listAllNodeResponse.setRequestId(_ctx.stringValue("ListAllNodeResponse.RequestId"));
		listAllNodeResponse.setCode(_ctx.stringValue("ListAllNodeResponse.Code"));
		listAllNodeResponse.setMessage(_ctx.stringValue("ListAllNodeResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAllNodeResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setHost(_ctx.stringValue("ListAllNodeResponse.Result["+ i +"].host"));
			resultItem.setPort(_ctx.integerValue("ListAllNodeResponse.Result["+ i +"].port"));
			resultItem.setZoneId(_ctx.stringValue("ListAllNodeResponse.Result["+ i +"].zoneId"));
			resultItem.setNodeType(_ctx.stringValue("ListAllNodeResponse.Result["+ i +"].nodeType"));
			resultItem.setCpuPercent(_ctx.stringValue("ListAllNodeResponse.Result["+ i +"].cpuPercent"));
			resultItem.setLoadFiveM(_ctx.stringValue("ListAllNodeResponse.Result["+ i +"].loadFiveM"));
			resultItem.setHeapPercent(_ctx.stringValue("ListAllNodeResponse.Result["+ i +"].heapPercent"));
			resultItem.setHealth(_ctx.stringValue("ListAllNodeResponse.Result["+ i +"].health"));

			result.add(resultItem);
		}
		listAllNodeResponse.setResult(result);
	 
	 	return listAllNodeResponse;
	}
}