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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesOverviewResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesOverviewResponse.RegionModel;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesOverviewResponse.RegionModel.TypeModel;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesOverviewResponse.RegionModel.TypeModel.InstanceModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesOverviewResponseUnmarshaller {

	public static DescribeDBInstancesOverviewResponse unmarshall(DescribeDBInstancesOverviewResponse describeDBInstancesOverviewResponse, UnmarshallerContext _ctx) {
		
		describeDBInstancesOverviewResponse.setRequestId(_ctx.stringValue("DescribeDBInstancesOverviewResponse.RequestId"));

		List<RegionModel> regions = new ArrayList<RegionModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstancesOverviewResponse.Regions.Length"); i++) {
			RegionModel regionModel = new RegionModel();
			regionModel.setRegion(_ctx.stringValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].Region"));
			regionModel.setEngineCount(_ctx.stringValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].EngineCount"));
			regionModel.setTotalCount(_ctx.integerValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].TotalCount"));

			List<TypeModel> typeModels = new ArrayList<TypeModel>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].TypeModels.Length"); j++) {
				TypeModel typeModel = new TypeModel();
				typeModel.setInstanceDateType(_ctx.stringValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].TypeModels["+ j +"].InstanceDateType"));
				typeModel.setCount(_ctx.integerValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].TypeModels["+ j +"].Count"));

				List<InstanceModel> instanceModels = new ArrayList<InstanceModel>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].TypeModels["+ j +"].InstanceModels.Length"); k++) {
					InstanceModel instanceModel = new InstanceModel();
					instanceModel.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].TypeModels["+ j +"].InstanceModels["+ k +"].DBInstanceId"));
					instanceModel.setRegion(_ctx.stringValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].TypeModels["+ j +"].InstanceModels["+ k +"].Region"));
					instanceModel.setZoneId(_ctx.stringValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].TypeModels["+ j +"].InstanceModels["+ k +"].ZoneId"));
					instanceModel.setEngine(_ctx.stringValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].TypeModels["+ j +"].InstanceModels["+ k +"].Engine"));
					instanceModel.setPayType(_ctx.stringValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].TypeModels["+ j +"].InstanceModels["+ k +"].PayType"));
					instanceModel.setCreatedTime(_ctx.stringValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].TypeModels["+ j +"].InstanceModels["+ k +"].CreatedTime"));
					instanceModel.setExpireTime(_ctx.stringValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].TypeModels["+ j +"].InstanceModels["+ k +"].ExpireTime"));
					instanceModel.setLockMode(_ctx.stringValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].TypeModels["+ j +"].InstanceModels["+ k +"].LockMode"));
					instanceModel.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstancesOverviewResponse.Regions["+ i +"].TypeModels["+ j +"].InstanceModels["+ k +"].DBInstanceStatus"));

					instanceModels.add(instanceModel);
				}
				typeModel.setInstanceModels(instanceModels);

				typeModels.add(typeModel);
			}
			regionModel.setTypeModels(typeModels);

			regions.add(regionModel);
		}
		describeDBInstancesOverviewResponse.setRegions(regions);
	 
	 	return describeDBInstancesOverviewResponse;
	}
}