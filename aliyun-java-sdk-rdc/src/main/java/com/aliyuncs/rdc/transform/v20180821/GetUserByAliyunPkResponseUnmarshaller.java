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

import com.aliyuncs.rdc.model.v20180821.GetUserByAliyunPkResponse;
import com.aliyuncs.rdc.model.v20180821.GetUserByAliyunPkResponse.Data;
import com.aliyuncs.rdc.model.v20180821.GetUserByAliyunPkResponse.Data.AliyunUser;
import com.aliyuncs.rdc.model.v20180821.GetUserByAliyunPkResponse.Data.DingtalkUser;
import com.aliyuncs.rdc.model.v20180821.GetUserByAliyunPkResponse.Data.UserProfileDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserByAliyunPkResponseUnmarshaller {

	public static GetUserByAliyunPkResponse unmarshall(GetUserByAliyunPkResponse getUserByAliyunPkResponse, UnmarshallerContext context) {
		
		getUserByAliyunPkResponse.setRequestId(context.stringValue("GetUserByAliyunPkResponse.RequestId"));
		getUserByAliyunPkResponse.setCode(context.integerValue("GetUserByAliyunPkResponse.Code"));
		getUserByAliyunPkResponse.setSuccess(context.booleanValue("GetUserByAliyunPkResponse.Success"));

		Data data = new Data();
		data.setNickName(context.stringValue("GetUserByAliyunPkResponse.Data.NickName"));
		data.setIsValid(context.booleanValue("GetUserByAliyunPkResponse.Data.IsValid"));
		data.setUuid(context.stringValue("GetUserByAliyunPkResponse.Data.Uuid"));
		data.setGuid(context.stringValue("GetUserByAliyunPkResponse.Data.Guid"));
		data.setId(context.integerValue("GetUserByAliyunPkResponse.Data.Id"));
		data.setMainAccountType(context.stringValue("GetUserByAliyunPkResponse.Data.MainAccountType"));

		AliyunUser aliyunUser = new AliyunUser();
		aliyunUser.setKp(context.stringValue("GetUserByAliyunPkResponse.Data.AliyunUser.Kp"));
		aliyunUser.setNickName(context.stringValue("GetUserByAliyunPkResponse.Data.AliyunUser.NickName"));
		aliyunUser.setHavanaId(context.stringValue("GetUserByAliyunPkResponse.Data.AliyunUser.HavanaId"));
		aliyunUser.setRealname(context.stringValue("GetUserByAliyunPkResponse.Data.AliyunUser.Realname"));
		aliyunUser.setTaobaoNick(context.stringValue("GetUserByAliyunPkResponse.Data.AliyunUser.TaobaoNick"));
		aliyunUser.setAliyunId(context.stringValue("GetUserByAliyunPkResponse.Data.AliyunUser.AliyunId"));
		aliyunUser.setAccountStructure(context.integerValue("GetUserByAliyunPkResponse.Data.AliyunUser.AccountStructure"));
		aliyunUser.setId(context.integerValue("GetUserByAliyunPkResponse.Data.AliyunUser.Id"));
		aliyunUser.setEmail(context.stringValue("GetUserByAliyunPkResponse.Data.AliyunUser.Email"));
		data.setAliyunUser(aliyunUser);

		DingtalkUser dingtalkUser = new DingtalkUser();
		dingtalkUser.setNick(context.stringValue("GetUserByAliyunPkResponse.Data.DingtalkUser.Nick"));
		dingtalkUser.setCodeUserName(context.stringValue("GetUserByAliyunPkResponse.Data.DingtalkUser.CodeUserName"));
		dingtalkUser.setUnionId(context.stringValue("GetUserByAliyunPkResponse.Data.DingtalkUser.UnionId"));
		dingtalkUser.setDingId(context.stringValue("GetUserByAliyunPkResponse.Data.DingtalkUser.DingId"));
		dingtalkUser.setDingtalkUserId(context.integerValue("GetUserByAliyunPkResponse.Data.DingtalkUser.DingtalkUserId"));
		dingtalkUser.setId(context.integerValue("GetUserByAliyunPkResponse.Data.DingtalkUser.Id"));
		data.setDingtalkUser(dingtalkUser);

		UserProfileDTO userProfileDTO = new UserProfileDTO();
		userProfileDTO.setEnglishName(context.stringValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.EnglishName"));
		userProfileDTO.setNickName(context.stringValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.NickName"));
		userProfileDTO.setMobile(context.stringValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.Mobile"));
		userProfileDTO.setAvatar(context.stringValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.Avatar"));
		userProfileDTO.setUserId(context.integerValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.UserId"));
		userProfileDTO.setCreatedAt(context.longValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.CreatedAt"));
		userProfileDTO.setName(context.stringValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.Name"));
		userProfileDTO.setDataSource(context.stringValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.DataSource"));
		userProfileDTO.setEmail(context.stringValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.Email"));
		data.setUserProfileDTO(userProfileDTO);
		getUserByAliyunPkResponse.setData(data);
	 
	 	return getUserByAliyunPkResponse;
	}
}