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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListDomainsResponse;
import com.aliyuncs.eiam.model.v20211201.ListDomainsResponse.Domain;
import com.aliyuncs.eiam.model.v20211201.ListDomainsResponse.Domain.Filing;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDomainsResponseUnmarshaller {

	public static ListDomainsResponse unmarshall(ListDomainsResponse listDomainsResponse, UnmarshallerContext _ctx) {
		
		listDomainsResponse.setRequestId(_ctx.stringValue("ListDomainsResponse.RequestId"));

		List<Domain> domains = new ArrayList<Domain>();
		for (int i = 0; i < _ctx.lengthValue("ListDomainsResponse.Domains.Length"); i++) {
			Domain domain = new Domain();
			domain.setInstanceId(_ctx.stringValue("ListDomainsResponse.Domains["+ i +"].InstanceId"));
			domain.setDomainId(_ctx.stringValue("ListDomainsResponse.Domains["+ i +"].DomainId"));
			domain.setDomain(_ctx.stringValue("ListDomainsResponse.Domains["+ i +"].Domain"));
			domain.setDomainType(_ctx.stringValue("ListDomainsResponse.Domains["+ i +"].DomainType"));
			domain.setLockMode(_ctx.stringValue("ListDomainsResponse.Domains["+ i +"].LockMode"));
			domain.setDefaultDomain(_ctx.booleanValue("ListDomainsResponse.Domains["+ i +"].DefaultDomain"));
			domain.setCreateTime(_ctx.longValue("ListDomainsResponse.Domains["+ i +"].CreateTime"));
			domain.setUpdateTime(_ctx.longValue("ListDomainsResponse.Domains["+ i +"].UpdateTime"));
			domain.setBrandId(_ctx.stringValue("ListDomainsResponse.Domains["+ i +"].BrandId"));

			Filing filing = new Filing();
			filing.setIcpNumber(_ctx.stringValue("ListDomainsResponse.Domains["+ i +"].Filing.IcpNumber"));
			domain.setFiling(filing);

			domains.add(domain);
		}
		listDomainsResponse.setDomains(domains);
	 
	 	return listDomainsResponse;
	}
}