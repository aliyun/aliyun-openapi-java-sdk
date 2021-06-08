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

package com.aliyuncs.alb.transform.v20200616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alb.model.v20200616.ListListenerCertificatesResponse;
import com.aliyuncs.alb.model.v20200616.ListListenerCertificatesResponse.CertificateModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListListenerCertificatesResponseUnmarshaller {

	public static ListListenerCertificatesResponse unmarshall(ListListenerCertificatesResponse listListenerCertificatesResponse, UnmarshallerContext _ctx) {
		
		listListenerCertificatesResponse.setRequestId(_ctx.stringValue("ListListenerCertificatesResponse.RequestId"));
		listListenerCertificatesResponse.setMaxResults(_ctx.integerValue("ListListenerCertificatesResponse.MaxResults"));
		listListenerCertificatesResponse.setNextToken(_ctx.stringValue("ListListenerCertificatesResponse.NextToken"));
		listListenerCertificatesResponse.setTotalCount(_ctx.integerValue("ListListenerCertificatesResponse.TotalCount"));

		List<CertificateModel> certificates = new ArrayList<CertificateModel>();
		for (int i = 0; i < _ctx.lengthValue("ListListenerCertificatesResponse.Certificates.Length"); i++) {
			CertificateModel certificateModel = new CertificateModel();
			certificateModel.setCertificateId(_ctx.stringValue("ListListenerCertificatesResponse.Certificates["+ i +"].CertificateId"));
			certificateModel.setIsDefault(_ctx.booleanValue("ListListenerCertificatesResponse.Certificates["+ i +"].IsDefault"));
			certificateModel.setStatus(_ctx.stringValue("ListListenerCertificatesResponse.Certificates["+ i +"].Status"));
			certificateModel.setCertificateType(_ctx.stringValue("ListListenerCertificatesResponse.Certificates["+ i +"].CertificateType"));

			certificates.add(certificateModel);
		}
		listListenerCertificatesResponse.setCertificates(certificates);
	 
	 	return listListenerCertificatesResponse;
	}
}