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

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDDoSEventsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDDoSEventsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDDoSEventsResponseUnmarshaller {

	public static DescribeDDoSEventsResponse unmarshall(DescribeDDoSEventsResponse describeDDoSEventsResponse, UnmarshallerContext _ctx) {
		
		describeDDoSEventsResponse.setRequestId(_ctx.stringValue("DescribeDDoSEventsResponse.RequestId"));
		describeDDoSEventsResponse.setTotal(_ctx.longValue("DescribeDDoSEventsResponse.Total"));

		List<Data> dDoSEvents = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDDoSEventsResponse.DDoSEvents.Length"); i++) {
			Data data = new Data();
			data.setBps(_ctx.longValue("DescribeDDoSEventsResponse.DDoSEvents["+ i +"].Bps"));
			data.setPps(_ctx.longValue("DescribeDDoSEventsResponse.DDoSEvents["+ i +"].Pps"));
			data.setEventType(_ctx.stringValue("DescribeDDoSEventsResponse.DDoSEvents["+ i +"].EventType"));
			data.setIp(_ctx.stringValue("DescribeDDoSEventsResponse.DDoSEvents["+ i +"].Ip"));
			data.setStartTime(_ctx.longValue("DescribeDDoSEventsResponse.DDoSEvents["+ i +"].StartTime"));
			data.setEndTime(_ctx.longValue("DescribeDDoSEventsResponse.DDoSEvents["+ i +"].EndTime"));
			data.setPort(_ctx.stringValue("DescribeDDoSEventsResponse.DDoSEvents["+ i +"].Port"));
			data.setRegion(_ctx.stringValue("DescribeDDoSEventsResponse.DDoSEvents["+ i +"].Region"));

			dDoSEvents.add(data);
		}
		describeDDoSEventsResponse.setDDoSEvents(dDoSEvents);
	 
	 	return describeDDoSEventsResponse;
	}
}