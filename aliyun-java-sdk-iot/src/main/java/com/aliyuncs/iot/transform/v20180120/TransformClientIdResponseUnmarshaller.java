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

import com.aliyuncs.iot.model.v20180120.TransformClientIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TransformClientIdResponseUnmarshaller {

	public static TransformClientIdResponse unmarshall(TransformClientIdResponse transformClientIdResponse, UnmarshallerContext _ctx) {
		
		transformClientIdResponse.setRequestId(_ctx.stringValue("TransformClientIdResponse.RequestId"));
		transformClientIdResponse.setSuccess(_ctx.booleanValue("TransformClientIdResponse.Success"));
		transformClientIdResponse.setCode(_ctx.stringValue("TransformClientIdResponse.Code"));
		transformClientIdResponse.setErrorMessage(_ctx.stringValue("TransformClientIdResponse.ErrorMessage"));
	 
	 	return transformClientIdResponse;
	}
}