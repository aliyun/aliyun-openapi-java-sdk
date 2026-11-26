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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.GetSaasDataUnitUsageResponse;
import com.aliyuncs.gpdb.model.v20160503.GetSaasDataUnitUsageResponse.DistributionItem;
import com.aliyuncs.gpdb.model.v20160503.GetSaasDataUnitUsageResponse.Summary;
import com.aliyuncs.gpdb.model.v20160503.GetSaasDataUnitUsageResponse.TimeSeriesItem;
import com.aliyuncs.gpdb.model.v20160503.GetSaasDataUnitUsageResponse.TimeSeriesItem.ScenesItem;
import com.aliyuncs.gpdb.model.v20160503.GetSaasDataUnitUsageResponse.WarningsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSaasDataUnitUsageResponseUnmarshaller {

	public static GetSaasDataUnitUsageResponse unmarshall(GetSaasDataUnitUsageResponse getSaasDataUnitUsageResponse, UnmarshallerContext _ctx) {
		
		getSaasDataUnitUsageResponse.setRequestId(_ctx.stringValue("GetSaasDataUnitUsageResponse.RequestId"));
		getSaasDataUnitUsageResponse.setEndTime(_ctx.stringValue("GetSaasDataUnitUsageResponse.EndTime"));
		getSaasDataUnitUsageResponse.setStartTime(_ctx.stringValue("GetSaasDataUnitUsageResponse.StartTime"));
		getSaasDataUnitUsageResponse.setServiceId(_ctx.stringValue("GetSaasDataUnitUsageResponse.ServiceId"));

		Summary summary = new Summary();
		summary.setDataUnit(_ctx.stringValue("GetSaasDataUnitUsageResponse.Summary.DataUnit"));
		getSaasDataUnitUsageResponse.setSummary(summary);

		List<TimeSeriesItem> timeSeries = new ArrayList<TimeSeriesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSaasDataUnitUsageResponse.TimeSeries.Length"); i++) {
			TimeSeriesItem timeSeriesItem = new TimeSeriesItem();
			timeSeriesItem.setDataUnit(_ctx.stringValue("GetSaasDataUnitUsageResponse.TimeSeries["+ i +"].DataUnit"));
			timeSeriesItem.setTime(_ctx.stringValue("GetSaasDataUnitUsageResponse.TimeSeries["+ i +"].Time"));

			List<ScenesItem> scenes = new ArrayList<ScenesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetSaasDataUnitUsageResponse.TimeSeries["+ i +"].Scenes.Length"); j++) {
				ScenesItem scenesItem = new ScenesItem();
				scenesItem.setDataUnit(_ctx.stringValue("GetSaasDataUnitUsageResponse.TimeSeries["+ i +"].Scenes["+ j +"].DataUnit"));
				scenesItem.setProjectName(_ctx.stringValue("GetSaasDataUnitUsageResponse.TimeSeries["+ i +"].Scenes["+ j +"].ProjectName"));
				scenesItem.setUsageScene(_ctx.stringValue("GetSaasDataUnitUsageResponse.TimeSeries["+ i +"].Scenes["+ j +"].UsageScene"));
				scenesItem.setProjectId(_ctx.stringValue("GetSaasDataUnitUsageResponse.TimeSeries["+ i +"].Scenes["+ j +"].ProjectId"));

				scenes.add(scenesItem);
			}
			timeSeriesItem.setScenes(scenes);

			timeSeries.add(timeSeriesItem);
		}
		getSaasDataUnitUsageResponse.setTimeSeries(timeSeries);

		List<DistributionItem> distribution = new ArrayList<DistributionItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSaasDataUnitUsageResponse.Distribution.Length"); i++) {
			DistributionItem distributionItem = new DistributionItem();
			distributionItem.setDataUnit(_ctx.stringValue("GetSaasDataUnitUsageResponse.Distribution["+ i +"].DataUnit"));
			distributionItem.setProjectName(_ctx.stringValue("GetSaasDataUnitUsageResponse.Distribution["+ i +"].ProjectName"));
			distributionItem.setUsageScene(_ctx.stringValue("GetSaasDataUnitUsageResponse.Distribution["+ i +"].UsageScene"));
			distributionItem.setUsageSceneName(_ctx.stringValue("GetSaasDataUnitUsageResponse.Distribution["+ i +"].UsageSceneName"));
			distributionItem.setProjectId(_ctx.stringValue("GetSaasDataUnitUsageResponse.Distribution["+ i +"].ProjectId"));

			distribution.add(distributionItem);
		}
		getSaasDataUnitUsageResponse.setDistribution(distribution);

		List<WarningsItem> warnings = new ArrayList<WarningsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSaasDataUnitUsageResponse.Warnings.Length"); i++) {
			WarningsItem warningsItem = new WarningsItem();
			warningsItem.setMessage(_ctx.stringValue("GetSaasDataUnitUsageResponse.Warnings["+ i +"].Message"));
			warningsItem.setCode(_ctx.stringValue("GetSaasDataUnitUsageResponse.Warnings["+ i +"].Code"));

			warnings.add(warningsItem);
		}
		getSaasDataUnitUsageResponse.setWarnings(warnings);
	 
	 	return getSaasDataUnitUsageResponse;
	}
}