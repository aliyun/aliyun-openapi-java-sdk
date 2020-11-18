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

import com.aliyuncs.linkvisual.model.v20180120.AddFaceUserResponse;
import com.aliyuncs.linkvisual.model.v20180120.AddFaceUserResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddFaceUserResponseUnmarshaller {

	public static AddFaceUserResponse unmarshall(AddFaceUserResponse addFaceUserResponse, UnmarshallerContext _ctx) {
		
		addFaceUserResponse.setRequestId(_ctx.stringValue("AddFaceUserResponse.RequestId"));
		addFaceUserResponse.setSuccess(_ctx.booleanValue("AddFaceUserResponse.Success"));
		addFaceUserResponse.setErrorMessage(_ctx.stringValue("AddFaceUserResponse.ErrorMessage"));
		addFaceUserResponse.setCode(_ctx.stringValue("AddFaceUserResponse.Code"));

		Data data = new Data();
		data.setUserId(_ctx.stringValue("AddFaceUserResponse.Data.UserId"));
		data.setCustomUserId(_ctx.stringValue("AddFaceUserResponse.Data.CustomUserId"));
		data.setName(_ctx.stringValue("AddFaceUserResponse.Data.Name"));
		data.setParams(_ctx.stringValue("AddFaceUserResponse.Data.Params"));
		addFaceUserResponse.setData(data);
	 
	 	return addFaceUserResponse;
	}
}