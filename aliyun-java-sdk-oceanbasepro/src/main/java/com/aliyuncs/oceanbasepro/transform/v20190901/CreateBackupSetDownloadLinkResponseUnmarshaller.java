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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import com.aliyuncs.oceanbasepro.model.v20190901.CreateBackupSetDownloadLinkResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.CreateBackupSetDownloadLinkResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBackupSetDownloadLinkResponseUnmarshaller {

	public static CreateBackupSetDownloadLinkResponse unmarshall(CreateBackupSetDownloadLinkResponse createBackupSetDownloadLinkResponse, UnmarshallerContext _ctx) {
		
		createBackupSetDownloadLinkResponse.setRequestId(_ctx.stringValue("CreateBackupSetDownloadLinkResponse.RequestId"));

		Data data = new Data();
		data.setDownloadTaskId(_ctx.longValue("CreateBackupSetDownloadLinkResponse.Data.DownloadTaskId"));
		createBackupSetDownloadLinkResponse.setData(data);
	 
	 	return createBackupSetDownloadLinkResponse;
	}
}