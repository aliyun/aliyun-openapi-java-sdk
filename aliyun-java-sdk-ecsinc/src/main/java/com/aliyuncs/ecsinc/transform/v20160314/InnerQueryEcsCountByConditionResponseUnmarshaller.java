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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerQueryEcsCountByConditionResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryEcsCountByConditionResponse.DiskCountModel;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryEcsCountByConditionResponse.DiskCountModel.DiskCountModel3;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryEcsCountByConditionResponse.DiskCountModel.DiskCountModel3.DiskCountModel4;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryEcsCountByConditionResponse.InstanceCountModel;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryEcsCountByConditionResponse.InstanceCountModel.InstanceCountModel1;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryEcsCountByConditionResponse.InstanceCountModel.InstanceCountModel1.InstanceCountModel2;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryEcsCountByConditionResponseUnmarshaller {

	public static InnerQueryEcsCountByConditionResponse unmarshall(InnerQueryEcsCountByConditionResponse innerQueryEcsCountByConditionResponse, UnmarshallerContext context) {
		
		innerQueryEcsCountByConditionResponse.setRequestId(context.stringValue("InnerQueryEcsCountByConditionResponse.RequestId"));
		innerQueryEcsCountByConditionResponse.setEcsTotalCount(context.integerValue("InnerQueryEcsCountByConditionResponse.EcsTotalCount"));
		innerQueryEcsCountByConditionResponse.setTimestamp(context.stringValue("InnerQueryEcsCountByConditionResponse.Timestamp"));

		List<InstanceCountModel> instanceCountModelsL1 = new ArrayList<InstanceCountModel>();
		for (int i = 0; i < context.lengthValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1.Length"); i++) {
			InstanceCountModel instanceCountModel = new InstanceCountModel();
			instanceCountModel.setEcsStatus(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].EcsStatus"));
			instanceCountModel.setExpiredTime(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].ExpiredTime"));
			instanceCountModel.setInstanceType(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceType"));
			instanceCountModel.setCpu(context.integerValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].Cpu"));
			instanceCountModel.setMem(context.integerValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].Mem"));
			instanceCountModel.setRegionId(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].RegionId"));
			instanceCountModel.setZoneId(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].ZoneId"));
			instanceCountModel.setImageId(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].ImageId"));
			instanceCountModel.setChargeType(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].ChargeType"));
			instanceCountModel.setCreationTime(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].CreationTime"));
			instanceCountModel.setCount(context.integerValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].Count"));
			instanceCountModel.setImageOsType(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].ImageOsType"));
			instanceCountModel.setImageOsName(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].ImageOsName"));

			List<InstanceCountModel1> instanceCountModelsL2 = new ArrayList<InstanceCountModel1>();
			for (int j = 0; j < context.lengthValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2.Length"); j++) {
				InstanceCountModel1 instanceCountModel1 = new InstanceCountModel1();
				instanceCountModel1.setEcsStatus(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].EcsStatus"));
				instanceCountModel1.setExpiredTime(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].ExpiredTime"));
				instanceCountModel1.setInstanceType(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].InstanceType"));
				instanceCountModel1.setCpu(context.integerValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].Cpu"));
				instanceCountModel1.setMem(context.integerValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].Mem"));
				instanceCountModel1.setRegionId(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].RegionId"));
				instanceCountModel1.setZoneId(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].ZoneId"));
				instanceCountModel1.setImageId(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].ImageId"));
				instanceCountModel1.setChargeType(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].ChargeType"));
				instanceCountModel1.setCreationTime(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].CreationTime"));
				instanceCountModel1.setCount(context.integerValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].Count"));
				instanceCountModel1.setImageOsType(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].ImageOsType"));
				instanceCountModel1.setImageOsName(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].ImageOsName"));

				List<InstanceCountModel2> instanceCountModelsL3 = new ArrayList<InstanceCountModel2>();
				for (int k = 0; k < context.lengthValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].InstanceCountModelsL3.Length"); k++) {
					InstanceCountModel2 instanceCountModel2 = new InstanceCountModel2();
					instanceCountModel2.setEcsStatus(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].InstanceCountModelsL3["+ k +"].EcsStatus"));
					instanceCountModel2.setExpiredTime(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].InstanceCountModelsL3["+ k +"].ExpiredTime"));
					instanceCountModel2.setInstanceType(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].InstanceCountModelsL3["+ k +"].InstanceType"));
					instanceCountModel2.setCpu(context.integerValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].InstanceCountModelsL3["+ k +"].Cpu"));
					instanceCountModel2.setMem(context.integerValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].InstanceCountModelsL3["+ k +"].Mem"));
					instanceCountModel2.setRegionId(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].InstanceCountModelsL3["+ k +"].RegionId"));
					instanceCountModel2.setZoneId(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].InstanceCountModelsL3["+ k +"].ZoneId"));
					instanceCountModel2.setImageId(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].InstanceCountModelsL3["+ k +"].ImageId"));
					instanceCountModel2.setChargeType(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].InstanceCountModelsL3["+ k +"].ChargeType"));
					instanceCountModel2.setCreationTime(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].InstanceCountModelsL3["+ k +"].CreationTime"));
					instanceCountModel2.setCount(context.integerValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].InstanceCountModelsL3["+ k +"].Count"));
					instanceCountModel2.setImageOsType(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].InstanceCountModelsL3["+ k +"].ImageOsType"));
					instanceCountModel2.setImageOsName(context.stringValue("InnerQueryEcsCountByConditionResponse.InstanceCountModelsL1["+ i +"].InstanceCountModelsL2["+ j +"].InstanceCountModelsL3["+ k +"].ImageOsName"));

					instanceCountModelsL3.add(instanceCountModel2);
				}
				instanceCountModel1.setInstanceCountModelsL3(instanceCountModelsL3);

				instanceCountModelsL2.add(instanceCountModel1);
			}
			instanceCountModel.setInstanceCountModelsL2(instanceCountModelsL2);

			instanceCountModelsL1.add(instanceCountModel);
		}
		innerQueryEcsCountByConditionResponse.setInstanceCountModelsL1(instanceCountModelsL1);

		List<DiskCountModel> diskCountModelsL1 = new ArrayList<DiskCountModel>();
		for (int i = 0; i < context.lengthValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1.Length"); i++) {
			DiskCountModel diskCountModel = new DiskCountModel();
			diskCountModel.setDiskSize(context.integerValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].DiskSize"));
			diskCountModel.setDiskCategory(context.stringValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].DiskCategory"));
			diskCountModel.setDiskType(context.stringValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].DiskType"));
			diskCountModel.setZoneId(context.stringValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].ZoneId"));
			diskCountModel.setCount(context.integerValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].Count"));

			List<DiskCountModel3> diskCountModelsL2 = new ArrayList<DiskCountModel3>();
			for (int j = 0; j < context.lengthValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].DiskCountModelsL2.Length"); j++) {
				DiskCountModel3 diskCountModel3 = new DiskCountModel3();
				diskCountModel3.setDiskSize(context.integerValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].DiskCountModelsL2["+ j +"].DiskSize"));
				diskCountModel3.setDiskCategory(context.stringValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].DiskCountModelsL2["+ j +"].DiskCategory"));
				diskCountModel3.setDiskType(context.stringValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].DiskCountModelsL2["+ j +"].DiskType"));
				diskCountModel3.setZoneId(context.stringValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].DiskCountModelsL2["+ j +"].ZoneId"));
				diskCountModel3.setCount(context.integerValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].DiskCountModelsL2["+ j +"].Count"));

				List<DiskCountModel4> diskCountModelsL3 = new ArrayList<DiskCountModel4>();
				for (int k = 0; k < context.lengthValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].DiskCountModelsL2["+ j +"].DiskCountModelsL3.Length"); k++) {
					DiskCountModel4 diskCountModel4 = new DiskCountModel4();
					diskCountModel4.setDiskSize(context.integerValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].DiskCountModelsL2["+ j +"].DiskCountModelsL3["+ k +"].DiskSize"));
					diskCountModel4.setDiskCategory(context.stringValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].DiskCountModelsL2["+ j +"].DiskCountModelsL3["+ k +"].DiskCategory"));
					diskCountModel4.setDiskType(context.stringValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].DiskCountModelsL2["+ j +"].DiskCountModelsL3["+ k +"].DiskType"));
					diskCountModel4.setZoneId(context.stringValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].DiskCountModelsL2["+ j +"].DiskCountModelsL3["+ k +"].ZoneId"));
					diskCountModel4.setCount(context.integerValue("InnerQueryEcsCountByConditionResponse.DiskCountModelsL1["+ i +"].DiskCountModelsL2["+ j +"].DiskCountModelsL3["+ k +"].Count"));

					diskCountModelsL3.add(diskCountModel4);
				}
				diskCountModel3.setDiskCountModelsL3(diskCountModelsL3);

				diskCountModelsL2.add(diskCountModel3);
			}
			diskCountModel.setDiskCountModelsL2(diskCountModelsL2);

			diskCountModelsL1.add(diskCountModel);
		}
		innerQueryEcsCountByConditionResponse.setDiskCountModelsL1(diskCountModelsL1);
	 
	 	return innerQueryEcsCountByConditionResponse;
	}
}