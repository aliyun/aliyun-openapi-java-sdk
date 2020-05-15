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

package com.aliyuncs.dbs.transform.v20190306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbs.model.v20190306.DescribeBackupSetDownloadTaskListResponse;
import com.aliyuncs.dbs.model.v20190306.DescribeBackupSetDownloadTaskListResponse.BackupSetDownloadTaskDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupSetDownloadTaskListResponseUnmarshaller {

	public static DescribeBackupSetDownloadTaskListResponse unmarshall(DescribeBackupSetDownloadTaskListResponse describeBackupSetDownloadTaskListResponse, UnmarshallerContext _ctx) {
		
		describeBackupSetDownloadTaskListResponse.setRequestId(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.RequestId"));
		describeBackupSetDownloadTaskListResponse.setSuccess(_ctx.booleanValue("DescribeBackupSetDownloadTaskListResponse.Success"));
		describeBackupSetDownloadTaskListResponse.setErrCode(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.ErrCode"));
		describeBackupSetDownloadTaskListResponse.setErrMessage(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.ErrMessage"));
		describeBackupSetDownloadTaskListResponse.setHttpStatusCode(_ctx.integerValue("DescribeBackupSetDownloadTaskListResponse.HttpStatusCode"));
		describeBackupSetDownloadTaskListResponse.setTotalPages(_ctx.integerValue("DescribeBackupSetDownloadTaskListResponse.TotalPages"));
		describeBackupSetDownloadTaskListResponse.setPageSize(_ctx.integerValue("DescribeBackupSetDownloadTaskListResponse.PageSize"));
		describeBackupSetDownloadTaskListResponse.setPageNum(_ctx.integerValue("DescribeBackupSetDownloadTaskListResponse.PageNum"));
		describeBackupSetDownloadTaskListResponse.setTotalElements(_ctx.integerValue("DescribeBackupSetDownloadTaskListResponse.TotalElements"));

		List<BackupSetDownloadTaskDetail> items = new ArrayList<BackupSetDownloadTaskDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupSetDownloadTaskListResponse.Items.Length"); i++) {
			BackupSetDownloadTaskDetail backupSetDownloadTaskDetail = new BackupSetDownloadTaskDetail();
			backupSetDownloadTaskDetail.setBackupPlanId(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupPlanId"));
			backupSetDownloadTaskDetail.setBackupSetDownloadTaskId(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetDownloadTaskId"));
			backupSetDownloadTaskDetail.setBackupSetDownloadTaskName(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetDownloadTaskName"));
			backupSetDownloadTaskDetail.setBackupSetDownloadStatus(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetDownloadStatus"));
			backupSetDownloadTaskDetail.setBackupSetDownloadCreateTime(_ctx.longValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetDownloadCreateTime"));
			backupSetDownloadTaskDetail.setBackupSetDownloadFinishTime(_ctx.longValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetDownloadFinishTime"));
			backupSetDownloadTaskDetail.setBackupSetId(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetId"));
			backupSetDownloadTaskDetail.setBackupSetCode(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetCode"));
			backupSetDownloadTaskDetail.setBackupSetJobType(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetJobType"));
			backupSetDownloadTaskDetail.setBackupSetDataSize(_ctx.longValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetDataSize"));
			backupSetDownloadTaskDetail.setBackupSetDataFormat(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetDataFormat"));
			backupSetDownloadTaskDetail.setBackupSetDbType(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetDbType"));
			backupSetDownloadTaskDetail.setBackupSetDownloadWay(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetDownloadWay"));
			backupSetDownloadTaskDetail.setBackupSetDownloadDir(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetDownloadDir"));
			backupSetDownloadTaskDetail.setBackupSetDownloadTargetType(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetDownloadTargetType"));
			backupSetDownloadTaskDetail.setBackupGatewayId(_ctx.longValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupGatewayId"));
			backupSetDownloadTaskDetail.setBackupSetDownloadIntranetUrl(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetDownloadIntranetUrl"));
			backupSetDownloadTaskDetail.setBackupSetDownloadInternetUrl(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].BackupSetDownloadInternetUrl"));
			backupSetDownloadTaskDetail.setErrMessage(_ctx.stringValue("DescribeBackupSetDownloadTaskListResponse.Items["+ i +"].ErrMessage"));

			items.add(backupSetDownloadTaskDetail);
		}
		describeBackupSetDownloadTaskListResponse.setItems(items);
	 
	 	return describeBackupSetDownloadTaskListResponse;
	}
}