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

package com.aliyuncs.mhub.transform.v20170825;

import com.aliyuncs.mhub.model.v20170825.VerifyCertResponse;
import com.aliyuncs.mhub.model.v20170825.VerifyCertResponse.CertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyCertResponseUnmarshaller {

	public static VerifyCertResponse unmarshall(VerifyCertResponse verifyCertResponse, UnmarshallerContext _ctx) {
		
		verifyCertResponse.setRequestId(_ctx.stringValue("VerifyCertResponse.RequestId"));
		verifyCertResponse.setParseMessage(_ctx.stringValue("VerifyCertResponse.ParseMessage"));

		CertInfo certInfo = new CertInfo();
		certInfo.setAppName(_ctx.stringValue("VerifyCertResponse.CertInfo.AppName"));
		certInfo.setCertType(_ctx.stringValue("VerifyCertResponse.CertInfo.CertType"));
		certInfo.setCertMode(_ctx.stringValue("VerifyCertResponse.CertInfo.CertMode"));
		certInfo.setExpirationDate(_ctx.stringValue("VerifyCertResponse.CertInfo.ExpirationDate"));
		certInfo.setGenerateDate(_ctx.stringValue("VerifyCertResponse.CertInfo.GenerateDate"));
		verifyCertResponse.setCertInfo(certInfo);
	 
	 	return verifyCertResponse;
	}
}