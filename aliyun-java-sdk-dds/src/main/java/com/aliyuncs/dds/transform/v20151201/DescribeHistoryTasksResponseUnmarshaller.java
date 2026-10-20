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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeHistoryTasksResponse;
import com.aliyuncs.dds.model.v20151201.DescribeHistoryTasksResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHistoryTasksResponseUnmarshaller {

	public static DescribeHistoryTasksResponse unmarshall(DescribeHistoryTasksResponse describeHistoryTasksResponse, UnmarshallerContext _ctx) {
		
		describeHistoryTasksResponse.setRequestId(_ctx.stringValue("DescribeHistoryTasksResponse.RequestId"));
		describeHistoryTasksResponse.setTotalCount(_ctx.integerValue("DescribeHistoryTasksResponse.TotalCount"));
		describeHistoryTasksResponse.setPageSize(_ctx.integerValue("DescribeHistoryTasksResponse.PageSize"));
		describeHistoryTasksResponse.setPageNumber(_ctx.integerValue("DescribeHistoryTasksResponse.PageNumber"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHistoryTasksResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setStatus(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].Status"));
			itemsItem.setProgress(_ctx.floatValue("DescribeHistoryTasksResponse.Items["+ i +"].Progress"));
			itemsItem.setTaskId(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].TaskId"));
			itemsItem.setEndTime(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].EndTime"));
			itemsItem.setInstanceId(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].InstanceId"));
			itemsItem.setStartTime(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].StartTime"));
			itemsItem.setProduct(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].Product"));
			itemsItem.setActionInfo(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].ActionInfo"));
			itemsItem.setReasonCode(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].ReasonCode"));
			itemsItem.setDbType(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].DbType"));
			itemsItem.setTaskDetail(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].TaskDetail"));
			itemsItem.setCallerUid(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].CallerUid"));
			itemsItem.setInstanceName(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].InstanceName"));
			itemsItem.setUid(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].Uid"));
			itemsItem.setCallerSource(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].CallerSource"));
			itemsItem.setCurrentStepName(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].CurrentStepName"));
			itemsItem.setTaskType(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].TaskType"));
			itemsItem.setRegionId(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].RegionId"));
			itemsItem.setRemainTime(_ctx.integerValue("DescribeHistoryTasksResponse.Items["+ i +"].RemainTime"));
			itemsItem.setInstanceType(_ctx.stringValue("DescribeHistoryTasksResponse.Items["+ i +"].InstanceType"));

			items.add(itemsItem);
		}
		describeHistoryTasksResponse.setItems(items);
	 
	 	return describeHistoryTasksResponse;
	}
}