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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.ListListenerCertificatesResponse;
import com.aliyuncs.ga.model.v20191120.ListListenerCertificatesResponse.CertificatesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListListenerCertificatesResponseUnmarshaller {

	public static ListListenerCertificatesResponse unmarshall(ListListenerCertificatesResponse listListenerCertificatesResponse, UnmarshallerContext _ctx) {
		
		listListenerCertificatesResponse.setRequestId(_ctx.stringValue("ListListenerCertificatesResponse.RequestId"));
		listListenerCertificatesResponse.setTotalCount(_ctx.integerValue("ListListenerCertificatesResponse.TotalCount"));
		listListenerCertificatesResponse.setNextToken(_ctx.stringValue("ListListenerCertificatesResponse.NextToken"));
		listListenerCertificatesResponse.setMaxResults(_ctx.integerValue("ListListenerCertificatesResponse.MaxResults"));

		List<CertificatesItem> certificates = new ArrayList<CertificatesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListListenerCertificatesResponse.Certificates.Length"); i++) {
			CertificatesItem certificatesItem = new CertificatesItem();
			certificatesItem.setCertificateId(_ctx.stringValue("ListListenerCertificatesResponse.Certificates["+ i +"].CertificateId"));
			certificatesItem.setIsDefault(_ctx.booleanValue("ListListenerCertificatesResponse.Certificates["+ i +"].IsDefault"));
			certificatesItem.setDomain(_ctx.stringValue("ListListenerCertificatesResponse.Certificates["+ i +"].Domain"));

			certificates.add(certificatesItem);
		}
		listListenerCertificatesResponse.setCertificates(certificates);
	 
	 	return listListenerCertificatesResponse;
	}
}