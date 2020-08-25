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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktProjectmilestonegroupsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktProjectmilestonegroupsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktProjectmilestonegroupsResponseUnmarshaller {

	public static QueryLinkeLinktProjectmilestonegroupsResponse unmarshall(QueryLinkeLinktProjectmilestonegroupsResponse queryLinkeLinktProjectmilestonegroupsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktProjectmilestonegroupsResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktProjectmilestonegroupsResponse.RequestId"));
		queryLinkeLinktProjectmilestonegroupsResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktProjectmilestonegroupsResponse.ResultCode"));
		queryLinkeLinktProjectmilestonegroupsResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktProjectmilestonegroupsResponse.ResultMessage"));
		queryLinkeLinktProjectmilestonegroupsResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktProjectmilestonegroupsResponse.ErrorCode"));
		queryLinkeLinktProjectmilestonegroupsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktProjectmilestonegroupsResponse.ErrorMessage"));
		queryLinkeLinktProjectmilestonegroupsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktProjectmilestonegroupsResponse.ResponseStatusCode"));
		queryLinkeLinktProjectmilestonegroupsResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktProjectmilestonegroupsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktProjectmilestonegroupsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setExpectEndDate(_ctx.longValue("QueryLinkeLinktProjectmilestonegroupsResponse.Data["+ i +"].ExpectEndDate"));

			List<String> items = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinktProjectmilestonegroupsResponse.Data["+ i +"].Items.Length"); j++) {
				items.add(_ctx.stringValue("QueryLinkeLinktProjectmilestonegroupsResponse.Data["+ i +"].Items["+ j +"]"));
			}
			dataItem.setItems(items);

			data.add(dataItem);
		}
		queryLinkeLinktProjectmilestonegroupsResponse.setData(data);
	 
	 	return queryLinkeLinktProjectmilestonegroupsResponse;
	}
}