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
import com.aliyuncs.sae.model.v20190506.DescribeApplicationConfigResponse.Data.OssMountDesc;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationConfigResponse.Data.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationConfigResponseUnmarshaller {

	public static DescribeApplicationConfigResponse unmarshall(DescribeApplicationConfigResponse describeApplicationConfigResponse, UnmarshallerContext _ctx) {
		
		describeApplicationConfigResponse.setRequestId(_ctx.stringValue("DescribeApplicationConfigResponse.RequestId"));
		describeApplicationConfigResponse.setMessage(_ctx.stringValue("DescribeApplicationConfigResponse.Message"));
		describeApplicationConfigResponse.setTraceId(_ctx.stringValue("DescribeApplicationConfigResponse.TraceId"));
		describeApplicationConfigResponse.setErrorCode(_ctx.stringValue("DescribeApplicationConfigResponse.ErrorCode"));
		describeApplicationConfigResponse.setCode(_ctx.stringValue("DescribeApplicationConfigResponse.Code"));
		describeApplicationConfigResponse.setSuccess(_ctx.booleanValue("DescribeApplicationConfigResponse.Success"));

		Data data = new Data();
		data.setVpcId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.VpcId"));
		data.setReadiness(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Readiness"));
		data.setSecurityGroupId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.SecurityGroupId"));
		data.setBatchWaitTime(_ctx.integerValue("DescribeApplicationConfigResponse.Data.BatchWaitTime"));
		data.setJdk(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Jdk"));
		data.setImageUrl(_ctx.stringValue("DescribeApplicationConfigResponse.Data.ImageUrl"));
		data.setSlsConfigs(_ctx.stringValue("DescribeApplicationConfigResponse.Data.SlsConfigs"));
		data.setLiveness(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Liveness"));
		data.setPackageUrl(_ctx.stringValue("DescribeApplicationConfigResponse.Data.PackageUrl"));
		data.setPackageType(_ctx.stringValue("DescribeApplicationConfigResponse.Data.PackageType"));
		data.setPreStop(_ctx.stringValue("DescribeApplicationConfigResponse.Data.PreStop"));
		data.setPackageVersion(_ctx.stringValue("DescribeApplicationConfigResponse.Data.PackageVersion"));
		data.setJarStartArgs(_ctx.stringValue("DescribeApplicationConfigResponse.Data.JarStartArgs"));
		data.setAppName(_ctx.stringValue("DescribeApplicationConfigResponse.Data.AppName"));
		data.setAppId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.AppId"));
		data.setJarStartOptions(_ctx.stringValue("DescribeApplicationConfigResponse.Data.JarStartOptions"));
		data.setReplicas(_ctx.integerValue("DescribeApplicationConfigResponse.Data.Replicas"));
		data.setUpdateStrategy(_ctx.stringValue("DescribeApplicationConfigResponse.Data.UpdateStrategy"));
		data.setMinReadyInstances(_ctx.integerValue("DescribeApplicationConfigResponse.Data.MinReadyInstances"));
		data.setMinReadyInstanceRatio(_ctx.integerValue("DescribeApplicationConfigResponse.Data.MinReadyInstanceRatio"));
		data.setMemory(_ctx.integerValue("DescribeApplicationConfigResponse.Data.Memory"));
		data.setPhp(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Php"));
		data.setPhpConfig(_ctx.stringValue("DescribeApplicationConfigResponse.Data.PhpConfig"));
		data.setPhpConfigLocation(_ctx.stringValue("DescribeApplicationConfigResponse.Data.PhpConfigLocation"));
		data.setPhpExtensions(_ctx.stringValue("DescribeApplicationConfigResponse.Data.PhpExtensions"));
		data.setPhpPECLExtensions(_ctx.stringValue("DescribeApplicationConfigResponse.Data.PhpPECLExtensions"));
		data.setPostStart(_ctx.stringValue("DescribeApplicationConfigResponse.Data.PostStart"));
		data.setTerminationGracePeriodSeconds(_ctx.integerValue("DescribeApplicationConfigResponse.Data.TerminationGracePeriodSeconds"));
		data.setCommandArgs(_ctx.stringValue("DescribeApplicationConfigResponse.Data.CommandArgs"));
		data.setNamespaceId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.NamespaceId"));
		data.setMountHost(_ctx.stringValue("DescribeApplicationConfigResponse.Data.MountHost"));
		data.setTomcatConfig(_ctx.stringValue("DescribeApplicationConfigResponse.Data.TomcatConfig"));
		data.setRegionId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.RegionId"));
		data.setVSwitchId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.VSwitchId"));
		data.setCpu(_ctx.integerValue("DescribeApplicationConfigResponse.Data.Cpu"));
		data.setEnvs(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Envs"));
		data.setEnableAhas(_ctx.stringValue("DescribeApplicationConfigResponse.Data.EnableAhas"));
		data.setCustomHostAlias(_ctx.stringValue("DescribeApplicationConfigResponse.Data.CustomHostAlias"));
		data.setWebContainer(_ctx.stringValue("DescribeApplicationConfigResponse.Data.WebContainer"));
		data.setCommand(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Command"));
		data.setWarStartOptions(_ctx.stringValue("DescribeApplicationConfigResponse.Data.WarStartOptions"));
		data.setPhpArmsConfigLocation(_ctx.stringValue("DescribeApplicationConfigResponse.Data.PhpArmsConfigLocation"));
		data.setNasId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.NasId"));
		data.setOssAkId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.OssAkId"));
		data.setOssAkSecret(_ctx.stringValue("DescribeApplicationConfigResponse.Data.OssAkSecret"));
		data.setEdasContainerVersion(_ctx.stringValue("DescribeApplicationConfigResponse.Data.EdasContainerVersion"));
		data.setTimezone(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Timezone"));
		data.setAppDescription(_ctx.stringValue("DescribeApplicationConfigResponse.Data.AppDescription"));
		data.setEnableGreyTagRoute(_ctx.booleanValue("DescribeApplicationConfigResponse.Data.EnableGreyTagRoute"));
		data.setMseApplicationId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.MseApplicationId"));
		data.setAcrInstanceId(_ctx.stringValue("DescribeApplicationConfigResponse.Data.AcrInstanceId"));
		data.setAcrAssumeRoleArn(_ctx.stringValue("DescribeApplicationConfigResponse.Data.AcrAssumeRoleArn"));
		data.setAssociateEip(_ctx.booleanValue("DescribeApplicationConfigResponse.Data.AssociateEip"));
		data.setKafkaConfigs(_ctx.stringValue("DescribeApplicationConfigResponse.Data.KafkaConfigs"));
		data.setProgrammingLanguage(_ctx.stringValue("DescribeApplicationConfigResponse.Data.ProgrammingLanguage"));

		List<ConfigMapMountDescItem> configMapMountDesc = new ArrayList<ConfigMapMountDescItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationConfigResponse.Data.ConfigMapMountDesc.Length"); i++) {
			ConfigMapMountDescItem configMapMountDescItem = new ConfigMapMountDescItem();
			configMapMountDescItem.setKey(_ctx.stringValue("DescribeApplicationConfigResponse.Data.ConfigMapMountDesc["+ i +"].Key"));
			configMapMountDescItem.setConfigMapName(_ctx.stringValue("DescribeApplicationConfigResponse.Data.ConfigMapMountDesc["+ i +"].ConfigMapName"));
			configMapMountDescItem.setMountPath(_ctx.stringValue("DescribeApplicationConfigResponse.Data.ConfigMapMountDesc["+ i +"].MountPath"));
			configMapMountDescItem.setConfigMapId(_ctx.longValue("DescribeApplicationConfigResponse.Data.ConfigMapMountDesc["+ i +"].ConfigMapId"));

			configMapMountDesc.add(configMapMountDescItem);
		}
		data.setConfigMapMountDesc(configMapMountDesc);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationConfigResponse.Data.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeApplicationConfigResponse.Data.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		data.setTags(tags);

		List<MountDescItem> mountDesc = new ArrayList<MountDescItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationConfigResponse.Data.MountDesc.Length"); i++) {
			MountDescItem mountDescItem = new MountDescItem();
			mountDescItem.setMountPath(_ctx.stringValue("DescribeApplicationConfigResponse.Data.MountDesc["+ i +"].MountPath"));
			mountDescItem.setNasPath(_ctx.stringValue("DescribeApplicationConfigResponse.Data.MountDesc["+ i +"].NasPath"));

			mountDesc.add(mountDescItem);
		}
		data.setMountDesc(mountDesc);

		List<OssMountDesc> ossMountDescs = new ArrayList<OssMountDesc>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationConfigResponse.Data.OssMountDescs.Length"); i++) {
			OssMountDesc ossMountDesc = new OssMountDesc();
			ossMountDesc.setBucketName(_ctx.stringValue("DescribeApplicationConfigResponse.Data.OssMountDescs["+ i +"].bucketName"));
			ossMountDesc.setBucketPath(_ctx.stringValue("DescribeApplicationConfigResponse.Data.OssMountDescs["+ i +"].bucketPath"));
			ossMountDesc.setMountPath(_ctx.stringValue("DescribeApplicationConfigResponse.Data.OssMountDescs["+ i +"].mountPath"));
			ossMountDesc.setReadOnly(_ctx.booleanValue("DescribeApplicationConfigResponse.Data.OssMountDescs["+ i +"].readOnly"));

			ossMountDescs.add(ossMountDesc);
		}
		data.setOssMountDescs(ossMountDescs);
		describeApplicationConfigResponse.setData(data);
	 
	 	return describeApplicationConfigResponse;
	}
}