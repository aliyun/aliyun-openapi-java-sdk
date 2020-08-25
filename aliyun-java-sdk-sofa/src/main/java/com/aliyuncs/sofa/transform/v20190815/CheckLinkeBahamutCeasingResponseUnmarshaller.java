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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutCeasingResponse;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutCeasingResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutCeasingResponseUnmarshaller {

	public static CheckLinkeBahamutCeasingResponse unmarshall(CheckLinkeBahamutCeasingResponse checkLinkeBahamutCeasingResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutCeasingResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutCeasingResponse.RequestId"));
		checkLinkeBahamutCeasingResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutCeasingResponse.ResultCode"));
		checkLinkeBahamutCeasingResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutCeasingResponse.ResultMessage"));
		checkLinkeBahamutCeasingResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutCeasingResponse.ErrorMessage"));
		checkLinkeBahamutCeasingResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutCeasingResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutCeasingResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutCeasingResponse.Message"));
		checkLinkeBahamutCeasingResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutCeasingResponse.ResponseStatusCode"));
		checkLinkeBahamutCeasingResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutCeasingResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeBahamutCeasingResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreated(_ctx.longValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].Deleted"));
			resultItem.setDescription(_ctx.stringValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].Description"));
			resultItem.setEndTime(_ctx.longValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].EndTime"));
			resultItem.setId(_ctx.stringValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].LastModified"));
			resultItem.setPreReleaseIncluded(_ctx.booleanValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].PreReleaseIncluded"));
			resultItem.setStartTime(_ctx.longValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].StartTime"));
			resultItem.setTenant(_ctx.stringValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].Tenant"));

			List<String> appBlackList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].AppBlackList.Length"); j++) {
				appBlackList.add(_ctx.stringValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].AppBlackList["+ j +"]"));
			}
			resultItem.setAppBlackList(appBlackList);

			List<String> appWhiteList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].AppWhiteList.Length"); j++) {
				appWhiteList.add(_ctx.stringValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].AppWhiteList["+ j +"]"));
			}
			resultItem.setAppWhiteList(appWhiteList);

			List<String> parentArchDomainBlackList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].ParentArchDomainBlackList.Length"); j++) {
				parentArchDomainBlackList.add(_ctx.stringValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].ParentArchDomainBlackList["+ j +"]"));
			}
			resultItem.setParentArchDomainBlackList(parentArchDomainBlackList);

			List<String> parentArchDomainWhiteList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].ParentArchDomainWhiteList.Length"); j++) {
				parentArchDomainWhiteList.add(_ctx.stringValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].ParentArchDomainWhiteList["+ j +"]"));
			}
			resultItem.setParentArchDomainWhiteList(parentArchDomainWhiteList);

			List<String> releaseBlackList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].ReleaseBlackList.Length"); j++) {
				releaseBlackList.add(_ctx.stringValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].ReleaseBlackList["+ j +"]"));
			}
			resultItem.setReleaseBlackList(releaseBlackList);

			List<String> releaseWhiteList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].ReleaseWhiteList.Length"); j++) {
				releaseWhiteList.add(_ctx.stringValue("CheckLinkeBahamutCeasingResponse.Result["+ i +"].ReleaseWhiteList["+ j +"]"));
			}
			resultItem.setReleaseWhiteList(releaseWhiteList);

			result.add(resultItem);
		}
		checkLinkeBahamutCeasingResponse.setResult(result);
	 
	 	return checkLinkeBahamutCeasingResponse;
	}
}