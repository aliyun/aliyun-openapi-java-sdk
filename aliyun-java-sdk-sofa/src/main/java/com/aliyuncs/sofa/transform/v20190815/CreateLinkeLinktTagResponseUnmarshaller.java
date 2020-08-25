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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktTagResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktTagResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktTagResponseUnmarshaller {

	public static CreateLinkeLinktTagResponse unmarshall(CreateLinkeLinktTagResponse createLinkeLinktTagResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktTagResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktTagResponse.RequestId"));
		createLinkeLinktTagResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktTagResponse.ResultCode"));
		createLinkeLinktTagResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktTagResponse.ResultMessage"));
		createLinkeLinktTagResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktTagResponse.ErrorCode"));
		createLinkeLinktTagResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktTagResponse.ErrorMessage"));
		createLinkeLinktTagResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeLinktTagResponse.ResponseStatusCode"));
		createLinkeLinktTagResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktTagResponse.Success"));

		Data data = new Data();
		data.setColor(_ctx.stringValue("CreateLinkeLinktTagResponse.Data.Color"));
		data.setContent(_ctx.stringValue("CreateLinkeLinktTagResponse.Data.Content"));
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktTagResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("CreateLinkeLinktTagResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktTagResponse.Data.Deleted"));
		data.setId(_ctx.longValue("CreateLinkeLinktTagResponse.Data.Id"));
		data.setProjectSign(_ctx.stringValue("CreateLinkeLinktTagResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("CreateLinkeLinktTagResponse.Data.Region"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktTagResponse.Data.UpdatedAt"));
		createLinkeLinktTagResponse.setData(data);
	 
	 	return createLinkeLinktTagResponse;
	}
}