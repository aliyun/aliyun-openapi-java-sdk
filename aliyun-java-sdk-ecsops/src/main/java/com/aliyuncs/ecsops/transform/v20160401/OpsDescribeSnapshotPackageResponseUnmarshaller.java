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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSnapshotPackageResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSnapshotPackageResponse.SnapshotPackageModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeSnapshotPackageResponseUnmarshaller {

	public static OpsDescribeSnapshotPackageResponse unmarshall(OpsDescribeSnapshotPackageResponse opsDescribeSnapshotPackageResponse, UnmarshallerContext _ctx) {
		
		opsDescribeSnapshotPackageResponse.setRequestId(_ctx.stringValue("OpsDescribeSnapshotPackageResponse.RequestId"));
		opsDescribeSnapshotPackageResponse.setTotalCount(_ctx.integerValue("OpsDescribeSnapshotPackageResponse.TotalCount"));
		opsDescribeSnapshotPackageResponse.setPageNumber(_ctx.integerValue("OpsDescribeSnapshotPackageResponse.PageNumber"));
		opsDescribeSnapshotPackageResponse.setPageSize(_ctx.integerValue("OpsDescribeSnapshotPackageResponse.PageSize"));

		List<SnapshotPackageModel> snapshotPackageModels = new ArrayList<SnapshotPackageModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeSnapshotPackageResponse.SnapshotPackageModels.Length"); i++) {
			SnapshotPackageModel snapshotPackageModel = new SnapshotPackageModel();
			snapshotPackageModel.setInstanceName(_ctx.stringValue("OpsDescribeSnapshotPackageResponse.SnapshotPackageModels["+ i +"].InstanceName"));
			snapshotPackageModel.setDisplayName(_ctx.stringValue("OpsDescribeSnapshotPackageResponse.SnapshotPackageModels["+ i +"].DisplayName"));
			snapshotPackageModel.setStartTime(_ctx.stringValue("OpsDescribeSnapshotPackageResponse.SnapshotPackageModels["+ i +"].StartTime"));
			snapshotPackageModel.setEndTime(_ctx.stringValue("OpsDescribeSnapshotPackageResponse.SnapshotPackageModels["+ i +"].EndTime"));
			snapshotPackageModel.setInitCapacity(_ctx.longValue("OpsDescribeSnapshotPackageResponse.SnapshotPackageModels["+ i +"].InitCapacity"));

			snapshotPackageModels.add(snapshotPackageModel);
		}
		opsDescribeSnapshotPackageResponse.setSnapshotPackageModels(snapshotPackageModels);
	 
	 	return opsDescribeSnapshotPackageResponse;
	}
}