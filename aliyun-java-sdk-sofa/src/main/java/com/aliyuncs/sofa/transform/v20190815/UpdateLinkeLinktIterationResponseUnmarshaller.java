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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktIterationResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktIterationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktIterationResponseUnmarshaller {

	public static UpdateLinkeLinktIterationResponse unmarshall(UpdateLinkeLinktIterationResponse updateLinkeLinktIterationResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktIterationResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktIterationResponse.RequestId"));
		updateLinkeLinktIterationResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktIterationResponse.ResultCode"));
		updateLinkeLinktIterationResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktIterationResponse.ResultMessage"));
		updateLinkeLinktIterationResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktIterationResponse.ErrorCode"));
		updateLinkeLinktIterationResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktIterationResponse.ErrorMessage"));
		updateLinkeLinktIterationResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinktIterationResponse.ResponseStatusCode"));
		updateLinkeLinktIterationResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktIterationResponse.Success"));

		Data data = new Data();
		data.setBeginDate(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.BeginDate"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktIterationResponse.Data.Deleted"));
		data.setEndDate(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.EndDate"));
		data.setFinishWorkItem(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.FinishWorkItem"));
		data.setId(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.Id"));
		data.setLocked(_ctx.booleanValue("UpdateLinkeLinktIterationResponse.Data.Locked"));
		data.setModifier(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Modifier"));
		data.setName(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Name"));
		data.setOwner(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Owner"));
		data.setProjectSign(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.ProjectSign"));
		data.setSign(_ctx.stringValue("UpdateLinkeLinktIterationResponse.Data.Sign"));
		data.setTotalWorkItem(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.TotalWorkItem"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktIterationResponse.Data.UpdatedAt"));
		updateLinkeLinktIterationResponse.setData(data);
	 
	 	return updateLinkeLinktIterationResponse;
	}
}