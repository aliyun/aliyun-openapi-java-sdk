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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data.ContainerService;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data.ContainerService.LifecycleState;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data.ContainerService.LogConfigsItem;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data.ContainerService.NamespaceScopedEntity;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data.ContainerService.NamespaceScopedEntity.EnvEntity;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data.ContainerService.NamespaceScopedEntity.EnvEntity.Entity;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.NamespaceScopedEntity1;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.NamespaceScopedEntity1.EnvEntity2;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.NamespaceScopedEntity1.EnvEntity2.Entity3;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data.ImageSource;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data.ImageSource.BaseImage;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data.ImageSource.BinaryRemotePath;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data.ImageSource.BuiltImage;
import com.aliyuncs.sofa.model.v20190815.GetAKSContainerservicesResponse.Data.ImageSource.CurrentImage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAKSContainerservicesResponseUnmarshaller {

	public static GetAKSContainerservicesResponse unmarshall(GetAKSContainerservicesResponse getAKSContainerservicesResponse, UnmarshallerContext _ctx) {
		
		getAKSContainerservicesResponse.setRequestId(_ctx.stringValue("GetAKSContainerservicesResponse.RequestId"));
		getAKSContainerservicesResponse.setResultCode(_ctx.stringValue("GetAKSContainerservicesResponse.ResultCode"));
		getAKSContainerservicesResponse.setResultMessage(_ctx.stringValue("GetAKSContainerservicesResponse.ResultMessage"));

		Data data = new Data();
		data.setDisplayedRevision(_ctx.stringValue("GetAKSContainerservicesResponse.Data.DisplayedRevision"));
		data.setOwner(_ctx.stringValue("GetAKSContainerservicesResponse.Data.Owner"));
		data.setPodCount(_ctx.longValue("GetAKSContainerservicesResponse.Data.PodCount"));
		data.setProcessingPodCount(_ctx.longValue("GetAKSContainerservicesResponse.Data.ProcessingPodCount"));
		data.setReplicas(_ctx.longValue("GetAKSContainerservicesResponse.Data.Replicas"));
		data.setRunningPodCount(_ctx.longValue("GetAKSContainerservicesResponse.Data.RunningPodCount"));

		ContainerService containerService = new ContainerService();
		containerService.setAppId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.AppId"));
		containerService.setAppName(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.AppName"));
		containerService.setAppSvcId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.AppSvcId"));
		containerService.setAppSvcName(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.AppSvcName"));
		containerService.setContainerServiceType(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.ContainerServiceType"));
		containerService.setDescription(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.Description"));
		containerService.setDraftedRevision(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.DraftedRevision"));
		containerService.setDraftedTime(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.DraftedTime"));
		containerService.setEnableBizMonitor(_ctx.booleanValue("GetAKSContainerservicesResponse.Data.ContainerService.EnableBizMonitor"));
		containerService.setEnableMesh(_ctx.booleanValue("GetAKSContainerservicesResponse.Data.ContainerService.EnableMesh"));
		containerService.setEnableSofaMesh(_ctx.booleanValue("GetAKSContainerservicesResponse.Data.ContainerService.EnableSofaMesh"));
		containerService.setOperatorId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.OperatorId"));
		containerService.setOperatorName(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.OperatorName"));
		containerService.setRuntimeRevision(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.RuntimeRevision"));
		containerService.setUseHostNetwork(_ctx.booleanValue("GetAKSContainerservicesResponse.Data.ContainerService.UseHostNetwork"));

		LifecycleState lifecycleState = new LifecycleState();
		lifecycleState.setDeploymentState(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.LifecycleState.DeploymentState"));
		lifecycleState.setMetadataState(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.LifecycleState.MetadataState"));
		lifecycleState.setRuntimeState(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.LifecycleState.RuntimeState"));
		containerService.setLifecycleState(lifecycleState);

		NamespaceScopedEntity namespaceScopedEntity = new NamespaceScopedEntity();
		namespaceScopedEntity.setClusterId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.NamespaceScopedEntity.ClusterId"));
		namespaceScopedEntity.setName(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.NamespaceScopedEntity.Name"));
		namespaceScopedEntity.setNamespace(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.NamespaceScopedEntity.Namespace"));

		EnvEntity envEntity = new EnvEntity();
		envEntity.setRegionId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.NamespaceScopedEntity.EnvEntity.RegionId"));
		envEntity.setRunEnv(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.NamespaceScopedEntity.EnvEntity.RunEnv"));
		envEntity.setTenantId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.NamespaceScopedEntity.EnvEntity.TenantId"));
		envEntity.setWorkspaceId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.NamespaceScopedEntity.EnvEntity.WorkspaceId"));

		Entity entity = new Entity();
		entity.setCreatedTime(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.NamespaceScopedEntity.EnvEntity.Entity.CreatedTime"));
		entity.setId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.NamespaceScopedEntity.EnvEntity.Entity.Id"));
		entity.setModifiedTime(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.NamespaceScopedEntity.EnvEntity.Entity.ModifiedTime"));
		envEntity.setEntity(entity);
		namespaceScopedEntity.setEnvEntity(envEntity);
		containerService.setNamespaceScopedEntity(namespaceScopedEntity);

		PodTemplate podTemplate = new PodTemplate();
		podTemplate.setContainerServiceId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.ContainerServiceId"));
		podTemplate.setDnsPolicy(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.DnsPolicy"));
		podTemplate.setHostNameTemplate(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.HostNameTemplate"));
		podTemplate.setUseHostNetwork(_ctx.booleanValue("GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.UseHostNetwork"));

		NamespaceScopedEntity1 namespaceScopedEntity1 = new NamespaceScopedEntity1();
		namespaceScopedEntity1.setClusterId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.NamespaceScopedEntity.ClusterId"));
		namespaceScopedEntity1.setName(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.NamespaceScopedEntity.Name"));
		namespaceScopedEntity1.setNamespace(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.NamespaceScopedEntity.Namespace"));

		EnvEntity2 envEntity2 = new EnvEntity2();
		envEntity2.setRegionId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.NamespaceScopedEntity.EnvEntity.RegionId"));
		envEntity2.setRunEnv(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.NamespaceScopedEntity.EnvEntity.RunEnv"));
		envEntity2.setTenantId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.NamespaceScopedEntity.EnvEntity.TenantId"));
		envEntity2.setWorkspaceId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.NamespaceScopedEntity.EnvEntity.WorkspaceId"));

		Entity3 entity3 = new Entity3();
		entity3.setCreatedTime(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.NamespaceScopedEntity.EnvEntity.Entity.CreatedTime"));
		entity3.setId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.NamespaceScopedEntity.EnvEntity.Entity.Id"));
		entity3.setModifiedTime(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.PodTemplate.NamespaceScopedEntity.EnvEntity.Entity.ModifiedTime"));
		envEntity2.setEntity3(entity3);
		namespaceScopedEntity1.setEnvEntity2(envEntity2);
		podTemplate.setNamespaceScopedEntity1(namespaceScopedEntity1);
		containerService.setPodTemplate(podTemplate);

		List<LogConfigsItem> logConfigs = new ArrayList<LogConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAKSContainerservicesResponse.Data.ContainerService.LogConfigs.Length"); i++) {
			LogConfigsItem logConfigsItem = new LogConfigsItem();
			logConfigsItem.setCreated(_ctx.booleanValue("GetAKSContainerservicesResponse.Data.ContainerService.LogConfigs["+ i +"].Created"));
			logConfigsItem.setFilePattern(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.LogConfigs["+ i +"].FilePattern"));
			logConfigsItem.setLogConfigPath(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.LogConfigs["+ i +"].LogConfigPath"));
			logConfigsItem.setLogPath(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.LogConfigs["+ i +"].LogPath"));
			logConfigsItem.setLogStore(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.LogConfigs["+ i +"].LogStore"));
			logConfigsItem.setName(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ContainerService.LogConfigs["+ i +"].Name"));
			logConfigsItem.setPublished(_ctx.booleanValue("GetAKSContainerservicesResponse.Data.ContainerService.LogConfigs["+ i +"].Published"));

			logConfigs.add(logConfigsItem);
		}
		containerService.setLogConfigs(logConfigs);
		data.setContainerService(containerService);

		ImageSource imageSource = new ImageSource();
		imageSource.setAppBuildId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.AppBuildId"));
		imageSource.setBinaryLocalPath(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.BinaryLocalPath"));
		imageSource.setBranch(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.Branch"));
		imageSource.setBuildNumber(_ctx.longValue("GetAKSContainerservicesResponse.Data.ImageSource.BuildNumber"));
		imageSource.setPullSecret(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.PullSecret"));
		imageSource.setRevision(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.Revision"));
		imageSource.setSourceType(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.SourceType"));

		BaseImage baseImage = new BaseImage();
		baseImage.setDigest(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.BaseImage.Digest"));
		baseImage.setImageId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.BaseImage.ImageId"));
		baseImage.setRepository(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.BaseImage.Repository"));
		baseImage.setTag(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.BaseImage.Tag"));
		imageSource.setBaseImage(baseImage);

		BinaryRemotePath binaryRemotePath = new BinaryRemotePath();
		binaryRemotePath.setEndpoint(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.BinaryRemotePath.Endpoint"));
		binaryRemotePath.setFileName(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.BinaryRemotePath.FileName"));
		binaryRemotePath.setPath(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.BinaryRemotePath.Path"));
		imageSource.setBinaryRemotePath(binaryRemotePath);

		BuiltImage builtImage = new BuiltImage();
		builtImage.setDigest(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.BuiltImage.Digest"));
		builtImage.setImageId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.BuiltImage.ImageId"));
		builtImage.setRepository(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.BuiltImage.Repository"));
		builtImage.setTag(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.BuiltImage.Tag"));
		imageSource.setBuiltImage(builtImage);

		CurrentImage currentImage = new CurrentImage();
		currentImage.setDigest(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.CurrentImage.Digest"));
		currentImage.setImageId(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.CurrentImage.ImageId"));
		currentImage.setRepository(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.CurrentImage.Repository"));
		currentImage.setTag(_ctx.stringValue("GetAKSContainerservicesResponse.Data.ImageSource.CurrentImage.Tag"));
		imageSource.setCurrentImage(currentImage);
		data.setImageSource(imageSource);
		getAKSContainerservicesResponse.setData(data);
	 
	 	return getAKSContainerservicesResponse;
	}
}