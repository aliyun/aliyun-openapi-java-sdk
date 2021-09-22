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

import com.aliyuncs.alidns.model.v20150109.DescribePdnsAccountSummaryResponse;
import com.aliyuncs.alidns.model.v20150109.DescribePdnsAccountSummaryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePdnsAccountSummaryResponseUnmarshaller {

	public static DescribePdnsAccountSummaryResponse unmarshall(DescribePdnsAccountSummaryResponse describePdnsAccountSummaryResponse, UnmarshallerContext _ctx) {
		
		describePdnsAccountSummaryResponse.setRequestId(_ctx.stringValue("DescribePdnsAccountSummaryResponse.RequestId"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("DescribePdnsAccountSummaryResponse.Data.TotalCount"));
		data.setThreatCount(_ctx.longValue("DescribePdnsAccountSummaryResponse.Data.ThreatCount"));
		data.setUserId(_ctx.longValue("DescribePdnsAccountSummaryResponse.Data.UserId"));
		data.setHttpsCount(_ctx.longValue("DescribePdnsAccountSummaryResponse.Data.HttpsCount"));
		data.setHttpCount(_ctx.longValue("DescribePdnsAccountSummaryResponse.Data.HttpCount"));
		data.setSubDomainCount(_ctx.longValue("DescribePdnsAccountSummaryResponse.Data.SubDomainCount"));
		data.setDomainCount(_ctx.longValue("DescribePdnsAccountSummaryResponse.Data.DomainCount"));
		describePdnsAccountSummaryResponse.setData(data);
	 
	 	return describePdnsAccountSummaryResponse;
	}
}