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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.ListAccountEcsQuotasResponse;
import com.aliyuncs.ecs.model.v20160314.ListAccountEcsQuotasResponse.EcsQuota;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccountEcsQuotasResponseUnmarshaller {

	public static ListAccountEcsQuotasResponse unmarshall(ListAccountEcsQuotasResponse listAccountEcsQuotasResponse, UnmarshallerContext _ctx) {
		
		listAccountEcsQuotasResponse.setRequestId(_ctx.stringValue("ListAccountEcsQuotasResponse.RequestId"));
		listAccountEcsQuotasResponse.setNextToken(_ctx.stringValue("ListAccountEcsQuotasResponse.NextToken"));

		List<EcsQuota> ecsQuotas = new ArrayList<EcsQuota>();
		for (int i = 0; i < _ctx.lengthValue("ListAccountEcsQuotasResponse.EcsQuotas.Length"); i++) {
			EcsQuota ecsQuota = new EcsQuota();
			ecsQuota.setQuotaResourceName(_ctx.stringValue("ListAccountEcsQuotasResponse.EcsQuotas["+ i +"].QuotaResourceName"));
			ecsQuota.setBaseQuota(_ctx.longValue("ListAccountEcsQuotasResponse.EcsQuotas["+ i +"].BaseQuota"));
			ecsQuota.setQuotaResourceType(_ctx.stringValue("ListAccountEcsQuotasResponse.EcsQuotas["+ i +"].QuotaResourceType"));
			ecsQuota.setQuotaUnit(_ctx.stringValue("ListAccountEcsQuotasResponse.EcsQuotas["+ i +"].QuotaUnit"));
			ecsQuota.setChargeType(_ctx.stringValue("ListAccountEcsQuotasResponse.EcsQuotas["+ i +"].ChargeType"));
			ecsQuota.setNetworkType(_ctx.stringValue("ListAccountEcsQuotasResponse.EcsQuotas["+ i +"].NetworkType"));
			ecsQuota.setReservedQuota(_ctx.longValue("ListAccountEcsQuotasResponse.EcsQuotas["+ i +"].ReservedQuota"));
			ecsQuota.setReservedQuotaUsage(_ctx.longValue("ListAccountEcsQuotasResponse.EcsQuotas["+ i +"].ReservedQuotaUsage"));
			ecsQuota.setRegionId(_ctx.stringValue("ListAccountEcsQuotasResponse.EcsQuotas["+ i +"].RegionId"));
			ecsQuota.setTotalQuotaUsage(_ctx.longValue("ListAccountEcsQuotasResponse.EcsQuotas["+ i +"].TotalQuotaUsage"));
			ecsQuota.setBaseQuotaUsage(_ctx.longValue("ListAccountEcsQuotasResponse.EcsQuotas["+ i +"].BaseQuotaUsage"));
			ecsQuota.setApplicationStatus(_ctx.stringValue("ListAccountEcsQuotasResponse.EcsQuotas["+ i +"].ApplicationStatus"));
			ecsQuota.setZoneId(_ctx.stringValue("ListAccountEcsQuotasResponse.EcsQuotas["+ i +"].ZoneId"));
			ecsQuota.setTotalQuota(_ctx.longValue("ListAccountEcsQuotasResponse.EcsQuotas["+ i +"].TotalQuota"));

			ecsQuotas.add(ecsQuota);
		}
		listAccountEcsQuotasResponse.setEcsQuotas(ecsQuotas);
	 
	 	return listAccountEcsQuotasResponse;
	}
}