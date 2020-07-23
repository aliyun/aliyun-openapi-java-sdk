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

import com.aliyuncs.retailcloud.model.v20180313.DescribeJobLogResponse;
import com.aliyuncs.retailcloud.model.v20180313.DescribeJobLogResponse.Result;
import com.aliyuncs.retailcloud.model.v20180313.DescribeJobLogResponse.Result.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobLogResponseUnmarshaller {

	public static DescribeJobLogResponse unmarshall(DescribeJobLogResponse describeJobLogResponse, UnmarshallerContext _ctx) {
		
		describeJobLogResponse.setRequestId(_ctx.stringValue("DescribeJobLogResponse.RequestId"));
		describeJobLogResponse.setCode(_ctx.integerValue("DescribeJobLogResponse.Code"));
		describeJobLogResponse.setErrMsg(_ctx.stringValue("DescribeJobLogResponse.ErrMsg"));

		Result result = new Result();
		result.setAppId(_ctx.longValue("DescribeJobLogResponse.Result.AppId"));
		result.setEnvId(_ctx.longValue("DescribeJobLogResponse.Result.EnvId"));
		result.setPodName(_ctx.stringValue("DescribeJobLogResponse.Result.PodName"));
		result.setJobLog(_ctx.stringValue("DescribeJobLogResponse.Result.JobLog"));

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobLogResponse.Result.Events.Length"); i++) {
			Event event = new Event();
			event.setAction(_ctx.stringValue("DescribeJobLogResponse.Result.Events["+ i +"].Action"));
			event.setCount(_ctx.integerValue("DescribeJobLogResponse.Result.Events["+ i +"].Count"));
			event.setEventTime(_ctx.stringValue("DescribeJobLogResponse.Result.Events["+ i +"].EventTime"));
			event.setFirstTimestamp(_ctx.stringValue("DescribeJobLogResponse.Result.Events["+ i +"].FirstTimestamp"));
			event.setLastTimestamp(_ctx.stringValue("DescribeJobLogResponse.Result.Events["+ i +"].LastTimestamp"));
			event.setMesage(_ctx.stringValue("DescribeJobLogResponse.Result.Events["+ i +"].Mesage"));
			event.setReason(_ctx.stringValue("DescribeJobLogResponse.Result.Events["+ i +"].Reason"));
			event.setType(_ctx.stringValue("DescribeJobLogResponse.Result.Events["+ i +"].Type"));

			events.add(event);
		}
		result.setEvents(events);
		describeJobLogResponse.setResult(result);
	 
	 	return describeJobLogResponse;
	}
}