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

package com.aliyuncs.cas.transform.v20200407;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20200407.ListCertResponse;
import com.aliyuncs.cas.model.v20200407.ListCertResponse.Cert;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCertResponseUnmarshaller {

	public static ListCertResponse unmarshall(ListCertResponse listCertResponse, UnmarshallerContext _ctx) {
		
		listCertResponse.setRequestId(_ctx.stringValue("ListCertResponse.RequestId"));
		listCertResponse.setShowSize(_ctx.longValue("ListCertResponse.ShowSize"));
		listCertResponse.setCurrentPage(_ctx.longValue("ListCertResponse.CurrentPage"));
		listCertResponse.setTotalCount(_ctx.longValue("ListCertResponse.TotalCount"));

		List<Cert> certList = new ArrayList<Cert>();
		for (int i = 0; i < _ctx.lengthValue("ListCertResponse.CertList.Length"); i++) {
			Cert cert = new Cert();
			cert.setWhId(_ctx.longValue("ListCertResponse.CertList["+ i +"].WhId"));
			cert.setIdentifier(_ctx.stringValue("ListCertResponse.CertList["+ i +"].Identifier"));
			cert.setWhInstanceId(_ctx.stringValue("ListCertResponse.CertList["+ i +"].WhInstanceId"));
			cert.setStatus(_ctx.stringValue("ListCertResponse.CertList["+ i +"].Status"));
			cert.setSourceType(_ctx.stringValue("ListCertResponse.CertList["+ i +"].SourceType"));
			cert.setCommonName(_ctx.stringValue("ListCertResponse.CertList["+ i +"].CommonName"));
			cert.setBeforeDate(_ctx.longValue("ListCertResponse.CertList["+ i +"].BeforeDate"));
			cert.setIssuer(_ctx.stringValue("ListCertResponse.CertList["+ i +"].Issuer"));
			cert.setAfterDate(_ctx.longValue("ListCertResponse.CertList["+ i +"].AfterDate"));
			cert.setExistPrivateKey(_ctx.booleanValue("ListCertResponse.CertList["+ i +"].ExistPrivateKey"));
			cert.setSans(_ctx.stringValue("ListCertResponse.CertList["+ i +"].Sans"));

			certList.add(cert);
		}
		listCertResponse.setCertList(certList);
	 
	 	return listCertResponse;
	}
}