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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktMyentryprojectsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktMyentryprojectsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktMyentryprojectsResponseUnmarshaller {

	public static QueryLinkeLinktMyentryprojectsResponse unmarshall(QueryLinkeLinktMyentryprojectsResponse queryLinkeLinktMyentryprojectsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktMyentryprojectsResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktMyentryprojectsResponse.RequestId"));
		queryLinkeLinktMyentryprojectsResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktMyentryprojectsResponse.ResultCode"));
		queryLinkeLinktMyentryprojectsResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktMyentryprojectsResponse.ResultMessage"));
		queryLinkeLinktMyentryprojectsResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktMyentryprojectsResponse.ErrorCode"));
		queryLinkeLinktMyentryprojectsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktMyentryprojectsResponse.ErrorMessage"));
		queryLinkeLinktMyentryprojectsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktMyentryprojectsResponse.ResponseStatusCode"));
		queryLinkeLinktMyentryprojectsResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktMyentryprojectsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktMyentryprojectsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setArchive(_ctx.booleanValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].Archive"));
			dataItem.setAsPublic(_ctx.booleanValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].AsPublic"));
			dataItem.setCreatedAt(_ctx.longValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].Creator"));
			dataItem.setDeleted(_ctx.booleanValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].Description"));
			dataItem.setId(_ctx.longValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].Id"));
			dataItem.setLink(_ctx.stringValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].Link"));
			dataItem.setName(_ctx.stringValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].Name"));
			dataItem.setParentProject(_ctx.stringValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].ParentProject"));
			dataItem.setParentSign(_ctx.stringValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].ParentSign"));
			dataItem.setSign(_ctx.stringValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].Sign"));
			dataItem.setSignPath(_ctx.stringValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].SignPath"));
			dataItem.setUpdatedAt(_ctx.longValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].UpdatedAt"));
			dataItem.setUrl(_ctx.stringValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].Url"));

			List<String> adminMembers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].AdminMembers.Length"); j++) {
				adminMembers.add(_ctx.stringValue("QueryLinkeLinktMyentryprojectsResponse.Data["+ i +"].AdminMembers["+ j +"]"));
			}
			dataItem.setAdminMembers(adminMembers);

			data.add(dataItem);
		}
		queryLinkeLinktMyentryprojectsResponse.setData(data);
	 
	 	return queryLinkeLinktMyentryprojectsResponse;
	}
}