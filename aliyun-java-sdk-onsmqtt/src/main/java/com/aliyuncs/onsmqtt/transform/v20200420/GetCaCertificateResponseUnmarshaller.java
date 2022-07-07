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

package com.aliyuncs.onsmqtt.transform.v20200420;

import com.aliyuncs.onsmqtt.model.v20200420.GetCaCertificateResponse;
import com.aliyuncs.onsmqtt.model.v20200420.GetCaCertificateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCaCertificateResponseUnmarshaller {

	public static GetCaCertificateResponse unmarshall(GetCaCertificateResponse getCaCertificateResponse, UnmarshallerContext _ctx) {
		
		getCaCertificateResponse.setRequestId(_ctx.stringValue("GetCaCertificateResponse.RequestId"));

		Data data = new Data();
		data.setRegistrationCode(_ctx.stringValue("GetCaCertificateResponse.Data.RegistrationCode"));
		data.setCaName(_ctx.stringValue("GetCaCertificateResponse.Data.CaName"));
		data.setSn(_ctx.stringValue("GetCaCertificateResponse.Data.Sn"));
		data.setCaContent(_ctx.stringValue("GetCaCertificateResponse.Data.CaContent"));
		data.setVerificationContent(_ctx.stringValue("GetCaCertificateResponse.Data.VerificationContent"));
		data.setValidBegin(_ctx.stringValue("GetCaCertificateResponse.Data.ValidBegin"));
		data.setValidEnd(_ctx.stringValue("GetCaCertificateResponse.Data.ValidEnd"));
		data.setStatus(_ctx.stringValue("GetCaCertificateResponse.Data.Status"));
		getCaCertificateResponse.setData(data);
	 
	 	return getCaCertificateResponse;
	}
}