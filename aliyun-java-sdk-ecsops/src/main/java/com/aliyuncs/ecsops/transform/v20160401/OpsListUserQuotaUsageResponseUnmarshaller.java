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

import com.aliyuncs.ecsops.model.v20160401.OpsListUserQuotaUsageResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListUserQuotaUsageResponse.EcsQuota;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListUserQuotaUsageResponseUnmarshaller {

	public static OpsListUserQuotaUsageResponse unmarshall(OpsListUserQuotaUsageResponse opsListUserQuotaUsageResponse, UnmarshallerContext _ctx) {
		
		opsListUserQuotaUsageResponse.setRequestId(_ctx.stringValue("OpsListUserQuotaUsageResponse.RequestId"));
		opsListUserQuotaUsageResponse.setTotalCount(_ctx.integerValue("OpsListUserQuotaUsageResponse.TotalCount"));
		opsListUserQuotaUsageResponse.setNextToken(_ctx.stringValue("OpsListUserQuotaUsageResponse.NextToken"));
		opsListUserQuotaUsageResponse.setPageSize(_ctx.integerValue("OpsListUserQuotaUsageResponse.PageSize"));
		opsListUserQuotaUsageResponse.setPageNumber(_ctx.integerValue("OpsListUserQuotaUsageResponse.PageNumber"));

		List<EcsQuota> ecsQuotas = new ArrayList<EcsQuota>();
		for (int i = 0; i < _ctx.lengthValue("OpsListUserQuotaUsageResponse.EcsQuotas.Length"); i++) {
			EcsQuota ecsQuota = new EcsQuota();
			ecsQuota.setBaseQuota(_ctx.longValue("OpsListUserQuotaUsageResponse.EcsQuotas["+ i +"].BaseQuota"));
			ecsQuota.setQuotaResourceName(_ctx.stringValue("OpsListUserQuotaUsageResponse.EcsQuotas["+ i +"].QuotaResourceName"));
			ecsQuota.setQuotaUnit(_ctx.stringValue("OpsListUserQuotaUsageResponse.EcsQuotas["+ i +"].QuotaUnit"));
			ecsQuota.setQuotaResourceType(_ctx.stringValue("OpsListUserQuotaUsageResponse.EcsQuotas["+ i +"].QuotaResourceType"));
			ecsQuota.setChargeType(_ctx.stringValue("OpsListUserQuotaUsageResponse.EcsQuotas["+ i +"].ChargeType"));
			ecsQuota.setNetworkType(_ctx.stringValue("OpsListUserQuotaUsageResponse.EcsQuotas["+ i +"].NetworkType"));
			ecsQuota.setReservedQuota(_ctx.longValue("OpsListUserQuotaUsageResponse.EcsQuotas["+ i +"].ReservedQuota"));
			ecsQuota.setReservedQuotaUsage(_ctx.longValue("OpsListUserQuotaUsageResponse.EcsQuotas["+ i +"].ReservedQuotaUsage"));
			ecsQuota.setRegionId(_ctx.stringValue("OpsListUserQuotaUsageResponse.EcsQuotas["+ i +"].RegionId"));
			ecsQuota.setTotalQuotaUsage(_ctx.longValue("OpsListUserQuotaUsageResponse.EcsQuotas["+ i +"].TotalQuotaUsage"));
			ecsQuota.setBaseQuotaUsage(_ctx.longValue("OpsListUserQuotaUsageResponse.EcsQuotas["+ i +"].BaseQuotaUsage"));
			ecsQuota.setApplicationStatus(_ctx.stringValue("OpsListUserQuotaUsageResponse.EcsQuotas["+ i +"].ApplicationStatus"));
			ecsQuota.setZoneId(_ctx.stringValue("OpsListUserQuotaUsageResponse.EcsQuotas["+ i +"].ZoneId"));
			ecsQuota.setTotalQuota(_ctx.longValue("OpsListUserQuotaUsageResponse.EcsQuotas["+ i +"].TotalQuota"));

			ecsQuotas.add(ecsQuota);
		}
		opsListUserQuotaUsageResponse.setEcsQuotas(ecsQuotas);
	 
	 	return opsListUserQuotaUsageResponse;
	}
}