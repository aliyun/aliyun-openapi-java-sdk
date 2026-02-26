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

import com.aliyuncs.dds.model.v20151201.DescribeActiveOperationTaskResponse;
import com.aliyuncs.dds.model.v20151201.DescribeActiveOperationTaskResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActiveOperationTaskResponseUnmarshaller {

	public static DescribeActiveOperationTaskResponse unmarshall(DescribeActiveOperationTaskResponse describeActiveOperationTaskResponse, UnmarshallerContext _ctx) {
		
		describeActiveOperationTaskResponse.setRequestId(_ctx.stringValue("DescribeActiveOperationTaskResponse.RequestId"));
		describeActiveOperationTaskResponse.setTotalRecordCount(_ctx.integerValue("DescribeActiveOperationTaskResponse.TotalRecordCount"));
		describeActiveOperationTaskResponse.setPageSize(_ctx.integerValue("DescribeActiveOperationTaskResponse.PageSize"));
		describeActiveOperationTaskResponse.setPageNumber(_ctx.integerValue("DescribeActiveOperationTaskResponse.PageNumber"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeActiveOperationTaskResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setStatus(_ctx.integerValue("DescribeActiveOperationTaskResponse.Items["+ i +"].Status"));
			itemsItem.setTaskParams(_ctx.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].TaskParams"));
			itemsItem.setPrepareInterval(_ctx.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].PrepareInterval"));
			itemsItem.setDeadline(_ctx.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].Deadline"));
			itemsItem.setStartTime(_ctx.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].StartTime"));
			itemsItem.setTaskType(_ctx.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].TaskType"));
			itemsItem.setModifiedTime(_ctx.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].ModifiedTime"));
			itemsItem.setInsName(_ctx.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].InsName"));
			itemsItem.setDbType(_ctx.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].DbType"));
			itemsItem.setRegion(_ctx.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].Region"));
			itemsItem.setResultInfo(_ctx.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].ResultInfo"));
			itemsItem.setCreatedTime(_ctx.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].CreatedTime"));
			itemsItem.setId(_ctx.integerValue("DescribeActiveOperationTaskResponse.Items["+ i +"].Id"));
			itemsItem.setSwitchTime(_ctx.stringValue("DescribeActiveOperationTaskResponse.Items["+ i +"].SwitchTime"));

			items.add(itemsItem);
		}
		describeActiveOperationTaskResponse.setItems(items);
	 
	 	return describeActiveOperationTaskResponse;
	}
}