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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.GetAccountRelationResponse;
import com.aliyuncs.bssopenapi.model.v20171214.GetAccountRelationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountRelationResponseUnmarshaller {

	public static GetAccountRelationResponse unmarshall(GetAccountRelationResponse getAccountRelationResponse, UnmarshallerContext _ctx) {
		
		getAccountRelationResponse.setRequestId(_ctx.stringValue("GetAccountRelationResponse.RequestId"));
		getAccountRelationResponse.setMessage(_ctx.stringValue("GetAccountRelationResponse.Message"));
		getAccountRelationResponse.setCode(_ctx.stringValue("GetAccountRelationResponse.Code"));
		getAccountRelationResponse.setSuccess(_ctx.booleanValue("GetAccountRelationResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetAccountRelationResponse.Data.Id"));
		data.setParentUserId(_ctx.longValue("GetAccountRelationResponse.Data.ParentUserId"));
		data.setChildUserId(_ctx.longValue("GetAccountRelationResponse.Data.ChildUserId"));
		data.setStartTime(_ctx.longValue("GetAccountRelationResponse.Data.StartTime"));
		data.setEndTime(_ctx.longValue("GetAccountRelationResponse.Data.EndTime"));
		data.setType(_ctx.stringValue("GetAccountRelationResponse.Data.Type"));
		data.setStatus(_ctx.stringValue("GetAccountRelationResponse.Data.Status"));
		data.setGmtModified(_ctx.longValue("GetAccountRelationResponse.Data.GmtModified"));
		getAccountRelationResponse.setData(data);
	 
	 	return getAccountRelationResponse;
	}
}