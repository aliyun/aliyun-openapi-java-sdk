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

import com.aliyuncs.linkwan.model.v20181230.GetFreqBandPlanGroupResponse;
import com.aliyuncs.linkwan.model.v20181230.GetFreqBandPlanGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFreqBandPlanGroupResponseUnmarshaller {

	public static GetFreqBandPlanGroupResponse unmarshall(GetFreqBandPlanGroupResponse getFreqBandPlanGroupResponse, UnmarshallerContext context) {
		
		getFreqBandPlanGroupResponse.setRequestId(context.stringValue("GetFreqBandPlanGroupResponse.RequestId"));
		getFreqBandPlanGroupResponse.setSuccess(context.booleanValue("GetFreqBandPlanGroupResponse.Success"));

		Data data = new Data();
		data.setGroupId(context.longValue("GetFreqBandPlanGroupResponse.Data.GroupId"));
		data.setFrequencyRegionId(context.stringValue("GetFreqBandPlanGroupResponse.Data.FrequencyRegionId"));
		data.setFrequencyType(context.stringValue("GetFreqBandPlanGroupResponse.Data.FrequencyType"));
		data.setBeginFrequency(context.longValue("GetFreqBandPlanGroupResponse.Data.BeginFrequency"));
		data.setEndFrequency(context.longValue("GetFreqBandPlanGroupResponse.Data.EndFrequency"));
		getFreqBandPlanGroupResponse.setData(data);
	 
	 	return getFreqBandPlanGroupResponse;
	}
}