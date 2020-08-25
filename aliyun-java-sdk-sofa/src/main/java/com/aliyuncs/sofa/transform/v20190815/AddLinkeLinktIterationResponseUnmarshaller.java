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

import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktIterationResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinktIterationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeLinktIterationResponseUnmarshaller {

	public static AddLinkeLinktIterationResponse unmarshall(AddLinkeLinktIterationResponse addLinkeLinktIterationResponse, UnmarshallerContext _ctx) {
		
		addLinkeLinktIterationResponse.setRequestId(_ctx.stringValue("AddLinkeLinktIterationResponse.RequestId"));
		addLinkeLinktIterationResponse.setResultCode(_ctx.stringValue("AddLinkeLinktIterationResponse.ResultCode"));
		addLinkeLinktIterationResponse.setResultMessage(_ctx.stringValue("AddLinkeLinktIterationResponse.ResultMessage"));
		addLinkeLinktIterationResponse.setErrorCode(_ctx.longValue("AddLinkeLinktIterationResponse.ErrorCode"));
		addLinkeLinktIterationResponse.setErrorMessage(_ctx.stringValue("AddLinkeLinktIterationResponse.ErrorMessage"));
		addLinkeLinktIterationResponse.setResponseStatusCode(_ctx.longValue("AddLinkeLinktIterationResponse.ResponseStatusCode"));
		addLinkeLinktIterationResponse.setSuccess(_ctx.booleanValue("AddLinkeLinktIterationResponse.Success"));

		Data data = new Data();
		data.setBeginDate(_ctx.longValue("AddLinkeLinktIterationResponse.Data.BeginDate"));
		data.setCreatedAt(_ctx.longValue("AddLinkeLinktIterationResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("AddLinkeLinktIterationResponse.Data.Deleted"));
		data.setEndDate(_ctx.longValue("AddLinkeLinktIterationResponse.Data.EndDate"));
		data.setFinishWorkItem(_ctx.longValue("AddLinkeLinktIterationResponse.Data.FinishWorkItem"));
		data.setId(_ctx.longValue("AddLinkeLinktIterationResponse.Data.Id"));
		data.setLocked(_ctx.booleanValue("AddLinkeLinktIterationResponse.Data.Locked"));
		data.setModifier(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Modifier"));
		data.setName(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Name"));
		data.setOwner(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Owner"));
		data.setProjectSign(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.ProjectSign"));
		data.setSign(_ctx.stringValue("AddLinkeLinktIterationResponse.Data.Sign"));
		data.setTotalWorkItem(_ctx.longValue("AddLinkeLinktIterationResponse.Data.TotalWorkItem"));
		data.setUpdatedAt(_ctx.longValue("AddLinkeLinktIterationResponse.Data.UpdatedAt"));
		addLinkeLinktIterationResponse.setData(data);
	 
	 	return addLinkeLinktIterationResponse;
	}
}