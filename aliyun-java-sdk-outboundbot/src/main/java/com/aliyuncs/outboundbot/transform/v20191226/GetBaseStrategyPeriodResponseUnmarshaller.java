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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.GetBaseStrategyPeriodResponse;
import com.aliyuncs.outboundbot.model.v20191226.GetBaseStrategyPeriodResponse.TimeFrame;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBaseStrategyPeriodResponseUnmarshaller {

	public static GetBaseStrategyPeriodResponse unmarshall(GetBaseStrategyPeriodResponse getBaseStrategyPeriodResponse, UnmarshallerContext _ctx) {
		
		getBaseStrategyPeriodResponse.setRequestId(_ctx.stringValue("GetBaseStrategyPeriodResponse.RequestId"));
		getBaseStrategyPeriodResponse.setSuccess(_ctx.booleanValue("GetBaseStrategyPeriodResponse.Success"));
		getBaseStrategyPeriodResponse.setCode(_ctx.stringValue("GetBaseStrategyPeriodResponse.Code"));
		getBaseStrategyPeriodResponse.setMessage(_ctx.stringValue("GetBaseStrategyPeriodResponse.Message"));
		getBaseStrategyPeriodResponse.setHttpStatusCode(_ctx.integerValue("GetBaseStrategyPeriodResponse.HttpStatusCode"));
		getBaseStrategyPeriodResponse.setOnlyWeekdays(_ctx.booleanValue("GetBaseStrategyPeriodResponse.OnlyWeekdays"));

		List<TimeFrame> workingTime = new ArrayList<TimeFrame>();
		for (int i = 0; i < _ctx.lengthValue("GetBaseStrategyPeriodResponse.WorkingTime.Length"); i++) {
			TimeFrame timeFrame = new TimeFrame();
			timeFrame.setBeginTimeMillis(_ctx.longValue("GetBaseStrategyPeriodResponse.WorkingTime["+ i +"].BeginTimeMillis"));
			timeFrame.setBeginTime(_ctx.stringValue("GetBaseStrategyPeriodResponse.WorkingTime["+ i +"].BeginTime"));
			timeFrame.setEndTimeMillis(_ctx.longValue("GetBaseStrategyPeriodResponse.WorkingTime["+ i +"].EndTimeMillis"));
			timeFrame.setEndTime(_ctx.stringValue("GetBaseStrategyPeriodResponse.WorkingTime["+ i +"].EndTime"));

			workingTime.add(timeFrame);
		}
		getBaseStrategyPeriodResponse.setWorkingTime(workingTime);
	 
	 	return getBaseStrategyPeriodResponse;
	}
}