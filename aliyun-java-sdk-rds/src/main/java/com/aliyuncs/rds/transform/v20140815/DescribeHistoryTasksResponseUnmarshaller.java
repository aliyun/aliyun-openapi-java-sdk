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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeHistoryTasksResponse;
import com.aliyuncs.rds.model.v20140815.DescribeHistoryTasksResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHistoryTasksResponseUnmarshaller {

	public static DescribeHistoryTasksResponse unmarshall(DescribeHistoryTasksResponse describeHistoryTasksResponse, UnmarshallerContext _ctx) {
		
		describeHistoryTasksResponse.setRequestId(_ctx.stringValue("DescribeHistoryTasksResponse.RequestId"));
		describeHistoryTasksResponse.setPageNumber(_ctx.integerValue("DescribeHistoryTasksResponse.PageNumber"));
		describeHistoryTasksResponse.setPageSize(_ctx.integerValue("DescribeHistoryTasksResponse.PageSize"));
		describeHistoryTasksResponse.setTotalCount(_ctx.integerValue("DescribeHistoryTasksResponse.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHistoryTasksResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setActionInfo(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].ActionInfo"));
			itemsItem.setCallerSource(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].CallerSource"));
			itemsItem.setCallerUid(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].CallerUid"));
			itemsItem.setCurrentStepName(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].CurrentStepName"));
			itemsItem.setDbType(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].DbType"));
			itemsItem.setEndTime(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].EndTime"));
			itemsItem.setInstanceId(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].InstanceId"));
			itemsItem.setInstanceName(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].InstanceName"));
			itemsItem.setInstanceType(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].InstanceType"));
			itemsItem.setProduct(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].Product"));
			itemsItem.setProgress(_ctx.floatValue("DescribeHistoryTasksResponse.Items["+ i +"].Progress"));
			itemsItem.setReasonCode(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].ReasonCode"));
			itemsItem.setRegionId(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].RegionId"));
			itemsItem.setRemainTime(_ctx.integerValue("DescribeHistoryTasksResponse.Items["+ i +"].RemainTime"));
			itemsItem.setStartTime(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].StartTime"));
			itemsItem.setStatus(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].Status"));
			itemsItem.setTaskDetail(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].TaskDetail"));
			itemsItem.setTaskId(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].TaskId"));
			itemsItem.setTaskType(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].TaskType"));
			itemsItem.setUid(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].Uid"));

			items.add(itemsItem);
		}
		describeHistoryTasksResponse.setItems(items);
	 
	 	return describeHistoryTasksResponse;
	}
}