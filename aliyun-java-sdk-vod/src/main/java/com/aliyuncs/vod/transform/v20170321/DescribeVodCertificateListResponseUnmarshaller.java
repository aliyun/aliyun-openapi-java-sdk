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

import com.aliyuncs.vod.model.v20170321.DescribeVodCertificateListResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodCertificateListResponse.CertificateListModel;
import com.aliyuncs.vod.model.v20170321.DescribeVodCertificateListResponse.CertificateListModel.Cert;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodCertificateListResponseUnmarshaller {

	public static DescribeVodCertificateListResponse unmarshall(DescribeVodCertificateListResponse describeVodCertificateListResponse, UnmarshallerContext _ctx) {
		
		describeVodCertificateListResponse.setRequestId(_ctx.stringValue("DescribeVodCertificateListResponse.RequestId"));

		CertificateListModel certificateListModel = new CertificateListModel();
		certificateListModel.setCount(_ctx.integerValue("DescribeVodCertificateListResponse.CertificateListModel.Count"));

		List<Cert> certList = new ArrayList<Cert>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodCertificateListResponse.CertificateListModel.CertList.Length"); i++) {
			Cert cert = new Cert();
			cert.setCertName(_ctx.stringValue("DescribeVodCertificateListResponse.CertificateListModel.CertList["+ i +"].CertName"));
			cert.setCertId(_ctx.longValue("DescribeVodCertificateListResponse.CertificateListModel.CertList["+ i +"].CertId"));
			cert.setFingerprint(_ctx.stringValue("DescribeVodCertificateListResponse.CertificateListModel.CertList["+ i +"].Fingerprint"));
			cert.setCommon(_ctx.stringValue("DescribeVodCertificateListResponse.CertificateListModel.CertList["+ i +"].Common"));
			cert.setIssuer(_ctx.stringValue("DescribeVodCertificateListResponse.CertificateListModel.CertList["+ i +"].Issuer"));
			cert.setLastTime(_ctx.longValue("DescribeVodCertificateListResponse.CertificateListModel.CertList["+ i +"].LastTime"));

			certList.add(cert);
		}
		certificateListModel.setCertList(certList);
		describeVodCertificateListResponse.setCertificateListModel(certificateListModel);
	 
	 	return describeVodCertificateListResponse;
	}
}