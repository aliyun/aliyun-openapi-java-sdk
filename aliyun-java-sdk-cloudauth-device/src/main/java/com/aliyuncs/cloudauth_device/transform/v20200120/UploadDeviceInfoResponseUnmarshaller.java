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

package com.aliyuncs.cloudauth_device.transform.v20200120;

import com.aliyuncs.cloudauth_device.model.v20200120.UploadDeviceInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadDeviceInfoResponseUnmarshaller {

	public static UploadDeviceInfoResponse unmarshall(UploadDeviceInfoResponse uploadDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		uploadDeviceInfoResponse.setRequestId(_ctx.stringValue("UploadDeviceInfoResponse.RequestId"));
		uploadDeviceInfoResponse.setCode(_ctx.stringValue("UploadDeviceInfoResponse.Code"));
		uploadDeviceInfoResponse.setMessage(_ctx.stringValue("UploadDeviceInfoResponse.Message"));
		uploadDeviceInfoResponse.setResultObject(_ctx.booleanValue("UploadDeviceInfoResponse.ResultObject"));
	 
	 	return uploadDeviceInfoResponse;
	}
}