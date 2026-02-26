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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskInvalidItemsResponse;
import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskInvalidItemsResponse.ResultItem;
import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskInvalidItemsResponse.ResultItem.InvalidItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowControlTaskInvalidItemsResponseUnmarshaller {

	public static ListFlowControlTaskInvalidItemsResponse unmarshall(ListFlowControlTaskInvalidItemsResponse listFlowControlTaskInvalidItemsResponse, UnmarshallerContext _ctx) {
		
		listFlowControlTaskInvalidItemsResponse.setRequestId(_ctx.stringValue("ListFlowControlTaskInvalidItemsResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowControlTaskInvalidItemsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();

			List<InvalidItemsItem> invalidItems = new ArrayList<InvalidItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListFlowControlTaskInvalidItemsResponse.result["+ i +"].invalidItems.Length"); j++) {
				InvalidItemsItem invalidItemsItem = new InvalidItemsItem();
				invalidItemsItem.setItemId(_ctx.stringValue("ListFlowControlTaskInvalidItemsResponse.result["+ i +"].invalidItems["+ j +"].itemId"));
				invalidItemsItem.setItemType(_ctx.stringValue("ListFlowControlTaskInvalidItemsResponse.result["+ i +"].invalidItems["+ j +"].itemType"));

				invalidItems.add(invalidItemsItem);
			}
			resultItem.setInvalidItems(invalidItems);

			result.add(resultItem);
		}
		listFlowControlTaskInvalidItemsResponse.setResult(result);
	 
	 	return listFlowControlTaskInvalidItemsResponse;
	}
}