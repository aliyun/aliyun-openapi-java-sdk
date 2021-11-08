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

import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceIndicesResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceIndicesResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceIndicesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceIndicesResponseUnmarshaller {

	public static ListInstanceIndicesResponse unmarshall(ListInstanceIndicesResponse listInstanceIndicesResponse, UnmarshallerContext _ctx) {
		
		listInstanceIndicesResponse.setRequestId(_ctx.stringValue("ListInstanceIndicesResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXManagedStorageSize(_ctx.longValue("ListInstanceIndicesResponse.Headers.X-Managed-StorageSize"));
		headers.setXManagedCount(_ctx.integerValue("ListInstanceIndicesResponse.Headers.X-Managed-Count"));
		headers.setXOSSStorageSize(_ctx.longValue("ListInstanceIndicesResponse.Headers.X-OSS-StorageSize"));
		headers.setXOSSCount(_ctx.integerValue("ListInstanceIndicesResponse.Headers.X-OSS-Count"));
		listInstanceIndicesResponse.setHeaders(headers);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceIndicesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setIsManaged(_ctx.stringValue("ListInstanceIndicesResponse.Result["+ i +"].isManaged"));
			resultItem.setCreateTime(_ctx.stringValue("ListInstanceIndicesResponse.Result["+ i +"].createTime"));
			resultItem.setSize(_ctx.longValue("ListInstanceIndicesResponse.Result["+ i +"].size"));
			resultItem.setManagedStatus(_ctx.stringValue("ListInstanceIndicesResponse.Result["+ i +"].managedStatus"));
			resultItem.setName(_ctx.stringValue("ListInstanceIndicesResponse.Result["+ i +"].name"));
			resultItem.setHealth(_ctx.stringValue("ListInstanceIndicesResponse.Result["+ i +"].health"));
			resultItem.setPhase(_ctx.stringValue("ListInstanceIndicesResponse.Result["+ i +"].phase"));
			resultItem.setIlmExplain(_ctx.stringValue("ListInstanceIndicesResponse.Result["+ i +"].ilmExplain"));

			result.add(resultItem);
		}
		listInstanceIndicesResponse.setResult(result);
	 
	 	return listInstanceIndicesResponse;
	}
}