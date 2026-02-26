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

import com.aliyuncs.itag.model.v20210517.GetCheckUserSummaryResponse;
import com.aliyuncs.itag.model.v20210517.GetCheckUserSummaryResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetCheckUserSummaryResponse.Result.ITagDailyWorkload;
import com.aliyuncs.itag.model.v20210517.GetCheckUserSummaryResponse.Result.ITagSimpleUserVO;
import com.aliyuncs.itag.model.v20210517.GetCheckUserSummaryResponse.Result.ITagUserProportion;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCheckUserSummaryResponseUnmarshaller {

	public static GetCheckUserSummaryResponse unmarshall(GetCheckUserSummaryResponse getCheckUserSummaryResponse, UnmarshallerContext _ctx) {
		
		getCheckUserSummaryResponse.setRequestId(_ctx.stringValue("GetCheckUserSummaryResponse.requestId"));
		getCheckUserSummaryResponse.setCode(_ctx.integerValue("GetCheckUserSummaryResponse.Code"));
		getCheckUserSummaryResponse.setMsg(_ctx.stringValue("GetCheckUserSummaryResponse.Msg"));
		getCheckUserSummaryResponse.setErrInfo(_ctx.stringValue("GetCheckUserSummaryResponse.ErrInfo"));
		getCheckUserSummaryResponse.setSucc(_ctx.booleanValue("GetCheckUserSummaryResponse.Succ"));
		getCheckUserSummaryResponse.setErrorCode(_ctx.stringValue("GetCheckUserSummaryResponse.ErrorCode"));

		Result result = new Result();
		result.setTotalDisable(_ctx.integerValue("GetCheckUserSummaryResponse.Result.TotalDisable"));
		result.setUpdateTime(_ctx.stringValue("GetCheckUserSummaryResponse.Result.UpdateTime"));
		result.setSample(_ctx.integerValue("GetCheckUserSummaryResponse.Result.Sample"));
		result.setTotalMark(_ctx.integerValue("GetCheckUserSummaryResponse.Result.TotalMark"));
		result.setNoRejectMark(_ctx.integerValue("GetCheckUserSummaryResponse.Result.NoRejectMark"));
		result.setTotalChecked(_ctx.integerValue("GetCheckUserSummaryResponse.Result.TotalChecked"));
		result.setCheckedError(_ctx.integerValue("GetCheckUserSummaryResponse.Result.CheckedError"));
		result.setCheckedAccuracy(_ctx.doubleValue("GetCheckUserSummaryResponse.Result.CheckedAccuracy"));
		result.setCheckedReject(_ctx.integerValue("GetCheckUserSummaryResponse.Result.CheckedReject"));
		result.setCheckedFix(_ctx.integerValue("GetCheckUserSummaryResponse.Result.CheckedFix"));
		result.setTotalSampled(_ctx.integerValue("GetCheckUserSummaryResponse.Result.TotalSampled"));
		result.setSampledError(_ctx.integerValue("GetCheckUserSummaryResponse.Result.SampledError"));
		result.setSampledReject(_ctx.integerValue("GetCheckUserSummaryResponse.Result.SampledReject"));
		result.setSampledFix(_ctx.integerValue("GetCheckUserSummaryResponse.Result.SampledFix"));
		result.setSampledAccuracy(_ctx.doubleValue("GetCheckUserSummaryResponse.Result.SampledAccuracy"));
		result.setTotalSampling(_ctx.integerValue("GetCheckUserSummaryResponse.Result.TotalSampling"));
		result.setSamplingError(_ctx.integerValue("GetCheckUserSummaryResponse.Result.SamplingError"));
		result.setSamplingReject(_ctx.integerValue("GetCheckUserSummaryResponse.Result.SamplingReject"));
		result.setSamplingFix(_ctx.integerValue("GetCheckUserSummaryResponse.Result.SamplingFix"));
		result.setSamplingAccuracy(_ctx.doubleValue("GetCheckUserSummaryResponse.Result.SamplingAccuracy"));
		result.setTotalCheck(_ctx.integerValue("GetCheckUserSummaryResponse.Result.TotalCheck"));
		result.setNoRejectCheck(_ctx.integerValue("GetCheckUserSummaryResponse.Result.NoRejectCheck"));
		result.setCheckError(_ctx.integerValue("GetCheckUserSummaryResponse.Result.CheckError"));
		result.setCheckAccuracy(_ctx.doubleValue("GetCheckUserSummaryResponse.Result.CheckAccuracy"));
		result.setCheckReject(_ctx.integerValue("GetCheckUserSummaryResponse.Result.CheckReject"));
		result.setCheckFix(_ctx.integerValue("GetCheckUserSummaryResponse.Result.CheckFix"));
		result.setUserName(_ctx.stringValue("GetCheckUserSummaryResponse.Result.UserName"));
		result.setUserId(_ctx.stringValue("GetCheckUserSummaryResponse.Result.UserId"));
		result.setTaskId(_ctx.stringValue("GetCheckUserSummaryResponse.Result.TaskId"));
		result.setTaskName(_ctx.stringValue("GetCheckUserSummaryResponse.Result.TaskName"));
		result.setBizClassify(_ctx.stringValue("GetCheckUserSummaryResponse.Result.BizClassify"));
		result.setWorkflow(_ctx.stringValue("GetCheckUserSummaryResponse.Result.Workflow"));
		result.setWorkTime(_ctx.stringValue("GetCheckUserSummaryResponse.Result.WorkTime"));
		result.setTotalPDF(_ctx.longValue("GetCheckUserSummaryResponse.Result.TotalPDF"));
		result.setNoRejectPDF(_ctx.longValue("GetCheckUserSummaryResponse.Result.NoRejectPDF"));
		result.setTotalAudio(_ctx.longValue("GetCheckUserSummaryResponse.Result.TotalAudio"));
		result.setNoRejectAudio(_ctx.longValue("GetCheckUserSummaryResponse.Result.NoRejectAudio"));
		result.setTotalVideo(_ctx.longValue("GetCheckUserSummaryResponse.Result.TotalVideo"));
		result.setNoRejectVideo(_ctx.longValue("GetCheckUserSummaryResponse.Result.NoRejectVideo"));
		result.setMarkTime(_ctx.doubleValue("GetCheckUserSummaryResponse.Result.MarkTime"));
		result.setMarkEfficiency(_ctx.doubleValue("GetCheckUserSummaryResponse.Result.MarkEfficiency"));
		result.setCheckTime(_ctx.doubleValue("GetCheckUserSummaryResponse.Result.CheckTime"));
		result.setCheckEfficiency(_ctx.doubleValue("GetCheckUserSummaryResponse.Result.CheckEfficiency"));

		List<ITagDailyWorkload> dailyWorkload = new ArrayList<ITagDailyWorkload>();
		for (int i = 0; i < _ctx.lengthValue("GetCheckUserSummaryResponse.Result.DailyWorkload.Length"); i++) {
			ITagDailyWorkload iTagDailyWorkload = new ITagDailyWorkload();
			iTagDailyWorkload.setTotalMark(_ctx.integerValue("GetCheckUserSummaryResponse.Result.DailyWorkload["+ i +"].TotalMark"));
			iTagDailyWorkload.setNoRejectMark(_ctx.integerValue("GetCheckUserSummaryResponse.Result.DailyWorkload["+ i +"].NoRejectMark"));
			iTagDailyWorkload.setTotalCheck(_ctx.integerValue("GetCheckUserSummaryResponse.Result.DailyWorkload["+ i +"].TotalCheck"));
			iTagDailyWorkload.setNoRejectCheck(_ctx.integerValue("GetCheckUserSummaryResponse.Result.DailyWorkload["+ i +"].NoRejectCheck"));
			iTagDailyWorkload.setWorkTime(_ctx.stringValue("GetCheckUserSummaryResponse.Result.DailyWorkload["+ i +"].WorkTime"));

			dailyWorkload.add(iTagDailyWorkload);
		}
		result.setDailyWorkload(dailyWorkload);

		List<ITagUserProportion> userProportion = new ArrayList<ITagUserProportion>();
		for (int i = 0; i < _ctx.lengthValue("GetCheckUserSummaryResponse.Result.UserProportion.Length"); i++) {
			ITagUserProportion iTagUserProportion = new ITagUserProportion();
			iTagUserProportion.setUserName(_ctx.stringValue("GetCheckUserSummaryResponse.Result.UserProportion["+ i +"].UserName"));
			iTagUserProportion.setRate(_ctx.doubleValue("GetCheckUserSummaryResponse.Result.UserProportion["+ i +"].Rate"));

			userProportion.add(iTagUserProportion);
		}
		result.setUserProportion(userProportion);

		List<ITagSimpleUserVO> userList = new ArrayList<ITagSimpleUserVO>();
		for (int i = 0; i < _ctx.lengthValue("GetCheckUserSummaryResponse.Result.UserList.Length"); i++) {
			ITagSimpleUserVO iTagSimpleUserVO = new ITagSimpleUserVO();
			iTagSimpleUserVO.setUserId(_ctx.stringValue("GetCheckUserSummaryResponse.Result.UserList["+ i +"].UserId"));
			iTagSimpleUserVO.setUserName(_ctx.stringValue("GetCheckUserSummaryResponse.Result.UserList["+ i +"].UserName"));
			iTagSimpleUserVO.setAccountType(_ctx.stringValue("GetCheckUserSummaryResponse.Result.UserList["+ i +"].AccountType"));
			iTagSimpleUserVO.setAccountNo(_ctx.stringValue("GetCheckUserSummaryResponse.Result.UserList["+ i +"].AccountNo"));

			userList.add(iTagSimpleUserVO);
		}
		result.setUserList(userList);
		getCheckUserSummaryResponse.setResult(result);
	 
	 	return getCheckUserSummaryResponse;
	}
}