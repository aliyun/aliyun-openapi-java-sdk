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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.BindPictureSearchAppWithDevicesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindPictureSearchAppWithDevicesResponseUnmarshaller {

	public static BindPictureSearchAppWithDevicesResponse unmarshall(BindPictureSearchAppWithDevicesResponse bindPictureSearchAppWithDevicesResponse, UnmarshallerContext _ctx) {
		
		bindPictureSearchAppWithDevicesResponse.setRequestId(_ctx.stringValue("BindPictureSearchAppWithDevicesResponse.RequestId"));
		bindPictureSearchAppWithDevicesResponse.setSuccess(_ctx.booleanValue("BindPictureSearchAppWithDevicesResponse.Success"));
		bindPictureSearchAppWithDevicesResponse.setCode(_ctx.stringValue("BindPictureSearchAppWithDevicesResponse.Code"));
		bindPictureSearchAppWithDevicesResponse.setErrorMessage(_ctx.stringValue("BindPictureSearchAppWithDevicesResponse.ErrorMessage"));
	 
	 	return bindPictureSearchAppWithDevicesResponse;
	}
}