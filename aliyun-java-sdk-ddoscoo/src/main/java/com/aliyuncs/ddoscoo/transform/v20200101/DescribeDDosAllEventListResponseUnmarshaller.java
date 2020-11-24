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

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDDosAllEventListResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDDosAllEventListResponse.AttackEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDDosAllEventListResponseUnmarshaller {

	public static DescribeDDosAllEventListResponse unmarshall(DescribeDDosAllEventListResponse describeDDosAllEventListResponse, UnmarshallerContext _ctx) {
		
		describeDDosAllEventListResponse.setRequestId(_ctx.stringValue("DescribeDDosAllEventListResponse.RequestId"));
		describeDDosAllEventListResponse.setTotal(_ctx.longValue("DescribeDDosAllEventListResponse.Total"));

		List<AttackEvent> attackEvents = new ArrayList<AttackEvent>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDDosAllEventListResponse.AttackEvents.Length"); i++) {
			AttackEvent attackEvent = new AttackEvent();
			attackEvent.setPps(_ctx.longValue("DescribeDDosAllEventListResponse.AttackEvents["+ i +"].Pps"));
			attackEvent.setEventType(_ctx.stringValue("DescribeDDosAllEventListResponse.AttackEvents["+ i +"].EventType"));
			attackEvent.setPort(_ctx.stringValue("DescribeDDosAllEventListResponse.AttackEvents["+ i +"].Port"));
			attackEvent.setIp(_ctx.stringValue("DescribeDDosAllEventListResponse.AttackEvents["+ i +"].Ip"));
			attackEvent.setStartTime(_ctx.longValue("DescribeDDosAllEventListResponse.AttackEvents["+ i +"].StartTime"));
			attackEvent.setEndTime(_ctx.longValue("DescribeDDosAllEventListResponse.AttackEvents["+ i +"].EndTime"));
			attackEvent.setMbps(_ctx.longValue("DescribeDDosAllEventListResponse.AttackEvents["+ i +"].Mbps"));

			attackEvents.add(attackEvent);
		}
		describeDDosAllEventListResponse.setAttackEvents(attackEvents);
	 
	 	return describeDDosAllEventListResponse;
	}
}