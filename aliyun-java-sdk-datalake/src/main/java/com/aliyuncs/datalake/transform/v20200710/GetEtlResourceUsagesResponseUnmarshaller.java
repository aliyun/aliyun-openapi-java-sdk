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

package com.aliyuncs.datalake.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.GetEtlResourceUsagesResponse;
import com.aliyuncs.datalake.model.v20200710.GetEtlResourceUsagesResponse.EtlResourceUsage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEtlResourceUsagesResponseUnmarshaller {

	public static GetEtlResourceUsagesResponse unmarshall(GetEtlResourceUsagesResponse getEtlResourceUsagesResponse, UnmarshallerContext _ctx) {
		
		getEtlResourceUsagesResponse.setRequestId(_ctx.stringValue("GetEtlResourceUsagesResponse.RequestId"));
		getEtlResourceUsagesResponse.setTotalCount(_ctx.stringValue("GetEtlResourceUsagesResponse.TotalCount"));
		getEtlResourceUsagesResponse.setSuccess(_ctx.booleanValue("GetEtlResourceUsagesResponse.Success"));

		List<EtlResourceUsage> etlResourceUsages = new ArrayList<EtlResourceUsage>();
		for (int i = 0; i < _ctx.lengthValue("GetEtlResourceUsagesResponse.EtlResourceUsages.Length"); i++) {
			EtlResourceUsage etlResourceUsage = new EtlResourceUsage();
			etlResourceUsage.setQueryTime(_ctx.stringValue("GetEtlResourceUsagesResponse.EtlResourceUsages["+ i +"].QueryTime"));
			etlResourceUsage.setMonth(_ctx.stringValue("GetEtlResourceUsagesResponse.EtlResourceUsages["+ i +"].Month"));
			etlResourceUsage.setCuUsage(_ctx.longValue("GetEtlResourceUsagesResponse.EtlResourceUsages["+ i +"].CuUsage"));

			etlResourceUsages.add(etlResourceUsage);
		}
		getEtlResourceUsagesResponse.setEtlResourceUsages(etlResourceUsages);
	 
	 	return getEtlResourceUsagesResponse;
	}
}