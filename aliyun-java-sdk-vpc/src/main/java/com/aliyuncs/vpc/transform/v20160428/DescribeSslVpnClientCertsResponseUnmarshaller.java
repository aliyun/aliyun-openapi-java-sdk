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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeSslVpnClientCertsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeSslVpnClientCertsResponse.SslVpnClientCertKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSslVpnClientCertsResponseUnmarshaller {

	public static DescribeSslVpnClientCertsResponse unmarshall(DescribeSslVpnClientCertsResponse describeSslVpnClientCertsResponse, UnmarshallerContext context) {
		
		describeSslVpnClientCertsResponse.setRequestId(context.stringValue("DescribeSslVpnClientCertsResponse.RequestId"));
		describeSslVpnClientCertsResponse.setTotalCount(context.integerValue("DescribeSslVpnClientCertsResponse.TotalCount"));
		describeSslVpnClientCertsResponse.setPageNumber(context.integerValue("DescribeSslVpnClientCertsResponse.PageNumber"));
		describeSslVpnClientCertsResponse.setPageSize(context.integerValue("DescribeSslVpnClientCertsResponse.PageSize"));

		List<SslVpnClientCertKey> sslVpnClientCertKeys = new ArrayList<SslVpnClientCertKey>();
		for (int i = 0; i < context.lengthValue("DescribeSslVpnClientCertsResponse.SslVpnClientCertKeys.Length"); i++) {
			SslVpnClientCertKey sslVpnClientCertKey = new SslVpnClientCertKey();
			sslVpnClientCertKey.setRegionId(context.stringValue("DescribeSslVpnClientCertsResponse.SslVpnClientCertKeys["+ i +"].RegionId"));
			sslVpnClientCertKey.setSslVpnClientCertId(context.stringValue("DescribeSslVpnClientCertsResponse.SslVpnClientCertKeys["+ i +"].SslVpnClientCertId"));
			sslVpnClientCertKey.setName(context.stringValue("DescribeSslVpnClientCertsResponse.SslVpnClientCertKeys["+ i +"].Name"));
			sslVpnClientCertKey.setSslVpnServerId(context.stringValue("DescribeSslVpnClientCertsResponse.SslVpnClientCertKeys["+ i +"].SslVpnServerId"));
			sslVpnClientCertKey.setCreateTime(context.longValue("DescribeSslVpnClientCertsResponse.SslVpnClientCertKeys["+ i +"].CreateTime"));
			sslVpnClientCertKey.setEndTime(context.longValue("DescribeSslVpnClientCertsResponse.SslVpnClientCertKeys["+ i +"].EndTime"));
			sslVpnClientCertKey.setStatus(context.stringValue("DescribeSslVpnClientCertsResponse.SslVpnClientCertKeys["+ i +"].Status"));

			sslVpnClientCertKeys.add(sslVpnClientCertKey);
		}
		describeSslVpnClientCertsResponse.setSslVpnClientCertKeys(sslVpnClientCertKeys);
	 
	 	return describeSslVpnClientCertsResponse;
	}
}