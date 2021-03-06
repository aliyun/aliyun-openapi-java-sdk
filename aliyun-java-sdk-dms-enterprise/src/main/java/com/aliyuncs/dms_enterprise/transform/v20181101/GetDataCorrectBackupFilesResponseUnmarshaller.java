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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataCorrectBackupFilesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataCorrectBackupFilesResponseUnmarshaller {

	public static GetDataCorrectBackupFilesResponse unmarshall(GetDataCorrectBackupFilesResponse getDataCorrectBackupFilesResponse, UnmarshallerContext _ctx) {
		
		getDataCorrectBackupFilesResponse.setRequestId(_ctx.stringValue("GetDataCorrectBackupFilesResponse.RequestId"));
		getDataCorrectBackupFilesResponse.setErrorCode(_ctx.stringValue("GetDataCorrectBackupFilesResponse.ErrorCode"));
		getDataCorrectBackupFilesResponse.setErrorMessage(_ctx.stringValue("GetDataCorrectBackupFilesResponse.ErrorMessage"));
		getDataCorrectBackupFilesResponse.setSuccess(_ctx.booleanValue("GetDataCorrectBackupFilesResponse.Success"));

		List<String> dataCorrectBackupFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDataCorrectBackupFilesResponse.DataCorrectBackupFiles.Length"); i++) {
			dataCorrectBackupFiles.add(_ctx.stringValue("GetDataCorrectBackupFilesResponse.DataCorrectBackupFiles["+ i +"]"));
		}
		getDataCorrectBackupFilesResponse.setDataCorrectBackupFiles(dataCorrectBackupFiles);
	 
	 	return getDataCorrectBackupFilesResponse;
	}
}