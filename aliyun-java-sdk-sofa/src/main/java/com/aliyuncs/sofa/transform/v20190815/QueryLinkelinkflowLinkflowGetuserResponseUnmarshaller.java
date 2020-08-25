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

import com.aliyuncs.sofa.model.v20190815.QueryLinkelinkflowLinkflowGetuserResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkelinkflowLinkflowGetuserResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkelinkflowLinkflowGetuserResponseUnmarshaller {

	public static QueryLinkelinkflowLinkflowGetuserResponse unmarshall(QueryLinkelinkflowLinkflowGetuserResponse queryLinkelinkflowLinkflowGetuserResponse, UnmarshallerContext _ctx) {
		
		queryLinkelinkflowLinkflowGetuserResponse.setRequestId(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.RequestId"));
		queryLinkelinkflowLinkflowGetuserResponse.setResultCode(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.ResultCode"));
		queryLinkelinkflowLinkflowGetuserResponse.setResultMessage(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.ResultMessage"));
		queryLinkelinkflowLinkflowGetuserResponse.setCurrent(_ctx.longValue("QueryLinkelinkflowLinkflowGetuserResponse.Current"));
		queryLinkelinkflowLinkflowGetuserResponse.setErrorCode(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.ErrorCode"));
		queryLinkelinkflowLinkflowGetuserResponse.setErrorMsg(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.ErrorMsg"));
		queryLinkelinkflowLinkflowGetuserResponse.setPageSize(_ctx.longValue("QueryLinkelinkflowLinkflowGetuserResponse.PageSize"));
		queryLinkelinkflowLinkflowGetuserResponse.setResponseStatusCode(_ctx.longValue("QueryLinkelinkflowLinkflowGetuserResponse.ResponseStatusCode"));
		queryLinkelinkflowLinkflowGetuserResponse.setSuccess(_ctx.booleanValue("QueryLinkelinkflowLinkflowGetuserResponse.Success"));
		queryLinkelinkflowLinkflowGetuserResponse.setTotal(_ctx.longValue("QueryLinkelinkflowLinkflowGetuserResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkelinkflowLinkflowGetuserResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAccount(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.Data["+ i +"].Account"));
			dataItem.setAdmin(_ctx.booleanValue("QueryLinkelinkflowLinkflowGetuserResponse.Data["+ i +"].Admin"));
			dataItem.setDisplayName(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.Data["+ i +"].DisplayName"));
			dataItem.setEmail(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.Data["+ i +"].Email"));
			dataItem.setEmpId(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.Data["+ i +"].EmpId"));
			dataItem.setFirstName(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.Data["+ i +"].FirstName"));
			dataItem.setId(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.Data["+ i +"].Id"));
			dataItem.setIsPictureSet(_ctx.booleanValue("QueryLinkelinkflowLinkflowGetuserResponse.Data["+ i +"].IsPictureSet"));
			dataItem.setLastName(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.Data["+ i +"].LastName"));
			dataItem.setName(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.Data["+ i +"].Name"));
			dataItem.setNick(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.Data["+ i +"].Nick"));
			dataItem.setPassword(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.Data["+ i +"].Password"));
			dataItem.setTenantId(_ctx.stringValue("QueryLinkelinkflowLinkflowGetuserResponse.Data["+ i +"].TenantId"));

			data.add(dataItem);
		}
		queryLinkelinkflowLinkflowGetuserResponse.setData(data);
	 
	 	return queryLinkelinkflowLinkflowGetuserResponse;
	}
}