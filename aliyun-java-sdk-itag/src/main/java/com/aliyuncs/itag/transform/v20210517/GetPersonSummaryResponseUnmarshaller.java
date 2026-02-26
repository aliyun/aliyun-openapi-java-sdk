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

import com.aliyuncs.itag.model.v20210517.GetPersonSummaryResponse;
import com.aliyuncs.itag.model.v20210517.GetPersonSummaryResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetPersonSummaryResponse.Result.ITagBaseReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPersonSummaryResponseUnmarshaller {

	public static GetPersonSummaryResponse unmarshall(GetPersonSummaryResponse getPersonSummaryResponse, UnmarshallerContext _ctx) {
		
		getPersonSummaryResponse.setRequestId(_ctx.stringValue("GetPersonSummaryResponse.RequestId"));
		getPersonSummaryResponse.setCode(_ctx.stringValue("GetPersonSummaryResponse.Code"));
		getPersonSummaryResponse.setErrInfo(_ctx.stringValue("GetPersonSummaryResponse.ErrInfo"));
		getPersonSummaryResponse.setMsg(_ctx.stringValue("GetPersonSummaryResponse.Msg"));
		getPersonSummaryResponse.setSucc(_ctx.booleanValue("GetPersonSummaryResponse.Succ"));
		getPersonSummaryResponse.setErrorCode(_ctx.stringValue("GetPersonSummaryResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("GetPersonSummaryResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("GetPersonSummaryResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("GetPersonSummaryResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("GetPersonSummaryResponse.Result.TotalPage"));

		List<ITagBaseReportResponse> list = new ArrayList<ITagBaseReportResponse>();
		for (int i = 0; i < _ctx.lengthValue("GetPersonSummaryResponse.Result.List.Length"); i++) {
			ITagBaseReportResponse iTagBaseReportResponse = new ITagBaseReportResponse();
			iTagBaseReportResponse.setTotalDisable(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].TotalDisable"));
			iTagBaseReportResponse.setUpdateTime(_ctx.stringValue("GetPersonSummaryResponse.Result.List["+ i +"].UpdateTime"));
			iTagBaseReportResponse.setSample(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].Sample"));
			iTagBaseReportResponse.setTotalMark(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].TotalMark"));
			iTagBaseReportResponse.setNoRejectMark(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].NoRejectMark"));
			iTagBaseReportResponse.setTotalChecked(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].TotalChecked"));
			iTagBaseReportResponse.setCheckedError(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].CheckedError"));
			iTagBaseReportResponse.setCheckedAccuracy(_ctx.doubleValue("GetPersonSummaryResponse.Result.List["+ i +"].CheckedAccuracy"));
			iTagBaseReportResponse.setCheckedReject(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].CheckedReject"));
			iTagBaseReportResponse.setCheckedFix(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].CheckedFix"));
			iTagBaseReportResponse.setTotalSampled(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].TotalSampled"));
			iTagBaseReportResponse.setSampledError(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].SampledError"));
			iTagBaseReportResponse.setSampledReject(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].SampledReject"));
			iTagBaseReportResponse.setSampledFix(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].SampledFix"));
			iTagBaseReportResponse.setSampledAccuracy(_ctx.doubleValue("GetPersonSummaryResponse.Result.List["+ i +"].SampledAccuracy"));
			iTagBaseReportResponse.setTotalSampling(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].TotalSampling"));
			iTagBaseReportResponse.setSamplingError(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].SamplingError"));
			iTagBaseReportResponse.setSamplingReject(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].SamplingReject"));
			iTagBaseReportResponse.setSamplingFix(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].SamplingFix"));
			iTagBaseReportResponse.setSamplingAccuracy(_ctx.doubleValue("GetPersonSummaryResponse.Result.List["+ i +"].SamplingAccuracy"));
			iTagBaseReportResponse.setTotalCheck(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].TotalCheck"));
			iTagBaseReportResponse.setNoRejectCheck(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].NoRejectCheck"));
			iTagBaseReportResponse.setCheckError(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].CheckError"));
			iTagBaseReportResponse.setCheckAccuracy(_ctx.doubleValue("GetPersonSummaryResponse.Result.List["+ i +"].CheckAccuracy"));
			iTagBaseReportResponse.setCheckReject(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].CheckReject"));
			iTagBaseReportResponse.setCheckFix(_ctx.integerValue("GetPersonSummaryResponse.Result.List["+ i +"].CheckFix"));
			iTagBaseReportResponse.setUserName(_ctx.stringValue("GetPersonSummaryResponse.Result.List["+ i +"].UserName"));
			iTagBaseReportResponse.setUserId(_ctx.stringValue("GetPersonSummaryResponse.Result.List["+ i +"].UserId"));
			iTagBaseReportResponse.setTaskId(_ctx.stringValue("GetPersonSummaryResponse.Result.List["+ i +"].TaskId"));
			iTagBaseReportResponse.setTaskName(_ctx.stringValue("GetPersonSummaryResponse.Result.List["+ i +"].TaskName"));
			iTagBaseReportResponse.setBizClassify(_ctx.stringValue("GetPersonSummaryResponse.Result.List["+ i +"].BizClassify"));
			iTagBaseReportResponse.setWorkflow(_ctx.stringValue("GetPersonSummaryResponse.Result.List["+ i +"].Workflow"));
			iTagBaseReportResponse.setWorkTime(_ctx.stringValue("GetPersonSummaryResponse.Result.List["+ i +"].WorkTime"));
			iTagBaseReportResponse.setTotalPDF(_ctx.longValue("GetPersonSummaryResponse.Result.List["+ i +"].TotalPDF"));
			iTagBaseReportResponse.setNoRejectPDF(_ctx.longValue("GetPersonSummaryResponse.Result.List["+ i +"].NoRejectPDF"));
			iTagBaseReportResponse.setTotalAudio(_ctx.longValue("GetPersonSummaryResponse.Result.List["+ i +"].TotalAudio"));
			iTagBaseReportResponse.setNoRejectAudio(_ctx.longValue("GetPersonSummaryResponse.Result.List["+ i +"].NoRejectAudio"));
			iTagBaseReportResponse.setTotalVideo(_ctx.longValue("GetPersonSummaryResponse.Result.List["+ i +"].TotalVideo"));
			iTagBaseReportResponse.setNoRejectVideo(_ctx.longValue("GetPersonSummaryResponse.Result.List["+ i +"].NoRejectVideo"));
			iTagBaseReportResponse.setMarkTime(_ctx.doubleValue("GetPersonSummaryResponse.Result.List["+ i +"].MarkTime"));
			iTagBaseReportResponse.setMarkEfficiency(_ctx.doubleValue("GetPersonSummaryResponse.Result.List["+ i +"].MarkEfficiency"));
			iTagBaseReportResponse.setCheckTime(_ctx.doubleValue("GetPersonSummaryResponse.Result.List["+ i +"].CheckTime"));
			iTagBaseReportResponse.setCheckEfficiency(_ctx.doubleValue("GetPersonSummaryResponse.Result.List["+ i +"].CheckEfficiency"));

			list.add(iTagBaseReportResponse);
		}
		result.setList(list);
		getPersonSummaryResponse.setResult(result);
	 
	 	return getPersonSummaryResponse;
	}
}