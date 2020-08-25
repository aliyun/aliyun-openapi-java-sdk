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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktSubprojectsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktSubprojectsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktSubprojectsResponseUnmarshaller {

	public static QueryLinkeLinktSubprojectsResponse unmarshall(QueryLinkeLinktSubprojectsResponse queryLinkeLinktSubprojectsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktSubprojectsResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktSubprojectsResponse.RequestId"));
		queryLinkeLinktSubprojectsResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktSubprojectsResponse.ResultCode"));
		queryLinkeLinktSubprojectsResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktSubprojectsResponse.ResultMessage"));
		queryLinkeLinktSubprojectsResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktSubprojectsResponse.ErrorCode"));
		queryLinkeLinktSubprojectsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktSubprojectsResponse.ErrorMessage"));
		queryLinkeLinktSubprojectsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktSubprojectsResponse.ResponseStatusCode"));
		queryLinkeLinktSubprojectsResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktSubprojectsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktSubprojectsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setArchive(_ctx.booleanValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].Archive"));
			dataItem.setAsPublic(_ctx.booleanValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].AsPublic"));
			dataItem.setCreatedAt(_ctx.longValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].Creator"));
			dataItem.setDeleted(_ctx.booleanValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].Description"));
			dataItem.setId(_ctx.longValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].Id"));
			dataItem.setLink(_ctx.stringValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].Link"));
			dataItem.setName(_ctx.stringValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].Name"));
			dataItem.setParentProject(_ctx.stringValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].ParentProject"));
			dataItem.setParentSign(_ctx.stringValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].ParentSign"));
			dataItem.setSign(_ctx.stringValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].Sign"));
			dataItem.setSignPath(_ctx.stringValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].SignPath"));
			dataItem.setUpdatedAt(_ctx.longValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].UpdatedAt"));
			dataItem.setUrl(_ctx.stringValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].Url"));

			List<String> adminMembers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].AdminMembers.Length"); j++) {
				adminMembers.add(_ctx.stringValue("QueryLinkeLinktSubprojectsResponse.Data["+ i +"].AdminMembers["+ j +"]"));
			}
			dataItem.setAdminMembers(adminMembers);

			data.add(dataItem);
		}
		queryLinkeLinktSubprojectsResponse.setData(data);
	 
	 	return queryLinkeLinktSubprojectsResponse;
	}
}