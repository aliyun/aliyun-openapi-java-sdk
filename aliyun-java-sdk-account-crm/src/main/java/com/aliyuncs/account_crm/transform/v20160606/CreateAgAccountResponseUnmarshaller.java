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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.CreateAgAccountResponse;
import com.aliyuncs.account_crm.model.v20160606.CreateAgAccountResponse.AgRelationDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAgAccountResponseUnmarshaller {

	public static CreateAgAccountResponse unmarshall(CreateAgAccountResponse createAgAccountResponse, UnmarshallerContext _ctx) {
		
		createAgAccountResponse.setRequestId(_ctx.stringValue("CreateAgAccountResponse.RequestId"));
		createAgAccountResponse.setCode(_ctx.stringValue("CreateAgAccountResponse.Code"));
		createAgAccountResponse.setMessage(_ctx.stringValue("CreateAgAccountResponse.Message"));
		createAgAccountResponse.setSuccess(_ctx.booleanValue("CreateAgAccountResponse.Success"));

		AgRelationDto agRelationDto = new AgRelationDto();
		agRelationDto.setType(_ctx.stringValue("CreateAgAccountResponse.AgRelationDto.Type"));
		agRelationDto.setPk(_ctx.stringValue("CreateAgAccountResponse.AgRelationDto.Pk"));
		agRelationDto.setMpk(_ctx.stringValue("CreateAgAccountResponse.AgRelationDto.Mpk"));
		createAgAccountResponse.setAgRelationDto(agRelationDto);
	 
	 	return createAgAccountResponse;
	}
}