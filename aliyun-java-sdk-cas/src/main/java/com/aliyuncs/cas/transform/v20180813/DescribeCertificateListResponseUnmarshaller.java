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

package com.aliyuncs.cas.transform.v20180813;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20180813.DescribeCertificateListResponse;
import com.aliyuncs.cas.model.v20180813.DescribeCertificateListResponse.Certificate;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCertificateListResponseUnmarshaller {

	public static DescribeCertificateListResponse unmarshall(DescribeCertificateListResponse describeCertificateListResponse, UnmarshallerContext context) {
		
		describeCertificateListResponse.setRequestId(context.stringValue("DescribeCertificateListResponse.RequestId"));
		describeCertificateListResponse.setTotalCount(context.integerValue("DescribeCertificateListResponse.TotalCount"));
		describeCertificateListResponse.setShowSize(context.integerValue("DescribeCertificateListResponse.ShowSize"));
		describeCertificateListResponse.setCurrentPage(context.integerValue("DescribeCertificateListResponse.CurrentPage"));

		List<Certificate> certificateList = new ArrayList<Certificate>();
		for (int i = 0; i < context.lengthValue("DescribeCertificateListResponse.CertificateList.Length"); i++) {
			Certificate certificate = new Certificate();
			certificate.setId(context.longValue("DescribeCertificateListResponse.CertificateList["+ i +"].Id"));
			certificate.setName(context.stringValue("DescribeCertificateListResponse.CertificateList["+ i +"].Name"));
			certificate.setSourceType(context.stringValue("DescribeCertificateListResponse.CertificateList["+ i +"].SourceType"));
			certificate.setCertType(context.stringValue("DescribeCertificateListResponse.CertificateList["+ i +"].CertType"));
			certificate.setInstanceId(context.stringValue("DescribeCertificateListResponse.CertificateList["+ i +"].InstanceId"));
			certificate.setOrderId(context.longValue("DescribeCertificateListResponse.CertificateList["+ i +"].OrderId"));
			certificate.setOrderType(context.stringValue("DescribeCertificateListResponse.CertificateList["+ i +"].OrderType"));
			certificate.setBrandName(context.stringValue("DescribeCertificateListResponse.CertificateList["+ i +"].BrandName"));
			certificate.setBeforeDate(context.longValue("DescribeCertificateListResponse.CertificateList["+ i +"].BeforeDate"));
			certificate.setAfterDate(context.longValue("DescribeCertificateListResponse.CertificateList["+ i +"].AfterDate"));
			certificate.setYear(context.integerValue("DescribeCertificateListResponse.CertificateList["+ i +"].Year"));
			certificate.setDomain(context.stringValue("DescribeCertificateListResponse.CertificateList["+ i +"].Domain"));
			certificate.setRemainingDays(context.integerValue("DescribeCertificateListResponse.CertificateList["+ i +"].RemainingDays"));
			certificate.setDeploymentCloudProduct(context.stringValue("DescribeCertificateListResponse.CertificateList["+ i +"].DeploymentCloudProduct"));
			certificate.setStatusCode(context.stringValue("DescribeCertificateListResponse.CertificateList["+ i +"].StatusCode"));
			certificate.setNewBuyCertType(context.stringValue("DescribeCertificateListResponse.CertificateList["+ i +"].NewBuyCertType"));
			certificate.setNewBuyDomainType(context.stringValue("DescribeCertificateListResponse.CertificateList["+ i +"].NewBuyDomainType"));
			certificate.setNewBuyBrand(context.stringValue("DescribeCertificateListResponse.CertificateList["+ i +"].NewBuyBrand"));
			certificate.setShowDeployment(context.integerValue("DescribeCertificateListResponse.CertificateList["+ i +"].ShowDeployment"));

			certificateList.add(certificate);
		}
		describeCertificateListResponse.setCertificateList(certificateList);
	 
	 	return describeCertificateListResponse;
	}
}