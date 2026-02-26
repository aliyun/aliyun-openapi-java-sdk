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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.CheckDomainResponse;
import com.aliyuncs.domain.model.v20180129.CheckDomainResponse.PriceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckDomainResponseUnmarshaller {

	public static CheckDomainResponse unmarshall(CheckDomainResponse checkDomainResponse, UnmarshallerContext _ctx) {
		
		checkDomainResponse.setRequestId(_ctx.stringValue("CheckDomainResponse.RequestId"));
		checkDomainResponse.setAvail(_ctx.stringValue("CheckDomainResponse.Avail"));
		checkDomainResponse.setPrice(_ctx.longValue("CheckDomainResponse.Price"));
		checkDomainResponse.setDomainName(_ctx.stringValue("CheckDomainResponse.DomainName"));
		checkDomainResponse.setPremium(_ctx.stringValue("CheckDomainResponse.Premium"));
		checkDomainResponse.setDynamicCheck(_ctx.booleanValue("CheckDomainResponse.DynamicCheck"));
		checkDomainResponse.setReason(_ctx.stringValue("CheckDomainResponse.Reason"));

		List<PriceInfo> staticPriceInfo = new ArrayList<PriceInfo>();
		for (int i = 0; i < _ctx.lengthValue("CheckDomainResponse.StaticPriceInfo.Length"); i++) {
			PriceInfo priceInfo = new PriceInfo();
			priceInfo.setAction(_ctx.stringValue("CheckDomainResponse.StaticPriceInfo["+ i +"].action"));
			priceInfo.setMoney(_ctx.doubleValue("CheckDomainResponse.StaticPriceInfo["+ i +"].money"));
			priceInfo.setPeriod(_ctx.longValue("CheckDomainResponse.StaticPriceInfo["+ i +"].period"));

			staticPriceInfo.add(priceInfo);
		}
		checkDomainResponse.setStaticPriceInfo(staticPriceInfo);
	 
	 	return checkDomainResponse;
	}
}