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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAppcustomciconfigResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAppcustomciconfigResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutAppcustomciconfigResponseUnmarshaller {

	public static ListLinkeBahamutAppcustomciconfigResponse unmarshall(ListLinkeBahamutAppcustomciconfigResponse listLinkeBahamutAppcustomciconfigResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutAppcustomciconfigResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutAppcustomciconfigResponse.RequestId"));
		listLinkeBahamutAppcustomciconfigResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutAppcustomciconfigResponse.ResultCode"));
		listLinkeBahamutAppcustomciconfigResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutAppcustomciconfigResponse.ResultMessage"));
		listLinkeBahamutAppcustomciconfigResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutAppcustomciconfigResponse.ErrorMessage"));
		listLinkeBahamutAppcustomciconfigResponse.setErrorMsgParamsMap(_ctx.stringValue("ListLinkeBahamutAppcustomciconfigResponse.ErrorMsgParamsMap"));
		listLinkeBahamutAppcustomciconfigResponse.setMessage(_ctx.stringValue("ListLinkeBahamutAppcustomciconfigResponse.Message"));
		listLinkeBahamutAppcustomciconfigResponse.setResponseStatusCode(_ctx.longValue("ListLinkeBahamutAppcustomciconfigResponse.ResponseStatusCode"));
		listLinkeBahamutAppcustomciconfigResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutAppcustomciconfigResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutAppcustomciconfigResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppId(_ctx.stringValue("ListLinkeBahamutAppcustomciconfigResponse.Result["+ i +"].AppId"));
			resultItem.setBranch(_ctx.stringValue("ListLinkeBahamutAppcustomciconfigResponse.Result["+ i +"].Branch"));
			resultItem.setCreated(_ctx.longValue("ListLinkeBahamutAppcustomciconfigResponse.Result["+ i +"].Created"));
			resultItem.setCrontab(_ctx.stringValue("ListLinkeBahamutAppcustomciconfigResponse.Result["+ i +"].Crontab"));
			resultItem.setDeleted(_ctx.booleanValue("ListLinkeBahamutAppcustomciconfigResponse.Result["+ i +"].Deleted"));
			resultItem.setId(_ctx.stringValue("ListLinkeBahamutAppcustomciconfigResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("ListLinkeBahamutAppcustomciconfigResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("ListLinkeBahamutAppcustomciconfigResponse.Result["+ i +"].Name"));
			resultItem.setPipelineInstanceId(_ctx.longValue("ListLinkeBahamutAppcustomciconfigResponse.Result["+ i +"].PipelineInstanceId"));
			resultItem.setPipelineTemplateId(_ctx.longValue("ListLinkeBahamutAppcustomciconfigResponse.Result["+ i +"].PipelineTemplateId"));
			resultItem.setPipelineTemplateName(_ctx.stringValue("ListLinkeBahamutAppcustomciconfigResponse.Result["+ i +"].PipelineTemplateName"));
			resultItem.setTenantId(_ctx.stringValue("ListLinkeBahamutAppcustomciconfigResponse.Result["+ i +"].TenantId"));

			result.add(resultItem);
		}
		listLinkeBahamutAppcustomciconfigResponse.setResult(result);
	 
	 	return listLinkeBahamutAppcustomciconfigResponse;
	}
}