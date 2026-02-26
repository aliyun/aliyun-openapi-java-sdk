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

package com.aliyuncs.openitag.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openitag.model.v20220616.GetSubtaskResponse;
import com.aliyuncs.openitag.model.v20220616.GetSubtaskResponse.Subtask;
import com.aliyuncs.openitag.model.v20220616.GetSubtaskResponse.Subtask.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSubtaskResponseUnmarshaller {

	public static GetSubtaskResponse unmarshall(GetSubtaskResponse getSubtaskResponse, UnmarshallerContext _ctx) {
		
		getSubtaskResponse.setRequestId(_ctx.stringValue("GetSubtaskResponse.RequestId"));
		getSubtaskResponse.setCode(_ctx.integerValue("GetSubtaskResponse.Code"));
		getSubtaskResponse.setMessage(_ctx.stringValue("GetSubtaskResponse.Message"));
		getSubtaskResponse.setDetails(_ctx.stringValue("GetSubtaskResponse.Details"));
		getSubtaskResponse.setSuccess(_ctx.booleanValue("GetSubtaskResponse.Success"));
		getSubtaskResponse.setErrorCode(_ctx.stringValue("GetSubtaskResponse.ErrorCode"));

		Subtask subtask = new Subtask();
		subtask.setSubtaskId(_ctx.longValue("GetSubtaskResponse.Subtask.SubtaskId"));
		subtask.setStatus(_ctx.stringValue("GetSubtaskResponse.Subtask.Status"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSubtaskResponse.Subtask.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setFeedbackRemark(_ctx.stringValue("GetSubtaskResponse.Subtask.Items["+ i +"].FeedbackRemark"));
			itemsItem.setFeedbackFlag(_ctx.booleanValue("GetSubtaskResponse.Subtask.Items["+ i +"].FeedbackFlag"));
			itemsItem.setDataId(_ctx.stringValue("GetSubtaskResponse.Subtask.Items["+ i +"].DataId"));
			itemsItem.setState(_ctx.stringValue("GetSubtaskResponse.Subtask.Items["+ i +"].State"));
			itemsItem.setMine(_ctx.longValue("GetSubtaskResponse.Subtask.Items["+ i +"].Mine"));
			itemsItem.setRejectFlag(_ctx.booleanValue("GetSubtaskResponse.Subtask.Items["+ i +"].RejectFlag"));
			itemsItem.setFixedFlag(_ctx.booleanValue("GetSubtaskResponse.Subtask.Items["+ i +"].FixedFlag"));
			itemsItem.setAbandonFlag(_ctx.booleanValue("GetSubtaskResponse.Subtask.Items["+ i +"].AbandonFlag"));
			itemsItem.setAbandonRemark(_ctx.stringValue("GetSubtaskResponse.Subtask.Items["+ i +"].AbandonRemark"));
			itemsItem.setWeight(_ctx.longValue("GetSubtaskResponse.Subtask.Items["+ i +"].Weight"));
			itemsItem.setItemId(_ctx.longValue("GetSubtaskResponse.Subtask.Items["+ i +"].ItemId"));

			items.add(itemsItem);
		}
		subtask.setItems(items);
		getSubtaskResponse.setSubtask(subtask);
	 
	 	return getSubtaskResponse;
	}
}