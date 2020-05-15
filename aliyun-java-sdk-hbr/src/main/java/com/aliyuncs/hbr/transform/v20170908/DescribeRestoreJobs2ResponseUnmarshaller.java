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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoreJobs2ResponseUnmarshaller {

	public static DescribeRestoreJobs2Response unmarshall(DescribeRestoreJobs2Response describeRestoreJobs2Response, UnmarshallerContext _ctx) {
		
		describeRestoreJobs2Response.setRequestId(_ctx.stringValue("DescribeRestoreJobs2Response.RequestId"));
		describeRestoreJobs2Response.setSuccess(_ctx.booleanValue("DescribeRestoreJobs2Response.Success"));
		describeRestoreJobs2Response.setCode(_ctx.stringValue("DescribeRestoreJobs2Response.Code"));
		describeRestoreJobs2Response.setMessage(_ctx.stringValue("DescribeRestoreJobs2Response.Message"));
		describeRestoreJobs2Response.setTotalCount(_ctx.integerValue("DescribeRestoreJobs2Response.TotalCount"));
		describeRestoreJobs2Response.setPageSize(_ctx.integerValue("DescribeRestoreJobs2Response.PageSize"));
		describeRestoreJobs2Response.setPageNumber(_ctx.integerValue("DescribeRestoreJobs2Response.PageNumber"));

		List<RestoreJob> restoreJobs = new ArrayList<RestoreJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreJobs2Response.RestoreJobs.Length"); i++) {
			RestoreJob restoreJob = new RestoreJob();
			restoreJob.setRestoreId(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].RestoreId"));
			restoreJob.setRestoreType(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].RestoreType"));
			restoreJob.setParentId(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].ParentId"));
			restoreJob.setStatus(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].Status"));
			restoreJob.setErrorMessage(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].ErrorMessage"));
			restoreJob.setStartTime(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].StartTime"));
			restoreJob.setCompleteTime(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].CompleteTime"));
			restoreJob.setExpireTime(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].ExpireTime"));
			restoreJob.setProgress(_ctx.integerValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].Progress"));
			restoreJob.setBytesDone(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].BytesDone"));
			restoreJob.setBytesTotal(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].BytesTotal"));
			restoreJob.setVaultId(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].VaultId"));
			restoreJob.setSnapshotId(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].SnapshotId"));
			restoreJob.setSnapshotHash(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].SnapshotHash"));
			restoreJob.setSourceType(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].SourceType"));
			restoreJob.setOptions(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].Options"));
			restoreJob.setTargetFileSystemId(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetFileSystemId"));
			restoreJob.setTargetCreateTime(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetCreateTime"));
			restoreJob.setTargetPath(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetPath"));
			restoreJob.setCreatedTime(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].CreatedTime"));
			restoreJob.setUpdatedTime(_ctx.longValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].UpdatedTime"));
			restoreJob.setTargetBucket(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetBucket"));
			restoreJob.setTargetPrefix(_ctx.stringValue("DescribeRestoreJobs2Response.RestoreJobs["+ i +"].TargetPrefix"));

			restoreJobs.add(restoreJob);
		}
		describeRestoreJobs2Response.setRestoreJobs(restoreJobs);
	 
	 	return describeRestoreJobs2Response;
	}
}