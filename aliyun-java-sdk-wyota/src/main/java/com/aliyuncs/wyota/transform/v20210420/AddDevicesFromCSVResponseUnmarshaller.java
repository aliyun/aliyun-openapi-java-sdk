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

package com.aliyuncs.wyota.transform.v20210420;

import com.aliyuncs.wyota.model.v20210420.AddDevicesFromCSVResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddDevicesFromCSVResponseUnmarshaller {

	public static AddDevicesFromCSVResponse unmarshall(AddDevicesFromCSVResponse addDevicesFromCSVResponse, UnmarshallerContext _ctx) {
		
		addDevicesFromCSVResponse.setRequestId(_ctx.stringValue("AddDevicesFromCSVResponse.RequestId"));
		addDevicesFromCSVResponse.setMessage(_ctx.stringValue("AddDevicesFromCSVResponse.Message"));
		addDevicesFromCSVResponse.setCode(_ctx.stringValue("AddDevicesFromCSVResponse.Code"));
	 
	 	return addDevicesFromCSVResponse;
	}
}