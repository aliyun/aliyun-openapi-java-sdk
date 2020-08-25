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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeBahamutSearcharchdomainResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeBahamutSearcharchdomainResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeBahamutSearcharchdomainResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeBahamutSearcharchdomainResponseUnmarshaller {

	public static ExecLinkeBahamutSearcharchdomainResponse unmarshall(ExecLinkeBahamutSearcharchdomainResponse execLinkeBahamutSearcharchdomainResponse, UnmarshallerContext _ctx) {
		
		execLinkeBahamutSearcharchdomainResponse.setRequestId(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.RequestId"));
		execLinkeBahamutSearcharchdomainResponse.setResultCode(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.ResultCode"));
		execLinkeBahamutSearcharchdomainResponse.setResultMessage(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.ResultMessage"));
		execLinkeBahamutSearcharchdomainResponse.setErrorMessage(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.ErrorMessage"));
		execLinkeBahamutSearcharchdomainResponse.setErrorMsgParamsMap(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.ErrorMsgParamsMap"));
		execLinkeBahamutSearcharchdomainResponse.setMessage(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.Message"));
		execLinkeBahamutSearcharchdomainResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeBahamutSearcharchdomainResponse.ResponseStatusCode"));
		execLinkeBahamutSearcharchdomainResponse.setSuccess(_ctx.booleanValue("ExecLinkeBahamutSearcharchdomainResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("ExecLinkeBahamutSearcharchdomainResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("ExecLinkeBahamutSearcharchdomainResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("ExecLinkeBahamutSearcharchdomainResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("ExecLinkeBahamutSearcharchdomainResponse.Paginator.PageSize"));
		execLinkeBahamutSearcharchdomainResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeBahamutSearcharchdomainResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBakOwner(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].BakOwner"));
			resultItem.setBakTestOwner(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].BakTestOwner"));
			resultItem.setCreated(_ctx.longValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].Deleted"));
			resultItem.setDescription(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].Description"));
			resultItem.setExternalId(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].ExternalId"));
			resultItem.setId(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].LastModified"));
			resultItem.setLevel(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].Level"));
			resultItem.setName(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].Name"));
			resultItem.setOwner(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].Owner"));
			resultItem.setParentId(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].ParentId"));
			resultItem.setTenantId(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].TenantId"));
			resultItem.setTestOwner(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].TestOwner"));

			List<String> appMetaIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].AppMetaIds.Length"); j++) {
				appMetaIds.add(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].AppMetaIds["+ j +"]"));
			}
			resultItem.setAppMetaIds(appMetaIds);

			List<String> linkcGroups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].LinkcGroups.Length"); j++) {
				linkcGroups.add(_ctx.stringValue("ExecLinkeBahamutSearcharchdomainResponse.Result["+ i +"].LinkcGroups["+ j +"]"));
			}
			resultItem.setLinkcGroups(linkcGroups);

			result.add(resultItem);
		}
		execLinkeBahamutSearcharchdomainResponse.setResult(result);
	 
	 	return execLinkeBahamutSearcharchdomainResponse;
	}
}