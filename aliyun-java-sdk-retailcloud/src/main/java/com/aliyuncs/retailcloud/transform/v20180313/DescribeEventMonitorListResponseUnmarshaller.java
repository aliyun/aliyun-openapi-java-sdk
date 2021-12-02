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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.DescribeEventMonitorListResponse;
import com.aliyuncs.retailcloud.model.v20180313.DescribeEventMonitorListResponse.EventInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventMonitorListResponseUnmarshaller {

	public static DescribeEventMonitorListResponse unmarshall(DescribeEventMonitorListResponse describeEventMonitorListResponse, UnmarshallerContext _ctx) {
		
		describeEventMonitorListResponse.setRequestId(_ctx.stringValue("DescribeEventMonitorListResponse.RequestId"));
		describeEventMonitorListResponse.setCode(_ctx.integerValue("DescribeEventMonitorListResponse.Code"));
		describeEventMonitorListResponse.setErrorMsg(_ctx.stringValue("DescribeEventMonitorListResponse.ErrorMsg"));
		describeEventMonitorListResponse.setPageNumber(_ctx.integerValue("DescribeEventMonitorListResponse.PageNumber"));
		describeEventMonitorListResponse.setPageSize(_ctx.integerValue("DescribeEventMonitorListResponse.PageSize"));
		describeEventMonitorListResponse.setTotalCount(_ctx.longValue("DescribeEventMonitorListResponse.TotalCount"));

		List<EventInfo> data = new ArrayList<EventInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventMonitorListResponse.Data.Length"); i++) {
			EventInfo eventInfo = new EventInfo();
			eventInfo.setPodName(_ctx.stringValue("DescribeEventMonitorListResponse.Data["+ i +"].PodName"));
			eventInfo.setEventTime(_ctx.stringValue("DescribeEventMonitorListResponse.Data["+ i +"].EventTime"));
			eventInfo.setNameSpace(_ctx.stringValue("DescribeEventMonitorListResponse.Data["+ i +"].NameSpace"));
			eventInfo.setKind(_ctx.stringValue("DescribeEventMonitorListResponse.Data["+ i +"].Kind"));
			eventInfo.setMessage(_ctx.stringValue("DescribeEventMonitorListResponse.Data["+ i +"].Message"));
			eventInfo.setHostName(_ctx.stringValue("DescribeEventMonitorListResponse.Data["+ i +"].HostName"));
			eventInfo.setReason(_ctx.stringValue("DescribeEventMonitorListResponse.Data["+ i +"].Reason"));
			eventInfo.setLevel(_ctx.stringValue("DescribeEventMonitorListResponse.Data["+ i +"].Level"));
			eventInfo.setCount(_ctx.integerValue("DescribeEventMonitorListResponse.Data["+ i +"].Count"));

			data.add(eventInfo);
		}
		describeEventMonitorListResponse.setData(data);
	 
	 	return describeEventMonitorListResponse;
	}
}