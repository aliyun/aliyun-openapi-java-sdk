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

import com.aliyuncs.iot.model.v20180120.CreateDestinationResponse;
import com.aliyuncs.iot.model.v20180120.CreateDestinationResponse.Destination;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDestinationResponseUnmarshaller {

	public static CreateDestinationResponse unmarshall(CreateDestinationResponse createDestinationResponse, UnmarshallerContext _ctx) {
		
		createDestinationResponse.setRequestId(_ctx.stringValue("CreateDestinationResponse.RequestId"));
		createDestinationResponse.setSuccess(_ctx.booleanValue("CreateDestinationResponse.Success"));
		createDestinationResponse.setCode(_ctx.stringValue("CreateDestinationResponse.Code"));
		createDestinationResponse.setErrorMessage(_ctx.stringValue("CreateDestinationResponse.ErrorMessage"));

		Destination destination = new Destination();
		destination.setDestinationId(_ctx.longValue("CreateDestinationResponse.Destination.DestinationId"));
		destination.setName(_ctx.stringValue("CreateDestinationResponse.Destination.Name"));
		destination.setType(_ctx.stringValue("CreateDestinationResponse.Destination.Type"));
		destination.setConfiguration(_ctx.stringValue("CreateDestinationResponse.Destination.Configuration"));
		destination.setIsFailover(_ctx.booleanValue("CreateDestinationResponse.Destination.IsFailover"));
		destination.setUtcCreated(_ctx.stringValue("CreateDestinationResponse.Destination.UtcCreated"));
		createDestinationResponse.setDestination(destination);
	 
	 	return createDestinationResponse;
	}
}