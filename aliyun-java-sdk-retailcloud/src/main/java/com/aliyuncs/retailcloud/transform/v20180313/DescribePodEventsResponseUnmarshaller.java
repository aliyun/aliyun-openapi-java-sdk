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

import com.aliyuncs.retailcloud.model.v20180313.DescribePodEventsResponse;
import com.aliyuncs.retailcloud.model.v20180313.DescribePodEventsResponse.Result;
import com.aliyuncs.retailcloud.model.v20180313.DescribePodEventsResponse.Result.PodEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePodEventsResponseUnmarshaller {

	public static DescribePodEventsResponse unmarshall(DescribePodEventsResponse describePodEventsResponse, UnmarshallerContext _ctx) {
		
		describePodEventsResponse.setRequestId(_ctx.stringValue("DescribePodEventsResponse.RequestId"));
		describePodEventsResponse.setCode(_ctx.integerValue("DescribePodEventsResponse.Code"));
		describePodEventsResponse.setErrMsg(_ctx.stringValue("DescribePodEventsResponse.ErrMsg"));
		describePodEventsResponse.setSuccess(_ctx.booleanValue("DescribePodEventsResponse.Success"));

		Result result = new Result();
		result.setDeployOrderName(_ctx.stringValue("DescribePodEventsResponse.Result.DeployOrderName"));

		List<PodEvent> podEvents = new ArrayList<PodEvent>();
		for (int i = 0; i < _ctx.lengthValue("DescribePodEventsResponse.Result.PodEvents.Length"); i++) {
			PodEvent podEvent = new PodEvent();
			podEvent.setAction(_ctx.stringValue("DescribePodEventsResponse.Result.PodEvents["+ i +"].Action"));
			podEvent.setCount(_ctx.integerValue("DescribePodEventsResponse.Result.PodEvents["+ i +"].Count"));
			podEvent.setEventTime(_ctx.stringValue("DescribePodEventsResponse.Result.PodEvents["+ i +"].EventTime"));
			podEvent.setFirstTimestamp(_ctx.stringValue("DescribePodEventsResponse.Result.PodEvents["+ i +"].FirstTimestamp"));
			podEvent.setLastTimestamp(_ctx.stringValue("DescribePodEventsResponse.Result.PodEvents["+ i +"].LastTimestamp"));
			podEvent.setMessage(_ctx.stringValue("DescribePodEventsResponse.Result.PodEvents["+ i +"].Message"));
			podEvent.setReason(_ctx.stringValue("DescribePodEventsResponse.Result.PodEvents["+ i +"].Reason"));
			podEvent.setType(_ctx.stringValue("DescribePodEventsResponse.Result.PodEvents["+ i +"].Type"));

			podEvents.add(podEvent);
		}
		result.setPodEvents(podEvents);
		describePodEventsResponse.setResult(result);
	 
	 	return describePodEventsResponse;
	}
}