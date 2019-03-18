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

import com.aliyuncs.cas.model.v20180813.DescribeCertificateStatusCountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCertificateStatusCountResponseUnmarshaller {

	public static DescribeCertificateStatusCountResponse unmarshall(DescribeCertificateStatusCountResponse describeCertificateStatusCountResponse, UnmarshallerContext context) {
		
		describeCertificateStatusCountResponse.setRequestId(context.stringValue("DescribeCertificateStatusCountResponse.RequestId"));
		describeCertificateStatusCountResponse.setPayed(context.integerValue("DescribeCertificateStatusCountResponse.Payed"));
		describeCertificateStatusCountResponse.setChecking(context.integerValue("DescribeCertificateStatusCountResponse.Checking"));
		describeCertificateStatusCountResponse.setCheckedFail(context.integerValue("DescribeCertificateStatusCountResponse.CheckedFail"));
		describeCertificateStatusCountResponse.setIssued(context.integerValue("DescribeCertificateStatusCountResponse.Issued"));
		describeCertificateStatusCountResponse.setRevoked(context.integerValue("DescribeCertificateStatusCountResponse.Revoked"));
		describeCertificateStatusCountResponse.setClosed(context.integerValue("DescribeCertificateStatusCountResponse.Closed"));
		describeCertificateStatusCountResponse.setWillExpired(context.integerValue("DescribeCertificateStatusCountResponse.WillExpired"));
		describeCertificateStatusCountResponse.setExpired(context.integerValue("DescribeCertificateStatusCountResponse.Expired"));
	 
	 	return describeCertificateStatusCountResponse;
	}
}