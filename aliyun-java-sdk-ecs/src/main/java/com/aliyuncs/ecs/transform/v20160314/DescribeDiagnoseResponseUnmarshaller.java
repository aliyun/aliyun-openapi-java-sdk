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

import com.aliyuncs.ecs.model.v20160314.DescribeDiagnoseResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeDiagnoseResponse.DiagnoseInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnoseResponseUnmarshaller {

	public static DescribeDiagnoseResponse unmarshall(DescribeDiagnoseResponse describeDiagnoseResponse, UnmarshallerContext _ctx) {
		
		describeDiagnoseResponse.setRequestId(_ctx.stringValue("DescribeDiagnoseResponse.RequestId"));
		describeDiagnoseResponse.setPageSize(_ctx.integerValue("DescribeDiagnoseResponse.PageSize"));
		describeDiagnoseResponse.setPageNumber(_ctx.integerValue("DescribeDiagnoseResponse.PageNumber"));
		describeDiagnoseResponse.setTotalCount(_ctx.integerValue("DescribeDiagnoseResponse.TotalCount"));

		List<DiagnoseInstance> diagnoseInstances = new ArrayList<DiagnoseInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnoseResponse.DiagnoseInstances.Length"); i++) {
			DiagnoseInstance diagnoseInstance = new DiagnoseInstance();
			diagnoseInstance.setStatus(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].Status"));
			diagnoseInstance.setCreationTime(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].CreationTime"));
			diagnoseInstance.setExpireTime(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].ExpireTime"));
			diagnoseInstance.setDiagnoseId(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].DiagnoseId"));
			diagnoseInstance.setProduct(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].Product"));
			diagnoseInstance.setStar(_ctx.integerValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].Star"));
			diagnoseInstance.setInstanceTypeName(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].InstanceTypeName"));
			diagnoseInstance.setNetworkType(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].NetworkType"));
			diagnoseInstance.setModificationTime(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].ModificationTime"));
			diagnoseInstance.setPeriod(_ctx.integerValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].Period"));
			diagnoseInstance.setInstanceChargeType(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].InstanceChargeType"));
			diagnoseInstance.setRegionId(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].RegionId"));
			diagnoseInstance.setAmount(_ctx.integerValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].Amount"));
			diagnoseInstance.setDiskCategory(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].DiskCategory"));
			diagnoseInstance.setErrorCode(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].ErrorCode"));
			diagnoseInstance.setPeriodUnit(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].PeriodUnit"));
			diagnoseInstance.setMark(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].Mark"));
			diagnoseInstance.setDiagnoseRequestId(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].DiagnoseRequestId"));
			diagnoseInstance.setIzNo(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].IzNo"));
			diagnoseInstance.setSolutions(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].Solutions"));
			diagnoseInstance.setDiagnoseAction(_ctx.stringValue("DescribeDiagnoseResponse.DiagnoseInstances["+ i +"].DiagnoseAction"));

			diagnoseInstances.add(diagnoseInstance);
		}
		describeDiagnoseResponse.setDiagnoseInstances(diagnoseInstances);
	 
	 	return describeDiagnoseResponse;
	}
}