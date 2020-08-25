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

import com.aliyuncs.sofa.model.v20190815.QueryCasTaskLogResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasTaskLogResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryCasTaskLogResponse.DataItem.IaasErrorInfo;
import com.aliyuncs.sofa.model.v20190815.QueryCasTaskLogResponse.DataItem.IaasRequest;
import com.aliyuncs.sofa.model.v20190815.QueryCasTaskLogResponse.DataItem.IaasRequest.RequestHeadersItem;
import com.aliyuncs.sofa.model.v20190815.QueryCasTaskLogResponse.DataItem.IaasResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasTaskLogResponse.DataItem.IaasResponse.ResponseHeadersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCasTaskLogResponseUnmarshaller {

	public static QueryCasTaskLogResponse unmarshall(QueryCasTaskLogResponse queryCasTaskLogResponse, UnmarshallerContext _ctx) {
		
		queryCasTaskLogResponse.setRequestId(_ctx.stringValue("QueryCasTaskLogResponse.RequestId"));
		queryCasTaskLogResponse.setResultCode(_ctx.stringValue("QueryCasTaskLogResponse.ResultCode"));
		queryCasTaskLogResponse.setResultMessage(_ctx.stringValue("QueryCasTaskLogResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCasTaskLogResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setHost(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].Host"));
			dataItem.setLogTime(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].LogTime"));
			dataItem.setMessage(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].Message"));
			dataItem.setResourceId(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].ResourceId"));
			dataItem.setResourceType(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].ResourceType"));
			dataItem.setSeverity(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].Severity"));
			dataItem.setSource(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].Source"));
			dataItem.setTaskId(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].TaskId"));
			dataItem.setTaskTimes(_ctx.longValue("QueryCasTaskLogResponse.Data["+ i +"].TaskTimes"));
			dataItem.setType(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].Type"));

			IaasErrorInfo iaasErrorInfo = new IaasErrorInfo();
			iaasErrorInfo.setErrorCode(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].IaasErrorInfo.ErrorCode"));
			iaasErrorInfo.setErrorMessage(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].IaasErrorInfo.ErrorMessage"));
			iaasErrorInfo.setHostId(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].IaasErrorInfo.HostId"));
			iaasErrorInfo.setRequestId(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].IaasErrorInfo.RequestId"));
			iaasErrorInfo.setStatusCode(_ctx.longValue("QueryCasTaskLogResponse.Data["+ i +"].IaasErrorInfo.StatusCode"));
			dataItem.setIaasErrorInfo(iaasErrorInfo);

			IaasRequest iaasRequest = new IaasRequest();
			iaasRequest.setRequestBody(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].IaasRequest.RequestBody"));
			iaasRequest.setRequestMethod(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].IaasRequest.RequestMethod"));
			iaasRequest.setRequestUrl(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].IaasRequest.RequestUrl"));

			List<RequestHeadersItem> requestHeaders = new ArrayList<RequestHeadersItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasTaskLogResponse.Data["+ i +"].IaasRequest.RequestHeaders.Length"); j++) {
				RequestHeadersItem requestHeadersItem = new RequestHeadersItem();
				requestHeadersItem.setKey(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].IaasRequest.RequestHeaders["+ j +"].Key"));
				requestHeadersItem.setValue(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].IaasRequest.RequestHeaders["+ j +"].Value"));

				requestHeaders.add(requestHeadersItem);
			}
			iaasRequest.setRequestHeaders(requestHeaders);
			dataItem.setIaasRequest(iaasRequest);

			IaasResponse iaasResponse = new IaasResponse();
			iaasResponse.setResponseBody(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].IaasResponse.ResponseBody"));

			List<ResponseHeadersItem> responseHeaders = new ArrayList<ResponseHeadersItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasTaskLogResponse.Data["+ i +"].IaasResponse.ResponseHeaders.Length"); j++) {
				ResponseHeadersItem responseHeadersItem = new ResponseHeadersItem();
				responseHeadersItem.setKey(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].IaasResponse.ResponseHeaders["+ j +"].Key"));
				responseHeadersItem.setValue(_ctx.stringValue("QueryCasTaskLogResponse.Data["+ i +"].IaasResponse.ResponseHeaders["+ j +"].Value"));

				responseHeaders.add(responseHeadersItem);
			}
			iaasResponse.setResponseHeaders(responseHeaders);
			dataItem.setIaasResponse(iaasResponse);

			data.add(dataItem);
		}
		queryCasTaskLogResponse.setData(data);
	 
	 	return queryCasTaskLogResponse;
	}
}