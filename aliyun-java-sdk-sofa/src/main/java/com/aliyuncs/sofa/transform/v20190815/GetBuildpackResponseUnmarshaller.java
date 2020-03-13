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

import com.aliyuncs.sofa.model.v20190815.GetBuildpackResponse;
import com.aliyuncs.sofa.model.v20190815.GetBuildpackResponse.BuildpackDetailVO;
import com.aliyuncs.sofa.model.v20190815.GetBuildpackResponse.BuildpackDetailVO.BuildCommandParamsItem;
import com.aliyuncs.sofa.model.v20190815.GetBuildpackResponse.BuildpackDetailVO.BuildpackParamsItem;
import com.aliyuncs.sofa.model.v20190815.GetBuildpackResponse.BuildpackDetailVO.Creator;
import com.aliyuncs.sofa.model.v20190815.GetBuildpackResponse.BuildpackDetailVO.Publisher;
import com.aliyuncs.sofa.model.v20190815.GetBuildpackResponse.BuildpackDetailVO.StorageUploadEndpointsItem;
import com.aliyuncs.sofa.model.v20190815.GetBuildpackResponse.BuildpackDetailVO.SupportedOSItem;
import com.aliyuncs.sofa.model.v20190815.GetBuildpackResponse.BuildpackDetailVO.SupportedRegionsItem;
import com.aliyuncs.sofa.model.v20190815.GetBuildpackResponse.BuildpackDetailVO.SupportedRegionsItem.Region;
import com.aliyuncs.sofa.model.v20190815.GetBuildpackResponse.BuildpackDetailVO.Techstack;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBuildpackResponseUnmarshaller {

	public static GetBuildpackResponse unmarshall(GetBuildpackResponse getBuildpackResponse, UnmarshallerContext _ctx) {
		
		getBuildpackResponse.setRequestId(_ctx.stringValue("GetBuildpackResponse.RequestId"));
		getBuildpackResponse.setResultCode(_ctx.stringValue("GetBuildpackResponse.ResultCode"));
		getBuildpackResponse.setResultMessage(_ctx.stringValue("GetBuildpackResponse.ResultMessage"));

		BuildpackDetailVO buildpackDetailVO = new BuildpackDetailVO();
		buildpackDetailVO.setAppServiceCount(_ctx.longValue("GetBuildpackResponse.BuildpackDetailVO.AppServiceCount"));
		buildpackDetailVO.setBuildCommand(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.BuildCommand"));
		buildpackDetailVO.setContactInfo(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.ContactInfo"));
		buildpackDetailVO.setCreatedFrom(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.CreatedFrom"));
		buildpackDetailVO.setCreationTime(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.CreationTime"));
		buildpackDetailVO.setDebugMode(_ctx.booleanValue("GetBuildpackResponse.BuildpackDetailVO.DebugMode"));
		buildpackDetailVO.setDepracationNote(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.DepracationNote"));
		buildpackDetailVO.setDescription(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Description"));
		buildpackDetailVO.setExtraInfo(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.ExtraInfo"));
		buildpackDetailVO.setFullVersion(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.FullVersion"));
		buildpackDetailVO.setId(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Id"));
		buildpackDetailVO.setIndustryLabel(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.IndustryLabel"));
		buildpackDetailVO.setMajorVersion(_ctx.longValue("GetBuildpackResponse.BuildpackDetailVO.MajorVersion"));
		buildpackDetailVO.setMinorVersion(_ctx.longValue("GetBuildpackResponse.BuildpackDetailVO.MinorVersion"));
		buildpackDetailVO.setModificationTime(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.ModificationTime"));
		buildpackDetailVO.setOriginType(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.OriginType"));
		buildpackDetailVO.setPatchVersion(_ctx.longValue("GetBuildpackResponse.BuildpackDetailVO.PatchVersion"));
		buildpackDetailVO.setPublicationTime(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.PublicationTime"));
		buildpackDetailVO.setScope(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Scope"));
		buildpackDetailVO.setStatus(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Status"));
		buildpackDetailVO.setTenantId(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.TenantId"));

		List<String> availableTenantNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBuildpackResponse.BuildpackDetailVO.AvailableTenantNames.Length"); i++) {
			availableTenantNames.add(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.AvailableTenantNames["+ i +"]"));
		}
		buildpackDetailVO.setAvailableTenantNames(availableTenantNames);

		List<String> creationChain = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBuildpackResponse.BuildpackDetailVO.CreationChain.Length"); i++) {
			creationChain.add(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.CreationChain["+ i +"]"));
		}
		buildpackDetailVO.setCreationChain(creationChain);

		Creator creator = new Creator();
		creator.setCustomerId(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Creator.CustomerId"));
		creator.setName(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Creator.Name"));
		creator.setRealName(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Creator.RealName"));
		creator.setType(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Creator.Type"));
		buildpackDetailVO.setCreator(creator);

		Publisher publisher = new Publisher();
		publisher.setCustomerId(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Publisher.CustomerId"));
		publisher.setName(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Publisher.Name"));
		publisher.setRealName(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Publisher.RealName"));
		publisher.setType(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Publisher.Type"));
		buildpackDetailVO.setPublisher(publisher);

		Techstack techstack = new Techstack();
		techstack.setDescription(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Techstack.Description"));
		techstack.setExtraInfo(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Techstack.ExtraInfo"));
		techstack.setId(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Techstack.Id"));
		techstack.setIdentity(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Techstack.Identity"));
		techstack.setName(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Techstack.Name"));
		techstack.setScope(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Techstack.Scope"));
		techstack.setStatus(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.Techstack.Status"));
		buildpackDetailVO.setTechstack(techstack);

		List<BuildpackParamsItem> buildpackParams = new ArrayList<BuildpackParamsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetBuildpackResponse.BuildpackDetailVO.BuildpackParams.Length"); i++) {
			BuildpackParamsItem buildpackParamsItem = new BuildpackParamsItem();
			buildpackParamsItem.setBuildpackId(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.BuildpackParams["+ i +"].BuildpackId"));
			buildpackParamsItem.setDefaultValue(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.BuildpackParams["+ i +"].DefaultValue"));
			buildpackParamsItem.setDescription(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.BuildpackParams["+ i +"].Description"));
			buildpackParamsItem.setId(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.BuildpackParams["+ i +"].Id"));
			buildpackParamsItem.setKey(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.BuildpackParams["+ i +"].Key"));
			buildpackParamsItem.setReadonly(_ctx.booleanValue("GetBuildpackResponse.BuildpackDetailVO.BuildpackParams["+ i +"].Readonly"));
			buildpackParamsItem.setRequired(_ctx.booleanValue("GetBuildpackResponse.BuildpackDetailVO.BuildpackParams["+ i +"].Required"));

			buildpackParams.add(buildpackParamsItem);
		}
		buildpackDetailVO.setBuildpackParams(buildpackParams);

		List<BuildCommandParamsItem> buildCommandParams = new ArrayList<BuildCommandParamsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetBuildpackResponse.BuildpackDetailVO.BuildCommandParams.Length"); i++) {
			BuildCommandParamsItem buildCommandParamsItem = new BuildCommandParamsItem();
			buildCommandParamsItem.setBuildpackId(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.BuildCommandParams["+ i +"].BuildpackId"));
			buildCommandParamsItem.setDescription(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.BuildCommandParams["+ i +"].Description"));
			buildCommandParamsItem.setKey(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.BuildCommandParams["+ i +"].Key"));
			buildCommandParamsItem.setValue(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.BuildCommandParams["+ i +"].Value"));

			buildCommandParams.add(buildCommandParamsItem);
		}
		buildpackDetailVO.setBuildCommandParams(buildCommandParams);

		List<StorageUploadEndpointsItem> storageUploadEndpoints = new ArrayList<StorageUploadEndpointsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetBuildpackResponse.BuildpackDetailVO.StorageUploadEndpoints.Length"); i++) {
			StorageUploadEndpointsItem storageUploadEndpointsItem = new StorageUploadEndpointsItem();
			storageUploadEndpointsItem.setAccessKeyId(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.StorageUploadEndpoints["+ i +"].AccessKeyId"));
			storageUploadEndpointsItem.setBucket(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.StorageUploadEndpoints["+ i +"].Bucket"));
			storageUploadEndpointsItem.setEncodedPolicy(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.StorageUploadEndpoints["+ i +"].EncodedPolicy"));
			storageUploadEndpointsItem.setExpiration(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.StorageUploadEndpoints["+ i +"].Expiration"));
			storageUploadEndpointsItem.setFilePath(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.StorageUploadEndpoints["+ i +"].FilePath"));
			storageUploadEndpointsItem.setHost(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.StorageUploadEndpoints["+ i +"].Host"));
			storageUploadEndpointsItem.setRegionId(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.StorageUploadEndpoints["+ i +"].RegionId"));
			storageUploadEndpointsItem.setSignature(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.StorageUploadEndpoints["+ i +"].Signature"));
			storageUploadEndpointsItem.setStorageType(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.StorageUploadEndpoints["+ i +"].StorageType"));
			storageUploadEndpointsItem.setUrl(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.StorageUploadEndpoints["+ i +"].Url"));

			storageUploadEndpoints.add(storageUploadEndpointsItem);
		}
		buildpackDetailVO.setStorageUploadEndpoints(storageUploadEndpoints);

		List<SupportedOSItem> supportedOS = new ArrayList<SupportedOSItem>();
		for (int i = 0; i < _ctx.lengthValue("GetBuildpackResponse.BuildpackDetailVO.SupportedOS.Length"); i++) {
			SupportedOSItem supportedOSItem = new SupportedOSItem();
			supportedOSItem.setCreationTime(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedOS["+ i +"].CreationTime"));
			supportedOSItem.setDescription(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedOS["+ i +"].Description"));
			supportedOSItem.setExtraInfo(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedOS["+ i +"].ExtraInfo"));
			supportedOSItem.setFullName(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedOS["+ i +"].FullName"));
			supportedOSItem.setId(_ctx.longValue("GetBuildpackResponse.BuildpackDetailVO.SupportedOS["+ i +"].Id"));
			supportedOSItem.setModificationTime(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedOS["+ i +"].ModificationTime"));
			supportedOSItem.setName(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedOS["+ i +"].Name"));
			supportedOSItem.setOsBit(_ctx.longValue("GetBuildpackResponse.BuildpackDetailVO.SupportedOS["+ i +"].OsBit"));
			supportedOSItem.setOsBitNum(_ctx.longValue("GetBuildpackResponse.BuildpackDetailVO.SupportedOS["+ i +"].OsBitNum"));
			supportedOSItem.setVersion(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedOS["+ i +"].Version"));

			List<String> supportedCloudDisplayNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetBuildpackResponse.BuildpackDetailVO.SupportedOS["+ i +"].SupportedCloudDisplayNames.Length"); j++) {
				supportedCloudDisplayNames.add(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedOS["+ i +"].SupportedCloudDisplayNames["+ j +"]"));
			}
			supportedOSItem.setSupportedCloudDisplayNames(supportedCloudDisplayNames);

			List<String> supportedCloudNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetBuildpackResponse.BuildpackDetailVO.SupportedOS["+ i +"].SupportedCloudNames.Length"); j++) {
				supportedCloudNames.add(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedOS["+ i +"].SupportedCloudNames["+ j +"]"));
			}
			supportedOSItem.setSupportedCloudNames(supportedCloudNames);

			supportedOS.add(supportedOSItem);
		}
		buildpackDetailVO.setSupportedOS(supportedOS);

		List<SupportedRegionsItem> supportedRegions = new ArrayList<SupportedRegionsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions.Length"); i++) {
			SupportedRegionsItem supportedRegionsItem = new SupportedRegionsItem();
			supportedRegionsItem.setBuildpackId(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions["+ i +"].BuildpackId"));
			supportedRegionsItem.setBuildpackTenantId(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions["+ i +"].BuildpackTenantId"));
			supportedRegionsItem.setCreationTime(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions["+ i +"].CreationTime"));
			supportedRegionsItem.setFileChecksum(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions["+ i +"].FileChecksum"));
			supportedRegionsItem.setFileLocation(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions["+ i +"].FileLocation"));
			supportedRegionsItem.setFileSize(_ctx.longValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions["+ i +"].FileSize"));
			supportedRegionsItem.setFileStatus(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions["+ i +"].FileStatus"));
			supportedRegionsItem.setFromRegionId(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions["+ i +"].FromRegionId"));
			supportedRegionsItem.setId(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions["+ i +"].Id"));
			supportedRegionsItem.setModificationTime(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions["+ i +"].ModificationTime"));
			supportedRegionsItem.setObjectName(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions["+ i +"].ObjectName"));
			supportedRegionsItem.setOriginalFileName(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions["+ i +"].OriginalFileName"));
			supportedRegionsItem.setReadableFileSize(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions["+ i +"].ReadableFileSize"));

			Region region = new Region();
			region.setId(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions["+ i +"].Region.Id"));
			region.setName(_ctx.stringValue("GetBuildpackResponse.BuildpackDetailVO.SupportedRegions["+ i +"].Region.Name"));
			supportedRegionsItem.setRegion(region);

			supportedRegions.add(supportedRegionsItem);
		}
		buildpackDetailVO.setSupportedRegions(supportedRegions);
		getBuildpackResponse.setBuildpackDetailVO(buildpackDetailVO);
	 
	 	return getBuildpackResponse;
	}
}