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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.CreatePhoneMessageQrdlResponse;
import com.aliyuncs.cams.model.v20200606.CreatePhoneMessageQrdlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePhoneMessageQrdlResponseUnmarshaller {

	public static CreatePhoneMessageQrdlResponse unmarshall(CreatePhoneMessageQrdlResponse createPhoneMessageQrdlResponse, UnmarshallerContext _ctx) {
		
		createPhoneMessageQrdlResponse.setRequestId(_ctx.stringValue("CreatePhoneMessageQrdlResponse.RequestId"));
		createPhoneMessageQrdlResponse.setCode(_ctx.stringValue("CreatePhoneMessageQrdlResponse.Code"));
		createPhoneMessageQrdlResponse.setMessage(_ctx.stringValue("CreatePhoneMessageQrdlResponse.Message"));

		Data data = new Data();
		data.setPhoneNumber(_ctx.stringValue("CreatePhoneMessageQrdlResponse.Data.PhoneNumber"));
		data.setQrdlCode(_ctx.stringValue("CreatePhoneMessageQrdlResponse.Data.QrdlCode"));
		data.setGenerateQrImage(_ctx.stringValue("CreatePhoneMessageQrdlResponse.Data.GenerateQrImage"));
		data.setPrefilledMessage(_ctx.stringValue("CreatePhoneMessageQrdlResponse.Data.PrefilledMessage"));
		data.setDeepLinkUrl(_ctx.stringValue("CreatePhoneMessageQrdlResponse.Data.DeepLinkUrl"));
		data.setQrImageUrl(_ctx.stringValue("CreatePhoneMessageQrdlResponse.Data.QrImageUrl"));
		createPhoneMessageQrdlResponse.setData(data);
	 
	 	return createPhoneMessageQrdlResponse;
	}
}