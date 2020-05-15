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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.DescribeSyncReportDetailResponse;
import com.aliyuncs.airec.model.v20181012.DescribeSyncReportDetailResponse.ResultItem;
import com.aliyuncs.airec.model.v20181012.DescribeSyncReportDetailResponse.ResultItem.HistoryDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSyncReportDetailResponseUnmarshaller {

	public static DescribeSyncReportDetailResponse unmarshall(DescribeSyncReportDetailResponse describeSyncReportDetailResponse, UnmarshallerContext _ctx) {
		
		describeSyncReportDetailResponse.setRequestId(_ctx.stringValue("DescribeSyncReportDetailResponse.RequestId"));
		describeSyncReportDetailResponse.setCode(_ctx.stringValue("DescribeSyncReportDetailResponse.Code"));
		describeSyncReportDetailResponse.setMessage(_ctx.stringValue("DescribeSyncReportDetailResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSyncReportDetailResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setType(_ctx.stringValue("DescribeSyncReportDetailResponse.Result["+ i +"].Type"));
			resultItem.setErrorPercent(_ctx.floatValue("DescribeSyncReportDetailResponse.Result["+ i +"].ErrorPercent"));
			resultItem.setErrorCount(_ctx.integerValue("DescribeSyncReportDetailResponse.Result["+ i +"].ErrorCount"));
			resultItem.setDefaultDisplay(_ctx.booleanValue("DescribeSyncReportDetailResponse.Result["+ i +"].DefaultDisplay"));
			resultItem.setSampleDisplay(_ctx.booleanValue("DescribeSyncReportDetailResponse.Result["+ i +"].SampleDisplay"));

			List<HistoryDataItem> historyData = new ArrayList<HistoryDataItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSyncReportDetailResponse.Result["+ i +"].HistoryData.Length"); j++) {
				HistoryDataItem historyDataItem = new HistoryDataItem();
				historyDataItem.setErrorPercent(_ctx.floatValue("DescribeSyncReportDetailResponse.Result["+ i +"].HistoryData["+ j +"].ErrorPercent"));
				historyDataItem.setStartTime(_ctx.longValue("DescribeSyncReportDetailResponse.Result["+ i +"].HistoryData["+ j +"].StartTime"));
				historyDataItem.setEndTime(_ctx.longValue("DescribeSyncReportDetailResponse.Result["+ i +"].HistoryData["+ j +"].EndTime"));

				historyData.add(historyDataItem);
			}
			resultItem.setHistoryData(historyData);

			result.add(resultItem);
		}
		describeSyncReportDetailResponse.setResult(result);
	 
	 	return describeSyncReportDetailResponse;
	}
}