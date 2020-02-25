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

package com.aliyuncs.dbs.transform.v20190306;

import com.aliyuncs.dbs.model.v20190306.CreateFullBackupSetDownloadResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFullBackupSetDownloadResponseUnmarshaller {

	public static CreateFullBackupSetDownloadResponse unmarshall(CreateFullBackupSetDownloadResponse createFullBackupSetDownloadResponse, UnmarshallerContext _ctx) {
		
		createFullBackupSetDownloadResponse.setRequestId(_ctx.stringValue("CreateFullBackupSetDownloadResponse.RequestId"));
		createFullBackupSetDownloadResponse.setSuccess(_ctx.booleanValue("CreateFullBackupSetDownloadResponse.Success"));
		createFullBackupSetDownloadResponse.setErrCode(_ctx.stringValue("CreateFullBackupSetDownloadResponse.ErrCode"));
		createFullBackupSetDownloadResponse.setErrMessage(_ctx.stringValue("CreateFullBackupSetDownloadResponse.ErrMessage"));
		createFullBackupSetDownloadResponse.setHttpStatusCode(_ctx.integerValue("CreateFullBackupSetDownloadResponse.HttpStatusCode"));
		createFullBackupSetDownloadResponse.setBackupSetDownloadTaskId(_ctx.stringValue("CreateFullBackupSetDownloadResponse.BackupSetDownloadTaskId"));
	 
	 	return createFullBackupSetDownloadResponse;
	}
}