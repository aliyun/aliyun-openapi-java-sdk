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

import com.aliyuncs.linkvisual.model.v20180120.CheckFaceUserDoExistOnDeviceResponse;
import com.aliyuncs.linkvisual.model.v20180120.CheckFaceUserDoExistOnDeviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckFaceUserDoExistOnDeviceResponseUnmarshaller {

	public static CheckFaceUserDoExistOnDeviceResponse unmarshall(CheckFaceUserDoExistOnDeviceResponse checkFaceUserDoExistOnDeviceResponse, UnmarshallerContext _ctx) {
		
		checkFaceUserDoExistOnDeviceResponse.setRequestId(_ctx.stringValue("CheckFaceUserDoExistOnDeviceResponse.RequestId"));
		checkFaceUserDoExistOnDeviceResponse.setSuccess(_ctx.booleanValue("CheckFaceUserDoExistOnDeviceResponse.Success"));
		checkFaceUserDoExistOnDeviceResponse.setCode(_ctx.stringValue("CheckFaceUserDoExistOnDeviceResponse.Code"));
		checkFaceUserDoExistOnDeviceResponse.setErrorMessage(_ctx.stringValue("CheckFaceUserDoExistOnDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setDoExist(_ctx.booleanValue("CheckFaceUserDoExistOnDeviceResponse.Data.DoExist"));
		checkFaceUserDoExistOnDeviceResponse.setData(data);
	 
	 	return checkFaceUserDoExistOnDeviceResponse;
	}
}