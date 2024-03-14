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

package com.aliyuncs.mpaas.transform.v20200415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20200415.QueryMdsBatchUploadNebulaResourceResultResponse;
import com.aliyuncs.mpaas.model.v20200415.QueryMdsBatchUploadNebulaResourceResultResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20200415.QueryMdsBatchUploadNebulaResourceResultResponse.ResultContent.Data;
import com.aliyuncs.mpaas.model.v20200415.QueryMdsBatchUploadNebulaResourceResultResponse.ResultContent.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMdsBatchUploadNebulaResourceResultResponseUnmarshaller {

	public static QueryMdsBatchUploadNebulaResourceResultResponse unmarshall(QueryMdsBatchUploadNebulaResourceResultResponse queryMdsBatchUploadNebulaResourceResultResponse, UnmarshallerContext _ctx) {
		
		queryMdsBatchUploadNebulaResourceResultResponse.setRequestId(_ctx.stringValue("QueryMdsBatchUploadNebulaResourceResultResponse.RequestId"));
		queryMdsBatchUploadNebulaResourceResultResponse.setResultMessage(_ctx.stringValue("QueryMdsBatchUploadNebulaResourceResultResponse.ResultMessage"));
		queryMdsBatchUploadNebulaResourceResultResponse.setResultCode(_ctx.stringValue("QueryMdsBatchUploadNebulaResourceResultResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("QueryMdsBatchUploadNebulaResourceResultResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("QueryMdsBatchUploadNebulaResourceResultResponse.ResultContent.Data.RequestId"));
		data.setSuccess(_ctx.booleanValue("QueryMdsBatchUploadNebulaResourceResultResponse.ResultContent.Data.Success"));
		data.setResultMsg(_ctx.stringValue("QueryMdsBatchUploadNebulaResourceResultResponse.ResultContent.Data.ResultMsg"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMdsBatchUploadNebulaResourceResultResponse.ResultContent.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setSuccess(_ctx.booleanValue("QueryMdsBatchUploadNebulaResourceResultResponse.ResultContent.Data.Content["+ i +"].Success"));
			contentItem.setH5Id(_ctx.stringValue("QueryMdsBatchUploadNebulaResourceResultResponse.ResultContent.Data.Content["+ i +"].H5Id"));
			contentItem.setMessage(_ctx.stringValue("QueryMdsBatchUploadNebulaResourceResultResponse.ResultContent.Data.Content["+ i +"].Message"));
			contentItem.setH5Version(_ctx.stringValue("QueryMdsBatchUploadNebulaResourceResultResponse.ResultContent.Data.Content["+ i +"].H5Version"));
			contentItem.setUploadCode(_ctx.stringValue("QueryMdsBatchUploadNebulaResourceResultResponse.ResultContent.Data.Content["+ i +"].UploadCode"));
			contentItem.setOperator(_ctx.stringValue("QueryMdsBatchUploadNebulaResourceResultResponse.ResultContent.Data.Content["+ i +"].Operator"));
			contentItem.setId(_ctx.stringValue("QueryMdsBatchUploadNebulaResourceResultResponse.ResultContent.Data.Content["+ i +"].Id"));

			content.add(contentItem);
		}
		data.setContent(content);
		resultContent.setData(data);
		queryMdsBatchUploadNebulaResourceResultResponse.setResultContent(resultContent);
	 
	 	return queryMdsBatchUploadNebulaResourceResultResponse;
	}
}