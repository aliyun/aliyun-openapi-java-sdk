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

import com.aliyuncs.cas.model.v20180813.DescribeCertificateDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCertificateDetailResponseUnmarshaller {

	public static DescribeCertificateDetailResponse unmarshall(DescribeCertificateDetailResponse describeCertificateDetailResponse, UnmarshallerContext context) {
		
		describeCertificateDetailResponse.setRequestId(context.stringValue("DescribeCertificateDetailResponse.RequestId"));
		describeCertificateDetailResponse.setId(context.longValue("DescribeCertificateDetailResponse.Id"));
		describeCertificateDetailResponse.setSourceType(context.stringValue("DescribeCertificateDetailResponse.SourceType"));
		describeCertificateDetailResponse.setInstanceId(context.stringValue("DescribeCertificateDetailResponse.InstanceId"));
		describeCertificateDetailResponse.setName(context.stringValue("DescribeCertificateDetailResponse.Name"));
		describeCertificateDetailResponse.setOrderId(context.longValue("DescribeCertificateDetailResponse.OrderId"));
		describeCertificateDetailResponse.setYear(context.integerValue("DescribeCertificateDetailResponse.Year"));
		describeCertificateDetailResponse.setBeforeDate(context.longValue("DescribeCertificateDetailResponse.BeforeDate"));
		describeCertificateDetailResponse.setAfterDate(context.longValue("DescribeCertificateDetailResponse.AfterDate"));
		describeCertificateDetailResponse.setFingerPrint(context.stringValue("DescribeCertificateDetailResponse.FingerPrint"));
		describeCertificateDetailResponse.setDomains(context.stringValue("DescribeCertificateDetailResponse.Domains"));
		describeCertificateDetailResponse.setStatusCode(context.stringValue("DescribeCertificateDetailResponse.StatusCode"));
		describeCertificateDetailResponse.setBrandName(context.stringValue("DescribeCertificateDetailResponse.BrandName"));
		describeCertificateDetailResponse.setCertType(context.stringValue("DescribeCertificateDetailResponse.CertType"));
		describeCertificateDetailResponse.setRemainingDays(context.integerValue("DescribeCertificateDetailResponse.RemainingDays"));
	 
	 	return describeCertificateDetailResponse;
	}
}