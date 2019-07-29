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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeVsDomainCertificateInfoResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsDomainCertificateInfoResponse.CertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsDomainCertificateInfoResponseUnmarshaller {

	public static DescribeVsDomainCertificateInfoResponse unmarshall(DescribeVsDomainCertificateInfoResponse describeVsDomainCertificateInfoResponse, UnmarshallerContext _ctx) {
		
		describeVsDomainCertificateInfoResponse.setRequestId(_ctx.stringValue("DescribeVsDomainCertificateInfoResponse.RequestId"));

		List<CertInfo> certInfos = new ArrayList<CertInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsDomainCertificateInfoResponse.CertInfos.Length"); i++) {
			CertInfo certInfo = new CertInfo();
			certInfo.setDomainName(_ctx.stringValue("DescribeVsDomainCertificateInfoResponse.CertInfos["+ i +"].DomainName"));
			certInfo.setCertName(_ctx.stringValue("DescribeVsDomainCertificateInfoResponse.CertInfos["+ i +"].CertName"));
			certInfo.setCertDomainName(_ctx.stringValue("DescribeVsDomainCertificateInfoResponse.CertInfos["+ i +"].CertDomainName"));
			certInfo.setCertExpireTime(_ctx.stringValue("DescribeVsDomainCertificateInfoResponse.CertInfos["+ i +"].CertExpireTime"));
			certInfo.setCertLife(_ctx.stringValue("DescribeVsDomainCertificateInfoResponse.CertInfos["+ i +"].CertLife"));
			certInfo.setCertOrg(_ctx.stringValue("DescribeVsDomainCertificateInfoResponse.CertInfos["+ i +"].CertOrg"));
			certInfo.setCertType(_ctx.stringValue("DescribeVsDomainCertificateInfoResponse.CertInfos["+ i +"].CertType"));
			certInfo.setServerCertificateStatus(_ctx.stringValue("DescribeVsDomainCertificateInfoResponse.CertInfos["+ i +"].ServerCertificateStatus"));
			certInfo.setStatus(_ctx.stringValue("DescribeVsDomainCertificateInfoResponse.CertInfos["+ i +"].Status"));

			certInfos.add(certInfo);
		}
		describeVsDomainCertificateInfoResponse.setCertInfos(certInfos);
	 
	 	return describeVsDomainCertificateInfoResponse;
	}
}