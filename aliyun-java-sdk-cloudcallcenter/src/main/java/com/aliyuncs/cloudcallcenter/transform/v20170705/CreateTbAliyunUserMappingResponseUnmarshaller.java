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

import com.aliyuncs.cloudcallcenter.model.v20170705.CreateTbAliyunUserMappingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTbAliyunUserMappingResponseUnmarshaller {

	public static CreateTbAliyunUserMappingResponse unmarshall(CreateTbAliyunUserMappingResponse createTbAliyunUserMappingResponse, UnmarshallerContext context) {
		
		createTbAliyunUserMappingResponse.setRequestId(context.stringValue("CreateTbAliyunUserMappingResponse.RequestId"));
		createTbAliyunUserMappingResponse.setSuccess(context.booleanValue("CreateTbAliyunUserMappingResponse.Success"));
		createTbAliyunUserMappingResponse.setCode(context.stringValue("CreateTbAliyunUserMappingResponse.Code"));
		createTbAliyunUserMappingResponse.setMessage(context.stringValue("CreateTbAliyunUserMappingResponse.Message"));
		createTbAliyunUserMappingResponse.setHttpStatusCode(context.integerValue("CreateTbAliyunUserMappingResponse.HttpStatusCode"));
		createTbAliyunUserMappingResponse.setId(context.longValue("CreateTbAliyunUserMappingResponse.Id"));
		createTbAliyunUserMappingResponse.setTbUserid(context.longValue("CreateTbAliyunUserMappingResponse.TbUserid"));
		createTbAliyunUserMappingResponse.setTbNickname(context.stringValue("CreateTbAliyunUserMappingResponse.TbNickname"));
		createTbAliyunUserMappingResponse.setAliyunPk(context.longValue("CreateTbAliyunUserMappingResponse.AliyunPk"));
		createTbAliyunUserMappingResponse.setSubAccount(context.booleanValue("CreateTbAliyunUserMappingResponse.SubAccount"));
		createTbAliyunUserMappingResponse.setPrimaryAccountPk(context.longValue("CreateTbAliyunUserMappingResponse.PrimaryAccountPk"));
		createTbAliyunUserMappingResponse.setAliyunAkId(context.stringValue("CreateTbAliyunUserMappingResponse.AliyunAkId"));
	 
	 	return createTbAliyunUserMappingResponse;
	}
}