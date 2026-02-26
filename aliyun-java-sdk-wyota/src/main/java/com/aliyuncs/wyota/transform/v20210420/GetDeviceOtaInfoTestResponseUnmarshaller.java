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

import com.aliyuncs.wyota.model.v20210420.GetDeviceOtaInfoTestResponse;
import com.aliyuncs.wyota.model.v20210420.GetDeviceOtaInfoTestResponse.Data;
import com.aliyuncs.wyota.model.v20210420.GetDeviceOtaInfoTestResponse.Data.Version;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceOtaInfoTestResponseUnmarshaller {

	public static GetDeviceOtaInfoTestResponse unmarshall(GetDeviceOtaInfoTestResponse getDeviceOtaInfoTestResponse, UnmarshallerContext _ctx) {
		
		getDeviceOtaInfoTestResponse.setRequestId(_ctx.stringValue("GetDeviceOtaInfoTestResponse.RequestId"));
		getDeviceOtaInfoTestResponse.setCode(_ctx.stringValue("GetDeviceOtaInfoTestResponse.Code"));
		getDeviceOtaInfoTestResponse.setMessage(_ctx.stringValue("GetDeviceOtaInfoTestResponse.Message"));

		Data data = new Data();

		Version version = new Version();
		version.setCreator(_ctx.stringValue("GetDeviceOtaInfoTestResponse.Data.Version.Creator"));
		version.setDownloadUrl(_ctx.stringValue("GetDeviceOtaInfoTestResponse.Data.Version.DownloadUrl"));
		version.setLocalDownloadUrl(_ctx.stringValue("GetDeviceOtaInfoTestResponse.Data.Version.LocalDownloadUrl"));
		version.setVersion(_ctx.stringValue("GetDeviceOtaInfoTestResponse.Data.Version.Version"));
		version.setForceUpgrade(_ctx.integerValue("GetDeviceOtaInfoTestResponse.Data.Version.ForceUpgrade"));
		version.setSize(_ctx.longValue("GetDeviceOtaInfoTestResponse.Data.Version.Size"));
		version.setMd5(_ctx.stringValue("GetDeviceOtaInfoTestResponse.Data.Version.Md5"));
		version.setModel(_ctx.stringValue("GetDeviceOtaInfoTestResponse.Data.Version.Model"));
		version.setVersionType(_ctx.stringValue("GetDeviceOtaInfoTestResponse.Data.Version.VersionType"));
		version.setReleaseNote(_ctx.stringValue("GetDeviceOtaInfoTestResponse.Data.Version.ReleaseNote"));
		version.setVersionCode(_ctx.stringValue("GetDeviceOtaInfoTestResponse.Data.Version.VersionCode"));
		data.setVersion(version);
		getDeviceOtaInfoTestResponse.setData(data);
	 
	 	return getDeviceOtaInfoTestResponse;
	}
}