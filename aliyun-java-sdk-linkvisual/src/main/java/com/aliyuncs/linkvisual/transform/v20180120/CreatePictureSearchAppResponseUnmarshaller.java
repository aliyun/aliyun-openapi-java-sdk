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

import com.aliyuncs.linkvisual.model.v20180120.CreatePictureSearchAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePictureSearchAppResponseUnmarshaller {

	public static CreatePictureSearchAppResponse unmarshall(CreatePictureSearchAppResponse createPictureSearchAppResponse, UnmarshallerContext _ctx) {
		
		createPictureSearchAppResponse.setRequestId(_ctx.stringValue("CreatePictureSearchAppResponse.RequestId"));
		createPictureSearchAppResponse.setSuccess(_ctx.booleanValue("CreatePictureSearchAppResponse.Success"));
		createPictureSearchAppResponse.setCode(_ctx.stringValue("CreatePictureSearchAppResponse.Code"));
		createPictureSearchAppResponse.setErrorMessage(_ctx.stringValue("CreatePictureSearchAppResponse.ErrorMessage"));
		createPictureSearchAppResponse.setData(_ctx.stringValue("CreatePictureSearchAppResponse.Data"));
	 
	 	return createPictureSearchAppResponse;
	}
}