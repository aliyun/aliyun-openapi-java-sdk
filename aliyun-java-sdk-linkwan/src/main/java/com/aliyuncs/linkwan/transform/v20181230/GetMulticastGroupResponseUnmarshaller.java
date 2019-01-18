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

package com.aliyuncs.linkwan.transform.v20181230;

import com.aliyuncs.linkwan.model.v20181230.GetMulticastGroupResponse;
import com.aliyuncs.linkwan.model.v20181230.GetMulticastGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMulticastGroupResponseUnmarshaller {

	public static GetMulticastGroupResponse unmarshall(GetMulticastGroupResponse getMulticastGroupResponse, UnmarshallerContext context) {
		
		getMulticastGroupResponse.setRequestId(context.stringValue("GetMulticastGroupResponse.RequestId"));
		getMulticastGroupResponse.setSuccess(context.booleanValue("GetMulticastGroupResponse.Success"));

		Data data = new Data();
		data.setMcAddress(context.stringValue("GetMulticastGroupResponse.Data.McAddress"));
		data.setClassMode(context.stringValue("GetMulticastGroupResponse.Data.ClassMode"));
		data.setFrequency(context.floatValue("GetMulticastGroupResponse.Data.Frequency"));
		data.setDataRate(context.integerValue("GetMulticastGroupResponse.Data.DataRate"));
		data.setPeriodicity(context.integerValue("GetMulticastGroupResponse.Data.Periodicity"));
		data.setLoraVersion(context.stringValue("GetMulticastGroupResponse.Data.LoraVersion"));
		getMulticastGroupResponse.setData(data);
	 
	 	return getMulticastGroupResponse;
	}
}