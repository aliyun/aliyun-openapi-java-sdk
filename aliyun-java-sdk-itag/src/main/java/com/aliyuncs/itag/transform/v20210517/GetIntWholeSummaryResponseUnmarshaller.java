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

import com.aliyuncs.itag.model.v20210517.GetIntWholeSummaryResponse;
import com.aliyuncs.itag.model.v20210517.GetIntWholeSummaryResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetIntWholeSummaryResponse.Result.ITagDailyWorkload;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIntWholeSummaryResponseUnmarshaller {

	public static GetIntWholeSummaryResponse unmarshall(GetIntWholeSummaryResponse getIntWholeSummaryResponse, UnmarshallerContext _ctx) {
		
		getIntWholeSummaryResponse.setRequestId(_ctx.stringValue("GetIntWholeSummaryResponse.requestId"));
		getIntWholeSummaryResponse.setCode(_ctx.integerValue("GetIntWholeSummaryResponse.Code"));
		getIntWholeSummaryResponse.setMsg(_ctx.stringValue("GetIntWholeSummaryResponse.Msg"));
		getIntWholeSummaryResponse.setErrInfo(_ctx.stringValue("GetIntWholeSummaryResponse.ErrInfo"));
		getIntWholeSummaryResponse.setSucc(_ctx.booleanValue("GetIntWholeSummaryResponse.Succ"));
		getIntWholeSummaryResponse.setErrorCode(_ctx.stringValue("GetIntWholeSummaryResponse.ErrorCode"));

		Result result = new Result();
		result.setTotalDisable(_ctx.integerValue("GetIntWholeSummaryResponse.Result.TotalDisable"));
		result.setUpdateTime(_ctx.stringValue("GetIntWholeSummaryResponse.Result.UpdateTime"));
		result.setSample(_ctx.integerValue("GetIntWholeSummaryResponse.Result.Sample"));
		result.setTotalMark(_ctx.integerValue("GetIntWholeSummaryResponse.Result.TotalMark"));
		result.setNoRejectMark(_ctx.integerValue("GetIntWholeSummaryResponse.Result.NoRejectMark"));
		result.setTotalChecked(_ctx.integerValue("GetIntWholeSummaryResponse.Result.TotalChecked"));
		result.setCheckedError(_ctx.integerValue("GetIntWholeSummaryResponse.Result.CheckedError"));
		result.setCheckedAccuracy(_ctx.floatValue("GetIntWholeSummaryResponse.Result.CheckedAccuracy"));
		result.setCheckedReject(_ctx.integerValue("GetIntWholeSummaryResponse.Result.CheckedReject"));
		result.setCheckedFix(_ctx.integerValue("GetIntWholeSummaryResponse.Result.CheckedFix"));
		result.setTotalSampled(_ctx.integerValue("GetIntWholeSummaryResponse.Result.TotalSampled"));
		result.setSampledError(_ctx.integerValue("GetIntWholeSummaryResponse.Result.SampledError"));
		result.setSampledReject(_ctx.integerValue("GetIntWholeSummaryResponse.Result.SampledReject"));
		result.setSampledFix(_ctx.integerValue("GetIntWholeSummaryResponse.Result.SampledFix"));
		result.setSampledAccuracy(_ctx.floatValue("GetIntWholeSummaryResponse.Result.SampledAccuracy"));
		result.setTotalSampling(_ctx.integerValue("GetIntWholeSummaryResponse.Result.TotalSampling"));
		result.setSamplingError(_ctx.integerValue("GetIntWholeSummaryResponse.Result.SamplingError"));
		result.setSamplingReject(_ctx.integerValue("GetIntWholeSummaryResponse.Result.SamplingReject"));
		result.setSamplingFix(_ctx.integerValue("GetIntWholeSummaryResponse.Result.SamplingFix"));
		result.setSamplingAccuracy(_ctx.floatValue("GetIntWholeSummaryResponse.Result.SamplingAccuracy"));
		result.setTotalCheck(_ctx.integerValue("GetIntWholeSummaryResponse.Result.TotalCheck"));
		result.setNoRejectCheck(_ctx.integerValue("GetIntWholeSummaryResponse.Result.NoRejectCheck"));
		result.setCheckError(_ctx.integerValue("GetIntWholeSummaryResponse.Result.CheckError"));
		result.setCheckAccuracy(_ctx.floatValue("GetIntWholeSummaryResponse.Result.CheckAccuracy"));
		result.setCheckReject(_ctx.integerValue("GetIntWholeSummaryResponse.Result.CheckReject"));
		result.setCheckFix(_ctx.integerValue("GetIntWholeSummaryResponse.Result.CheckFix"));
		result.setUserName(_ctx.stringValue("GetIntWholeSummaryResponse.Result.UserName"));
		result.setUserId(_ctx.stringValue("GetIntWholeSummaryResponse.Result.UserId"));
		result.setTaskId(_ctx.stringValue("GetIntWholeSummaryResponse.Result.TaskId"));
		result.setTaskName(_ctx.stringValue("GetIntWholeSummaryResponse.Result.TaskName"));
		result.setBizClassify(_ctx.stringValue("GetIntWholeSummaryResponse.Result.BizClassify"));
		result.setWorkflow(_ctx.stringValue("GetIntWholeSummaryResponse.Result.Workflow"));
		result.setWorkTime(_ctx.stringValue("GetIntWholeSummaryResponse.Result.WorkTime"));
		result.setTotalPDF(_ctx.longValue("GetIntWholeSummaryResponse.Result.TotalPDF"));
		result.setNoRejectPDF(_ctx.longValue("GetIntWholeSummaryResponse.Result.NoRejectPDF"));
		result.setTotalAudio(_ctx.longValue("GetIntWholeSummaryResponse.Result.TotalAudio"));
		result.setNoRejectAudio(_ctx.longValue("GetIntWholeSummaryResponse.Result.NoRejectAudio"));
		result.setTotalVideo(_ctx.longValue("GetIntWholeSummaryResponse.Result.TotalVideo"));
		result.setNoRejectVideo(_ctx.longValue("GetIntWholeSummaryResponse.Result.NoRejectVideo"));
		result.setMarkTime(_ctx.floatValue("GetIntWholeSummaryResponse.Result.MarkTime"));
		result.setMarkEfficiency(_ctx.floatValue("GetIntWholeSummaryResponse.Result.MarkEfficiency"));
		result.setCheckTime(_ctx.floatValue("GetIntWholeSummaryResponse.Result.CheckTime"));
		result.setCheckEfficiency(_ctx.floatValue("GetIntWholeSummaryResponse.Result.CheckEfficiency"));

		List<ITagDailyWorkload> dailyWorkload = new ArrayList<ITagDailyWorkload>();
		for (int i = 0; i < _ctx.lengthValue("GetIntWholeSummaryResponse.Result.DailyWorkload.Length"); i++) {
			ITagDailyWorkload iTagDailyWorkload = new ITagDailyWorkload();
			iTagDailyWorkload.setTotalMark(_ctx.integerValue("GetIntWholeSummaryResponse.Result.DailyWorkload["+ i +"].TotalMark"));
			iTagDailyWorkload.setNoRejectMark(_ctx.integerValue("GetIntWholeSummaryResponse.Result.DailyWorkload["+ i +"].NoRejectMark"));
			iTagDailyWorkload.setTotalCheck(_ctx.integerValue("GetIntWholeSummaryResponse.Result.DailyWorkload["+ i +"].TotalCheck"));
			iTagDailyWorkload.setNoRejectCheck(_ctx.integerValue("GetIntWholeSummaryResponse.Result.DailyWorkload["+ i +"].NoRejectCheck"));
			iTagDailyWorkload.setWorkTime(_ctx.stringValue("GetIntWholeSummaryResponse.Result.DailyWorkload["+ i +"].WorkTime"));

			dailyWorkload.add(iTagDailyWorkload);
		}
		result.setDailyWorkload(dailyWorkload);
		getIntWholeSummaryResponse.setResult(result);
	 
	 	return getIntWholeSummaryResponse;
	}
}