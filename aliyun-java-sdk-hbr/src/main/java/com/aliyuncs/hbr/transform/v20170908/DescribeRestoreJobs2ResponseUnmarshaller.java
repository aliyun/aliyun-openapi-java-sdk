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

import com.aliyuncs.hbr.model.v20170908.DescribeRestoreJobs2Response;
import com.aliyuncs.hbr.model.v20170908.DescribeRestoreJobs2Response.RestoreJob;
import com.aliyuncs.hbr.model.v20170908.DescribeRestoreJobs2Response.RestoreJob.OtsDetail;
import com.aliyuncs.hbr.model.v20170908.DescribeRestoreJobs2Response.RestoreJob.Report;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoreJobs2ResponseUnmarshaller {

	public static DescribeRestoreJobs2Response unmarshall(DescribeRestoreJobs2Response describeRestoreJobs2Response, UnmarshallerContext _ctx) {
		
		describeRestoreJobs2Response.setRequestId(_ctx.stringValue("DescribeRestoreJobs2Response.RequestId"));
		describeRestoreJobs2Response.setSuccess(_ctx.booleanValue("DescribeRestoreJobs2Response.Success"));
		describeRestoreJobs2Response.setCode(_ctx.stringValue("DescribeRestoreJobs2Response.Code"));
		describeRestoreJobs2Response.setMessage(_ctx.stringValue("DescribeRestoreJobs2Response.Message"));
		describeRestoreJobs2Response.setPageNumber(_ctx.integerValue("DescribeRestoreJobs2Response.PageNumber"));
		describeRestoreJobs2Response.setPageSize(_ctx.integerValue("DescribeRestoreJobs2Response.PageSize"));
		describeRestoreJobs2Response.setTotalCount(_ctx.integerValue("DescribeRestoreJobs2Response.TotalCount"));

		List<RestoreJob> restoreJobs = new ArrayList<RestoreJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreJobs2Response.RestoreJobs.Length"); i++) {
			RestoreJob restoreJob = new RestoreJob();
			restoreJob.setSnapshotHash(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].SnapshotHash"));
			restoreJob.setStatus(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].Status"));
			restoreJob.setErrorMessage(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].ErrorMessage"));
			restoreJob.setActualItems(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].ActualItems"));
			restoreJob.setVaultId(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].VaultId"));
			restoreJob.setActualBytes(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].ActualBytes"));
			restoreJob.setUdmDetail(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].UdmDetail"));
			restoreJob.setSourceType(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].SourceType"));
			restoreJob.setOptions(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].Options"));
			restoreJob.setTargetInstanceId(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetInstanceId"));
			restoreJob.setRestoreType(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].RestoreType"));
			restoreJob.setTargetCreateTime(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetCreateTime"));
			restoreJob.setItemsDone(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].ItemsDone"));
			restoreJob.setBytesTotal(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].BytesTotal"));
			restoreJob.setExclude(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].Exclude"));
			restoreJob.setParentId(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].ParentId"));
			restoreJob.setCompleteTime(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].CompleteTime"));
			restoreJob.setCreatedTime(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].CreatedTime"));
			restoreJob.setTargetBucket(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetBucket"));
			restoreJob.setClusterId(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].ClusterId"));
			restoreJob.setTargetFileSystemId(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetFileSystemId"));
			restoreJob.setProgress(_ctx.integerValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].Progress"));
			restoreJob.setExpireTime(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].ExpireTime"));
			restoreJob.setTargetDataSourceId(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetDataSourceId"));
			restoreJob.setTargetPrefix(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetPrefix"));
			restoreJob.setTargetPath(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetPath"));
			restoreJob.setErrorFile(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].ErrorFile"));
			restoreJob.setStartTime(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].StartTime"));
			restoreJob.setUpdatedTime(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].UpdatedTime"));
			restoreJob.setSnapshotId(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].SnapshotId"));
			restoreJob.setRestoreId(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].RestoreId"));
			restoreJob.setTargetClientId(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetClientId"));
			restoreJob.setItemsTotal(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].ItemsTotal"));
			restoreJob.setInclude(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].Include"));
			restoreJob.setBytesDone(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].BytesDone"));
			restoreJob.setTargetInstanceName(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetInstanceName"));
			restoreJob.setTargetTableName(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetTableName"));
			restoreJob.setSpeed(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].Speed"));
			restoreJob.setTargetTime(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetTime"));
			restoreJob.setCrossAccountType(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].CrossAccountType"));
			restoreJob.setCrossAccountUserId(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].CrossAccountUserId"));
			restoreJob.setCrossAccountRoleName(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].CrossAccountRoleName"));

			OtsDetail otsDetail = new OtsDetail();
			otsDetail.setBatchChannelCount(_ctx.integerValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].OtsDetail.BatchChannelCount"));
			otsDetail.setOverwriteExisting(_ctx.booleanValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].OtsDetail.OverwriteExisting"));
			restoreJob.setOtsDetail(otsDetail);

			Report report = new Report();
			report.setTotalFiles(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].Report.TotalFiles"));
			report.setSuccessFiles(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].Report.SuccessFiles"));
			report.setFailedFiles(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].Report.FailedFiles"));
			report.setSkippedFiles(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].Report.SkippedFiles"));
			report.setReportTaskStatus(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].Report.ReportTaskStatus"));
			restoreJob.setReport(report);

			restoreJobs.add(restoreJob);
		}
		describeRestoreJobs2Response.setRestoreJobs(restoreJobs);
	 
	 	return describeRestoreJobs2Response;
	}
}