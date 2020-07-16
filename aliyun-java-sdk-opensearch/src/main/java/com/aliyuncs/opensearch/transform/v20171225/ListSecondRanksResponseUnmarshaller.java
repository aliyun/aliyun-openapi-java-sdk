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

import com.aliyuncs.opensearch.model.v20171225.ListSecondRanksResponse;
import com.aliyuncs.opensearch.model.v20171225.ListSecondRanksResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecondRanksResponseUnmarshaller {

	public static ListSecondRanksResponse unmarshall(ListSecondRanksResponse listSecondRanksResponse, UnmarshallerContext _ctx) {
		
		listSecondRanksResponse.setRequestId(_ctx.stringValue("ListSecondRanksResponse.requestId"));
		listSecondRanksResponse.setTotalCount(_ctx.integerValue("ListSecondRanksResponse.totalCount"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSecondRanksResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.stringValue("ListSecondRanksResponse.result["+ i +"].id"));
			resultItem.setName(_ctx.stringValue("ListSecondRanksResponse.result["+ i +"].name"));
			resultItem.setMeta(_ctx.stringValue("ListSecondRanksResponse.result["+ i +"].meta"));
			resultItem.setActive(_ctx.booleanValue("ListSecondRanksResponse.result["+ i +"].active"));
			resultItem.setDescription(_ctx.stringValue("ListSecondRanksResponse.result["+ i +"].description"));
			resultItem.setCreated(_ctx.integerValue("ListSecondRanksResponse.result["+ i +"].created"));
			resultItem.setUpdated(_ctx.integerValue("ListSecondRanksResponse.result["+ i +"].updated"));
			resultItem.setIsDefault(_ctx.stringValue("ListSecondRanksResponse.result["+ i +"].isDefault"));
			resultItem.setIsSys(_ctx.stringValue("ListSecondRanksResponse.result["+ i +"].isSys"));

			result.add(resultItem);
		}
		listSecondRanksResponse.setResult(result);
	 
	 	return listSecondRanksResponse;
	}
}