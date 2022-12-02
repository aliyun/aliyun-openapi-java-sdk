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

import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskItemReportsResponse;
import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskItemReportsResponse.Result;
import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskItemReportsResponse.Result.DetailItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowControlTaskItemReportsResponseUnmarshaller {

	public static ListFlowControlTaskItemReportsResponse unmarshall(ListFlowControlTaskItemReportsResponse listFlowControlTaskItemReportsResponse, UnmarshallerContext _ctx) {
		
		listFlowControlTaskItemReportsResponse.setRequestId(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.requestId"));

		Result result = new Result();

		List<DetailItem> detail = new ArrayList<DetailItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowControlTaskItemReportsResponse.result.detail.Length"); i++) {
			DetailItem detailItem = new DetailItem();
			detailItem.setTaskId(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].taskId"));
			detailItem.setItemId(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].itemId"));
			detailItem.setItemType(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].itemType"));
			detailItem.setTaskRank(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].taskRank"));
			detailItem.setItemPv(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].itemPv"));
			detailItem.setTaskPv(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].taskPv"));
			detailItem.setPvPercent(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].pvPercent"));
			detailItem.setItemClick(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].itemClick"));
			detailItem.setTaskClick(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].taskClick"));
			detailItem.setClickPercent(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].clickPercent"));
			detailItem.setItemCtr(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].itemCtr"));
			detailItem.setTaskCtr(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].taskCtr"));
			detailItem.setAccTaskRank(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].accTaskRank"));
			detailItem.setAccItemPv(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].accItemPv"));
			detailItem.setAccTaskPv(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].accTaskPv"));
			detailItem.setAccPvPercent(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].accPvPercent"));
			detailItem.setAccItemClick(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].accItemClick"));
			detailItem.setAccTaskClick(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].accTaskClick"));
			detailItem.setAccClickPercent(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].accClickPercent"));
			detailItem.setAccItemCtr(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].accItemCtr"));
			detailItem.setAccTaskCtr(_ctx.stringValue("ListFlowControlTaskItemReportsResponse.result.detail["+ i +"].accTaskCtr"));

			detail.add(detailItem);
		}
		result.setDetail(detail);
		listFlowControlTaskItemReportsResponse.setResult(result);
	 
	 	return listFlowControlTaskItemReportsResponse;
	}
}