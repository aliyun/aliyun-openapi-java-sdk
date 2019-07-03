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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeDnsProductInstancesResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsProductInstancesResponse.DnsProduct;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsProductInstancesResponseUnmarshaller {

	public static DescribeDnsProductInstancesResponse unmarshall(DescribeDnsProductInstancesResponse describeDnsProductInstancesResponse, UnmarshallerContext _ctx) {
		
		describeDnsProductInstancesResponse.setRequestId(_ctx.stringValue("DescribeDnsProductInstancesResponse.RequestId"));
		describeDnsProductInstancesResponse.setTotalCount(_ctx.longValue("DescribeDnsProductInstancesResponse.TotalCount"));
		describeDnsProductInstancesResponse.setPageNumber(_ctx.longValue("DescribeDnsProductInstancesResponse.PageNumber"));
		describeDnsProductInstancesResponse.setPageSize(_ctx.longValue("DescribeDnsProductInstancesResponse.PageSize"));

		List<DnsProduct> dnsProducts = new ArrayList<DnsProduct>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsProductInstancesResponse.DnsProducts.Length"); i++) {
			DnsProduct dnsProduct = new DnsProduct();
			dnsProduct.setInstanceId(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].InstanceId"));
			dnsProduct.setVersionCode(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].VersionCode"));
			dnsProduct.setVersionName(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].VersionName"));
			dnsProduct.setStartTime(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].StartTime"));
			dnsProduct.setEndTime(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].EndTime"));
			dnsProduct.setStartTimestamp(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].StartTimestamp"));
			dnsProduct.setEndTimestamp(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].EndTimestamp"));
			dnsProduct.setDomain(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].Domain"));
			dnsProduct.setBindCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].BindCount"));
			dnsProduct.setBindUsedCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].BindUsedCount"));
			dnsProduct.setTTLMinValue(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].TTLMinValue"));
			dnsProduct.setSubDomainLevel(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].SubDomainLevel"));
			dnsProduct.setDnsSLBCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].DnsSLBCount"));
			dnsProduct.setURLForwardCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].URLForwardCount"));
			dnsProduct.setDDosDefendFlow(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].DDosDefendFlow"));
			dnsProduct.setDDosDefendQuery(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].DDosDefendQuery"));
			dnsProduct.setOverseaDDosDefendFlow(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].OverseaDDosDefendFlow"));
			dnsProduct.setSearchEngineLines(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].SearchEngineLines"));
			dnsProduct.setISPLines(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].ISPLines"));
			dnsProduct.setISPRegionLines(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].ISPRegionLines"));
			dnsProduct.setOverseaLine(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].OverseaLine"));
			dnsProduct.setMonitorNodeCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].MonitorNodeCount"));
			dnsProduct.setMonitorFrequency(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].MonitorFrequency"));
			dnsProduct.setMonitorTaskCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].MonitorTaskCount"));
			dnsProduct.setRegionLines(_ctx.booleanValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].RegionLines"));
			dnsProduct.setGslb(_ctx.booleanValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].Gslb"));
			dnsProduct.setInClean(_ctx.booleanValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].InClean"));
			dnsProduct.setInBlackHole(_ctx.booleanValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].InBlackHole"));
			dnsProduct.setBindDomainCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].BindDomainCount"));
			dnsProduct.setBindDomainUsedCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].BindDomainUsedCount"));
			dnsProduct.setDnsSecurity(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].DnsSecurity"));

			dnsProducts.add(dnsProduct);
		}
		describeDnsProductInstancesResponse.setDnsProducts(dnsProducts);
	 
	 	return describeDnsProductInstancesResponse;
	}
}