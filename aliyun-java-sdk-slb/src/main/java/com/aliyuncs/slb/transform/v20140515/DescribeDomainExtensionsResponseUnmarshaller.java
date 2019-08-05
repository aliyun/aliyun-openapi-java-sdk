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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeDomainExtensionsResponse;
import com.aliyuncs.slb.model.v20140515.DescribeDomainExtensionsResponse.DomainExtension;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainExtensionsResponseUnmarshaller {

	public static DescribeDomainExtensionsResponse unmarshall(DescribeDomainExtensionsResponse describeDomainExtensionsResponse, UnmarshallerContext _ctx) {
		
		describeDomainExtensionsResponse.setRequestId(_ctx.stringValue("DescribeDomainExtensionsResponse.RequestId"));

		List<DomainExtension> domainExtensions = new ArrayList<DomainExtension>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainExtensionsResponse.DomainExtensions.Length"); i++) {
			DomainExtension domainExtension = new DomainExtension();
			domainExtension.setDomainExtensionId(_ctx.stringValue("DescribeDomainExtensionsResponse.DomainExtensions["+ i +"].DomainExtensionId"));
			domainExtension.setDomain(_ctx.stringValue("DescribeDomainExtensionsResponse.DomainExtensions["+ i +"].Domain"));
			domainExtension.setServerCertificateId(_ctx.stringValue("DescribeDomainExtensionsResponse.DomainExtensions["+ i +"].ServerCertificateId"));

			domainExtensions.add(domainExtension);
		}
		describeDomainExtensionsResponse.setDomainExtensions(domainExtensions);
	 
	 	return describeDomainExtensionsResponse;
	}
}