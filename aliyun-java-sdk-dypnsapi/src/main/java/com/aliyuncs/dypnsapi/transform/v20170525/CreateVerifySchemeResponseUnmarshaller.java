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

package com.aliyuncs.dypnsapi.transform.v20170525;

import com.aliyuncs.dypnsapi.model.v20170525.CreateVerifySchemeResponse;
import com.aliyuncs.dypnsapi.model.v20170525.CreateVerifySchemeResponse.GateVerifySchemeDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVerifySchemeResponseUnmarshaller {

	public static CreateVerifySchemeResponse unmarshall(CreateVerifySchemeResponse createVerifySchemeResponse, UnmarshallerContext _ctx) {
		
		createVerifySchemeResponse.setRequestId(_ctx.stringValue("CreateVerifySchemeResponse.RequestId"));
		createVerifySchemeResponse.setCode(_ctx.stringValue("CreateVerifySchemeResponse.Code"));
		createVerifySchemeResponse.setMessage(_ctx.stringValue("CreateVerifySchemeResponse.Message"));

		GateVerifySchemeDTO gateVerifySchemeDTO = new GateVerifySchemeDTO();
		gateVerifySchemeDTO.setSchemeCode(_ctx.stringValue("CreateVerifySchemeResponse.GateVerifySchemeDTO.SchemeCode"));
		createVerifySchemeResponse.setGateVerifySchemeDTO(gateVerifySchemeDTO);
	 
	 	return createVerifySchemeResponse;
	}
}