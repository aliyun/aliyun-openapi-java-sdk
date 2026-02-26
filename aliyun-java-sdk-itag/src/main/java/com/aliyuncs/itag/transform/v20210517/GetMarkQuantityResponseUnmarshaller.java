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

import com.aliyuncs.itag.model.v20210517.GetMarkQuantityResponse;
import com.aliyuncs.itag.model.v20210517.GetMarkQuantityResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMarkQuantityResponseUnmarshaller {

	public static GetMarkQuantityResponse unmarshall(GetMarkQuantityResponse getMarkQuantityResponse, UnmarshallerContext _ctx) {
		
		getMarkQuantityResponse.setRequestId(_ctx.stringValue("GetMarkQuantityResponse.requestId"));
		getMarkQuantityResponse.setCode(_ctx.integerValue("GetMarkQuantityResponse.Code"));
		getMarkQuantityResponse.setMsg(_ctx.stringValue("GetMarkQuantityResponse.Msg"));
		getMarkQuantityResponse.setErrInfo(_ctx.stringValue("GetMarkQuantityResponse.ErrInfo"));
		getMarkQuantityResponse.setSucc(_ctx.booleanValue("GetMarkQuantityResponse.Succ"));
		getMarkQuantityResponse.setErrorCode(_ctx.stringValue("GetMarkQuantityResponse.ErrorCode"));

		Result result = new Result();
		result.setTotalDisable(_ctx.integerValue("GetMarkQuantityResponse.Result.TotalDisable"));
		result.setUpdateTime(_ctx.stringValue("GetMarkQuantityResponse.Result.UpdateTime"));
		result.setSample(_ctx.integerValue("GetMarkQuantityResponse.Result.Sample"));
		result.setTotalMark(_ctx.integerValue("GetMarkQuantityResponse.Result.TotalMark"));
		result.setNoRejectMark(_ctx.integerValue("GetMarkQuantityResponse.Result.NoRejectMark"));
		result.setTotalChecked(_ctx.integerValue("GetMarkQuantityResponse.Result.TotalChecked"));
		result.setCheckedError(_ctx.integerValue("GetMarkQuantityResponse.Result.CheckedError"));
		result.setCheckedAccuracy(_ctx.floatValue("GetMarkQuantityResponse.Result.CheckedAccuracy"));
		result.setCheckedReject(_ctx.integerValue("GetMarkQuantityResponse.Result.CheckedReject"));
		result.setCheckedFix(_ctx.integerValue("GetMarkQuantityResponse.Result.CheckedFix"));
		result.setTotalSampled(_ctx.integerValue("GetMarkQuantityResponse.Result.TotalSampled"));
		result.setSampledError(_ctx.integerValue("GetMarkQuantityResponse.Result.SampledError"));
		result.setSampledReject(_ctx.integerValue("GetMarkQuantityResponse.Result.SampledReject"));
		result.setSampledFix(_ctx.integerValue("GetMarkQuantityResponse.Result.SampledFix"));
		result.setSampledAccuracy(_ctx.floatValue("GetMarkQuantityResponse.Result.SampledAccuracy"));
		result.setTotalSampling(_ctx.integerValue("GetMarkQuantityResponse.Result.TotalSampling"));
		result.setSamplingError(_ctx.integerValue("GetMarkQuantityResponse.Result.SamplingError"));
		result.setSamplingReject(_ctx.integerValue("GetMarkQuantityResponse.Result.SamplingReject"));
		result.setSamplingFix(_ctx.integerValue("GetMarkQuantityResponse.Result.SamplingFix"));
		result.setSamplingAccuracy(_ctx.floatValue("GetMarkQuantityResponse.Result.SamplingAccuracy"));
		result.setTotalCheck(_ctx.integerValue("GetMarkQuantityResponse.Result.TotalCheck"));
		result.setNoRejectCheck(_ctx.integerValue("GetMarkQuantityResponse.Result.NoRejectCheck"));
		result.setCheckError(_ctx.integerValue("GetMarkQuantityResponse.Result.CheckError"));
		result.setCheckAccuracy(_ctx.floatValue("GetMarkQuantityResponse.Result.CheckAccuracy"));
		result.setCheckReject(_ctx.integerValue("GetMarkQuantityResponse.Result.CheckReject"));
		result.setCheckFix(_ctx.integerValue("GetMarkQuantityResponse.Result.CheckFix"));
		result.setUserName(_ctx.stringValue("GetMarkQuantityResponse.Result.UserName"));
		result.setUserId(_ctx.stringValue("GetMarkQuantityResponse.Result.UserId"));
		result.setTaskId(_ctx.stringValue("GetMarkQuantityResponse.Result.TaskId"));
		result.setTaskName(_ctx.stringValue("GetMarkQuantityResponse.Result.TaskName"));
		result.setBizClassify(_ctx.stringValue("GetMarkQuantityResponse.Result.BizClassify"));
		result.setWorkflow(_ctx.stringValue("GetMarkQuantityResponse.Result.Workflow"));
		result.setWorkTime(_ctx.stringValue("GetMarkQuantityResponse.Result.WorkTime"));
		result.setTotalPDF(_ctx.longValue("GetMarkQuantityResponse.Result.TotalPDF"));
		result.setNoRejectPDF(_ctx.longValue("GetMarkQuantityResponse.Result.NoRejectPDF"));
		result.setTotalAudio(_ctx.longValue("GetMarkQuantityResponse.Result.TotalAudio"));
		result.setNoRejectAudio(_ctx.longValue("GetMarkQuantityResponse.Result.NoRejectAudio"));
		result.setTotalVideo(_ctx.longValue("GetMarkQuantityResponse.Result.TotalVideo"));
		result.setNoRejectVideo(_ctx.longValue("GetMarkQuantityResponse.Result.NoRejectVideo"));
		result.setMarkTime(_ctx.floatValue("GetMarkQuantityResponse.Result.MarkTime"));
		result.setMarkEfficiency(_ctx.floatValue("GetMarkQuantityResponse.Result.MarkEfficiency"));
		result.setCheckTime(_ctx.floatValue("GetMarkQuantityResponse.Result.CheckTime"));
		result.setCheckEfficiency(_ctx.floatValue("GetMarkQuantityResponse.Result.CheckEfficiency"));
		getMarkQuantityResponse.setResult(result);
	 
	 	return getMarkQuantityResponse;
	}
}