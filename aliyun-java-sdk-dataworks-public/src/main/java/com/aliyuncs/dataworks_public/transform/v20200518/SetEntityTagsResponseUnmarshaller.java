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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.SetEntityTagsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetEntityTagsResponseUnmarshaller {

	public static SetEntityTagsResponse unmarshall(SetEntityTagsResponse setEntityTagsResponse, UnmarshallerContext _ctx) {
		
		setEntityTagsResponse.setRequestId(_ctx.stringValue("SetEntityTagsResponse.RequestId"));
		setEntityTagsResponse.setData(_ctx.booleanValue("SetEntityTagsResponse.Data"));
		setEntityTagsResponse.setSuccess(_ctx.booleanValue("SetEntityTagsResponse.Success"));
		setEntityTagsResponse.setErrorCode(_ctx.stringValue("SetEntityTagsResponse.ErrorCode"));
		setEntityTagsResponse.setErrorMessage(_ctx.stringValue("SetEntityTagsResponse.ErrorMessage"));
		setEntityTagsResponse.setHttpStatusCode(_ctx.integerValue("SetEntityTagsResponse.HttpStatusCode"));
	 
	 	return setEntityTagsResponse;
	}
}