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

import com.aliyuncs.dbs.model.v20190306.DescribeBackupPlanListResponse;
import com.aliyuncs.dbs.model.v20190306.DescribeBackupPlanListResponse.BackupPlanDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPlanListResponseUnmarshaller {

	public static DescribeBackupPlanListResponse unmarshall(DescribeBackupPlanListResponse describeBackupPlanListResponse, UnmarshallerContext _ctx) {
		
		describeBackupPlanListResponse.setRequestId(_ctx.stringValue("DescribeBackupPlanListResponse.RequestId"));
		describeBackupPlanListResponse.setSuccess(_ctx.booleanValue("DescribeBackupPlanListResponse.Success"));
		describeBackupPlanListResponse.setErrCode(_ctx.stringValue("DescribeBackupPlanListResponse.ErrCode"));
		describeBackupPlanListResponse.setErrMessage(_ctx.stringValue("DescribeBackupPlanListResponse.ErrMessage"));
		describeBackupPlanListResponse.setHttpStatusCode(_ctx.integerValue("DescribeBackupPlanListResponse.HttpStatusCode"));
		describeBackupPlanListResponse.setTotalPages(_ctx.integerValue("DescribeBackupPlanListResponse.TotalPages"));
		describeBackupPlanListResponse.setPageSize(_ctx.integerValue("DescribeBackupPlanListResponse.PageSize"));
		describeBackupPlanListResponse.setPageNum(_ctx.integerValue("DescribeBackupPlanListResponse.PageNum"));
		describeBackupPlanListResponse.setTotalElements(_ctx.integerValue("DescribeBackupPlanListResponse.TotalElements"));

		List<BackupPlanDetail> items = new ArrayList<BackupPlanDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupPlanListResponse.Items.Length"); i++) {
			BackupPlanDetail backupPlanDetail = new BackupPlanDetail();
			backupPlanDetail.setBackupPlanId(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupPlanId"));
			backupPlanDetail.setSourceEndpointInstanceType(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].SourceEndpointInstanceType"));
			backupPlanDetail.setSourceEndpointRegion(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].SourceEndpointRegion"));
			backupPlanDetail.setSourceEndpointInstanceID(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].SourceEndpointInstanceID"));
			backupPlanDetail.setSourceEndpointIpPort(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].SourceEndpointIpPort"));
			backupPlanDetail.setSourceEndpointDatabaseName(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].SourceEndpointDatabaseName"));
			backupPlanDetail.setSourceEndpointUserName(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].SourceEndpointUserName"));
			backupPlanDetail.setBackupObjects(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupObjects"));
			backupPlanDetail.setBackupGatewayId(_ctx.longValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupGatewayId"));
			backupPlanDetail.setOSSBucketRegion(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].OSSBucketRegion"));
			backupPlanDetail.setOSSBucketName(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].OSSBucketName"));
			backupPlanDetail.setBackupPeriod(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupPeriod"));
			backupPlanDetail.setBackupStartTime(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupStartTime"));
			backupPlanDetail.setEnableBackupLog(_ctx.booleanValue("DescribeBackupPlanListResponse.Items["+ i +"].EnableBackupLog"));
			backupPlanDetail.setBackupRetentionPeriod(_ctx.integerValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupRetentionPeriod"));
			backupPlanDetail.setDuplicationInfrequentAccessPeriod(_ctx.integerValue("DescribeBackupPlanListResponse.Items["+ i +"].DuplicationInfrequentAccessPeriod"));
			backupPlanDetail.setDuplicationArchivePeriod(_ctx.integerValue("DescribeBackupPlanListResponse.Items["+ i +"].DuplicationArchivePeriod"));
			backupPlanDetail.setBackupPlanName(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupPlanName"));
			backupPlanDetail.setSourceEndpointOracleSID(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].SourceEndpointOracleSID"));
			backupPlanDetail.setInstanceClass(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].InstanceClass"));
			backupPlanDetail.setBackupMethod(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupMethod"));
			backupPlanDetail.setBackupPlanCreateTime(_ctx.longValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupPlanCreateTime"));
			backupPlanDetail.setBackupPlanStatus(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupPlanStatus"));
			backupPlanDetail.setBeginTimestampForRestore(_ctx.longValue("DescribeBackupPlanListResponse.Items["+ i +"].BeginTimestampForRestore"));
			backupPlanDetail.setEndTimestampForRestore(_ctx.longValue("DescribeBackupPlanListResponse.Items["+ i +"].EndTimestampForRestore"));
			backupPlanDetail.setOpenBackupSetAutoDownload(_ctx.booleanValue("DescribeBackupPlanListResponse.Items["+ i +"].OpenBackupSetAutoDownload"));
			backupPlanDetail.setBackupSetDownloadTargetType(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupSetDownloadTargetType"));
			backupPlanDetail.setBackupSetDownloadDir(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupSetDownloadDir"));
			backupPlanDetail.setBackupSetDownloadGatewayId(_ctx.longValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupSetDownloadGatewayId"));
			backupPlanDetail.setBackupSetDownloadFullDataFormat(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupSetDownloadFullDataFormat"));
			backupPlanDetail.setBackupSetDownloadIncrementDataFormat(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupSetDownloadIncrementDataFormat"));
			backupPlanDetail.setCrossAliyunId(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].CrossAliyunId"));
			backupPlanDetail.setCrossRoleName(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].CrossRoleName"));
			backupPlanDetail.setBackupStorageType(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupStorageType"));
			backupPlanDetail.setErrMessage(_ctx.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].ErrMessage"));

			items.add(backupPlanDetail);
		}
		describeBackupPlanListResponse.setItems(items);
	 
	 	return describeBackupPlanListResponse;
	}
}