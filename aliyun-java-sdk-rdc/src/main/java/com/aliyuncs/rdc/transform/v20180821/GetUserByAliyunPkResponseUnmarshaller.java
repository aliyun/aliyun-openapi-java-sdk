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

	public static GetUserByAliyunPkResponse unmarshall(GetUserByAliyunPkResponse getUserByAliyunPkResponse, UnmarshallerContext _ctx) {
		
		getUserByAliyunPkResponse.setRequestId(_ctx.stringValue("GetUserByAliyunPkResponse.RequestId"));
		getUserByAliyunPkResponse.setCode(_ctx.integerValue("GetUserByAliyunPkResponse.Code"));
		getUserByAliyunPkResponse.setSuccess(_ctx.booleanValue("GetUserByAliyunPkResponse.Success"));

		Data data = new Data();
		data.setNickName(_ctx.stringValue("GetUserByAliyunPkResponse.Data.NickName"));
		data.setIsValid(_ctx.booleanValue("GetUserByAliyunPkResponse.Data.IsValid"));
		data.setUuid(_ctx.stringValue("GetUserByAliyunPkResponse.Data.Uuid"));
		data.setGuid(_ctx.stringValue("GetUserByAliyunPkResponse.Data.Guid"));
		data.setId(_ctx.integerValue("GetUserByAliyunPkResponse.Data.Id"));
		data.setMainAccountType(_ctx.stringValue("GetUserByAliyunPkResponse.Data.MainAccountType"));

		AliyunUser aliyunUser = new AliyunUser();
		aliyunUser.setKp(_ctx.stringValue("GetUserByAliyunPkResponse.Data.AliyunUser.Kp"));
		aliyunUser.setNickName(_ctx.stringValue("GetUserByAliyunPkResponse.Data.AliyunUser.NickName"));
		aliyunUser.setHavanaId(_ctx.stringValue("GetUserByAliyunPkResponse.Data.AliyunUser.HavanaId"));
		aliyunUser.setRealname(_ctx.stringValue("GetUserByAliyunPkResponse.Data.AliyunUser.Realname"));
		aliyunUser.setTaobaoNick(_ctx.stringValue("GetUserByAliyunPkResponse.Data.AliyunUser.TaobaoNick"));
		aliyunUser.setAliyunId(_ctx.stringValue("GetUserByAliyunPkResponse.Data.AliyunUser.AliyunId"));
		aliyunUser.setAccountStructure(_ctx.integerValue("GetUserByAliyunPkResponse.Data.AliyunUser.AccountStructure"));
		aliyunUser.setId(_ctx.integerValue("GetUserByAliyunPkResponse.Data.AliyunUser.Id"));
		aliyunUser.setEmail(_ctx.stringValue("GetUserByAliyunPkResponse.Data.AliyunUser.Email"));
		data.setAliyunUser(aliyunUser);

		DingtalkUser dingtalkUser = new DingtalkUser();
		dingtalkUser.setNick(_ctx.stringValue("GetUserByAliyunPkResponse.Data.DingtalkUser.Nick"));
		dingtalkUser.setCodeUserName(_ctx.stringValue("GetUserByAliyunPkResponse.Data.DingtalkUser.CodeUserName"));
		dingtalkUser.setUnionId(_ctx.stringValue("GetUserByAliyunPkResponse.Data.DingtalkUser.UnionId"));
		dingtalkUser.setDingId(_ctx.stringValue("GetUserByAliyunPkResponse.Data.DingtalkUser.DingId"));
		dingtalkUser.setDingtalkUserId(_ctx.integerValue("GetUserByAliyunPkResponse.Data.DingtalkUser.DingtalkUserId"));
		dingtalkUser.setId(_ctx.integerValue("GetUserByAliyunPkResponse.Data.DingtalkUser.Id"));
		data.setDingtalkUser(dingtalkUser);

		UserProfileDTO userProfileDTO = new UserProfileDTO();
		userProfileDTO.setEnglishName(_ctx.stringValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.EnglishName"));
		userProfileDTO.setNickName(_ctx.stringValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.NickName"));
		userProfileDTO.setMobile(_ctx.stringValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.Mobile"));
		userProfileDTO.setAvatar(_ctx.stringValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.Avatar"));
		userProfileDTO.setUserId(_ctx.integerValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.UserId"));
		userProfileDTO.setCreatedAt(_ctx.longValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.CreatedAt"));
		userProfileDTO.setName(_ctx.stringValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.Name"));
		userProfileDTO.setDataSource(_ctx.stringValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.DataSource"));
		userProfileDTO.setEmail(_ctx.stringValue("GetUserByAliyunPkResponse.Data.UserProfileDTO.Email"));
		data.setUserProfileDTO(userProfileDTO);
		getUserByAliyunPkResponse.setData(data);
	 
	 	return getUserByAliyunPkResponse;
	}
}