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

	public static DescribeBackupGatewayListResponse unmarshall(DescribeBackupGatewayListResponse describeBackupGatewayListResponse, UnmarshallerContext _ctx) {
		
		describeBackupGatewayListResponse.setRequestId(_ctx.stringValue("DescribeBackupGatewayListResponse.RequestId"));
		describeBackupGatewayListResponse.setSuccess(_ctx.booleanValue("DescribeBackupGatewayListResponse.Success"));
		describeBackupGatewayListResponse.setErrCode(_ctx.stringValue("DescribeBackupGatewayListResponse.ErrCode"));
		describeBackupGatewayListResponse.setErrMessage(_ctx.stringValue("DescribeBackupGatewayListResponse.ErrMessage"));
		describeBackupGatewayListResponse.setHttpStatusCode(_ctx.integerValue("DescribeBackupGatewayListResponse.HttpStatusCode"));
		describeBackupGatewayListResponse.setTotalPages(_ctx.integerValue("DescribeBackupGatewayListResponse.TotalPages"));
		describeBackupGatewayListResponse.setPageSize(_ctx.integerValue("DescribeBackupGatewayListResponse.PageSize"));
		describeBackupGatewayListResponse.setPageNum(_ctx.integerValue("DescribeBackupGatewayListResponse.PageNum"));
		describeBackupGatewayListResponse.setTotalElements(_ctx.integerValue("DescribeBackupGatewayListResponse.TotalElements"));

		List<BackupGateway> items = new ArrayList<BackupGateway>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupGatewayListResponse.Items.Length"); i++) {
			BackupGateway backupGateway = new BackupGateway();
			backupGateway.setBackupGatewayId(_ctx.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].BackupGatewayId"));
			backupGateway.setSourceEndpointInternetIP(_ctx.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].SourceEndpointInternetIP"));
			backupGateway.setSourceEndpointIntranetIP(_ctx.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].SourceEndpointIntranetIP"));
			backupGateway.setSourceEndpointHostname(_ctx.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].SourceEndpointHostname"));
			backupGateway.setBackupGatewayStatus(_ctx.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].BackupGatewayStatus"));
			backupGateway.setLastHeartbeatTime(_ctx.longValue("DescribeBackupGatewayListResponse.Items["+ i +"].LastHeartbeatTime"));
			backupGateway.setBackupGatewayCreateTime(_ctx.longValue("DescribeBackupGatewayListResponse.Items["+ i +"].BackupGatewayCreateTime"));
			backupGateway.setRegion(_ctx.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].Region"));
			backupGateway.setDisplayName(_ctx.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].DisplayName"));
			backupGateway.setIdentifier(_ctx.stringValue("DescribeBackupGatewayListResponse.Items["+ i +"].Identifier"));

			items.add(backupGateway);
		}
		describeBackupGatewayListResponse.setItems(items);
	 
	 	return describeBackupGatewayListResponse;
	}
}