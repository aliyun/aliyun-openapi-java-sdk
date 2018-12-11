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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeActiveOperationTaskResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeActiveOperationTaskResponse.ItemsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActiveOperationTaskResponseUnmarshaller {

	public static DescribeActiveOperationTaskResponse unmarshall(DescribeActiveOperationTaskResponse describeActiveOperationTaskResponse, UnmarshallerContext context) {
		
		describeActiveOperationTaskResponse.setRequestId(context.stringValue("DescribeActiveOperationTaskResponse.RequestId"));
		describeActiveOperationTaskResponse.setTotalRecordCount(context.integerValue("DescribeActiveOperationTaskResponse.TotalRecordCount"));
		describeActiveOperationTaskResponse.setPageSize(context.integerValue("DescribeActiveOperationTaskResponse.PageSize"));
		describeActiveOperationTaskResponse.setPageNumber(context.integerValue("DescribeActiveOperationTaskResponse.PageNumber"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < context.lengthValue("DescribeActiveOperationTaskResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setId(context.integerValue("DescribeActiveOperationTaskResponse.Items["+ i +"].Id"));
			itemsItem.setInsName(context.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].InsName"));
			itemsItem.setDbType(context.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].DbType"));
			itemsItem.setStartTime(context.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].StartTime"));
			itemsItem.setSwitchTime(context.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].SwitchTime"));
			itemsItem.setDeadline(context.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].Deadline"));
			itemsItem.setStatus(context.integerValue("DescribeActiveOperationTaskResponse.Items["+ i +"].Status"));
			itemsItem.setCreatedTime(context.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].CreatedTime"));
			itemsItem.setModifiedTime(context.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].ModifiedTime"));
			itemsItem.setResultInfo(context.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].ResultInfo"));
			itemsItem.setPrepareInterval(context.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].PrepareInterval"));
			itemsItem.setTaskParams(context.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].TaskParams"));
			itemsItem.setTaskType(context.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].TaskType"));

			items.add(itemsItem);
		}
		describeActiveOperationTaskResponse.setItems(items);
	 
	 	return describeActiveOperationTaskResponse;
	}
}