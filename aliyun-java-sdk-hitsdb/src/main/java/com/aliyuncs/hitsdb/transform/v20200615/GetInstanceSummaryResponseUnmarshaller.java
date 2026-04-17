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

package com.aliyuncs.hitsdb.transform.v20200615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20200615.GetInstanceSummaryResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetInstanceSummaryResponse.RegionalSummaryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceSummaryResponseUnmarshaller {

	public static GetInstanceSummaryResponse unmarshall(GetInstanceSummaryResponse getInstanceSummaryResponse, UnmarshallerContext _ctx) {
		
		getInstanceSummaryResponse.setRequestId(_ctx.stringValue("GetInstanceSummaryResponse.RequestId"));
		getInstanceSummaryResponse.setLockingCount(_ctx.integerValue("GetInstanceSummaryResponse.LockingCount"));
		getInstanceSummaryResponse.setTotal(_ctx.integerValue("GetInstanceSummaryResponse.Total"));
		getInstanceSummaryResponse.setRunningCount(_ctx.integerValue("GetInstanceSummaryResponse.RunningCount"));

		List<RegionalSummaryItem> regionalSummary = new ArrayList<RegionalSummaryItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceSummaryResponse.RegionalSummary.Length"); i++) {
			RegionalSummaryItem regionalSummaryItem = new RegionalSummaryItem();
			regionalSummaryItem.setLockingCount(_ctx.integerValue("GetInstanceSummaryResponse.RegionalSummary["+ i +"].LockingCount"));
			regionalSummaryItem.setTotal(_ctx.integerValue("GetInstanceSummaryResponse.RegionalSummary["+ i +"].Total"));
			regionalSummaryItem.setRegionId(_ctx.stringValue("GetInstanceSummaryResponse.RegionalSummary["+ i +"].RegionId"));
			regionalSummaryItem.setRunningCount(_ctx.integerValue("GetInstanceSummaryResponse.RegionalSummary["+ i +"].RunningCount"));

			regionalSummary.add(regionalSummaryItem);
		}
		getInstanceSummaryResponse.setRegionalSummary(regionalSummary);
	 
	 	return getInstanceSummaryResponse;
	}
}