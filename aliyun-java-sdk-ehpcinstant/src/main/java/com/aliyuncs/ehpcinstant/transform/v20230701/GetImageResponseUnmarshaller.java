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

package com.aliyuncs.ehpcinstant.transform.v20230701;

import com.aliyuncs.ehpcinstant.model.v20230701.GetImageResponse;
import com.aliyuncs.ehpcinstant.model.v20230701.GetImageResponse.Image;
import com.aliyuncs.ehpcinstant.model.v20230701.GetImageResponse.Image.ContainerImageSpec;
import com.aliyuncs.ehpcinstant.model.v20230701.GetImageResponse.Image.ContainerImageSpec.RegistryCredential;
import com.aliyuncs.ehpcinstant.model.v20230701.GetImageResponse.Image.VMImageSpec;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageResponseUnmarshaller {

	public static GetImageResponse unmarshall(GetImageResponse getImageResponse, UnmarshallerContext _ctx) {
		
		getImageResponse.setRequestId(_ctx.stringValue("GetImageResponse.RequestId"));
		getImageResponse.setSuccess(_ctx.booleanValue("GetImageResponse.Success"));
		getImageResponse.setTotalCount(_ctx.integerValue("GetImageResponse.TotalCount"));

		Image image = new Image();
		image.setImageType(_ctx.stringValue("GetImageResponse.Image.ImageType"));
		image.setAppId(_ctx.stringValue("GetImageResponse.Image.AppId"));
		image.setName(_ctx.stringValue("GetImageResponse.Image.Name"));
		image.setVersion(_ctx.stringValue("GetImageResponse.Image.Version"));
		image.setLabel(_ctx.stringValue("GetImageResponse.Image.Label"));
		image.setDescription(_ctx.stringValue("GetImageResponse.Image.Description"));
		image.setSize(_ctx.stringValue("GetImageResponse.Image.Size"));
		image.setCreateTime(_ctx.stringValue("GetImageResponse.Image.CreateTime"));
		image.setUpdateTime(_ctx.stringValue("GetImageResponse.Image.UpdateTime"));

		ContainerImageSpec containerImageSpec = new ContainerImageSpec();
		containerImageSpec.setRegistryUrl(_ctx.stringValue("GetImageResponse.Image.ContainerImageSpec.RegistryUrl"));
		containerImageSpec.setIsACRRegistry(_ctx.booleanValue("GetImageResponse.Image.ContainerImageSpec.IsACRRegistry"));
		containerImageSpec.setIsACREnterprise(_ctx.booleanValue("GetImageResponse.Image.ContainerImageSpec.IsACREnterprise"));
		containerImageSpec.setRegistryCriId(_ctx.stringValue("GetImageResponse.Image.ContainerImageSpec.RegistryCriId"));

		RegistryCredential registryCredential = new RegistryCredential();
		registryCredential.setServer(_ctx.stringValue("GetImageResponse.Image.ContainerImageSpec.RegistryCredential.Server"));
		registryCredential.setUserName(_ctx.stringValue("GetImageResponse.Image.ContainerImageSpec.RegistryCredential.UserName"));
		registryCredential.setPassword(_ctx.stringValue("GetImageResponse.Image.ContainerImageSpec.RegistryCredential.Password"));
		containerImageSpec.setRegistryCredential(registryCredential);
		image.setContainerImageSpec(containerImageSpec);

		VMImageSpec vMImageSpec = new VMImageSpec();
		vMImageSpec.setImageId(_ctx.stringValue("GetImageResponse.Image.VMImageSpec.ImageId"));
		vMImageSpec.setOsTag(_ctx.stringValue("GetImageResponse.Image.VMImageSpec.OsTag"));
		vMImageSpec.setPlatform(_ctx.stringValue("GetImageResponse.Image.VMImageSpec.Platform"));
		vMImageSpec.setVersion(_ctx.stringValue("GetImageResponse.Image.VMImageSpec.Version"));
		vMImageSpec.setArchitecture(_ctx.stringValue("GetImageResponse.Image.VMImageSpec.Architecture"));
		image.setVMImageSpec(vMImageSpec);
		getImageResponse.setImage(image);
	 
	 	return getImageResponse;
	}
}