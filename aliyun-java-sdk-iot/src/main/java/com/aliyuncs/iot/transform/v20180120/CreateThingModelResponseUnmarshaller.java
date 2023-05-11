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

import com.aliyuncs.iot.model.v20180120.CreateThingModelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateThingModelResponseUnmarshaller {

	public static CreateThingModelResponse unmarshall(CreateThingModelResponse createThingModelResponse, UnmarshallerContext _ctx) {
		
		createThingModelResponse.setRequestId(_ctx.stringValue("CreateThingModelResponse.RequestId"));
		createThingModelResponse.setSuccess(_ctx.booleanValue("CreateThingModelResponse.Success"));
		createThingModelResponse.setCode(_ctx.stringValue("CreateThingModelResponse.Code"));
		createThingModelResponse.setErrorMessage(_ctx.stringValue("CreateThingModelResponse.ErrorMessage"));
	 
	 	return createThingModelResponse;
	}
}