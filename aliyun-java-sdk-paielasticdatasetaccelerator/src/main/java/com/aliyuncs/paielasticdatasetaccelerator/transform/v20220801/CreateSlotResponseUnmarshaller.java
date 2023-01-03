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

package com.aliyuncs.paielasticdatasetaccelerator.transform.v20220801;

import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.CreateSlotResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSlotResponseUnmarshaller {

	public static CreateSlotResponse unmarshall(CreateSlotResponse createSlotResponse, UnmarshallerContext _ctx) {
		
		createSlotResponse.setRequestId(_ctx.stringValue("CreateSlotResponse.RequestId"));
		createSlotResponse.setSlotId(_ctx.stringValue("CreateSlotResponse.SlotId"));
		createSlotResponse.setEndpointIds(_ctx.stringValue("CreateSlotResponse.EndpointIds"));
	 
	 	return createSlotResponse;
	}
}