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

import com.aliyuncs.linkvisual.model.v20180120.UnbindPictureSearchAppWithDevicesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnbindPictureSearchAppWithDevicesResponseUnmarshaller {

	public static UnbindPictureSearchAppWithDevicesResponse unmarshall(UnbindPictureSearchAppWithDevicesResponse unbindPictureSearchAppWithDevicesResponse, UnmarshallerContext _ctx) {
		
		unbindPictureSearchAppWithDevicesResponse.setRequestId(_ctx.stringValue("UnbindPictureSearchAppWithDevicesResponse.RequestId"));
		unbindPictureSearchAppWithDevicesResponse.setCode(_ctx.stringValue("UnbindPictureSearchAppWithDevicesResponse.Code"));
		unbindPictureSearchAppWithDevicesResponse.setErrorMessage(_ctx.stringValue("UnbindPictureSearchAppWithDevicesResponse.ErrorMessage"));
		unbindPictureSearchAppWithDevicesResponse.setSuccess(_ctx.booleanValue("UnbindPictureSearchAppWithDevicesResponse.Success"));
	 
	 	return unbindPictureSearchAppWithDevicesResponse;
	}
}