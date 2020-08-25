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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeLinklogAccountResponse;
import com.aliyuncs.sofa.model.v20190815.DeleteLinkeLinklogAccountResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeLinklogAccountResponseUnmarshaller {

	public static DeleteLinkeLinklogAccountResponse unmarshall(DeleteLinkeLinklogAccountResponse deleteLinkeLinklogAccountResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeLinklogAccountResponse.setRequestId(_ctx.stringValue("DeleteLinkeLinklogAccountResponse.RequestId"));
		deleteLinkeLinklogAccountResponse.setResultCode(_ctx.stringValue("DeleteLinkeLinklogAccountResponse.ResultCode"));
		deleteLinkeLinklogAccountResponse.setResultMessage(_ctx.stringValue("DeleteLinkeLinklogAccountResponse.ResultMessage"));
		deleteLinkeLinklogAccountResponse.setErrorMsg(_ctx.stringValue("DeleteLinkeLinklogAccountResponse.ErrorMsg"));
		deleteLinkeLinklogAccountResponse.setResponseContentRange(_ctx.stringValue("DeleteLinkeLinklogAccountResponse.ResponseContentRange"));
		deleteLinkeLinklogAccountResponse.setResponseContentType(_ctx.stringValue("DeleteLinkeLinklogAccountResponse.ResponseContentType"));
		deleteLinkeLinklogAccountResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeLinklogAccountResponse.ResponseStatusCode"));
		deleteLinkeLinklogAccountResponse.setSuccess(_ctx.booleanValue("DeleteLinkeLinklogAccountResponse.Success"));

		Result result = new Result();
		result.setBegin(_ctx.longValue("DeleteLinkeLinklogAccountResponse.Result.Begin"));
		result.setBeginMills(_ctx.longValue("DeleteLinkeLinklogAccountResponse.Result.BeginMills"));
		result.setCurrentPage(_ctx.longValue("DeleteLinkeLinklogAccountResponse.Result.CurrentPage"));
		result.setEmpId(_ctx.stringValue("DeleteLinkeLinklogAccountResponse.Result.EmpId"));
		result.setEnd(_ctx.longValue("DeleteLinkeLinklogAccountResponse.Result.End"));
		result.setEndMills(_ctx.longValue("DeleteLinkeLinklogAccountResponse.Result.EndMills"));
		result.setGmtCreate(_ctx.longValue("DeleteLinkeLinklogAccountResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("DeleteLinkeLinklogAccountResponse.Result.GmtModified"));
		result.setId(_ctx.longValue("DeleteLinkeLinklogAccountResponse.Result.Id"));
		result.setNick(_ctx.stringValue("DeleteLinkeLinklogAccountResponse.Result.Nick"));
		result.setPageSize(_ctx.longValue("DeleteLinkeLinklogAccountResponse.Result.PageSize"));
		result.setRole(_ctx.longValue("DeleteLinkeLinklogAccountResponse.Result.Role"));
		result.setRoleName(_ctx.stringValue("DeleteLinkeLinklogAccountResponse.Result.RoleName"));
		result.setSorter(_ctx.stringValue("DeleteLinkeLinklogAccountResponse.Result.Sorter"));

		List<String> stores = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeLinklogAccountResponse.Result.Stores.Length"); i++) {
			stores.add(_ctx.stringValue("DeleteLinkeLinklogAccountResponse.Result.Stores["+ i +"]"));
		}
		result.setStores(stores);

		List<Long> storeIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeLinklogAccountResponse.Result.StoreIds.Length"); i++) {
			storeIds.add(_ctx.longValue("DeleteLinkeLinklogAccountResponse.Result.StoreIds["+ i +"]"));
		}
		result.setStoreIds(storeIds);
		deleteLinkeLinklogAccountResponse.setResult(result);
	 
	 	return deleteLinkeLinklogAccountResponse;
	}
}