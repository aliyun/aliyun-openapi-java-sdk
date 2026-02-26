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

import com.aliyuncs.sae.model.v20190506.DescribeJobResponse;
import com.aliyuncs.sae.model.v20190506.DescribeJobResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeJobResponse.Data.ConfigMapMountDescItem;
import com.aliyuncs.sae.model.v20190506.DescribeJobResponse.Data.MountDescItem;
import com.aliyuncs.sae.model.v20190506.DescribeJobResponse.Data.OssMountDesc;
import com.aliyuncs.sae.model.v20190506.DescribeJobResponse.Data.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobResponseUnmarshaller {

	public static DescribeJobResponse unmarshall(DescribeJobResponse describeJobResponse, UnmarshallerContext _ctx) {
		
		describeJobResponse.setRequestId(_ctx.stringValue("DescribeJobResponse.RequestId"));
		describeJobResponse.setMessage(_ctx.stringValue("DescribeJobResponse.Message"));
		describeJobResponse.setTraceId(_ctx.stringValue("DescribeJobResponse.TraceId"));
		describeJobResponse.setErrorCode(_ctx.stringValue("DescribeJobResponse.ErrorCode"));
		describeJobResponse.setCode(_ctx.stringValue("DescribeJobResponse.Code"));
		describeJobResponse.setSuccess(_ctx.booleanValue("DescribeJobResponse.Success"));

		Data data = new Data();
		data.setVpcId(_ctx.stringValue("DescribeJobResponse.Data.VpcId"));
		data.setReadiness(_ctx.stringValue("DescribeJobResponse.Data.Readiness"));
		data.setSecurityGroupId(_ctx.stringValue("DescribeJobResponse.Data.SecurityGroupId"));
		data.setBatchWaitTime(_ctx.integerValue("DescribeJobResponse.Data.BatchWaitTime"));
		data.setJdk(_ctx.stringValue("DescribeJobResponse.Data.Jdk"));
		data.setImageUrl(_ctx.stringValue("DescribeJobResponse.Data.ImageUrl"));
		data.setSlsConfigs(_ctx.stringValue("DescribeJobResponse.Data.SlsConfigs"));
		data.setLiveness(_ctx.stringValue("DescribeJobResponse.Data.Liveness"));
		data.setPackageUrl(_ctx.stringValue("DescribeJobResponse.Data.PackageUrl"));
		data.setPackageType(_ctx.stringValue("DescribeJobResponse.Data.PackageType"));
		data.setPackageRuntimeCustomBuild(_ctx.stringValue("DescribeJobResponse.Data.PackageRuntimeCustomBuild"));
		data.setPreStop(_ctx.stringValue("DescribeJobResponse.Data.PreStop"));
		data.setPackageVersion(_ctx.stringValue("DescribeJobResponse.Data.PackageVersion"));
		data.setJarStartArgs(_ctx.stringValue("DescribeJobResponse.Data.JarStartArgs"));
		data.setAppName(_ctx.stringValue("DescribeJobResponse.Data.AppName"));
		data.setAppId(_ctx.stringValue("DescribeJobResponse.Data.AppId"));
		data.setJarStartOptions(_ctx.stringValue("DescribeJobResponse.Data.JarStartOptions"));
		data.setReplicas(_ctx.integerValue("DescribeJobResponse.Data.Replicas"));
		data.setMinReadyInstances(_ctx.integerValue("DescribeJobResponse.Data.MinReadyInstances"));
		data.setMemory(_ctx.integerValue("DescribeJobResponse.Data.Memory"));
		data.setPhp(_ctx.stringValue("DescribeJobResponse.Data.Php"));
		data.setPhpConfig(_ctx.stringValue("DescribeJobResponse.Data.PhpConfig"));
		data.setPhpConfigLocation(_ctx.stringValue("DescribeJobResponse.Data.PhpConfigLocation"));
		data.setPhpExtensions(_ctx.stringValue("DescribeJobResponse.Data.PhpExtensions"));
		data.setPhpPECLExtensions(_ctx.stringValue("DescribeJobResponse.Data.PhpPECLExtensions"));
		data.setPostStart(_ctx.stringValue("DescribeJobResponse.Data.PostStart"));
		data.setTerminationGracePeriodSeconds(_ctx.integerValue("DescribeJobResponse.Data.TerminationGracePeriodSeconds"));
		data.setCommandArgs(_ctx.stringValue("DescribeJobResponse.Data.CommandArgs"));
		data.setNamespaceId(_ctx.stringValue("DescribeJobResponse.Data.NamespaceId"));
		data.setMountHost(_ctx.stringValue("DescribeJobResponse.Data.MountHost"));
		data.setTomcatConfig(_ctx.stringValue("DescribeJobResponse.Data.TomcatConfig"));
		data.setRegionId(_ctx.stringValue("DescribeJobResponse.Data.RegionId"));
		data.setVSwitchId(_ctx.stringValue("DescribeJobResponse.Data.VSwitchId"));
		data.setCpu(_ctx.integerValue("DescribeJobResponse.Data.Cpu"));
		data.setEnvs(_ctx.stringValue("DescribeJobResponse.Data.Envs"));
		data.setEnableAhas(_ctx.stringValue("DescribeJobResponse.Data.EnableAhas"));
		data.setCustomHostAlias(_ctx.stringValue("DescribeJobResponse.Data.CustomHostAlias"));
		data.setWebContainer(_ctx.stringValue("DescribeJobResponse.Data.WebContainer"));
		data.setCommand(_ctx.stringValue("DescribeJobResponse.Data.Command"));
		data.setWarStartOptions(_ctx.stringValue("DescribeJobResponse.Data.WarStartOptions"));
		data.setPhpArmsConfigLocation(_ctx.stringValue("DescribeJobResponse.Data.PhpArmsConfigLocation"));
		data.setNasId(_ctx.stringValue("DescribeJobResponse.Data.NasId"));
		data.setOssAkId(_ctx.stringValue("DescribeJobResponse.Data.OssAkId"));
		data.setOssAkSecret(_ctx.stringValue("DescribeJobResponse.Data.OssAkSecret"));
		data.setEdasContainerVersion(_ctx.stringValue("DescribeJobResponse.Data.EdasContainerVersion"));
		data.setTimezone(_ctx.stringValue("DescribeJobResponse.Data.Timezone"));
		data.setAppDescription(_ctx.stringValue("DescribeJobResponse.Data.AppDescription"));
		data.setEnableGreyTagRoute(_ctx.booleanValue("DescribeJobResponse.Data.EnableGreyTagRoute"));
		data.setMseApplicationId(_ctx.stringValue("DescribeJobResponse.Data.MseApplicationId"));
		data.setAcrInstanceId(_ctx.stringValue("DescribeJobResponse.Data.AcrInstanceId"));
		data.setAcrAssumeRoleArn(_ctx.stringValue("DescribeJobResponse.Data.AcrAssumeRoleArn"));
		data.setImagePullSecrets(_ctx.stringValue("DescribeJobResponse.Data.ImagePullSecrets"));
		data.setEnableImageAccl(_ctx.booleanValue("DescribeJobResponse.Data.EnableImageAccl"));
		data.setAssociateEip(_ctx.booleanValue("DescribeJobResponse.Data.AssociateEip"));
		data.setTriggerConfig(_ctx.stringValue("DescribeJobResponse.Data.TriggerConfig"));
		data.setConcurrencyPolicy(_ctx.stringValue("DescribeJobResponse.Data.ConcurrencyPolicy"));
		data.setSuspend(_ctx.booleanValue("DescribeJobResponse.Data.Suspend"));
		data.setTimeout(_ctx.longValue("DescribeJobResponse.Data.Timeout"));
		data.setBackoffLimit(_ctx.longValue("DescribeJobResponse.Data.BackoffLimit"));
		data.setSlice(_ctx.booleanValue("DescribeJobResponse.Data.Slice"));
		data.setSliceEnvs(_ctx.stringValue("DescribeJobResponse.Data.SliceEnvs"));
		data.setRefAppId(_ctx.stringValue("DescribeJobResponse.Data.RefAppId"));
		data.setProgrammingLanguage(_ctx.stringValue("DescribeJobResponse.Data.ProgrammingLanguage"));
		data.setNasConfigs(_ctx.stringValue("DescribeJobResponse.Data.NasConfigs"));
		data.setPython(_ctx.stringValue("DescribeJobResponse.Data.Python"));
		data.setPythonModules(_ctx.stringValue("DescribeJobResponse.Data.PythonModules"));

		List<String> refedAppIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Data.RefedAppIds.Length"); i++) {
			refedAppIds.add(_ctx.stringValue("DescribeJobResponse.Data.RefedAppIds["+ i +"]"));
		}
		data.setRefedAppIds(refedAppIds);

		List<String> publicWebHookUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Data.PublicWebHookUrls.Length"); i++) {
			publicWebHookUrls.add(_ctx.stringValue("DescribeJobResponse.Data.PublicWebHookUrls["+ i +"]"));
		}
		data.setPublicWebHookUrls(publicWebHookUrls);

		List<String> vpcWebHookUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Data.VpcWebHookUrls.Length"); i++) {
			vpcWebHookUrls.add(_ctx.stringValue("DescribeJobResponse.Data.VpcWebHookUrls["+ i +"]"));
		}
		data.setVpcWebHookUrls(vpcWebHookUrls);

		List<ConfigMapMountDescItem> configMapMountDesc = new ArrayList<ConfigMapMountDescItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Data.ConfigMapMountDesc.Length"); i++) {
			ConfigMapMountDescItem configMapMountDescItem = new ConfigMapMountDescItem();
			configMapMountDescItem.setKey(_ctx.stringValue("DescribeJobResponse.Data.ConfigMapMountDesc["+ i +"].Key"));
			configMapMountDescItem.setConfigMapName(_ctx.stringValue("DescribeJobResponse.Data.ConfigMapMountDesc["+ i +"].ConfigMapName"));
			configMapMountDescItem.setMountPath(_ctx.stringValue("DescribeJobResponse.Data.ConfigMapMountDesc["+ i +"].MountPath"));
			configMapMountDescItem.setConfigMapId(_ctx.longValue("DescribeJobResponse.Data.ConfigMapMountDesc["+ i +"].ConfigMapId"));

			configMapMountDesc.add(configMapMountDescItem);
		}
		data.setConfigMapMountDesc(configMapMountDesc);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Data.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeJobResponse.Data.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeJobResponse.Data.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		data.setTags(tags);

		List<MountDescItem> mountDesc = new ArrayList<MountDescItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Data.MountDesc.Length"); i++) {
			MountDescItem mountDescItem = new MountDescItem();
			mountDescItem.setMountPath(_ctx.stringValue("DescribeJobResponse.Data.MountDesc["+ i +"].MountPath"));
			mountDescItem.setNasPath(_ctx.stringValue("DescribeJobResponse.Data.MountDesc["+ i +"].NasPath"));

			mountDesc.add(mountDescItem);
		}
		data.setMountDesc(mountDesc);

		List<OssMountDesc> ossMountDescs = new ArrayList<OssMountDesc>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Data.OssMountDescs.Length"); i++) {
			OssMountDesc ossMountDesc = new OssMountDesc();
			ossMountDesc.setBucketName(_ctx.stringValue("DescribeJobResponse.Data.OssMountDescs["+ i +"].bucketName"));
			ossMountDesc.setBucketPath(_ctx.stringValue("DescribeJobResponse.Data.OssMountDescs["+ i +"].bucketPath"));
			ossMountDesc.setMountPath(_ctx.stringValue("DescribeJobResponse.Data.OssMountDescs["+ i +"].mountPath"));
			ossMountDesc.setReadOnly(_ctx.booleanValue("DescribeJobResponse.Data.OssMountDescs["+ i +"].readOnly"));

			ossMountDescs.add(ossMountDesc);
		}
		data.setOssMountDescs(ossMountDescs);
		describeJobResponse.setData(data);
	 
	 	return describeJobResponse;
	}
}