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

import com.aliyuncs.itag.model.v20210517.GetTaskPersonSummaryResponse;
import com.aliyuncs.itag.model.v20210517.GetTaskPersonSummaryResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetTaskPersonSummaryResponse.Result.ITagBaseReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskPersonSummaryResponseUnmarshaller {

	public static GetTaskPersonSummaryResponse unmarshall(GetTaskPersonSummaryResponse getTaskPersonSummaryResponse, UnmarshallerContext _ctx) {
		
		getTaskPersonSummaryResponse.setRequestId(_ctx.stringValue("GetTaskPersonSummaryResponse.RequestId"));
		getTaskPersonSummaryResponse.setCode(_ctx.stringValue("GetTaskPersonSummaryResponse.Code"));
		getTaskPersonSummaryResponse.setErrInfo(_ctx.stringValue("GetTaskPersonSummaryResponse.ErrInfo"));
		getTaskPersonSummaryResponse.setMsg(_ctx.stringValue("GetTaskPersonSummaryResponse.Msg"));
		getTaskPersonSummaryResponse.setSucc(_ctx.booleanValue("GetTaskPersonSummaryResponse.Succ"));
		getTaskPersonSummaryResponse.setErrorCode(_ctx.stringValue("GetTaskPersonSummaryResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("GetTaskPersonSummaryResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("GetTaskPersonSummaryResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("GetTaskPersonSummaryResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("GetTaskPersonSummaryResponse.Result.TotalPage"));

		List<ITagBaseReportResponse> list = new ArrayList<ITagBaseReportResponse>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskPersonSummaryResponse.Result.List.Length"); i++) {
			ITagBaseReportResponse iTagBaseReportResponse = new ITagBaseReportResponse();
			iTagBaseReportResponse.setTotalDisable(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].TotalDisable"));
			iTagBaseReportResponse.setUpdateTime(_ctx.stringValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].UpdateTime"));
			iTagBaseReportResponse.setSample(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].Sample"));
			iTagBaseReportResponse.setTotalMark(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].TotalMark"));
			iTagBaseReportResponse.setNoRejectMark(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].NoRejectMark"));
			iTagBaseReportResponse.setTotalChecked(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].TotalChecked"));
			iTagBaseReportResponse.setCheckedError(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].CheckedError"));
			iTagBaseReportResponse.setCheckedAccuracy(_ctx.doubleValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].CheckedAccuracy"));
			iTagBaseReportResponse.setCheckedReject(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].CheckedReject"));
			iTagBaseReportResponse.setCheckedFix(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].CheckedFix"));
			iTagBaseReportResponse.setTotalSampled(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].TotalSampled"));
			iTagBaseReportResponse.setSampledError(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].SampledError"));
			iTagBaseReportResponse.setSampledReject(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].SampledReject"));
			iTagBaseReportResponse.setSampledFix(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].SampledFix"));
			iTagBaseReportResponse.setSampledAccuracy(_ctx.doubleValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].SampledAccuracy"));
			iTagBaseReportResponse.setTotalSampling(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].TotalSampling"));
			iTagBaseReportResponse.setSamplingError(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].SamplingError"));
			iTagBaseReportResponse.setSamplingReject(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].SamplingReject"));
			iTagBaseReportResponse.setSamplingFix(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].SamplingFix"));
			iTagBaseReportResponse.setSamplingAccuracy(_ctx.doubleValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].SamplingAccuracy"));
			iTagBaseReportResponse.setTotalCheck(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].TotalCheck"));
			iTagBaseReportResponse.setNoRejectCheck(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].NoRejectCheck"));
			iTagBaseReportResponse.setCheckError(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].CheckError"));
			iTagBaseReportResponse.setCheckAccuracy(_ctx.doubleValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].CheckAccuracy"));
			iTagBaseReportResponse.setCheckReject(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].CheckReject"));
			iTagBaseReportResponse.setCheckFix(_ctx.integerValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].CheckFix"));
			iTagBaseReportResponse.setUserName(_ctx.stringValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].UserName"));
			iTagBaseReportResponse.setUserId(_ctx.stringValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].UserId"));
			iTagBaseReportResponse.setTaskId(_ctx.stringValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].TaskId"));
			iTagBaseReportResponse.setTaskName(_ctx.stringValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].TaskName"));
			iTagBaseReportResponse.setBizClassify(_ctx.stringValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].BizClassify"));
			iTagBaseReportResponse.setWorkflow(_ctx.stringValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].Workflow"));
			iTagBaseReportResponse.setWorkTime(_ctx.stringValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].WorkTime"));
			iTagBaseReportResponse.setTotalPDF(_ctx.longValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].TotalPDF"));
			iTagBaseReportResponse.setNoRejectPDF(_ctx.longValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].NoRejectPDF"));
			iTagBaseReportResponse.setTotalAudio(_ctx.longValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].TotalAudio"));
			iTagBaseReportResponse.setNoRejectAudio(_ctx.longValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].NoRejectAudio"));
			iTagBaseReportResponse.setTotalVideo(_ctx.longValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].TotalVideo"));
			iTagBaseReportResponse.setNoRejectVideo(_ctx.longValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].NoRejectVideo"));
			iTagBaseReportResponse.setMarkTime(_ctx.doubleValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].MarkTime"));
			iTagBaseReportResponse.setMarkEfficiency(_ctx.doubleValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].MarkEfficiency"));
			iTagBaseReportResponse.setCheckTime(_ctx.doubleValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].CheckTime"));
			iTagBaseReportResponse.setCheckEfficiency(_ctx.doubleValue("GetTaskPersonSummaryResponse.Result.List["+ i +"].CheckEfficiency"));

			list.add(iTagBaseReportResponse);
		}
		result.setList(list);
		getTaskPersonSummaryResponse.setResult(result);
	 
	 	return getTaskPersonSummaryResponse;
	}
}