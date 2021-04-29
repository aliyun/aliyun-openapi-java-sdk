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

import com.aliyuncs.smartag.model.v20180313.CreateHealthCheckResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateHealthCheckResponseUnmarshaller {

	public static CreateHealthCheckResponse unmarshall(CreateHealthCheckResponse createHealthCheckResponse, UnmarshallerContext _ctx) {
		
		createHealthCheckResponse.setRequestId(_ctx.stringValue("CreateHealthCheckResponse.RequestId"));
		createHealthCheckResponse.setDescription(_ctx.stringValue("CreateHealthCheckResponse.Description"));
		createHealthCheckResponse.setSrcPort(_ctx.integerValue("CreateHealthCheckResponse.SrcPort"));
		createHealthCheckResponse.setInstanceId(_ctx.stringValue("CreateHealthCheckResponse.InstanceId"));
		createHealthCheckResponse.setSrcIpAddr(_ctx.stringValue("CreateHealthCheckResponse.SrcIpAddr"));
		createHealthCheckResponse.setCreateTime(_ctx.longValue("CreateHealthCheckResponse.CreateTime"));
		createHealthCheckResponse.setFailCountThreshold(_ctx.integerValue("CreateHealthCheckResponse.FailCountThreshold"));
		createHealthCheckResponse.setDstPort(_ctx.integerValue("CreateHealthCheckResponse.DstPort"));
		createHealthCheckResponse.setName(_ctx.stringValue("CreateHealthCheckResponse.Name"));
		createHealthCheckResponse.setProbeCount(_ctx.integerValue("CreateHealthCheckResponse.ProbeCount"));
		createHealthCheckResponse.setType(_ctx.stringValue("CreateHealthCheckResponse.Type"));
		createHealthCheckResponse.setProbeTimeout(_ctx.integerValue("CreateHealthCheckResponse.ProbeTimeout"));
		createHealthCheckResponse.setRttThreshold(_ctx.integerValue("CreateHealthCheckResponse.RttThreshold"));
		createHealthCheckResponse.setProbeInterval(_ctx.integerValue("CreateHealthCheckResponse.ProbeInterval"));
		createHealthCheckResponse.setRegionId(_ctx.stringValue("CreateHealthCheckResponse.RegionId"));
		createHealthCheckResponse.setSmartAGId(_ctx.stringValue("CreateHealthCheckResponse.SmartAGId"));
		createHealthCheckResponse.setRttFailThreshold(_ctx.integerValue("CreateHealthCheckResponse.RttFailThreshold"));
		createHealthCheckResponse.setDstIpAddr(_ctx.stringValue("CreateHealthCheckResponse.DstIpAddr"));
	 
	 	return createHealthCheckResponse;
	}
}