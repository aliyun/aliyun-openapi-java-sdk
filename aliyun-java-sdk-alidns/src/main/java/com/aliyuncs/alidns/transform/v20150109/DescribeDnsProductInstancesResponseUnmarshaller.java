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
		describeDnsProductInstancesResponse.setDomainType(_ctx.stringValue("DescribeDnsProductInstancesResponse.DomainType"));
		describeDnsProductInstancesResponse.setPageSize(_ctx.longValue("DescribeDnsProductInstancesResponse.PageSize"));
		describeDnsProductInstancesResponse.setPageNumber(_ctx.longValue("DescribeDnsProductInstancesResponse.PageNumber"));

		List<DnsProduct> dnsProducts = new ArrayList<DnsProduct>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsProductInstancesResponse.DnsProducts.Length"); i++) {
			DnsProduct dnsProduct = new DnsProduct();
			dnsProduct.setOverseaLine(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].OverseaLine"));
			dnsProduct.setPaymentType(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].PaymentType"));
			dnsProduct.setMonitorNodeCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].MonitorNodeCount"));
			dnsProduct.setInBlackHole(_ctx.booleanValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].InBlackHole"));
			dnsProduct.setBindDomainUsedCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].BindDomainUsedCount"));
			dnsProduct.setISPRegionLines(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].ISPRegionLines"));
			dnsProduct.setTTLMinValue(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].TTLMinValue"));
			dnsProduct.setISPLines(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].ISPLines"));
			dnsProduct.setSearchEngineLines(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].SearchEngineLines"));
			dnsProduct.setEndTimestamp(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].EndTimestamp"));
			dnsProduct.setVersionName(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].VersionName"));
			dnsProduct.setVersionCode(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].VersionCode"));
			dnsProduct.setMonitorTaskCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].MonitorTaskCount"));
			dnsProduct.setBindUsedCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].BindUsedCount"));
			dnsProduct.setDomain(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].Domain"));
			dnsProduct.setMonitorFrequency(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].MonitorFrequency"));
			dnsProduct.setInClean(_ctx.booleanValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].InClean"));
			dnsProduct.setURLForwardCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].URLForwardCount"));
			dnsProduct.setStartTimestamp(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].StartTimestamp"));
			dnsProduct.setDDosDefendQuery(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].DDosDefendQuery"));
			dnsProduct.setInstanceId(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].InstanceId"));
			dnsProduct.setDDosDefendFlow(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].DDosDefendFlow"));
			dnsProduct.setBindCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].BindCount"));
			dnsProduct.setSubDomainLevel(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].SubDomainLevel"));
			dnsProduct.setBindDomainCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].BindDomainCount"));
			dnsProduct.setEndTime(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].EndTime"));
			dnsProduct.setStartTime(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].StartTime"));
			dnsProduct.setOverseaDDosDefendFlow(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].OverseaDDosDefendFlow"));
			dnsProduct.setRegionLines(_ctx.booleanValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].RegionLines"));
			dnsProduct.setGslb(_ctx.booleanValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].Gslb"));
			dnsProduct.setDnsSecurity(_ctx.stringValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].DnsSecurity"));
			dnsProduct.setDnsSLBCount(_ctx.longValue("DescribeDnsProductInstancesResponse.DnsProducts["+ i +"].DnsSLBCount"));

			dnsProducts.add(dnsProduct);
		}
		describeDnsProductInstancesResponse.setDnsProducts(dnsProducts);
	 
	 	return describeDnsProductInstancesResponse;
	}
}