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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktMilestoneResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktMilestoneResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktMilestoneResponseUnmarshaller {

	public static CreateLinkeLinktMilestoneResponse unmarshall(CreateLinkeLinktMilestoneResponse createLinkeLinktMilestoneResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktMilestoneResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.RequestId"));
		createLinkeLinktMilestoneResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.ResultCode"));
		createLinkeLinktMilestoneResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.ResultMessage"));
		createLinkeLinktMilestoneResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktMilestoneResponse.ErrorCode"));
		createLinkeLinktMilestoneResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.ErrorMessage"));
		createLinkeLinktMilestoneResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeLinktMilestoneResponse.ResponseStatusCode"));
		createLinkeLinktMilestoneResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktMilestoneResponse.Success"));

		Data data = new Data();
		data.setActualEndDate(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.ActualEndDate"));
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktMilestoneResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Description"));
		data.setExpectEndDate(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.ExpectEndDate"));
		data.setId(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.Id"));
		data.setManager(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Manager"));
		data.setModifier(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Modifier"));
		data.setName(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Name"));
		data.setStatus(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Status"));
		data.setTarget(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.Target"));
		data.setTargetType(_ctx.stringValue("CreateLinkeLinktMilestoneResponse.Data.TargetType"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktMilestoneResponse.Data.UpdatedAt"));
		createLinkeLinktMilestoneResponse.setData(data);
	 
	 	return createLinkeLinktMilestoneResponse;
	}
}