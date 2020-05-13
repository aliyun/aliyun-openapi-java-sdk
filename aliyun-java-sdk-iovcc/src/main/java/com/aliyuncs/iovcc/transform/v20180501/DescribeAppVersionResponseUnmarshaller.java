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

import com.aliyuncs.iovcc.model.v20180501.DescribeAppVersionResponse;
import com.aliyuncs.iovcc.model.v20180501.DescribeAppVersionResponse.AppVersion;
import com.aliyuncs.iovcc.model.v20180501.DescribeAppVersionResponse.AppVersion.AdaptersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppVersionResponseUnmarshaller {

	public static DescribeAppVersionResponse unmarshall(DescribeAppVersionResponse describeAppVersionResponse, UnmarshallerContext _ctx) {
		
		describeAppVersionResponse.setRequestId(_ctx.stringValue("DescribeAppVersionResponse.RequestId"));

		AppVersion appVersion = new AppVersion();
		appVersion.setId(_ctx.longValue("DescribeAppVersionResponse.AppVersion.Id"));
		appVersion.setAppId(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.AppId"));
		appVersion.setVersionCode(_ctx.longValue("DescribeAppVersionResponse.AppVersion.VersionCode"));
		appVersion.setReleaseNote(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.ReleaseNote"));
		appVersion.setRemark(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.Remark"));
		appVersion.setStatus(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.Status"));
		appVersion.setAppVersion(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.AppVersion"));
		appVersion.setDownloadUrl(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.DownloadUrl"));
		appVersion.setOriginalUrl(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.OriginalUrl"));
		appVersion.setIsForceUpgrade(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.IsForceUpgrade"));
		appVersion.setIsSilentUpgrade(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.IsSilentUpgrade"));
		appVersion.setMd5(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.Md5"));
		appVersion.setApkMd5(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.ApkMd5"));
		appVersion.setSize(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.Size"));
		appVersion.setGmtCreate(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.GmtCreate"));
		appVersion.setGmtModify(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.GmtModify"));
		appVersion.setIsNeedRestart(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.IsNeedRestart"));
		appVersion.setIsAllowNewInstall(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.IsAllowNewInstall"));
		appVersion.setRestartType(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.RestartType"));
		appVersion.setRestartAppType(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.RestartAppType"));
		appVersion.setRestartAppParam(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.RestartAppParam"));
		appVersion.setInstallType(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.InstallType"));
		appVersion.setBlackVersionList(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.BlackVersionList"));
		appVersion.setWhiteVersionList(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.WhiteVersionList"));
		appVersion.setAppName(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.AppName"));
		appVersion.setStatusName(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.StatusName"));
		appVersion.setPackageName(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.PackageName"));

		List<AdaptersItem> adapters = new ArrayList<AdaptersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppVersionResponse.AppVersion.Adapters.Length"); i++) {
			AdaptersItem adaptersItem = new AdaptersItem();
			adaptersItem.setId(_ctx.longValue("DescribeAppVersionResponse.AppVersion.Adapters["+ i +"].Id"));
			adaptersItem.setVersionId(_ctx.longValue("DescribeAppVersionResponse.AppVersion.Adapters["+ i +"].VersionId"));
			adaptersItem.setDeviceModelId(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.Adapters["+ i +"].DeviceModelId"));
			adaptersItem.setMinOsVersion(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.Adapters["+ i +"].MinOsVersion"));
			adaptersItem.setMaxOsVersion(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.Adapters["+ i +"].MaxOsVersion"));
			adaptersItem.setDeviceModelName(_ctx.stringValue("DescribeAppVersionResponse.AppVersion.Adapters["+ i +"].DeviceModelName"));

			adapters.add(adaptersItem);
		}
		appVersion.setAdapters(adapters);
		describeAppVersionResponse.setAppVersion(appVersion);
	 
	 	return describeAppVersionResponse;
	}
}