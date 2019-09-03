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

import com.aliyuncs.rds.model.v20140815.DescribeTaskInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTaskInfoResponseUnmarshaller {

	public static DescribeTaskInfoResponse unmarshall(DescribeTaskInfoResponse describeTaskInfoResponse, UnmarshallerContext _ctx) {
		
		describeTaskInfoResponse.setRequestId(_ctx.stringValue("DescribeTaskInfoResponse.RequestId"));
		describeTaskInfoResponse.setTaskId(_ctx.stringValue("DescribeTaskInfoResponse.TaskId"));
		describeTaskInfoResponse.setBeginTime(_ctx.stringValue("DescribeTaskInfoResponse.BeginTime"));
		describeTaskInfoResponse.setFinishTime(_ctx.stringValue("DescribeTaskInfoResponse.FinishTime"));
		describeTaskInfoResponse.setCreateTime(_ctx.stringValue("DescribeTaskInfoResponse.CreateTime"));
		describeTaskInfoResponse.setTaskAction(_ctx.stringValue("DescribeTaskInfoResponse.TaskAction"));
		describeTaskInfoResponse.setDBName(_ctx.stringValue("DescribeTaskInfoResponse.DBName"));
		describeTaskInfoResponse.setTaskErrorCode(_ctx.stringValue("DescribeTaskInfoResponse.TaskErrorCode"));
		describeTaskInfoResponse.setProgress(_ctx.stringValue("DescribeTaskInfoResponse.Progress"));
		describeTaskInfoResponse.setExpectedFinishTime(_ctx.stringValue("DescribeTaskInfoResponse.ExpectedFinishTime"));
		describeTaskInfoResponse.setTaskErrorMessage(_ctx.stringValue("DescribeTaskInfoResponse.TaskErrorMessage"));
		describeTaskInfoResponse.setProgressInfo(_ctx.stringValue("DescribeTaskInfoResponse.ProgressInfo"));
		describeTaskInfoResponse.setStatus(_ctx.stringValue("DescribeTaskInfoResponse.Status"));
	 
	 	return describeTaskInfoResponse;
	}
}