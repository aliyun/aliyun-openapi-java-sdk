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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinklogAccountResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinklogAccountResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinklogAccountResponseUnmarshaller {

	public static UpdateLinkeLinklogAccountResponse unmarshall(UpdateLinkeLinklogAccountResponse updateLinkeLinklogAccountResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinklogAccountResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinklogAccountResponse.RequestId"));
		updateLinkeLinklogAccountResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinklogAccountResponse.ResultCode"));
		updateLinkeLinklogAccountResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinklogAccountResponse.ResultMessage"));
		updateLinkeLinklogAccountResponse.setErrorMsg(_ctx.stringValue("UpdateLinkeLinklogAccountResponse.ErrorMsg"));
		updateLinkeLinklogAccountResponse.setResponseContentRange(_ctx.stringValue("UpdateLinkeLinklogAccountResponse.ResponseContentRange"));
		updateLinkeLinklogAccountResponse.setResponseContentType(_ctx.stringValue("UpdateLinkeLinklogAccountResponse.ResponseContentType"));
		updateLinkeLinklogAccountResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinklogAccountResponse.ResponseStatusCode"));
		updateLinkeLinklogAccountResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinklogAccountResponse.Success"));

		Result result = new Result();
		result.setBegin(_ctx.longValue("UpdateLinkeLinklogAccountResponse.Result.Begin"));
		result.setBeginMills(_ctx.longValue("UpdateLinkeLinklogAccountResponse.Result.BeginMills"));
		result.setCurrentPage(_ctx.longValue("UpdateLinkeLinklogAccountResponse.Result.CurrentPage"));
		result.setEmpId(_ctx.stringValue("UpdateLinkeLinklogAccountResponse.Result.EmpId"));
		result.setEnd(_ctx.longValue("UpdateLinkeLinklogAccountResponse.Result.End"));
		result.setEndMills(_ctx.longValue("UpdateLinkeLinklogAccountResponse.Result.EndMills"));
		result.setGmtCreate(_ctx.longValue("UpdateLinkeLinklogAccountResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("UpdateLinkeLinklogAccountResponse.Result.GmtModified"));
		result.setId(_ctx.longValue("UpdateLinkeLinklogAccountResponse.Result.Id"));
		result.setNick(_ctx.stringValue("UpdateLinkeLinklogAccountResponse.Result.Nick"));
		result.setPageSize(_ctx.longValue("UpdateLinkeLinklogAccountResponse.Result.PageSize"));
		result.setRole(_ctx.longValue("UpdateLinkeLinklogAccountResponse.Result.Role"));
		result.setRoleName(_ctx.stringValue("UpdateLinkeLinklogAccountResponse.Result.RoleName"));
		result.setSorter(_ctx.stringValue("UpdateLinkeLinklogAccountResponse.Result.Sorter"));

		List<String> stores = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinklogAccountResponse.Result.Stores.Length"); i++) {
			stores.add(_ctx.stringValue("UpdateLinkeLinklogAccountResponse.Result.Stores["+ i +"]"));
		}
		result.setStores(stores);

		List<Long> storeIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinklogAccountResponse.Result.StoreIds.Length"); i++) {
			storeIds.add(_ctx.longValue("UpdateLinkeLinklogAccountResponse.Result.StoreIds["+ i +"]"));
		}
		result.setStoreIds(storeIds);
		updateLinkeLinklogAccountResponse.setResult(result);
	 
	 	return updateLinkeLinklogAccountResponse;
	}
}