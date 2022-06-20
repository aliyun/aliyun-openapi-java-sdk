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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeRestoreJobsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeRestoreJobsResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeRestoreJobsResponse.RestoreJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoreJobsResponseUnmarshaller {

	public static DescribeRestoreJobsResponse unmarshall(DescribeRestoreJobsResponse describeRestoreJobsResponse, UnmarshallerContext _ctx) {
		
		describeRestoreJobsResponse.setRequestId(_ctx.stringValue("DescribeRestoreJobsResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeRestoreJobsResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeRestoreJobsResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeRestoreJobsResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeRestoreJobsResponse.PageInfo.Count"));
		describeRestoreJobsResponse.setPageInfo(pageInfo);

		List<RestoreJob> restoreJobs = new ArrayList<RestoreJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreJobsResponse.RestoreJobs.Length"); i++) {
			RestoreJob restoreJob = new RestoreJob();
			restoreJob.setStatus(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Status"));
			restoreJob.setSnapshotHash(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].SnapshotHash"));
			restoreJob.setSourceClientId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].SourceClientId"));
			restoreJob.setErrorFileUrl(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ErrorFileUrl"));
			restoreJob.setIncludes(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Includes"));
			restoreJob.setRestoreName(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].RestoreName"));
			restoreJob.setInternetIp(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].InternetIp"));
			restoreJob.setVaultId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].VaultId"));
			restoreJob.setActualBytes(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ActualBytes"));
			restoreJob.setMessage(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Message"));
			restoreJob.setPercentage(_ctx.integerValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Percentage"));
			restoreJob.setGmtModified(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].GmtModified"));
			restoreJob.setRestoreType(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].RestoreType"));
			restoreJob.setExitCode(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ExitCode"));
			restoreJob.setClientId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ClientId"));
			restoreJob.setItemsDone(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ItemsDone"));
			restoreJob.setBytesTotal(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].BytesTotal"));
			restoreJob.setRequestId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].RequestId"));
			restoreJob.setInstanceName(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].InstanceName"));
			restoreJob.setCompleteTime(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].CompleteTime"));
			restoreJob.setErrorType(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ErrorType"));
			restoreJob.setSnapshotVersion(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].SnapshotVersion"));
			restoreJob.setTarget(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Target"));
			restoreJob.setCreatedTime(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].CreatedTime"));
			restoreJob.setInstanceId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].InstanceId"));
			restoreJob.setSource(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Source"));
			restoreJob.setIntranetIp(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].IntranetIp"));
			restoreJob.setErrorFile(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ErrorFile"));
			restoreJob.setUuid(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Uuid"));
			restoreJob.setExcludes(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Excludes"));
			restoreJob.setSpeed(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Speed"));
			restoreJob.setSnapshotId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].SnapshotId"));
			restoreJob.setUpdatedTime(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].UpdatedTime"));
			restoreJob.setRestoreId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].RestoreId"));
			restoreJob.setGmtCreate(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].GmtCreate"));
			restoreJob.setEta(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Eta"));
			restoreJob.setDuration(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Duration"));
			restoreJob.setErrorCount(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ErrorCount"));
			restoreJob.setItemsTotal(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ItemsTotal"));
			restoreJob.setBytesDone(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].BytesDone"));

			restoreJobs.add(restoreJob);
		}
		describeRestoreJobsResponse.setRestoreJobs(restoreJobs);
	 
	 	return describeRestoreJobsResponse;
	}
}