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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeCdnWafDomainResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnWafDomainResponse.OutPutDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnWafDomainResponseUnmarshaller {

	public static DescribeCdnWafDomainResponse unmarshall(DescribeCdnWafDomainResponse describeCdnWafDomainResponse, UnmarshallerContext _ctx) {
		
		describeCdnWafDomainResponse.setRequestId(_ctx.stringValue("DescribeCdnWafDomainResponse.RequestId"));
		describeCdnWafDomainResponse.setTotalCount(_ctx.integerValue("DescribeCdnWafDomainResponse.TotalCount"));

		List<OutPutDomain> outPutDomains = new ArrayList<OutPutDomain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnWafDomainResponse.OutPutDomains.Length"); i++) {
			OutPutDomain outPutDomain = new OutPutDomain();
			outPutDomain.setStatus(_ctx.stringValue("DescribeCdnWafDomainResponse.OutPutDomains["+ i +"].Status"));
			outPutDomain.setDomain(_ctx.stringValue("DescribeCdnWafDomainResponse.OutPutDomains["+ i +"].Domain"));
			outPutDomain.setWafStatus(_ctx.stringValue("DescribeCdnWafDomainResponse.OutPutDomains["+ i +"].WafStatus"));
			outPutDomain.setCcStatus(_ctx.stringValue("DescribeCdnWafDomainResponse.OutPutDomains["+ i +"].CcStatus"));
			outPutDomain.setAclStatus(_ctx.stringValue("DescribeCdnWafDomainResponse.OutPutDomains["+ i +"].AclStatus"));

			outPutDomains.add(outPutDomain);
		}
		describeCdnWafDomainResponse.setOutPutDomains(outPutDomains);
	 
	 	return describeCdnWafDomainResponse;
	}
}