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

import com.aliyuncs.rds.model.v20140815.ModifySecurityGroupConfigurationResponse;
import com.aliyuncs.rds.model.v20140815.ModifySecurityGroupConfigurationResponse.EcsSecurityGroupRelation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySecurityGroupConfigurationResponseUnmarshaller {

	public static ModifySecurityGroupConfigurationResponse unmarshall(ModifySecurityGroupConfigurationResponse modifySecurityGroupConfigurationResponse, UnmarshallerContext context) {
		
		modifySecurityGroupConfigurationResponse.setRequestId(context.stringValue("ModifySecurityGroupConfigurationResponse.RequestId"));
		modifySecurityGroupConfigurationResponse.setDBInstanceName(context.stringValue("ModifySecurityGroupConfigurationResponse.DBInstanceName"));

		List<EcsSecurityGroupRelation> items = new ArrayList<EcsSecurityGroupRelation>();
		for (int i = 0; i < context.lengthValue("ModifySecurityGroupConfigurationResponse.Items.Length"); i++) {
			EcsSecurityGroupRelation ecsSecurityGroupRelation = new EcsSecurityGroupRelation();
			ecsSecurityGroupRelation.setRegionId(context.stringValue("ModifySecurityGroupConfigurationResponse.Items["+ i +"].RegionId"));
			ecsSecurityGroupRelation.setSecurityGroupId(context.stringValue("ModifySecurityGroupConfigurationResponse.Items["+ i +"].SecurityGroupId"));
			ecsSecurityGroupRelation.setNetworkType(context.stringValue("ModifySecurityGroupConfigurationResponse.Items["+ i +"].NetworkType"));

			items.add(ecsSecurityGroupRelation);
		}
		modifySecurityGroupConfigurationResponse.setItems(items);
	 
	 	return modifySecurityGroupConfigurationResponse;
	}
}