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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktSimpleprojectResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktSimpleprojectResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktSimpleprojectResponseUnmarshaller {

	public static QueryLinkeLinktSimpleprojectResponse unmarshall(QueryLinkeLinktSimpleprojectResponse queryLinkeLinktSimpleprojectResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktSimpleprojectResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktSimpleprojectResponse.RequestId"));
		queryLinkeLinktSimpleprojectResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktSimpleprojectResponse.ResultCode"));
		queryLinkeLinktSimpleprojectResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktSimpleprojectResponse.ResultMessage"));
		queryLinkeLinktSimpleprojectResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktSimpleprojectResponse.ErrorCode"));
		queryLinkeLinktSimpleprojectResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktSimpleprojectResponse.ErrorMessage"));
		queryLinkeLinktSimpleprojectResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktSimpleprojectResponse.ResponseStatusCode"));
		queryLinkeLinktSimpleprojectResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktSimpleprojectResponse.Success"));

		Data data = new Data();
		data.setArchive(_ctx.booleanValue("QueryLinkeLinktSimpleprojectResponse.Data.Archive"));
		data.setAsPublic(_ctx.booleanValue("QueryLinkeLinktSimpleprojectResponse.Data.AsPublic"));
		data.setCreatedAt(_ctx.longValue("QueryLinkeLinktSimpleprojectResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("QueryLinkeLinktSimpleprojectResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("QueryLinkeLinktSimpleprojectResponse.Data.Deleted"));
		data.setDescription(_ctx.stringValue("QueryLinkeLinktSimpleprojectResponse.Data.Description"));
		data.setId(_ctx.longValue("QueryLinkeLinktSimpleprojectResponse.Data.Id"));
		data.setLink(_ctx.stringValue("QueryLinkeLinktSimpleprojectResponse.Data.Link"));
		data.setName(_ctx.stringValue("QueryLinkeLinktSimpleprojectResponse.Data.Name"));
		data.setParentSign(_ctx.stringValue("QueryLinkeLinktSimpleprojectResponse.Data.ParentSign"));
		data.setSign(_ctx.stringValue("QueryLinkeLinktSimpleprojectResponse.Data.Sign"));
		data.setSignPath(_ctx.stringValue("QueryLinkeLinktSimpleprojectResponse.Data.SignPath"));
		data.setUpdatedAt(_ctx.longValue("QueryLinkeLinktSimpleprojectResponse.Data.UpdatedAt"));
		data.setUrl(_ctx.stringValue("QueryLinkeLinktSimpleprojectResponse.Data.Url"));
		queryLinkeLinktSimpleprojectResponse.setData(data);
	 
	 	return queryLinkeLinktSimpleprojectResponse;
	}
}