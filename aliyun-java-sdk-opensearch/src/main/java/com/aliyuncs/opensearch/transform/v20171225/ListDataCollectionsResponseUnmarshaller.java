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

import com.aliyuncs.opensearch.model.v20171225.ListDataCollectionsResponse;
import com.aliyuncs.opensearch.model.v20171225.ListDataCollectionsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataCollectionsResponseUnmarshaller {

	public static ListDataCollectionsResponse unmarshall(ListDataCollectionsResponse listDataCollectionsResponse, UnmarshallerContext _ctx) {
		
		listDataCollectionsResponse.setRequestId(_ctx.stringValue("ListDataCollectionsResponse.requestId"));
		listDataCollectionsResponse.setTotalCount(_ctx.integerValue("ListDataCollectionsResponse.totalCount"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDataCollectionsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.stringValue("ListDataCollectionsResponse.result["+ i +"].id"));
			resultItem.setName(_ctx.stringValue("ListDataCollectionsResponse.result["+ i +"].name"));
			resultItem.setType(_ctx.stringValue("ListDataCollectionsResponse.result["+ i +"].type"));
			resultItem.setStatus(_ctx.integerValue("ListDataCollectionsResponse.result["+ i +"].status"));
			resultItem.setDataCollectionType(_ctx.stringValue("ListDataCollectionsResponse.result["+ i +"].dataCollectionType"));
			resultItem.setIndustryName(_ctx.stringValue("ListDataCollectionsResponse.result["+ i +"].industryName"));
			resultItem.setCreated(_ctx.integerValue("ListDataCollectionsResponse.result["+ i +"].created"));
			resultItem.setUpdated(_ctx.integerValue("ListDataCollectionsResponse.result["+ i +"].updated"));
			resultItem.setSundialId(_ctx.stringValue("ListDataCollectionsResponse.result["+ i +"].sundialId"));

			result.add(resultItem);
		}
		listDataCollectionsResponse.setResult(result);
	 
	 	return listDataCollectionsResponse;
	}
}