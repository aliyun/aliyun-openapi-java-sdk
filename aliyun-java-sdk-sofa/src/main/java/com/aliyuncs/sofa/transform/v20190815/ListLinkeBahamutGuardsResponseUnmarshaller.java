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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutGuardsResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutGuardsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutGuardsResponseUnmarshaller {

	public static ListLinkeBahamutGuardsResponse unmarshall(ListLinkeBahamutGuardsResponse listLinkeBahamutGuardsResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutGuardsResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutGuardsResponse.RequestId"));
		listLinkeBahamutGuardsResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutGuardsResponse.ResultCode"));
		listLinkeBahamutGuardsResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutGuardsResponse.ResultMessage"));
		listLinkeBahamutGuardsResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutGuardsResponse.ErrorMessage"));
		listLinkeBahamutGuardsResponse.setMessage(_ctx.stringValue("ListLinkeBahamutGuardsResponse.Message"));
		listLinkeBahamutGuardsResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutGuardsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutGuardsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreated(_ctx.longValue("ListLinkeBahamutGuardsResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("ListLinkeBahamutGuardsResponse.Result["+ i +"].Deleted"));
			resultItem.setDescription(_ctx.stringValue("ListLinkeBahamutGuardsResponse.Result["+ i +"].Description"));
			resultItem.setExpression(_ctx.stringValue("ListLinkeBahamutGuardsResponse.Result["+ i +"].Expression"));
			resultItem.setId(_ctx.stringValue("ListLinkeBahamutGuardsResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("ListLinkeBahamutGuardsResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("ListLinkeBahamutGuardsResponse.Result["+ i +"].Name"));
			resultItem.setTenantId(_ctx.stringValue("ListLinkeBahamutGuardsResponse.Result["+ i +"].TenantId"));

			result.add(resultItem);
		}
		listLinkeBahamutGuardsResponse.setResult(result);
	 
	 	return listLinkeBahamutGuardsResponse;
	}
}