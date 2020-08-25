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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogAccountResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogAccountResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinklogAccountResponseUnmarshaller {

	public static GetLinkeLinklogAccountResponse unmarshall(GetLinkeLinklogAccountResponse getLinkeLinklogAccountResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinklogAccountResponse.setRequestId(_ctx.stringValue("GetLinkeLinklogAccountResponse.RequestId"));
		getLinkeLinklogAccountResponse.setResultCode(_ctx.stringValue("GetLinkeLinklogAccountResponse.ResultCode"));
		getLinkeLinklogAccountResponse.setResultMessage(_ctx.stringValue("GetLinkeLinklogAccountResponse.ResultMessage"));
		getLinkeLinklogAccountResponse.setErrorMsg(_ctx.stringValue("GetLinkeLinklogAccountResponse.ErrorMsg"));
		getLinkeLinklogAccountResponse.setResponseContentRange(_ctx.stringValue("GetLinkeLinklogAccountResponse.ResponseContentRange"));
		getLinkeLinklogAccountResponse.setResponseContentType(_ctx.stringValue("GetLinkeLinklogAccountResponse.ResponseContentType"));
		getLinkeLinklogAccountResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinklogAccountResponse.ResponseStatusCode"));
		getLinkeLinklogAccountResponse.setSuccess(_ctx.booleanValue("GetLinkeLinklogAccountResponse.Success"));

		Result result = new Result();
		result.setBegin(_ctx.longValue("GetLinkeLinklogAccountResponse.Result.Begin"));
		result.setBeginMills(_ctx.longValue("GetLinkeLinklogAccountResponse.Result.BeginMills"));
		result.setCurrentPage(_ctx.longValue("GetLinkeLinklogAccountResponse.Result.CurrentPage"));
		result.setEmpId(_ctx.stringValue("GetLinkeLinklogAccountResponse.Result.EmpId"));
		result.setEnd(_ctx.longValue("GetLinkeLinklogAccountResponse.Result.End"));
		result.setEndMills(_ctx.longValue("GetLinkeLinklogAccountResponse.Result.EndMills"));
		result.setGmtCreate(_ctx.longValue("GetLinkeLinklogAccountResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("GetLinkeLinklogAccountResponse.Result.GmtModified"));
		result.setId(_ctx.longValue("GetLinkeLinklogAccountResponse.Result.Id"));
		result.setNick(_ctx.stringValue("GetLinkeLinklogAccountResponse.Result.Nick"));
		result.setPageSize(_ctx.longValue("GetLinkeLinklogAccountResponse.Result.PageSize"));
		result.setRole(_ctx.longValue("GetLinkeLinklogAccountResponse.Result.Role"));
		result.setRoleName(_ctx.stringValue("GetLinkeLinklogAccountResponse.Result.RoleName"));
		result.setSorter(_ctx.stringValue("GetLinkeLinklogAccountResponse.Result.Sorter"));

		List<String> stores = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogAccountResponse.Result.Stores.Length"); i++) {
			stores.add(_ctx.stringValue("GetLinkeLinklogAccountResponse.Result.Stores["+ i +"]"));
		}
		result.setStores(stores);

		List<Long> storeIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogAccountResponse.Result.StoreIds.Length"); i++) {
			storeIds.add(_ctx.longValue("GetLinkeLinklogAccountResponse.Result.StoreIds["+ i +"]"));
		}
		result.setStoreIds(storeIds);
		getLinkeLinklogAccountResponse.setResult(result);
	 
	 	return getLinkeLinklogAccountResponse;
	}
}