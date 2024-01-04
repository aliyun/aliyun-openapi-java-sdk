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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.CreateWorkitemRecordResponse;
import com.aliyuncs.devops.model.v20210625.CreateWorkitemRecordResponse.WorkitemTime;
import com.aliyuncs.devops.model.v20210625.CreateWorkitemRecordResponse.WorkitemTime.RecordUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateWorkitemRecordResponseUnmarshaller {

	public static CreateWorkitemRecordResponse unmarshall(CreateWorkitemRecordResponse createWorkitemRecordResponse, UnmarshallerContext _ctx) {
		
		createWorkitemRecordResponse.setRequestId(_ctx.stringValue("CreateWorkitemRecordResponse.requestId"));
		createWorkitemRecordResponse.setErrorMsg(_ctx.stringValue("CreateWorkitemRecordResponse.errorMsg"));
		createWorkitemRecordResponse.setErrorCode(_ctx.stringValue("CreateWorkitemRecordResponse.errorCode"));
		createWorkitemRecordResponse.setSuccess(_ctx.booleanValue("CreateWorkitemRecordResponse.success"));

		WorkitemTime workitemTime = new WorkitemTime();
		workitemTime.setIdentifier(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.identifier"));
		workitemTime.setWorkitemIdentifier(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.workitemIdentifier"));
		workitemTime.setActualTime(_ctx.longValue("CreateWorkitemRecordResponse.WorkitemTime.actualTime"));
		workitemTime.setType(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.type"));
		workitemTime.setDescription(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.description"));
		workitemTime.setGmtStart(_ctx.longValue("CreateWorkitemRecordResponse.WorkitemTime.gmtStart"));
		workitemTime.setGmtEnd(_ctx.longValue("CreateWorkitemRecordResponse.WorkitemTime.gmtEnd"));

		RecordUser recordUser = new RecordUser();
		recordUser.setAccount(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.account"));
		recordUser.setIdentifier(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.identifier"));
		recordUser.setRealName(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.realName"));
		recordUser.setNickName(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.nickName"));
		recordUser.setAvatar(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.avatar"));
		recordUser.setStamp(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.stamp"));
		recordUser.setNameEn(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.nameEn"));
		recordUser.setGender(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.gender"));
		recordUser.setMobile(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.mobile"));
		recordUser.setEmail(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.email"));
		recordUser.setNickNamePinyin(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.nickNamePinyin"));
		recordUser.setRealNamePinyin(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.realNamePinyin"));
		recordUser.setDisplayNickName(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.displayNickName"));
		recordUser.setDisplayRealName(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.displayRealName"));
		recordUser.setDisplayName(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.displayName"));
		recordUser.setDingTalkId(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.dingTalkId"));
		recordUser.setTbRoleId(_ctx.stringValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.tbRoleId"));
		recordUser.setIsDisabled(_ctx.booleanValue("CreateWorkitemRecordResponse.WorkitemTime.recordUser.isDisabled"));
		workitemTime.setRecordUser(recordUser);
		createWorkitemRecordResponse.setWorkitemTime(workitemTime);
	 
	 	return createWorkitemRecordResponse;
	}
}