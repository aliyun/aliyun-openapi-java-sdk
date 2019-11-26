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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.CheckDeviceResponse;
import com.aliyuncs.unimkt.model.v20181212.CheckDeviceResponse.PlanDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckDeviceResponseUnmarshaller {

	public static CheckDeviceResponse unmarshall(CheckDeviceResponse checkDeviceResponse, UnmarshallerContext _ctx) {
		
		checkDeviceResponse.setRequestId(_ctx.stringValue("CheckDeviceResponse.RequestId"));
		checkDeviceResponse.setStatus(_ctx.booleanValue("CheckDeviceResponse.Status"));
		checkDeviceResponse.setMsg(_ctx.stringValue("CheckDeviceResponse.Msg"));
		checkDeviceResponse.setErrorCode(_ctx.stringValue("CheckDeviceResponse.ErrorCode"));

		List<PlanDto> plans = new ArrayList<PlanDto>();
		for (int i = 0; i < _ctx.lengthValue("CheckDeviceResponse.Plans.Length"); i++) {
			PlanDto planDto = new PlanDto();
			planDto.setId(_ctx.longValue("CheckDeviceResponse.Plans["+ i +"].Id"));
			planDto.setName(_ctx.stringValue("CheckDeviceResponse.Plans["+ i +"].Name"));
			planDto.setStartTime(_ctx.stringValue("CheckDeviceResponse.Plans["+ i +"].StartTime"));
			planDto.setEndTime(_ctx.stringValue("CheckDeviceResponse.Plans["+ i +"].EndTime"));

			plans.add(planDto);
		}
		checkDeviceResponse.setPlans(plans);
	 
	 	return checkDeviceResponse;
	}
}