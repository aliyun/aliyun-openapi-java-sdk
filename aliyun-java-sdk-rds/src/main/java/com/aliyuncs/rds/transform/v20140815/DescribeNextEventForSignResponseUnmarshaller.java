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

import com.aliyuncs.rds.model.v20140815.DescribeNextEventForSignResponse;
import com.aliyuncs.rds.model.v20140815.DescribeNextEventForSignResponse.EventItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNextEventForSignResponseUnmarshaller {

	public static DescribeNextEventForSignResponse unmarshall(DescribeNextEventForSignResponse describeNextEventForSignResponse, UnmarshallerContext _ctx) {
		
		describeNextEventForSignResponse.setRequestId(_ctx.stringValue("DescribeNextEventForSignResponse.RequestId"));

		List<EventItemsItem> eventItems = new ArrayList<EventItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNextEventForSignResponse.EventItems.Length"); i++) {
			EventItemsItem eventItemsItem = new EventItemsItem();
			eventItemsItem.setEventId(_ctx.integerValue("DescribeNextEventForSignResponse.EventItems["+ i +"].EventId"));
			eventItemsItem.setEventContent(_ctx.stringValue("DescribeNextEventForSignResponse.EventItems["+ i +"].EventContent"));

			eventItems.add(eventItemsItem);
		}
		describeNextEventForSignResponse.setEventItems(eventItems);
	 
	 	return describeNextEventForSignResponse;
	}
}