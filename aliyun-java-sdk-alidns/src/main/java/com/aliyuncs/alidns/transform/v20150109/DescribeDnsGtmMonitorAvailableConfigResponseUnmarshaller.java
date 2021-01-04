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

import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmMonitorAvailableConfigResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv4IspCityNode;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv6IspCityNode;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmMonitorAvailableConfigResponse.Ipv4IspCityNode;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmMonitorAvailableConfigResponse.Ipv6IspCityNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsGtmMonitorAvailableConfigResponseUnmarshaller {

	public static DescribeDnsGtmMonitorAvailableConfigResponse unmarshall(DescribeDnsGtmMonitorAvailableConfigResponse describeDnsGtmMonitorAvailableConfigResponse, UnmarshallerContext _ctx) {
		
		describeDnsGtmMonitorAvailableConfigResponse.setRequestId(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.RequestId"));

		List<Ipv4IspCityNode> ipv4IspCityNodes = new ArrayList<Ipv4IspCityNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv4IspCityNodes.Length"); i++) {
			Ipv4IspCityNode ipv4IspCityNode = new Ipv4IspCityNode();
			ipv4IspCityNode.setIspName(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv4IspCityNodes["+ i +"].IspName"));
			ipv4IspCityNode.setIspCode(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv4IspCityNodes["+ i +"].IspCode"));
			ipv4IspCityNode.setCityName(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv4IspCityNodes["+ i +"].CityName"));
			ipv4IspCityNode.setCityCode(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv4IspCityNodes["+ i +"].CityCode"));
			ipv4IspCityNode.setDefaultSelected(_ctx.booleanValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv4IspCityNodes["+ i +"].DefaultSelected"));
			ipv4IspCityNode.setGroupType(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv4IspCityNodes["+ i +"].GroupType"));
			ipv4IspCityNode.setGroupName(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv4IspCityNodes["+ i +"].GroupName"));

			ipv4IspCityNodes.add(ipv4IspCityNode);
		}
		describeDnsGtmMonitorAvailableConfigResponse.setIpv4IspCityNodes(ipv4IspCityNodes);

		List<Ipv6IspCityNode> ipv6IspCityNodes = new ArrayList<Ipv6IspCityNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv6IspCityNodes.Length"); i++) {
			Ipv6IspCityNode ipv6IspCityNode = new Ipv6IspCityNode();
			ipv6IspCityNode.setIspName(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv6IspCityNodes["+ i +"].IspName"));
			ipv6IspCityNode.setIspCode(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv6IspCityNodes["+ i +"].IspCode"));
			ipv6IspCityNode.setCityName(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv6IspCityNodes["+ i +"].CityName"));
			ipv6IspCityNode.setCityCode(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv6IspCityNodes["+ i +"].CityCode"));
			ipv6IspCityNode.setDefaultSelected(_ctx.booleanValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv6IspCityNodes["+ i +"].DefaultSelected"));
			ipv6IspCityNode.setGroupType(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv6IspCityNodes["+ i +"].GroupType"));
			ipv6IspCityNode.setGroupName(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.Ipv6IspCityNodes["+ i +"].GroupName"));

			ipv6IspCityNodes.add(ipv6IspCityNode);
		}
		describeDnsGtmMonitorAvailableConfigResponse.setIpv6IspCityNodes(ipv6IspCityNodes);

		List<DomainIpv4IspCityNode> domainIpv4IspCityNodes = new ArrayList<DomainIpv4IspCityNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv4IspCityNodes.Length"); i++) {
			DomainIpv4IspCityNode domainIpv4IspCityNode = new DomainIpv4IspCityNode();
			domainIpv4IspCityNode.setIspName(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv4IspCityNodes["+ i +"].IspName"));
			domainIpv4IspCityNode.setIspCode(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv4IspCityNodes["+ i +"].IspCode"));
			domainIpv4IspCityNode.setCityName(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv4IspCityNodes["+ i +"].CityName"));
			domainIpv4IspCityNode.setCityCode(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv4IspCityNodes["+ i +"].CityCode"));
			domainIpv4IspCityNode.setDefaultSelected(_ctx.booleanValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv4IspCityNodes["+ i +"].DefaultSelected"));
			domainIpv4IspCityNode.setGroupType(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv4IspCityNodes["+ i +"].GroupType"));
			domainIpv4IspCityNode.setGroupName(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv4IspCityNodes["+ i +"].GroupName"));

			domainIpv4IspCityNodes.add(domainIpv4IspCityNode);
		}
		describeDnsGtmMonitorAvailableConfigResponse.setDomainIpv4IspCityNodes(domainIpv4IspCityNodes);

		List<DomainIpv6IspCityNode> domainIpv6IspCityNodes = new ArrayList<DomainIpv6IspCityNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv6IspCityNodes.Length"); i++) {
			DomainIpv6IspCityNode domainIpv6IspCityNode = new DomainIpv6IspCityNode();
			domainIpv6IspCityNode.setIspName(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv6IspCityNodes["+ i +"].IspName"));
			domainIpv6IspCityNode.setIspCode(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv6IspCityNodes["+ i +"].IspCode"));
			domainIpv6IspCityNode.setCityName(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv6IspCityNodes["+ i +"].CityName"));
			domainIpv6IspCityNode.setCityCode(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv6IspCityNodes["+ i +"].CityCode"));
			domainIpv6IspCityNode.setDefaultSelected(_ctx.booleanValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv6IspCityNodes["+ i +"].DefaultSelected"));
			domainIpv6IspCityNode.setGroupType(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv6IspCityNodes["+ i +"].GroupType"));
			domainIpv6IspCityNode.setGroupName(_ctx.stringValue("DescribeDnsGtmMonitorAvailableConfigResponse.DomainIpv6IspCityNodes["+ i +"].GroupName"));

			domainIpv6IspCityNodes.add(domainIpv6IspCityNode);
		}
		describeDnsGtmMonitorAvailableConfigResponse.setDomainIpv6IspCityNodes(domainIpv6IspCityNodes);
	 
	 	return describeDnsGtmMonitorAvailableConfigResponse;
	}
}