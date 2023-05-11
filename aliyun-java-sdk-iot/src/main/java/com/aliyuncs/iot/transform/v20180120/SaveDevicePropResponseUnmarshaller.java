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

import com.aliyuncs.iot.model.v20180120.SaveDevicePropResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveDevicePropResponseUnmarshaller {

	public static SaveDevicePropResponse unmarshall(SaveDevicePropResponse saveDevicePropResponse, UnmarshallerContext _ctx) {
		
		saveDevicePropResponse.setRequestId(_ctx.stringValue("SaveDevicePropResponse.RequestId"));
		saveDevicePropResponse.setSuccess(_ctx.booleanValue("SaveDevicePropResponse.Success"));
		saveDevicePropResponse.setCode(_ctx.stringValue("SaveDevicePropResponse.Code"));
		saveDevicePropResponse.setErrorMessage(_ctx.stringValue("SaveDevicePropResponse.ErrorMessage"));
	 
	 	return saveDevicePropResponse;
	}
}