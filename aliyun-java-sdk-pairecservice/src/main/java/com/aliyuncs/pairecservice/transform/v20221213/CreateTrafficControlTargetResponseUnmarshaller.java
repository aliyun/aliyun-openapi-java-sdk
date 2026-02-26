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

package com.aliyuncs.pairecservice.transform.v20221213;

import com.aliyuncs.pairecservice.model.v20221213.CreateTrafficControlTargetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTrafficControlTargetResponseUnmarshaller {

	public static CreateTrafficControlTargetResponse unmarshall(CreateTrafficControlTargetResponse createTrafficControlTargetResponse, UnmarshallerContext _ctx) {
		
		createTrafficControlTargetResponse.setRequestId(_ctx.stringValue("CreateTrafficControlTargetResponse.RequestId"));
		createTrafficControlTargetResponse.setTrafficControlTargetId(_ctx.stringValue("CreateTrafficControlTargetResponse.TrafficControlTargetId"));
	 
	 	return createTrafficControlTargetResponse;
	}
}