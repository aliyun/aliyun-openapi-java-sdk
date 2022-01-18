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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListSSLCertResponse;
import com.aliyuncs.mse.model.v20190531.ListSSLCertResponse.Domains;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSSLCertResponseUnmarshaller {

	public static ListSSLCertResponse unmarshall(ListSSLCertResponse listSSLCertResponse, UnmarshallerContext _ctx) {
		
		listSSLCertResponse.setRequestId(_ctx.stringValue("ListSSLCertResponse.RequestId"));
		listSSLCertResponse.setHttpStatusCode(_ctx.integerValue("ListSSLCertResponse.HttpStatusCode"));
		listSSLCertResponse.setMessage(_ctx.stringValue("ListSSLCertResponse.Message"));
		listSSLCertResponse.setCode(_ctx.integerValue("ListSSLCertResponse.Code"));
		listSSLCertResponse.setSuccess(_ctx.booleanValue("ListSSLCertResponse.Success"));

		List<Domains> data = new ArrayList<Domains>();
		for (int i = 0; i < _ctx.lengthValue("ListSSLCertResponse.Data.Length"); i++) {
			Domains domains = new Domains();
			domains.setCertIdentifier(_ctx.stringValue("ListSSLCertResponse.Data["+ i +"].CertIdentifier"));
			domains.setCertName(_ctx.stringValue("ListSSLCertResponse.Data["+ i +"].CertName"));
			domains.setCommonName(_ctx.stringValue("ListSSLCertResponse.Data["+ i +"].CommonName"));
			domains.setSans(_ctx.stringValue("ListSSLCertResponse.Data["+ i +"].Sans"));
			domains.setBeforeDate(_ctx.stringValue("ListSSLCertResponse.Data["+ i +"].BeforeDate"));
			domains.setAfterDate(_ctx.stringValue("ListSSLCertResponse.Data["+ i +"].AfterDate"));
			domains.setAlgorithm(_ctx.stringValue("ListSSLCertResponse.Data["+ i +"].Algorithm"));
			domains.setIssuer(_ctx.stringValue("ListSSLCertResponse.Data["+ i +"].Issuer"));
			domains.setGmtBefore(_ctx.stringValue("ListSSLCertResponse.Data["+ i +"].GmtBefore"));
			domains.setGmtAfter(_ctx.stringValue("ListSSLCertResponse.Data["+ i +"].GmtAfter"));

			data.add(domains);
		}
		listSSLCertResponse.setData(data);
	 
	 	return listSSLCertResponse;
	}
}