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
		pageInfo.setCount(_ctx.integerValue("DescribeRestoreJobsResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeRestoreJobsResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeRestoreJobsResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeRestoreJobsResponse.PageInfo.CurrentPage"));
		describeRestoreJobsResponse.setPageInfo(pageInfo);

		List<RestoreJob> restoreJobs = new ArrayList<RestoreJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreJobsResponse.RestoreJobs.Length"); i++) {
			RestoreJob restoreJob = new RestoreJob();
			restoreJob.setId(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Id"));
			restoreJob.setCreatedTime(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].CreatedTime"));
			restoreJob.setUpdatedTime(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].UpdatedTime"));
			restoreJob.setUuid(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Uuid"));
			restoreJob.setMessage(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Message"));
			restoreJob.setRestoreId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].RestoreId"));
			restoreJob.setClientId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ClientId"));
			restoreJob.setVaultId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].VaultId"));
			restoreJob.setSnapshotId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].SnapshotId"));
			restoreJob.setSnapshotHash(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].SnapshotHash"));
			restoreJob.setSource(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Source"));
			restoreJob.setTarget(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Target"));
			restoreJob.setStatus(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Status"));
			restoreJob.setRestoreType(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].RestoreType"));
			restoreJob.setSpeed(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Speed"));
			restoreJob.setCompleteTime(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].CompleteTime"));
			restoreJob.setEta(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Eta"));
			restoreJob.setErrorCount(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ErrorCount"));
			restoreJob.setBytesDone(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].BytesDone"));
			restoreJob.setBytesTotal(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].BytesTotal"));
			restoreJob.setItemsDone(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ItemsDone"));
			restoreJob.setItemsTotal(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ItemsTotal"));
			restoreJob.setActualBytes(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ActualBytes"));
			restoreJob.setPercentage(_ctx.integerValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Percentage"));
			restoreJob.setErrorType(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ErrorType"));
			restoreJob.setSourceClientId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].SourceClientId"));
			restoreJob.setSnapshotVersion(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].SnapshotVersion"));
			restoreJob.setInstanceName(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].InstanceName"));
			restoreJob.setInternetIp(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].InternetIp"));
			restoreJob.setIntranetIp(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].IntranetIp"));
			restoreJob.setErrorFile(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ErrorFile"));
			restoreJob.setErrorFileUrl(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ErrorFileUrl"));
			restoreJob.setRequestId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].RequestId"));
			restoreJob.setRestoreName(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].RestoreName"));
			restoreJob.setInstanceId(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].InstanceId"));
			restoreJob.setExtra(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Extra"));
			restoreJob.setDuration(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Duration"));
			restoreJob.setExitCode(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ExitCode"));
			restoreJob.setErrorFile1(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].ErrorFile"));
			restoreJob.setGmtCreate(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].GmtCreate"));
			restoreJob.setGmtModified(_ctx.longValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].GmtModified"));
			restoreJob.setExcludes(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Excludes"));
			restoreJob.setIncludes(_ctx.stringValue("DescribeRestoreJobsResponse.RestoreJobs["+ i +"].Includes"));

			restoreJobs.add(restoreJob);
		}
		describeRestoreJobsResponse.setRestoreJobs(restoreJobs);
	 
	 	return describeRestoreJobsResponse;
	}
}