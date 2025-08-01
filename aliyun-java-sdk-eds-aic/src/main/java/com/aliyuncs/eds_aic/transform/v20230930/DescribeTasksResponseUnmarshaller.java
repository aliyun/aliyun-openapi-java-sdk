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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.DescribeTasksResponse;
import com.aliyuncs.eds_aic.model.v20230930.DescribeTasksResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTasksResponseUnmarshaller {

	public static DescribeTasksResponse unmarshall(DescribeTasksResponse describeTasksResponse, UnmarshallerContext _ctx) {
		
		describeTasksResponse.setRequestId(_ctx.stringValue("DescribeTasksResponse.RequestId"));
		describeTasksResponse.setNextToken(_ctx.stringValue("DescribeTasksResponse.NextToken"));
		describeTasksResponse.setTotalCount(_ctx.integerValue("DescribeTasksResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTasksResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTaskId(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].TaskId"));
			dataItem.setInvokeId(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].InvokeId"));
			dataItem.setRegionId(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].RegionId"));
			dataItem.setResourceId(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].ResourceId"));
			dataItem.setTaskType(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].TaskType"));
			dataItem.setTaskStatus(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].TaskStatus"));
			dataItem.setStartTime(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].StartTime"));
			dataItem.setFinishTime(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].FinishTime"));
			dataItem.setParam(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].Param"));
			dataItem.setResult(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].Result"));
			dataItem.setErrorCode(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].ErrorCode"));
			dataItem.setErrorMsg(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].ErrorMsg"));
			dataItem.setLevel(_ctx.integerValue("DescribeTasksResponse.Data["+ i +"].Level"));
			dataItem.setFailedChildCount(_ctx.integerValue("DescribeTasksResponse.Data["+ i +"].FailedChildCount"));
			dataItem.setSuccessChildCount(_ctx.integerValue("DescribeTasksResponse.Data["+ i +"].SuccessChildCount"));
			dataItem.setRunningChildCount(_ctx.integerValue("DescribeTasksResponse.Data["+ i +"].RunningChildCount"));
			dataItem.setTotalChildCount(_ctx.integerValue("DescribeTasksResponse.Data["+ i +"].TotalChildCount"));
			dataItem.setInstanceId(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].InstanceId"));
			dataItem.setInstanceName(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].InstanceName"));
			dataItem.setInstanceStatus(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].InstanceStatus"));
			dataItem.setOperator(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].Operator"));
			dataItem.setParentTaskId(_ctx.stringValue("DescribeTasksResponse.Data["+ i +"].ParentTaskId"));

			data.add(dataItem);
		}
		describeTasksResponse.setData(data);
	 
	 	return describeTasksResponse;
	}
}