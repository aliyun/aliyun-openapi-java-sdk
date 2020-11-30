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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafDomainResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafDomainResponse.OutPutDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnWafDomainResponseUnmarshaller {

	public static DescribeDcdnWafDomainResponse unmarshall(DescribeDcdnWafDomainResponse describeDcdnWafDomainResponse, UnmarshallerContext _ctx) {
		
		describeDcdnWafDomainResponse.setRequestId(_ctx.stringValue("DescribeDcdnWafDomainResponse.RequestId"));
		describeDcdnWafDomainResponse.setTotalCount(_ctx.integerValue("DescribeDcdnWafDomainResponse.TotalCount"));

		List<OutPutDomain> outPutDomains = new ArrayList<OutPutDomain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnWafDomainResponse.OutPutDomains.Length"); i++) {
			OutPutDomain outPutDomain = new OutPutDomain();
			outPutDomain.setStatus(_ctx.integerValue("DescribeDcdnWafDomainResponse.OutPutDomains["+ i +"].Status"));
			outPutDomain.setDomain(_ctx.stringValue("DescribeDcdnWafDomainResponse.OutPutDomains["+ i +"].Domain"));
			outPutDomain.setWafStatus(_ctx.integerValue("DescribeDcdnWafDomainResponse.OutPutDomains["+ i +"].WafStatus"));
			outPutDomain.setCcStatus(_ctx.integerValue("DescribeDcdnWafDomainResponse.OutPutDomains["+ i +"].CcStatus"));
			outPutDomain.setAclStatus(_ctx.integerValue("DescribeDcdnWafDomainResponse.OutPutDomains["+ i +"].AclStatus"));

			outPutDomains.add(outPutDomain);
		}
		describeDcdnWafDomainResponse.setOutPutDomains(outPutDomains);
	 
	 	return describeDcdnWafDomainResponse;
	}
}