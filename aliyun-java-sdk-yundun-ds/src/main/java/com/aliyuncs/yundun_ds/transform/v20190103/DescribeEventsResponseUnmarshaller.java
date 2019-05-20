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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventsResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventsResponse.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventsResponseUnmarshaller {

	public static DescribeEventsResponse unmarshall(DescribeEventsResponse describeEventsResponse, UnmarshallerContext context) {
		
		describeEventsResponse.setRequestId(context.stringValue("DescribeEventsResponse.RequestId"));
		describeEventsResponse.setPageSize(context.integerValue("DescribeEventsResponse.PageSize"));
		describeEventsResponse.setCurrentPage(context.integerValue("DescribeEventsResponse.CurrentPage"));
		describeEventsResponse.setTotalCount(context.integerValue("DescribeEventsResponse.TotalCount"));

		List<Event> items = new ArrayList<Event>();
		for (int i = 0; i < context.lengthValue("DescribeEventsResponse.Items.Length"); i++) {
			Event event = new Event();
			event.setId(context.longValue("DescribeEventsResponse.Items["+ i +"].Id"));
			event.setUserId(context.longValue("DescribeEventsResponse.Items["+ i +"].UserId"));
			event.setLoginName(context.stringValue("DescribeEventsResponse.Items["+ i +"].LoginName"));
			event.setDisplayName(context.stringValue("DescribeEventsResponse.Items["+ i +"].DisplayName"));
			event.setProductCode(context.stringValue("DescribeEventsResponse.Items["+ i +"].ProductCode"));
			event.setTypeCode(context.stringValue("DescribeEventsResponse.Items["+ i +"].TypeCode"));
			event.setTypeName(context.stringValue("DescribeEventsResponse.Items["+ i +"].TypeName"));
			event.setTelephoneNum(context.stringValue("DescribeEventsResponse.Items["+ i +"].TelephoneNum"));
			event.setSubTypeCode(context.stringValue("DescribeEventsResponse.Items["+ i +"].SubTypeCode"));
			event.setSubTypeName(context.stringValue("DescribeEventsResponse.Items["+ i +"].SubTypeName"));
			event.setAlertTime(context.longValue("DescribeEventsResponse.Items["+ i +"].AlertTime"));
			event.setDataInstance(context.stringValue("DescribeEventsResponse.Items["+ i +"].DataInstance"));
			event.setEventTime(context.longValue("DescribeEventsResponse.Items["+ i +"].EventTime"));
			event.setStatus(context.integerValue("DescribeEventsResponse.Items["+ i +"].Status"));
			event.setStatusName(context.stringValue("DescribeEventsResponse.Items["+ i +"].StatusName"));
			event.setDealUserId(context.longValue("DescribeEventsResponse.Items["+ i +"].DealUserId"));
			event.setDealLoginName(context.stringValue("DescribeEventsResponse.Items["+ i +"].DealLoginName"));
			event.setDealDisplayName(context.stringValue("DescribeEventsResponse.Items["+ i +"].DealDisplayName"));
			event.setDealTime(context.longValue("DescribeEventsResponse.Items["+ i +"].DealTime"));
			event.setDepartName(context.stringValue("DescribeEventsResponse.Items["+ i +"].DepartName"));
			event.setBacked(context.booleanValue("DescribeEventsResponse.Items["+ i +"].Backed"));

			items.add(event);
		}
		describeEventsResponse.setItems(items);
	 
	 	return describeEventsResponse;
	}
}