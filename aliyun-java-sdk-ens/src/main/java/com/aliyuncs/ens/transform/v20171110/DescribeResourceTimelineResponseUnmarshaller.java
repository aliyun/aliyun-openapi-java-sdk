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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeResourceTimelineResponse;
import com.aliyuncs.ens.model.v20171110.DescribeResourceTimelineResponse.AvailableEventsItem;
import com.aliyuncs.ens.model.v20171110.DescribeResourceTimelineResponse.BizEventsItem;
import com.aliyuncs.ens.model.v20171110.DescribeResourceTimelineResponse.InventoryEventsItem;
import com.aliyuncs.ens.model.v20171110.DescribeResourceTimelineResponse.ReserveEventsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceTimelineResponseUnmarshaller {

	public static DescribeResourceTimelineResponse unmarshall(DescribeResourceTimelineResponse describeResourceTimelineResponse, UnmarshallerContext _ctx) {
		
		describeResourceTimelineResponse.setRequestId(_ctx.stringValue("DescribeResourceTimelineResponse.RequestId"));
		describeResourceTimelineResponse.setMsg(_ctx.stringValue("DescribeResourceTimelineResponse.Msg"));
		describeResourceTimelineResponse.setDesc(_ctx.stringValue("DescribeResourceTimelineResponse.Desc"));

		List<AvailableEventsItem> availableEvents = new ArrayList<AvailableEventsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTimelineResponse.AvailableEvents.Length"); i++) {
			AvailableEventsItem availableEventsItem = new AvailableEventsItem();
			availableEventsItem.setName(_ctx.stringValue("DescribeResourceTimelineResponse.AvailableEvents["+ i +"].Name"));
			availableEventsItem.setOccurrenceTime(_ctx.stringValue("DescribeResourceTimelineResponse.AvailableEvents["+ i +"].OccurrenceTime"));
			availableEventsItem.setReason(_ctx.stringValue("DescribeResourceTimelineResponse.AvailableEvents["+ i +"].Reason"));
			availableEventsItem.setType(_ctx.stringValue("DescribeResourceTimelineResponse.AvailableEvents["+ i +"].Type"));

			availableEvents.add(availableEventsItem);
		}
		describeResourceTimelineResponse.setAvailableEvents(availableEvents);

		List<BizEventsItem> bizEvents = new ArrayList<BizEventsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTimelineResponse.BizEvents.Length"); i++) {
			BizEventsItem bizEventsItem = new BizEventsItem();
			bizEventsItem.setName(_ctx.stringValue("DescribeResourceTimelineResponse.BizEvents["+ i +"].Name"));
			bizEventsItem.setOccurrenceTime(_ctx.stringValue("DescribeResourceTimelineResponse.BizEvents["+ i +"].OccurrenceTime"));
			bizEventsItem.setReason(_ctx.stringValue("DescribeResourceTimelineResponse.BizEvents["+ i +"].Reason"));
			bizEventsItem.setType(_ctx.stringValue("DescribeResourceTimelineResponse.BizEvents["+ i +"].Type"));

			bizEvents.add(bizEventsItem);
		}
		describeResourceTimelineResponse.setBizEvents(bizEvents);

		List<InventoryEventsItem> inventoryEvents = new ArrayList<InventoryEventsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTimelineResponse.InventoryEvents.Length"); i++) {
			InventoryEventsItem inventoryEventsItem = new InventoryEventsItem();
			inventoryEventsItem.setName(_ctx.stringValue("DescribeResourceTimelineResponse.InventoryEvents["+ i +"].Name"));
			inventoryEventsItem.setOccurrenceTime(_ctx.stringValue("DescribeResourceTimelineResponse.InventoryEvents["+ i +"].OccurrenceTime"));
			inventoryEventsItem.setReason(_ctx.stringValue("DescribeResourceTimelineResponse.InventoryEvents["+ i +"].Reason"));
			inventoryEventsItem.setType(_ctx.stringValue("DescribeResourceTimelineResponse.InventoryEvents["+ i +"].Type"));

			inventoryEvents.add(inventoryEventsItem);
		}
		describeResourceTimelineResponse.setInventoryEvents(inventoryEvents);

		List<ReserveEventsItem> reserveEvents = new ArrayList<ReserveEventsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTimelineResponse.ReserveEvents.Length"); i++) {
			ReserveEventsItem reserveEventsItem = new ReserveEventsItem();
			reserveEventsItem.setName(_ctx.stringValue("DescribeResourceTimelineResponse.ReserveEvents["+ i +"].Name"));
			reserveEventsItem.setOccurrenceTime(_ctx.stringValue("DescribeResourceTimelineResponse.ReserveEvents["+ i +"].OccurrenceTime"));
			reserveEventsItem.setReason(_ctx.stringValue("DescribeResourceTimelineResponse.ReserveEvents["+ i +"].Reason"));
			reserveEventsItem.setType(_ctx.stringValue("DescribeResourceTimelineResponse.ReserveEvents["+ i +"].Type"));

			reserveEvents.add(reserveEventsItem);
		}
		describeResourceTimelineResponse.setReserveEvents(reserveEvents);
	 
	 	return describeResourceTimelineResponse;
	}
}