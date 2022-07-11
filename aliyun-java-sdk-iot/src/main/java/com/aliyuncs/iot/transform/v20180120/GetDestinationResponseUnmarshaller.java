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

import com.aliyuncs.iot.model.v20180120.GetDestinationResponse;
import com.aliyuncs.iot.model.v20180120.GetDestinationResponse.Destination;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDestinationResponseUnmarshaller {

	public static GetDestinationResponse unmarshall(GetDestinationResponse getDestinationResponse, UnmarshallerContext _ctx) {
		
		getDestinationResponse.setRequestId(_ctx.stringValue("GetDestinationResponse.RequestId"));
		getDestinationResponse.setSuccess(_ctx.booleanValue("GetDestinationResponse.Success"));
		getDestinationResponse.setCode(_ctx.stringValue("GetDestinationResponse.Code"));
		getDestinationResponse.setErrorMessage(_ctx.stringValue("GetDestinationResponse.ErrorMessage"));

		Destination destination = new Destination();
		destination.setDestinationId(_ctx.stringValue("GetDestinationResponse.Destination.DestinationId"));
		destination.setName(_ctx.stringValue("GetDestinationResponse.Destination.Name"));
		destination.setType(_ctx.stringValue("GetDestinationResponse.Destination.Type"));
		destination.setConfiguration(_ctx.stringValue("GetDestinationResponse.Destination.Configuration"));
		destination.setIsFailover(_ctx.booleanValue("GetDestinationResponse.Destination.IsFailover"));
		destination.setUtcCreated(_ctx.stringValue("GetDestinationResponse.Destination.UtcCreated"));
		getDestinationResponse.setDestination(destination);
	 
	 	return getDestinationResponse;
	}
}