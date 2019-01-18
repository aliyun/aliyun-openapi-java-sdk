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

import com.aliyuncs.linkwan.model.v20181230.GetLabNodeResponse;
import com.aliyuncs.linkwan.model.v20181230.GetLabNodeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLabNodeResponseUnmarshaller {

	public static GetLabNodeResponse unmarshall(GetLabNodeResponse getLabNodeResponse, UnmarshallerContext context) {
		
		getLabNodeResponse.setRequestId(context.stringValue("GetLabNodeResponse.RequestId"));
		getLabNodeResponse.setSuccess(context.booleanValue("GetLabNodeResponse.Success"));

		Data data = new Data();
		data.setDevEui(context.stringValue("GetLabNodeResponse.Data.DevEui"));
		data.setJoinEui(context.stringValue("GetLabNodeResponse.Data.JoinEui"));
		data.setName(context.stringValue("GetLabNodeResponse.Data.Name"));
		data.setLoraVersion(context.stringValue("GetLabNodeResponse.Data.LoraVersion"));
		data.setClassMode(context.stringValue("GetLabNodeResponse.Data.ClassMode"));
		data.setAppKey(context.stringValue("GetLabNodeResponse.Data.AppKey"));
		data.setFreqBandPlanGroupId(context.longValue("GetLabNodeResponse.Data.FreqBandPlanGroupId"));
		data.setCreateMillis(context.longValue("GetLabNodeResponse.Data.CreateMillis"));
		data.setActivationState(context.stringValue("GetLabNodeResponse.Data.ActivationState"));
		data.setBoundGatewaysCount(context.longValue("GetLabNodeResponse.Data.BoundGatewaysCount"));
		getLabNodeResponse.setData(data);
	 
	 	return getLabNodeResponse;
	}
}