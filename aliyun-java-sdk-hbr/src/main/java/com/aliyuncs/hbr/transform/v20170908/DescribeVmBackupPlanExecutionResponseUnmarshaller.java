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

import com.aliyuncs.hbr.model.v20170908.DescribeVmBackupPlanExecutionResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeVmBackupPlanExecutionResponse.VmBackupExecution;
import com.aliyuncs.hbr.model.v20170908.DescribeVmBackupPlanExecutionResponse.VmBackupExecution.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVmBackupPlanExecutionResponseUnmarshaller {

	public static DescribeVmBackupPlanExecutionResponse unmarshall(DescribeVmBackupPlanExecutionResponse describeVmBackupPlanExecutionResponse, UnmarshallerContext _ctx) {
		
		describeVmBackupPlanExecutionResponse.setRequestId(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.RequestId"));
		describeVmBackupPlanExecutionResponse.setSuccess(_ctx.booleanValue("DescribeVmBackupPlanExecutionResponse.Success"));
		describeVmBackupPlanExecutionResponse.setCode(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.Code"));
		describeVmBackupPlanExecutionResponse.setMessage(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.Message"));
		describeVmBackupPlanExecutionResponse.setTotalCount(_ctx.integerValue("DescribeVmBackupPlanExecutionResponse.TotalCount"));
		describeVmBackupPlanExecutionResponse.setPageNumber(_ctx.integerValue("DescribeVmBackupPlanExecutionResponse.PageNumber"));
		describeVmBackupPlanExecutionResponse.setPageSize(_ctx.integerValue("DescribeVmBackupPlanExecutionResponse.PageSize"));

		List<VmBackupExecution> vmBackupExecutions = new ArrayList<VmBackupExecution>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions.Length"); i++) {
			VmBackupExecution vmBackupExecution = new VmBackupExecution();
			vmBackupExecution.setVmId(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].VmId"));
			vmBackupExecution.setVCenterId(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].VCenterId"));
			vmBackupExecution.setBackupPlanId(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].BackupPlanId"));
			vmBackupExecution.setClientId(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].ClientId"));
			vmBackupExecution.setHasError(_ctx.booleanValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].HasError"));
			vmBackupExecution.setErrorMessage(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].ErrorMessage"));
			vmBackupExecution.setSnapshotId(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].SnapshotId"));
			vmBackupExecution.setVmName(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].VmName"));

			Snapshot snapshot = new Snapshot();
			snapshot.setSnapshotId(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.SnapshotId"));
			snapshot.setClientId(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.ClientId"));
			snapshot.setVaultId(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.VaultId"));
			snapshot.setJobId(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.JobId"));
			snapshot.setSnapshotHash(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.SnapshotHash"));
			snapshot.setSnapshotName(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.SnapshotName"));
			snapshot.setSourceType(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.SourceType"));
			snapshot.setSource(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.Source"));
			snapshot.setParentHash(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.ParentHash"));
			snapshot.setStatus(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.Status"));
			snapshot.setRetention(_ctx.longValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.Retention"));
			snapshot.setSnapshotOption(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.SnapshotOption"));
			snapshot.setContainerSnapshotId(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.ContainerSnapshotId"));
			snapshot.setServerId(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.ServerId"));
			snapshot.setPlanId(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.PlanId"));
			snapshot.setSnapshotType(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.SnapshotType"));
			snapshot.setExtra(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.Extra"));
			snapshot.setErrorType(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.ErrorType"));
			snapshot.setSize(_ctx.longValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.Size"));
			snapshot.setCreatedTime(_ctx.longValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.CreatedTime"));
			snapshot.setUpdatedTime(_ctx.longValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.UpdatedTime"));
			snapshot.setDuration(_ctx.longValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.Duration"));
			snapshot.setCompleteTime(_ctx.longValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.CompleteTime"));
			snapshot.setErrorCount(_ctx.longValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.ErrorCount"));
			snapshot.setBytesTotal(_ctx.longValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.BytesTotal"));
			snapshot.setBytesDone(_ctx.longValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.BytesDone"));
			snapshot.setItemsTotal(_ctx.longValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.ItemsTotal"));
			snapshot.setItemsDone(_ctx.longValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.ItemsDone"));
			snapshot.setActualBytes(_ctx.longValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.ActualBytes"));
			snapshot.setPercentage(_ctx.integerValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.Percentage"));
			snapshot.setExitCode(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.ExitCode"));
			snapshot.setErrorMessage(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.ErrorMessage"));
			snapshot.setErrorFile(_ctx.stringValue("DescribeVmBackupPlanExecutionResponse.VmBackupExecutions["+ i +"].Snapshot.ErrorFile"));
			vmBackupExecution.setSnapshot(snapshot);

			vmBackupExecutions.add(vmBackupExecution);
		}
		describeVmBackupPlanExecutionResponse.setVmBackupExecutions(vmBackupExecutions);
	 
	 	return describeVmBackupPlanExecutionResponse;
	}
}