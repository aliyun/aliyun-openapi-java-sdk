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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeEventsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeEventsResponse.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventsResponseUnmarshaller {

	public static DescribeEventsResponse unmarshall(DescribeEventsResponse describeEventsResponse, UnmarshallerContext _ctx) {
		
		describeEventsResponse.setRequestId(_ctx.stringValue("DescribeEventsResponse.RequestId"));
		describeEventsResponse.setCurrentPage(_ctx.integerValue("DescribeEventsResponse.CurrentPage"));
		describeEventsResponse.setPageSize(_ctx.integerValue("DescribeEventsResponse.PageSize"));
		describeEventsResponse.setTotalCount(_ctx.integerValue("DescribeEventsResponse.TotalCount"));

		List<Event> items = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventsResponse.Items.Length"); i++) {
			Event event = new Event();
			event.setDisplayName(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].DisplayName"));
			event.setStatus(_ctx.integerValue("DescribeEventsResponse.Items["+ i +"].Status"));
			event.setWarnLevel(_ctx.integerValue("DescribeEventsResponse.Items["+ i +"].WarnLevel"));
			event.setUserId(_ctx.longValue("DescribeEventsResponse.Items["+ i +"].UserId"));
			event.setStatusName(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].StatusName"));
			event.setDepartName(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].DepartName"));
			event.setDealUserIdValue(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].DealUserIdValue"));
			event.setDealTime(_ctx.longValue("DescribeEventsResponse.Items["+ i +"].DealTime"));
			event.setDealLoginName(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].DealLoginName"));
			event.setSubTypeName(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].SubTypeName"));
			event.setBacked(_ctx.booleanValue("DescribeEventsResponse.Items["+ i +"].Backed"));
			event.setInstanceName(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].InstanceName"));
			event.setEventTime(_ctx.longValue("DescribeEventsResponse.Items["+ i +"].EventTime"));
			event.setLoginName(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].LoginName"));
			event.setUserIdValue(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].UserIdValue"));
			event.setSubTypeCode(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].SubTypeCode"));
			event.setTargetProductCode(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].TargetProductCode"));
			event.setTypeCode(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].TypeCode"));
			event.setAlertTime(_ctx.longValue("DescribeEventsResponse.Items["+ i +"].AlertTime"));
			event.setDealUserId(_ctx.longValue("DescribeEventsResponse.Items["+ i +"].DealUserId"));
			event.setTypeName(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].TypeName"));
			event.setDealDisplayName(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].DealDisplayName"));
			event.setId(_ctx.longValue("DescribeEventsResponse.Items["+ i +"].Id"));
			event.setProductCode(_ctx.stringValue("DescribeEventsResponse.Items["+ i +"].ProductCode"));

			items.add(event);
		}
		describeEventsResponse.setItems(items);
	 
	 	return describeEventsResponse;
	}
}