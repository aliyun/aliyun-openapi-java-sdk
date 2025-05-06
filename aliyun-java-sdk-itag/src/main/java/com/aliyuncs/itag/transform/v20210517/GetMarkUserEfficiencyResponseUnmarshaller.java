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

import com.aliyuncs.itag.model.v20210517.GetMarkUserEfficiencyResponse;
import com.aliyuncs.itag.model.v20210517.GetMarkUserEfficiencyResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetMarkUserEfficiencyResponse.Result.ITagBaseReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMarkUserEfficiencyResponseUnmarshaller {

	public static GetMarkUserEfficiencyResponse unmarshall(GetMarkUserEfficiencyResponse getMarkUserEfficiencyResponse, UnmarshallerContext _ctx) {
		
		getMarkUserEfficiencyResponse.setRequestId(_ctx.stringValue("GetMarkUserEfficiencyResponse.requestId"));
		getMarkUserEfficiencyResponse.setCode(_ctx.integerValue("GetMarkUserEfficiencyResponse.Code"));
		getMarkUserEfficiencyResponse.setMsg(_ctx.stringValue("GetMarkUserEfficiencyResponse.Msg"));
		getMarkUserEfficiencyResponse.setErrInfo(_ctx.stringValue("GetMarkUserEfficiencyResponse.ErrInfo"));
		getMarkUserEfficiencyResponse.setSucc(_ctx.booleanValue("GetMarkUserEfficiencyResponse.Succ"));
		getMarkUserEfficiencyResponse.setErrorCode(_ctx.stringValue("GetMarkUserEfficiencyResponse.ErrorCode"));

		Result result = new Result();

		List<ITagBaseReportResponse> userWorkEfficiencyList = new ArrayList<ITagBaseReportResponse>();
		for (int i = 0; i < _ctx.lengthValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList.Length"); i++) {
			ITagBaseReportResponse iTagBaseReportResponse = new ITagBaseReportResponse();
			iTagBaseReportResponse.setTotalDisable(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalDisable"));
			iTagBaseReportResponse.setUpdateTime(_ctx.stringValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].UpdateTime"));
			iTagBaseReportResponse.setSample(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].Sample"));
			iTagBaseReportResponse.setTotalMark(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalMark"));
			iTagBaseReportResponse.setNoRejectMark(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].NoRejectMark"));
			iTagBaseReportResponse.setTotalChecked(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalChecked"));
			iTagBaseReportResponse.setCheckedError(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckedError"));
			iTagBaseReportResponse.setCheckedAccuracy(_ctx.doubleValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckedAccuracy"));
			iTagBaseReportResponse.setCheckedReject(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckedReject"));
			iTagBaseReportResponse.setCheckedFix(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckedFix"));
			iTagBaseReportResponse.setTotalSampled(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalSampled"));
			iTagBaseReportResponse.setSampledError(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SampledError"));
			iTagBaseReportResponse.setSampledReject(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SampledReject"));
			iTagBaseReportResponse.setSampledFix(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SampledFix"));
			iTagBaseReportResponse.setSampledAccuracy(_ctx.doubleValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SampledAccuracy"));
			iTagBaseReportResponse.setTotalSampling(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalSampling"));
			iTagBaseReportResponse.setSamplingError(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SamplingError"));
			iTagBaseReportResponse.setSamplingReject(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SamplingReject"));
			iTagBaseReportResponse.setSamplingFix(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SamplingFix"));
			iTagBaseReportResponse.setSamplingAccuracy(_ctx.doubleValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SamplingAccuracy"));
			iTagBaseReportResponse.setTotalCheck(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalCheck"));
			iTagBaseReportResponse.setNoRejectCheck(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].NoRejectCheck"));
			iTagBaseReportResponse.setCheckError(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckError"));
			iTagBaseReportResponse.setCheckAccuracy(_ctx.doubleValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckAccuracy"));
			iTagBaseReportResponse.setCheckReject(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckReject"));
			iTagBaseReportResponse.setCheckFix(_ctx.integerValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckFix"));
			iTagBaseReportResponse.setUserName(_ctx.stringValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].UserName"));
			iTagBaseReportResponse.setUserId(_ctx.stringValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].UserId"));
			iTagBaseReportResponse.setTaskId(_ctx.stringValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TaskId"));
			iTagBaseReportResponse.setTaskName(_ctx.stringValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TaskName"));
			iTagBaseReportResponse.setBizClassify(_ctx.stringValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].BizClassify"));
			iTagBaseReportResponse.setWorkflow(_ctx.stringValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].Workflow"));
			iTagBaseReportResponse.setWorkTime(_ctx.stringValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].WorkTime"));
			iTagBaseReportResponse.setTotalPDF(_ctx.longValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalPDF"));
			iTagBaseReportResponse.setNoRejectPDF(_ctx.longValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].NoRejectPDF"));
			iTagBaseReportResponse.setTotalAudio(_ctx.longValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalAudio"));
			iTagBaseReportResponse.setNoRejectAudio(_ctx.longValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].NoRejectAudio"));
			iTagBaseReportResponse.setTotalVideo(_ctx.longValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalVideo"));
			iTagBaseReportResponse.setNoRejectVideo(_ctx.longValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].NoRejectVideo"));
			iTagBaseReportResponse.setMarkTime(_ctx.doubleValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].MarkTime"));
			iTagBaseReportResponse.setMarkEfficiency(_ctx.doubleValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].MarkEfficiency"));
			iTagBaseReportResponse.setCheckTime(_ctx.doubleValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckTime"));
			iTagBaseReportResponse.setCheckEfficiency(_ctx.doubleValue("GetMarkUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckEfficiency"));

			userWorkEfficiencyList.add(iTagBaseReportResponse);
		}
		result.setUserWorkEfficiencyList(userWorkEfficiencyList);
		getMarkUserEfficiencyResponse.setResult(result);
	 
	 	return getMarkUserEfficiencyResponse;
	}
}