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

import com.aliyuncs.sofa.model.v20190815.AddLinkeLinklogAccountResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinklogAccountResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeLinklogAccountResponseUnmarshaller {

	public static AddLinkeLinklogAccountResponse unmarshall(AddLinkeLinklogAccountResponse addLinkeLinklogAccountResponse, UnmarshallerContext _ctx) {
		
		addLinkeLinklogAccountResponse.setRequestId(_ctx.stringValue("AddLinkeLinklogAccountResponse.RequestId"));
		addLinkeLinklogAccountResponse.setResultCode(_ctx.stringValue("AddLinkeLinklogAccountResponse.ResultCode"));
		addLinkeLinklogAccountResponse.setResultMessage(_ctx.stringValue("AddLinkeLinklogAccountResponse.ResultMessage"));
		addLinkeLinklogAccountResponse.setErrorMsg(_ctx.stringValue("AddLinkeLinklogAccountResponse.ErrorMsg"));
		addLinkeLinklogAccountResponse.setResponseContentRange(_ctx.stringValue("AddLinkeLinklogAccountResponse.ResponseContentRange"));
		addLinkeLinklogAccountResponse.setResponseContentType(_ctx.stringValue("AddLinkeLinklogAccountResponse.ResponseContentType"));
		addLinkeLinklogAccountResponse.setResponseStatusCode(_ctx.longValue("AddLinkeLinklogAccountResponse.ResponseStatusCode"));
		addLinkeLinklogAccountResponse.setSuccess(_ctx.booleanValue("AddLinkeLinklogAccountResponse.Success"));

		Result result = new Result();
		result.setBegin(_ctx.longValue("AddLinkeLinklogAccountResponse.Result.Begin"));
		result.setBeginMills(_ctx.longValue("AddLinkeLinklogAccountResponse.Result.BeginMills"));
		result.setCurrentPage(_ctx.longValue("AddLinkeLinklogAccountResponse.Result.CurrentPage"));
		result.setEmpId(_ctx.stringValue("AddLinkeLinklogAccountResponse.Result.EmpId"));
		result.setEnd(_ctx.longValue("AddLinkeLinklogAccountResponse.Result.End"));
		result.setEndMills(_ctx.longValue("AddLinkeLinklogAccountResponse.Result.EndMills"));
		result.setGmtCreate(_ctx.longValue("AddLinkeLinklogAccountResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("AddLinkeLinklogAccountResponse.Result.GmtModified"));
		result.setId(_ctx.longValue("AddLinkeLinklogAccountResponse.Result.Id"));
		result.setNick(_ctx.stringValue("AddLinkeLinklogAccountResponse.Result.Nick"));
		result.setPageSize(_ctx.longValue("AddLinkeLinklogAccountResponse.Result.PageSize"));
		result.setRole(_ctx.longValue("AddLinkeLinklogAccountResponse.Result.Role"));
		result.setRoleName(_ctx.stringValue("AddLinkeLinklogAccountResponse.Result.RoleName"));
		result.setSorter(_ctx.stringValue("AddLinkeLinklogAccountResponse.Result.Sorter"));

		List<String> stores = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeLinklogAccountResponse.Result.Stores.Length"); i++) {
			stores.add(_ctx.stringValue("AddLinkeLinklogAccountResponse.Result.Stores["+ i +"]"));
		}
		result.setStores(stores);

		List<Long> storeIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeLinklogAccountResponse.Result.StoreIds.Length"); i++) {
			storeIds.add(_ctx.longValue("AddLinkeLinklogAccountResponse.Result.StoreIds["+ i +"]"));
		}
		result.setStoreIds(storeIds);
		addLinkeLinklogAccountResponse.setResult(result);
	 
	 	return addLinkeLinklogAccountResponse;
	}
}