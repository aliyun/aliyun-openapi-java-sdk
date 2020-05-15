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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.DescribeOsVersionResponse;
import com.aliyuncs.iovcc.model.v20180501.DescribeOsVersionResponse.OsVersion;
import com.aliyuncs.iovcc.model.v20180501.DescribeOsVersionResponse.OsVersion.NightUpgradeOption;
import com.aliyuncs.iovcc.model.v20180501.DescribeOsVersionResponse.OsVersion.RomListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOsVersionResponseUnmarshaller {

	public static DescribeOsVersionResponse unmarshall(DescribeOsVersionResponse describeOsVersionResponse, UnmarshallerContext _ctx) {
		
		describeOsVersionResponse.setRequestId(_ctx.stringValue("DescribeOsVersionResponse.RequestId"));

		OsVersion osVersion = new OsVersion();
		osVersion.setId(_ctx.longValue("DescribeOsVersionResponse.OsVersion.Id"));
		osVersion.setDeviceModelId(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.DeviceModelId"));
		osVersion.setSystemVersion(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.SystemVersion"));
		osVersion.setReleaseNote(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.ReleaseNote"));
		osVersion.setRemark(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.Remark"));
		osVersion.setStatus(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.Status"));
		osVersion.setBlackVersionList(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.BlackVersionList"));
		osVersion.setWhiteVersionList(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.WhiteVersionList"));
		osVersion.setMinClientVersion(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.MinClientVersion"));
		osVersion.setMaxClientVersion(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.MaxClientVersion"));
		osVersion.setIsMilestone(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.IsMilestone"));
		osVersion.setIsForceUpgrade(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.IsForceUpgrade"));
		osVersion.setIsForceNightUpgrade(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.IsForceNightUpgrade"));
		osVersion.setGmtCreate(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.GmtCreate"));
		osVersion.setGmtModify(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.GmtModify"));
		osVersion.setStatusName(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.StatusName"));
		osVersion.setDeviceModelName(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.DeviceModelName"));
		osVersion.setEnableMobileDownload(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.EnableMobileDownload"));
		osVersion.setMobileDownloadMaxSize(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.MobileDownloadMaxSize"));

		NightUpgradeOption nightUpgradeOption = new NightUpgradeOption();
		nightUpgradeOption.setDownloadType(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.NightUpgradeOption.DownloadType"));
		nightUpgradeOption.setIsShowTip(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.NightUpgradeOption.IsShowTip"));
		nightUpgradeOption.setIsAllowedCancel(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.NightUpgradeOption.IsAllowedCancel"));
		osVersion.setNightUpgradeOption(nightUpgradeOption);

		List<RomListItem> romList = new ArrayList<RomListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOsVersionResponse.OsVersion.RomList.Length"); i++) {
			RomListItem romListItem = new RomListItem();
			romListItem.setId(_ctx.longValue("DescribeOsVersionResponse.OsVersion.RomList["+ i +"].Id"));
			romListItem.setVersionId(_ctx.longValue("DescribeOsVersionResponse.OsVersion.RomList["+ i +"].VersionId"));
			romListItem.setBaseVersion(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.RomList["+ i +"].BaseVersion"));
			romListItem.setDownloadUrl(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.RomList["+ i +"].DownloadUrl"));
			romListItem.setOriginalUrl(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.RomList["+ i +"].OriginalUrl"));
			romListItem.setMd5(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.RomList["+ i +"].Md5"));
			romListItem.setSize(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.RomList["+ i +"].Size"));
			romListItem.setSplitNum(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.RomList["+ i +"].SplitNum"));
			romListItem.setGmtCreate(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.RomList["+ i +"].GmtCreate"));
			romListItem.setGmtModify(_ctx.stringValue("DescribeOsVersionResponse.OsVersion.RomList["+ i +"].GmtModify"));

			romList.add(romListItem);
		}
		osVersion.setRomList(romList);
		describeOsVersionResponse.setOsVersion(osVersion);
	 
	 	return describeOsVersionResponse;
	}
}