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

package com.aliyuncs.smartag.transform.v20180313;

import com.aliyuncs.smartag.model.v20180313.CreateQosCarResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateQosCarResponseUnmarshaller {

	public static CreateQosCarResponse unmarshall(CreateQosCarResponse createQosCarResponse, UnmarshallerContext _ctx) {
		
		createQosCarResponse.setRequestId(_ctx.stringValue("CreateQosCarResponse.RequestId"));
		createQosCarResponse.setMinBandwidthAbs(_ctx.integerValue("CreateQosCarResponse.MinBandwidthAbs"));
		createQosCarResponse.setDescription(_ctx.stringValue("CreateQosCarResponse.Description"));
		createQosCarResponse.setQosCarId(_ctx.stringValue("CreateQosCarResponse.QosCarId"));
		createQosCarResponse.setPriority(_ctx.integerValue("CreateQosCarResponse.Priority"));
		createQosCarResponse.setMaxBandwidthPercent(_ctx.integerValue("CreateQosCarResponse.MaxBandwidthPercent"));
		createQosCarResponse.setMaxBandwidthAbs(_ctx.integerValue("CreateQosCarResponse.MaxBandwidthAbs"));
		createQosCarResponse.setQosId(_ctx.stringValue("CreateQosCarResponse.QosId"));
		createQosCarResponse.setPercentSourceType(_ctx.stringValue("CreateQosCarResponse.PercentSourceType"));
		createQosCarResponse.setMinBandwidthPercent(_ctx.integerValue("CreateQosCarResponse.MinBandwidthPercent"));
		createQosCarResponse.setLimitType(_ctx.stringValue("CreateQosCarResponse.LimitType"));
	 
	 	return createQosCarResponse;
	}
}