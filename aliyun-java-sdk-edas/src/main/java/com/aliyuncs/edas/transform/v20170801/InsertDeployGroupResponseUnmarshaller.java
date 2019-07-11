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

	public static InsertDeployGroupResponse unmarshall(InsertDeployGroupResponse insertDeployGroupResponse, UnmarshallerContext _ctx) {
		
		insertDeployGroupResponse.setRequestId(_ctx.stringValue("InsertDeployGroupResponse.RequestId"));
		insertDeployGroupResponse.setCode(_ctx.integerValue("InsertDeployGroupResponse.Code"));
		insertDeployGroupResponse.setMessage(_ctx.stringValue("InsertDeployGroupResponse.Message"));

		DeployGroupEntity deployGroupEntity = new DeployGroupEntity();
		deployGroupEntity.setId(_ctx.stringValue("InsertDeployGroupResponse.DeployGroupEntity.Id"));
		deployGroupEntity.setGroupName(_ctx.stringValue("InsertDeployGroupResponse.DeployGroupEntity.GroupName"));
		deployGroupEntity.setGroupType(_ctx.integerValue("InsertDeployGroupResponse.DeployGroupEntity.GroupType"));
		deployGroupEntity.setAppId(_ctx.stringValue("InsertDeployGroupResponse.DeployGroupEntity.AppId"));
		deployGroupEntity.setClusterId(_ctx.stringValue("InsertDeployGroupResponse.DeployGroupEntity.ClusterId"));
		deployGroupEntity.setPackageVersionId(_ctx.stringValue("InsertDeployGroupResponse.DeployGroupEntity.PackageVersionId"));
		deployGroupEntity.setAppVersionId(_ctx.stringValue("InsertDeployGroupResponse.DeployGroupEntity.AppVersionId"));
		deployGroupEntity.setCreateTime(_ctx.longValue("InsertDeployGroupResponse.DeployGroupEntity.CreateTime"));
		deployGroupEntity.setUpdateTime(_ctx.longValue("InsertDeployGroupResponse.DeployGroupEntity.UpdateTime"));
		insertDeployGroupResponse.setDeployGroupEntity(deployGroupEntity);
	 
	 	return insertDeployGroupResponse;
	}
}