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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.UpdateThingModelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateThingModelResponseUnmarshaller {

	public static UpdateThingModelResponse unmarshall(UpdateThingModelResponse updateThingModelResponse, UnmarshallerContext _ctx) {
		
		updateThingModelResponse.setRequestId(_ctx.stringValue("UpdateThingModelResponse.RequestId"));
		updateThingModelResponse.setSuccess(_ctx.booleanValue("UpdateThingModelResponse.Success"));
		updateThingModelResponse.setCode(_ctx.stringValue("UpdateThingModelResponse.Code"));
		updateThingModelResponse.setErrorMessage(_ctx.stringValue("UpdateThingModelResponse.ErrorMessage"));
	 
	 	return updateThingModelResponse;
	}
}