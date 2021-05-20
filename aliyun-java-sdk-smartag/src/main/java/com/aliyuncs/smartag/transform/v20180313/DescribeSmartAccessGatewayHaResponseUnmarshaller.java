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

	public static DescribeSmartAccessGatewayHaResponse unmarshall(DescribeSmartAccessGatewayHaResponse describeSmartAccessGatewayHaResponse, UnmarshallerContext _ctx) {
		
		describeSmartAccessGatewayHaResponse.setRequestId(_ctx.stringValue("DescribeSmartAccessGatewayHaResponse.RequestId"));
		describeSmartAccessGatewayHaResponse.setDeviceLevelBackupState(_ctx.stringValue("DescribeSmartAccessGatewayHaResponse.DeviceLevelBackupState"));
		describeSmartAccessGatewayHaResponse.setBackupDeviceId(_ctx.stringValue("DescribeSmartAccessGatewayHaResponse.BackupDeviceId"));
		describeSmartAccessGatewayHaResponse.setSmartAGId(_ctx.stringValue("DescribeSmartAccessGatewayHaResponse.SmartAGId"));
		describeSmartAccessGatewayHaResponse.setDeviceLevelBackupType(_ctx.stringValue("DescribeSmartAccessGatewayHaResponse.DeviceLevelBackupType"));
		describeSmartAccessGatewayHaResponse.setMainDeviceId(_ctx.stringValue("DescribeSmartAccessGatewayHaResponse.MainDeviceId"));

		List<LinkBackupInfoListItem> linkBackupInfoList = new ArrayList<LinkBackupInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSmartAccessGatewayHaResponse.LinkBackupInfoList.Length"); i++) {
			LinkBackupInfoListItem linkBackupInfoListItem = new LinkBackupInfoListItem();
			linkBackupInfoListItem.setBackupLinkState(_ctx.stringValue("DescribeSmartAccessGatewayHaResponse.LinkBackupInfoList["+ i +"].BackupLinkState"));
			linkBackupInfoListItem.setMainLinkState(_ctx.stringValue("DescribeSmartAccessGatewayHaResponse.LinkBackupInfoList["+ i +"].MainLinkState"));
			linkBackupInfoListItem.setBackupLinkId(_ctx.stringValue("DescribeSmartAccessGatewayHaResponse.LinkBackupInfoList["+ i +"].BackupLinkId"));
			linkBackupInfoListItem.setLinkLevelBackupType(_ctx.stringValue("DescribeSmartAccessGatewayHaResponse.LinkBackupInfoList["+ i +"].LinkLevelBackupType"));
			linkBackupInfoListItem.setMainLinkId(_ctx.stringValue("DescribeSmartAccessGatewayHaResponse.LinkBackupInfoList["+ i +"].MainLinkId"));
			linkBackupInfoListItem.setLinkLevelBackupState(_ctx.stringValue("DescribeSmartAccessGatewayHaResponse.LinkBackupInfoList["+ i +"].LinkLevelBackupState"));

			linkBackupInfoList.add(linkBackupInfoListItem);
		}
		describeSmartAccessGatewayHaResponse.setLinkBackupInfoList(linkBackupInfoList);
	 
	 	return describeSmartAccessGatewayHaResponse;
	}
}