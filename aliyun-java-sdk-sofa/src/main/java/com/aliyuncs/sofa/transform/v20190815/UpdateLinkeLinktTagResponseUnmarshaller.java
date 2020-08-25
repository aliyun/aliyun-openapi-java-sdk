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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktTagResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktTagResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktTagResponseUnmarshaller {

	public static UpdateLinkeLinktTagResponse unmarshall(UpdateLinkeLinktTagResponse updateLinkeLinktTagResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktTagResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktTagResponse.RequestId"));
		updateLinkeLinktTagResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktTagResponse.ResultCode"));
		updateLinkeLinktTagResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktTagResponse.ResultMessage"));
		updateLinkeLinktTagResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktTagResponse.ErrorCode"));
		updateLinkeLinktTagResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktTagResponse.ErrorMessage"));
		updateLinkeLinktTagResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinktTagResponse.ResponseStatusCode"));
		updateLinkeLinktTagResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktTagResponse.Success"));

		Data data = new Data();
		data.setColor(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Color"));
		data.setContent(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Content"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktTagResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktTagResponse.Data.Deleted"));
		data.setId(_ctx.longValue("UpdateLinkeLinktTagResponse.Data.Id"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.ProjectSign"));
		data.setRegion(_ctx.stringValue("UpdateLinkeLinktTagResponse.Data.Region"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktTagResponse.Data.UpdatedAt"));
		updateLinkeLinktTagResponse.setData(data);
	 
	 	return updateLinkeLinktTagResponse;
	}
}