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

import com.aliyuncs.elasticsearch.model.v20170613.ListDictsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListDictsResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListDictsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDictsResponseUnmarshaller {

	public static ListDictsResponse unmarshall(ListDictsResponse listDictsResponse, UnmarshallerContext _ctx) {
		
		listDictsResponse.setRequestId(_ctx.stringValue("ListDictsResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListDictsResponse.Headers.X-Total-Count"));
		listDictsResponse.setHeaders(headers);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDictsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setName(_ctx.stringValue("ListDictsResponse.Result["+ i +"].name"));
			resultItem.setFileSize(_ctx.longValue("ListDictsResponse.Result["+ i +"].fileSize"));
			resultItem.setType(_ctx.stringValue("ListDictsResponse.Result["+ i +"].type"));
			resultItem.setSourceType(_ctx.stringValue("ListDictsResponse.Result["+ i +"].sourceType"));
			resultItem.setDownloadUrl(_ctx.stringValue("ListDictsResponse.Result["+ i +"].downloadUrl"));

			result.add(resultItem);
		}
		listDictsResponse.setResult(result);
	 
	 	return listDictsResponse;
	}
}