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

import com.aliyuncs.sofa.model.v20190815.BatchqueryLinkeBahamutCloudtenantResponse;
import com.aliyuncs.sofa.model.v20190815.BatchqueryLinkeBahamutCloudtenantResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchqueryLinkeBahamutCloudtenantResponseUnmarshaller {

	public static BatchqueryLinkeBahamutCloudtenantResponse unmarshall(BatchqueryLinkeBahamutCloudtenantResponse batchqueryLinkeBahamutCloudtenantResponse, UnmarshallerContext _ctx) {
		
		batchqueryLinkeBahamutCloudtenantResponse.setRequestId(_ctx.stringValue("BatchqueryLinkeBahamutCloudtenantResponse.RequestId"));
		batchqueryLinkeBahamutCloudtenantResponse.setResultCode(_ctx.stringValue("BatchqueryLinkeBahamutCloudtenantResponse.ResultCode"));
		batchqueryLinkeBahamutCloudtenantResponse.setResultMessage(_ctx.stringValue("BatchqueryLinkeBahamutCloudtenantResponse.ResultMessage"));
		batchqueryLinkeBahamutCloudtenantResponse.setErrorMessage(_ctx.stringValue("BatchqueryLinkeBahamutCloudtenantResponse.ErrorMessage"));
		batchqueryLinkeBahamutCloudtenantResponse.setMessage(_ctx.stringValue("BatchqueryLinkeBahamutCloudtenantResponse.Message"));
		batchqueryLinkeBahamutCloudtenantResponse.setSuccess(_ctx.booleanValue("BatchqueryLinkeBahamutCloudtenantResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchqueryLinkeBahamutCloudtenantResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccessKey(_ctx.stringValue("BatchqueryLinkeBahamutCloudtenantResponse.Result["+ i +"].AccessKey"));
			resultItem.setAccessSecret(_ctx.stringValue("BatchqueryLinkeBahamutCloudtenantResponse.Result["+ i +"].AccessSecret"));
			resultItem.setCreated(_ctx.longValue("BatchqueryLinkeBahamutCloudtenantResponse.Result["+ i +"].Created"));
			resultItem.setCustomerId(_ctx.stringValue("BatchqueryLinkeBahamutCloudtenantResponse.Result["+ i +"].CustomerId"));
			resultItem.setDeleted(_ctx.booleanValue("BatchqueryLinkeBahamutCloudtenantResponse.Result["+ i +"].Deleted"));
			resultItem.setEndPoint(_ctx.stringValue("BatchqueryLinkeBahamutCloudtenantResponse.Result["+ i +"].EndPoint"));
			resultItem.setId(_ctx.stringValue("BatchqueryLinkeBahamutCloudtenantResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("BatchqueryLinkeBahamutCloudtenantResponse.Result["+ i +"].LastModified"));
			resultItem.setLinkETenant(_ctx.stringValue("BatchqueryLinkeBahamutCloudtenantResponse.Result["+ i +"].LinkETenant"));
			resultItem.setStationName(_ctx.stringValue("BatchqueryLinkeBahamutCloudtenantResponse.Result["+ i +"].StationName"));
			resultItem.setTenantId(_ctx.stringValue("BatchqueryLinkeBahamutCloudtenantResponse.Result["+ i +"].TenantId"));
			resultItem.setTenantName(_ctx.stringValue("BatchqueryLinkeBahamutCloudtenantResponse.Result["+ i +"].TenantName"));
			resultItem.setToken(_ctx.stringValue("BatchqueryLinkeBahamutCloudtenantResponse.Result["+ i +"].Token"));

			result.add(resultItem);
		}
		batchqueryLinkeBahamutCloudtenantResponse.setResult(result);
	 
	 	return batchqueryLinkeBahamutCloudtenantResponse;
	}
}