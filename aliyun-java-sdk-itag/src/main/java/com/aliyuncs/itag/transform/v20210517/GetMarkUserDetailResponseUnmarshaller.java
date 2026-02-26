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

import com.aliyuncs.itag.model.v20210517.GetMarkUserDetailResponse;
import com.aliyuncs.itag.model.v20210517.GetMarkUserDetailResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetMarkUserDetailResponse.Result.ITagMarkResultReport;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMarkUserDetailResponseUnmarshaller {

	public static GetMarkUserDetailResponse unmarshall(GetMarkUserDetailResponse getMarkUserDetailResponse, UnmarshallerContext _ctx) {
		
		getMarkUserDetailResponse.setRequestId(_ctx.stringValue("GetMarkUserDetailResponse.RequestId"));
		getMarkUserDetailResponse.setCode(_ctx.stringValue("GetMarkUserDetailResponse.Code"));
		getMarkUserDetailResponse.setErrInfo(_ctx.stringValue("GetMarkUserDetailResponse.ErrInfo"));
		getMarkUserDetailResponse.setMsg(_ctx.stringValue("GetMarkUserDetailResponse.Msg"));
		getMarkUserDetailResponse.setSucc(_ctx.booleanValue("GetMarkUserDetailResponse.Succ"));
		getMarkUserDetailResponse.setErrorCode(_ctx.stringValue("GetMarkUserDetailResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("GetMarkUserDetailResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("GetMarkUserDetailResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("GetMarkUserDetailResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("GetMarkUserDetailResponse.Result.TotalPage"));

		List<ITagMarkResultReport> list = new ArrayList<ITagMarkResultReport>();
		for (int i = 0; i < _ctx.lengthValue("GetMarkUserDetailResponse.Result.List.Length"); i++) {
			ITagMarkResultReport iTagMarkResultReport = new ITagMarkResultReport();
			iTagMarkResultReport.setTotalDisable(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].TotalDisable"));
			iTagMarkResultReport.setUpdateTime(_ctx.stringValue("GetMarkUserDetailResponse.Result.List["+ i +"].UpdateTime"));
			iTagMarkResultReport.setSample(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].Sample"));
			iTagMarkResultReport.setTotalMark(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].TotalMark"));
			iTagMarkResultReport.setNoRejectMark(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].NoRejectMark"));
			iTagMarkResultReport.setTotalChecked(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].TotalChecked"));
			iTagMarkResultReport.setCheckedError(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].CheckedError"));
			iTagMarkResultReport.setCheckedAccuracy(_ctx.doubleValue("GetMarkUserDetailResponse.Result.List["+ i +"].CheckedAccuracy"));
			iTagMarkResultReport.setCheckedReject(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].CheckedReject"));
			iTagMarkResultReport.setCheckedFix(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].CheckedFix"));
			iTagMarkResultReport.setTotalSampled(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].TotalSampled"));
			iTagMarkResultReport.setSampledError(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].SampledError"));
			iTagMarkResultReport.setSampledReject(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].SampledReject"));
			iTagMarkResultReport.setSampledFix(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].SampledFix"));
			iTagMarkResultReport.setSampledAccuracy(_ctx.doubleValue("GetMarkUserDetailResponse.Result.List["+ i +"].SampledAccuracy"));
			iTagMarkResultReport.setTotalSampling(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].TotalSampling"));
			iTagMarkResultReport.setSamplingError(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].SamplingError"));
			iTagMarkResultReport.setSamplingReject(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].SamplingReject"));
			iTagMarkResultReport.setSamplingFix(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].SamplingFix"));
			iTagMarkResultReport.setSamplingAccuracy(_ctx.doubleValue("GetMarkUserDetailResponse.Result.List["+ i +"].SamplingAccuracy"));
			iTagMarkResultReport.setTotalCheck(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].TotalCheck"));
			iTagMarkResultReport.setNoRejectCheck(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].NoRejectCheck"));
			iTagMarkResultReport.setCheckError(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].CheckError"));
			iTagMarkResultReport.setCheckAccuracy(_ctx.doubleValue("GetMarkUserDetailResponse.Result.List["+ i +"].CheckAccuracy"));
			iTagMarkResultReport.setCheckReject(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].CheckReject"));
			iTagMarkResultReport.setCheckFix(_ctx.integerValue("GetMarkUserDetailResponse.Result.List["+ i +"].CheckFix"));
			iTagMarkResultReport.setUserName(_ctx.stringValue("GetMarkUserDetailResponse.Result.List["+ i +"].UserName"));
			iTagMarkResultReport.setUserId(_ctx.stringValue("GetMarkUserDetailResponse.Result.List["+ i +"].UserId"));
			iTagMarkResultReport.setTaskId(_ctx.stringValue("GetMarkUserDetailResponse.Result.List["+ i +"].TaskId"));
			iTagMarkResultReport.setTaskName(_ctx.stringValue("GetMarkUserDetailResponse.Result.List["+ i +"].TaskName"));
			iTagMarkResultReport.setBizClassify(_ctx.stringValue("GetMarkUserDetailResponse.Result.List["+ i +"].BizClassify"));
			iTagMarkResultReport.setWorkflow(_ctx.stringValue("GetMarkUserDetailResponse.Result.List["+ i +"].Workflow"));
			iTagMarkResultReport.setWorkTime(_ctx.stringValue("GetMarkUserDetailResponse.Result.List["+ i +"].WorkTime"));
			iTagMarkResultReport.setTotalPDF(_ctx.longValue("GetMarkUserDetailResponse.Result.List["+ i +"].TotalPDF"));
			iTagMarkResultReport.setNoRejectPDF(_ctx.longValue("GetMarkUserDetailResponse.Result.List["+ i +"].NoRejectPDF"));
			iTagMarkResultReport.setTotalAudio(_ctx.longValue("GetMarkUserDetailResponse.Result.List["+ i +"].TotalAudio"));
			iTagMarkResultReport.setNoRejectAudio(_ctx.longValue("GetMarkUserDetailResponse.Result.List["+ i +"].NoRejectAudio"));
			iTagMarkResultReport.setTotalVideo(_ctx.longValue("GetMarkUserDetailResponse.Result.List["+ i +"].TotalVideo"));
			iTagMarkResultReport.setNoRejectVideo(_ctx.longValue("GetMarkUserDetailResponse.Result.List["+ i +"].NoRejectVideo"));
			iTagMarkResultReport.setMarkTime(_ctx.doubleValue("GetMarkUserDetailResponse.Result.List["+ i +"].MarkTime"));
			iTagMarkResultReport.setMarkEfficiency(_ctx.doubleValue("GetMarkUserDetailResponse.Result.List["+ i +"].MarkEfficiency"));
			iTagMarkResultReport.setCheckTime(_ctx.doubleValue("GetMarkUserDetailResponse.Result.List["+ i +"].CheckTime"));
			iTagMarkResultReport.setCheckEfficiency(_ctx.doubleValue("GetMarkUserDetailResponse.Result.List["+ i +"].CheckEfficiency"));

			list.add(iTagMarkResultReport);
		}
		result.setList(list);
		getMarkUserDetailResponse.setResult(result);
	 
	 	return getMarkUserDetailResponse;
	}
}