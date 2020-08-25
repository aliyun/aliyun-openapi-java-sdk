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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktLinkeiterationsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktLinkeiterationsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktLinkeiterationsResponseUnmarshaller {

	public static QueryLinkeLinktLinkeiterationsResponse unmarshall(QueryLinkeLinktLinkeiterationsResponse queryLinkeLinktLinkeiterationsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktLinkeiterationsResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktLinkeiterationsResponse.RequestId"));
		queryLinkeLinktLinkeiterationsResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktLinkeiterationsResponse.ResultCode"));
		queryLinkeLinktLinkeiterationsResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktLinkeiterationsResponse.ResultMessage"));
		queryLinkeLinktLinkeiterationsResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktLinkeiterationsResponse.ErrorCode"));
		queryLinkeLinktLinkeiterationsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktLinkeiterationsResponse.ErrorMessage"));
		queryLinkeLinktLinkeiterationsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktLinkeiterationsResponse.ResponseStatusCode"));
		queryLinkeLinktLinkeiterationsResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktLinkeiterationsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktLinkeiterationsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKey(_ctx.stringValue("QueryLinkeLinktLinkeiterationsResponse.Data["+ i +"].Key"));
			dataItem.setLabel(_ctx.stringValue("QueryLinkeLinktLinkeiterationsResponse.Data["+ i +"].Label"));
			dataItem.setUrl(_ctx.stringValue("QueryLinkeLinktLinkeiterationsResponse.Data["+ i +"].Url"));

			data.add(dataItem);
		}
		queryLinkeLinktLinkeiterationsResponse.setData(data);
	 
	 	return queryLinkeLinktLinkeiterationsResponse;
	}
}