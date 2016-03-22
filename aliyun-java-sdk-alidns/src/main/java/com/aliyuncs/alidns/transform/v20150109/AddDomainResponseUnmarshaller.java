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

import com.aliyuncs.alidns.model.v20150109.AddDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddDomainResponseUnmarshaller {

	public static AddDomainResponse unmarshall(AddDomainResponse addDomainResponse, UnmarshallerContext context) {
		
		addDomainResponse.setRequestId(context.stringValue("AddDomainResponse.RequestId"));
		addDomainResponse.setDomainId(context.stringValue("AddDomainResponse.DomainId"));
		addDomainResponse.setDomainName(context.stringValue("AddDomainResponse.DomainName"));
		addDomainResponse.setPunyCode(context.stringValue("AddDomainResponse.PunyCode"));
		addDomainResponse.setGroupId(context.stringValue("AddDomainResponse.GroupId"));
		addDomainResponse.setGroupName(context.stringValue("AddDomainResponse.GroupName"));

		List<String> dnsServers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("AddDomainResponse.DnsServers.Length"); i++) {
			dnsServers.add(context.stringValue("AddDomainResponse.DnsServers["+ i +"]"));
		}
		addDomainResponse.setDnsServers(dnsServers);
	 
	 	return addDomainResponse;
	}
}