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

import com.aliyuncs.itag.model.v20210517.GetMarkPersonDetailResponse;
import com.aliyuncs.itag.model.v20210517.GetMarkPersonDetailResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetMarkPersonDetailResponse.Result.ITagBaseReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMarkPersonDetailResponseUnmarshaller {

	public static GetMarkPersonDetailResponse unmarshall(GetMarkPersonDetailResponse getMarkPersonDetailResponse, UnmarshallerContext _ctx) {
		
		getMarkPersonDetailResponse.setRequestId(_ctx.stringValue("GetMarkPersonDetailResponse.RequestId"));
		getMarkPersonDetailResponse.setCode(_ctx.stringValue("GetMarkPersonDetailResponse.Code"));
		getMarkPersonDetailResponse.setErrInfo(_ctx.stringValue("GetMarkPersonDetailResponse.ErrInfo"));
		getMarkPersonDetailResponse.setMsg(_ctx.stringValue("GetMarkPersonDetailResponse.Msg"));
		getMarkPersonDetailResponse.setSucc(_ctx.booleanValue("GetMarkPersonDetailResponse.Succ"));
		getMarkPersonDetailResponse.setErrorCode(_ctx.stringValue("GetMarkPersonDetailResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("GetMarkPersonDetailResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("GetMarkPersonDetailResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("GetMarkPersonDetailResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("GetMarkPersonDetailResponse.Result.TotalPage"));

		List<ITagBaseReportResponse> list = new ArrayList<ITagBaseReportResponse>();
		for (int i = 0; i < _ctx.lengthValue("GetMarkPersonDetailResponse.Result.List.Length"); i++) {
			ITagBaseReportResponse iTagBaseReportResponse = new ITagBaseReportResponse();
			iTagBaseReportResponse.setTotalDisable(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].TotalDisable"));
			iTagBaseReportResponse.setUpdateTime(_ctx.stringValue("GetMarkPersonDetailResponse.Result.List["+ i +"].UpdateTime"));
			iTagBaseReportResponse.setSample(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].Sample"));
			iTagBaseReportResponse.setTotalMark(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].TotalMark"));
			iTagBaseReportResponse.setNoRejectMark(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].NoRejectMark"));
			iTagBaseReportResponse.setTotalChecked(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].TotalChecked"));
			iTagBaseReportResponse.setCheckedError(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].CheckedError"));
			iTagBaseReportResponse.setCheckedAccuracy(_ctx.doubleValue("GetMarkPersonDetailResponse.Result.List["+ i +"].CheckedAccuracy"));
			iTagBaseReportResponse.setCheckedReject(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].CheckedReject"));
			iTagBaseReportResponse.setCheckedFix(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].CheckedFix"));
			iTagBaseReportResponse.setTotalSampled(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].TotalSampled"));
			iTagBaseReportResponse.setSampledError(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].SampledError"));
			iTagBaseReportResponse.setSampledReject(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].SampledReject"));
			iTagBaseReportResponse.setSampledFix(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].SampledFix"));
			iTagBaseReportResponse.setSampledAccuracy(_ctx.doubleValue("GetMarkPersonDetailResponse.Result.List["+ i +"].SampledAccuracy"));
			iTagBaseReportResponse.setTotalSampling(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].TotalSampling"));
			iTagBaseReportResponse.setSamplingError(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].SamplingError"));
			iTagBaseReportResponse.setSamplingReject(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].SamplingReject"));
			iTagBaseReportResponse.setSamplingFix(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].SamplingFix"));
			iTagBaseReportResponse.setSamplingAccuracy(_ctx.doubleValue("GetMarkPersonDetailResponse.Result.List["+ i +"].SamplingAccuracy"));
			iTagBaseReportResponse.setTotalCheck(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].TotalCheck"));
			iTagBaseReportResponse.setNoRejectCheck(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].NoRejectCheck"));
			iTagBaseReportResponse.setCheckError(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].CheckError"));
			iTagBaseReportResponse.setCheckAccuracy(_ctx.doubleValue("GetMarkPersonDetailResponse.Result.List["+ i +"].CheckAccuracy"));
			iTagBaseReportResponse.setCheckReject(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].CheckReject"));
			iTagBaseReportResponse.setCheckFix(_ctx.integerValue("GetMarkPersonDetailResponse.Result.List["+ i +"].CheckFix"));
			iTagBaseReportResponse.setUserName(_ctx.stringValue("GetMarkPersonDetailResponse.Result.List["+ i +"].UserName"));
			iTagBaseReportResponse.setUserId(_ctx.stringValue("GetMarkPersonDetailResponse.Result.List["+ i +"].UserId"));
			iTagBaseReportResponse.setTaskId(_ctx.stringValue("GetMarkPersonDetailResponse.Result.List["+ i +"].TaskId"));
			iTagBaseReportResponse.setTaskName(_ctx.stringValue("GetMarkPersonDetailResponse.Result.List["+ i +"].TaskName"));
			iTagBaseReportResponse.setBizClassify(_ctx.stringValue("GetMarkPersonDetailResponse.Result.List["+ i +"].BizClassify"));
			iTagBaseReportResponse.setWorkflow(_ctx.stringValue("GetMarkPersonDetailResponse.Result.List["+ i +"].Workflow"));
			iTagBaseReportResponse.setWorkTime(_ctx.stringValue("GetMarkPersonDetailResponse.Result.List["+ i +"].WorkTime"));
			iTagBaseReportResponse.setTotalPDF(_ctx.longValue("GetMarkPersonDetailResponse.Result.List["+ i +"].TotalPDF"));
			iTagBaseReportResponse.setNoRejectPDF(_ctx.longValue("GetMarkPersonDetailResponse.Result.List["+ i +"].NoRejectPDF"));
			iTagBaseReportResponse.setTotalAudio(_ctx.longValue("GetMarkPersonDetailResponse.Result.List["+ i +"].TotalAudio"));
			iTagBaseReportResponse.setNoRejectAudio(_ctx.longValue("GetMarkPersonDetailResponse.Result.List["+ i +"].NoRejectAudio"));
			iTagBaseReportResponse.setTotalVideo(_ctx.longValue("GetMarkPersonDetailResponse.Result.List["+ i +"].TotalVideo"));
			iTagBaseReportResponse.setNoRejectVideo(_ctx.longValue("GetMarkPersonDetailResponse.Result.List["+ i +"].NoRejectVideo"));
			iTagBaseReportResponse.setMarkTime(_ctx.doubleValue("GetMarkPersonDetailResponse.Result.List["+ i +"].MarkTime"));
			iTagBaseReportResponse.setMarkEfficiency(_ctx.doubleValue("GetMarkPersonDetailResponse.Result.List["+ i +"].MarkEfficiency"));
			iTagBaseReportResponse.setCheckTime(_ctx.doubleValue("GetMarkPersonDetailResponse.Result.List["+ i +"].CheckTime"));
			iTagBaseReportResponse.setCheckEfficiency(_ctx.doubleValue("GetMarkPersonDetailResponse.Result.List["+ i +"].CheckEfficiency"));

			list.add(iTagBaseReportResponse);
		}
		result.setList(list);
		getMarkPersonDetailResponse.setResult(result);
	 
	 	return getMarkPersonDetailResponse;
	}
}