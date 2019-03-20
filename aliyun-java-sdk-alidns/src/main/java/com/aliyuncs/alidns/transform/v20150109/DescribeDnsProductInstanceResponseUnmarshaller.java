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

import com.aliyuncs.alidns.model.v20150109.DescribeDnsProductInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsProductInstanceResponseUnmarshaller {

	public static DescribeDnsProductInstanceResponse unmarshall(DescribeDnsProductInstanceResponse describeDnsProductInstanceResponse, UnmarshallerContext context) {
		
		describeDnsProductInstanceResponse.setRequestId(context.stringValue("DescribeDnsProductInstanceResponse.RequestId"));
		describeDnsProductInstanceResponse.setInstanceId(context.stringValue("DescribeDnsProductInstanceResponse.InstanceId"));
		describeDnsProductInstanceResponse.setVersionCode(context.stringValue("DescribeDnsProductInstanceResponse.VersionCode"));
		describeDnsProductInstanceResponse.setVersionName(context.stringValue("DescribeDnsProductInstanceResponse.VersionName"));
		describeDnsProductInstanceResponse.setStartTime(context.stringValue("DescribeDnsProductInstanceResponse.StartTime"));
		describeDnsProductInstanceResponse.setStartTimestamp(context.longValue("DescribeDnsProductInstanceResponse.StartTimestamp"));
		describeDnsProductInstanceResponse.setEndTime(context.stringValue("DescribeDnsProductInstanceResponse.EndTime"));
		describeDnsProductInstanceResponse.setEndTimestamp(context.longValue("DescribeDnsProductInstanceResponse.EndTimestamp"));
		describeDnsProductInstanceResponse.setDomain(context.stringValue("DescribeDnsProductInstanceResponse.Domain"));
		describeDnsProductInstanceResponse.setBindCount(context.longValue("DescribeDnsProductInstanceResponse.BindCount"));
		describeDnsProductInstanceResponse.setBindUsedCount(context.longValue("DescribeDnsProductInstanceResponse.BindUsedCount"));
		describeDnsProductInstanceResponse.setTTLMinValue(context.longValue("DescribeDnsProductInstanceResponse.TTLMinValue"));
		describeDnsProductInstanceResponse.setSubDomainLevel(context.longValue("DescribeDnsProductInstanceResponse.SubDomainLevel"));
		describeDnsProductInstanceResponse.setDnsSLBCount(context.longValue("DescribeDnsProductInstanceResponse.DnsSLBCount"));
		describeDnsProductInstanceResponse.setURLForwardCount(context.longValue("DescribeDnsProductInstanceResponse.URLForwardCount"));
		describeDnsProductInstanceResponse.setDDosDefendFlow(context.longValue("DescribeDnsProductInstanceResponse.DDosDefendFlow"));
		describeDnsProductInstanceResponse.setDDosDefendQuery(context.longValue("DescribeDnsProductInstanceResponse.DDosDefendQuery"));
		describeDnsProductInstanceResponse.setOverseaDDosDefendFlow(context.longValue("DescribeDnsProductInstanceResponse.OverseaDDosDefendFlow"));
		describeDnsProductInstanceResponse.setSearchEngineLines(context.stringValue("DescribeDnsProductInstanceResponse.SearchEngineLines"));
		describeDnsProductInstanceResponse.setISPLines(context.stringValue("DescribeDnsProductInstanceResponse.ISPLines"));
		describeDnsProductInstanceResponse.setISPRegionLines(context.stringValue("DescribeDnsProductInstanceResponse.ISPRegionLines"));
		describeDnsProductInstanceResponse.setOverseaLine(context.stringValue("DescribeDnsProductInstanceResponse.OverseaLine"));
		describeDnsProductInstanceResponse.setMonitorNodeCount(context.longValue("DescribeDnsProductInstanceResponse.MonitorNodeCount"));
		describeDnsProductInstanceResponse.setMonitorFrequency(context.longValue("DescribeDnsProductInstanceResponse.MonitorFrequency"));
		describeDnsProductInstanceResponse.setMonitorTaskCount(context.longValue("DescribeDnsProductInstanceResponse.MonitorTaskCount"));
		describeDnsProductInstanceResponse.setRegionLines(context.booleanValue("DescribeDnsProductInstanceResponse.RegionLines"));
		describeDnsProductInstanceResponse.setGslb(context.booleanValue("DescribeDnsProductInstanceResponse.Gslb"));
		describeDnsProductInstanceResponse.setInClean(context.booleanValue("DescribeDnsProductInstanceResponse.InClean"));
		describeDnsProductInstanceResponse.setInBlackHole(context.booleanValue("DescribeDnsProductInstanceResponse.InBlackHole"));
		describeDnsProductInstanceResponse.setBindDomainCount(context.longValue("DescribeDnsProductInstanceResponse.BindDomainCount"));
		describeDnsProductInstanceResponse.setBindDomainUsedCount(context.longValue("DescribeDnsProductInstanceResponse.BindDomainUsedCount"));
		describeDnsProductInstanceResponse.setDnsSecurity(context.stringValue("DescribeDnsProductInstanceResponse.DnsSecurity"));

		List<String> dnsServers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeDnsProductInstanceResponse.DnsServers.Length"); i++) {
			dnsServers.add(context.stringValue("DescribeDnsProductInstanceResponse.DnsServers["+ i +"]"));
		}
		describeDnsProductInstanceResponse.setDnsServers(dnsServers);
	 
	 	return describeDnsProductInstanceResponse;
	}
}