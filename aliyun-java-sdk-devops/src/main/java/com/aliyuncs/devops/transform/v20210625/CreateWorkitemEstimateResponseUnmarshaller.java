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

import com.aliyuncs.devops.model.v20210625.CreateWorkitemEstimateResponse;
import com.aliyuncs.devops.model.v20210625.CreateWorkitemEstimateResponse.WorkitemTimeEstimate;
import com.aliyuncs.devops.model.v20210625.CreateWorkitemEstimateResponse.WorkitemTimeEstimate.RecordUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateWorkitemEstimateResponseUnmarshaller {

	public static CreateWorkitemEstimateResponse unmarshall(CreateWorkitemEstimateResponse createWorkitemEstimateResponse, UnmarshallerContext _ctx) {
		
		createWorkitemEstimateResponse.setRequestId(_ctx.stringValue("CreateWorkitemEstimateResponse.requestId"));
		createWorkitemEstimateResponse.setErrorMsg(_ctx.stringValue("CreateWorkitemEstimateResponse.errorMsg"));
		createWorkitemEstimateResponse.setErrorCode(_ctx.stringValue("CreateWorkitemEstimateResponse.errorCode"));
		createWorkitemEstimateResponse.setSuccess(_ctx.booleanValue("CreateWorkitemEstimateResponse.success"));

		WorkitemTimeEstimate workitemTimeEstimate = new WorkitemTimeEstimate();
		workitemTimeEstimate.setIdentifier(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.identifier"));
		workitemTimeEstimate.setWorkitemIdentifier(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.workitemIdentifier"));
		workitemTimeEstimate.setSpentTime(_ctx.longValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.spentTime"));
		workitemTimeEstimate.setType(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.type"));
		workitemTimeEstimate.setDescription(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.description"));

		RecordUser recordUser = new RecordUser();
		recordUser.setAccount(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.account"));
		recordUser.setIdentifier(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.identifier"));
		recordUser.setRealName(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.realName"));
		recordUser.setNickName(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.nickName"));
		recordUser.setAvatar(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.avatar"));
		recordUser.setStamp(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.stamp"));
		recordUser.setNameEn(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.nameEn"));
		recordUser.setGender(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.gender"));
		recordUser.setMobile(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.mobile"));
		recordUser.setEmail(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.email"));
		recordUser.setNickNamePinyin(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.nickNamePinyin"));
		recordUser.setRealNamePinyin(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.realNamePinyin"));
		recordUser.setDisplayNickName(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.displayNickName"));
		recordUser.setDisplayRealName(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.displayRealName"));
		recordUser.setDisplayName(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.displayName"));
		recordUser.setDingTalkId(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.dingTalkId"));
		recordUser.setTbRoleId(_ctx.stringValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.tbRoleId"));
		recordUser.setIsDisabled(_ctx.booleanValue("CreateWorkitemEstimateResponse.WorkitemTimeEstimate.recordUser.isDisabled"));
		workitemTimeEstimate.setRecordUser(recordUser);
		createWorkitemEstimateResponse.setWorkitemTimeEstimate(workitemTimeEstimate);
	 
	 	return createWorkitemEstimateResponse;
	}
}