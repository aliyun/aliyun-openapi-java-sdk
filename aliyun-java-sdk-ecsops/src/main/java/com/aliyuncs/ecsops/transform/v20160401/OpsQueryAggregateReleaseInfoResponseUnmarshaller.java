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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryAggregateReleaseInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryAggregateReleaseInfoResponse.AggregateReleaseItem;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryAggregateReleaseInfoResponse.AggregateTimeResultItem;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryAggregateReleaseInfoResponse.DetailInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryAggregateReleaseInfoResponseUnmarshaller {

	public static OpsQueryAggregateReleaseInfoResponse unmarshall(OpsQueryAggregateReleaseInfoResponse opsQueryAggregateReleaseInfoResponse, UnmarshallerContext _ctx) {
		
		opsQueryAggregateReleaseInfoResponse.setRequestId(_ctx.stringValue("OpsQueryAggregateReleaseInfoResponse.RequestId"));
		opsQueryAggregateReleaseInfoResponse.setStatus(_ctx.stringValue("OpsQueryAggregateReleaseInfoResponse.Status"));
		opsQueryAggregateReleaseInfoResponse.setFinished(_ctx.booleanValue("OpsQueryAggregateReleaseInfoResponse.Finished"));
		opsQueryAggregateReleaseInfoResponse.setToken(_ctx.stringValue("OpsQueryAggregateReleaseInfoResponse.Token"));

		List<AggregateReleaseItem> aggregateReleaseResults = new ArrayList<AggregateReleaseItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryAggregateReleaseInfoResponse.AggregateReleaseResults.Length"); i++) {
			AggregateReleaseItem aggregateReleaseItem = new AggregateReleaseItem();
			aggregateReleaseItem.setReleaseComponent(_ctx.stringValue("OpsQueryAggregateReleaseInfoResponse.AggregateReleaseResults["+ i +"].ReleaseComponent"));

			List<String> impactNcIps = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryAggregateReleaseInfoResponse.AggregateReleaseResults["+ i +"].ImpactNcIps.Length"); j++) {
				impactNcIps.add(_ctx.stringValue("OpsQueryAggregateReleaseInfoResponse.AggregateReleaseResults["+ i +"].ImpactNcIps["+ j +"]"));
			}
			aggregateReleaseItem.setImpactNcIps(impactNcIps);

			aggregateReleaseResults.add(aggregateReleaseItem);
		}
		opsQueryAggregateReleaseInfoResponse.setAggregateReleaseResults(aggregateReleaseResults);

		List<DetailInfoItem> detailInfos = new ArrayList<DetailInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryAggregateReleaseInfoResponse.DetailInfos.Length"); i++) {
			DetailInfoItem detailInfoItem = new DetailInfoItem();
			detailInfoItem.setEndTime(_ctx.stringValue("OpsQueryAggregateReleaseInfoResponse.DetailInfos["+ i +"].EndTime"));
			detailInfoItem.setStartTime(_ctx.stringValue("OpsQueryAggregateReleaseInfoResponse.DetailInfos["+ i +"].StartTime"));
			detailInfoItem.setNcIp(_ctx.stringValue("OpsQueryAggregateReleaseInfoResponse.DetailInfos["+ i +"].NcIp"));

			detailInfos.add(detailInfoItem);
		}
		opsQueryAggregateReleaseInfoResponse.setDetailInfos(detailInfos);

		List<AggregateTimeResultItem> aggregateTimeResults = new ArrayList<AggregateTimeResultItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryAggregateReleaseInfoResponse.AggregateTimeResults.Length"); i++) {
			AggregateTimeResultItem aggregateTimeResultItem = new AggregateTimeResultItem();
			aggregateTimeResultItem.setImpactNcIpCnt(_ctx.integerValue("OpsQueryAggregateReleaseInfoResponse.AggregateTimeResults["+ i +"].ImpactNcIpCnt"));
			aggregateTimeResultItem.setTimestamp(_ctx.stringValue("OpsQueryAggregateReleaseInfoResponse.AggregateTimeResults["+ i +"].Timestamp"));

			aggregateTimeResults.add(aggregateTimeResultItem);
		}
		opsQueryAggregateReleaseInfoResponse.setAggregateTimeResults(aggregateTimeResults);
	 
	 	return opsQueryAggregateReleaseInfoResponse;
	}
}