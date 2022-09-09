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

import com.aliyuncs.ecd.model.v20200930.CreateDriveResponse;
import com.aliyuncs.ecd.model.v20200930.CreateDriveResponse.Drive;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDriveResponseUnmarshaller {

	public static CreateDriveResponse unmarshall(CreateDriveResponse createDriveResponse, UnmarshallerContext _ctx) {
		
		createDriveResponse.setRequestId(_ctx.stringValue("CreateDriveResponse.RequestId"));
		createDriveResponse.setMessage(_ctx.stringValue("CreateDriveResponse.Message"));
		createDriveResponse.setCode(_ctx.stringValue("CreateDriveResponse.Code"));
		createDriveResponse.setSuccess(_ctx.booleanValue("CreateDriveResponse.Success"));

		Drive drive = new Drive();
		drive.setId(_ctx.stringValue("CreateDriveResponse.Drive.Id"));
		drive.setGmtCreate(_ctx.stringValue("CreateDriveResponse.Drive.GmtCreate"));
		drive.setGmtModified(_ctx.stringValue("CreateDriveResponse.Drive.GmtModified"));
		drive.setAliUid(_ctx.stringValue("CreateDriveResponse.Drive.AliUid"));
		drive.setDomainId(_ctx.stringValue("CreateDriveResponse.Drive.DomainId"));
		drive.setDriveId(_ctx.stringValue("CreateDriveResponse.Drive.DriveId"));
		drive.setExternalDriveId(_ctx.stringValue("CreateDriveResponse.Drive.ExternalDriveId"));
		drive.setUserId(_ctx.stringValue("CreateDriveResponse.Drive.UserId"));
		drive.setExternalUserId(_ctx.stringValue("CreateDriveResponse.Drive.ExternalUserId"));
		drive.setName(_ctx.stringValue("CreateDriveResponse.Drive.Name"));
		drive.setDescription(_ctx.stringValue("CreateDriveResponse.Drive.Description"));
		drive.setTotalSize(_ctx.longValue("CreateDriveResponse.Drive.TotalSize"));
		drive.setUsedSize(_ctx.longValue("CreateDriveResponse.Drive.UsedSize"));
		drive.setStatus(_ctx.stringValue("CreateDriveResponse.Drive.Status"));
		drive.setType(_ctx.stringValue("CreateDriveResponse.Drive.Type"));
		drive.setProfileRoaming(_ctx.booleanValue("CreateDriveResponse.Drive.ProfileRoaming"));
		createDriveResponse.setDrive(drive);
	 
	 	return createDriveResponse;
	}
}