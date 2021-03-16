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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnoseAbnormalResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnoseAbnormalResponse.Event;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnoseAbnormalResponse.Event.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeDiagnoseAbnormalResponseUnmarshaller {

	public static OpsDescribeDiagnoseAbnormalResponse unmarshall(OpsDescribeDiagnoseAbnormalResponse opsDescribeDiagnoseAbnormalResponse, UnmarshallerContext _ctx) {
		
		opsDescribeDiagnoseAbnormalResponse.setRequestId(_ctx.stringValue("OpsDescribeDiagnoseAbnormalResponse.RequestId"));
		opsDescribeDiagnoseAbnormalResponse.setCode(_ctx.stringValue("OpsDescribeDiagnoseAbnormalResponse.Code"));
		opsDescribeDiagnoseAbnormalResponse.setMessage(_ctx.stringValue("OpsDescribeDiagnoseAbnormalResponse.Message"));
		opsDescribeDiagnoseAbnormalResponse.setSuccess(_ctx.stringValue("OpsDescribeDiagnoseAbnormalResponse.Success"));

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeDiagnoseAbnormalResponse.Events.Length"); i++) {
			Event event = new Event();
			event.setResourceId(_ctx.stringValue("OpsDescribeDiagnoseAbnormalResponse.Events["+ i +"].ResourceId"));
			event.setResourceType(_ctx.stringValue("OpsDescribeDiagnoseAbnormalResponse.Events["+ i +"].ResourceType"));

			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDiagnoseAbnormalResponse.Events["+ i +"].Items.Length"); j++) {
				Item item = new Item();
				item.setItemCategory(_ctx.stringValue("OpsDescribeDiagnoseAbnormalResponse.Events["+ i +"].Items["+ j +"].ItemCategory"));
				item.setItemCode(_ctx.stringValue("OpsDescribeDiagnoseAbnormalResponse.Events["+ i +"].Items["+ j +"].ItemCode"));
				item.setMessage(_ctx.stringValue("OpsDescribeDiagnoseAbnormalResponse.Events["+ i +"].Items["+ j +"].Message"));

				items.add(item);
			}
			event.setItems(items);

			events.add(event);
		}
		opsDescribeDiagnoseAbnormalResponse.setEvents(events);
	 
	 	return opsDescribeDiagnoseAbnormalResponse;
	}
}