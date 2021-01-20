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

package com.aliyuncs.emas_appmonitor.transform.v20190611;

import com.aliyuncs.emas_appmonitor.model.v20190611.SaveAppFileResponse;
import com.aliyuncs.emas_appmonitor.model.v20190611.SaveAppFileResponse.AppFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveAppFileResponseUnmarshaller {

	public static SaveAppFileResponse unmarshall(SaveAppFileResponse saveAppFileResponse, UnmarshallerContext _ctx) {
		
		saveAppFileResponse.setRequestId(_ctx.stringValue("SaveAppFileResponse.RequestId"));

		AppFile appFile = new AppFile();
		appFile.setAppVersion(_ctx.stringValue("SaveAppFileResponse.AppFile.AppVersion"));
		appFile.setFileName(_ctx.stringValue("SaveAppFileResponse.AppFile.FileName"));
		appFile.setFilePath(_ctx.stringValue("SaveAppFileResponse.AppFile.FilePath"));
		appFile.setFileType(_ctx.stringValue("SaveAppFileResponse.AppFile.FileType"));
		appFile.setId(_ctx.longValue("SaveAppFileResponse.AppFile.Id"));
		appFile.setUniqueAppId(_ctx.stringValue("SaveAppFileResponse.AppFile.UniqueAppId"));
		saveAppFileResponse.setAppFile(appFile);
	 
	 	return saveAppFileResponse;
	}
}