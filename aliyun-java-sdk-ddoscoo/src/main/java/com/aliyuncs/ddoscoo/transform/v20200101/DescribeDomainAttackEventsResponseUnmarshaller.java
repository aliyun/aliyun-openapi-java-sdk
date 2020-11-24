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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainAttackEventsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainAttackEventsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainAttackEventsResponseUnmarshaller {

	public static DescribeDomainAttackEventsResponse unmarshall(DescribeDomainAttackEventsResponse describeDomainAttackEventsResponse, UnmarshallerContext _ctx) {
		
		describeDomainAttackEventsResponse.setRequestId(_ctx.stringValue("DescribeDomainAttackEventsResponse.RequestId"));
		describeDomainAttackEventsResponse.setTotalCount(_ctx.longValue("DescribeDomainAttackEventsResponse.TotalCount"));

		List<Data> domainAttackEvents = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainAttackEventsResponse.DomainAttackEvents.Length"); i++) {
			Data data = new Data();
			data.setDomain(_ctx.stringValue("DescribeDomainAttackEventsResponse.DomainAttackEvents["+ i +"].Domain"));
			data.setStartTime(_ctx.longValue("DescribeDomainAttackEventsResponse.DomainAttackEvents["+ i +"].StartTime"));
			data.setEndTime(_ctx.longValue("DescribeDomainAttackEventsResponse.DomainAttackEvents["+ i +"].EndTime"));
			data.setMaxQps(_ctx.longValue("DescribeDomainAttackEventsResponse.DomainAttackEvents["+ i +"].MaxQps"));

			domainAttackEvents.add(data);
		}
		describeDomainAttackEventsResponse.setDomainAttackEvents(domainAttackEvents);
	 
	 	return describeDomainAttackEventsResponse;
	}
}