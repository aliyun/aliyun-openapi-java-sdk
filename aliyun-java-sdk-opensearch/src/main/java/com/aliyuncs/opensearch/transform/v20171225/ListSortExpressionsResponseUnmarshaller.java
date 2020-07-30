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

import com.aliyuncs.opensearch.model.v20171225.ListSortExpressionsResponse;
import com.aliyuncs.opensearch.model.v20171225.ListSortExpressionsResponse.FirstRankItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSortExpressionsResponseUnmarshaller {

	public static ListSortExpressionsResponse unmarshall(ListSortExpressionsResponse listSortExpressionsResponse, UnmarshallerContext _ctx) {
		
		listSortExpressionsResponse.setRequestId(_ctx.stringValue("ListSortExpressionsResponse.requestId"));

		List<FirstRankItem> result = new ArrayList<FirstRankItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSortExpressionsResponse.result.Length"); i++) {
			FirstRankItem firstRankItem = new FirstRankItem();
			firstRankItem.setName(_ctx.stringValue("ListSortExpressionsResponse.result["+ i +"].name"));
			firstRankItem.setDescription(_ctx.stringValue("ListSortExpressionsResponse.result["+ i +"].description"));
			firstRankItem.setActive(_ctx.booleanValue("ListSortExpressionsResponse.result["+ i +"].active"));
			firstRankItem.setCreated(_ctx.integerValue("ListSortExpressionsResponse.result["+ i +"].created"));
			firstRankItem.setUpdated(_ctx.integerValue("ListSortExpressionsResponse.result["+ i +"].updated"));

			result.add(firstRankItem);
		}
		listSortExpressionsResponse.setResult(result);
	 
	 	return listSortExpressionsResponse;
	}
}