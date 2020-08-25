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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktTagsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktTagsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktTagsResponseUnmarshaller {

	public static QueryLinkeLinktTagsResponse unmarshall(QueryLinkeLinktTagsResponse queryLinkeLinktTagsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktTagsResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktTagsResponse.RequestId"));
		queryLinkeLinktTagsResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktTagsResponse.ResultCode"));
		queryLinkeLinktTagsResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktTagsResponse.ResultMessage"));
		queryLinkeLinktTagsResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktTagsResponse.ErrorCode"));
		queryLinkeLinktTagsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktTagsResponse.ErrorMessage"));
		queryLinkeLinktTagsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktTagsResponse.ResponseStatusCode"));
		queryLinkeLinktTagsResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktTagsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktTagsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setColor(_ctx.stringValue("QueryLinkeLinktTagsResponse.Data["+ i +"].Color"));
			dataItem.setContent(_ctx.stringValue("QueryLinkeLinktTagsResponse.Data["+ i +"].Content"));
			dataItem.setCreatedAt(_ctx.longValue("QueryLinkeLinktTagsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("QueryLinkeLinktTagsResponse.Data["+ i +"].Creator"));
			dataItem.setDeleted(_ctx.booleanValue("QueryLinkeLinktTagsResponse.Data["+ i +"].Deleted"));
			dataItem.setId(_ctx.longValue("QueryLinkeLinktTagsResponse.Data["+ i +"].Id"));
			dataItem.setProjectSign(_ctx.stringValue("QueryLinkeLinktTagsResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRegion(_ctx.stringValue("QueryLinkeLinktTagsResponse.Data["+ i +"].Region"));
			dataItem.setUpdatedAt(_ctx.longValue("QueryLinkeLinktTagsResponse.Data["+ i +"].UpdatedAt"));

			data.add(dataItem);
		}
		queryLinkeLinktTagsResponse.setData(data);
	 
	 	return queryLinkeLinktTagsResponse;
	}
}