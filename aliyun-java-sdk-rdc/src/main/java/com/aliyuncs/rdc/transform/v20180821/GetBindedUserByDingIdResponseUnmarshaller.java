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

package com.aliyuncs.rdc.transform.v20180821;

import com.aliyuncs.rdc.model.v20180821.GetBindedUserByDingIdResponse;
import com.aliyuncs.rdc.model.v20180821.GetBindedUserByDingIdResponse.Data;
import com.aliyuncs.rdc.model.v20180821.GetBindedUserByDingIdResponse.Data.AliyunUser;
import com.aliyuncs.rdc.model.v20180821.GetBindedUserByDingIdResponse.Data.DingtalkUser;
import com.aliyuncs.rdc.model.v20180821.GetBindedUserByDingIdResponse.Data.UserProfileDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBindedUserByDingIdResponseUnmarshaller {

	public static GetBindedUserByDingIdResponse unmarshall(GetBindedUserByDingIdResponse getBindedUserByDingIdResponse, UnmarshallerContext _ctx) {
		
		getBindedUserByDingIdResponse.setRequestId(_ctx.stringValue("GetBindedUserByDingIdResponse.RequestId"));
		getBindedUserByDingIdResponse.setCode(_ctx.integerValue("GetBindedUserByDingIdResponse.Code"));
		getBindedUserByDingIdResponse.setSuccess(_ctx.booleanValue("GetBindedUserByDingIdResponse.Success"));

		Data data = new Data();
		data.setNickName(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.NickName"));
		data.setIsValid(_ctx.booleanValue("GetBindedUserByDingIdResponse.Data.IsValid"));
		data.setUuid(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.Uuid"));
		data.setGuid(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.Guid"));
		data.setId(_ctx.integerValue("GetBindedUserByDingIdResponse.Data.Id"));
		data.setMainAccountType(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.MainAccountType"));

		AliyunUser aliyunUser = new AliyunUser();
		aliyunUser.setKp(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.AliyunUser.Kp"));
		aliyunUser.setNickName(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.AliyunUser.NickName"));
		aliyunUser.setHavanaId(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.AliyunUser.HavanaId"));
		aliyunUser.setRealname(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.AliyunUser.Realname"));
		aliyunUser.setTaobaoNick(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.AliyunUser.TaobaoNick"));
		aliyunUser.setAliyunId(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.AliyunUser.AliyunId"));
		aliyunUser.setAccountStructure(_ctx.integerValue("GetBindedUserByDingIdResponse.Data.AliyunUser.AccountStructure"));
		aliyunUser.setId(_ctx.integerValue("GetBindedUserByDingIdResponse.Data.AliyunUser.Id"));
		aliyunUser.setEmail(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.AliyunUser.Email"));
		data.setAliyunUser(aliyunUser);

		DingtalkUser dingtalkUser = new DingtalkUser();
		dingtalkUser.setNick(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.DingtalkUser.Nick"));
		dingtalkUser.setCodeUserName(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.DingtalkUser.CodeUserName"));
		dingtalkUser.setUnionId(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.DingtalkUser.UnionId"));
		dingtalkUser.setDingId(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.DingtalkUser.DingId"));
		dingtalkUser.setDingtalkUserId(_ctx.integerValue("GetBindedUserByDingIdResponse.Data.DingtalkUser.DingtalkUserId"));
		dingtalkUser.setId(_ctx.integerValue("GetBindedUserByDingIdResponse.Data.DingtalkUser.Id"));
		data.setDingtalkUser(dingtalkUser);

		UserProfileDTO userProfileDTO = new UserProfileDTO();
		userProfileDTO.setEnglishName(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.EnglishName"));
		userProfileDTO.setNickName(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.NickName"));
		userProfileDTO.setMobile(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.Mobile"));
		userProfileDTO.setAvatar(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.Avatar"));
		userProfileDTO.setUserId(_ctx.integerValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.UserId"));
		userProfileDTO.setCreatedAt(_ctx.longValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.CreatedAt"));
		userProfileDTO.setName(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.Name"));
		userProfileDTO.setDataSource(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.DataSource"));
		userProfileDTO.setEmail(_ctx.stringValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.Email"));
		data.setUserProfileDTO(userProfileDTO);
		getBindedUserByDingIdResponse.setData(data);
	 
	 	return getBindedUserByDingIdResponse;
	}
}