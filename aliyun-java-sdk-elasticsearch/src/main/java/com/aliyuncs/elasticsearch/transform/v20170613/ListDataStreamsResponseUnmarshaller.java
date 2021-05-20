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

import com.aliyuncs.elasticsearch.model.v20170613.ListDataStreamsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListDataStreamsResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListDataStreamsResponse.ResultItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListDataStreamsResponse.ResultItem.IndicesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataStreamsResponseUnmarshaller {

	public static ListDataStreamsResponse unmarshall(ListDataStreamsResponse listDataStreamsResponse, UnmarshallerContext _ctx) {
		
		listDataStreamsResponse.setRequestId(_ctx.stringValue("ListDataStreamsResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXManagedCount(_ctx.integerValue("ListDataStreamsResponse.Headers.X-Managed-Count"));
		headers.setXManagedStorageSize(_ctx.longValue("ListDataStreamsResponse.Headers.X-Managed-StorageSize"));
		listDataStreamsResponse.setHeaders(headers);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDataStreamsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setHealth(_ctx.stringValue("ListDataStreamsResponse.Result["+ i +"].health"));
			resultItem.setTotalStorageSize(_ctx.longValue("ListDataStreamsResponse.Result["+ i +"].totalStorageSize"));
			resultItem.setName(_ctx.stringValue("ListDataStreamsResponse.Result["+ i +"].name"));
			resultItem.setManagedStorageSize(_ctx.longValue("ListDataStreamsResponse.Result["+ i +"].managedStorageSize"));
			resultItem.setIndexTemplateName(_ctx.stringValue("ListDataStreamsResponse.Result["+ i +"].indexTemplateName"));
			resultItem.setIlmPolicyName(_ctx.stringValue("ListDataStreamsResponse.Result["+ i +"].ilmPolicyName"));

			List<IndicesItem> indices = new ArrayList<IndicesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDataStreamsResponse.Result["+ i +"].indices.Length"); j++) {
				IndicesItem indicesItem = new IndicesItem();
				indicesItem.setName(_ctx.stringValue("ListDataStreamsResponse.Result["+ i +"].indices["+ j +"].name"));
				indicesItem.setHealth(_ctx.stringValue("ListDataStreamsResponse.Result["+ i +"].indices["+ j +"].health"));
				indicesItem.setSize(_ctx.longValue("ListDataStreamsResponse.Result["+ i +"].indices["+ j +"].size"));
				indicesItem.setCreateTime(_ctx.stringValue("ListDataStreamsResponse.Result["+ i +"].indices["+ j +"].createTime"));
				indicesItem.setIsManaged(_ctx.booleanValue("ListDataStreamsResponse.Result["+ i +"].indices["+ j +"].isManaged"));
				indicesItem.setManagedStatus(_ctx.stringValue("ListDataStreamsResponse.Result["+ i +"].indices["+ j +"].managedStatus"));

				indices.add(indicesItem);
			}
			resultItem.setIndices(indices);

			result.add(resultItem);
		}
		listDataStreamsResponse.setResult(result);
	 
	 	return listDataStreamsResponse;
	}
}