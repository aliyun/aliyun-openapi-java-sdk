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

package com.aliyuncs.itag.transform.v20210517;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itag.model.v20210517.GetTaskSummaryResponse;
import com.aliyuncs.itag.model.v20210517.GetTaskSummaryResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetTaskSummaryResponse.Result.ITagBaseReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskSummaryResponseUnmarshaller {

	public static GetTaskSummaryResponse unmarshall(GetTaskSummaryResponse getTaskSummaryResponse, UnmarshallerContext _ctx) {
		
		getTaskSummaryResponse.setRequestId(_ctx.stringValue("GetTaskSummaryResponse.RequestId"));
		getTaskSummaryResponse.setCode(_ctx.stringValue("GetTaskSummaryResponse.Code"));
		getTaskSummaryResponse.setErrInfo(_ctx.stringValue("GetTaskSummaryResponse.ErrInfo"));
		getTaskSummaryResponse.setMsg(_ctx.stringValue("GetTaskSummaryResponse.Msg"));
		getTaskSummaryResponse.setSucc(_ctx.booleanValue("GetTaskSummaryResponse.Succ"));
		getTaskSummaryResponse.setErrorCode(_ctx.stringValue("GetTaskSummaryResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("GetTaskSummaryResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("GetTaskSummaryResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("GetTaskSummaryResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("GetTaskSummaryResponse.Result.TotalPage"));

		List<ITagBaseReportResponse> list = new ArrayList<ITagBaseReportResponse>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskSummaryResponse.Result.List.Length"); i++) {
			ITagBaseReportResponse iTagBaseReportResponse = new ITagBaseReportResponse();
			iTagBaseReportResponse.setTotalDisable(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].TotalDisable"));
			iTagBaseReportResponse.setUpdateTime(_ctx.stringValue("GetTaskSummaryResponse.Result.List["+ i +"].UpdateTime"));
			iTagBaseReportResponse.setSample(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].Sample"));
			iTagBaseReportResponse.setTotalMark(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].TotalMark"));
			iTagBaseReportResponse.setNoRejectMark(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].NoRejectMark"));
			iTagBaseReportResponse.setTotalChecked(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].TotalChecked"));
			iTagBaseReportResponse.setCheckedError(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].CheckedError"));
			iTagBaseReportResponse.setCheckedAccuracy(_ctx.doubleValue("GetTaskSummaryResponse.Result.List["+ i +"].CheckedAccuracy"));
			iTagBaseReportResponse.setCheckedReject(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].CheckedReject"));
			iTagBaseReportResponse.setCheckedFix(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].CheckedFix"));
			iTagBaseReportResponse.setTotalSampled(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].TotalSampled"));
			iTagBaseReportResponse.setSampledError(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].SampledError"));
			iTagBaseReportResponse.setSampledReject(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].SampledReject"));
			iTagBaseReportResponse.setSampledFix(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].SampledFix"));
			iTagBaseReportResponse.setSampledAccuracy(_ctx.doubleValue("GetTaskSummaryResponse.Result.List["+ i +"].SampledAccuracy"));
			iTagBaseReportResponse.setTotalSampling(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].TotalSampling"));
			iTagBaseReportResponse.setSamplingError(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].SamplingError"));
			iTagBaseReportResponse.setSamplingReject(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].SamplingReject"));
			iTagBaseReportResponse.setSamplingFix(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].SamplingFix"));
			iTagBaseReportResponse.setSamplingAccuracy(_ctx.doubleValue("GetTaskSummaryResponse.Result.List["+ i +"].SamplingAccuracy"));
			iTagBaseReportResponse.setTotalCheck(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].TotalCheck"));
			iTagBaseReportResponse.setNoRejectCheck(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].NoRejectCheck"));
			iTagBaseReportResponse.setCheckError(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].CheckError"));
			iTagBaseReportResponse.setCheckAccuracy(_ctx.doubleValue("GetTaskSummaryResponse.Result.List["+ i +"].CheckAccuracy"));
			iTagBaseReportResponse.setCheckReject(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].CheckReject"));
			iTagBaseReportResponse.setCheckFix(_ctx.integerValue("GetTaskSummaryResponse.Result.List["+ i +"].CheckFix"));
			iTagBaseReportResponse.setUserName(_ctx.stringValue("GetTaskSummaryResponse.Result.List["+ i +"].UserName"));
			iTagBaseReportResponse.setUserId(_ctx.stringValue("GetTaskSummaryResponse.Result.List["+ i +"].UserId"));
			iTagBaseReportResponse.setTaskId(_ctx.stringValue("GetTaskSummaryResponse.Result.List["+ i +"].TaskId"));
			iTagBaseReportResponse.setTaskName(_ctx.stringValue("GetTaskSummaryResponse.Result.List["+ i +"].TaskName"));
			iTagBaseReportResponse.setBizClassify(_ctx.stringValue("GetTaskSummaryResponse.Result.List["+ i +"].BizClassify"));
			iTagBaseReportResponse.setWorkflow(_ctx.stringValue("GetTaskSummaryResponse.Result.List["+ i +"].Workflow"));
			iTagBaseReportResponse.setWorkTime(_ctx.stringValue("GetTaskSummaryResponse.Result.List["+ i +"].WorkTime"));
			iTagBaseReportResponse.setTotalPDF(_ctx.longValue("GetTaskSummaryResponse.Result.List["+ i +"].TotalPDF"));
			iTagBaseReportResponse.setNoRejectPDF(_ctx.longValue("GetTaskSummaryResponse.Result.List["+ i +"].NoRejectPDF"));
			iTagBaseReportResponse.setTotalAudio(_ctx.longValue("GetTaskSummaryResponse.Result.List["+ i +"].TotalAudio"));
			iTagBaseReportResponse.setNoRejectAudio(_ctx.longValue("GetTaskSummaryResponse.Result.List["+ i +"].NoRejectAudio"));
			iTagBaseReportResponse.setTotalVideo(_ctx.longValue("GetTaskSummaryResponse.Result.List["+ i +"].TotalVideo"));
			iTagBaseReportResponse.setNoRejectVideo(_ctx.longValue("GetTaskSummaryResponse.Result.List["+ i +"].NoRejectVideo"));
			iTagBaseReportResponse.setMarkTime(_ctx.doubleValue("GetTaskSummaryResponse.Result.List["+ i +"].MarkTime"));
			iTagBaseReportResponse.setMarkEfficiency(_ctx.doubleValue("GetTaskSummaryResponse.Result.List["+ i +"].MarkEfficiency"));
			iTagBaseReportResponse.setCheckTime(_ctx.doubleValue("GetTaskSummaryResponse.Result.List["+ i +"].CheckTime"));
			iTagBaseReportResponse.setCheckEfficiency(_ctx.doubleValue("GetTaskSummaryResponse.Result.List["+ i +"].CheckEfficiency"));

			list.add(iTagBaseReportResponse);
		}
		result.setList(list);
		getTaskSummaryResponse.setResult(result);
	 
	 	return getTaskSummaryResponse;
	}
}