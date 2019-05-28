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

	public static DescribeBackupPlanListResponse unmarshall(DescribeBackupPlanListResponse describeBackupPlanListResponse, UnmarshallerContext context) {
		
		describeBackupPlanListResponse.setRequestId(context.stringValue("DescribeBackupPlanListResponse.RequestId"));
		describeBackupPlanListResponse.setSuccess(context.booleanValue("DescribeBackupPlanListResponse.Success"));
		describeBackupPlanListResponse.setErrCode(context.stringValue("DescribeBackupPlanListResponse.ErrCode"));
		describeBackupPlanListResponse.setErrMessage(context.stringValue("DescribeBackupPlanListResponse.ErrMessage"));
		describeBackupPlanListResponse.setHttpStatusCode(context.integerValue("DescribeBackupPlanListResponse.HttpStatusCode"));
		describeBackupPlanListResponse.setTotalPages(context.integerValue("DescribeBackupPlanListResponse.TotalPages"));
		describeBackupPlanListResponse.setPageSize(context.integerValue("DescribeBackupPlanListResponse.PageSize"));
		describeBackupPlanListResponse.setPageNum(context.integerValue("DescribeBackupPlanListResponse.PageNum"));
		describeBackupPlanListResponse.setTotalElements(context.integerValue("DescribeBackupPlanListResponse.TotalElements"));

		List<BackupPlanDetail> items = new ArrayList<BackupPlanDetail>();
		for (int i = 0; i < context.lengthValue("DescribeBackupPlanListResponse.Items.Length"); i++) {
			BackupPlanDetail backupPlanDetail = new BackupPlanDetail();
			backupPlanDetail.setBackupPlanId(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupPlanId"));
			backupPlanDetail.setSourceEndpointInstanceType(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].SourceEndpointInstanceType"));
			backupPlanDetail.setSourceEndpointRegion(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].SourceEndpointRegion"));
			backupPlanDetail.setSourceEndpointInstanceID(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].SourceEndpointInstanceID"));
			backupPlanDetail.setSourceEndpointIpPort(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].SourceEndpointIpPort"));
			backupPlanDetail.setSourceEndpointDatabaseName(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].SourceEndpointDatabaseName"));
			backupPlanDetail.setSourceEndpointUserName(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].SourceEndpointUserName"));
			backupPlanDetail.setBackupObjects(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupObjects"));
			backupPlanDetail.setBackupGatewayId(context.longValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupGatewayId"));
			backupPlanDetail.setOSSBucketRegion(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].OSSBucketRegion"));
			backupPlanDetail.setOSSBucketName(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].OSSBucketName"));
			backupPlanDetail.setBackupPeriod(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupPeriod"));
			backupPlanDetail.setBackupStartTime(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupStartTime"));
			backupPlanDetail.setEnableBackupLog(context.booleanValue("DescribeBackupPlanListResponse.Items["+ i +"].EnableBackupLog"));
			backupPlanDetail.setBackupRetentionPeriod(context.integerValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupRetentionPeriod"));
			backupPlanDetail.setDuplicationInfrequentAccessPeriod(context.integerValue("DescribeBackupPlanListResponse.Items["+ i +"].DuplicationInfrequentAccessPeriod"));
			backupPlanDetail.setDuplicationArchivePeriod(context.integerValue("DescribeBackupPlanListResponse.Items["+ i +"].DuplicationArchivePeriod"));
			backupPlanDetail.setBackupPlanName(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupPlanName"));
			backupPlanDetail.setSourceEndpointOracleSID(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].SourceEndpointOracleSID"));
			backupPlanDetail.setInstanceClass(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].InstanceClass"));
			backupPlanDetail.setBackupMethod(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupMethod"));
			backupPlanDetail.setBackupPlanCreateTime(context.longValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupPlanCreateTime"));
			backupPlanDetail.setBackupPlanStatus(context.stringValue("DescribeBackupPlanListResponse.Items["+ i +"].BackupPlanStatus"));

			items.add(backupPlanDetail);
		}
		describeBackupPlanListResponse.setItems(items);
	 
	 	return describeBackupPlanListResponse;
	}
}