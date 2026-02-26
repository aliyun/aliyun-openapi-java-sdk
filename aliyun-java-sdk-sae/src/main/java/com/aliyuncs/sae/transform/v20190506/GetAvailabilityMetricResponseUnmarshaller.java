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

import com.aliyuncs.sae.model.v20190506.GetAvailabilityMetricResponse;
import com.aliyuncs.sae.model.v20190506.GetAvailabilityMetricResponse.AvailabilityMetricDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAvailabilityMetricResponseUnmarshaller {

	public static GetAvailabilityMetricResponse unmarshall(GetAvailabilityMetricResponse getAvailabilityMetricResponse, UnmarshallerContext _ctx) {
		
		getAvailabilityMetricResponse.setRequestId(_ctx.stringValue("GetAvailabilityMetricResponse.RequestId"));
		getAvailabilityMetricResponse.setMessage(_ctx.stringValue("GetAvailabilityMetricResponse.Message"));
		getAvailabilityMetricResponse.setCode(_ctx.stringValue("GetAvailabilityMetricResponse.Code"));
		getAvailabilityMetricResponse.setSuccess(_ctx.booleanValue("GetAvailabilityMetricResponse.Success"));

		List<AvailabilityMetricDto> data = new ArrayList<AvailabilityMetricDto>();
		for (int i = 0; i < _ctx.lengthValue("GetAvailabilityMetricResponse.Data.Length"); i++) {
			AvailabilityMetricDto availabilityMetricDto = new AvailabilityMetricDto();
			availabilityMetricDto.setAppId(_ctx.stringValue("GetAvailabilityMetricResponse.Data["+ i +"].AppId"));
			availabilityMetricDto.setName(_ctx.stringValue("GetAvailabilityMetricResponse.Data["+ i +"].Name"));
			availabilityMetricDto.setRegionId(_ctx.stringValue("GetAvailabilityMetricResponse.Data["+ i +"].RegionId"));
			availabilityMetricDto.setRunnings(_ctx.longValue("GetAvailabilityMetricResponse.Data["+ i +"].Runnings"));
			availabilityMetricDto.setInstances(_ctx.longValue("GetAvailabilityMetricResponse.Data["+ i +"].Instances"));
			availabilityMetricDto.setErrorInstances(_ctx.longValue("GetAvailabilityMetricResponse.Data["+ i +"].ErrorInstances"));
			availabilityMetricDto.setEnableAutoscale(_ctx.longValue("GetAvailabilityMetricResponse.Data["+ i +"].EnableAutoscale"));

			data.add(availabilityMetricDto);
		}
		getAvailabilityMetricResponse.setData(data);
	 
	 	return getAvailabilityMetricResponse;
	}
}