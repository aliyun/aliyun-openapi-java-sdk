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

import com.aliyuncs.linkvisual.model.v20180120.UpdatePictureSearchAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePictureSearchAppResponseUnmarshaller {

	public static UpdatePictureSearchAppResponse unmarshall(UpdatePictureSearchAppResponse updatePictureSearchAppResponse, UnmarshallerContext _ctx) {
		
		updatePictureSearchAppResponse.setRequestId(_ctx.stringValue("UpdatePictureSearchAppResponse.RequestId"));
		updatePictureSearchAppResponse.setSuccess(_ctx.booleanValue("UpdatePictureSearchAppResponse.Success"));
		updatePictureSearchAppResponse.setCode(_ctx.stringValue("UpdatePictureSearchAppResponse.Code"));
		updatePictureSearchAppResponse.setErrorMessage(_ctx.stringValue("UpdatePictureSearchAppResponse.ErrorMessage"));
	 
	 	return updatePictureSearchAppResponse;
	}
}