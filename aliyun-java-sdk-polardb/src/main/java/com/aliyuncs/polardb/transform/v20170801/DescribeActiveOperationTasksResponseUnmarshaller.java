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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeActiveOperationTasksResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeActiveOperationTasksResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActiveOperationTasksResponseUnmarshaller {

	public static DescribeActiveOperationTasksResponse unmarshall(DescribeActiveOperationTasksResponse describeActiveOperationTasksResponse, UnmarshallerContext _ctx) {
		
		describeActiveOperationTasksResponse.setRequestId(_ctx.stringValue("DescribeActiveOperationTasksResponse.RequestId"));
		describeActiveOperationTasksResponse.setTotalRecordCount(_ctx.integerValue("DescribeActiveOperationTasksResponse.TotalRecordCount"));
		describeActiveOperationTasksResponse.setPageSize(_ctx.integerValue("DescribeActiveOperationTasksResponse.PageSize"));
		describeActiveOperationTasksResponse.setPageNumber(_ctx.integerValue("DescribeActiveOperationTasksResponse.PageNumber"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeActiveOperationTasksResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setStatus(_ctx.integerValue("DescribeActiveOperationTasksResponse.Items["+ i +"].Status"));
			itemsItem.setPrepareInterval(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].PrepareInterval"));
			itemsItem.setDeadline(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].Deadline"));
			itemsItem.setDBType(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].DBType"));
			itemsItem.setTaskType(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].TaskType"));
			itemsItem.setStartTime(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].StartTime"));
			itemsItem.setDBVersion(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].DBVersion"));
			itemsItem.setModifiedTime(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].ModifiedTime"));
			itemsItem.setDBClusterId(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].DBClusterId"));
			itemsItem.setRegion(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].Region"));
			itemsItem.setResultInfo(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].ResultInfo"));
			itemsItem.setCreatedTime(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].CreatedTime"));
			itemsItem.setTaskId(_ctx.integerValue("DescribeActiveOperationTasksResponse.Items["+ i +"].TaskId"));
			itemsItem.setSwitchTime(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].SwitchTime"));
			itemsItem.setCurrentAVZ(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].CurrentAVZ"));
			itemsItem.setInsComment(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].InsComment"));
			itemsItem.setTaskTypeZh(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].TaskTypeZh"));
			itemsItem.setTaskTypeEn(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].TaskTypeEn"));
			itemsItem.setChangeLevel(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].ChangeLevel"));
			itemsItem.setChangeLevelZh(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].ChangeLevelZh"));
			itemsItem.setChangeLevelEn(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].ChangeLevelEn"));
			itemsItem.setImpactZh(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].ImpactZh"));
			itemsItem.setImpactEn(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].ImpactEn"));
			itemsItem.setAllowChange(_ctx.longValue("DescribeActiveOperationTasksResponse.Items["+ i +"].AllowChange"));
			itemsItem.setAllowCancel(_ctx.longValue("DescribeActiveOperationTasksResponse.Items["+ i +"].AllowCancel"));
			itemsItem.setImpact(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].Impact"));
			itemsItem.setTaskParams(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].TaskParams"));

			List<String> dBNodeIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeActiveOperationTasksResponse.Items["+ i +"].DBNodeIds.Length"); j++) {
				dBNodeIds.add(_ctx.stringValue("DescribeActiveOperationTasksResponse.Items["+ i +"].DBNodeIds["+ j +"]"));
			}
			itemsItem.setDBNodeIds(dBNodeIds);

			items.add(itemsItem);
		}
		describeActiveOperationTasksResponse.setItems(items);
	 
	 	return describeActiveOperationTasksResponse;
	}
}