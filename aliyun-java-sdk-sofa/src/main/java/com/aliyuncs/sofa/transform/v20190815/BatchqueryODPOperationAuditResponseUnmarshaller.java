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

import com.aliyuncs.sofa.model.v20190815.BatchqueryODPOperationAuditResponse;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPOperationAuditResponse.Data;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPOperationAuditResponse.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchqueryODPOperationAuditResponseUnmarshaller {

	public static BatchqueryODPOperationAuditResponse unmarshall(BatchqueryODPOperationAuditResponse batchqueryODPOperationAuditResponse, UnmarshallerContext _ctx) {
		
		batchqueryODPOperationAuditResponse.setRequestId(_ctx.stringValue("BatchqueryODPOperationAuditResponse.RequestId"));
		batchqueryODPOperationAuditResponse.setResultCode(_ctx.stringValue("BatchqueryODPOperationAuditResponse.ResultCode"));
		batchqueryODPOperationAuditResponse.setResultMessage(_ctx.stringValue("BatchqueryODPOperationAuditResponse.ResultMessage"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("BatchqueryODPOperationAuditResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("BatchqueryODPOperationAuditResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("BatchqueryODPOperationAuditResponse.Data.Total"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchqueryODPOperationAuditResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setAliyunMasterId(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].AliyunMasterId"));
			contentItem.setEnvMode(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].EnvMode"));
			contentItem.setEnvTenant(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].EnvTenant"));
			contentItem.setGmtCreate(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].GmtCreate"));
			contentItem.setGmtModified(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].GmtModified"));
			contentItem.setInvokeType(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].InvokeType"));
			contentItem.setOpenApiName(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].OpenApiName"));
			contentItem.setOperationDescription(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].OperationDescription"));
			contentItem.setOperationType(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].OperationType"));
			contentItem.setParams(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].Params"));
			contentItem.setProductInstanceId(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].ProductInstanceId"));
			contentItem.setRequestId(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].RequestId"));
			contentItem.setResultCode(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].ResultCode"));
			contentItem.setResultMsg(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].ResultMsg"));
			contentItem.setUserId(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].UserId"));
			contentItem.setUserName(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].UserName"));
			contentItem.setUserType(_ctx.stringValue("BatchqueryODPOperationAuditResponse.Data.Content["+ i +"].UserType"));

			content.add(contentItem);
		}
		data.setContent(content);
		batchqueryODPOperationAuditResponse.setData(data);
	 
	 	return batchqueryODPOperationAuditResponse;
	}
}