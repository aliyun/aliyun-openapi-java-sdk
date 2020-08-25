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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktMilestonestatusResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktMilestonestatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktMilestonestatusResponseUnmarshaller {

	public static UpdateLinkeLinktMilestonestatusResponse unmarshall(UpdateLinkeLinktMilestonestatusResponse updateLinkeLinktMilestonestatusResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktMilestonestatusResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.RequestId"));
		updateLinkeLinktMilestonestatusResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.ResultCode"));
		updateLinkeLinktMilestonestatusResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.ResultMessage"));
		updateLinkeLinktMilestonestatusResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.ErrorCode"));
		updateLinkeLinktMilestonestatusResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.ErrorMessage"));
		updateLinkeLinktMilestonestatusResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.ResponseStatusCode"));
		updateLinkeLinktMilestonestatusResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktMilestonestatusResponse.Success"));

		Data data = new Data();
		data.setActualEndDate(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.ActualEndDate"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktMilestonestatusResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Description"));
		data.setExpectEndDate(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.ExpectEndDate"));
		data.setId(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.Id"));
		data.setManager(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Manager"));
		data.setModifier(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Modifier"));
		data.setName(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Name"));
		data.setStatus(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Status"));
		data.setTarget(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.Target"));
		data.setTargetType(_ctx.stringValue("UpdateLinkeLinktMilestonestatusResponse.Data.TargetType"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktMilestonestatusResponse.Data.UpdatedAt"));
		updateLinkeLinktMilestonestatusResponse.setData(data);
	 
	 	return updateLinkeLinktMilestonestatusResponse;
	}
}