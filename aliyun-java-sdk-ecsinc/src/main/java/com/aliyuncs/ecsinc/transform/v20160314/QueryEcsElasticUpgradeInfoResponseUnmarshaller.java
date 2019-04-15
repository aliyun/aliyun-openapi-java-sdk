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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.QueryEcsElasticUpgradeInfoResponse;
import com.aliyuncs.ecsinc.model.v20160314.QueryEcsElasticUpgradeInfoResponse.BandwidthTimeRange;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEcsElasticUpgradeInfoResponseUnmarshaller {

	public static QueryEcsElasticUpgradeInfoResponse unmarshall(QueryEcsElasticUpgradeInfoResponse queryEcsElasticUpgradeInfoResponse, UnmarshallerContext context) {
		
		queryEcsElasticUpgradeInfoResponse.setRequestId(context.stringValue("QueryEcsElasticUpgradeInfoResponse.RequestId"));
		queryEcsElasticUpgradeInfoResponse.setInstanceId(context.stringValue("QueryEcsElasticUpgradeInfoResponse.InstanceId"));
		queryEcsElasticUpgradeInfoResponse.setBaseInstanceType(context.stringValue("QueryEcsElasticUpgradeInfoResponse.BaseInstanceType"));
		queryEcsElasticUpgradeInfoResponse.setCurrentInstanceType(context.stringValue("QueryEcsElasticUpgradeInfoResponse.CurrentInstanceType"));
		queryEcsElasticUpgradeInfoResponse.setElasticModificationUtcStartTime(context.stringValue("QueryEcsElasticUpgradeInfoResponse.ElasticModificationUtcStartTime"));
		queryEcsElasticUpgradeInfoResponse.setElasticModificationUtcEndTime(context.stringValue("QueryEcsElasticUpgradeInfoResponse.ElasticModificationUtcEndTime"));
		queryEcsElasticUpgradeInfoResponse.setBaseBandwidth(context.integerValue("QueryEcsElasticUpgradeInfoResponse.BaseBandwidth"));
		queryEcsElasticUpgradeInfoResponse.setCurrentBandwidth(context.integerValue("QueryEcsElasticUpgradeInfoResponse.CurrentBandwidth"));

		List<BandwidthTimeRange> bandwidthTimeRangeList = new ArrayList<BandwidthTimeRange>();
		for (int i = 0; i < context.lengthValue("QueryEcsElasticUpgradeInfoResponse.BandwidthTimeRangeList.Length"); i++) {
			BandwidthTimeRange bandwidthTimeRange = new BandwidthTimeRange();
			bandwidthTimeRange.setStartUtcTime(context.stringValue("QueryEcsElasticUpgradeInfoResponse.BandwidthTimeRangeList["+ i +"].StartUtcTime"));
			bandwidthTimeRange.setEndUtcTime(context.stringValue("QueryEcsElasticUpgradeInfoResponse.BandwidthTimeRangeList["+ i +"].EndUtcTime"));
			bandwidthTimeRange.setBandwidthValue(context.integerValue("QueryEcsElasticUpgradeInfoResponse.BandwidthTimeRangeList["+ i +"].BandwidthValue"));

			bandwidthTimeRangeList.add(bandwidthTimeRange);
		}
		queryEcsElasticUpgradeInfoResponse.setBandwidthTimeRangeList(bandwidthTimeRangeList);
	 
	 	return queryEcsElasticUpgradeInfoResponse;
	}
}