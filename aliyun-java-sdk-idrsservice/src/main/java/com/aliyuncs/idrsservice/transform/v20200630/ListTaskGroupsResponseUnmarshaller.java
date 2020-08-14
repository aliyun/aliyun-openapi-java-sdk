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

package com.aliyuncs.idrsservice.transform.v20200630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idrsservice.model.v20200630.ListTaskGroupsResponse;
import com.aliyuncs.idrsservice.model.v20200630.ListTaskGroupsResponse.Data;
import com.aliyuncs.idrsservice.model.v20200630.ListTaskGroupsResponse.Data.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskGroupsResponseUnmarshaller {

	public static ListTaskGroupsResponse unmarshall(ListTaskGroupsResponse listTaskGroupsResponse, UnmarshallerContext _ctx) {
		
		listTaskGroupsResponse.setRequestId(_ctx.stringValue("ListTaskGroupsResponse.RequestId"));
		listTaskGroupsResponse.setCode(_ctx.stringValue("ListTaskGroupsResponse.Code"));
		listTaskGroupsResponse.setMessage(_ctx.stringValue("ListTaskGroupsResponse.Message"));

		Data data = new Data();
		data.setTotalElements(_ctx.longValue("ListTaskGroupsResponse.Data.TotalElements"));
		data.setTotalPages(_ctx.integerValue("ListTaskGroupsResponse.Data.TotalPages"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskGroupsResponse.Data.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setCompletedTasks(_ctx.integerValue("ListTaskGroupsResponse.Data.Items["+ i +"].CompletedTasks"));
			itemsItem.setCreatedAt(_ctx.stringValue("ListTaskGroupsResponse.Data.Items["+ i +"].CreatedAt"));
			itemsItem.setId(_ctx.stringValue("ListTaskGroupsResponse.Data.Items["+ i +"].Id"));
			itemsItem.setName(_ctx.stringValue("ListTaskGroupsResponse.Data.Items["+ i +"].Name"));
			itemsItem.setRuleId(_ctx.stringValue("ListTaskGroupsResponse.Data.Items["+ i +"].RuleId"));
			itemsItem.setRuleName(_ctx.stringValue("ListTaskGroupsResponse.Data.Items["+ i +"].RuleName"));
			itemsItem.setStatus(_ctx.stringValue("ListTaskGroupsResponse.Data.Items["+ i +"].Status"));
			itemsItem.setTotalTasks(_ctx.integerValue("ListTaskGroupsResponse.Data.Items["+ i +"].TotalTasks"));

			List<String> taskIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTaskGroupsResponse.Data.Items["+ i +"].TaskIds.Length"); j++) {
				taskIds.add(_ctx.stringValue("ListTaskGroupsResponse.Data.Items["+ i +"].TaskIds["+ j +"]"));
			}
			itemsItem.setTaskIds(taskIds);

			items.add(itemsItem);
		}
		data.setItems(items);
		listTaskGroupsResponse.setData(data);
	 
	 	return listTaskGroupsResponse;
	}
}