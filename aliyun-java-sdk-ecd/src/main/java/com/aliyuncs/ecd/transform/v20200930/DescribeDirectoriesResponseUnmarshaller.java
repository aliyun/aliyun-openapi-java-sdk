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

import com.aliyuncs.ecd.model.v20200930.DescribeDirectoriesResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeDirectoriesResponse.Directory;
import com.aliyuncs.ecd.model.v20200930.DescribeDirectoriesResponse.Directory.ADConnector;
import com.aliyuncs.ecd.model.v20200930.DescribeDirectoriesResponse.Directory.Log;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDirectoriesResponseUnmarshaller {

	public static DescribeDirectoriesResponse unmarshall(DescribeDirectoriesResponse describeDirectoriesResponse, UnmarshallerContext _ctx) {
		
		describeDirectoriesResponse.setRequestId(_ctx.stringValue("DescribeDirectoriesResponse.RequestId"));
		describeDirectoriesResponse.setNextToken(_ctx.stringValue("DescribeDirectoriesResponse.NextToken"));

		List<Directory> directories = new ArrayList<Directory>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDirectoriesResponse.Directories.Length"); i++) {
			Directory directory = new Directory();
			directory.setEnableInternetAccess(_ctx.booleanValue("DescribeDirectoriesResponse.Directories["+ i +"].EnableInternetAccess"));
			directory.setVpcId(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].VpcId"));
			directory.setCreationTime(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].CreationTime"));
			directory.setStatus(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].Status"));
			directory.setDomainPassword(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].DomainPassword"));
			directory.setEnableAdminAccess(_ctx.booleanValue("DescribeDirectoriesResponse.Directories["+ i +"].EnableAdminAccess"));
			directory.setSubDomainName(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].SubDomainName"));
			directory.setDomainUserName(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].DomainUserName"));
			directory.setEnableCrossDesktopAccess(_ctx.booleanValue("DescribeDirectoriesResponse.Directories["+ i +"].EnableCrossDesktopAccess"));
			directory.setCustomSecurityGroupId(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].CustomSecurityGroupId"));
			directory.setDesktopVpcEndpoint(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].DesktopVpcEndpoint"));
			directory.setSsoEnabled(_ctx.booleanValue("DescribeDirectoriesResponse.Directories["+ i +"].SsoEnabled"));
			directory.setDomainName(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].DomainName"));
			directory.setDesktopAccessType(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].DesktopAccessType"));
			directory.setMfaEnabled(_ctx.booleanValue("DescribeDirectoriesResponse.Directories["+ i +"].MfaEnabled"));
			directory.setDirectoryType(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].DirectoryType"));
			directory.setDnsUserName(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].DnsUserName"));
			directory.setTrustPassword(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].TrustPassword"));
			directory.setOuName(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].OuName"));
			directory.setName(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].Name"));
			directory.setDirectoryId(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].DirectoryId"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDirectoriesResponse.Directories["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].VSwitchIds["+ j +"]"));
			}
			directory.setVSwitchIds(vSwitchIds);

			List<String> fileSystemIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDirectoriesResponse.Directories["+ i +"].FileSystemIds.Length"); j++) {
				fileSystemIds.add(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].FileSystemIds["+ j +"]"));
			}
			directory.setFileSystemIds(fileSystemIds);

			List<String> subDnsAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDirectoriesResponse.Directories["+ i +"].SubDnsAddress.Length"); j++) {
				subDnsAddress.add(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].SubDnsAddress["+ j +"]"));
			}
			directory.setSubDnsAddress(subDnsAddress);

			List<String> dnsAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDirectoriesResponse.Directories["+ i +"].DnsAddress.Length"); j++) {
				dnsAddress.add(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].DnsAddress["+ j +"]"));
			}
			directory.setDnsAddress(dnsAddress);

			List<ADConnector> aDConnectors = new ArrayList<ADConnector>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDirectoriesResponse.Directories["+ i +"].ADConnectors.Length"); j++) {
				ADConnector aDConnector = new ADConnector();
				aDConnector.setConnectorStatus(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].ADConnectors["+ j +"].ConnectorStatus"));
				aDConnector.setVSwitchId(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].ADConnectors["+ j +"].VSwitchId"));
				aDConnector.setADConnectorAddress(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].ADConnectors["+ j +"].ADConnectorAddress"));
				aDConnector.setTrustKey(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].ADConnectors["+ j +"].TrustKey"));
				aDConnector.setNetworkInterfaceId(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].ADConnectors["+ j +"].NetworkInterfaceId"));

				aDConnectors.add(aDConnector);
			}
			directory.setADConnectors(aDConnectors);

			List<Log> logs = new ArrayList<Log>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDirectoriesResponse.Directories["+ i +"].Logs.Length"); j++) {
				Log log = new Log();
				log.setStep(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].Logs["+ j +"].Step"));
				log.setMessage(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].Logs["+ j +"].Message"));
				log.setTimeStamp(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].Logs["+ j +"].TimeStamp"));
				log.setLevel(_ctx.stringValue("DescribeDirectoriesResponse.Directories["+ i +"].Logs["+ j +"].Level"));

				logs.add(log);
			}
			directory.setLogs(logs);

			directories.add(directory);
		}
		describeDirectoriesResponse.setDirectories(directories);
	 
	 	return describeDirectoriesResponse;
	}
}