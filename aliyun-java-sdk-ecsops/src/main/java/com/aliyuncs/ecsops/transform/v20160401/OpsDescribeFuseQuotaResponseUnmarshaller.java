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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFuseQuotaResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFuseQuotaResponse.FuseQuota;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeFuseQuotaResponseUnmarshaller {

	public static OpsDescribeFuseQuotaResponse unmarshall(OpsDescribeFuseQuotaResponse opsDescribeFuseQuotaResponse, UnmarshallerContext _ctx) {
		
		opsDescribeFuseQuotaResponse.setRequestId(_ctx.stringValue("OpsDescribeFuseQuotaResponse.RequestId"));
		opsDescribeFuseQuotaResponse.setTotalCount(_ctx.integerValue("OpsDescribeFuseQuotaResponse.TotalCount"));
		opsDescribeFuseQuotaResponse.setPageNumber(_ctx.integerValue("OpsDescribeFuseQuotaResponse.PageNumber"));
		opsDescribeFuseQuotaResponse.setPageSize(_ctx.integerValue("OpsDescribeFuseQuotaResponse.PageSize"));

		List<FuseQuota> fuseQuotas = new ArrayList<FuseQuota>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeFuseQuotaResponse.FuseQuotas.Length"); i++) {
			FuseQuota fuseQuota = new FuseQuota();
			fuseQuota.setId(_ctx.longValue("OpsDescribeFuseQuotaResponse.FuseQuotas["+ i +"].Id"));
			fuseQuota.setGmtCreate(_ctx.longValue("OpsDescribeFuseQuotaResponse.FuseQuotas["+ i +"].GmtCreate"));
			fuseQuota.setGmtModified(_ctx.longValue("OpsDescribeFuseQuotaResponse.FuseQuotas["+ i +"].GmtModified"));
			fuseQuota.setOperatorInfo(_ctx.stringValue("OpsDescribeFuseQuotaResponse.FuseQuotas["+ i +"].OperatorInfo"));
			fuseQuota.setRegionNo(_ctx.stringValue("OpsDescribeFuseQuotaResponse.FuseQuotas["+ i +"].RegionNo"));
			fuseQuota.setResourceType(_ctx.stringValue("OpsDescribeFuseQuotaResponse.FuseQuotas["+ i +"].ResourceType"));
			fuseQuota.setDailyQuota(_ctx.integerValue("OpsDescribeFuseQuotaResponse.FuseQuotas["+ i +"].DailyQuota"));

			fuseQuotas.add(fuseQuota);
		}
		opsDescribeFuseQuotaResponse.setFuseQuotas(fuseQuotas);
	 
	 	return opsDescribeFuseQuotaResponse;
	}
}