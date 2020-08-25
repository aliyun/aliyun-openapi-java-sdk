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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAllarchdomainsfromlinkmResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAllarchdomainsfromlinkmResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutAllarchdomainsfromlinkmResponseUnmarshaller {

	public static ListLinkeBahamutAllarchdomainsfromlinkmResponse unmarshall(ListLinkeBahamutAllarchdomainsfromlinkmResponse listLinkeBahamutAllarchdomainsfromlinkmResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutAllarchdomainsfromlinkmResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.RequestId"));
		listLinkeBahamutAllarchdomainsfromlinkmResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.ResultCode"));
		listLinkeBahamutAllarchdomainsfromlinkmResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.ResultMessage"));
		listLinkeBahamutAllarchdomainsfromlinkmResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.ErrorMessage"));
		listLinkeBahamutAllarchdomainsfromlinkmResponse.setErrorMsgParamsMap(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.ErrorMsgParamsMap"));
		listLinkeBahamutAllarchdomainsfromlinkmResponse.setMessage(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Message"));
		listLinkeBahamutAllarchdomainsfromlinkmResponse.setResponseStatusCode(_ctx.longValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.ResponseStatusCode"));
		listLinkeBahamutAllarchdomainsfromlinkmResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBakOwner(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].BakOwner"));
			resultItem.setBakTestOwner(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].BakTestOwner"));
			resultItem.setCreated(_ctx.longValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].Deleted"));
			resultItem.setDescription(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].Description"));
			resultItem.setExternalId(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].ExternalId"));
			resultItem.setId(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].LastModified"));
			resultItem.setLevel(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].Level"));
			resultItem.setName(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].Name"));
			resultItem.setOwner(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].Owner"));
			resultItem.setParentId(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].ParentId"));
			resultItem.setTenantId(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].TenantId"));
			resultItem.setTestOwner(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].TestOwner"));

			List<String> appMetaIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].AppMetaIds.Length"); j++) {
				appMetaIds.add(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].AppMetaIds["+ j +"]"));
			}
			resultItem.setAppMetaIds(appMetaIds);

			List<String> linkcGroups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].LinkcGroups.Length"); j++) {
				linkcGroups.add(_ctx.stringValue("ListLinkeBahamutAllarchdomainsfromlinkmResponse.Result["+ i +"].LinkcGroups["+ j +"]"));
			}
			resultItem.setLinkcGroups(linkcGroups);

			result.add(resultItem);
		}
		listLinkeBahamutAllarchdomainsfromlinkmResponse.setResult(result);
	 
	 	return listLinkeBahamutAllarchdomainsfromlinkmResponse;
	}
}