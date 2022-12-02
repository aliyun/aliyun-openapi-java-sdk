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

import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskItemsResponse;
import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskItemsResponse.Result;
import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskItemsResponse.Result.DetailItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowControlTaskItemsResponseUnmarshaller {

	public static ListFlowControlTaskItemsResponse unmarshall(ListFlowControlTaskItemsResponse listFlowControlTaskItemsResponse, UnmarshallerContext _ctx) {
		
		listFlowControlTaskItemsResponse.setRequestId(_ctx.stringValue("ListFlowControlTaskItemsResponse.requestId"));

		Result result = new Result();
		result.setTotalCount(_ctx.stringValue("ListFlowControlTaskItemsResponse.result.totalCount"));
		result.setValidCount(_ctx.stringValue("ListFlowControlTaskItemsResponse.result.validCount"));

		List<DetailItem> detail = new ArrayList<DetailItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowControlTaskItemsResponse.result.detail.Length"); i++) {
			DetailItem detailItem = new DetailItem();
			detailItem.setAuthor(_ctx.stringValue("ListFlowControlTaskItemsResponse.result.detail["+ i +"].author"));
			detailItem.setDuration(_ctx.stringValue("ListFlowControlTaskItemsResponse.result.detail["+ i +"].duration"));
			detailItem.setItemId(_ctx.stringValue("ListFlowControlTaskItemsResponse.result.detail["+ i +"].itemId"));
			detailItem.setItemType(_ctx.stringValue("ListFlowControlTaskItemsResponse.result.detail["+ i +"].itemType"));
			detailItem.setExpireTime(_ctx.stringValue("ListFlowControlTaskItemsResponse.result.detail["+ i +"].expireTime"));
			detailItem.setCategoryPath(_ctx.stringValue("ListFlowControlTaskItemsResponse.result.detail["+ i +"].categoryPath"));
			detailItem.setPubTime(_ctx.stringValue("ListFlowControlTaskItemsResponse.result.detail["+ i +"].pubTime"));
			detailItem.setLastModifyTime(_ctx.stringValue("ListFlowControlTaskItemsResponse.result.detail["+ i +"].lastModifyTime"));
			detailItem.setChannel(_ctx.stringValue("ListFlowControlTaskItemsResponse.result.detail["+ i +"].channel"));
			detailItem.setWeight(_ctx.stringValue("ListFlowControlTaskItemsResponse.result.detail["+ i +"].weight"));
			detailItem.setTitle(_ctx.stringValue("ListFlowControlTaskItemsResponse.result.detail["+ i +"].title"));
			detailItem.setStatus(_ctx.stringValue("ListFlowControlTaskItemsResponse.result.detail["+ i +"].status"));

			detail.add(detailItem);
		}
		result.setDetail(detail);
		listFlowControlTaskItemsResponse.setResult(result);
	 
	 	return listFlowControlTaskItemsResponse;
	}
}