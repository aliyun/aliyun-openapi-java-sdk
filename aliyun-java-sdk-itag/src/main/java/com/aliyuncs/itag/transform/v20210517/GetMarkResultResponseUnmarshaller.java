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

import com.aliyuncs.itag.model.v20210517.GetMarkResultResponse;
import com.aliyuncs.itag.model.v20210517.GetMarkResultResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetMarkResultResponse.Result.ITagMarkResultReport;
import com.aliyuncs.itag.model.v20210517.GetMarkResultResponse.Result.ITagMarkResultReport.ITagMarkResultDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMarkResultResponseUnmarshaller {

	public static GetMarkResultResponse unmarshall(GetMarkResultResponse getMarkResultResponse, UnmarshallerContext _ctx) {
		
		getMarkResultResponse.setRequestId(_ctx.stringValue("GetMarkResultResponse.RequestId"));
		getMarkResultResponse.setCode(_ctx.stringValue("GetMarkResultResponse.Code"));
		getMarkResultResponse.setErrInfo(_ctx.stringValue("GetMarkResultResponse.ErrInfo"));
		getMarkResultResponse.setMsg(_ctx.stringValue("GetMarkResultResponse.Msg"));
		getMarkResultResponse.setSucc(_ctx.booleanValue("GetMarkResultResponse.Succ"));
		getMarkResultResponse.setErrorCode(_ctx.stringValue("GetMarkResultResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("GetMarkResultResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("GetMarkResultResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("GetMarkResultResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("GetMarkResultResponse.Result.TotalPage"));

		List<ITagMarkResultReport> list = new ArrayList<ITagMarkResultReport>();
		for (int i = 0; i < _ctx.lengthValue("GetMarkResultResponse.Result.List.Length"); i++) {
			ITagMarkResultReport iTagMarkResultReport = new ITagMarkResultReport();
			iTagMarkResultReport.setUpdateTime(_ctx.stringValue("GetMarkResultResponse.Result.List["+ i +"].UpdateTime"));
			iTagMarkResultReport.setLabelType(_ctx.stringValue("GetMarkResultResponse.Result.List["+ i +"].LabelType"));
			iTagMarkResultReport.setMarkTitle(_ctx.stringValue("GetMarkResultResponse.Result.List["+ i +"].MarkTitle"));

			List<ITagMarkResultDetail> labelList = new ArrayList<ITagMarkResultDetail>();
			for (int j = 0; j < _ctx.lengthValue("GetMarkResultResponse.Result.List["+ i +"].LabelList.Length"); j++) {
				ITagMarkResultDetail iTagMarkResultDetail = new ITagMarkResultDetail();
				iTagMarkResultDetail.setLabelName(_ctx.stringValue("GetMarkResultResponse.Result.List["+ i +"].LabelList["+ j +"].LabelName"));
				iTagMarkResultDetail.setLabelRate(_ctx.doubleValue("GetMarkResultResponse.Result.List["+ i +"].LabelList["+ j +"].LabelRate"));
				iTagMarkResultDetail.setLabelCount(_ctx.integerValue("GetMarkResultResponse.Result.List["+ i +"].LabelList["+ j +"].LabelCount"));

				labelList.add(iTagMarkResultDetail);
			}
			iTagMarkResultReport.setLabelList(labelList);

			list.add(iTagMarkResultReport);
		}
		result.setList(list);
		getMarkResultResponse.setResult(result);
	 
	 	return getMarkResultResponse;
	}
}