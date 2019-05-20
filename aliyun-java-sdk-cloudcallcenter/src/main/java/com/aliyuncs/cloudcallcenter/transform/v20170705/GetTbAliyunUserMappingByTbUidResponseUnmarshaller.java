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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetTbAliyunUserMappingByTbUidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTbAliyunUserMappingByTbUidResponseUnmarshaller {

	public static GetTbAliyunUserMappingByTbUidResponse unmarshall(GetTbAliyunUserMappingByTbUidResponse getTbAliyunUserMappingByTbUidResponse, UnmarshallerContext context) {
		
		getTbAliyunUserMappingByTbUidResponse.setRequestId(context.stringValue("GetTbAliyunUserMappingByTbUidResponse.RequestId"));
		getTbAliyunUserMappingByTbUidResponse.setSuccess(context.booleanValue("GetTbAliyunUserMappingByTbUidResponse.Success"));
		getTbAliyunUserMappingByTbUidResponse.setCode(context.stringValue("GetTbAliyunUserMappingByTbUidResponse.Code"));
		getTbAliyunUserMappingByTbUidResponse.setMessage(context.stringValue("GetTbAliyunUserMappingByTbUidResponse.Message"));
		getTbAliyunUserMappingByTbUidResponse.setHttpStatusCode(context.integerValue("GetTbAliyunUserMappingByTbUidResponse.HttpStatusCode"));
		getTbAliyunUserMappingByTbUidResponse.setId(context.longValue("GetTbAliyunUserMappingByTbUidResponse.Id"));
		getTbAliyunUserMappingByTbUidResponse.setTbUserid(context.longValue("GetTbAliyunUserMappingByTbUidResponse.TbUserid"));
		getTbAliyunUserMappingByTbUidResponse.setTbNickname(context.stringValue("GetTbAliyunUserMappingByTbUidResponse.TbNickname"));
		getTbAliyunUserMappingByTbUidResponse.setAliyunPk(context.longValue("GetTbAliyunUserMappingByTbUidResponse.AliyunPk"));
		getTbAliyunUserMappingByTbUidResponse.setSubAccount(context.booleanValue("GetTbAliyunUserMappingByTbUidResponse.SubAccount"));
		getTbAliyunUserMappingByTbUidResponse.setPrimaryAccountPk(context.longValue("GetTbAliyunUserMappingByTbUidResponse.PrimaryAccountPk"));
		getTbAliyunUserMappingByTbUidResponse.setAliyunAkId(context.stringValue("GetTbAliyunUserMappingByTbUidResponse.AliyunAkId"));
		getTbAliyunUserMappingByTbUidResponse.setAliyunAkSecret(context.stringValue("GetTbAliyunUserMappingByTbUidResponse.AliyunAkSecret"));
		getTbAliyunUserMappingByTbUidResponse.setTaobaoAccessToken(context.stringValue("GetTbAliyunUserMappingByTbUidResponse.TaobaoAccessToken"));
		getTbAliyunUserMappingByTbUidResponse.setTaobaoAccessTokenExpiresIn(context.integerValue("GetTbAliyunUserMappingByTbUidResponse.TaobaoAccessTokenExpiresIn"));
		getTbAliyunUserMappingByTbUidResponse.setTaobaoAccessTokenCreate(context.longValue("GetTbAliyunUserMappingByTbUidResponse.TaobaoAccessTokenCreate"));
	 
	 	return getTbAliyunUserMappingByTbUidResponse;
	}
}