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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktProjectongoingiterationsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktProjectongoingiterationsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktProjectongoingiterationsResponseUnmarshaller {

	public static QueryLinkeLinktProjectongoingiterationsResponse unmarshall(QueryLinkeLinktProjectongoingiterationsResponse queryLinkeLinktProjectongoingiterationsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktProjectongoingiterationsResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktProjectongoingiterationsResponse.RequestId"));
		queryLinkeLinktProjectongoingiterationsResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktProjectongoingiterationsResponse.ResultCode"));
		queryLinkeLinktProjectongoingiterationsResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktProjectongoingiterationsResponse.ResultMessage"));
		queryLinkeLinktProjectongoingiterationsResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktProjectongoingiterationsResponse.ErrorCode"));
		queryLinkeLinktProjectongoingiterationsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktProjectongoingiterationsResponse.ErrorMessage"));
		queryLinkeLinktProjectongoingiterationsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktProjectongoingiterationsResponse.ResponseStatusCode"));
		queryLinkeLinktProjectongoingiterationsResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktProjectongoingiterationsResponse.Success"));

		Data data = new Data();
		data.setBeginDate(_ctx.longValue("QueryLinkeLinktProjectongoingiterationsResponse.Data.BeginDate"));
		data.setCreatedAt(_ctx.longValue("QueryLinkeLinktProjectongoingiterationsResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("QueryLinkeLinktProjectongoingiterationsResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("QueryLinkeLinktProjectongoingiterationsResponse.Data.Deleted"));
		data.setEndDate(_ctx.longValue("QueryLinkeLinktProjectongoingiterationsResponse.Data.EndDate"));
		data.setFinishWorkItem(_ctx.longValue("QueryLinkeLinktProjectongoingiterationsResponse.Data.FinishWorkItem"));
		data.setId(_ctx.longValue("QueryLinkeLinktProjectongoingiterationsResponse.Data.Id"));
		data.setLocked(_ctx.booleanValue("QueryLinkeLinktProjectongoingiterationsResponse.Data.Locked"));
		data.setModifier(_ctx.stringValue("QueryLinkeLinktProjectongoingiterationsResponse.Data.Modifier"));
		data.setName(_ctx.stringValue("QueryLinkeLinktProjectongoingiterationsResponse.Data.Name"));
		data.setOwner(_ctx.stringValue("QueryLinkeLinktProjectongoingiterationsResponse.Data.Owner"));
		data.setProjectSign(_ctx.stringValue("QueryLinkeLinktProjectongoingiterationsResponse.Data.ProjectSign"));
		data.setSign(_ctx.stringValue("QueryLinkeLinktProjectongoingiterationsResponse.Data.Sign"));
		data.setTotalWorkItem(_ctx.longValue("QueryLinkeLinktProjectongoingiterationsResponse.Data.TotalWorkItem"));
		data.setUpdatedAt(_ctx.longValue("QueryLinkeLinktProjectongoingiterationsResponse.Data.UpdatedAt"));
		queryLinkeLinktProjectongoingiterationsResponse.setData(data);
	 
	 	return queryLinkeLinktProjectongoingiterationsResponse;
	}
}