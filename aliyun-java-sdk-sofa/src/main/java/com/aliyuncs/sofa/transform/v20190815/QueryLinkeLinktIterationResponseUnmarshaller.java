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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktIterationResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktIterationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktIterationResponseUnmarshaller {

	public static QueryLinkeLinktIterationResponse unmarshall(QueryLinkeLinktIterationResponse queryLinkeLinktIterationResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktIterationResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktIterationResponse.RequestId"));
		queryLinkeLinktIterationResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktIterationResponse.ResultCode"));
		queryLinkeLinktIterationResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktIterationResponse.ResultMessage"));
		queryLinkeLinktIterationResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktIterationResponse.ErrorCode"));
		queryLinkeLinktIterationResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktIterationResponse.ErrorMessage"));
		queryLinkeLinktIterationResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktIterationResponse.ResponseStatusCode"));
		queryLinkeLinktIterationResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktIterationResponse.Success"));

		Data data = new Data();
		data.setBeginDate(_ctx.longValue("QueryLinkeLinktIterationResponse.Data.BeginDate"));
		data.setCreatedAt(_ctx.longValue("QueryLinkeLinktIterationResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("QueryLinkeLinktIterationResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("QueryLinkeLinktIterationResponse.Data.Deleted"));
		data.setEndDate(_ctx.longValue("QueryLinkeLinktIterationResponse.Data.EndDate"));
		data.setFinishWorkItem(_ctx.longValue("QueryLinkeLinktIterationResponse.Data.FinishWorkItem"));
		data.setId(_ctx.longValue("QueryLinkeLinktIterationResponse.Data.Id"));
		data.setLocked(_ctx.booleanValue("QueryLinkeLinktIterationResponse.Data.Locked"));
		data.setModifier(_ctx.stringValue("QueryLinkeLinktIterationResponse.Data.Modifier"));
		data.setName(_ctx.stringValue("QueryLinkeLinktIterationResponse.Data.Name"));
		data.setOwner(_ctx.stringValue("QueryLinkeLinktIterationResponse.Data.Owner"));
		data.setProjectSign(_ctx.stringValue("QueryLinkeLinktIterationResponse.Data.ProjectSign"));
		data.setSign(_ctx.stringValue("QueryLinkeLinktIterationResponse.Data.Sign"));
		data.setTotalWorkItem(_ctx.longValue("QueryLinkeLinktIterationResponse.Data.TotalWorkItem"));
		data.setUpdatedAt(_ctx.longValue("QueryLinkeLinktIterationResponse.Data.UpdatedAt"));
		queryLinkeLinktIterationResponse.setData(data);
	 
	 	return queryLinkeLinktIterationResponse;
	}
}