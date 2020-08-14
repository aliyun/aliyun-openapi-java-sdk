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

import com.aliyuncs.idrsservice.model.v20200630.ListDetectionsResponse;
import com.aliyuncs.idrsservice.model.v20200630.ListDetectionsResponse.Data;
import com.aliyuncs.idrsservice.model.v20200630.ListDetectionsResponse.Data.ItemsItem;
import com.aliyuncs.idrsservice.model.v20200630.ListDetectionsResponse.Data.ItemsItem.TasksItem;
import com.aliyuncs.idrsservice.model.v20200630.ListDetectionsResponse.ErrorsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDetectionsResponseUnmarshaller {

	public static ListDetectionsResponse unmarshall(ListDetectionsResponse listDetectionsResponse, UnmarshallerContext _ctx) {
		
		listDetectionsResponse.setRequestId(_ctx.stringValue("ListDetectionsResponse.RequestId"));
		listDetectionsResponse.setCode(_ctx.stringValue("ListDetectionsResponse.Code"));
		listDetectionsResponse.setMessage(_ctx.stringValue("ListDetectionsResponse.Message"));

		Data data = new Data();
		data.setTotalElements(_ctx.longValue("ListDetectionsResponse.Data.TotalElements"));
		data.setTotalPages(_ctx.integerValue("ListDetectionsResponse.Data.TotalPages"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDetectionsResponse.Data.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setCreatedAt(_ctx.stringValue("ListDetectionsResponse.Data.Items["+ i +"].CreatedAt"));
			itemsItem.setDepartmentId(_ctx.stringValue("ListDetectionsResponse.Data.Items["+ i +"].DepartmentId"));
			itemsItem.setDepartmentName(_ctx.stringValue("ListDetectionsResponse.Data.Items["+ i +"].DepartmentName"));
			itemsItem.setId(_ctx.stringValue("ListDetectionsResponse.Data.Items["+ i +"].Id"));
			itemsItem.setRecordingType(_ctx.stringValue("ListDetectionsResponse.Data.Items["+ i +"].RecordingType"));
			itemsItem.setRuleId(_ctx.stringValue("ListDetectionsResponse.Data.Items["+ i +"].RuleId"));
			itemsItem.setRuleName(_ctx.stringValue("ListDetectionsResponse.Data.Items["+ i +"].RuleName"));
			itemsItem.setStatus(_ctx.stringValue("ListDetectionsResponse.Data.Items["+ i +"].Status"));

			List<TasksItem> tasks = new ArrayList<TasksItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDetectionsResponse.Data.Items["+ i +"].Tasks.Length"); j++) {
				TasksItem tasksItem = new TasksItem();
				tasksItem.setCreatedAt(_ctx.stringValue("ListDetectionsResponse.Data.Items["+ i +"].Tasks["+ j +"].CreatedAt"));
				tasksItem.setId(_ctx.stringValue("ListDetectionsResponse.Data.Items["+ i +"].Tasks["+ j +"].Id"));
				tasksItem.setStatus(_ctx.stringValue("ListDetectionsResponse.Data.Items["+ i +"].Tasks["+ j +"].Status"));
				tasksItem.setVideoMetaUrl(_ctx.stringValue("ListDetectionsResponse.Data.Items["+ i +"].Tasks["+ j +"].VideoMetaUrl"));
				tasksItem.setVideoUrl(_ctx.stringValue("ListDetectionsResponse.Data.Items["+ i +"].Tasks["+ j +"].VideoUrl"));

				tasks.add(tasksItem);
			}
			itemsItem.setTasks(tasks);

			items.add(itemsItem);
		}
		data.setItems(items);
		listDetectionsResponse.setData(data);

		List<ErrorsItem> errors = new ArrayList<ErrorsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDetectionsResponse.Errors.Length"); i++) {
			ErrorsItem errorsItem = new ErrorsItem();
			errorsItem.setField(_ctx.stringValue("ListDetectionsResponse.Errors["+ i +"].Field"));
			errorsItem.setMessage(_ctx.stringValue("ListDetectionsResponse.Errors["+ i +"].Message"));

			errors.add(errorsItem);
		}
		listDetectionsResponse.setErrors(errors);
	 
	 	return listDetectionsResponse;
	}
}