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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo.ApplicationInfo;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo.EcsInfo;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo.EcsInfo.Compute;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo.EcsInfo.Login;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo.EcsInfo.Manager;
import com.aliyuncs.ehpc.model.v20180412.DescribeClusterResponse.ClusterInfo.PostInstallScriptInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterResponseUnmarshaller {

	public static DescribeClusterResponse unmarshall(DescribeClusterResponse describeClusterResponse, UnmarshallerContext _ctx) {
		
		describeClusterResponse.setRequestId(_ctx.stringValue("DescribeClusterResponse.RequestId"));

		ClusterInfo clusterInfo = new ClusterInfo();
		clusterInfo.setId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Id"));
		clusterInfo.setRegionId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.RegionId"));
		clusterInfo.setName(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Name"));
		clusterInfo.setDescription(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Description"));
		clusterInfo.setStatus(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Status"));
		clusterInfo.setOsTag(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.OsTag"));
		clusterInfo.setAccountType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.AccountType"));
		clusterInfo.setSchedulerType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.SchedulerType"));
		clusterInfo.setCreateTime(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.CreateTime"));
		clusterInfo.setSecurityGroupId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.SecurityGroupId"));
		clusterInfo.setVpcId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.VpcId"));
		clusterInfo.setVSwitchId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.VSwitchId"));
		clusterInfo.setVolumeType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.VolumeType"));
		clusterInfo.setVolumeId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.VolumeId"));
		clusterInfo.setVolumeProtocol(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.VolumeProtocol"));
		clusterInfo.setVolumeMountpoint(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.VolumeMountpoint"));
		clusterInfo.setRemoteDirectory(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.RemoteDirectory"));
		clusterInfo.setDeployMode(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.DeployMode"));
		clusterInfo.setHaEnable(_ctx.booleanValue("DescribeClusterResponse.ClusterInfo.HaEnable"));
		clusterInfo.setEcsChargeType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.EcsChargeType"));
		clusterInfo.setKeyPairName(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.KeyPairName"));
		clusterInfo.setSccClusterId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.SccClusterId"));
		clusterInfo.setClientVersion(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.ClientVersion"));
		clusterInfo.setImageOwnerAlias(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.ImageOwnerAlias"));
		clusterInfo.setImageId(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.ImageId"));
		clusterInfo.setLocation(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Location"));
		clusterInfo.setBaseOsTag(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.BaseOsTag"));

		EcsInfo ecsInfo = new EcsInfo();

		Manager manager = new Manager();
		manager.setCount(_ctx.integerValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Manager.Count"));
		manager.setInstanceType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Manager.InstanceType"));
		ecsInfo.setManager(manager);

		Compute compute = new Compute();
		compute.setCount(_ctx.integerValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Compute.Count"));
		compute.setInstanceType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Compute.InstanceType"));
		ecsInfo.setCompute(compute);

		Login login = new Login();
		login.setCount(_ctx.integerValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Login.Count"));
		login.setInstanceType(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Login.InstanceType"));
		ecsInfo.setLogin(login);
		clusterInfo.setEcsInfo(ecsInfo);

		List<ApplicationInfo> applications = new ArrayList<ApplicationInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterResponse.ClusterInfo.Applications.Length"); i++) {
			ApplicationInfo applicationInfo = new ApplicationInfo();
			applicationInfo.setTag(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Applications["+ i +"].Tag"));
			applicationInfo.setName(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Applications["+ i +"].Name"));
			applicationInfo.setVersion(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.Applications["+ i +"].Version"));

			applications.add(applicationInfo);
		}
		clusterInfo.setApplications(applications);

		List<PostInstallScriptInfo> postInstallScripts = new ArrayList<PostInstallScriptInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterResponse.ClusterInfo.PostInstallScripts.Length"); i++) {
			PostInstallScriptInfo postInstallScriptInfo = new PostInstallScriptInfo();
			postInstallScriptInfo.setUrl(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.PostInstallScripts["+ i +"].Url"));
			postInstallScriptInfo.setArgs(_ctx.stringValue("DescribeClusterResponse.ClusterInfo.PostInstallScripts["+ i +"].Args"));

			postInstallScripts.add(postInstallScriptInfo);
		}
		clusterInfo.setPostInstallScripts(postInstallScripts);
		describeClusterResponse.setClusterInfo(clusterInfo);
	 
	 	return describeClusterResponse;
	}
}