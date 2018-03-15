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

import com.aliyuncs.vpc.model.v20160428.DescribeSslVpnClientCertResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSslVpnClientCertResponseUnmarshaller {

	public static DescribeSslVpnClientCertResponse unmarshall(DescribeSslVpnClientCertResponse describeSslVpnClientCertResponse, UnmarshallerContext context) {
		
		describeSslVpnClientCertResponse.setRequestId(context.stringValue("DescribeSslVpnClientCertResponse.RequestId"));
		describeSslVpnClientCertResponse.setRegionId(context.stringValue("DescribeSslVpnClientCertResponse.RegionId"));
		describeSslVpnClientCertResponse.setSslVpnClientCertId(context.stringValue("DescribeSslVpnClientCertResponse.SslVpnClientCertId"));
		describeSslVpnClientCertResponse.setName(context.stringValue("DescribeSslVpnClientCertResponse.Name"));
		describeSslVpnClientCertResponse.setSslVpnServerId(context.stringValue("DescribeSslVpnClientCertResponse.SslVpnServerId"));
		describeSslVpnClientCertResponse.setCaCert(context.stringValue("DescribeSslVpnClientCertResponse.CaCert"));
		describeSslVpnClientCertResponse.setClientCert(context.stringValue("DescribeSslVpnClientCertResponse.ClientCert"));
		describeSslVpnClientCertResponse.setClientKey(context.stringValue("DescribeSslVpnClientCertResponse.ClientKey"));
		describeSslVpnClientCertResponse.setClientConfig(context.stringValue("DescribeSslVpnClientCertResponse.ClientConfig"));
		describeSslVpnClientCertResponse.setCreateTime(context.longValue("DescribeSslVpnClientCertResponse.CreateTime"));
		describeSslVpnClientCertResponse.setEndTime(context.longValue("DescribeSslVpnClientCertResponse.EndTime"));
		describeSslVpnClientCertResponse.setStatus(context.stringValue("DescribeSslVpnClientCertResponse.Status"));
	 
	 	return describeSslVpnClientCertResponse;
	}
}