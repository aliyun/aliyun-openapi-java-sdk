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

import com.aliyuncs.vod.model.v20170321.DescribeVodSSLCertificateListResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodSSLCertificateListResponse.CertificateListModel;
import com.aliyuncs.vod.model.v20170321.DescribeVodSSLCertificateListResponse.CertificateListModel.Cert;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodSSLCertificateListResponseUnmarshaller {

	public static DescribeVodSSLCertificateListResponse unmarshall(DescribeVodSSLCertificateListResponse describeVodSSLCertificateListResponse, UnmarshallerContext _ctx) {
		
		describeVodSSLCertificateListResponse.setRequestId(_ctx.stringValue("DescribeVodSSLCertificateListResponse.RequestId"));

		CertificateListModel certificateListModel = new CertificateListModel();
		certificateListModel.setCount(_ctx.integerValue("DescribeVodSSLCertificateListResponse.CertificateListModel.Count"));
		certificateListModel.setPageNumber(_ctx.longValue("DescribeVodSSLCertificateListResponse.CertificateListModel.PageNumber"));
		certificateListModel.setPageSize(_ctx.longValue("DescribeVodSSLCertificateListResponse.CertificateListModel.PageSize"));

		List<Cert> certList = new ArrayList<Cert>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodSSLCertificateListResponse.CertificateListModel.CertList.Length"); i++) {
			Cert cert = new Cert();
			cert.setLastTime(_ctx.longValue("DescribeVodSSLCertificateListResponse.CertificateListModel.CertList["+ i +"].LastTime"));
			cert.setFingerprint(_ctx.stringValue("DescribeVodSSLCertificateListResponse.CertificateListModel.CertList["+ i +"].Fingerprint"));
			cert.setCertName(_ctx.stringValue("DescribeVodSSLCertificateListResponse.CertificateListModel.CertList["+ i +"].CertName"));
			cert.setIssuer(_ctx.stringValue("DescribeVodSSLCertificateListResponse.CertificateListModel.CertList["+ i +"].Issuer"));
			cert.setCertId(_ctx.longValue("DescribeVodSSLCertificateListResponse.CertificateListModel.CertList["+ i +"].CertId"));
			cert.setCommon(_ctx.stringValue("DescribeVodSSLCertificateListResponse.CertificateListModel.CertList["+ i +"].Common"));
			cert.setCertRegion(_ctx.stringValue("DescribeVodSSLCertificateListResponse.CertificateListModel.CertList["+ i +"].CertRegion"));

			certList.add(cert);
		}
		certificateListModel.setCertList(certList);
		describeVodSSLCertificateListResponse.setCertificateListModel(certificateListModel);
	 
	 	return describeVodSSLCertificateListResponse;
	}
}