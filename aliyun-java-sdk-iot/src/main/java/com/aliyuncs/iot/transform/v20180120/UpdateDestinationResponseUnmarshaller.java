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

import com.aliyuncs.iot.model.v20180120.UpdateDestinationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDestinationResponseUnmarshaller {

	public static UpdateDestinationResponse unmarshall(UpdateDestinationResponse updateDestinationResponse, UnmarshallerContext _ctx) {
		
		updateDestinationResponse.setRequestId(_ctx.stringValue("UpdateDestinationResponse.RequestId"));
		updateDestinationResponse.setSuccess(_ctx.booleanValue("UpdateDestinationResponse.Success"));
		updateDestinationResponse.setCode(_ctx.stringValue("UpdateDestinationResponse.Code"));
		updateDestinationResponse.setErrorMessage(_ctx.stringValue("UpdateDestinationResponse.ErrorMessage"));
	 
	 	return updateDestinationResponse;
	}
}