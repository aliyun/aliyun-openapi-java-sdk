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

package com.aliyuncs.visionai.transform.v20191024;

import com.aliyuncs.visionai.model.v20191024.RecognizeVehicleResponse;
import com.aliyuncs.visionai.model.v20191024.RecognizeVehicleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeVehicleResponseUnmarshaller {

	public static RecognizeVehicleResponse unmarshall(RecognizeVehicleResponse recognizeVehicleResponse, UnmarshallerContext _ctx) {
		
		recognizeVehicleResponse.setRequestId(_ctx.stringValue("RecognizeVehicleResponse.RequestId"));

		Data data = new Data();
		data.setScore(_ctx.floatValue("RecognizeVehicleResponse.Data.Score"));
		data.setName(_ctx.stringValue("RecognizeVehicleResponse.Data.Name"));
		data.setSpuId(_ctx.longValue("RecognizeVehicleResponse.Data.SpuId"));
		data.setDescription(_ctx.stringValue("RecognizeVehicleResponse.Data.Description"));
		recognizeVehicleResponse.setData(data);
	 
	 	return recognizeVehicleResponse;
	}
}