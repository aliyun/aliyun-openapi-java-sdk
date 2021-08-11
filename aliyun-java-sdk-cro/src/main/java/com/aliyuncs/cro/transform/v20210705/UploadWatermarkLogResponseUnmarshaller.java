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

package com.aliyuncs.cro.transform.v20210705;

import com.aliyuncs.cro.model.v20210705.UploadWatermarkLogResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadWatermarkLogResponseUnmarshaller {

	public static UploadWatermarkLogResponse unmarshall(UploadWatermarkLogResponse uploadWatermarkLogResponse, UnmarshallerContext _ctx) {
		
		uploadWatermarkLogResponse.setRequestId(_ctx.stringValue("UploadWatermarkLogResponse.RequestId"));
		uploadWatermarkLogResponse.setSuccess(_ctx.booleanValue("UploadWatermarkLogResponse.Success"));
		uploadWatermarkLogResponse.setErrorCode(_ctx.stringValue("UploadWatermarkLogResponse.ErrorCode"));
		uploadWatermarkLogResponse.setErrorMsg(_ctx.stringValue("UploadWatermarkLogResponse.ErrorMsg"));
		uploadWatermarkLogResponse.setDomain(_ctx.stringValue("UploadWatermarkLogResponse.Domain"));
	 
	 	return uploadWatermarkLogResponse;
	}
}