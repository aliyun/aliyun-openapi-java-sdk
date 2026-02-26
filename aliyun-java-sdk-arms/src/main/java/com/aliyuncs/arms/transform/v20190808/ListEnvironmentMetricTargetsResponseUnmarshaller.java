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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListEnvironmentMetricTargetsResponse;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentMetricTargetsResponse.Data;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentMetricTargetsResponse.Data.ActiveTargetsItem;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentMetricTargetsResponse.Data.DroppedTargetsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnvironmentMetricTargetsResponseUnmarshaller {

	public static ListEnvironmentMetricTargetsResponse unmarshall(ListEnvironmentMetricTargetsResponse listEnvironmentMetricTargetsResponse, UnmarshallerContext _ctx) {
		
		listEnvironmentMetricTargetsResponse.setRequestId(_ctx.stringValue("ListEnvironmentMetricTargetsResponse.RequestId"));
		listEnvironmentMetricTargetsResponse.setCode(_ctx.integerValue("ListEnvironmentMetricTargetsResponse.Code"));
		listEnvironmentMetricTargetsResponse.setMessage(_ctx.stringValue("ListEnvironmentMetricTargetsResponse.Message"));
		listEnvironmentMetricTargetsResponse.setSuccess(_ctx.booleanValue("ListEnvironmentMetricTargetsResponse.Success"));

		Data data = new Data();

		List<ActiveTargetsItem> activeTargets = new ArrayList<ActiveTargetsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEnvironmentMetricTargetsResponse.Data.ActiveTargets.Length"); i++) {
			ActiveTargetsItem activeTargetsItem = new ActiveTargetsItem();
			activeTargetsItem.setDiscoveredLabels(_ctx.mapValue("ListEnvironmentMetricTargetsResponse.Data.ActiveTargets["+ i +"].DiscoveredLabels"));
			activeTargetsItem.setGlobalUrl(_ctx.stringValue("ListEnvironmentMetricTargetsResponse.Data.ActiveTargets["+ i +"].GlobalUrl"));
			activeTargetsItem.setHealth(_ctx.stringValue("ListEnvironmentMetricTargetsResponse.Data.ActiveTargets["+ i +"].Health"));
			activeTargetsItem.setLabels(_ctx.mapValue("ListEnvironmentMetricTargetsResponse.Data.ActiveTargets["+ i +"].Labels"));
			activeTargetsItem.setLastError(_ctx.stringValue("ListEnvironmentMetricTargetsResponse.Data.ActiveTargets["+ i +"].LastError"));
			activeTargetsItem.setLastScrape(_ctx.stringValue("ListEnvironmentMetricTargetsResponse.Data.ActiveTargets["+ i +"].LastScrape"));
			activeTargetsItem.setLastScrapeDuration(_ctx.doubleValue("ListEnvironmentMetricTargetsResponse.Data.ActiveTargets["+ i +"].LastScrapeDuration"));
			activeTargetsItem.setLastScrapeSeries(_ctx.longValue("ListEnvironmentMetricTargetsResponse.Data.ActiveTargets["+ i +"].LastScrapeSeries"));
			activeTargetsItem.setScrapePool(_ctx.stringValue("ListEnvironmentMetricTargetsResponse.Data.ActiveTargets["+ i +"].ScrapePool"));
			activeTargetsItem.setScrapeUrl(_ctx.stringValue("ListEnvironmentMetricTargetsResponse.Data.ActiveTargets["+ i +"].ScrapeUrl"));

			activeTargets.add(activeTargetsItem);
		}
		data.setActiveTargets(activeTargets);

		List<DroppedTargetsItem> droppedTargets = new ArrayList<DroppedTargetsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEnvironmentMetricTargetsResponse.Data.DroppedTargets.Length"); i++) {
			DroppedTargetsItem droppedTargetsItem = new DroppedTargetsItem();
			droppedTargetsItem.setDiscoveredLabels(_ctx.mapValue("ListEnvironmentMetricTargetsResponse.Data.DroppedTargets["+ i +"].DiscoveredLabels"));
			droppedTargetsItem.setGlobalUrl(_ctx.stringValue("ListEnvironmentMetricTargetsResponse.Data.DroppedTargets["+ i +"].GlobalUrl"));
			droppedTargetsItem.setHealth(_ctx.stringValue("ListEnvironmentMetricTargetsResponse.Data.DroppedTargets["+ i +"].Health"));
			droppedTargetsItem.setLabels(_ctx.mapValue("ListEnvironmentMetricTargetsResponse.Data.DroppedTargets["+ i +"].Labels"));
			droppedTargetsItem.setLastError(_ctx.stringValue("ListEnvironmentMetricTargetsResponse.Data.DroppedTargets["+ i +"].LastError"));
			droppedTargetsItem.setLastScrape(_ctx.stringValue("ListEnvironmentMetricTargetsResponse.Data.DroppedTargets["+ i +"].LastScrape"));
			droppedTargetsItem.setLastScrapeDuration(_ctx.doubleValue("ListEnvironmentMetricTargetsResponse.Data.DroppedTargets["+ i +"].LastScrapeDuration"));
			droppedTargetsItem.setLastScrapeSeries(_ctx.longValue("ListEnvironmentMetricTargetsResponse.Data.DroppedTargets["+ i +"].LastScrapeSeries"));
			droppedTargetsItem.setScrapePool(_ctx.stringValue("ListEnvironmentMetricTargetsResponse.Data.DroppedTargets["+ i +"].ScrapePool"));
			droppedTargetsItem.setScrapeUrl(_ctx.stringValue("ListEnvironmentMetricTargetsResponse.Data.DroppedTargets["+ i +"].ScrapeUrl"));

			droppedTargets.add(droppedTargetsItem);
		}
		data.setDroppedTargets(droppedTargets);
		listEnvironmentMetricTargetsResponse.setData(data);
	 
	 	return listEnvironmentMetricTargetsResponse;
	}
}