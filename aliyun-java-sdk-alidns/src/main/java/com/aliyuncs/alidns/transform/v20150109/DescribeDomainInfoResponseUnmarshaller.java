/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeDomainInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainInfoResponseUnmarshaller {

	public static DescribeDomainInfoResponse unmarshall(DescribeDomainInfoResponse describeDomainInfoResponse, UnmarshallerContext context) {
		
		describeDomainInfoResponse.setRequestId(context.stringValue("DescribeDomainInfoResponse.RequestId"));
		describeDomainInfoResponse.setDomainId(context.stringValue("DescribeDomainInfoResponse.DomainId"));
		describeDomainInfoResponse.setDomainName(context.stringValue("DescribeDomainInfoResponse.DomainName"));
		describeDomainInfoResponse.setPunyCode(context.stringValue("DescribeDomainInfoResponse.PunyCode"));
		describeDomainInfoResponse.setAliDomain(context.booleanValue("DescribeDomainInfoResponse.AliDomain"));
		describeDomainInfoResponse.setRegistrantEmail(context.stringValue("DescribeDomainInfoResponse.RegistrantEmail"));
		describeDomainInfoResponse.setGroupId(context.stringValue("DescribeDomainInfoResponse.GroupId"));
		describeDomainInfoResponse.setGroupName(context.stringValue("DescribeDomainInfoResponse.GroupName"));
		describeDomainInfoResponse.setInstanceId(context.stringValue("DescribeDomainInfoResponse.InstanceId"));
		describeDomainInfoResponse.setVersionCode(context.stringValue("DescribeDomainInfoResponse.VersionCode"));
		describeDomainInfoResponse.setVersionName(context.stringValue("DescribeDomainInfoResponse.VersionName"));

		List<String> dnsServers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeDomainInfoResponse.DnsServers.Length"); i++) {
			dnsServers.add(context.stringValue("DescribeDomainInfoResponse.DnsServers["+ i +"]"));
		}
		describeDomainInfoResponse.setDnsServers(dnsServers);
	 
	 	return describeDomainInfoResponse;
	}
}