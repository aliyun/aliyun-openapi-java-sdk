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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktMilestoneResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktMilestoneResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktMilestoneResponseUnmarshaller {

	public static UpdateLinkeLinktMilestoneResponse unmarshall(UpdateLinkeLinktMilestoneResponse updateLinkeLinktMilestoneResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktMilestoneResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.RequestId"));
		updateLinkeLinktMilestoneResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.ResultCode"));
		updateLinkeLinktMilestoneResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.ResultMessage"));
		updateLinkeLinktMilestoneResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.ErrorCode"));
		updateLinkeLinktMilestoneResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.ErrorMessage"));
		updateLinkeLinktMilestoneResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.ResponseStatusCode"));
		updateLinkeLinktMilestoneResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktMilestoneResponse.Success"));

		Data data = new Data();
		data.setActualEndDate(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.ActualEndDate"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktMilestoneResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Description"));
		data.setExpectEndDate(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.ExpectEndDate"));
		data.setId(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.Id"));
		data.setManager(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Manager"));
		data.setModifier(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Modifier"));
		data.setName(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Name"));
		data.setStatus(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Status"));
		data.setTarget(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.Target"));
		data.setTargetType(_ctx.stringValue("UpdateLinkeLinktMilestoneResponse.Data.TargetType"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktMilestoneResponse.Data.UpdatedAt"));
		updateLinkeLinktMilestoneResponse.setData(data);
	 
	 	return updateLinkeLinktMilestoneResponse;
	}
}