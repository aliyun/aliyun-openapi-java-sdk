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

import com.aliyuncs.alidns.model.v20150109.DescribeDNSSLBSubDomainsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDNSSLBSubDomainsResponse.SlbSubDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDNSSLBSubDomainsResponseUnmarshaller {

	public static DescribeDNSSLBSubDomainsResponse unmarshall(DescribeDNSSLBSubDomainsResponse describeDNSSLBSubDomainsResponse, UnmarshallerContext context) {
		
		describeDNSSLBSubDomainsResponse.setRequestId(context.stringValue("DescribeDNSSLBSubDomainsResponse.RequestId"));
		describeDNSSLBSubDomainsResponse.setTotalCount(context.longValue("DescribeDNSSLBSubDomainsResponse.TotalCount"));
		describeDNSSLBSubDomainsResponse.setPageNumber(context.longValue("DescribeDNSSLBSubDomainsResponse.PageNumber"));
		describeDNSSLBSubDomainsResponse.setPageSize(context.longValue("DescribeDNSSLBSubDomainsResponse.PageSize"));

		List<SlbSubDomain> slbSubDomains = new ArrayList<SlbSubDomain>();
		for (int i = 0; i < context.lengthValue("DescribeDNSSLBSubDomainsResponse.SlbSubDomains.Length"); i++) {
			SlbSubDomain slbSubDomain = new SlbSubDomain();
			slbSubDomain.setSubDomain(context.stringValue("DescribeDNSSLBSubDomainsResponse.SlbSubDomains["+ i +"].SubDomain"));
			slbSubDomain.setRecordCount(context.longValue("DescribeDNSSLBSubDomainsResponse.SlbSubDomains["+ i +"].RecordCount"));
			slbSubDomain.setOpen(context.booleanValue("DescribeDNSSLBSubDomainsResponse.SlbSubDomains["+ i +"].Open"));

			slbSubDomains.add(slbSubDomain);
		}
		describeDNSSLBSubDomainsResponse.setSlbSubDomains(slbSubDomains);
	 
	 	return describeDNSSLBSubDomainsResponse;
	}
}