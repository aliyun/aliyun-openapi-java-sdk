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

import com.aliyuncs.alidns.model.v20150109.AddDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddDomainResponseUnmarshaller {

	public static AddDomainResponse unmarshall(AddDomainResponse addDomainResponse, UnmarshallerContext _ctx) {
		
		addDomainResponse.setRequestId(_ctx.stringValue("AddDomainResponse.RequestId"));
		addDomainResponse.setDomainId(_ctx.stringValue("AddDomainResponse.DomainId"));
		addDomainResponse.setDomainName(_ctx.stringValue("AddDomainResponse.DomainName"));
		addDomainResponse.setPunyCode(_ctx.stringValue("AddDomainResponse.PunyCode"));
		addDomainResponse.setGroupId(_ctx.stringValue("AddDomainResponse.GroupId"));
		addDomainResponse.setGroupName(_ctx.stringValue("AddDomainResponse.GroupName"));

		List<String> dnsServers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddDomainResponse.DnsServers.Length"); i++) {
			dnsServers.add(_ctx.stringValue("AddDomainResponse.DnsServers["+ i +"]"));
		}
		addDomainResponse.setDnsServers(dnsServers);
	 
	 	return addDomainResponse;
	}
}