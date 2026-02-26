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

import com.aliyuncs.wyota.model.v20210420.GetAppOtaLatestVersionResponse;
import com.aliyuncs.wyota.model.v20210420.GetAppOtaLatestVersionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppOtaLatestVersionResponseUnmarshaller {

	public static GetAppOtaLatestVersionResponse unmarshall(GetAppOtaLatestVersionResponse getAppOtaLatestVersionResponse, UnmarshallerContext _ctx) {
		
		getAppOtaLatestVersionResponse.setRequestId(_ctx.stringValue("GetAppOtaLatestVersionResponse.RequestId"));
		getAppOtaLatestVersionResponse.setCode(_ctx.stringValue("GetAppOtaLatestVersionResponse.Code"));
		getAppOtaLatestVersionResponse.setMessage(_ctx.stringValue("GetAppOtaLatestVersionResponse.Message"));

		Data data = new Data();
		data.setAppVersion(_ctx.stringValue("GetAppOtaLatestVersionResponse.Data.AppVersion"));
		data.setDownloadUrl(_ctx.stringValue("GetAppOtaLatestVersionResponse.Data.DownloadUrl"));
		data.setMd5(_ctx.stringValue("GetAppOtaLatestVersionResponse.Data.Md5"));
		data.setSize(_ctx.longValue("GetAppOtaLatestVersionResponse.Data.Size"));
		data.setReleaseNote(_ctx.stringValue("GetAppOtaLatestVersionResponse.Data.ReleaseNote"));
		data.setForceUpgrade(_ctx.integerValue("GetAppOtaLatestVersionResponse.Data.ForceUpgrade"));
		data.setVersionType(_ctx.stringValue("GetAppOtaLatestVersionResponse.Data.VersionType"));
		data.setVersionCode(_ctx.stringValue("GetAppOtaLatestVersionResponse.Data.VersionCode"));
		data.setTaskUid(_ctx.stringValue("GetAppOtaLatestVersionResponse.Data.TaskUid"));
		getAppOtaLatestVersionResponse.setData(data);
	 
	 	return getAppOtaLatestVersionResponse;
	}
}