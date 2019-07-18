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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainCertificateInfoResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainCertificateInfoResponse.CertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainCertificateInfoResponseUnmarshaller {

	public static DescribeVodDomainCertificateInfoResponse unmarshall(DescribeVodDomainCertificateInfoResponse describeVodDomainCertificateInfoResponse, UnmarshallerContext _ctx) {
		
		describeVodDomainCertificateInfoResponse.setRequestId(_ctx.stringValue("DescribeVodDomainCertificateInfoResponse.RequestId"));

		List<CertInfo> certInfos = new ArrayList<CertInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodDomainCertificateInfoResponse.CertInfos.Length"); i++) {
			CertInfo certInfo = new CertInfo();
			certInfo.setDomainName(_ctx.stringValue("DescribeVodDomainCertificateInfoResponse.CertInfos["+ i +"].DomainName"));
			certInfo.setCertName(_ctx.stringValue("DescribeVodDomainCertificateInfoResponse.CertInfos["+ i +"].CertName"));
			certInfo.setCertDomainName(_ctx.stringValue("DescribeVodDomainCertificateInfoResponse.CertInfos["+ i +"].CertDomainName"));
			certInfo.setCertExpireTime(_ctx.stringValue("DescribeVodDomainCertificateInfoResponse.CertInfos["+ i +"].CertExpireTime"));
			certInfo.setCertLife(_ctx.stringValue("DescribeVodDomainCertificateInfoResponse.CertInfos["+ i +"].CertLife"));
			certInfo.setCertOrg(_ctx.stringValue("DescribeVodDomainCertificateInfoResponse.CertInfos["+ i +"].CertOrg"));
			certInfo.setCertType(_ctx.stringValue("DescribeVodDomainCertificateInfoResponse.CertInfos["+ i +"].CertType"));
			certInfo.setServerCertificateStatus(_ctx.stringValue("DescribeVodDomainCertificateInfoResponse.CertInfos["+ i +"].ServerCertificateStatus"));
			certInfo.setStatus(_ctx.stringValue("DescribeVodDomainCertificateInfoResponse.CertInfos["+ i +"].Status"));

			certInfos.add(certInfo);
		}
		describeVodDomainCertificateInfoResponse.setCertInfos(certInfos);
	 
	 	return describeVodDomainCertificateInfoResponse;
	}
}