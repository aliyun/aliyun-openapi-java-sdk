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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetDomainsResponse;
import com.aliyuncs.swas.model.v20170810.GetDomainsResponse.Domain;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDomainsResponseUnmarshaller {

	public static GetDomainsResponse unmarshall(GetDomainsResponse getDomainsResponse, UnmarshallerContext _ctx) {
		
		getDomainsResponse.setRequestId(_ctx.stringValue("GetDomainsResponse.RequestId"));
		getDomainsResponse.setIsSuccess(_ctx.booleanValue("GetDomainsResponse.IsSuccess"));
		getDomainsResponse.setPageSize(_ctx.integerValue("GetDomainsResponse.PageSize"));
		getDomainsResponse.setCurrentPage(_ctx.integerValue("GetDomainsResponse.CurrentPage"));
		getDomainsResponse.setTotal(_ctx.integerValue("GetDomainsResponse.Total"));
		getDomainsResponse.setCode(_ctx.stringValue("GetDomainsResponse.Code"));

		List<Domain> domains = new ArrayList<Domain>();
		for (int i = 0; i < _ctx.lengthValue("GetDomainsResponse.Domains.Length"); i++) {
			Domain domain = new Domain();
			domain.setDomain(_ctx.stringValue("GetDomainsResponse.Domains["+ i +"].Domain"));
			domain.setHttpsOn(_ctx.booleanValue("GetDomainsResponse.Domains["+ i +"].HttpsOn"));
			domain.setHttpsSettingOn(_ctx.booleanValue("GetDomainsResponse.Domains["+ i +"].HttpsSettingOn"));

			domains.add(domain);
		}
		getDomainsResponse.setDomains(domains);
	 
	 	return getDomainsResponse;
	}
}