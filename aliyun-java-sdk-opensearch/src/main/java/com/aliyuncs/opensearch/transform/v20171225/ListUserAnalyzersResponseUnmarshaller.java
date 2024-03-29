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

import com.aliyuncs.opensearch.model.v20171225.ListUserAnalyzersResponse;
import com.aliyuncs.opensearch.model.v20171225.ListUserAnalyzersResponse.ResultItem;
import com.aliyuncs.opensearch.model.v20171225.ListUserAnalyzersResponse.ResultItem.DictsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserAnalyzersResponseUnmarshaller {

	public static ListUserAnalyzersResponse unmarshall(ListUserAnalyzersResponse listUserAnalyzersResponse, UnmarshallerContext _ctx) {
		
		listUserAnalyzersResponse.setTotalCount(_ctx.integerValue("ListUserAnalyzersResponse.totalCount"));
		listUserAnalyzersResponse.setRequestId(_ctx.stringValue("ListUserAnalyzersResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUserAnalyzersResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreated(_ctx.integerValue("ListUserAnalyzersResponse.result["+ i +"].created"));
			resultItem.setAvailable(_ctx.booleanValue("ListUserAnalyzersResponse.result["+ i +"].available"));
			resultItem.setName(_ctx.stringValue("ListUserAnalyzersResponse.result["+ i +"].name"));
			resultItem.setUpdated(_ctx.integerValue("ListUserAnalyzersResponse.result["+ i +"].updated"));
			resultItem.setId(_ctx.stringValue("ListUserAnalyzersResponse.result["+ i +"].id"));
			resultItem.setBusiness(_ctx.stringValue("ListUserAnalyzersResponse.result["+ i +"].business"));

			List<DictsItem> dicts = new ArrayList<DictsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListUserAnalyzersResponse.result["+ i +"].dicts.Length"); j++) {
				DictsItem dictsItem = new DictsItem();
				dictsItem.setCreated(_ctx.integerValue("ListUserAnalyzersResponse.result["+ i +"].dicts["+ j +"].created"));
				dictsItem.setEntriesCount(_ctx.integerValue("ListUserAnalyzersResponse.result["+ i +"].dicts["+ j +"].entriesCount"));
				dictsItem.setType(_ctx.stringValue("ListUserAnalyzersResponse.result["+ i +"].dicts["+ j +"].type"));
				dictsItem.setEntriesLimit(_ctx.integerValue("ListUserAnalyzersResponse.result["+ i +"].dicts["+ j +"].entriesLimit"));
				dictsItem.setAvailable(_ctx.booleanValue("ListUserAnalyzersResponse.result["+ i +"].dicts["+ j +"].available"));
				dictsItem.setUpdated(_ctx.integerValue("ListUserAnalyzersResponse.result["+ i +"].dicts["+ j +"].updated"));
				dictsItem.setId(_ctx.stringValue("ListUserAnalyzersResponse.result["+ i +"].dicts["+ j +"].id"));

				dicts.add(dictsItem);
			}
			resultItem.setDicts(dicts);

			result.add(resultItem);
		}
		listUserAnalyzersResponse.setResult(result);
	 
	 	return listUserAnalyzersResponse;
	}
}