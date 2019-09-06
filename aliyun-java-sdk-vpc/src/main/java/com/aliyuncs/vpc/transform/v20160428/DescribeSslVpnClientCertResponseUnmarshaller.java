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

	public static DescribeSslVpnClientCertResponse unmarshall(DescribeSslVpnClientCertResponse describeSslVpnClientCertResponse, UnmarshallerContext _ctx) {
		
		describeSslVpnClientCertResponse.setRequestId(_ctx.stringValue("DescribeSslVpnClientCertResponse.RequestId"));
		describeSslVpnClientCertResponse.setRegionId(_ctx.stringValue("DescribeSslVpnClientCertResponse.RegionId"));
		describeSslVpnClientCertResponse.setSslVpnClientCertId(_ctx.stringValue("DescribeSslVpnClientCertResponse.SslVpnClientCertId"));
		describeSslVpnClientCertResponse.setName(_ctx.stringValue("DescribeSslVpnClientCertResponse.Name"));
		describeSslVpnClientCertResponse.setSslVpnServerId(_ctx.stringValue("DescribeSslVpnClientCertResponse.SslVpnServerId"));
		describeSslVpnClientCertResponse.setCaCert(_ctx.stringValue("DescribeSslVpnClientCertResponse.CaCert"));
		describeSslVpnClientCertResponse.setClientCert(_ctx.stringValue("DescribeSslVpnClientCertResponse.ClientCert"));
		describeSslVpnClientCertResponse.setClientKey(_ctx.stringValue("DescribeSslVpnClientCertResponse.ClientKey"));
		describeSslVpnClientCertResponse.setClientConfig(_ctx.stringValue("DescribeSslVpnClientCertResponse.ClientConfig"));
		describeSslVpnClientCertResponse.setCreateTime(_ctx.longValue("DescribeSslVpnClientCertResponse.CreateTime"));
		describeSslVpnClientCertResponse.setEndTime(_ctx.longValue("DescribeSslVpnClientCertResponse.EndTime"));
		describeSslVpnClientCertResponse.setStatus(_ctx.stringValue("DescribeSslVpnClientCertResponse.Status"));
	 
	 	return describeSslVpnClientCertResponse;
	}
}