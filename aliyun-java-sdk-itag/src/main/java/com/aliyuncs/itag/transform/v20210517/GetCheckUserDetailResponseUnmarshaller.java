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

import com.aliyuncs.itag.model.v20210517.GetCheckUserDetailResponse;
import com.aliyuncs.itag.model.v20210517.GetCheckUserDetailResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetCheckUserDetailResponse.Result.ITagMarkResultReport;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCheckUserDetailResponseUnmarshaller {

	public static GetCheckUserDetailResponse unmarshall(GetCheckUserDetailResponse getCheckUserDetailResponse, UnmarshallerContext _ctx) {
		
		getCheckUserDetailResponse.setRequestId(_ctx.stringValue("GetCheckUserDetailResponse.RequestId"));
		getCheckUserDetailResponse.setCode(_ctx.stringValue("GetCheckUserDetailResponse.Code"));
		getCheckUserDetailResponse.setErrInfo(_ctx.stringValue("GetCheckUserDetailResponse.ErrInfo"));
		getCheckUserDetailResponse.setMsg(_ctx.stringValue("GetCheckUserDetailResponse.Msg"));
		getCheckUserDetailResponse.setSucc(_ctx.booleanValue("GetCheckUserDetailResponse.Succ"));
		getCheckUserDetailResponse.setErrorCode(_ctx.stringValue("GetCheckUserDetailResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("GetCheckUserDetailResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("GetCheckUserDetailResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("GetCheckUserDetailResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("GetCheckUserDetailResponse.Result.TotalPage"));

		List<ITagMarkResultReport> list = new ArrayList<ITagMarkResultReport>();
		for (int i = 0; i < _ctx.lengthValue("GetCheckUserDetailResponse.Result.List.Length"); i++) {
			ITagMarkResultReport iTagMarkResultReport = new ITagMarkResultReport();
			iTagMarkResultReport.setTotalDisable(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].TotalDisable"));
			iTagMarkResultReport.setUpdateTime(_ctx.stringValue("GetCheckUserDetailResponse.Result.List["+ i +"].UpdateTime"));
			iTagMarkResultReport.setSample(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].Sample"));
			iTagMarkResultReport.setTotalMark(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].TotalMark"));
			iTagMarkResultReport.setNoRejectMark(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].NoRejectMark"));
			iTagMarkResultReport.setTotalChecked(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].TotalChecked"));
			iTagMarkResultReport.setCheckedError(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].CheckedError"));
			iTagMarkResultReport.setCheckedAccuracy(_ctx.doubleValue("GetCheckUserDetailResponse.Result.List["+ i +"].CheckedAccuracy"));
			iTagMarkResultReport.setCheckedReject(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].CheckedReject"));
			iTagMarkResultReport.setCheckedFix(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].CheckedFix"));
			iTagMarkResultReport.setTotalSampled(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].TotalSampled"));
			iTagMarkResultReport.setSampledError(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].SampledError"));
			iTagMarkResultReport.setSampledReject(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].SampledReject"));
			iTagMarkResultReport.setSampledFix(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].SampledFix"));
			iTagMarkResultReport.setSampledAccuracy(_ctx.doubleValue("GetCheckUserDetailResponse.Result.List["+ i +"].SampledAccuracy"));
			iTagMarkResultReport.setTotalSampling(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].TotalSampling"));
			iTagMarkResultReport.setSamplingError(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].SamplingError"));
			iTagMarkResultReport.setSamplingReject(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].SamplingReject"));
			iTagMarkResultReport.setSamplingFix(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].SamplingFix"));
			iTagMarkResultReport.setSamplingAccuracy(_ctx.doubleValue("GetCheckUserDetailResponse.Result.List["+ i +"].SamplingAccuracy"));
			iTagMarkResultReport.setTotalCheck(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].TotalCheck"));
			iTagMarkResultReport.setNoRejectCheck(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].NoRejectCheck"));
			iTagMarkResultReport.setCheckError(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].CheckError"));
			iTagMarkResultReport.setCheckAccuracy(_ctx.doubleValue("GetCheckUserDetailResponse.Result.List["+ i +"].CheckAccuracy"));
			iTagMarkResultReport.setCheckReject(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].CheckReject"));
			iTagMarkResultReport.setCheckFix(_ctx.integerValue("GetCheckUserDetailResponse.Result.List["+ i +"].CheckFix"));
			iTagMarkResultReport.setUserName(_ctx.stringValue("GetCheckUserDetailResponse.Result.List["+ i +"].UserName"));
			iTagMarkResultReport.setUserId(_ctx.stringValue("GetCheckUserDetailResponse.Result.List["+ i +"].UserId"));
			iTagMarkResultReport.setTaskId(_ctx.stringValue("GetCheckUserDetailResponse.Result.List["+ i +"].TaskId"));
			iTagMarkResultReport.setTaskName(_ctx.stringValue("GetCheckUserDetailResponse.Result.List["+ i +"].TaskName"));
			iTagMarkResultReport.setBizClassify(_ctx.stringValue("GetCheckUserDetailResponse.Result.List["+ i +"].BizClassify"));
			iTagMarkResultReport.setWorkflow(_ctx.stringValue("GetCheckUserDetailResponse.Result.List["+ i +"].Workflow"));
			iTagMarkResultReport.setWorkTime(_ctx.stringValue("GetCheckUserDetailResponse.Result.List["+ i +"].WorkTime"));
			iTagMarkResultReport.setTotalPDF(_ctx.longValue("GetCheckUserDetailResponse.Result.List["+ i +"].TotalPDF"));
			iTagMarkResultReport.setNoRejectPDF(_ctx.longValue("GetCheckUserDetailResponse.Result.List["+ i +"].NoRejectPDF"));
			iTagMarkResultReport.setTotalAudio(_ctx.longValue("GetCheckUserDetailResponse.Result.List["+ i +"].TotalAudio"));
			iTagMarkResultReport.setNoRejectAudio(_ctx.longValue("GetCheckUserDetailResponse.Result.List["+ i +"].NoRejectAudio"));
			iTagMarkResultReport.setTotalVideo(_ctx.longValue("GetCheckUserDetailResponse.Result.List["+ i +"].TotalVideo"));
			iTagMarkResultReport.setNoRejectVideo(_ctx.longValue("GetCheckUserDetailResponse.Result.List["+ i +"].NoRejectVideo"));
			iTagMarkResultReport.setMarkTime(_ctx.doubleValue("GetCheckUserDetailResponse.Result.List["+ i +"].MarkTime"));
			iTagMarkResultReport.setMarkEfficiency(_ctx.doubleValue("GetCheckUserDetailResponse.Result.List["+ i +"].MarkEfficiency"));
			iTagMarkResultReport.setCheckTime(_ctx.doubleValue("GetCheckUserDetailResponse.Result.List["+ i +"].CheckTime"));
			iTagMarkResultReport.setCheckEfficiency(_ctx.doubleValue("GetCheckUserDetailResponse.Result.List["+ i +"].CheckEfficiency"));

			list.add(iTagMarkResultReport);
		}
		result.setList(list);
		getCheckUserDetailResponse.setResult(result);
	 
	 	return getCheckUserDetailResponse;
	}
}