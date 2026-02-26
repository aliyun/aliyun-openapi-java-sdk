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

import com.aliyuncs.dypnsapi.model.v20170525.VerifyMobileResponse;
import com.aliyuncs.dypnsapi.model.v20170525.VerifyMobileResponse.GateVerifyResultDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyMobileResponseUnmarshaller {

	public static VerifyMobileResponse unmarshall(VerifyMobileResponse verifyMobileResponse, UnmarshallerContext _ctx) {
		
		verifyMobileResponse.setRequestId(_ctx.stringValue("VerifyMobileResponse.RequestId"));
		verifyMobileResponse.setCode(_ctx.stringValue("VerifyMobileResponse.Code"));
		verifyMobileResponse.setMessage(_ctx.stringValue("VerifyMobileResponse.Message"));

		GateVerifyResultDTO gateVerifyResultDTO = new GateVerifyResultDTO();
		gateVerifyResultDTO.setVerifyResult(_ctx.stringValue("VerifyMobileResponse.GateVerifyResultDTO.VerifyResult"));
		gateVerifyResultDTO.setVerifyId(_ctx.stringValue("VerifyMobileResponse.GateVerifyResultDTO.VerifyId"));
		verifyMobileResponse.setGateVerifyResultDTO(gateVerifyResultDTO);
	 
	 	return verifyMobileResponse;
	}
}