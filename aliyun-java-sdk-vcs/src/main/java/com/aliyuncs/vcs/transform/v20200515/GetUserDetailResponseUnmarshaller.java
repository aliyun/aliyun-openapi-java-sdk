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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.GetUserDetailResponse;
import com.aliyuncs.vcs.model.v20200515.GetUserDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserDetailResponseUnmarshaller {

	public static GetUserDetailResponse unmarshall(GetUserDetailResponse getUserDetailResponse, UnmarshallerContext _ctx) {
		
		getUserDetailResponse.setRequestId(_ctx.stringValue("GetUserDetailResponse.RequestId"));
		getUserDetailResponse.setCode(_ctx.stringValue("GetUserDetailResponse.Code"));
		getUserDetailResponse.setMessage(_ctx.stringValue("GetUserDetailResponse.Message"));

		Data data = new Data();
		data.setAddress(_ctx.stringValue("GetUserDetailResponse.Data.Address"));
		data.setAge(_ctx.stringValue("GetUserDetailResponse.Data.Age"));
		data.setAttachment(_ctx.stringValue("GetUserDetailResponse.Data.Attachment"));
		data.setBizId(_ctx.stringValue("GetUserDetailResponse.Data.BizId"));
		data.setFaceImageUrl(_ctx.stringValue("GetUserDetailResponse.Data.FaceImageUrl"));
		data.setGender(_ctx.stringValue("GetUserDetailResponse.Data.Gender"));
		data.setIdNumber(_ctx.stringValue("GetUserDetailResponse.Data.IdNumber"));
		data.setPhoneNo(_ctx.stringValue("GetUserDetailResponse.Data.PhoneNo"));
		data.setPlateNo(_ctx.stringValue("GetUserDetailResponse.Data.PlateNo"));
		data.setUserGroupId(_ctx.integerValue("GetUserDetailResponse.Data.UserGroupId"));
		data.setUserId(_ctx.integerValue("GetUserDetailResponse.Data.UserId"));
		data.setUserName(_ctx.stringValue("GetUserDetailResponse.Data.UserName"));
		data.setIsvSubId(_ctx.stringValue("GetUserDetailResponse.Data.IsvSubId"));
		getUserDetailResponse.setData(data);
	 
	 	return getUserDetailResponse;
	}
}