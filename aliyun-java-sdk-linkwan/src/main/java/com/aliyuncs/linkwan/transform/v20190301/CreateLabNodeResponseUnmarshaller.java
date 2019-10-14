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

import com.aliyuncs.linkwan.model.v20190301.CreateLabNodeResponse;
import com.aliyuncs.linkwan.model.v20190301.CreateLabNodeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLabNodeResponseUnmarshaller {

	public static CreateLabNodeResponse unmarshall(CreateLabNodeResponse createLabNodeResponse, UnmarshallerContext _ctx) {
		
		createLabNodeResponse.setRequestId(_ctx.stringValue("CreateLabNodeResponse.RequestId"));
		createLabNodeResponse.setSuccess(_ctx.booleanValue("CreateLabNodeResponse.Success"));

		Data data = new Data();
		data.setDevEui(_ctx.stringValue("CreateLabNodeResponse.Data.DevEui"));
		data.setJoinEui(_ctx.stringValue("CreateLabNodeResponse.Data.JoinEui"));
		data.setName(_ctx.stringValue("CreateLabNodeResponse.Data.Name"));
		data.setLoraVersion(_ctx.stringValue("CreateLabNodeResponse.Data.LoraVersion"));
		data.setClassMode(_ctx.stringValue("CreateLabNodeResponse.Data.ClassMode"));
		data.setAppKey(_ctx.stringValue("CreateLabNodeResponse.Data.AppKey"));
		data.setFreqBandPlanGroupId(_ctx.longValue("CreateLabNodeResponse.Data.FreqBandPlanGroupId"));
		data.setNodeActivationState(_ctx.stringValue("CreateLabNodeResponse.Data.NodeActivationState"));
		data.setCreateMillis(_ctx.longValue("CreateLabNodeResponse.Data.CreateMillis"));
		createLabNodeResponse.setData(data);
	 
	 	return createLabNodeResponse;
	}
}