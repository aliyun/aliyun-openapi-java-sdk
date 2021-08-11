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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.ListHotlineRecordDetailResponse;
import com.aliyuncs.aiccs.model.v20191015.ListHotlineRecordDetailResponse.ResultData;
import com.aliyuncs.aiccs.model.v20191015.ListHotlineRecordDetailResponse.ResultData.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHotlineRecordDetailResponseUnmarshaller {

	public static ListHotlineRecordDetailResponse unmarshall(ListHotlineRecordDetailResponse listHotlineRecordDetailResponse, UnmarshallerContext _ctx) {
		
		listHotlineRecordDetailResponse.setRequestId(_ctx.stringValue("ListHotlineRecordDetailResponse.RequestId"));
		listHotlineRecordDetailResponse.setMessage(_ctx.stringValue("ListHotlineRecordDetailResponse.Message"));
		listHotlineRecordDetailResponse.setHttpStatusCode(_ctx.integerValue("ListHotlineRecordDetailResponse.HttpStatusCode"));
		listHotlineRecordDetailResponse.setCode(_ctx.stringValue("ListHotlineRecordDetailResponse.Code"));
		listHotlineRecordDetailResponse.setSuccess(_ctx.booleanValue("ListHotlineRecordDetailResponse.Success"));

		ResultData resultData = new ResultData();
		resultData.setCurrentPage(_ctx.longValue("ListHotlineRecordDetailResponse.ResultData.CurrentPage"));
		resultData.setTotalResults(_ctx.longValue("ListHotlineRecordDetailResponse.ResultData.TotalResults"));
		resultData.setTotalPage(_ctx.longValue("ListHotlineRecordDetailResponse.ResultData.TotalPage"));
		resultData.setOnePageSize(_ctx.longValue("ListHotlineRecordDetailResponse.ResultData.OnePageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListHotlineRecordDetailResponse.ResultData.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setServicerName(_ctx.stringValue("ListHotlineRecordDetailResponse.ResultData.Data["+ i +"].ServicerName"));
			dataItem.setStartTime(_ctx.longValue("ListHotlineRecordDetailResponse.ResultData.Data["+ i +"].StartTime"));
			dataItem.setEndTime(_ctx.longValue("ListHotlineRecordDetailResponse.ResultData.Data["+ i +"].EndTime"));
			dataItem.setOssUrl(_ctx.stringValue("ListHotlineRecordDetailResponse.ResultData.Data["+ i +"].OssUrl"));

			data.add(dataItem);
		}
		resultData.setData(data);
		listHotlineRecordDetailResponse.setResultData(resultData);
	 
	 	return listHotlineRecordDetailResponse;
	}
}