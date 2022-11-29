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

package com.aliyuncs.cas.transform.v20200630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20200630.DescribeClientCertificateStatusResponse;
import com.aliyuncs.cas.model.v20200630.DescribeClientCertificateStatusResponse.CertificateStatusItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClientCertificateStatusResponseUnmarshaller {

	public static DescribeClientCertificateStatusResponse unmarshall(DescribeClientCertificateStatusResponse describeClientCertificateStatusResponse, UnmarshallerContext _ctx) {
		
		describeClientCertificateStatusResponse.setRequestId(_ctx.stringValue("DescribeClientCertificateStatusResponse.RequestId"));

		List<CertificateStatusItem> certificateStatus = new ArrayList<CertificateStatusItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClientCertificateStatusResponse.CertificateStatus.Length"); i++) {
			CertificateStatusItem certificateStatusItem = new CertificateStatusItem();
			certificateStatusItem.setSerialNumber(_ctx.stringValue("DescribeClientCertificateStatusResponse.CertificateStatus["+ i +"].SerialNumber"));
			certificateStatusItem.setStatus(_ctx.stringValue("DescribeClientCertificateStatusResponse.CertificateStatus["+ i +"].Status"));
			certificateStatusItem.setRevokeTime(_ctx.longValue("DescribeClientCertificateStatusResponse.CertificateStatus["+ i +"].RevokeTime"));

			certificateStatus.add(certificateStatusItem);
		}
		describeClientCertificateStatusResponse.setCertificateStatus(certificateStatus);
	 
	 	return describeClientCertificateStatusResponse;
	}
}