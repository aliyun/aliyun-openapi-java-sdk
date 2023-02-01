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

package com.aliyuncs.ecd.transform.v20200930;

import com.aliyuncs.ecd.model.v20200930.CreateFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFileResponseUnmarshaller {

	public static CreateFileResponse unmarshall(CreateFileResponse createFileResponse, UnmarshallerContext _ctx) {
		
		createFileResponse.setRequestId(_ctx.stringValue("CreateFileResponse.RequestId"));
		createFileResponse.setFileId(_ctx.stringValue("CreateFileResponse.FileId"));
		createFileResponse.setDriveId(_ctx.stringValue("CreateFileResponse.DriveId"));
		createFileResponse.setUploadId(_ctx.stringValue("CreateFileResponse.UploadId"));
		createFileResponse.setUploadType(_ctx.stringValue("CreateFileResponse.UploadType"));
		createFileResponse.setUploadUrl(_ctx.stringValue("CreateFileResponse.UploadUrl"));
	 
	 	return createFileResponse;
	}
}