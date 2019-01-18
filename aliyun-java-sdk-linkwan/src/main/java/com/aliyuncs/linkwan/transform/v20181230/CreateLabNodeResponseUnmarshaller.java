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

import com.aliyuncs.linkwan.model.v20181230.CreateLabNodeResponse;
import com.aliyuncs.linkwan.model.v20181230.CreateLabNodeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLabNodeResponseUnmarshaller {

	public static CreateLabNodeResponse unmarshall(CreateLabNodeResponse createLabNodeResponse, UnmarshallerContext context) {
		
		createLabNodeResponse.setRequestId(context.stringValue("CreateLabNodeResponse.RequestId"));
		createLabNodeResponse.setSuccess(context.booleanValue("CreateLabNodeResponse.Success"));

		Data data = new Data();
		data.setDevEui(context.stringValue("CreateLabNodeResponse.Data.DevEui"));
		data.setJoinEui(context.stringValue("CreateLabNodeResponse.Data.JoinEui"));
		data.setName(context.stringValue("CreateLabNodeResponse.Data.Name"));
		data.setLoraVersion(context.stringValue("CreateLabNodeResponse.Data.LoraVersion"));
		data.setClassMode(context.stringValue("CreateLabNodeResponse.Data.ClassMode"));
		data.setAppKey(context.stringValue("CreateLabNodeResponse.Data.AppKey"));
		data.setFreqBandPlanGroupId(context.longValue("CreateLabNodeResponse.Data.FreqBandPlanGroupId"));
		data.setNodeActivationState(context.stringValue("CreateLabNodeResponse.Data.NodeActivationState"));
		data.setCreateMillis(context.longValue("CreateLabNodeResponse.Data.CreateMillis"));
		createLabNodeResponse.setData(data);
	 
	 	return createLabNodeResponse;
	}
}