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

import com.aliyuncs.sofa.model.v20190815.DeleteBuildpacksResponse;
import com.aliyuncs.sofa.model.v20190815.DeleteBuildpacksResponse.BuildpackDetailVoItem;
import com.aliyuncs.sofa.model.v20190815.DeleteBuildpacksResponse.BuildpackDetailVoItem.BuildCommandParamsItem;
import com.aliyuncs.sofa.model.v20190815.DeleteBuildpacksResponse.BuildpackDetailVoItem.BuildpackParamsItem;
import com.aliyuncs.sofa.model.v20190815.DeleteBuildpacksResponse.BuildpackDetailVoItem.Creator;
import com.aliyuncs.sofa.model.v20190815.DeleteBuildpacksResponse.BuildpackDetailVoItem.Publisher;
import com.aliyuncs.sofa.model.v20190815.DeleteBuildpacksResponse.BuildpackDetailVoItem.StorageUploadEndpointsItem;
import com.aliyuncs.sofa.model.v20190815.DeleteBuildpacksResponse.BuildpackDetailVoItem.SupportedOSItem;
import com.aliyuncs.sofa.model.v20190815.DeleteBuildpacksResponse.BuildpackDetailVoItem.SupportedRegionsItem;
import com.aliyuncs.sofa.model.v20190815.DeleteBuildpacksResponse.BuildpackDetailVoItem.SupportedRegionsItem.Region;
import com.aliyuncs.sofa.model.v20190815.DeleteBuildpacksResponse.BuildpackDetailVoItem.Techstack;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteBuildpacksResponseUnmarshaller {

	public static DeleteBuildpacksResponse unmarshall(DeleteBuildpacksResponse deleteBuildpacksResponse, UnmarshallerContext _ctx) {
		
		deleteBuildpacksResponse.setRequestId(_ctx.stringValue("DeleteBuildpacksResponse.RequestId"));
		deleteBuildpacksResponse.setResultCode(_ctx.stringValue("DeleteBuildpacksResponse.ResultCode"));
		deleteBuildpacksResponse.setResultMessage(_ctx.stringValue("DeleteBuildpacksResponse.ResultMessage"));

		List<BuildpackDetailVoItem> buildpackDetailVo = new ArrayList<BuildpackDetailVoItem>();
		for (int i = 0; i < _ctx.lengthValue("DeleteBuildpacksResponse.BuildpackDetailVo.Length"); i++) {
			BuildpackDetailVoItem buildpackDetailVoItem = new BuildpackDetailVoItem();
			buildpackDetailVoItem.setAppServiceCount(_ctx.longValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].AppServiceCount"));
			buildpackDetailVoItem.setBuildCommand(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].BuildCommand"));
			buildpackDetailVoItem.setContactInfo(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].ContactInfo"));
			buildpackDetailVoItem.setCreatedFrom(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].CreatedFrom"));
			buildpackDetailVoItem.setCreationTime(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].CreationTime"));
			buildpackDetailVoItem.setDebugMode(_ctx.booleanValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].DebugMode"));
			buildpackDetailVoItem.setDepracationNote(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].DepracationNote"));
			buildpackDetailVoItem.setDescription(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Description"));
			buildpackDetailVoItem.setExtraInfo(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].ExtraInfo"));
			buildpackDetailVoItem.setFullVersion(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].FullVersion"));
			buildpackDetailVoItem.setId(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Id"));
			buildpackDetailVoItem.setIndustryLabel(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].IndustryLabel"));
			buildpackDetailVoItem.setMajorVersion(_ctx.longValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].MajorVersion"));
			buildpackDetailVoItem.setMinorVersion(_ctx.longValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].MinorVersion"));
			buildpackDetailVoItem.setModificationTime(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].ModificationTime"));
			buildpackDetailVoItem.setOriginType(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].OriginType"));
			buildpackDetailVoItem.setPatchVersion(_ctx.longValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].PatchVersion"));
			buildpackDetailVoItem.setPublicationTime(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].PublicationTime"));
			buildpackDetailVoItem.setScope(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Scope"));
			buildpackDetailVoItem.setStatus(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Status"));
			buildpackDetailVoItem.setTenantId(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].TenantId"));

			List<String> availableTenantNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].AvailableTenantNames.Length"); j++) {
				availableTenantNames.add(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].AvailableTenantNames["+ j +"]"));
			}
			buildpackDetailVoItem.setAvailableTenantNames(availableTenantNames);

			List<String> creationChain = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].CreationChain.Length"); j++) {
				creationChain.add(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].CreationChain["+ j +"]"));
			}
			buildpackDetailVoItem.setCreationChain(creationChain);

			Creator creator = new Creator();
			creator.setCustomerId(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Creator.CustomerId"));
			creator.setName(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Creator.Name"));
			creator.setRealName(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Creator.RealName"));
			creator.setType(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Creator.Type"));
			buildpackDetailVoItem.setCreator(creator);

			Publisher publisher = new Publisher();
			publisher.setCustomerId(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Publisher.CustomerId"));
			publisher.setName(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Publisher.Name"));
			publisher.setRealName(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Publisher.RealName"));
			publisher.setType(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Publisher.Type"));
			buildpackDetailVoItem.setPublisher(publisher);

			Techstack techstack = new Techstack();
			techstack.setDescription(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Techstack.Description"));
			techstack.setExtraInfo(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Techstack.ExtraInfo"));
			techstack.setId(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Techstack.Id"));
			techstack.setIdentity(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Techstack.Identity"));
			techstack.setName(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Techstack.Name"));
			techstack.setScope(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Techstack.Scope"));
			techstack.setStatus(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].Techstack.Status"));
			buildpackDetailVoItem.setTechstack(techstack);

			List<BuildpackParamsItem> buildpackParams = new ArrayList<BuildpackParamsItem>();
			for (int j = 0; j < _ctx.lengthValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].BuildpackParams.Length"); j++) {
				BuildpackParamsItem buildpackParamsItem = new BuildpackParamsItem();
				buildpackParamsItem.setBuildpackId(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].BuildpackParams["+ j +"].BuildpackId"));
				buildpackParamsItem.setDefaultValue(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].BuildpackParams["+ j +"].DefaultValue"));
				buildpackParamsItem.setDescription(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].BuildpackParams["+ j +"].Description"));
				buildpackParamsItem.setId(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].BuildpackParams["+ j +"].Id"));
				buildpackParamsItem.setKey(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].BuildpackParams["+ j +"].Key"));
				buildpackParamsItem.setReadonly(_ctx.booleanValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].BuildpackParams["+ j +"].Readonly"));
				buildpackParamsItem.setRequired(_ctx.booleanValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].BuildpackParams["+ j +"].Required"));

				buildpackParams.add(buildpackParamsItem);
			}
			buildpackDetailVoItem.setBuildpackParams(buildpackParams);

			List<BuildCommandParamsItem> buildCommandParams = new ArrayList<BuildCommandParamsItem>();
			for (int j = 0; j < _ctx.lengthValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].BuildCommandParams.Length"); j++) {
				BuildCommandParamsItem buildCommandParamsItem = new BuildCommandParamsItem();
				buildCommandParamsItem.setBuildpackId(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].BuildCommandParams["+ j +"].BuildpackId"));
				buildCommandParamsItem.setDescription(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].BuildCommandParams["+ j +"].Description"));
				buildCommandParamsItem.setKey(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].BuildCommandParams["+ j +"].Key"));
				buildCommandParamsItem.setValue(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].BuildCommandParams["+ j +"].Value"));

				buildCommandParams.add(buildCommandParamsItem);
			}
			buildpackDetailVoItem.setBuildCommandParams(buildCommandParams);

			List<StorageUploadEndpointsItem> storageUploadEndpoints = new ArrayList<StorageUploadEndpointsItem>();
			for (int j = 0; j < _ctx.lengthValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].StorageUploadEndpoints.Length"); j++) {
				StorageUploadEndpointsItem storageUploadEndpointsItem = new StorageUploadEndpointsItem();
				storageUploadEndpointsItem.setAccessKeyId(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].StorageUploadEndpoints["+ j +"].AccessKeyId"));
				storageUploadEndpointsItem.setBucket(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].StorageUploadEndpoints["+ j +"].Bucket"));
				storageUploadEndpointsItem.setEncodedPolicy(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].StorageUploadEndpoints["+ j +"].EncodedPolicy"));
				storageUploadEndpointsItem.setExpiration(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].StorageUploadEndpoints["+ j +"].Expiration"));
				storageUploadEndpointsItem.setFilePath(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].StorageUploadEndpoints["+ j +"].FilePath"));
				storageUploadEndpointsItem.setHost(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].StorageUploadEndpoints["+ j +"].Host"));
				storageUploadEndpointsItem.setRegionId(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].StorageUploadEndpoints["+ j +"].RegionId"));
				storageUploadEndpointsItem.setSignature(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].StorageUploadEndpoints["+ j +"].Signature"));
				storageUploadEndpointsItem.setStorageType(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].StorageUploadEndpoints["+ j +"].StorageType"));
				storageUploadEndpointsItem.setUrl(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].StorageUploadEndpoints["+ j +"].Url"));

				storageUploadEndpoints.add(storageUploadEndpointsItem);
			}
			buildpackDetailVoItem.setStorageUploadEndpoints(storageUploadEndpoints);

			List<SupportedOSItem> supportedOS = new ArrayList<SupportedOSItem>();
			for (int j = 0; j < _ctx.lengthValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedOS.Length"); j++) {
				SupportedOSItem supportedOSItem = new SupportedOSItem();
				supportedOSItem.setCreationTime(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedOS["+ j +"].CreationTime"));
				supportedOSItem.setDescription(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedOS["+ j +"].Description"));
				supportedOSItem.setExtraInfo(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedOS["+ j +"].ExtraInfo"));
				supportedOSItem.setFullName(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedOS["+ j +"].FullName"));
				supportedOSItem.setId(_ctx.longValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedOS["+ j +"].Id"));
				supportedOSItem.setModificationTime(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedOS["+ j +"].ModificationTime"));
				supportedOSItem.setName(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedOS["+ j +"].Name"));
				supportedOSItem.setOsBit(_ctx.longValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedOS["+ j +"].OsBit"));
				supportedOSItem.setOsBitNum(_ctx.longValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedOS["+ j +"].OsBitNum"));
				supportedOSItem.setVersion(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedOS["+ j +"].Version"));

				List<String> supportedCloudDisplayNames = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedOS["+ j +"].SupportedCloudDisplayNames.Length"); k++) {
					supportedCloudDisplayNames.add(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedOS["+ j +"].SupportedCloudDisplayNames["+ k +"]"));
				}
				supportedOSItem.setSupportedCloudDisplayNames(supportedCloudDisplayNames);

				List<String> supportedCloudNames = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedOS["+ j +"].SupportedCloudNames.Length"); k++) {
					supportedCloudNames.add(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedOS["+ j +"].SupportedCloudNames["+ k +"]"));
				}
				supportedOSItem.setSupportedCloudNames(supportedCloudNames);

				supportedOS.add(supportedOSItem);
			}
			buildpackDetailVoItem.setSupportedOS(supportedOS);

			List<SupportedRegionsItem> supportedRegions = new ArrayList<SupportedRegionsItem>();
			for (int j = 0; j < _ctx.lengthValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions.Length"); j++) {
				SupportedRegionsItem supportedRegionsItem = new SupportedRegionsItem();
				supportedRegionsItem.setBuildpackId(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions["+ j +"].BuildpackId"));
				supportedRegionsItem.setBuildpackTenantId(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions["+ j +"].BuildpackTenantId"));
				supportedRegionsItem.setCreationTime(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions["+ j +"].CreationTime"));
				supportedRegionsItem.setFileChecksum(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions["+ j +"].FileChecksum"));
				supportedRegionsItem.setFileLocation(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions["+ j +"].FileLocation"));
				supportedRegionsItem.setFileSize(_ctx.longValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions["+ j +"].FileSize"));
				supportedRegionsItem.setFileStatus(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions["+ j +"].FileStatus"));
				supportedRegionsItem.setFromRegionId(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions["+ j +"].FromRegionId"));
				supportedRegionsItem.setId(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions["+ j +"].Id"));
				supportedRegionsItem.setModificationTime(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions["+ j +"].ModificationTime"));
				supportedRegionsItem.setObjectName(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions["+ j +"].ObjectName"));
				supportedRegionsItem.setOriginalFileName(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions["+ j +"].OriginalFileName"));
				supportedRegionsItem.setReadableFileSize(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions["+ j +"].ReadableFileSize"));

				Region region = new Region();
				region.setId(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions["+ j +"].Region.Id"));
				region.setName(_ctx.stringValue("DeleteBuildpacksResponse.BuildpackDetailVo["+ i +"].SupportedRegions["+ j +"].Region.Name"));
				supportedRegionsItem.setRegion(region);

				supportedRegions.add(supportedRegionsItem);
			}
			buildpackDetailVoItem.setSupportedRegions(supportedRegions);

			buildpackDetailVo.add(buildpackDetailVoItem);
		}
		deleteBuildpacksResponse.setBuildpackDetailVo(buildpackDetailVo);
	 
	 	return deleteBuildpacksResponse;
	}
}