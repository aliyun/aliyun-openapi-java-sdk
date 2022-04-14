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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListDeployGroupResponse;
import com.aliyuncs.edas.model.v20170801.ListDeployGroupResponse.DeployGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeployGroupResponseUnmarshaller {

	public static ListDeployGroupResponse unmarshall(ListDeployGroupResponse listDeployGroupResponse, UnmarshallerContext _ctx) {
		
		listDeployGroupResponse.setRequestId(_ctx.stringValue("ListDeployGroupResponse.RequestId"));
		listDeployGroupResponse.setCode(_ctx.integerValue("ListDeployGroupResponse.Code"));
		listDeployGroupResponse.setMessage(_ctx.stringValue("ListDeployGroupResponse.Message"));

		List<DeployGroup> deployGroupList = new ArrayList<DeployGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListDeployGroupResponse.DeployGroupList.Length"); i++) {
			DeployGroup deployGroup = new DeployGroup();
			deployGroup.setVServerGroupId(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].VServerGroupId"));
			deployGroup.setStatus(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].Status"));
			deployGroup.setCpuRequest(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].CpuRequest"));
			deployGroup.setUpdateTime(_ctx.longValue("ListDeployGroupResponse.DeployGroupList["+ i +"].UpdateTime"));
			deployGroup.setMemoryRequest(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].MemoryRequest"));
			deployGroup.setNameSpace(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].NameSpace"));
			deployGroup.setAppVersionId(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].AppVersionId"));
			deployGroup.setCreateTime(_ctx.longValue("ListDeployGroupResponse.DeployGroupList["+ i +"].CreateTime"));
			deployGroup.setDeploymentName(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].DeploymentName"));
			deployGroup.setPreStop(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].PreStop"));
			deployGroup.setPackageUrl(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].PackageUrl"));
			deployGroup.setPackageVersion(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].PackageVersion"));
			deployGroup.setBaseComponentMetaName(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].BaseComponentMetaName"));
			deployGroup.setCsClusterId(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].CsClusterId"));
			deployGroup.setAppId(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].AppId"));
			deployGroup.setLastUpdateTime(_ctx.longValue("ListDeployGroupResponse.DeployGroupList["+ i +"].LastUpdateTime"));
			deployGroup.setEnv(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].Env"));
			deployGroup.setCpuLimit(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].CpuLimit"));
			deployGroup.setGroupType(_ctx.integerValue("ListDeployGroupResponse.DeployGroupList["+ i +"].GroupType"));
			deployGroup.setClusterId(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].ClusterId"));
			deployGroup.setPostStart(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].PostStart"));
			deployGroup.setLabels(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].Labels"));
			deployGroup.setMemoryLimit(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].MemoryLimit"));
			deployGroup.setStrategy(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].Strategy"));
			deployGroup.setSelector(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].Selector"));
			deployGroup.setGroupId(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].GroupId"));
			deployGroup.setGroupName(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].GroupName"));
			deployGroup.setClusterName(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].ClusterName"));
			deployGroup.setPackageVersionId(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].PackageVersionId"));
			deployGroup.setReversion(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].Reversion"));
			deployGroup.setVExtServerGroupId(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].VExtServerGroupId"));
			deployGroup.setPackagePublicUrl(_ctx.stringValue("ListDeployGroupResponse.DeployGroupList["+ i +"].PackagePublicUrl"));

			deployGroupList.add(deployGroup);
		}
		listDeployGroupResponse.setDeployGroupList(deployGroupList);
	 
	 	return listDeployGroupResponse;
	}
}