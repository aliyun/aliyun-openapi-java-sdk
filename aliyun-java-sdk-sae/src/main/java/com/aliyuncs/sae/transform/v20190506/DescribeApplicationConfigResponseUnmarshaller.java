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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeApplicationConfigResponse;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationConfigResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationConfigResponse.Data.ConfigMapMountDescItem;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationConfigResponse.Data.MountDescItem;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationConfigResponse.Data.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationConfigResponseUnmarshaller {

	public static DescribeApplicationConfigResponse unmarshall(DescribeApplicationConfigResponse describeApplicationConfigResponse, UnmarshallerContext _ctx) {
		
		describeApplicationConfigResponse.setRequestId(_ctx.stringValue("DescribeApplicationConfigResponse.RequestId"));
		describeApplicationConfigResponse.setCode(_ctx.stringValue("DescribeApplicationConfigResponse.Code"));
		describeApplicationConfigResponse.setMessage(_ctx.stringValue("DescribeApplicationConfigResponse.Message"));
		describeApplicationConfigResponse.setTraceId(_ctx.stringValue("DescribeApplicationConfigResponse.TraceId"));
		describeApplicationConfigResponse.setSuccess(_ctx.booleanValue("DescribeApplicationConfigResponse.Success"));
		describeApplicationConfigResponse.setErrorCode(_ctx.stringValue("DescribeApplicationConfigResponse.ErrorCode"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.AppId"));
		data.setAppName(_ctx.stringValue("DescribeApplicationConfigResponse.Data.AppName"));
		data.setNamespaceId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.NamespaceId"));
		data.setAppDescription(_ctx.stringValue("DescribeApplicationConfigResponse.Data.AppDescription"));
		data.setVpcId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.VpcId"));
		data.setVSwitchId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.VSwitchId"));
		data.setPackageType(_ctx.stringValue("DescribeApplicationConfigResponse.Data.PackageType"));
		data.setPackageVersion(_ctx.stringValue("DescribeApplicationConfigResponse.Data.PackageVersion"));
		data.setPackageUrl(_ctx.stringValue("DescribeApplicationConfigResponse.Data.PackageUrl"));
		data.setImageUrl(_ctx.stringValue("DescribeApplicationConfigResponse.Data.ImageUrl"));
		data.setJdk(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Jdk"));
		data.setWebContainer(_ctx.stringValue("DescribeApplicationConfigResponse.Data.WebContainer"));
		data.setCpu(_ctx.integerValue("DescribeApplicationConfigResponse.Data.Cpu"));
		data.setMemory(_ctx.integerValue("DescribeApplicationConfigResponse.Data.Memory"));
		data.setReplicas(_ctx.integerValue("DescribeApplicationConfigResponse.Data.Replicas"));
		data.setCommand(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Command"));
		data.setCommandArgs(_ctx.stringValue("DescribeApplicationConfigResponse.Data.CommandArgs"));
		data.setEnvs(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Envs"));
		data.setCustomHostAlias(_ctx.stringValue("DescribeApplicationConfigResponse.Data.CustomHostAlias"));
		data.setJarStartOptions(_ctx.stringValue("DescribeApplicationConfigResponse.Data.JarStartOptions"));
		data.setJarStartArgs(_ctx.stringValue("DescribeApplicationConfigResponse.Data.JarStartArgs"));
		data.setLiveness(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Liveness"));
		data.setReadiness(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Readiness"));
		data.setMinReadyInstances(_ctx.integerValue("DescribeApplicationConfigResponse.Data.MinReadyInstances"));
		data.setBatchWaitTime(_ctx.integerValue("DescribeApplicationConfigResponse.Data.BatchWaitTime"));
		data.setEdasContainerVersion(_ctx.stringValue("DescribeApplicationConfigResponse.Data.EdasContainerVersion"));
		data.setRegionId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.RegionId"));
		data.setSlsConfigs(_ctx.stringValue("DescribeApplicationConfigResponse.Data.SlsConfigs"));
		data.setTimezone(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Timezone"));
		data.setNasId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.NasId"));
		data.setMountHost(_ctx.stringValue("DescribeApplicationConfigResponse.Data.MountHost"));
		data.setPreStop(_ctx.stringValue("DescribeApplicationConfigResponse.Data.PreStop"));
		data.setPostStart(_ctx.stringValue("DescribeApplicationConfigResponse.Data.PostStart"));
		data.setWarStartOptions(_ctx.stringValue("DescribeApplicationConfigResponse.Data.WarStartOptions"));
		data.setSecurityGroupId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.SecurityGroupId"));

		List<MountDescItem> mountDesc = new ArrayList<MountDescItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationConfigResponse.Data.MountDesc.Length"); i++) {
			MountDescItem mountDescItem = new MountDescItem();
			mountDescItem.setNasPath(_ctx.stringValue("DescribeApplicationConfigResponse.Data.MountDesc["+ i +"].NasPath"));
			mountDescItem.setMountPath(_ctx.stringValue("DescribeApplicationConfigResponse.Data.MountDesc["+ i +"].MountPath"));

			mountDesc.add(mountDescItem);
		}
		data.setMountDesc(mountDesc);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationConfigResponse.Data.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		data.setTags(tags);

		List<ConfigMapMountDescItem> configMapMountDesc = new ArrayList<ConfigMapMountDescItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationConfigResponse.Data.ConfigMapMountDesc.Length"); i++) {
			ConfigMapMountDescItem configMapMountDescItem = new ConfigMapMountDescItem();
			configMapMountDescItem.setConfigMapId(_ctx.longValue("DescribeApplicationConfigResponse.Data.ConfigMapMountDesc["+ i +"].ConfigMapId"));
			configMapMountDescItem.setConfigMapName(_ctx.stringValue("DescribeApplicationConfigResponse.Data.ConfigMapMountDesc["+ i +"].ConfigMapName"));
			configMapMountDescItem.setKey(_ctx.stringValue("DescribeApplicationConfigResponse.Data.ConfigMapMountDesc["+ i +"].Key"));
			configMapMountDescItem.setMountPath(_ctx.stringValue("DescribeApplicationConfigResponse.Data.ConfigMapMountDesc["+ i +"].MountPath"));

			configMapMountDesc.add(configMapMountDescItem);
		}
		data.setConfigMapMountDesc(configMapMountDesc);
		describeApplicationConfigResponse.setData(data);
	 
	 	return describeApplicationConfigResponse;
	}
}