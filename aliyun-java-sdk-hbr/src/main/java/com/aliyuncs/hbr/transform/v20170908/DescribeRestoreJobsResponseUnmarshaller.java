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

import com.aliyuncs.hbr.model.v20170908.DescribeRestoreJobsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeRestoreJobsResponse.RestoreJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoreJobsResponseUnmarshaller {

	public static DescribeRestoreJobsResponse unmarshall(DescribeRestoreJobsResponse describeRestoreJobsResponse, UnmarshallerContext _ctx) {
		
		describeRestoreJobsResponse.setRequestId(_ctx.stringValue("DescribeRestoreJobsResponse.RequestId"));
		describeRestoreJobsResponse.setSuccess(_ctx.booleanValue("DescribeRestoreJobsResponse.Success"));
		describeRestoreJobsResponse.setCode(_ctx.stringValue("DescribeRestoreJobsResponse.Code"));
		describeRestoreJobsResponse.setMessage(_ctx.stringValue("DescribeRestoreJobsResponse.Message"));
		describeRestoreJobsResponse.setTotalCount(_ctx.integerValue("DescribeRestoreJobsResponse.TotalCount"));
		describeRestoreJobsResponse.setPageSize(_ctx.integerValue("DescribeRestoreJobsResponse.PageSize"));
		describeRestoreJobsResponse.setPageNumber(_ctx.integerValue("DescribeRestoreJobsResponse.PageNumber"));

		List<RestoreJob> restoreJobs = new ArrayList<RestoreJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreJobsResponse.RestoreJobs.Length"); i++) {
			RestoreJob restoreJob = new RestoreJob();
			restoreJob.setCreatedTime(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].CreatedTime"));
			restoreJob.setUpdatedTime(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].UpdatedTime"));
			restoreJob.setRestoreId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].RestoreId"));
			restoreJob.setClientId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ClientId"));
			restoreJob.setVaultId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].VaultId"));
			restoreJob.setSnapshotId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].SnapshotId"));
			restoreJob.setSnapshotHash(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].SnapshotHash"));
			restoreJob.setRestoreName(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].RestoreName"));
			restoreJob.setSource(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Source"));
			restoreJob.setTarget(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Target"));
			restoreJob.setStatus(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Status"));
			restoreJob.setRestoreType(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].RestoreType"));
			restoreJob.setInstanceId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].InstanceId"));
			restoreJob.setExtra(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Extra"));
			restoreJob.setSpeed(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Speed"));
			restoreJob.setDuration(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Duration"));
			restoreJob.setCompleteTime(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].CompleteTime"));
			restoreJob.setErrorCount(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ErrorCount"));
			restoreJob.setBytesDone(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].BytesDone"));
			restoreJob.setBytesTotal(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].BytesTotal"));
			restoreJob.setItemsDone(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ItemsDone"));
			restoreJob.setItemsTotal(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ItemsTotal"));
			restoreJob.setActualBytes(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ActualBytes"));
			restoreJob.setPercentage(_ctx.integerValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Percentage"));
			restoreJob.setExitCode(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ExitCode"));
			restoreJob.setInstanceName(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].InstanceName"));
			restoreJob.setErrorType(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ErrorType"));
			restoreJob.setSourceClientId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].SourceClientId"));
			restoreJob.setGatewayId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].GatewayId"));
			restoreJob.setGatewayName(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].GatewayName"));
			restoreJob.setErrorMessage(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ErrorMessage"));
			restoreJob.setErrorFile(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ErrorFile"));

			restoreJobs.add(restoreJob);
		}
		describeRestoreJobsResponse.setRestoreJobs(restoreJobs);
	 
	 	return describeRestoreJobsResponse;
	}
}