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
import com.aliyuncs.ens.model.v20171110.DescribeResourceTimelineResponse.可用性事件;
import com.aliyuncs.ens.model.v20171110.DescribeResourceTimelineResponse.建设状态事件;
import com.aliyuncs.ens.model.v20171110.DescribeResourceTimelineResponse.资源扣减事件;
import com.aliyuncs.ens.model.v20171110.DescribeResourceTimelineResponse.资源预留事件;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceTimelineResponseUnmarshaller {

	public static DescribeResourceTimelineResponse unmarshall(DescribeResourceTimelineResponse describeResourceTimelineResponse, UnmarshallerContext _ctx) {
		
		describeResourceTimelineResponse.setRequestId(_ctx.stringValue("DescribeResourceTimelineResponse.RequestId"));
		describeResourceTimelineResponse.setMsg(_ctx.stringValue("DescribeResourceTimelineResponse.Msg"));
		describeResourceTimelineResponse.setDesc(_ctx.stringValue("DescribeResourceTimelineResponse.Desc"));

		List<可用性事件> availableEvents = new ArrayList<可用性事件>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTimelineResponse.AvailableEvents.Length"); i++) {
			可用性事件 可用性事件 = new 可用性事件();
			可用性事件.setName(_ctx.stringValue("DescribeResourceTimelineResponse.AvailableEvents["+ i +"].Name"));
			可用性事件.setOccurrenceTime(_ctx.stringValue("DescribeResourceTimelineResponse.AvailableEvents["+ i +"].OccurrenceTime"));
			可用性事件.setReason(_ctx.stringValue("DescribeResourceTimelineResponse.AvailableEvents["+ i +"].Reason"));
			可用性事件.setType(_ctx.stringValue("DescribeResourceTimelineResponse.AvailableEvents["+ i +"].Type"));

			availableEvents.add(可用性事件);
		}
		describeResourceTimelineResponse.setAvailableEvents(availableEvents);

		List<建设状态事件> bizEvents = new ArrayList<建设状态事件>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTimelineResponse.BizEvents.Length"); i++) {
			建设状态事件 建设状态事件 = new 建设状态事件();
			建设状态事件.setName(_ctx.stringValue("DescribeResourceTimelineResponse.BizEvents["+ i +"].Name"));
			建设状态事件.setOccurrenceTime(_ctx.stringValue("DescribeResourceTimelineResponse.BizEvents["+ i +"].OccurrenceTime"));
			建设状态事件.setReason(_ctx.stringValue("DescribeResourceTimelineResponse.BizEvents["+ i +"].Reason"));
			建设状态事件.setType(_ctx.stringValue("DescribeResourceTimelineResponse.BizEvents["+ i +"].Type"));

			bizEvents.add(建设状态事件);
		}
		describeResourceTimelineResponse.setBizEvents(bizEvents);

		List<资源扣减事件> inventoryEvents = new ArrayList<资源扣减事件>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTimelineResponse.InventoryEvents.Length"); i++) {
			资源扣减事件 资源扣减事件 = new 资源扣减事件();
			资源扣减事件.setName(_ctx.stringValue("DescribeResourceTimelineResponse.InventoryEvents["+ i +"].Name"));
			资源扣减事件.setOccurrenceTime(_ctx.stringValue("DescribeResourceTimelineResponse.InventoryEvents["+ i +"].OccurrenceTime"));
			资源扣减事件.setReason(_ctx.stringValue("DescribeResourceTimelineResponse.InventoryEvents["+ i +"].Reason"));
			资源扣减事件.setType(_ctx.stringValue("DescribeResourceTimelineResponse.InventoryEvents["+ i +"].Type"));

			inventoryEvents.add(资源扣减事件);
		}
		describeResourceTimelineResponse.setInventoryEvents(inventoryEvents);

		List<资源预留事件> reserveEvents = new ArrayList<资源预留事件>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceTimelineResponse.ReserveEvents.Length"); i++) {
			资源预留事件 资源预留事件 = new 资源预留事件();
			资源预留事件.setName(_ctx.stringValue("DescribeResourceTimelineResponse.ReserveEvents["+ i +"].Name"));
			资源预留事件.setOccurrenceTime(_ctx.stringValue("DescribeResourceTimelineResponse.ReserveEvents["+ i +"].OccurrenceTime"));
			资源预留事件.setReason(_ctx.stringValue("DescribeResourceTimelineResponse.ReserveEvents["+ i +"].Reason"));
			资源预留事件.setType(_ctx.stringValue("DescribeResourceTimelineResponse.ReserveEvents["+ i +"].Type"));

			reserveEvents.add(资源预留事件);
		}
		describeResourceTimelineResponse.setReserveEvents(reserveEvents);
	 
	 	return describeResourceTimelineResponse;
	}
}