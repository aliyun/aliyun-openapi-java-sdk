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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodCertificateListResponseUnmarshaller {

	public static DescribeVodCertificateListResponse unmarshall(DescribeVodCertificateListResponse describeVodCertificateListResponse, UnmarshallerContext context) {
		
		describeVodCertificateListResponse.setRequestId(context.stringValue("DescribeVodCertificateListResponse.RequestId"));

		CertificateListModel certificateListModel = new CertificateListModel();
		certificateListModel.setCount(context.integerValue("DescribeVodCertificateListResponse.CertificateListModel.Count"));

		List<Cert> certList = new ArrayList<Cert>();
		for (int i = 0; i < context.lengthValue("DescribeVodCertificateListResponse.CertificateListModel.CertList.Length"); i++) {
			Cert cert = new Cert();
			cert.setCertName(context.stringValue("DescribeVodCertificateListResponse.CertificateListModel.CertList["+ i +"].CertName"));
			cert.setCertId(context.longValue("DescribeVodCertificateListResponse.CertificateListModel.CertList["+ i +"].CertId"));
			cert.setFingerprint(context.stringValue("DescribeVodCertificateListResponse.CertificateListModel.CertList["+ i +"].Fingerprint"));
			cert.setCommon(context.stringValue("DescribeVodCertificateListResponse.CertificateListModel.CertList["+ i +"].Common"));
			cert.setIssuer(context.stringValue("DescribeVodCertificateListResponse.CertificateListModel.CertList["+ i +"].Issuer"));
			cert.setLastTime(context.longValue("DescribeVodCertificateListResponse.CertificateListModel.CertList["+ i +"].LastTime"));

			certList.add(cert);
		}
		certificateListModel.setCertList(certList);
		describeVodCertificateListResponse.setCertificateListModel(certificateListModel);
	 
	 	return describeVodCertificateListResponse;
	}
}