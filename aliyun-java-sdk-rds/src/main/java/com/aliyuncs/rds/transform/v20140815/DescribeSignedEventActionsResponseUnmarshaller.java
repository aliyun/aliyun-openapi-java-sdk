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

import com.aliyuncs.rds.model.v20140815.DescribeSignedEventActionsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSignedEventActionsResponse.EventItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSignedEventActionsResponseUnmarshaller {

	public static DescribeSignedEventActionsResponse unmarshall(DescribeSignedEventActionsResponse describeSignedEventActionsResponse, UnmarshallerContext _ctx) {
		
		describeSignedEventActionsResponse.setRequestId(_ctx.stringValue("DescribeSignedEventActionsResponse.RequestId"));
		describeSignedEventActionsResponse.setNextPageEventId(_ctx.integerValue("DescribeSignedEventActionsResponse.NextPageEventId"));
		describeSignedEventActionsResponse.setPageRecordCount(_ctx.integerValue("DescribeSignedEventActionsResponse.PageRecordCount"));
		describeSignedEventActionsResponse.setFromBegin(_ctx.booleanValue("DescribeSignedEventActionsResponse.FromBegin"));
		describeSignedEventActionsResponse.setToEnd(_ctx.booleanValue("DescribeSignedEventActionsResponse.ToEnd"));

		List<EventItemsItem> eventItems = new ArrayList<EventItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSignedEventActionsResponse.EventItems.Length"); i++) {
			EventItemsItem eventItemsItem = new EventItemsItem();
			eventItemsItem.setEventId(_ctx.integerValue("DescribeSignedEventActionsResponse.EventItems["+ i +"].EventId"));
			eventItemsItem.setEventContent(_ctx.stringValue("DescribeSignedEventActionsResponse.EventItems["+ i +"].EventContent"));
			eventItemsItem.setEventSig(_ctx.stringValue("DescribeSignedEventActionsResponse.EventItems["+ i +"].EventSig"));
			eventItemsItem.setEventRcpt(_ctx.stringValue("DescribeSignedEventActionsResponse.EventItems["+ i +"].EventRcpt"));

			eventItems.add(eventItemsItem);
		}
		describeSignedEventActionsResponse.setEventItems(eventItems);
	 
	 	return describeSignedEventActionsResponse;
	}
}