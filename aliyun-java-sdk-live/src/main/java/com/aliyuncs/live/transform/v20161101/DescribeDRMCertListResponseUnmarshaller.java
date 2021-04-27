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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeDRMCertListResponse;
import com.aliyuncs.live.model.v20161101.DescribeDRMCertListResponse.CertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDRMCertListResponseUnmarshaller {

	public static DescribeDRMCertListResponse unmarshall(DescribeDRMCertListResponse describeDRMCertListResponse, UnmarshallerContext _ctx) {
		
		describeDRMCertListResponse.setRequestId(_ctx.stringValue("DescribeDRMCertListResponse.RequestId"));

		List<CertInfo> dRMCertInfoListList = new ArrayList<CertInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDRMCertListResponse.DRMCertInfoListList.Length"); i++) {
			CertInfo certInfo = new CertInfo();
			certInfo.setCertId(_ctx.stringValue("DescribeDRMCertListResponse.DRMCertInfoListList["+ i +"].CertId"));
			certInfo.setCertName(_ctx.stringValue("DescribeDRMCertListResponse.DRMCertInfoListList["+ i +"].CertName"));
			certInfo.setServCert(_ctx.stringValue("DescribeDRMCertListResponse.DRMCertInfoListList["+ i +"].ServCert"));
			certInfo.setPrivateKey(_ctx.stringValue("DescribeDRMCertListResponse.DRMCertInfoListList["+ i +"].PrivateKey"));
			certInfo.setPassphrase(_ctx.stringValue("DescribeDRMCertListResponse.DRMCertInfoListList["+ i +"].Passphrase"));
			certInfo.setAsk(_ctx.stringValue("DescribeDRMCertListResponse.DRMCertInfoListList["+ i +"].Ask"));
			certInfo.setDescription(_ctx.stringValue("DescribeDRMCertListResponse.DRMCertInfoListList["+ i +"].Description"));

			dRMCertInfoListList.add(certInfo);
		}
		describeDRMCertListResponse.setDRMCertInfoListList(dRMCertInfoListList);
	 
	 	return describeDRMCertListResponse;
	}
}