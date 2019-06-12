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

import com.aliyuncs.dbs.model.v20190306.DescribeBackupGatewayListResponse;
import com.aliyuncs.dbs.model.v20190306.DescribeBackupGatewayListResponse.BackupGateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupGatewayListResponseUnmarshaller {

	public static DescribeBackupGatewayListResponse unmarshall(DescribeBackupGatewayListResponse describeBackupGatewayListResponse, UnmarshallerContext context) {
		
		describeBackupGatewayListResponse.setRequestId(context.stringValue("DescribeBackupGatewayListResponse.RequestId"));
		describeBackupGatewayListResponse.setSuccess(context.booleanValue("DescribeBackupGatewayListResponse.Success"));
		describeBackupGatewayListResponse.setErrCode(context.stringValue("DescribeBackupGatewayListResponse.ErrCode"));
		describeBackupGatewayListResponse.setErrMessage(context.stringValue("DescribeBackupGatewayListResponse.ErrMessage"));
		describeBackupGatewayListResponse.setHttpStatusCode(context.integerValue("DescribeBackupGatewayListResponse.HttpStatusCode"));
		describeBackupGatewayListResponse.setTotalPages(context.integerValue("DescribeBackupGatewayListResponse.TotalPages"));
		describeBackupGatewayListResponse.setPageSize(context.integerValue("DescribeBackupGatewayListResponse.PageSize"));
		describeBackupGatewayListResponse.setPageNum(context.integerValue("DescribeBackupGatewayListResponse.PageNum"));
		describeBackupGatewayListResponse.setTotalElements(context.integerValue("DescribeBackupGatewayListResponse.TotalElements"));

		List<BackupGateway> items = new ArrayList<BackupGateway>();
		for (int i = 0; i < context.lengthValue("DescribeBackupGatewayListResponse.Items.Length"); i++) {
			BackupGateway backupGateway = new BackupGateway();
			backupGateway.setBackupGatewayId(context.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].BackupGatewayId"));
			backupGateway.setSourceEndpointInternetIP(context.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].SourceEndpointInternetIP"));
			backupGateway.setSourceEndpointIntranetIP(context.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].SourceEndpointIntranetIP"));
			backupGateway.setSourceEndpointHostname(context.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].SourceEndpointHostname"));
			backupGateway.setBackupGatewayStatus(context.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].BackupGatewayStatus"));
			backupGateway.setLastHeartbeatTime(context.longValue("DescribeBackupGatewayListResponse.Items["+ i +"].LastHeartbeatTime"));
			backupGateway.setBackupGatewayCreateTime(context.longValue("DescribeBackupGatewayListResponse.Items["+ i +"].BackupGatewayCreateTime"));
			backupGateway.setRegion(context.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].Region"));
			backupGateway.setDisplayName(context.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].DisplayName"));
			backupGateway.setIdentifier(context.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].Identifier"));

			items.add(backupGateway);
		}
		describeBackupGatewayListResponse.setItems(items);
	 
	 	return describeBackupGatewayListResponse;
	}
}