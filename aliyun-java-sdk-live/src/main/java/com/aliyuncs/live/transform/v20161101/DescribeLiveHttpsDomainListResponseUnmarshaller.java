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

import com.aliyuncs.live.model.v20161101.DescribeLiveHttpsDomainListResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveHttpsDomainListResponse.CertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveHttpsDomainListResponseUnmarshaller {

	public static DescribeLiveHttpsDomainListResponse unmarshall(DescribeLiveHttpsDomainListResponse describeLiveHttpsDomainListResponse, UnmarshallerContext _ctx) {
		
		describeLiveHttpsDomainListResponse.setRequestId(_ctx.stringValue("DescribeLiveHttpsDomainListResponse.RequestId"));
		describeLiveHttpsDomainListResponse.setTotalCount(_ctx.integerValue("DescribeLiveHttpsDomainListResponse.TotalCount"));

		List<CertInfo> certInfos = new ArrayList<CertInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveHttpsDomainListResponse.CertInfos.Length"); i++) {
			CertInfo certInfo = new CertInfo();
			certInfo.setCertStartTime(_ctx.stringValue("DescribeLiveHttpsDomainListResponse.CertInfos["+ i +"].CertStartTime"));
			certInfo.setCertExpireTime(_ctx.stringValue("DescribeLiveHttpsDomainListResponse.CertInfos["+ i +"].CertExpireTime"));
			certInfo.setCertUpdateTime(_ctx.stringValue("DescribeLiveHttpsDomainListResponse.CertInfos["+ i +"].CertUpdateTime"));
			certInfo.setCertType(_ctx.stringValue("DescribeLiveHttpsDomainListResponse.CertInfos["+ i +"].CertType"));
			certInfo.setCertName(_ctx.stringValue("DescribeLiveHttpsDomainListResponse.CertInfos["+ i +"].CertName"));
			certInfo.setCertStatus(_ctx.stringValue("DescribeLiveHttpsDomainListResponse.CertInfos["+ i +"].CertStatus"));
			certInfo.setDomainName(_ctx.stringValue("DescribeLiveHttpsDomainListResponse.CertInfos["+ i +"].DomainName"));
			certInfo.setCertCommonName(_ctx.stringValue("DescribeLiveHttpsDomainListResponse.CertInfos["+ i +"].CertCommonName"));

			certInfos.add(certInfo);
		}
		describeLiveHttpsDomainListResponse.setCertInfos(certInfos);
	 
	 	return describeLiveHttpsDomainListResponse;
	}
}