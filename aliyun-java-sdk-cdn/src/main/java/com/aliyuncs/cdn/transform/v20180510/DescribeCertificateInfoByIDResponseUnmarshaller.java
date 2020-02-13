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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeCertificateInfoByIDResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCertificateInfoByIDResponse.CertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCertificateInfoByIDResponseUnmarshaller {

	public static DescribeCertificateInfoByIDResponse unmarshall(DescribeCertificateInfoByIDResponse describeCertificateInfoByIDResponse, UnmarshallerContext _ctx) {
		
		describeCertificateInfoByIDResponse.setRequestId(_ctx.stringValue("DescribeCertificateInfoByIDResponse.RequestId"));

		List<CertInfo> certInfos = new ArrayList<CertInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCertificateInfoByIDResponse.CertInfos.Length"); i++) {
			CertInfo certInfo = new CertInfo();
			certInfo.setCertId(_ctx.stringValue("DescribeCertificateInfoByIDResponse.CertInfos["+ i +"].CertId"));
			certInfo.setCertName(_ctx.stringValue("DescribeCertificateInfoByIDResponse.CertInfos["+ i +"].CertName"));
			certInfo.setCreateTime(_ctx.stringValue("DescribeCertificateInfoByIDResponse.CertInfos["+ i +"].CreateTime"));
			certInfo.setHttpsCrt(_ctx.stringValue("DescribeCertificateInfoByIDResponse.CertInfos["+ i +"].HttpsCrt"));
			certInfo.setCertType(_ctx.stringValue("DescribeCertificateInfoByIDResponse.CertInfos["+ i +"].CertType"));
			certInfo.setCertExpireTime(_ctx.stringValue("DescribeCertificateInfoByIDResponse.CertInfos["+ i +"].CertExpireTime"));
			certInfo.setDomainList(_ctx.stringValue("DescribeCertificateInfoByIDResponse.CertInfos["+ i +"].DomainList"));

			certInfos.add(certInfo);
		}
		describeCertificateInfoByIDResponse.setCertInfos(certInfos);
	 
	 	return describeCertificateInfoByIDResponse;
	}
}