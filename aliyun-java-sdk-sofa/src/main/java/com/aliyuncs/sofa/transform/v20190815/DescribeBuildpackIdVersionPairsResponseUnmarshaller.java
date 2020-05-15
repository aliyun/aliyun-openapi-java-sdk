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

import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackIdVersionPairsResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOsItem.Creator;
import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOsItem.Publisher;
import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOsItem.SupportedOSItem;
import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOsItem.SupportedRegionsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOsItem.SupportedRegionsItem.Region;
import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOsItem.Techstack;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBuildpackIdVersionPairsResponseUnmarshaller {

	public static DescribeBuildpackIdVersionPairsResponse unmarshall(DescribeBuildpackIdVersionPairsResponse describeBuildpackIdVersionPairsResponse, UnmarshallerContext _ctx) {
		
		describeBuildpackIdVersionPairsResponse.setRequestId(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.RequestId"));
		describeBuildpackIdVersionPairsResponse.setResultCode(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.ResultCode"));
		describeBuildpackIdVersionPairsResponse.setResultMessage(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.ResultMessage"));
		describeBuildpackIdVersionPairsResponse.setCurrentPage(_ctx.longValue("DescribeBuildpackIdVersionPairsResponse.CurrentPage"));
		describeBuildpackIdVersionPairsResponse.setPageSize(_ctx.longValue("DescribeBuildpackIdVersionPairsResponse.PageSize"));
		describeBuildpackIdVersionPairsResponse.setTotalCount(_ctx.longValue("DescribeBuildpackIdVersionPairsResponse.TotalCount"));

		List<BuildpackCompositeVOsItem> buildpackCompositeVOs = new ArrayList<BuildpackCompositeVOsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs.Length"); i++) {
			BuildpackCompositeVOsItem buildpackCompositeVOsItem = new BuildpackCompositeVOsItem();
			buildpackCompositeVOsItem.setAppServiceCount(_ctx.longValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].AppServiceCount"));
			buildpackCompositeVOsItem.setDescription(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Description"));
			buildpackCompositeVOsItem.setFullVersion(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].FullVersion"));
			buildpackCompositeVOsItem.setId(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Id"));
			buildpackCompositeVOsItem.setOriginType(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].OriginType"));

			Creator creator = new Creator();
			creator.setCustomerId(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Creator.CustomerId"));
			creator.setName(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Creator.Name"));
			creator.setRealName(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Creator.RealName"));
			creator.setType(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Creator.Type"));
			buildpackCompositeVOsItem.setCreator(creator);

			Publisher publisher = new Publisher();
			publisher.setCustomerId(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Publisher.CustomerId"));
			publisher.setName(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Publisher.Name"));
			publisher.setRealName(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Publisher.RealName"));
			publisher.setType(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Publisher.Type"));
			buildpackCompositeVOsItem.setPublisher(publisher);

			Techstack techstack = new Techstack();
			techstack.setDescription(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Techstack.Description"));
			techstack.setExtraInfo(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Techstack.ExtraInfo"));
			techstack.setId(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Techstack.Id"));
			techstack.setIdentity(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Techstack.Identity"));
			techstack.setName(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Techstack.Name"));
			techstack.setScope(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Techstack.Scope"));
			techstack.setStatus(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].Techstack.Status"));
			buildpackCompositeVOsItem.setTechstack(techstack);

			List<SupportedOSItem> supportedOS = new ArrayList<SupportedOSItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedOS.Length"); j++) {
				SupportedOSItem supportedOSItem = new SupportedOSItem();
				supportedOSItem.setCreationTime(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedOS["+ j +"].CreationTime"));
				supportedOSItem.setDescription(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedOS["+ j +"].Description"));
				supportedOSItem.setExtraInfo(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedOS["+ j +"].ExtraInfo"));
				supportedOSItem.setFullName(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedOS["+ j +"].FullName"));
				supportedOSItem.setId(_ctx.longValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedOS["+ j +"].Id"));
				supportedOSItem.setModificationTime(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedOS["+ j +"].ModificationTime"));
				supportedOSItem.setName(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedOS["+ j +"].Name"));
				supportedOSItem.setOsBit(_ctx.longValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedOS["+ j +"].OsBit"));
				supportedOSItem.setOsBitNum(_ctx.longValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedOS["+ j +"].OsBitNum"));
				supportedOSItem.setVersion(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedOS["+ j +"].Version"));

				List<String> supportedCloudDisplayNames = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedOS["+ j +"].SupportedCloudDisplayNames.Length"); k++) {
					supportedCloudDisplayNames.add(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedOS["+ j +"].SupportedCloudDisplayNames["+ k +"]"));
				}
				supportedOSItem.setSupportedCloudDisplayNames(supportedCloudDisplayNames);

				List<String> supportedCloudNames = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedOS["+ j +"].SupportedCloudNames.Length"); k++) {
					supportedCloudNames.add(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedOS["+ j +"].SupportedCloudNames["+ k +"]"));
				}
				supportedOSItem.setSupportedCloudNames(supportedCloudNames);

				supportedOS.add(supportedOSItem);
			}
			buildpackCompositeVOsItem.setSupportedOS(supportedOS);

			List<SupportedRegionsItem> supportedRegions = new ArrayList<SupportedRegionsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions.Length"); j++) {
				SupportedRegionsItem supportedRegionsItem = new SupportedRegionsItem();
				supportedRegionsItem.setBuildpackId(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions["+ j +"].BuildpackId"));
				supportedRegionsItem.setBuildpackTenantId(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions["+ j +"].BuildpackTenantId"));
				supportedRegionsItem.setCreationTime(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions["+ j +"].CreationTime"));
				supportedRegionsItem.setFileChecksum(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions["+ j +"].FileChecksum"));
				supportedRegionsItem.setFileLocation(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions["+ j +"].FileLocation"));
				supportedRegionsItem.setFileSize(_ctx.longValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions["+ j +"].FileSize"));
				supportedRegionsItem.setFileStatus(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions["+ j +"].FileStatus"));
				supportedRegionsItem.setFromRegionId(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions["+ j +"].FromRegionId"));
				supportedRegionsItem.setId(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions["+ j +"].Id"));
				supportedRegionsItem.setModificationTime(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions["+ j +"].ModificationTime"));
				supportedRegionsItem.setObjectName(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions["+ j +"].ObjectName"));
				supportedRegionsItem.setOriginalFileName(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions["+ j +"].OriginalFileName"));
				supportedRegionsItem.setReadableFileSize(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions["+ j +"].ReadableFileSize"));

				Region region = new Region();
				region.setId(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions["+ j +"].Region.Id"));
				region.setName(_ctx.stringValue("DescribeBuildpackIdVersionPairsResponse.BuildpackCompositeVOs["+ i +"].SupportedRegions["+ j +"].Region.Name"));
				supportedRegionsItem.setRegion(region);

				supportedRegions.add(supportedRegionsItem);
			}
			buildpackCompositeVOsItem.setSupportedRegions(supportedRegions);

			buildpackCompositeVOs.add(buildpackCompositeVOsItem);
		}
		describeBuildpackIdVersionPairsResponse.setBuildpackCompositeVOs(buildpackCompositeVOs);
	 
	 	return describeBuildpackIdVersionPairsResponse;
	}
}