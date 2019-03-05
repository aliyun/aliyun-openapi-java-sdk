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

	public static GetBindedUserByDingIdResponse unmarshall(GetBindedUserByDingIdResponse getBindedUserByDingIdResponse, UnmarshallerContext context) {
		
		getBindedUserByDingIdResponse.setRequestId(context.stringValue("GetBindedUserByDingIdResponse.RequestId"));
		getBindedUserByDingIdResponse.setCode(context.integerValue("GetBindedUserByDingIdResponse.Code"));
		getBindedUserByDingIdResponse.setSuccess(context.booleanValue("GetBindedUserByDingIdResponse.Success"));

		Data data = new Data();
		data.setNickName(context.stringValue("GetBindedUserByDingIdResponse.Data.NickName"));
		data.setIsValid(context.booleanValue("GetBindedUserByDingIdResponse.Data.IsValid"));
		data.setUuid(context.stringValue("GetBindedUserByDingIdResponse.Data.Uuid"));
		data.setGuid(context.stringValue("GetBindedUserByDingIdResponse.Data.Guid"));
		data.setId(context.integerValue("GetBindedUserByDingIdResponse.Data.Id"));
		data.setMainAccountType(context.stringValue("GetBindedUserByDingIdResponse.Data.MainAccountType"));

		AliyunUser aliyunUser = new AliyunUser();
		aliyunUser.setKp(context.stringValue("GetBindedUserByDingIdResponse.Data.AliyunUser.Kp"));
		aliyunUser.setNickName(context.stringValue("GetBindedUserByDingIdResponse.Data.AliyunUser.NickName"));
		aliyunUser.setHavanaId(context.stringValue("GetBindedUserByDingIdResponse.Data.AliyunUser.HavanaId"));
		aliyunUser.setRealname(context.stringValue("GetBindedUserByDingIdResponse.Data.AliyunUser.Realname"));
		aliyunUser.setTaobaoNick(context.stringValue("GetBindedUserByDingIdResponse.Data.AliyunUser.TaobaoNick"));
		aliyunUser.setAliyunId(context.stringValue("GetBindedUserByDingIdResponse.Data.AliyunUser.AliyunId"));
		aliyunUser.setAccountStructure(context.integerValue("GetBindedUserByDingIdResponse.Data.AliyunUser.AccountStructure"));
		aliyunUser.setId(context.integerValue("GetBindedUserByDingIdResponse.Data.AliyunUser.Id"));
		aliyunUser.setEmail(context.stringValue("GetBindedUserByDingIdResponse.Data.AliyunUser.Email"));
		data.setAliyunUser(aliyunUser);

		DingtalkUser dingtalkUser = new DingtalkUser();
		dingtalkUser.setNick(context.stringValue("GetBindedUserByDingIdResponse.Data.DingtalkUser.Nick"));
		dingtalkUser.setCodeUserName(context.stringValue("GetBindedUserByDingIdResponse.Data.DingtalkUser.CodeUserName"));
		dingtalkUser.setUnionId(context.stringValue("GetBindedUserByDingIdResponse.Data.DingtalkUser.UnionId"));
		dingtalkUser.setDingId(context.stringValue("GetBindedUserByDingIdResponse.Data.DingtalkUser.DingId"));
		dingtalkUser.setDingtalkUserId(context.integerValue("GetBindedUserByDingIdResponse.Data.DingtalkUser.DingtalkUserId"));
		dingtalkUser.setId(context.integerValue("GetBindedUserByDingIdResponse.Data.DingtalkUser.Id"));
		data.setDingtalkUser(dingtalkUser);

		UserProfileDTO userProfileDTO = new UserProfileDTO();
		userProfileDTO.setEnglishName(context.stringValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.EnglishName"));
		userProfileDTO.setNickName(context.stringValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.NickName"));
		userProfileDTO.setMobile(context.stringValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.Mobile"));
		userProfileDTO.setAvatar(context.stringValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.Avatar"));
		userProfileDTO.setUserId(context.integerValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.UserId"));
		userProfileDTO.setCreatedAt(context.longValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.CreatedAt"));
		userProfileDTO.setName(context.stringValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.Name"));
		userProfileDTO.setDataSource(context.stringValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.DataSource"));
		userProfileDTO.setEmail(context.stringValue("GetBindedUserByDingIdResponse.Data.UserProfileDTO.Email"));
		data.setUserProfileDTO(userProfileDTO);
		getBindedUserByDingIdResponse.setData(data);
	 
	 	return getBindedUserByDingIdResponse;
	}
}