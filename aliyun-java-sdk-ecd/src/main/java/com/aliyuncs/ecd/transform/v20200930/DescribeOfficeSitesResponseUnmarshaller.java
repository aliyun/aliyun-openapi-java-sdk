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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeOfficeSitesResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeOfficeSitesResponse.OfficeSite;
import com.aliyuncs.ecd.model.v20200930.DescribeOfficeSitesResponse.OfficeSite.ADConnector;
import com.aliyuncs.ecd.model.v20200930.DescribeOfficeSitesResponse.OfficeSite.Log;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOfficeSitesResponseUnmarshaller {

	public static DescribeOfficeSitesResponse unmarshall(DescribeOfficeSitesResponse describeOfficeSitesResponse, UnmarshallerContext _ctx) {
		
		describeOfficeSitesResponse.setRequestId(_ctx.stringValue("DescribeOfficeSitesResponse.RequestId"));
		describeOfficeSitesResponse.setNextToken(_ctx.stringValue("DescribeOfficeSitesResponse.NextToken"));

		List<OfficeSite> officeSites = new ArrayList<OfficeSite>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOfficeSitesResponse.OfficeSites.Length"); i++) {
			OfficeSite officeSite = new OfficeSite();
			officeSite.setOfficeSiteId(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].OfficeSiteId"));
			officeSite.setStatus(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].Status"));
			officeSite.setOfficeSiteType(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].OfficeSiteType"));
			officeSite.setCreationTime(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].CreationTime"));
			officeSite.setName(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].Name"));
			officeSite.setVpcId(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].VpcId"));
			officeSite.setCustomSecurityGroupId(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].CustomSecurityGroupId"));
			officeSite.setDnsUserName(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].DnsUserName"));
			officeSite.setEnableInternetAccess(_ctx.booleanValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].EnableInternetAccess"));
			officeSite.setEnableCrossDesktopAccess(_ctx.booleanValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].EnableCrossDesktopAccess"));
			officeSite.setEnableAdminAccess(_ctx.booleanValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].EnableAdminAccess"));
			officeSite.setDesktopAccessType(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].DesktopAccessType"));
			officeSite.setDesktopVpcEndpoint(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].DesktopVpcEndpoint"));
			officeSite.setTrustPassword(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].TrustPassword"));
			officeSite.setDomainName(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].DomainName"));
			officeSite.setDomainUserName(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].DomainUserName"));
			officeSite.setDomainPassword(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].DomainPassword"));
			officeSite.setSubDomainName(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].SubDomainName"));
			officeSite.setMfaEnabled(_ctx.booleanValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].MfaEnabled"));
			officeSite.setSsoEnabled(_ctx.booleanValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].SsoEnabled"));
			officeSite.setBandwidth(_ctx.integerValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].Bandwidth"));
			officeSite.setCenId(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].CenId"));
			officeSite.setNetworkPackageId(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].NetworkPackageId"));
			officeSite.setCidrBlock(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].CidrBlock"));

			List<String> dnsAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].DnsAddress.Length"); j++) {
				dnsAddress.add(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].DnsAddress["+ j +"]"));
			}
			officeSite.setDnsAddress(dnsAddress);

			List<String> subDnsAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].SubDnsAddress.Length"); j++) {
				subDnsAddress.add(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].SubDnsAddress["+ j +"]"));
			}
			officeSite.setSubDnsAddress(subDnsAddress);

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].VSwitchIds["+ j +"]"));
			}
			officeSite.setVSwitchIds(vSwitchIds);

			List<String> fileSystemIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].FileSystemIds.Length"); j++) {
				fileSystemIds.add(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].FileSystemIds["+ j +"]"));
			}
			officeSite.setFileSystemIds(fileSystemIds);

			List<ADConnector> aDConnectors = new ArrayList<ADConnector>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].ADConnectors.Length"); j++) {
				ADConnector aDConnector = new ADConnector();
				aDConnector.setADConnectorAddress(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].ADConnectors["+ j +"].ADConnectorAddress"));
				aDConnector.setVSwitchId(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].ADConnectors["+ j +"].VSwitchId"));
				aDConnector.setConnectorStatus(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].ADConnectors["+ j +"].ConnectorStatus"));
				aDConnector.setNetworkInterfaceId(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].ADConnectors["+ j +"].NetworkInterfaceId"));

				aDConnectors.add(aDConnector);
			}
			officeSite.setADConnectors(aDConnectors);

			List<Log> logs = new ArrayList<Log>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].Logs.Length"); j++) {
				Log log = new Log();
				log.setLevel(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].Logs["+ j +"].Level"));
				log.setTimeStamp(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].Logs["+ j +"].TimeStamp"));
				log.setStep(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].Logs["+ j +"].Step"));
				log.setMessage(_ctx.stringValue("DescribeOfficeSitesResponse.OfficeSites["+ i +"].Logs["+ j +"].Message"));

				logs.add(log);
			}
			officeSite.setLogs(logs);

			officeSites.add(officeSite);
		}
		describeOfficeSitesResponse.setOfficeSites(officeSites);
	 
	 	return describeOfficeSitesResponse;
	}
}