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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryImpactResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryImpactResponse.AggregationItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryImpactResponseUnmarshaller {

	public static OpsQueryImpactResponse unmarshall(OpsQueryImpactResponse opsQueryImpactResponse, UnmarshallerContext _ctx) {
		
		opsQueryImpactResponse.setRequestId(_ctx.stringValue("OpsQueryImpactResponse.RequestId"));
		opsQueryImpactResponse.setAggegationKeys(_ctx.stringValue("OpsQueryImpactResponse.AggegationKeys"));

		List<AggregationItem> aggregationItems = new ArrayList<AggregationItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryImpactResponse.AggregationItems.Length"); i++) {
			AggregationItem aggregationItem = new AggregationItem();
			aggregationItem.setVcpuCnt(_ctx.integerValue("OpsQueryImpactResponse.AggregationItems["+ i +"].VcpuCnt"));
			aggregationItem.setVmCnt(_ctx.integerValue("OpsQueryImpactResponse.AggregationItems["+ i +"].VmCnt"));
			aggregationItem.setNcCnt(_ctx.integerValue("OpsQueryImpactResponse.AggregationItems["+ i +"].NcCnt"));
			aggregationItem.setUserCnt(_ctx.integerValue("OpsQueryImpactResponse.AggregationItems["+ i +"].UserCnt"));
			aggregationItem.setGc6Cnt(_ctx.integerValue("OpsQueryImpactResponse.AggregationItems["+ i +"].Gc6Cnt"));
			aggregationItem.setGc7Cnt(_ctx.integerValue("OpsQueryImpactResponse.AggregationItems["+ i +"].Gc7Cnt"));
			aggregationItem.setAggregationValue(_ctx.stringValue("OpsQueryImpactResponse.AggregationItems["+ i +"].AggregationValue"));
			aggregationItem.setStorageNcCnt(_ctx.integerValue("OpsQueryImpactResponse.AggregationItems["+ i +"].StorageNcCnt"));
			aggregationItem.setGocVcpuCnt(_ctx.floatValue("OpsQueryImpactResponse.AggregationItems["+ i +"].GocVcpuCnt"));
			aggregationItem.setStorageAffectVmCnt(_ctx.integerValue("OpsQueryImpactResponse.AggregationItems["+ i +"].StorageAffectVmCnt"));

			aggregationItems.add(aggregationItem);
		}
		opsQueryImpactResponse.setAggregationItems(aggregationItems);
	 
	 	return opsQueryImpactResponse;
	}
}