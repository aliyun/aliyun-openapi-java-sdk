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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeSlotsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSlotsResponse.Slot;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlotsResponseUnmarshaller {

	public static DescribeSlotsResponse unmarshall(DescribeSlotsResponse describeSlotsResponse, UnmarshallerContext _ctx) {
		
		describeSlotsResponse.setRequestId(_ctx.stringValue("DescribeSlotsResponse.RequestId"));

		List<Slot> slots = new ArrayList<Slot>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlotsResponse.Slots.Length"); i++) {
			Slot slot = new Slot();
			slot.setDatabase(_ctx.stringValue("DescribeSlotsResponse.Slots["+ i +"].Database"));
			slot.setPlugin(_ctx.stringValue("DescribeSlotsResponse.Slots["+ i +"].Plugin"));
			slot.setSlotName(_ctx.stringValue("DescribeSlotsResponse.Slots["+ i +"].SlotName"));
			slot.setSlotStatus(_ctx.stringValue("DescribeSlotsResponse.Slots["+ i +"].SlotStatus"));
			slot.setSlotType(_ctx.stringValue("DescribeSlotsResponse.Slots["+ i +"].SlotType"));
			slot.setSubReplayLag(_ctx.stringValue("DescribeSlotsResponse.Slots["+ i +"].SubReplayLag"));
			slot.setTemporary(_ctx.stringValue("DescribeSlotsResponse.Slots["+ i +"].Temporary"));
			slot.setWalDelay(_ctx.stringValue("DescribeSlotsResponse.Slots["+ i +"].WalDelay"));

			slots.add(slot);
		}
		describeSlotsResponse.setSlots(slots);
	 
	 	return describeSlotsResponse;
	}
}