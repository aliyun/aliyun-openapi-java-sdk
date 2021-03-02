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
import com.aliyuncs.alidns.model.v20150109.DescribeDNSSLBSubDomainsResponse.SlbSubDomain.LineAlgorithm;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDNSSLBSubDomainsResponseUnmarshaller {

	public static DescribeDNSSLBSubDomainsResponse unmarshall(DescribeDNSSLBSubDomainsResponse describeDNSSLBSubDomainsResponse, UnmarshallerContext _ctx) {
		
		describeDNSSLBSubDomainsResponse.setRequestId(_ctx.stringValue("DescribeDNSSLBSubDomainsResponse.RequestId"));
		describeDNSSLBSubDomainsResponse.setTotalCount(_ctx.longValue("DescribeDNSSLBSubDomainsResponse.TotalCount"));
		describeDNSSLBSubDomainsResponse.setPageNumber(_ctx.longValue("DescribeDNSSLBSubDomainsResponse.PageNumber"));
		describeDNSSLBSubDomainsResponse.setPageSize(_ctx.longValue("DescribeDNSSLBSubDomainsResponse.PageSize"));

		List<SlbSubDomain> slbSubDomains = new ArrayList<SlbSubDomain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDNSSLBSubDomainsResponse.SlbSubDomains.Length"); i++) {
			SlbSubDomain slbSubDomain = new SlbSubDomain();
			slbSubDomain.setSubDomain(_ctx.stringValue("DescribeDNSSLBSubDomainsResponse.SlbSubDomains["+ i +"].SubDomain"));
			slbSubDomain.setRecordCount(_ctx.longValue("DescribeDNSSLBSubDomainsResponse.SlbSubDomains["+ i +"].RecordCount"));
			slbSubDomain.setOpen(_ctx.booleanValue("DescribeDNSSLBSubDomainsResponse.SlbSubDomains["+ i +"].Open"));
			slbSubDomain.setType(_ctx.stringValue("DescribeDNSSLBSubDomainsResponse.SlbSubDomains["+ i +"].Type"));

			List<LineAlgorithm> lineAlgorithms = new ArrayList<LineAlgorithm>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDNSSLBSubDomainsResponse.SlbSubDomains["+ i +"].LineAlgorithms.Length"); j++) {
				LineAlgorithm lineAlgorithm = new LineAlgorithm();
				lineAlgorithm.setLine(_ctx.stringValue("DescribeDNSSLBSubDomainsResponse.SlbSubDomains["+ i +"].LineAlgorithms["+ j +"].Line"));
				lineAlgorithm.setOpen(_ctx.booleanValue("DescribeDNSSLBSubDomainsResponse.SlbSubDomains["+ i +"].LineAlgorithms["+ j +"].Open"));

				lineAlgorithms.add(lineAlgorithm);
			}
			slbSubDomain.setLineAlgorithms(lineAlgorithms);

			slbSubDomains.add(slbSubDomain);
		}
		describeDNSSLBSubDomainsResponse.setSlbSubDomains(slbSubDomains);
	 
	 	return describeDNSSLBSubDomainsResponse;
	}
}