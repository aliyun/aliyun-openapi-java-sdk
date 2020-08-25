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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktProjectcreatedtagsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktProjectcreatedtagsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktProjectcreatedtagsResponseUnmarshaller {

	public static QueryLinkeLinktProjectcreatedtagsResponse unmarshall(QueryLinkeLinktProjectcreatedtagsResponse queryLinkeLinktProjectcreatedtagsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktProjectcreatedtagsResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktProjectcreatedtagsResponse.RequestId"));
		queryLinkeLinktProjectcreatedtagsResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktProjectcreatedtagsResponse.ResultCode"));
		queryLinkeLinktProjectcreatedtagsResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktProjectcreatedtagsResponse.ResultMessage"));
		queryLinkeLinktProjectcreatedtagsResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktProjectcreatedtagsResponse.ErrorCode"));
		queryLinkeLinktProjectcreatedtagsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktProjectcreatedtagsResponse.ErrorMessage"));
		queryLinkeLinktProjectcreatedtagsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktProjectcreatedtagsResponse.ResponseStatusCode"));
		queryLinkeLinktProjectcreatedtagsResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktProjectcreatedtagsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktProjectcreatedtagsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setColor(_ctx.stringValue("QueryLinkeLinktProjectcreatedtagsResponse.Data["+ i +"].Color"));
			dataItem.setContent(_ctx.stringValue("QueryLinkeLinktProjectcreatedtagsResponse.Data["+ i +"].Content"));
			dataItem.setCreatedAt(_ctx.longValue("QueryLinkeLinktProjectcreatedtagsResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("QueryLinkeLinktProjectcreatedtagsResponse.Data["+ i +"].Creator"));
			dataItem.setDeleted(_ctx.booleanValue("QueryLinkeLinktProjectcreatedtagsResponse.Data["+ i +"].Deleted"));
			dataItem.setId(_ctx.longValue("QueryLinkeLinktProjectcreatedtagsResponse.Data["+ i +"].Id"));
			dataItem.setProjectSign(_ctx.stringValue("QueryLinkeLinktProjectcreatedtagsResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRegion(_ctx.stringValue("QueryLinkeLinktProjectcreatedtagsResponse.Data["+ i +"].Region"));
			dataItem.setUpdatedAt(_ctx.longValue("QueryLinkeLinktProjectcreatedtagsResponse.Data["+ i +"].UpdatedAt"));

			data.add(dataItem);
		}
		queryLinkeLinktProjectcreatedtagsResponse.setData(data);
	 
	 	return queryLinkeLinktProjectcreatedtagsResponse;
	}
}