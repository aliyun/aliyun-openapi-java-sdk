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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanBatchDetailResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanBatchDetailResponse.Data;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanBatchDetailResponse.Data.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeChangePlanBatchDetailResponseUnmarshaller {

	public static OpsDescribeChangePlanBatchDetailResponse unmarshall(OpsDescribeChangePlanBatchDetailResponse opsDescribeChangePlanBatchDetailResponse, UnmarshallerContext _ctx) {
		
		opsDescribeChangePlanBatchDetailResponse.setRequestId(_ctx.stringValue("OpsDescribeChangePlanBatchDetailResponse.RequestId"));

		Data data = new Data();
		data.setBatchNo(_ctx.integerValue("OpsDescribeChangePlanBatchDetailResponse.Data.BatchNo"));
		data.setLastBatch(_ctx.booleanValue("OpsDescribeChangePlanBatchDetailResponse.Data.LastBatch"));
		data.setTotalSize(_ctx.integerValue("OpsDescribeChangePlanBatchDetailResponse.Data.TotalSize"));
		data.setPlanId(_ctx.stringValue("OpsDescribeChangePlanBatchDetailResponse.Data.PlanId"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeChangePlanBatchDetailResponse.Data.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setGmtCreated(_ctx.stringValue("OpsDescribeChangePlanBatchDetailResponse.Data.Resources["+ i +"].GmtCreated"));
			resource.setGmtModified(_ctx.stringValue("OpsDescribeChangePlanBatchDetailResponse.Data.Resources["+ i +"].GmtModified"));
			resource.setResourceId(_ctx.stringValue("OpsDescribeChangePlanBatchDetailResponse.Data.Resources["+ i +"].ResourceId"));
			resource.setOperationStatus(_ctx.stringValue("OpsDescribeChangePlanBatchDetailResponse.Data.Resources["+ i +"].OperationStatus"));

			resources.add(resource);
		}
		data.setResources(resources);
		opsDescribeChangePlanBatchDetailResponse.setData(data);
	 
	 	return opsDescribeChangePlanBatchDetailResponse;
	}
}