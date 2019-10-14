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

package com.aliyuncs.linkwan.transform.v20190301;

import com.aliyuncs.linkwan.model.v20190301.GetMulticastGroupResponse;
import com.aliyuncs.linkwan.model.v20190301.GetMulticastGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMulticastGroupResponseUnmarshaller {

	public static GetMulticastGroupResponse unmarshall(GetMulticastGroupResponse getMulticastGroupResponse, UnmarshallerContext _ctx) {
		
		getMulticastGroupResponse.setRequestId(_ctx.stringValue("GetMulticastGroupResponse.RequestId"));
		getMulticastGroupResponse.setSuccess(_ctx.booleanValue("GetMulticastGroupResponse.Success"));

		Data data = new Data();
		data.setMcAddress(_ctx.stringValue("GetMulticastGroupResponse.Data.McAddress"));
		data.setClassMode(_ctx.stringValue("GetMulticastGroupResponse.Data.ClassMode"));
		data.setFrequency(_ctx.floatValue("GetMulticastGroupResponse.Data.Frequency"));
		data.setDataRate(_ctx.integerValue("GetMulticastGroupResponse.Data.DataRate"));
		data.setPeriodicity(_ctx.integerValue("GetMulticastGroupResponse.Data.Periodicity"));
		data.setLoraVersion(_ctx.stringValue("GetMulticastGroupResponse.Data.LoraVersion"));
		getMulticastGroupResponse.setData(data);
	 
	 	return getMulticastGroupResponse;
	}
}