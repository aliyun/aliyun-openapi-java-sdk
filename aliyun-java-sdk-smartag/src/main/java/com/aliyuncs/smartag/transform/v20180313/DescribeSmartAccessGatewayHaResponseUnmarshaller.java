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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeSmartAccessGatewayHaResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSmartAccessGatewayHaResponse.LinkBackupInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSmartAccessGatewayHaResponseUnmarshaller {

	public static DescribeSmartAccessGatewayHaResponse unmarshall(DescribeSmartAccessGatewayHaResponse describeSmartAccessGatewayHaResponse, UnmarshallerContext context) {
		
		describeSmartAccessGatewayHaResponse.setRequestId(context.stringValue("DescribeSmartAccessGatewayHaResponse.RequestId"));
		describeSmartAccessGatewayHaResponse.setDeviceLevelBackupState(context.stringValue("DescribeSmartAccessGatewayHaResponse.DeviceLevelBackupState"));
		describeSmartAccessGatewayHaResponse.setDeviceLevelBackupType(context.stringValue("DescribeSmartAccessGatewayHaResponse.DeviceLevelBackupType"));
		describeSmartAccessGatewayHaResponse.setMainDeviceId(context.stringValue("DescribeSmartAccessGatewayHaResponse.MainDeviceId"));
		describeSmartAccessGatewayHaResponse.setBackupDeviceId(context.stringValue("DescribeSmartAccessGatewayHaResponse.BackupDeviceId"));
		describeSmartAccessGatewayHaResponse.setSmartAGId(context.stringValue("DescribeSmartAccessGatewayHaResponse.SmartAGId"));

		List<LinkBackupInfoListItem> linkBackupInfoList = new ArrayList<LinkBackupInfoListItem>();
		for (int i = 0; i < context.lengthValue("DescribeSmartAccessGatewayHaResponse.LinkBackupInfoList.Length"); i++) {
			LinkBackupInfoListItem linkBackupInfoListItem = new LinkBackupInfoListItem();
			linkBackupInfoListItem.setLinkLevelBackupState(context.stringValue("DescribeSmartAccessGatewayHaResponse.LinkBackupInfoList["+ i +"].LinkLevelBackupState"));
			linkBackupInfoListItem.setLinkLevelBackupType(context.stringValue("DescribeSmartAccessGatewayHaResponse.LinkBackupInfoList["+ i +"].LinkLevelBackupType"));
			linkBackupInfoListItem.setMainLinkId(context.stringValue("DescribeSmartAccessGatewayHaResponse.LinkBackupInfoList["+ i +"].MainLinkId"));
			linkBackupInfoListItem.setMainLinkState(context.stringValue("DescribeSmartAccessGatewayHaResponse.LinkBackupInfoList["+ i +"].MainLinkState"));
			linkBackupInfoListItem.setBackupLinkId(context.stringValue("DescribeSmartAccessGatewayHaResponse.LinkBackupInfoList["+ i +"].BackupLinkId"));
			linkBackupInfoListItem.setBackupLinkState(context.stringValue("DescribeSmartAccessGatewayHaResponse.LinkBackupInfoList["+ i +"].BackupLinkState"));

			linkBackupInfoList.add(linkBackupInfoListItem);
		}
		describeSmartAccessGatewayHaResponse.setLinkBackupInfoList(linkBackupInfoList);
	 
	 	return describeSmartAccessGatewayHaResponse;
	}
}