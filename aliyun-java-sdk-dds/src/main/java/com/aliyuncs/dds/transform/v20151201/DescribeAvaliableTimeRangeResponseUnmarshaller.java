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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeAvaliableTimeRangeResponse;
import com.aliyuncs.dds.model.v20151201.DescribeAvaliableTimeRangeResponse.TimeRangeItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvaliableTimeRangeResponseUnmarshaller {

	public static DescribeAvaliableTimeRangeResponse unmarshall(DescribeAvaliableTimeRangeResponse describeAvaliableTimeRangeResponse, UnmarshallerContext context) {
		
		describeAvaliableTimeRangeResponse.setRequestId(context.stringValue("DescribeAvaliableTimeRangeResponse.RequestId"));

		List<TimeRangeItem> timeRange = new ArrayList<TimeRangeItem>();
		for (int i = 0; i < context.lengthValue("DescribeAvaliableTimeRangeResponse.TimeRange.Length"); i++) {
			TimeRangeItem timeRangeItem = new TimeRangeItem();
			timeRangeItem.setStartTime(context.stringValue("DescribeAvaliableTimeRangeResponse.TimeRange["+ i +"].StartTime"));
			timeRangeItem.setEndTime(context.stringValue("DescribeAvaliableTimeRangeResponse.TimeRange["+ i +"].EndTime"));
			timeRangeItem.setStatus(context.stringValue("DescribeAvaliableTimeRangeResponse.TimeRange["+ i +"].Status"));

			timeRange.add(timeRangeItem);
		}
		describeAvaliableTimeRangeResponse.setTimeRange(timeRange);
	 
	 	return describeAvaliableTimeRangeResponse;
	}
}