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

import com.aliyuncs.itag.model.v20210517.GetMarkUserSummaryResponse;
import com.aliyuncs.itag.model.v20210517.GetMarkUserSummaryResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMarkUserSummaryResponseUnmarshaller {

	public static GetMarkUserSummaryResponse unmarshall(GetMarkUserSummaryResponse getMarkUserSummaryResponse, UnmarshallerContext _ctx) {
		
		getMarkUserSummaryResponse.setRequestId(_ctx.stringValue("GetMarkUserSummaryResponse.requestId"));
		getMarkUserSummaryResponse.setCode(_ctx.integerValue("GetMarkUserSummaryResponse.Code"));
		getMarkUserSummaryResponse.setMsg(_ctx.stringValue("GetMarkUserSummaryResponse.Msg"));
		getMarkUserSummaryResponse.setErrInfo(_ctx.stringValue("GetMarkUserSummaryResponse.ErrInfo"));
		getMarkUserSummaryResponse.setSucc(_ctx.booleanValue("GetMarkUserSummaryResponse.Succ"));
		getMarkUserSummaryResponse.setErrorCode(_ctx.stringValue("GetMarkUserSummaryResponse.ErrorCode"));

		Result result = new Result();
		result.setTotalDisable(_ctx.integerValue("GetMarkUserSummaryResponse.Result.TotalDisable"));
		result.setUpdateTime(_ctx.stringValue("GetMarkUserSummaryResponse.Result.UpdateTime"));
		result.setSample(_ctx.integerValue("GetMarkUserSummaryResponse.Result.Sample"));
		result.setTotalMark(_ctx.integerValue("GetMarkUserSummaryResponse.Result.TotalMark"));
		result.setNoRejectMark(_ctx.integerValue("GetMarkUserSummaryResponse.Result.NoRejectMark"));
		result.setTotalChecked(_ctx.integerValue("GetMarkUserSummaryResponse.Result.TotalChecked"));
		result.setCheckedError(_ctx.integerValue("GetMarkUserSummaryResponse.Result.CheckedError"));
		result.setCheckedAccuracy(_ctx.floatValue("GetMarkUserSummaryResponse.Result.CheckedAccuracy"));
		result.setCheckedReject(_ctx.integerValue("GetMarkUserSummaryResponse.Result.CheckedReject"));
		result.setCheckedFix(_ctx.integerValue("GetMarkUserSummaryResponse.Result.CheckedFix"));
		result.setTotalSampled(_ctx.integerValue("GetMarkUserSummaryResponse.Result.TotalSampled"));
		result.setSampledError(_ctx.integerValue("GetMarkUserSummaryResponse.Result.SampledError"));
		result.setSampledReject(_ctx.integerValue("GetMarkUserSummaryResponse.Result.SampledReject"));
		result.setSampledFix(_ctx.integerValue("GetMarkUserSummaryResponse.Result.SampledFix"));
		result.setSampledAccuracy(_ctx.floatValue("GetMarkUserSummaryResponse.Result.SampledAccuracy"));
		result.setTotalSampling(_ctx.integerValue("GetMarkUserSummaryResponse.Result.TotalSampling"));
		result.setSamplingError(_ctx.integerValue("GetMarkUserSummaryResponse.Result.SamplingError"));
		result.setSamplingReject(_ctx.integerValue("GetMarkUserSummaryResponse.Result.SamplingReject"));
		result.setSamplingFix(_ctx.integerValue("GetMarkUserSummaryResponse.Result.SamplingFix"));
		result.setSamplingAccuracy(_ctx.floatValue("GetMarkUserSummaryResponse.Result.SamplingAccuracy"));
		result.setTotalCheck(_ctx.integerValue("GetMarkUserSummaryResponse.Result.TotalCheck"));
		result.setNoRejectCheck(_ctx.integerValue("GetMarkUserSummaryResponse.Result.NoRejectCheck"));
		result.setCheckError(_ctx.integerValue("GetMarkUserSummaryResponse.Result.CheckError"));
		result.setCheckAccuracy(_ctx.floatValue("GetMarkUserSummaryResponse.Result.CheckAccuracy"));
		result.setCheckReject(_ctx.integerValue("GetMarkUserSummaryResponse.Result.CheckReject"));
		result.setCheckFix(_ctx.integerValue("GetMarkUserSummaryResponse.Result.CheckFix"));
		result.setUserName(_ctx.stringValue("GetMarkUserSummaryResponse.Result.UserName"));
		result.setUserId(_ctx.stringValue("GetMarkUserSummaryResponse.Result.UserId"));
		result.setTaskId(_ctx.stringValue("GetMarkUserSummaryResponse.Result.TaskId"));
		result.setTaskName(_ctx.stringValue("GetMarkUserSummaryResponse.Result.TaskName"));
		result.setBizClassify(_ctx.stringValue("GetMarkUserSummaryResponse.Result.BizClassify"));
		result.setWorkflow(_ctx.stringValue("GetMarkUserSummaryResponse.Result.Workflow"));
		result.setWorkTime(_ctx.stringValue("GetMarkUserSummaryResponse.Result.WorkTime"));
		result.setTotalPDF(_ctx.longValue("GetMarkUserSummaryResponse.Result.TotalPDF"));
		result.setNoRejectPDF(_ctx.longValue("GetMarkUserSummaryResponse.Result.NoRejectPDF"));
		result.setTotalAudio(_ctx.longValue("GetMarkUserSummaryResponse.Result.TotalAudio"));
		result.setNoRejectAudio(_ctx.longValue("GetMarkUserSummaryResponse.Result.NoRejectAudio"));
		result.setTotalVideo(_ctx.longValue("GetMarkUserSummaryResponse.Result.TotalVideo"));
		result.setNoRejectVideo(_ctx.longValue("GetMarkUserSummaryResponse.Result.NoRejectVideo"));
		result.setMarkTime(_ctx.floatValue("GetMarkUserSummaryResponse.Result.MarkTime"));
		result.setMarkEfficiency(_ctx.floatValue("GetMarkUserSummaryResponse.Result.MarkEfficiency"));
		result.setCheckTime(_ctx.floatValue("GetMarkUserSummaryResponse.Result.CheckTime"));
		result.setCheckEfficiency(_ctx.floatValue("GetMarkUserSummaryResponse.Result.CheckEfficiency"));
		getMarkUserSummaryResponse.setResult(result);
	 
	 	return getMarkUserSummaryResponse;
	}
}