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

import com.aliyuncs.cdn.model.v20180510.DescribeCdnHttpsDomainListResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnHttpsDomainListResponse.CertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnHttpsDomainListResponseUnmarshaller {

	public static DescribeCdnHttpsDomainListResponse unmarshall(DescribeCdnHttpsDomainListResponse describeCdnHttpsDomainListResponse, UnmarshallerContext _ctx) {
		
		describeCdnHttpsDomainListResponse.setRequestId(_ctx.stringValue("DescribeCdnHttpsDomainListResponse.RequestId"));
		describeCdnHttpsDomainListResponse.setTotalCount(_ctx.integerValue("DescribeCdnHttpsDomainListResponse.TotalCount"));

		List<CertInfo> certInfos = new ArrayList<CertInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnHttpsDomainListResponse.CertInfos.Length"); i++) {
			CertInfo certInfo = new CertInfo();
			certInfo.setCertCommonName(_ctx.stringValue("DescribeCdnHttpsDomainListResponse.CertInfos["+ i +"].CertCommonName"));
			certInfo.setCertName(_ctx.stringValue("DescribeCdnHttpsDomainListResponse.CertInfos["+ i +"].CertName"));
			certInfo.setCertStartTime(_ctx.stringValue("DescribeCdnHttpsDomainListResponse.CertInfos["+ i +"].CertStartTime"));
			certInfo.setCertExpireTime(_ctx.stringValue("DescribeCdnHttpsDomainListResponse.CertInfos["+ i +"].CertExpireTime"));
			certInfo.setCertStatus(_ctx.stringValue("DescribeCdnHttpsDomainListResponse.CertInfos["+ i +"].CertStatus"));
			certInfo.setCertType(_ctx.stringValue("DescribeCdnHttpsDomainListResponse.CertInfos["+ i +"].CertType"));
			certInfo.setDomainName(_ctx.stringValue("DescribeCdnHttpsDomainListResponse.CertInfos["+ i +"].DomainName"));
			certInfo.setCertUpdateTime(_ctx.stringValue("DescribeCdnHttpsDomainListResponse.CertInfos["+ i +"].CertUpdateTime"));

			certInfos.add(certInfo);
		}
		describeCdnHttpsDomainListResponse.setCertInfos(certInfos);
	 
	 	return describeCdnHttpsDomainListResponse;
	}
}