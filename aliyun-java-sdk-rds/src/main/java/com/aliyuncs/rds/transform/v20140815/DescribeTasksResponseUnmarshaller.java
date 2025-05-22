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

import com.aliyuncs.rds.model.v20140815.DescribeTasksResponse;
import com.aliyuncs.rds.model.v20140815.DescribeTasksResponse.TaskProgressInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTasksResponseUnmarshaller {

	public static DescribeTasksResponse unmarshall(DescribeTasksResponse describeTasksResponse, UnmarshallerContext _ctx) {
		
		describeTasksResponse.setRequestId(_ctx.stringValue("DescribeTasksResponse.RequestId"));
		describeTasksResponse.setPageNumber(_ctx.integerValue("DescribeTasksResponse.PageNumber"));
		describeTasksResponse.setPageRecordCount(_ctx.integerValue("DescribeTasksResponse.PageRecordCount"));
		describeTasksResponse.setTotalRecordCount(_ctx.integerValue("DescribeTasksResponse.TotalRecordCount"));

		List<TaskProgressInfo> items = new ArrayList<TaskProgressInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTasksResponse.Items.Length"); i++) {
			TaskProgressInfo taskProgressInfo = new TaskProgressInfo();
			taskProgressInfo.setBeginTime(_ctx.stringValue("DescribeTasksResponse.Items["+ i +"].BeginTime"));
			taskProgressInfo.setCurrentStepName(_ctx.stringValue("DescribeTasksResponse.Items["+ i +"].CurrentStepName"));
			taskProgressInfo.setDBName(_ctx.stringValue("DescribeTasksResponse.Items["+ i +"].DBName"));
			taskProgressInfo.setExpectedFinishTime(_ctx.stringValue("DescribeTasksResponse.Items["+ i +"].ExpectedFinishTime"));
			taskProgressInfo.setFinishTime(_ctx.stringValue("DescribeTasksResponse.Items["+ i +"].FinishTime"));
			taskProgressInfo.setProgress(_ctx.stringValue("DescribeTasksResponse.Items["+ i +"].Progress"));
			taskProgressInfo.setProgressInfo(_ctx.stringValue("DescribeTasksResponse.Items["+ i +"].ProgressInfo"));
			taskProgressInfo.setRemain(_ctx.integerValue("DescribeTasksResponse.Items["+ i +"].Remain"));
			taskProgressInfo.setStatus(_ctx.stringValue("DescribeTasksResponse.Items["+ i +"].Status"));
			taskProgressInfo.setStepProgressInfo(_ctx.stringValue("DescribeTasksResponse.Items["+ i +"].StepProgressInfo"));
			taskProgressInfo.setStepsInfo(_ctx.stringValue("DescribeTasksResponse.Items["+ i +"].StepsInfo"));
			taskProgressInfo.setTaskAction(_ctx.stringValue("DescribeTasksResponse.Items["+ i +"].TaskAction"));
			taskProgressInfo.setTaskErrorCode(_ctx.stringValue("DescribeTasksResponse.Items["+ i +"].TaskErrorCode"));
			taskProgressInfo.setTaskErrorMessage(_ctx.stringValue("DescribeTasksResponse.Items["+ i +"].TaskErrorMessage"));
			taskProgressInfo.setTaskId(_ctx.stringValue("DescribeTasksResponse.Items["+ i +"].TaskId"));

			items.add(taskProgressInfo);
		}
		describeTasksResponse.setItems(items);
	 
	 	return describeTasksResponse;
	}
}