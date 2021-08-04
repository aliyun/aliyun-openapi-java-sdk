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

package com.aliyuncs.vs.transform.v20181212;

import com.aliyuncs.vs.model.v20181212.PrepareUploadResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PrepareUploadResponseUnmarshaller {

	public static PrepareUploadResponse unmarshall(PrepareUploadResponse prepareUploadResponse, UnmarshallerContext _ctx) {
		
		prepareUploadResponse.setRequestId(_ctx.stringValue("PrepareUploadResponse.RequestId"));
		prepareUploadResponse.setBucketName(_ctx.stringValue("PrepareUploadResponse.BucketName"));
		prepareUploadResponse.setEndpoint(_ctx.stringValue("PrepareUploadResponse.Endpoint"));
		prepareUploadResponse.setAdditionInfo(_ctx.stringValue("PrepareUploadResponse.AdditionInfo"));
	 
	 	return prepareUploadResponse;
	}
}