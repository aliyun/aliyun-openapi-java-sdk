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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktMilestoneResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktMilestoneResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktMilestoneResponseUnmarshaller {

	public static QueryLinkeLinktMilestoneResponse unmarshall(QueryLinkeLinktMilestoneResponse queryLinkeLinktMilestoneResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktMilestoneResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktMilestoneResponse.RequestId"));
		queryLinkeLinktMilestoneResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktMilestoneResponse.ResultCode"));
		queryLinkeLinktMilestoneResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktMilestoneResponse.ResultMessage"));
		queryLinkeLinktMilestoneResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktMilestoneResponse.ErrorCode"));
		queryLinkeLinktMilestoneResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktMilestoneResponse.ErrorMessage"));
		queryLinkeLinktMilestoneResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktMilestoneResponse.ResponseStatusCode"));
		queryLinkeLinktMilestoneResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktMilestoneResponse.Success"));

		Data data = new Data();
		data.setActualEndDate(_ctx.longValue("QueryLinkeLinktMilestoneResponse.Data.ActualEndDate"));
		data.setCreatedAt(_ctx.longValue("QueryLinkeLinktMilestoneResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("QueryLinkeLinktMilestoneResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("QueryLinkeLinktMilestoneResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("QueryLinkeLinktMilestoneResponse.Data.Description"));
		data.setExpectEndDate(_ctx.longValue("QueryLinkeLinktMilestoneResponse.Data.ExpectEndDate"));
		data.setId(_ctx.longValue("QueryLinkeLinktMilestoneResponse.Data.Id"));
		data.setManager(_ctx.stringValue("QueryLinkeLinktMilestoneResponse.Data.Manager"));
		data.setModifier(_ctx.stringValue("QueryLinkeLinktMilestoneResponse.Data.Modifier"));
		data.setName(_ctx.stringValue("QueryLinkeLinktMilestoneResponse.Data.Name"));
		data.setStatus(_ctx.stringValue("QueryLinkeLinktMilestoneResponse.Data.Status"));
		data.setTarget(_ctx.stringValue("QueryLinkeLinktMilestoneResponse.Data.Target"));
		data.setTargetType(_ctx.stringValue("QueryLinkeLinktMilestoneResponse.Data.TargetType"));
		data.setUpdatedAt(_ctx.longValue("QueryLinkeLinktMilestoneResponse.Data.UpdatedAt"));
		queryLinkeLinktMilestoneResponse.setData(data);
	 
	 	return queryLinkeLinktMilestoneResponse;
	}
}