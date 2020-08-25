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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktNextreachablestatusesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktNextreachablestatusesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktNextreachablestatusesResponseUnmarshaller {

	public static QueryLinkeLinktNextreachablestatusesResponse unmarshall(QueryLinkeLinktNextreachablestatusesResponse queryLinkeLinktNextreachablestatusesResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktNextreachablestatusesResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktNextreachablestatusesResponse.RequestId"));
		queryLinkeLinktNextreachablestatusesResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktNextreachablestatusesResponse.ResultCode"));
		queryLinkeLinktNextreachablestatusesResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktNextreachablestatusesResponse.ResultMessage"));
		queryLinkeLinktNextreachablestatusesResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktNextreachablestatusesResponse.ErrorCode"));
		queryLinkeLinktNextreachablestatusesResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktNextreachablestatusesResponse.ErrorMessage"));
		queryLinkeLinktNextreachablestatusesResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktNextreachablestatusesResponse.ResponseStatusCode"));
		queryLinkeLinktNextreachablestatusesResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktNextreachablestatusesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktNextreachablestatusesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatedAt(_ctx.longValue("QueryLinkeLinktNextreachablestatusesResponse.Data["+ i +"].CreatedAt"));
			dataItem.setDeleted(_ctx.booleanValue("QueryLinkeLinktNextreachablestatusesResponse.Data["+ i +"].Deleted"));
			dataItem.setId(_ctx.longValue("QueryLinkeLinktNextreachablestatusesResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("QueryLinkeLinktNextreachablestatusesResponse.Data["+ i +"].Name"));
			dataItem.setProjectSign(_ctx.stringValue("QueryLinkeLinktNextreachablestatusesResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRegion(_ctx.stringValue("QueryLinkeLinktNextreachablestatusesResponse.Data["+ i +"].Region"));
			dataItem.setStage(_ctx.longValue("QueryLinkeLinktNextreachablestatusesResponse.Data["+ i +"].Stage"));
			dataItem.setStageName(_ctx.stringValue("QueryLinkeLinktNextreachablestatusesResponse.Data["+ i +"].StageName"));
			dataItem.setUpdatedAt(_ctx.longValue("QueryLinkeLinktNextreachablestatusesResponse.Data["+ i +"].UpdatedAt"));

			data.add(dataItem);
		}
		queryLinkeLinktNextreachablestatusesResponse.setData(data);
	 
	 	return queryLinkeLinktNextreachablestatusesResponse;
	}
}