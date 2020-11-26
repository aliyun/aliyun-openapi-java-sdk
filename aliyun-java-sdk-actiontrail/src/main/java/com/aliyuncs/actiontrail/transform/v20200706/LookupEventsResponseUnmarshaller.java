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

package com.aliyuncs.actiontrail.transform.v20200706;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.actiontrail.model.v20200706.LookupEventsResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class LookupEventsResponseUnmarshaller {

	public static LookupEventsResponse unmarshall(LookupEventsResponse lookupEventsResponse, UnmarshallerContext _ctx) {
		
		lookupEventsResponse.setRequestId(_ctx.stringValue("LookupEventsResponse.RequestId"));
		lookupEventsResponse.setNextToken(_ctx.stringValue("LookupEventsResponse.NextToken"));
		lookupEventsResponse.setStartTime(_ctx.stringValue("LookupEventsResponse.StartTime"));
		lookupEventsResponse.setEndTime(_ctx.stringValue("LookupEventsResponse.EndTime"));

		List<Map<Object, Object>> events = _ctx.listMapValue("LookupEventsResponse.Events");
		lookupEventsResponse.setEvents(events);
	 
	 	return lookupEventsResponse;
	}
}