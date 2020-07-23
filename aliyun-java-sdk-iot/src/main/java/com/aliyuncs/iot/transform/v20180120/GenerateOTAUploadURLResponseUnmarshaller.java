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

import com.aliyuncs.iot.model.v20180120.GenerateOTAUploadURLResponse;
import com.aliyuncs.iot.model.v20180120.GenerateOTAUploadURLResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateOTAUploadURLResponseUnmarshaller {

	public static GenerateOTAUploadURLResponse unmarshall(GenerateOTAUploadURLResponse generateOTAUploadURLResponse, UnmarshallerContext _ctx) {
		
		generateOTAUploadURLResponse.setRequestId(_ctx.stringValue("GenerateOTAUploadURLResponse.RequestId"));
		generateOTAUploadURLResponse.setSuccess(_ctx.booleanValue("GenerateOTAUploadURLResponse.Success"));
		generateOTAUploadURLResponse.setCode(_ctx.stringValue("GenerateOTAUploadURLResponse.Code"));
		generateOTAUploadURLResponse.setErrorMessage(_ctx.stringValue("GenerateOTAUploadURLResponse.ErrorMessage"));

		Data data = new Data();
		data.setKey(_ctx.stringValue("GenerateOTAUploadURLResponse.Data.Key"));
		data.setHost(_ctx.stringValue("GenerateOTAUploadURLResponse.Data.Host"));
		data.setPolicy(_ctx.stringValue("GenerateOTAUploadURLResponse.Data.Policy"));
		data.setOSSAccessKeyId(_ctx.stringValue("GenerateOTAUploadURLResponse.Data.OSSAccessKeyId"));
		data.setSignature(_ctx.stringValue("GenerateOTAUploadURLResponse.Data.Signature"));
		data.setFirmwareUrl(_ctx.stringValue("GenerateOTAUploadURLResponse.Data.FirmwareUrl"));
		data.setUtcCreate(_ctx.stringValue("GenerateOTAUploadURLResponse.Data.UtcCreate"));
		data.setObjectStorage(_ctx.stringValue("GenerateOTAUploadURLResponse.Data.ObjectStorage"));
		generateOTAUploadURLResponse.setData(data);
	 
	 	return generateOTAUploadURLResponse;
	}
}