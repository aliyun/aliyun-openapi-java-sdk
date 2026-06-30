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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetOperationRecordDetailResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetOperationRecordDetailResponse.OperationRecordDetailResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetOperationRecordDetailResponse.OperationRecordDetailResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOperationRecordDetailResponseUnmarshaller {

	public static GetOperationRecordDetailResponse unmarshall(GetOperationRecordDetailResponse getOperationRecordDetailResponse, UnmarshallerContext _ctx) {
		
		getOperationRecordDetailResponse.setRequestId(_ctx.stringValue("GetOperationRecordDetailResponse.RequestId"));
		getOperationRecordDetailResponse.setSuccess(_ctx.booleanValue("GetOperationRecordDetailResponse.Success"));
		getOperationRecordDetailResponse.setHttpStatusCode(_ctx.integerValue("GetOperationRecordDetailResponse.HttpStatusCode"));
		getOperationRecordDetailResponse.setCode(_ctx.stringValue("GetOperationRecordDetailResponse.Code"));
		getOperationRecordDetailResponse.setMessage(_ctx.stringValue("GetOperationRecordDetailResponse.Message"));

		OperationRecordDetailResponse operationRecordDetailResponse = new OperationRecordDetailResponse();
		operationRecordDetailResponse.setOperationId(_ctx.stringValue("GetOperationRecordDetailResponse.OperationRecordDetailResponse.OperationId"));
		operationRecordDetailResponse.setLogContent(_ctx.stringValue("GetOperationRecordDetailResponse.OperationRecordDetailResponse.LogContent"));
		operationRecordDetailResponse.setFileId(_ctx.longValue("GetOperationRecordDetailResponse.OperationRecordDetailResponse.FileId"));

		List<ResultItem> results = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOperationRecordDetailResponse.OperationRecordDetailResponse.Results.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setResult(_ctx.stringValue("GetOperationRecordDetailResponse.OperationRecordDetailResponse.Results["+ i +"].Result"));
			resultItem.setIndex(_ctx.integerValue("GetOperationRecordDetailResponse.OperationRecordDetailResponse.Results["+ i +"].Index"));
			resultItem.setTitle(_ctx.stringValue("GetOperationRecordDetailResponse.OperationRecordDetailResponse.Results["+ i +"].Title"));
			resultItem.setSql(_ctx.stringValue("GetOperationRecordDetailResponse.OperationRecordDetailResponse.Results["+ i +"].Sql"));
			resultItem.setTaskId(_ctx.stringValue("GetOperationRecordDetailResponse.OperationRecordDetailResponse.Results["+ i +"].TaskId"));

			results.add(resultItem);
		}
		operationRecordDetailResponse.setResults(results);
		getOperationRecordDetailResponse.setOperationRecordDetailResponse(operationRecordDetailResponse);
	 
	 	return getOperationRecordDetailResponse;
	}
}