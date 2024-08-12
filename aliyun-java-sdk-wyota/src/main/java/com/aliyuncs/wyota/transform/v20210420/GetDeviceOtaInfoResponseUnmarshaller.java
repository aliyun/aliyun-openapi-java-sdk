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

package com.aliyuncs.wyota.transform.v20210420;

import com.aliyuncs.wyota.model.v20210420.GetDeviceOtaInfoResponse;
import com.aliyuncs.wyota.model.v20210420.GetDeviceOtaInfoResponse.Data;
import com.aliyuncs.wyota.model.v20210420.GetDeviceOtaInfoResponse.Data.Version;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceOtaInfoResponseUnmarshaller {

	public static GetDeviceOtaInfoResponse unmarshall(GetDeviceOtaInfoResponse getDeviceOtaInfoResponse, UnmarshallerContext _ctx) {
		
		getDeviceOtaInfoResponse.setRequestId(_ctx.stringValue("GetDeviceOtaInfoResponse.RequestId"));
		getDeviceOtaInfoResponse.setCode(_ctx.stringValue("GetDeviceOtaInfoResponse.Code"));
		getDeviceOtaInfoResponse.setMessage(_ctx.stringValue("GetDeviceOtaInfoResponse.Message"));

		Data data = new Data();

		Version version = new Version();
		version.setCreator(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.Creator"));
		version.setDownloadUrl(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.DownloadUrl"));
		version.setLocalDownloadUrl(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.LocalDownloadUrl"));
		version.setVersion(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.Version"));
		version.setForceUpgrade(_ctx.integerValue("GetDeviceOtaInfoResponse.Data.Version.ForceUpgrade"));
		version.setSize(_ctx.longValue("GetDeviceOtaInfoResponse.Data.Version.Size"));
		version.setMd5(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.Md5"));
		version.setModel(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.Model"));
		version.setVersionType(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.VersionType"));
		version.setReleaseNote(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.ReleaseNote"));
		version.setReleaseNoteEn(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.ReleaseNoteEn"));
		version.setVersionCode(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.VersionCode"));
		version.setCustomForceUpgrade(_ctx.booleanValue("GetDeviceOtaInfoResponse.Data.Version.CustomForceUpgrade"));
		version.setIsAppDownloadUrl(_ctx.booleanValue("GetDeviceOtaInfoResponse.Data.Version.IsAppDownloadUrl"));
		version.setCnImageDownloadUrl(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.CnImageDownloadUrl"));
		version.setEnImageDownloadUrl(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.EnImageDownloadUrl"));
		version.setMultiCnImageDownloadUrl(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.MultiCnImageDownloadUrl"));
		version.setMultiEnImageDownloadUrl(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.MultiEnImageDownloadUrl"));
		version.setAndroidHorizontalMultiCnImageDownloadUrl(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.AndroidHorizontalMultiCnImageDownloadUrl"));
		version.setAndroidHorizontalMultiEnImageDownloadUrl(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.AndroidHorizontalMultiEnImageDownloadUrl"));
		version.setAndroidVerticalMultiCnImageDownloadUrl(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.AndroidVerticalMultiCnImageDownloadUrl"));
		version.setAndroidVerticalMultiEnImageDownloadUrl(_ctx.stringValue("GetDeviceOtaInfoResponse.Data.Version.AndroidVerticalMultiEnImageDownloadUrl"));
		data.setVersion(version);
		getDeviceOtaInfoResponse.setData(data);
	 
	 	return getDeviceOtaInfoResponse;
	}
}