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

import com.aliyuncs.dataworks_public.model.v20200518.DsgUserGroupAddOrUpdateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DsgUserGroupAddOrUpdateResponseUnmarshaller {

	public static DsgUserGroupAddOrUpdateResponse unmarshall(DsgUserGroupAddOrUpdateResponse dsgUserGroupAddOrUpdateResponse, UnmarshallerContext _ctx) {
		
		dsgUserGroupAddOrUpdateResponse.setRequestId(_ctx.stringValue("DsgUserGroupAddOrUpdateResponse.RequestId"));
		dsgUserGroupAddOrUpdateResponse.setSuccess(_ctx.booleanValue("DsgUserGroupAddOrUpdateResponse.Success"));
		dsgUserGroupAddOrUpdateResponse.setErrorCode(_ctx.stringValue("DsgUserGroupAddOrUpdateResponse.ErrorCode"));
		dsgUserGroupAddOrUpdateResponse.setErrorMessage(_ctx.stringValue("DsgUserGroupAddOrUpdateResponse.ErrorMessage"));
		dsgUserGroupAddOrUpdateResponse.setHttpStatusCode(_ctx.integerValue("DsgUserGroupAddOrUpdateResponse.HttpStatusCode"));
		dsgUserGroupAddOrUpdateResponse.setData(_ctx.booleanValue("DsgUserGroupAddOrUpdateResponse.Data"));
	 
	 	return dsgUserGroupAddOrUpdateResponse;
	}
}