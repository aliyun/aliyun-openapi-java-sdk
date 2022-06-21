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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetCertsResponse;
import com.aliyuncs.swas.model.v20170810.GetCertsResponse.Cert;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCertsResponseUnmarshaller {

	public static GetCertsResponse unmarshall(GetCertsResponse getCertsResponse, UnmarshallerContext _ctx) {
		
		getCertsResponse.setRequestId(_ctx.stringValue("GetCertsResponse.RequestId"));
		getCertsResponse.setIsSuccess(_ctx.booleanValue("GetCertsResponse.IsSuccess"));
		getCertsResponse.setCode(_ctx.stringValue("GetCertsResponse.Code"));

		List<Cert> certs = new ArrayList<Cert>();
		for (int i = 0; i < _ctx.lengthValue("GetCertsResponse.Certs.Length"); i++) {
			Cert cert = new Cert();
			cert.setEndDate(_ctx.longValue("GetCertsResponse.Certs["+ i +"].EndDate"));
			cert.setExpired(_ctx.booleanValue("GetCertsResponse.Certs["+ i +"].Expired"));
			cert.setCommonName(_ctx.stringValue("GetCertsResponse.Certs["+ i +"].CommonName"));
			cert.setCertName(_ctx.stringValue("GetCertsResponse.Certs["+ i +"].CertName"));
			cert.setIssuer(_ctx.stringValue("GetCertsResponse.Certs["+ i +"].Issuer"));
			cert.setCertId(_ctx.stringValue("GetCertsResponse.Certs["+ i +"].CertId"));

			certs.add(cert);
		}
		getCertsResponse.setCerts(certs);
	 
	 	return getCertsResponse;
	}
}