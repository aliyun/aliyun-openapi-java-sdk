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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutOpengetlterationbytimeResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutOpengetlterationbytimeResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutOpengetlterationbytimeResponseUnmarshaller {

	public static GetLinkeBahamutOpengetlterationbytimeResponse unmarshall(GetLinkeBahamutOpengetlterationbytimeResponse getLinkeBahamutOpengetlterationbytimeResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutOpengetlterationbytimeResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutOpengetlterationbytimeResponse.RequestId"));
		getLinkeBahamutOpengetlterationbytimeResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutOpengetlterationbytimeResponse.ResultCode"));
		getLinkeBahamutOpengetlterationbytimeResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutOpengetlterationbytimeResponse.ResultMessage"));
		getLinkeBahamutOpengetlterationbytimeResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutOpengetlterationbytimeResponse.ErrorMessage"));
		getLinkeBahamutOpengetlterationbytimeResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutOpengetlterationbytimeResponse.ErrorMsgParamsMap"));
		getLinkeBahamutOpengetlterationbytimeResponse.setMessage(_ctx.stringValue("GetLinkeBahamutOpengetlterationbytimeResponse.Message"));
		getLinkeBahamutOpengetlterationbytimeResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutOpengetlterationbytimeResponse.ResponseStatusCode"));
		getLinkeBahamutOpengetlterationbytimeResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutOpengetlterationbytimeResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutOpengetlterationbytimeResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreateTime(_ctx.longValue("GetLinkeBahamutOpengetlterationbytimeResponse.Result["+ i +"].CreateTime"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutOpengetlterationbytimeResponse.Result["+ i +"].Creator"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutOpengetlterationbytimeResponse.Result["+ i +"].ExternalId"));
			resultItem.setFinished(_ctx.booleanValue("GetLinkeBahamutOpengetlterationbytimeResponse.Result["+ i +"].Finished"));
			resultItem.setModifyTime(_ctx.longValue("GetLinkeBahamutOpengetlterationbytimeResponse.Result["+ i +"].ModifyTime"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutOpengetlterationbytimeResponse.Result["+ i +"].Name"));
			resultItem.setReleaseId(_ctx.stringValue("GetLinkeBahamutOpengetlterationbytimeResponse.Result["+ i +"].ReleaseId"));
			resultItem.setTenantPath(_ctx.stringValue("GetLinkeBahamutOpengetlterationbytimeResponse.Result["+ i +"].TenantPath"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutOpengetlterationbytimeResponse.Result["+ i +"].Type"));

			List<String> apps = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutOpengetlterationbytimeResponse.Result["+ i +"].Apps.Length"); j++) {
				apps.add(_ctx.stringValue("GetLinkeBahamutOpengetlterationbytimeResponse.Result["+ i +"].Apps["+ j +"]"));
			}
			resultItem.setApps(apps);

			result.add(resultItem);
		}
		getLinkeBahamutOpengetlterationbytimeResponse.setResult(result);
	 
	 	return getLinkeBahamutOpengetlterationbytimeResponse;
	}
}