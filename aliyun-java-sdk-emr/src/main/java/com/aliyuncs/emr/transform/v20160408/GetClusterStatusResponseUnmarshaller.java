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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.GetClusterStatusResponse;
import com.aliyuncs.emr.model.v20160408.GetClusterStatusResponse.Status;
import com.aliyuncs.emr.model.v20160408.GetClusterStatusResponse.Status.SeriesInfo;
import com.aliyuncs.emr.model.v20160408.GetClusterStatusResponse.Status.SeriesInfo.SeriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterStatusResponseUnmarshaller {

	public static GetClusterStatusResponse unmarshall(GetClusterStatusResponse getClusterStatusResponse, UnmarshallerContext context) {
		
		getClusterStatusResponse.setRequestId(context.stringValue("GetClusterStatusResponse.RequestId"));

		List<Status> statusList = new ArrayList<Status>();
		for (int i = 0; i < context.lengthValue("GetClusterStatusResponse.StatusList.Length"); i++) {
			Status status = new Status();
			status.setName(context.stringValue("GetClusterStatusResponse.StatusList["+ i +"].Name"));
			status.setLegend(context.stringValue("GetClusterStatusResponse.StatusList["+ i +"].Legend"));
			status.setUnit(context.stringValue("GetClusterStatusResponse.StatusList["+ i +"].Unit"));

			List<String> lineNames = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetClusterStatusResponse.StatusList["+ i +"].LineNames.Length"); j++) {
				lineNames.add(context.stringValue("GetClusterStatusResponse.StatusList["+ i +"].LineNames["+ j +"]"));
			}
			status.setLineNames(lineNames);

			List<String> times = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetClusterStatusResponse.StatusList["+ i +"].Times.Length"); j++) {
				times.add(context.stringValue("GetClusterStatusResponse.StatusList["+ i +"].Times["+ j +"]"));
			}
			status.setTimes(times);

			List<SeriesInfo> series = new ArrayList<SeriesInfo>();
			for (int j = 0; j < context.lengthValue("GetClusterStatusResponse.StatusList["+ i +"].Series.Length"); j++) {
				SeriesInfo seriesInfo = new SeriesInfo();

				List<SeriesItem> seriesItems = new ArrayList<SeriesItem>();
				for (int k = 0; k < context.lengthValue("GetClusterStatusResponse.StatusList["+ i +"].Series["+ j +"].SeriesItems.Length"); k++) {
					SeriesItem seriesItem = new SeriesItem();
					seriesItem.setSeriesValue(context.floatValue("GetClusterStatusResponse.StatusList["+ i +"].Series["+ j +"].SeriesItems["+ k +"].SeriesValue"));

					seriesItems.add(seriesItem);
				}
				seriesInfo.setSeriesItems(seriesItems);

				series.add(seriesInfo);
			}
			status.setSeries(series);

			statusList.add(status);
		}
		getClusterStatusResponse.setStatusList(statusList);
	 
	 	return getClusterStatusResponse;
	}
}