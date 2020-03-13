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

import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem.ContainerService;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem.ContainerService.LifecycleState;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem.ContainerService.LogConfigsItem;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem.ContainerService.NamespaceScopedEntity;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem.ContainerService.NamespaceScopedEntity.EnvEntity;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem.ContainerService.NamespaceScopedEntity.EnvEntity.Entity;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem.ContainerService.PodTemplate;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem.ContainerService.PodTemplate.NamespaceScopedEntity1;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem.ContainerService.PodTemplate.NamespaceScopedEntity1.EnvEntity2;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem.ContainerService.PodTemplate.NamespaceScopedEntity1.EnvEntity2.Entity3;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem.ImageSource;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem.ImageSource.BaseImage;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem.ImageSource.BinaryRemotePath;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem.ImageSource.BuiltImage;
import com.aliyuncs.sofa.model.v20190815.ListAKSContainerservicesResponse.ListItem.ImageSource.CurrentImage;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAKSContainerservicesResponseUnmarshaller {

	public static ListAKSContainerservicesResponse unmarshall(ListAKSContainerservicesResponse listAKSContainerservicesResponse, UnmarshallerContext _ctx) {
		
		listAKSContainerservicesResponse.setRequestId(_ctx.stringValue("ListAKSContainerservicesResponse.RequestId"));
		listAKSContainerservicesResponse.setResultCode(_ctx.stringValue("ListAKSContainerservicesResponse.ResultCode"));
		listAKSContainerservicesResponse.setResultMessage(_ctx.stringValue("ListAKSContainerservicesResponse.ResultMessage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAKSContainerservicesResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setDisplayedRevision(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].DisplayedRevision"));
			listItem.setOwner(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].Owner"));
			listItem.setPodCount(_ctx.longValue("ListAKSContainerservicesResponse.List["+ i +"].PodCount"));
			listItem.setProcessingPodCount(_ctx.longValue("ListAKSContainerservicesResponse.List["+ i +"].ProcessingPodCount"));
			listItem.setReplicas(_ctx.longValue("ListAKSContainerservicesResponse.List["+ i +"].Replicas"));
			listItem.setRunningPodCount(_ctx.longValue("ListAKSContainerservicesResponse.List["+ i +"].RunningPodCount"));

			ContainerService containerService = new ContainerService();
			containerService.setAppId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.AppId"));
			containerService.setAppName(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.AppName"));
			containerService.setAppSvcId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.AppSvcId"));
			containerService.setAppSvcName(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.AppSvcName"));
			containerService.setContainerServiceType(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.ContainerServiceType"));
			containerService.setDescription(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.Description"));
			containerService.setDraftedRevision(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.DraftedRevision"));
			containerService.setDraftedTime(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.DraftedTime"));
			containerService.setEnableBizMonitor(_ctx.booleanValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.EnableBizMonitor"));
			containerService.setEnableMesh(_ctx.booleanValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.EnableMesh"));
			containerService.setEnableSofaMesh(_ctx.booleanValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.EnableSofaMesh"));
			containerService.setOperatorId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.OperatorId"));
			containerService.setOperatorName(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.OperatorName"));
			containerService.setRuntimeRevision(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.RuntimeRevision"));
			containerService.setUseHostNetwork(_ctx.booleanValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.UseHostNetwork"));

			LifecycleState lifecycleState = new LifecycleState();
			lifecycleState.setDeploymentState(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.LifecycleState.DeploymentState"));
			lifecycleState.setMetadataState(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.LifecycleState.MetadataState"));
			lifecycleState.setRuntimeState(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.LifecycleState.RuntimeState"));
			containerService.setLifecycleState(lifecycleState);

			NamespaceScopedEntity namespaceScopedEntity = new NamespaceScopedEntity();
			namespaceScopedEntity.setClusterId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.NamespaceScopedEntity.ClusterId"));
			namespaceScopedEntity.setName(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.NamespaceScopedEntity.Name"));
			namespaceScopedEntity.setNamespace(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.NamespaceScopedEntity.Namespace"));

			EnvEntity envEntity = new EnvEntity();
			envEntity.setRegionId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.NamespaceScopedEntity.EnvEntity.RegionId"));
			envEntity.setRunEnv(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.NamespaceScopedEntity.EnvEntity.RunEnv"));
			envEntity.setTenantId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.NamespaceScopedEntity.EnvEntity.TenantId"));
			envEntity.setWorkspaceId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.NamespaceScopedEntity.EnvEntity.WorkspaceId"));

			Entity entity = new Entity();
			entity.setCreatedTime(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.NamespaceScopedEntity.EnvEntity.Entity.CreatedTime"));
			entity.setId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.NamespaceScopedEntity.EnvEntity.Entity.Id"));
			entity.setModifiedTime(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.NamespaceScopedEntity.EnvEntity.Entity.ModifiedTime"));
			envEntity.setEntity(entity);
			namespaceScopedEntity.setEnvEntity(envEntity);
			containerService.setNamespaceScopedEntity(namespaceScopedEntity);

			PodTemplate podTemplate = new PodTemplate();
			podTemplate.setContainerServiceId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.PodTemplate.ContainerServiceId"));
			podTemplate.setDnsPolicy(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.PodTemplate.DnsPolicy"));
			podTemplate.setHostNameTemplate(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.PodTemplate.HostNameTemplate"));
			podTemplate.setUseHostNetwork(_ctx.booleanValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.PodTemplate.UseHostNetwork"));

			NamespaceScopedEntity1 namespaceScopedEntity1 = new NamespaceScopedEntity1();
			namespaceScopedEntity1.setClusterId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.PodTemplate.NamespaceScopedEntity.ClusterId"));
			namespaceScopedEntity1.setName(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.PodTemplate.NamespaceScopedEntity.Name"));
			namespaceScopedEntity1.setNamespace(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.PodTemplate.NamespaceScopedEntity.Namespace"));

			EnvEntity2 envEntity2 = new EnvEntity2();
			envEntity2.setRegionId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.PodTemplate.NamespaceScopedEntity.EnvEntity.RegionId"));
			envEntity2.setRunEnv(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.PodTemplate.NamespaceScopedEntity.EnvEntity.RunEnv"));
			envEntity2.setTenantId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.PodTemplate.NamespaceScopedEntity.EnvEntity.TenantId"));
			envEntity2.setWorkspaceId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.PodTemplate.NamespaceScopedEntity.EnvEntity.WorkspaceId"));

			Entity3 entity3 = new Entity3();
			entity3.setCreatedTime(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.PodTemplate.NamespaceScopedEntity.EnvEntity.Entity.CreatedTime"));
			entity3.setId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.PodTemplate.NamespaceScopedEntity.EnvEntity.Entity.Id"));
			entity3.setModifiedTime(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.PodTemplate.NamespaceScopedEntity.EnvEntity.Entity.ModifiedTime"));
			envEntity2.setEntity3(entity3);
			namespaceScopedEntity1.setEnvEntity2(envEntity2);
			podTemplate.setNamespaceScopedEntity1(namespaceScopedEntity1);
			containerService.setPodTemplate(podTemplate);

			List<LogConfigsItem> logConfigs = new ArrayList<LogConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.LogConfigs.Length"); j++) {
				LogConfigsItem logConfigsItem = new LogConfigsItem();
				logConfigsItem.setCreated(_ctx.booleanValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.LogConfigs["+ j +"].Created"));
				logConfigsItem.setFilePattern(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.LogConfigs["+ j +"].FilePattern"));
				logConfigsItem.setLogConfigPath(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.LogConfigs["+ j +"].LogConfigPath"));
				logConfigsItem.setLogPath(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.LogConfigs["+ j +"].LogPath"));
				logConfigsItem.setLogStore(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.LogConfigs["+ j +"].LogStore"));
				logConfigsItem.setName(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.LogConfigs["+ j +"].Name"));
				logConfigsItem.setPublished(_ctx.booleanValue("ListAKSContainerservicesResponse.List["+ i +"].ContainerService.LogConfigs["+ j +"].Published"));

				logConfigs.add(logConfigsItem);
			}
			containerService.setLogConfigs(logConfigs);
			listItem.setContainerService(containerService);

			ImageSource imageSource = new ImageSource();
			imageSource.setAppBuildId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.AppBuildId"));
			imageSource.setBinaryLocalPath(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.BinaryLocalPath"));
			imageSource.setBranch(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.Branch"));
			imageSource.setBuildNumber(_ctx.longValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.BuildNumber"));
			imageSource.setPullSecret(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.PullSecret"));
			imageSource.setRevision(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.Revision"));
			imageSource.setSourceType(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.SourceType"));

			BaseImage baseImage = new BaseImage();
			baseImage.setDigest(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.BaseImage.Digest"));
			baseImage.setImageId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.BaseImage.ImageId"));
			baseImage.setRepository(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.BaseImage.Repository"));
			baseImage.setTag(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.BaseImage.Tag"));
			imageSource.setBaseImage(baseImage);

			BinaryRemotePath binaryRemotePath = new BinaryRemotePath();
			binaryRemotePath.setEndpoint(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.BinaryRemotePath.Endpoint"));
			binaryRemotePath.setFileName(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.BinaryRemotePath.FileName"));
			binaryRemotePath.setPath(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.BinaryRemotePath.Path"));
			imageSource.setBinaryRemotePath(binaryRemotePath);

			BuiltImage builtImage = new BuiltImage();
			builtImage.setDigest(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.BuiltImage.Digest"));
			builtImage.setImageId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.BuiltImage.ImageId"));
			builtImage.setRepository(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.BuiltImage.Repository"));
			builtImage.setTag(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.BuiltImage.Tag"));
			imageSource.setBuiltImage(builtImage);

			CurrentImage currentImage = new CurrentImage();
			currentImage.setDigest(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.CurrentImage.Digest"));
			currentImage.setImageId(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.CurrentImage.ImageId"));
			currentImage.setRepository(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.CurrentImage.Repository"));
			currentImage.setTag(_ctx.stringValue("ListAKSContainerservicesResponse.List["+ i +"].ImageSource.CurrentImage.Tag"));
			imageSource.setCurrentImage(currentImage);
			listItem.setImageSource(imageSource);

			list.add(listItem);
		}
		listAKSContainerservicesResponse.setList(list);
	 
	 	return listAKSContainerservicesResponse;
	}
}