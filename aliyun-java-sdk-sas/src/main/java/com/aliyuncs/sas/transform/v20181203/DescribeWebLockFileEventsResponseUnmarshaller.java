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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeWebLockFileEventsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeWebLockFileEventsResponse.Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebLockFileEventsResponseUnmarshaller {

	public static DescribeWebLockFileEventsResponse unmarshall(DescribeWebLockFileEventsResponse describeWebLockFileEventsResponse, UnmarshallerContext _ctx) {
		
		describeWebLockFileEventsResponse.setRequestId(_ctx.stringValue("DescribeWebLockFileEventsResponse.RequestId"));
		describeWebLockFileEventsResponse.setCurrentPage(_ctx.integerValue("DescribeWebLockFileEventsResponse.CurrentPage"));
		describeWebLockFileEventsResponse.setPageSize(_ctx.integerValue("DescribeWebLockFileEventsResponse.PageSize"));
		describeWebLockFileEventsResponse.setTotalCount(_ctx.integerValue("DescribeWebLockFileEventsResponse.TotalCount"));

		List<Info> list = new ArrayList<Info>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebLockFileEventsResponse.List.Length"); i++) {
			Info info = new Info();
			info.setStatus(_ctx.stringValue("DescribeWebLockFileEventsResponse.List["+ i +"].Status"));
			info.setEventName(_ctx.stringValue("DescribeWebLockFileEventsResponse.List["+ i +"].EventName"));
			info.setDs(_ctx.longValue("DescribeWebLockFileEventsResponse.List["+ i +"].Ds"));
			info.setInternetIp(_ctx.stringValue("DescribeWebLockFileEventsResponse.List["+ i +"].InternetIp"));
			info.setProcessPath(_ctx.stringValue("DescribeWebLockFileEventsResponse.List["+ i +"].ProcessPath"));
			info.setIp(_ctx.stringValue("DescribeWebLockFileEventsResponse.List["+ i +"].Ip"));
			info.setGmtEvent(_ctx.longValue("DescribeWebLockFileEventsResponse.List["+ i +"].GmtEvent"));
			info.setCount(_ctx.longValue("DescribeWebLockFileEventsResponse.List["+ i +"].Count"));
			info.setIntranetIp(_ctx.stringValue("DescribeWebLockFileEventsResponse.List["+ i +"].IntranetIp"));
			info.setProcessName(_ctx.stringValue("DescribeWebLockFileEventsResponse.List["+ i +"].ProcessName"));
			info.setUuid(_ctx.stringValue("DescribeWebLockFileEventsResponse.List["+ i +"].Uuid"));
			info.setEventType(_ctx.stringValue("DescribeWebLockFileEventsResponse.List["+ i +"].EventType"));
			info.setInstanceName(_ctx.stringValue("DescribeWebLockFileEventsResponse.List["+ i +"].InstanceName"));
			info.setEventStatus(_ctx.stringValue("DescribeWebLockFileEventsResponse.List["+ i +"].EventStatus"));
			info.setPath(_ctx.stringValue("DescribeWebLockFileEventsResponse.List["+ i +"].Path"));
			info.setSolution(_ctx.stringValue("DescribeWebLockFileEventsResponse.List["+ i +"].Solution"));
			info.setLevel(_ctx.stringValue("DescribeWebLockFileEventsResponse.List["+ i +"].Level"));
			info.setId(_ctx.longValue("DescribeWebLockFileEventsResponse.List["+ i +"].Id"));

			list.add(info);
		}
		describeWebLockFileEventsResponse.setList(list);
	 
	 	return describeWebLockFileEventsResponse;
	}
}