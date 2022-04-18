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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeDataMaskingTasksResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeDataMaskingTasksResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataMaskingTasksResponseUnmarshaller {

	public static DescribeDataMaskingTasksResponse unmarshall(DescribeDataMaskingTasksResponse describeDataMaskingTasksResponse, UnmarshallerContext _ctx) {
		
		describeDataMaskingTasksResponse.setRequestId(_ctx.stringValue("DescribeDataMaskingTasksResponse.RequestId"));
		describeDataMaskingTasksResponse.setCurrentPage(_ctx.integerValue("DescribeDataMaskingTasksResponse.CurrentPage"));
		describeDataMaskingTasksResponse.setPageSize(_ctx.integerValue("DescribeDataMaskingTasksResponse.PageSize"));
		describeDataMaskingTasksResponse.setTotalCount(_ctx.integerValue("DescribeDataMaskingTasksResponse.TotalCount"));

		List<Task> items = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataMaskingTasksResponse.Items.Length"); i++) {
			Task task = new Task();
			task.setStatus(_ctx.integerValue("DescribeDataMaskingTasksResponse.Items["+ i +"].Status"));
			task.setOwner(_ctx.stringValue("DescribeDataMaskingTasksResponse.Items["+ i +"].Owner"));
			task.setTaskName(_ctx.stringValue("DescribeDataMaskingTasksResponse.Items["+ i +"].TaskName"));
			task.setSrcType(_ctx.integerValue("DescribeDataMaskingTasksResponse.Items["+ i +"].SrcType"));
			task.setDstType(_ctx.integerValue("DescribeDataMaskingTasksResponse.Items["+ i +"].DstType"));
			task.setHasUnfinishProcess(_ctx.booleanValue("DescribeDataMaskingTasksResponse.Items["+ i +"].HasUnfinishProcess"));
			task.setOriginalTable(_ctx.booleanValue("DescribeDataMaskingTasksResponse.Items["+ i +"].OriginalTable"));
			task.setTriggerType(_ctx.integerValue("DescribeDataMaskingTasksResponse.Items["+ i +"].TriggerType"));
			task.setDstTypeCode(_ctx.stringValue("DescribeDataMaskingTasksResponse.Items["+ i +"].DstTypeCode"));
			task.setRunCount(_ctx.integerValue("DescribeDataMaskingTasksResponse.Items["+ i +"].RunCount"));
			task.setGmtCreate(_ctx.longValue("DescribeDataMaskingTasksResponse.Items["+ i +"].GmtCreate"));
			task.setTaskId(_ctx.stringValue("DescribeDataMaskingTasksResponse.Items["+ i +"].TaskId"));
			task.setDstPath(_ctx.stringValue("DescribeDataMaskingTasksResponse.Items["+ i +"].DstPath"));
			task.setSrcTypeCode(_ctx.stringValue("DescribeDataMaskingTasksResponse.Items["+ i +"].SrcTypeCode"));
			task.setId(_ctx.longValue("DescribeDataMaskingTasksResponse.Items["+ i +"].Id"));
			task.setSrcPath(_ctx.stringValue("DescribeDataMaskingTasksResponse.Items["+ i +"].SrcPath"));

			items.add(task);
		}
		describeDataMaskingTasksResponse.setItems(items);
	 
	 	return describeDataMaskingTasksResponse;
	}
}