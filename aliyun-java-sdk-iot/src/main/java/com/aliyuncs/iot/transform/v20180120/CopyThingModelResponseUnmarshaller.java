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

import com.aliyuncs.iot.model.v20180120.CopyThingModelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CopyThingModelResponseUnmarshaller {

	public static CopyThingModelResponse unmarshall(CopyThingModelResponse copyThingModelResponse, UnmarshallerContext _ctx) {
		
		copyThingModelResponse.setRequestId(_ctx.stringValue("CopyThingModelResponse.RequestId"));
		copyThingModelResponse.setSuccess(_ctx.booleanValue("CopyThingModelResponse.Success"));
		copyThingModelResponse.setCode(_ctx.stringValue("CopyThingModelResponse.Code"));
		copyThingModelResponse.setErrorMessage(_ctx.stringValue("CopyThingModelResponse.ErrorMessage"));
	 
	 	return copyThingModelResponse;
	}
}