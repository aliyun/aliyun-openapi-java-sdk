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

package com.aliyuncs.ga.transform.v20191120;

import com.aliyuncs.ga.model.v20191120.GetBasicIpSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBasicIpSetResponseUnmarshaller {

	public static GetBasicIpSetResponse unmarshall(GetBasicIpSetResponse getBasicIpSetResponse, UnmarshallerContext _ctx) {
		
		getBasicIpSetResponse.setRequestId(_ctx.stringValue("GetBasicIpSetResponse.RequestId"));
		getBasicIpSetResponse.setAccelerateRegionId(_ctx.stringValue("GetBasicIpSetResponse.AccelerateRegionId"));
		getBasicIpSetResponse.setBandwidth(_ctx.longValue("GetBasicIpSetResponse.Bandwidth"));
		getBasicIpSetResponse.setIpSetId(_ctx.stringValue("GetBasicIpSetResponse.IpSetId"));
		getBasicIpSetResponse.setIpAddress(_ctx.stringValue("GetBasicIpSetResponse.IpAddress"));
		getBasicIpSetResponse.setAcceleratorId(_ctx.stringValue("GetBasicIpSetResponse.AcceleratorId"));
		getBasicIpSetResponse.setIpVersion(_ctx.stringValue("GetBasicIpSetResponse.IpVersion"));
		getBasicIpSetResponse.setState(_ctx.stringValue("GetBasicIpSetResponse.State"));
		getBasicIpSetResponse.setIspType(_ctx.stringValue("GetBasicIpSetResponse.IspType"));
	 
	 	return getBasicIpSetResponse;
	}
}