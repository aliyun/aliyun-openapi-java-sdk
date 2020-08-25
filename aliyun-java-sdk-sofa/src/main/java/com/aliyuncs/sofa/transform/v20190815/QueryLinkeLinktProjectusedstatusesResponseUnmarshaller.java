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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktProjectusedstatusesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktProjectusedstatusesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktProjectusedstatusesResponseUnmarshaller {

	public static QueryLinkeLinktProjectusedstatusesResponse unmarshall(QueryLinkeLinktProjectusedstatusesResponse queryLinkeLinktProjectusedstatusesResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktProjectusedstatusesResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktProjectusedstatusesResponse.RequestId"));
		queryLinkeLinktProjectusedstatusesResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktProjectusedstatusesResponse.ResultCode"));
		queryLinkeLinktProjectusedstatusesResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktProjectusedstatusesResponse.ResultMessage"));
		queryLinkeLinktProjectusedstatusesResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktProjectusedstatusesResponse.ErrorCode"));
		queryLinkeLinktProjectusedstatusesResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktProjectusedstatusesResponse.ErrorMessage"));
		queryLinkeLinktProjectusedstatusesResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktProjectusedstatusesResponse.ResponseStatusCode"));
		queryLinkeLinktProjectusedstatusesResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktProjectusedstatusesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktProjectusedstatusesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatedAt(_ctx.longValue("QueryLinkeLinktProjectusedstatusesResponse.Data["+ i +"].CreatedAt"));
			dataItem.setDeleted(_ctx.booleanValue("QueryLinkeLinktProjectusedstatusesResponse.Data["+ i +"].Deleted"));
			dataItem.setId(_ctx.longValue("QueryLinkeLinktProjectusedstatusesResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("QueryLinkeLinktProjectusedstatusesResponse.Data["+ i +"].Name"));
			dataItem.setProjectSign(_ctx.stringValue("QueryLinkeLinktProjectusedstatusesResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRegion(_ctx.stringValue("QueryLinkeLinktProjectusedstatusesResponse.Data["+ i +"].Region"));
			dataItem.setStage(_ctx.longValue("QueryLinkeLinktProjectusedstatusesResponse.Data["+ i +"].Stage"));
			dataItem.setStageName(_ctx.stringValue("QueryLinkeLinktProjectusedstatusesResponse.Data["+ i +"].StageName"));
			dataItem.setUpdatedAt(_ctx.longValue("QueryLinkeLinktProjectusedstatusesResponse.Data["+ i +"].UpdatedAt"));

			data.add(dataItem);
		}
		queryLinkeLinktProjectusedstatusesResponse.setData(data);
	 
	 	return queryLinkeLinktProjectusedstatusesResponse;
	}
}