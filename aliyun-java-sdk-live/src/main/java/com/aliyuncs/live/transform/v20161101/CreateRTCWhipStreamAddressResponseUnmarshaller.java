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

package com.aliyuncs.live.transform.v20161101;

import com.aliyuncs.live.model.v20161101.CreateRTCWhipStreamAddressResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRTCWhipStreamAddressResponseUnmarshaller {

	public static CreateRTCWhipStreamAddressResponse unmarshall(CreateRTCWhipStreamAddressResponse createRTCWhipStreamAddressResponse, UnmarshallerContext _ctx) {
		
		createRTCWhipStreamAddressResponse.setRequestId(_ctx.stringValue("CreateRTCWhipStreamAddressResponse.RequestId"));
		createRTCWhipStreamAddressResponse.setWhipAddress(_ctx.stringValue("CreateRTCWhipStreamAddressResponse.WhipAddress"));
	 
	 	return createRTCWhipStreamAddressResponse;
	}
}