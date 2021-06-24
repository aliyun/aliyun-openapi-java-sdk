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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanAllBatchesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanAllBatchesResponse.Data;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanAllBatchesResponse.Data.Batch;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeChangePlanAllBatchesResponseUnmarshaller {

	public static OpsDescribeChangePlanAllBatchesResponse unmarshall(OpsDescribeChangePlanAllBatchesResponse opsDescribeChangePlanAllBatchesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeChangePlanAllBatchesResponse.setRequestId(_ctx.stringValue("OpsDescribeChangePlanAllBatchesResponse.RequestId"));

		Data data = new Data();
		data.setPlanId(_ctx.stringValue("OpsDescribeChangePlanAllBatchesResponse.Data.PlanId"));

		List<Batch> batches = new ArrayList<Batch>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeChangePlanAllBatchesResponse.Data.Batches.Length"); i++) {
			Batch batch = new Batch();
			batch.setBatchNo(_ctx.integerValue("OpsDescribeChangePlanAllBatchesResponse.Data.Batches["+ i +"].BatchNo"));
			batch.setIsLastBatch(_ctx.booleanValue("OpsDescribeChangePlanAllBatchesResponse.Data.Batches["+ i +"].IsLastBatch"));
			batch.setResourceCount(_ctx.integerValue("OpsDescribeChangePlanAllBatchesResponse.Data.Batches["+ i +"].ResourceCount"));
			batch.setOperationStatus(_ctx.stringValue("OpsDescribeChangePlanAllBatchesResponse.Data.Batches["+ i +"].OperationStatus"));

			batches.add(batch);
		}
		data.setBatches(batches);
		opsDescribeChangePlanAllBatchesResponse.setData(data);
	 
	 	return opsDescribeChangePlanAllBatchesResponse;
	}
}