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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.InsertDeployGroupResponse;
import com.aliyuncs.edas.model.v20170801.InsertDeployGroupResponse.DeployGroupEntity;
import com.aliyuncs.transform.UnmarshallerContext;


public class InsertDeployGroupResponseUnmarshaller {

	public static InsertDeployGroupResponse unmarshall(InsertDeployGroupResponse insertDeployGroupResponse, UnmarshallerContext context) {
		
		insertDeployGroupResponse.setRequestId(context.stringValue("InsertDeployGroupResponse.RequestId"));
		insertDeployGroupResponse.setCode(context.integerValue("InsertDeployGroupResponse.Code"));
		insertDeployGroupResponse.setMessage(context.stringValue("InsertDeployGroupResponse.Message"));

		DeployGroupEntity deployGroupEntity = new DeployGroupEntity();
		deployGroupEntity.setId(context.stringValue("InsertDeployGroupResponse.DeployGroupEntity.Id"));
		deployGroupEntity.setGroupName(context.stringValue("InsertDeployGroupResponse.DeployGroupEntity.GroupName"));
		deployGroupEntity.setGroupType(context.integerValue("InsertDeployGroupResponse.DeployGroupEntity.GroupType"));
		deployGroupEntity.setAppId(context.stringValue("InsertDeployGroupResponse.DeployGroupEntity.AppId"));
		deployGroupEntity.setClusterId(context.stringValue("InsertDeployGroupResponse.DeployGroupEntity.ClusterId"));
		deployGroupEntity.setPackageVersionId(context.stringValue("InsertDeployGroupResponse.DeployGroupEntity.PackageVersionId"));
		deployGroupEntity.setAppVersionId(context.stringValue("InsertDeployGroupResponse.DeployGroupEntity.AppVersionId"));
		deployGroupEntity.setCreateTime(context.longValue("InsertDeployGroupResponse.DeployGroupEntity.CreateTime"));
		deployGroupEntity.setUpdateTime(context.longValue("InsertDeployGroupResponse.DeployGroupEntity.UpdateTime"));
		insertDeployGroupResponse.setDeployGroupEntity(deployGroupEntity);
	 
	 	return insertDeployGroupResponse;
	}
}