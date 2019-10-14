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

import com.aliyuncs.linkwan.model.v20190301.GetLabNodeResponse;
import com.aliyuncs.linkwan.model.v20190301.GetLabNodeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLabNodeResponseUnmarshaller {

	public static GetLabNodeResponse unmarshall(GetLabNodeResponse getLabNodeResponse, UnmarshallerContext _ctx) {
		
		getLabNodeResponse.setRequestId(_ctx.stringValue("GetLabNodeResponse.RequestId"));
		getLabNodeResponse.setSuccess(_ctx.booleanValue("GetLabNodeResponse.Success"));

		Data data = new Data();
		data.setDevEui(_ctx.stringValue("GetLabNodeResponse.Data.DevEui"));
		data.setJoinEui(_ctx.stringValue("GetLabNodeResponse.Data.JoinEui"));
		data.setName(_ctx.stringValue("GetLabNodeResponse.Data.Name"));
		data.setLoraVersion(_ctx.stringValue("GetLabNodeResponse.Data.LoraVersion"));
		data.setClassMode(_ctx.stringValue("GetLabNodeResponse.Data.ClassMode"));
		data.setAppKey(_ctx.stringValue("GetLabNodeResponse.Data.AppKey"));
		data.setFreqBandPlanGroupId(_ctx.longValue("GetLabNodeResponse.Data.FreqBandPlanGroupId"));
		data.setCreateMillis(_ctx.longValue("GetLabNodeResponse.Data.CreateMillis"));
		data.setActivationState(_ctx.stringValue("GetLabNodeResponse.Data.ActivationState"));
		data.setBoundGatewaysCount(_ctx.longValue("GetLabNodeResponse.Data.BoundGatewaysCount"));
		getLabNodeResponse.setData(data);
	 
	 	return getLabNodeResponse;
	}
}