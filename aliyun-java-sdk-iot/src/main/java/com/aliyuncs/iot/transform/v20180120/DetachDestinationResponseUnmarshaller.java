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

import com.aliyuncs.iot.model.v20180120.DetachDestinationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetachDestinationResponseUnmarshaller {

	public static DetachDestinationResponse unmarshall(DetachDestinationResponse detachDestinationResponse, UnmarshallerContext _ctx) {
		
		detachDestinationResponse.setRequestId(_ctx.stringValue("DetachDestinationResponse.RequestId"));
		detachDestinationResponse.setSuccess(_ctx.booleanValue("DetachDestinationResponse.Success"));
		detachDestinationResponse.setCode(_ctx.stringValue("DetachDestinationResponse.Code"));
		detachDestinationResponse.setErrorMessage(_ctx.stringValue("DetachDestinationResponse.ErrorMessage"));
	 
	 	return detachDestinationResponse;
	}
}