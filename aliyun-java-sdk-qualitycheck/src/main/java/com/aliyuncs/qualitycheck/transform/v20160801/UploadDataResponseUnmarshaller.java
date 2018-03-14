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

package com.aliyuncs.qualitycheck.transform.v20160801;

import com.aliyuncs.qualitycheck.model.v20160801.UploadDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadDataResponseUnmarshaller {

	public static UploadDataResponse unmarshall(UploadDataResponse uploadDataResponse, UnmarshallerContext context) {
		
		uploadDataResponse.setRequestId(context.stringValue("UploadDataResponse.requestId"));
		uploadDataResponse.setSuccess(context.booleanValue("UploadDataResponse.success"));
		uploadDataResponse.setCode(context.stringValue("UploadDataResponse.code"));
		uploadDataResponse.setMessage(context.stringValue("UploadDataResponse.message"));
		uploadDataResponse.setData(context.stringValue("UploadDataResponse.data"));
	 
	 	return uploadDataResponse;
	}
}