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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktMyparticipatedprojectsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktMyparticipatedprojectsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktMyparticipatedprojectsResponseUnmarshaller {

	public static QueryLinkeLinktMyparticipatedprojectsResponse unmarshall(QueryLinkeLinktMyparticipatedprojectsResponse queryLinkeLinktMyparticipatedprojectsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktMyparticipatedprojectsResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktMyparticipatedprojectsResponse.RequestId"));
		queryLinkeLinktMyparticipatedprojectsResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktMyparticipatedprojectsResponse.ResultCode"));
		queryLinkeLinktMyparticipatedprojectsResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktMyparticipatedprojectsResponse.ResultMessage"));
		queryLinkeLinktMyparticipatedprojectsResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktMyparticipatedprojectsResponse.ErrorCode"));
		queryLinkeLinktMyparticipatedprojectsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktMyparticipatedprojectsResponse.ErrorMessage"));
		queryLinkeLinktMyparticipatedprojectsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktMyparticipatedprojectsResponse.ResponseStatusCode"));
		queryLinkeLinktMyparticipatedprojectsResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktMyparticipatedprojectsResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("QueryLinkeLinktMyparticipatedprojectsResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("QueryLinkeLinktMyparticipatedprojectsResponse.Data.PageSize"));
		data.setPageTotal(_ctx.longValue("QueryLinkeLinktMyparticipatedprojectsResponse.Data.PageTotal"));
		data.setTotal(_ctx.longValue("QueryLinkeLinktMyparticipatedprojectsResponse.Data.Total"));

		List<String> items = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktMyparticipatedprojectsResponse.Data.Items.Length"); i++) {
			items.add(_ctx.stringValue("QueryLinkeLinktMyparticipatedprojectsResponse.Data.Items["+ i +"]"));
		}
		data.setItems(items);
		queryLinkeLinktMyparticipatedprojectsResponse.setData(data);
	 
	 	return queryLinkeLinktMyparticipatedprojectsResponse;
	}
}