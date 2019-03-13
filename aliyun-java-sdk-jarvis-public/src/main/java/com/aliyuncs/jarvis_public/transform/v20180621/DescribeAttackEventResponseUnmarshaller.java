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

package com.aliyuncs.jarvis_public.transform.v20180621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.jarvis_public.model.v20180621.DescribeAttackEventResponse;
import com.aliyuncs.jarvis_public.model.v20180621.DescribeAttackEventResponse.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAttackEventResponseUnmarshaller {

	public static DescribeAttackEventResponse unmarshall(DescribeAttackEventResponse describeAttackEventResponse, UnmarshallerContext context) {
		
		describeAttackEventResponse.setRequestId(context.stringValue("DescribeAttackEventResponse.RequestId"));
		describeAttackEventResponse.setModule(context.stringValue("DescribeAttackEventResponse.Module"));

		List<Event> eventList = new ArrayList<Event>();
		for (int i = 0; i < context.lengthValue("DescribeAttackEventResponse.EventList.Length"); i++) {
			Event event = new Event();
			event.setVmIp(context.stringValue("DescribeAttackEventResponse.EventList["+ i +"].VmIp"));
			event.setSourceIp(context.stringValue("DescribeAttackEventResponse.EventList["+ i +"].SourceIp"));
			event.setUrl(context.stringValue("DescribeAttackEventResponse.EventList["+ i +"].Url"));
			event.setAttackType(context.stringValue("DescribeAttackEventResponse.EventList["+ i +"].AttackType"));
			event.setGmtCreate(context.stringValue("DescribeAttackEventResponse.EventList["+ i +"].GmtCreate"));
			event.setGmtCreateStamp(context.integerValue("DescribeAttackEventResponse.EventList["+ i +"].GmtCreateStamp"));
			event.setGmtModified(context.stringValue("DescribeAttackEventResponse.EventList["+ i +"].GmtModified"));

			eventList.add(event);
		}
		describeAttackEventResponse.setEventList(eventList);
	 
	 	return describeAttackEventResponse;
	}
}