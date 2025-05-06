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

import com.aliyuncs.itag.model.v20210517.GetCheckUserEfficiencyResponse;
import com.aliyuncs.itag.model.v20210517.GetCheckUserEfficiencyResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetCheckUserEfficiencyResponse.Result.ITagBaseReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCheckUserEfficiencyResponseUnmarshaller {

	public static GetCheckUserEfficiencyResponse unmarshall(GetCheckUserEfficiencyResponse getCheckUserEfficiencyResponse, UnmarshallerContext _ctx) {
		
		getCheckUserEfficiencyResponse.setRequestId(_ctx.stringValue("GetCheckUserEfficiencyResponse.requestId"));
		getCheckUserEfficiencyResponse.setCode(_ctx.integerValue("GetCheckUserEfficiencyResponse.Code"));
		getCheckUserEfficiencyResponse.setMsg(_ctx.stringValue("GetCheckUserEfficiencyResponse.Msg"));
		getCheckUserEfficiencyResponse.setErrInfo(_ctx.stringValue("GetCheckUserEfficiencyResponse.ErrInfo"));
		getCheckUserEfficiencyResponse.setSucc(_ctx.booleanValue("GetCheckUserEfficiencyResponse.Succ"));
		getCheckUserEfficiencyResponse.setErrorCode(_ctx.stringValue("GetCheckUserEfficiencyResponse.ErrorCode"));

		Result result = new Result();

		List<ITagBaseReportResponse> userWorkEfficiencyList = new ArrayList<ITagBaseReportResponse>();
		for (int i = 0; i < _ctx.lengthValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList.Length"); i++) {
			ITagBaseReportResponse iTagBaseReportResponse = new ITagBaseReportResponse();
			iTagBaseReportResponse.setTotalDisable(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalDisable"));
			iTagBaseReportResponse.setUpdateTime(_ctx.stringValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].UpdateTime"));
			iTagBaseReportResponse.setSample(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].Sample"));
			iTagBaseReportResponse.setTotalMark(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalMark"));
			iTagBaseReportResponse.setNoRejectMark(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].NoRejectMark"));
			iTagBaseReportResponse.setTotalChecked(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalChecked"));
			iTagBaseReportResponse.setCheckedError(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckedError"));
			iTagBaseReportResponse.setCheckedAccuracy(_ctx.doubleValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckedAccuracy"));
			iTagBaseReportResponse.setCheckedReject(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckedReject"));
			iTagBaseReportResponse.setCheckedFix(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckedFix"));
			iTagBaseReportResponse.setTotalSampled(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalSampled"));
			iTagBaseReportResponse.setSampledError(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SampledError"));
			iTagBaseReportResponse.setSampledReject(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SampledReject"));
			iTagBaseReportResponse.setSampledFix(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SampledFix"));
			iTagBaseReportResponse.setSampledAccuracy(_ctx.doubleValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SampledAccuracy"));
			iTagBaseReportResponse.setTotalSampling(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalSampling"));
			iTagBaseReportResponse.setSamplingError(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SamplingError"));
			iTagBaseReportResponse.setSamplingReject(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SamplingReject"));
			iTagBaseReportResponse.setSamplingFix(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SamplingFix"));
			iTagBaseReportResponse.setSamplingAccuracy(_ctx.doubleValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].SamplingAccuracy"));
			iTagBaseReportResponse.setTotalCheck(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalCheck"));
			iTagBaseReportResponse.setNoRejectCheck(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].NoRejectCheck"));
			iTagBaseReportResponse.setCheckError(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckError"));
			iTagBaseReportResponse.setCheckAccuracy(_ctx.doubleValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckAccuracy"));
			iTagBaseReportResponse.setCheckReject(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckReject"));
			iTagBaseReportResponse.setCheckFix(_ctx.integerValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckFix"));
			iTagBaseReportResponse.setUserName(_ctx.stringValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].UserName"));
			iTagBaseReportResponse.setUserId(_ctx.stringValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].UserId"));
			iTagBaseReportResponse.setTaskId(_ctx.stringValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TaskId"));
			iTagBaseReportResponse.setTaskName(_ctx.stringValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TaskName"));
			iTagBaseReportResponse.setBizClassify(_ctx.stringValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].BizClassify"));
			iTagBaseReportResponse.setWorkflow(_ctx.stringValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].Workflow"));
			iTagBaseReportResponse.setWorkTime(_ctx.stringValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].WorkTime"));
			iTagBaseReportResponse.setTotalPDF(_ctx.longValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalPDF"));
			iTagBaseReportResponse.setNoRejectPDF(_ctx.longValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].NoRejectPDF"));
			iTagBaseReportResponse.setTotalAudio(_ctx.longValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalAudio"));
			iTagBaseReportResponse.setNoRejectAudio(_ctx.longValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].NoRejectAudio"));
			iTagBaseReportResponse.setTotalVideo(_ctx.longValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].TotalVideo"));
			iTagBaseReportResponse.setNoRejectVideo(_ctx.longValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].NoRejectVideo"));
			iTagBaseReportResponse.setMarkTime(_ctx.doubleValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].MarkTime"));
			iTagBaseReportResponse.setMarkEfficiency(_ctx.doubleValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].MarkEfficiency"));
			iTagBaseReportResponse.setCheckTime(_ctx.doubleValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckTime"));
			iTagBaseReportResponse.setCheckEfficiency(_ctx.doubleValue("GetCheckUserEfficiencyResponse.Result.UserWorkEfficiencyList["+ i +"].CheckEfficiency"));

			userWorkEfficiencyList.add(iTagBaseReportResponse);
		}
		result.setUserWorkEfficiencyList(userWorkEfficiencyList);
		getCheckUserEfficiencyResponse.setResult(result);
	 
	 	return getCheckUserEfficiencyResponse;
	}
}