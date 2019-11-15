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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainTopClientIpVisitResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainTopClientIpVisitResponse.ClientIp;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainTopClientIpVisitResponseUnmarshaller {

	public static DescribeDomainTopClientIpVisitResponse unmarshall(DescribeDomainTopClientIpVisitResponse describeDomainTopClientIpVisitResponse, UnmarshallerContext _ctx) {
		
		describeDomainTopClientIpVisitResponse.setRequestId(_ctx.stringValue("DescribeDomainTopClientIpVisitResponse.RequestId"));

		List<ClientIp> clientIpList = new ArrayList<ClientIp>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainTopClientIpVisitResponse.ClientIpList.Length"); i++) {
			ClientIp clientIp = new ClientIp();
			clientIp.setRank(_ctx.integerValue("DescribeDomainTopClientIpVisitResponse.ClientIpList["+ i +"].Rank"));
			clientIp.setClientIp(_ctx.stringValue("DescribeDomainTopClientIpVisitResponse.ClientIpList["+ i +"].ClientIp"));
			clientIp.setTraffic(_ctx.longValue("DescribeDomainTopClientIpVisitResponse.ClientIpList["+ i +"].Traffic"));
			clientIp.setAcc(_ctx.longValue("DescribeDomainTopClientIpVisitResponse.ClientIpList["+ i +"].Acc"));

			clientIpList.add(clientIp);
		}
		describeDomainTopClientIpVisitResponse.setClientIpList(clientIpList);
	 
	 	return describeDomainTopClientIpVisitResponse;
	}
}