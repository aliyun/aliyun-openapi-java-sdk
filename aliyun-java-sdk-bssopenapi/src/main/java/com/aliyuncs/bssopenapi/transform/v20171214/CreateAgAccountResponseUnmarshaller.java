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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.CreateAgAccountResponse;
import com.aliyuncs.bssopenapi.model.v20171214.CreateAgAccountResponse.AgRelationDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAgAccountResponseUnmarshaller {

	public static CreateAgAccountResponse unmarshall(CreateAgAccountResponse createAgAccountResponse, UnmarshallerContext context) {
		
		createAgAccountResponse.setRequestId(context.stringValue("CreateAgAccountResponse.RequestId"));
		createAgAccountResponse.setCode(context.stringValue("CreateAgAccountResponse.Code"));
		createAgAccountResponse.setMessage(context.stringValue("CreateAgAccountResponse.Message"));
		createAgAccountResponse.setSuccess(context.booleanValue("CreateAgAccountResponse.Success"));

		AgRelationDto agRelationDto = new AgRelationDto();
		agRelationDto.setPk(context.stringValue("CreateAgAccountResponse.AgRelationDto.Pk"));
		agRelationDto.setType(context.stringValue("CreateAgAccountResponse.AgRelationDto.Type"));
		agRelationDto.setMpk(context.stringValue("CreateAgAccountResponse.AgRelationDto.Mpk"));
		agRelationDto.setRamAdminRoleName(context.stringValue("CreateAgAccountResponse.AgRelationDto.RamAdminRoleName"));
		createAgAccountResponse.setAgRelationDto(agRelationDto);
	 
	 	return createAgAccountResponse;
	}
}