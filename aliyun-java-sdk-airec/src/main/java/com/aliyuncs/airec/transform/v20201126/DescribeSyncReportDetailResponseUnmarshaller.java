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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.DescribeSyncReportDetailResponse;
import com.aliyuncs.airec.model.v20201126.DescribeSyncReportDetailResponse.ResultItem;
import com.aliyuncs.airec.model.v20201126.DescribeSyncReportDetailResponse.ResultItem.HistoryDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSyncReportDetailResponseUnmarshaller {

	public static DescribeSyncReportDetailResponse unmarshall(DescribeSyncReportDetailResponse describeSyncReportDetailResponse, UnmarshallerContext _ctx) {
		
		describeSyncReportDetailResponse.setCode(_ctx.stringValue("DescribeSyncReportDetailResponse.code"));
		describeSyncReportDetailResponse.setMessage(_ctx.stringValue("DescribeSyncReportDetailResponse.message"));
		describeSyncReportDetailResponse.setRequestId(_ctx.stringValue("DescribeSyncReportDetailResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSyncReportDetailResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDefaultDisplay(_ctx.booleanValue("DescribeSyncReportDetailResponse.result["+ i +"].defaultDisplay"));
			resultItem.setErrorCount(_ctx.integerValue("DescribeSyncReportDetailResponse.result["+ i +"].errorCount"));
			resultItem.setErrorPercent(_ctx.floatValue("DescribeSyncReportDetailResponse.result["+ i +"].errorPercent"));
			resultItem.setSampleDisplay(_ctx.booleanValue("DescribeSyncReportDetailResponse.result["+ i +"].sampleDisplay"));
			resultItem.setType(_ctx.stringValue("DescribeSyncReportDetailResponse.result["+ i +"].type"));

			List<HistoryDataItem> historyData = new ArrayList<HistoryDataItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSyncReportDetailResponse.result["+ i +"].historyData.Length"); j++) {
				HistoryDataItem historyDataItem = new HistoryDataItem();
				historyDataItem.setEndTime(_ctx.longValue("DescribeSyncReportDetailResponse.result["+ i +"].historyData["+ j +"].endTime"));
				historyDataItem.setErrorPercent(_ctx.floatValue("DescribeSyncReportDetailResponse.result["+ i +"].historyData["+ j +"].errorPercent"));
				historyDataItem.setStartTime(_ctx.longValue("DescribeSyncReportDetailResponse.result["+ i +"].historyData["+ j +"].startTime"));

				historyData.add(historyDataItem);
			}
			resultItem.setHistoryData(historyData);

			result.add(resultItem);
		}
		describeSyncReportDetailResponse.setResult(result);
	 
	 	return describeSyncReportDetailResponse;
	}
}