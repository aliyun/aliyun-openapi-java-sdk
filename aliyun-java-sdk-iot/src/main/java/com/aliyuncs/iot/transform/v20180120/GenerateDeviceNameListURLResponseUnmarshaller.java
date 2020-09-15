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

import com.aliyuncs.iot.model.v20180120.GenerateDeviceNameListURLResponse;
import com.aliyuncs.iot.model.v20180120.GenerateDeviceNameListURLResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateDeviceNameListURLResponseUnmarshaller {

	public static GenerateDeviceNameListURLResponse unmarshall(GenerateDeviceNameListURLResponse generateDeviceNameListURLResponse, UnmarshallerContext _ctx) {
		
		generateDeviceNameListURLResponse.setRequestId(_ctx.stringValue("GenerateDeviceNameListURLResponse.RequestId"));
		generateDeviceNameListURLResponse.setSuccess(_ctx.booleanValue("GenerateDeviceNameListURLResponse.Success"));
		generateDeviceNameListURLResponse.setCode(_ctx.stringValue("GenerateDeviceNameListURLResponse.Code"));
		generateDeviceNameListURLResponse.setErrorMessage(_ctx.stringValue("GenerateDeviceNameListURLResponse.ErrorMessage"));

		Data data = new Data();
		data.setKey(_ctx.stringValue("GenerateDeviceNameListURLResponse.Data.Key"));
		data.setHost(_ctx.stringValue("GenerateDeviceNameListURLResponse.Data.Host"));
		data.setPolicy(_ctx.stringValue("GenerateDeviceNameListURLResponse.Data.Policy"));
		data.setAccessKeyId(_ctx.stringValue("GenerateDeviceNameListURLResponse.Data.AccessKeyId"));
		data.setSignature(_ctx.stringValue("GenerateDeviceNameListURLResponse.Data.Signature"));
		data.setFileUrl(_ctx.stringValue("GenerateDeviceNameListURLResponse.Data.FileUrl"));
		data.setUtcCreate(_ctx.stringValue("GenerateDeviceNameListURLResponse.Data.UtcCreate"));
		data.setObjectStorage(_ctx.stringValue("GenerateDeviceNameListURLResponse.Data.ObjectStorage"));
		generateDeviceNameListURLResponse.setData(data);
	 
	 	return generateDeviceNameListURLResponse;
	}
}