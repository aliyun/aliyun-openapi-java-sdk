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

package com.aliyuncs.smartag.transform.v20180313;

import com.aliyuncs.smartag.model.v20180313.DescribeSmartAccessGatewayHaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSmartAccessGatewayHaResponseUnmarshaller {

	public static DescribeSmartAccessGatewayHaResponse unmarshall(DescribeSmartAccessGatewayHaResponse describeSmartAccessGatewayHaResponse, UnmarshallerContext context) {
		
		describeSmartAccessGatewayHaResponse.setRequestId(context.stringValue("DescribeSmartAccessGatewayHaResponse.RequestId"));
		describeSmartAccessGatewayHaResponse.setDeviceLevelBackupState(context.stringValue("DescribeSmartAccessGatewayHaResponse.DeviceLevelBackupState"));
		describeSmartAccessGatewayHaResponse.setDeviceLevelBackupType(context.stringValue("DescribeSmartAccessGatewayHaResponse.DeviceLevelBackupType"));
		describeSmartAccessGatewayHaResponse.setMainDeviceId(context.stringValue("DescribeSmartAccessGatewayHaResponse.MainDeviceId"));
		describeSmartAccessGatewayHaResponse.setBackupDeviceId(context.stringValue("DescribeSmartAccessGatewayHaResponse.BackupDeviceId"));
		describeSmartAccessGatewayHaResponse.setLinkLevelBackupState(context.stringValue("DescribeSmartAccessGatewayHaResponse.LinkLevelBackupState"));
		describeSmartAccessGatewayHaResponse.setLinkLevelBackupType(context.stringValue("DescribeSmartAccessGatewayHaResponse.LinkLevelBackupType"));
		describeSmartAccessGatewayHaResponse.setMainLinkId(context.stringValue("DescribeSmartAccessGatewayHaResponse.MainLinkId"));
		describeSmartAccessGatewayHaResponse.setBackupLinkId(context.stringValue("DescribeSmartAccessGatewayHaResponse.BackupLinkId"));
		describeSmartAccessGatewayHaResponse.setSmartAGId(context.stringValue("DescribeSmartAccessGatewayHaResponse.SmartAGId"));
		describeSmartAccessGatewayHaResponse.setMainLinkState(context.stringValue("DescribeSmartAccessGatewayHaResponse.MainLinkState"));
		describeSmartAccessGatewayHaResponse.setBackupLinkState(context.stringValue("DescribeSmartAccessGatewayHaResponse.BackupLinkState"));
	 
	 	return describeSmartAccessGatewayHaResponse;
	}
}