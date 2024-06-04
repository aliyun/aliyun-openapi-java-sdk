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

import com.aliyuncs.dataworks_public.model.v20200518.DsgUserGroupDeleteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DsgUserGroupDeleteResponseUnmarshaller {

	public static DsgUserGroupDeleteResponse unmarshall(DsgUserGroupDeleteResponse dsgUserGroupDeleteResponse, UnmarshallerContext _ctx) {
		
		dsgUserGroupDeleteResponse.setRequestId(_ctx.stringValue("DsgUserGroupDeleteResponse.RequestId"));
		dsgUserGroupDeleteResponse.setSuccess(_ctx.booleanValue("DsgUserGroupDeleteResponse.Success"));
		dsgUserGroupDeleteResponse.setErrorCode(_ctx.stringValue("DsgUserGroupDeleteResponse.ErrorCode"));
		dsgUserGroupDeleteResponse.setErrorMessage(_ctx.stringValue("DsgUserGroupDeleteResponse.ErrorMessage"));
		dsgUserGroupDeleteResponse.setHttpStatusCode(_ctx.integerValue("DsgUserGroupDeleteResponse.HttpStatusCode"));
		dsgUserGroupDeleteResponse.setData(_ctx.booleanValue("DsgUserGroupDeleteResponse.Data"));
	 
	 	return dsgUserGroupDeleteResponse;
	}
}