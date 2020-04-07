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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeVmBackupPlanExecutionsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeVmBackupPlanExecutionsResponse.Execution;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVmBackupPlanExecutionsResponseUnmarshaller {

	public static DescribeVmBackupPlanExecutionsResponse unmarshall(DescribeVmBackupPlanExecutionsResponse describeVmBackupPlanExecutionsResponse, UnmarshallerContext _ctx) {
		
		describeVmBackupPlanExecutionsResponse.setRequestId(_ctx.stringValue("DescribeVmBackupPlanExecutionsResponse.RequestId"));
		describeVmBackupPlanExecutionsResponse.setSuccess(_ctx.booleanValue("DescribeVmBackupPlanExecutionsResponse.Success"));
		describeVmBackupPlanExecutionsResponse.setCode(_ctx.stringValue("DescribeVmBackupPlanExecutionsResponse.Code"));
		describeVmBackupPlanExecutionsResponse.setMessage(_ctx.stringValue("DescribeVmBackupPlanExecutionsResponse.Message"));
		describeVmBackupPlanExecutionsResponse.setTotalCount(_ctx.integerValue("DescribeVmBackupPlanExecutionsResponse.TotalCount"));
		describeVmBackupPlanExecutionsResponse.setPageNumber(_ctx.integerValue("DescribeVmBackupPlanExecutionsResponse.PageNumber"));
		describeVmBackupPlanExecutionsResponse.setPageSize(_ctx.integerValue("DescribeVmBackupPlanExecutionsResponse.PageSize"));

		List<Execution> executions = new ArrayList<Execution>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVmBackupPlanExecutionsResponse.Executions.Length"); i++) {
			Execution execution = new Execution();
			execution.setExecutionId(_ctx.stringValue("DescribeVmBackupPlanExecutionsResponse.Executions["+ i +"].ExecutionId"));
			execution.setVmBackupPlanId(_ctx.stringValue("DescribeVmBackupPlanExecutionsResponse.Executions["+ i +"].VmBackupPlanId"));
			execution.setBackupType(_ctx.stringValue("DescribeVmBackupPlanExecutionsResponse.Executions["+ i +"].BackupType"));
			execution.setStatus(_ctx.stringValue("DescribeVmBackupPlanExecutionsResponse.Executions["+ i +"].Status"));
			execution.setErrorMessage(_ctx.stringValue("DescribeVmBackupPlanExecutionsResponse.Executions["+ i +"].ErrorMessage"));
			execution.setDetail(_ctx.stringValue("DescribeVmBackupPlanExecutionsResponse.Executions["+ i +"].Detail"));
			execution.setCreatedTime(_ctx.longValue("DescribeVmBackupPlanExecutionsResponse.Executions["+ i +"].CreatedTime"));
			execution.setUpdatedTime(_ctx.longValue("DescribeVmBackupPlanExecutionsResponse.Executions["+ i +"].UpdatedTime"));
			execution.setVmBackupPlanName(_ctx.stringValue("DescribeVmBackupPlanExecutionsResponse.Executions["+ i +"].VmBackupPlanName"));
			execution.setBackupPlanExisted(_ctx.booleanValue("DescribeVmBackupPlanExecutionsResponse.Executions["+ i +"].BackupPlanExisted"));

			executions.add(execution);
		}
		describeVmBackupPlanExecutionsResponse.setExecutions(executions);
	 
	 	return describeVmBackupPlanExecutionsResponse;
	}
}