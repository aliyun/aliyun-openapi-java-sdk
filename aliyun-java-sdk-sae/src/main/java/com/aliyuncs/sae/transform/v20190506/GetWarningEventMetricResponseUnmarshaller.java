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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.GetWarningEventMetricResponse;
import com.aliyuncs.sae.model.v20190506.GetWarningEventMetricResponse.EventMetricDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWarningEventMetricResponseUnmarshaller {

	public static GetWarningEventMetricResponse unmarshall(GetWarningEventMetricResponse getWarningEventMetricResponse, UnmarshallerContext _ctx) {
		
		getWarningEventMetricResponse.setRequestId(_ctx.stringValue("GetWarningEventMetricResponse.RequestId"));
		getWarningEventMetricResponse.setMessage(_ctx.stringValue("GetWarningEventMetricResponse.Message"));
		getWarningEventMetricResponse.setCode(_ctx.stringValue("GetWarningEventMetricResponse.Code"));
		getWarningEventMetricResponse.setSuccess(_ctx.booleanValue("GetWarningEventMetricResponse.Success"));

		List<EventMetricDto> data = new ArrayList<EventMetricDto>();
		for (int i = 0; i < _ctx.lengthValue("GetWarningEventMetricResponse.Data.Length"); i++) {
			EventMetricDto eventMetricDto = new EventMetricDto();
			eventMetricDto.setAppId(_ctx.stringValue("GetWarningEventMetricResponse.Data["+ i +"].AppId"));
			eventMetricDto.setName(_ctx.stringValue("GetWarningEventMetricResponse.Data["+ i +"].Name"));
			eventMetricDto.setRegionId(_ctx.stringValue("GetWarningEventMetricResponse.Data["+ i +"].RegionId"));
			eventMetricDto.setWarningCount(_ctx.longValue("GetWarningEventMetricResponse.Data["+ i +"].WarningCount"));

			data.add(eventMetricDto);
		}
		getWarningEventMetricResponse.setData(data);
	 
	 	return getWarningEventMetricResponse;
	}
}