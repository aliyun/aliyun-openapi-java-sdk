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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetStructSyncJobAnalyzeResultResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetStructSyncJobAnalyzeResultResponse.StructSyncJobAnalyzeResult;
import com.aliyuncs.dms_enterprise.model.v20181101.GetStructSyncJobAnalyzeResultResponse.StructSyncJobAnalyzeResult.Result;
import com.aliyuncs.dms_enterprise.model.v20181101.GetStructSyncJobAnalyzeResultResponse.StructSyncJobAnalyzeResult.Summary;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStructSyncJobAnalyzeResultResponseUnmarshaller {

	public static GetStructSyncJobAnalyzeResultResponse unmarshall(GetStructSyncJobAnalyzeResultResponse getStructSyncJobAnalyzeResultResponse, UnmarshallerContext _ctx) {
		
		getStructSyncJobAnalyzeResultResponse.setRequestId(_ctx.stringValue("GetStructSyncJobAnalyzeResultResponse.RequestId"));
		getStructSyncJobAnalyzeResultResponse.setSuccess(_ctx.booleanValue("GetStructSyncJobAnalyzeResultResponse.Success"));
		getStructSyncJobAnalyzeResultResponse.setErrorMessage(_ctx.stringValue("GetStructSyncJobAnalyzeResultResponse.ErrorMessage"));
		getStructSyncJobAnalyzeResultResponse.setErrorCode(_ctx.stringValue("GetStructSyncJobAnalyzeResultResponse.ErrorCode"));

		StructSyncJobAnalyzeResult structSyncJobAnalyzeResult = new StructSyncJobAnalyzeResult();

		List<Summary> summaryList = new ArrayList<Summary>();
		for (int i = 0; i < _ctx.lengthValue("GetStructSyncJobAnalyzeResultResponse.StructSyncJobAnalyzeResult.SummaryList.Length"); i++) {
			Summary summary = new Summary();
			summary.setCompareType(_ctx.stringValue("GetStructSyncJobAnalyzeResultResponse.StructSyncJobAnalyzeResult.SummaryList["+ i +"].CompareType"));
			summary.setCount(_ctx.longValue("GetStructSyncJobAnalyzeResultResponse.StructSyncJobAnalyzeResult.SummaryList["+ i +"].Count"));

			summaryList.add(summary);
		}
		structSyncJobAnalyzeResult.setSummaryList(summaryList);

		List<Result> resultList = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("GetStructSyncJobAnalyzeResultResponse.StructSyncJobAnalyzeResult.ResultList.Length"); i++) {
			Result result = new Result();
			result.setSourceTableName(_ctx.stringValue("GetStructSyncJobAnalyzeResultResponse.StructSyncJobAnalyzeResult.ResultList["+ i +"].SourceTableName"));
			result.setTargetTableName(_ctx.stringValue("GetStructSyncJobAnalyzeResultResponse.StructSyncJobAnalyzeResult.ResultList["+ i +"].TargetTableName"));
			result.setScript(_ctx.stringValue("GetStructSyncJobAnalyzeResultResponse.StructSyncJobAnalyzeResult.ResultList["+ i +"].Script"));

			resultList.add(result);
		}
		structSyncJobAnalyzeResult.setResultList(resultList);
		getStructSyncJobAnalyzeResultResponse.setStructSyncJobAnalyzeResult(structSyncJobAnalyzeResult);
	 
	 	return getStructSyncJobAnalyzeResultResponse;
	}
}