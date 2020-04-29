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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnHttpsDomainListResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnHttpsDomainListResponse.CertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnHttpsDomainListResponseUnmarshaller {

	public static DescribeDcdnHttpsDomainListResponse unmarshall(DescribeDcdnHttpsDomainListResponse describeDcdnHttpsDomainListResponse, UnmarshallerContext _ctx) {
		
		describeDcdnHttpsDomainListResponse.setRequestId(_ctx.stringValue("DescribeDcdnHttpsDomainListResponse.RequestId"));
		describeDcdnHttpsDomainListResponse.setTotalCount(_ctx.integerValue("DescribeDcdnHttpsDomainListResponse.TotalCount"));

		List<CertInfo> certInfos = new ArrayList<CertInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnHttpsDomainListResponse.CertInfos.Length"); i++) {
			CertInfo certInfo = new CertInfo();
			certInfo.setCertCommonName(_ctx.stringValue("DescribeDcdnHttpsDomainListResponse.CertInfos["+ i +"].CertCommonName"));
			certInfo.setCertName(_ctx.stringValue("DescribeDcdnHttpsDomainListResponse.CertInfos["+ i +"].CertName"));
			certInfo.setCertStartTime(_ctx.stringValue("DescribeDcdnHttpsDomainListResponse.CertInfos["+ i +"].CertStartTime"));
			certInfo.setCertExpireTime(_ctx.stringValue("DescribeDcdnHttpsDomainListResponse.CertInfos["+ i +"].CertExpireTime"));
			certInfo.setCertStatus(_ctx.stringValue("DescribeDcdnHttpsDomainListResponse.CertInfos["+ i +"].CertStatus"));
			certInfo.setCertType(_ctx.stringValue("DescribeDcdnHttpsDomainListResponse.CertInfos["+ i +"].CertType"));
			certInfo.setDomainName(_ctx.stringValue("DescribeDcdnHttpsDomainListResponse.CertInfos["+ i +"].DomainName"));
			certInfo.setCertUpdateTime(_ctx.stringValue("DescribeDcdnHttpsDomainListResponse.CertInfos["+ i +"].CertUpdateTime"));

			certInfos.add(certInfo);
		}
		describeDcdnHttpsDomainListResponse.setCertInfos(certInfos);
	 
	 	return describeDcdnHttpsDomainListResponse;
	}
}