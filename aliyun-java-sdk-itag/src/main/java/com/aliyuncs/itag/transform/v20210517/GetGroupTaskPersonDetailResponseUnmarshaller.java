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

import com.aliyuncs.itag.model.v20210517.GetGroupTaskPersonDetailResponse;
import com.aliyuncs.itag.model.v20210517.GetGroupTaskPersonDetailResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetGroupTaskPersonDetailResponse.Result.ITagBaseReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGroupTaskPersonDetailResponseUnmarshaller {

	public static GetGroupTaskPersonDetailResponse unmarshall(GetGroupTaskPersonDetailResponse getGroupTaskPersonDetailResponse, UnmarshallerContext _ctx) {
		
		getGroupTaskPersonDetailResponse.setRequestId(_ctx.stringValue("GetGroupTaskPersonDetailResponse.RequestId"));
		getGroupTaskPersonDetailResponse.setCode(_ctx.stringValue("GetGroupTaskPersonDetailResponse.Code"));
		getGroupTaskPersonDetailResponse.setErrInfo(_ctx.stringValue("GetGroupTaskPersonDetailResponse.ErrInfo"));
		getGroupTaskPersonDetailResponse.setMsg(_ctx.stringValue("GetGroupTaskPersonDetailResponse.Msg"));
		getGroupTaskPersonDetailResponse.setSucc(_ctx.booleanValue("GetGroupTaskPersonDetailResponse.Succ"));
		getGroupTaskPersonDetailResponse.setErrorCode(_ctx.stringValue("GetGroupTaskPersonDetailResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("GetGroupTaskPersonDetailResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("GetGroupTaskPersonDetailResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("GetGroupTaskPersonDetailResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("GetGroupTaskPersonDetailResponse.Result.TotalPage"));

		List<ITagBaseReportResponse> list = new ArrayList<ITagBaseReportResponse>();
		for (int i = 0; i < _ctx.lengthValue("GetGroupTaskPersonDetailResponse.Result.List.Length"); i++) {
			ITagBaseReportResponse iTagBaseReportResponse = new ITagBaseReportResponse();
			iTagBaseReportResponse.setTotalDisable(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].TotalDisable"));
			iTagBaseReportResponse.setUpdateTime(_ctx.stringValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].UpdateTime"));
			iTagBaseReportResponse.setSample(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].Sample"));
			iTagBaseReportResponse.setTotalMark(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].TotalMark"));
			iTagBaseReportResponse.setNoRejectMark(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].NoRejectMark"));
			iTagBaseReportResponse.setTotalChecked(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].TotalChecked"));
			iTagBaseReportResponse.setCheckedError(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].CheckedError"));
			iTagBaseReportResponse.setCheckedAccuracy(_ctx.doubleValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].CheckedAccuracy"));
			iTagBaseReportResponse.setCheckedReject(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].CheckedReject"));
			iTagBaseReportResponse.setCheckedFix(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].CheckedFix"));
			iTagBaseReportResponse.setTotalSampled(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].TotalSampled"));
			iTagBaseReportResponse.setSampledError(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].SampledError"));
			iTagBaseReportResponse.setSampledReject(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].SampledReject"));
			iTagBaseReportResponse.setSampledFix(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].SampledFix"));
			iTagBaseReportResponse.setSampledAccuracy(_ctx.doubleValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].SampledAccuracy"));
			iTagBaseReportResponse.setTotalSampling(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].TotalSampling"));
			iTagBaseReportResponse.setSamplingError(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].SamplingError"));
			iTagBaseReportResponse.setSamplingReject(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].SamplingReject"));
			iTagBaseReportResponse.setSamplingFix(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].SamplingFix"));
			iTagBaseReportResponse.setSamplingAccuracy(_ctx.doubleValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].SamplingAccuracy"));
			iTagBaseReportResponse.setTotalCheck(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].TotalCheck"));
			iTagBaseReportResponse.setNoRejectCheck(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].NoRejectCheck"));
			iTagBaseReportResponse.setCheckError(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].CheckError"));
			iTagBaseReportResponse.setCheckAccuracy(_ctx.doubleValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].CheckAccuracy"));
			iTagBaseReportResponse.setCheckReject(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].CheckReject"));
			iTagBaseReportResponse.setCheckFix(_ctx.integerValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].CheckFix"));
			iTagBaseReportResponse.setUserName(_ctx.stringValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].UserName"));
			iTagBaseReportResponse.setUserId(_ctx.stringValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].UserId"));
			iTagBaseReportResponse.setTaskId(_ctx.stringValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].TaskId"));
			iTagBaseReportResponse.setTaskName(_ctx.stringValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].TaskName"));
			iTagBaseReportResponse.setBizClassify(_ctx.stringValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].BizClassify"));
			iTagBaseReportResponse.setWorkflow(_ctx.stringValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].Workflow"));
			iTagBaseReportResponse.setWorkTime(_ctx.stringValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].WorkTime"));
			iTagBaseReportResponse.setTotalPDF(_ctx.longValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].TotalPDF"));
			iTagBaseReportResponse.setNoRejectPDF(_ctx.longValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].NoRejectPDF"));
			iTagBaseReportResponse.setTotalAudio(_ctx.longValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].TotalAudio"));
			iTagBaseReportResponse.setNoRejectAudio(_ctx.longValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].NoRejectAudio"));
			iTagBaseReportResponse.setTotalVideo(_ctx.longValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].TotalVideo"));
			iTagBaseReportResponse.setNoRejectVideo(_ctx.longValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].NoRejectVideo"));
			iTagBaseReportResponse.setMarkTime(_ctx.doubleValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].MarkTime"));
			iTagBaseReportResponse.setMarkEfficiency(_ctx.doubleValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].MarkEfficiency"));
			iTagBaseReportResponse.setCheckTime(_ctx.doubleValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].CheckTime"));
			iTagBaseReportResponse.setCheckEfficiency(_ctx.doubleValue("GetGroupTaskPersonDetailResponse.Result.List["+ i +"].CheckEfficiency"));

			list.add(iTagBaseReportResponse);
		}
		result.setList(list);
		getGroupTaskPersonDetailResponse.setResult(result);
	 
	 	return getGroupTaskPersonDetailResponse;
	}
}