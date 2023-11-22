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

import com.aliyuncs.hitsdb.model.v20200615.GetLdpsNamespacedQuotaResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetLdpsNamespacedQuotaResponse.NamespacedQuota;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLdpsNamespacedQuotaResponseUnmarshaller {

	public static GetLdpsNamespacedQuotaResponse unmarshall(GetLdpsNamespacedQuotaResponse getLdpsNamespacedQuotaResponse, UnmarshallerContext _ctx) {
		
		getLdpsNamespacedQuotaResponse.setRequestId(_ctx.stringValue("GetLdpsNamespacedQuotaResponse.RequestId"));

		List<NamespacedQuota> namespacedQuotas = new ArrayList<NamespacedQuota>();
		for (int i = 0; i < _ctx.lengthValue("GetLdpsNamespacedQuotaResponse.NamespacedQuotas.Length"); i++) {
			NamespacedQuota namespacedQuota = new NamespacedQuota();
			namespacedQuota.setName(_ctx.stringValue("GetLdpsNamespacedQuotaResponse.NamespacedQuotas["+ i +"].Name"));
			namespacedQuota.setCpuAmount(_ctx.stringValue("GetLdpsNamespacedQuotaResponse.NamespacedQuotas["+ i +"].CpuAmount"));
			namespacedQuota.setMemoryAmount(_ctx.stringValue("GetLdpsNamespacedQuotaResponse.NamespacedQuotas["+ i +"].MemoryAmount"));
			namespacedQuota.setUsedCpu(_ctx.stringValue("GetLdpsNamespacedQuotaResponse.NamespacedQuotas["+ i +"].UsedCpu"));
			namespacedQuota.setUsedMemory(_ctx.stringValue("GetLdpsNamespacedQuotaResponse.NamespacedQuotas["+ i +"].UsedMemory"));

			namespacedQuotas.add(namespacedQuota);
		}
		getLdpsNamespacedQuotaResponse.setNamespacedQuotas(namespacedQuotas);
	 
	 	return getLdpsNamespacedQuotaResponse;
	}
}