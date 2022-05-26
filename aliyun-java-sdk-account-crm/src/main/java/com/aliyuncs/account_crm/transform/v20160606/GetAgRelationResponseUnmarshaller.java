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

import com.aliyuncs.account_crm.model.v20160606.GetAgRelationResponse;
import com.aliyuncs.account_crm.model.v20160606.GetAgRelationResponse.AgRelationDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgRelationResponseUnmarshaller {

	public static GetAgRelationResponse unmarshall(GetAgRelationResponse getAgRelationResponse, UnmarshallerContext _ctx) {
		
		getAgRelationResponse.setRequestId(_ctx.stringValue("GetAgRelationResponse.RequestId"));
		getAgRelationResponse.setCode(_ctx.stringValue("GetAgRelationResponse.Code"));
		getAgRelationResponse.setMessage(_ctx.stringValue("GetAgRelationResponse.Message"));
		getAgRelationResponse.setSuccess(_ctx.booleanValue("GetAgRelationResponse.Success"));

		AgRelationDto agRelationDto = new AgRelationDto();
		agRelationDto.setType(_ctx.stringValue("GetAgRelationResponse.AgRelationDto.Type"));
		agRelationDto.setPk(_ctx.stringValue("GetAgRelationResponse.AgRelationDto.Pk"));
		agRelationDto.setMpk(_ctx.stringValue("GetAgRelationResponse.AgRelationDto.Mpk"));
		getAgRelationResponse.setAgRelationDto(agRelationDto);
	 
	 	return getAgRelationResponse;
	}
}