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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomainappsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomainappsResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutArchdomainappsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutArchdomainappsResponseUnmarshaller {

	public static GetLinkeBahamutArchdomainappsResponse unmarshall(GetLinkeBahamutArchdomainappsResponse getLinkeBahamutArchdomainappsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutArchdomainappsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.RequestId"));
		getLinkeBahamutArchdomainappsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.ResultCode"));
		getLinkeBahamutArchdomainappsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.ResultMessage"));
		getLinkeBahamutArchdomainappsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.ErrorMessage"));
		getLinkeBahamutArchdomainappsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutArchdomainappsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.Message"));
		getLinkeBahamutArchdomainappsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutArchdomainappsResponse.ResponseStatusCode"));
		getLinkeBahamutArchdomainappsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutArchdomainappsResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("GetLinkeBahamutArchdomainappsResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("GetLinkeBahamutArchdomainappsResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("GetLinkeBahamutArchdomainappsResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("GetLinkeBahamutArchdomainappsResponse.Paginator.PageSize"));
		getLinkeBahamutArchdomainappsResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutArchdomainappsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppGroupName(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.Result["+ i +"].AppGroupName"));
			resultItem.setAppType(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.Result["+ i +"].AppType"));
			resultItem.setFirstArchDomain(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.Result["+ i +"].FirstArchDomain"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.Result["+ i +"].Id"));
			resultItem.setLevel(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.Result["+ i +"].Level"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.Result["+ i +"].Name"));
			resultItem.setRecentLiveTime(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.Result["+ i +"].RecentLiveTime"));
			resultItem.setSecondArchDomain(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.Result["+ i +"].SecondArchDomain"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.Result["+ i +"].Status"));

			List<String> owners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutArchdomainappsResponse.Result["+ i +"].Owners.Length"); j++) {
				owners.add(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.Result["+ i +"].Owners["+ j +"]"));
			}
			resultItem.setOwners(owners);

			List<String> ownerObjs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutArchdomainappsResponse.Result["+ i +"].OwnerObjs.Length"); j++) {
				ownerObjs.add(_ctx.stringValue("GetLinkeBahamutArchdomainappsResponse.Result["+ i +"].OwnerObjs["+ j +"]"));
			}
			resultItem.setOwnerObjs(ownerObjs);

			result.add(resultItem);
		}
		getLinkeBahamutArchdomainappsResponse.setResult(result);
	 
	 	return getLinkeBahamutArchdomainappsResponse;
	}
}