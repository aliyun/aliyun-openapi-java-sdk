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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeAvailableResourceInfoResponse;
import com.aliyuncs.ens.model.v20171110.DescribeAvailableResourceInfoResponse.Image;
import com.aliyuncs.ens.model.v20171110.DescribeAvailableResourceInfoResponse.SupportResource;
import com.aliyuncs.ens.model.v20171110.DescribeAvailableResourceInfoResponse.SupportResource.EnsRegionId;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableResourceInfoResponseUnmarshaller {

	public static DescribeAvailableResourceInfoResponse unmarshall(DescribeAvailableResourceInfoResponse describeAvailableResourceInfoResponse, UnmarshallerContext _ctx) {
		
		describeAvailableResourceInfoResponse.setRequestId(_ctx.stringValue("DescribeAvailableResourceInfoResponse.RequestId"));

		List<SupportResource> supportResources = new ArrayList<SupportResource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableResourceInfoResponse.SupportResources.Length"); i++) {
			SupportResource supportResource = new SupportResource();
			supportResource.setDataDiskMinSize(_ctx.integerValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].DataDiskMinSize"));
			supportResource.setSystemDiskMinSize(_ctx.integerValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].SystemDiskMinSize"));
			supportResource.setSystemDiskMaxSize(_ctx.integerValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].SystemDiskMaxSize"));
			supportResource.setDataDiskMaxSize(_ctx.integerValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].DataDiskMaxSize"));

			List<String> instanceSpeces = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].InstanceSpeces.Length"); j++) {
				instanceSpeces.add(_ctx.stringValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].InstanceSpeces["+ j +"]"));
			}
			supportResource.setInstanceSpeces(instanceSpeces);

			List<String> bandwidthTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].BandwidthTypes.Length"); j++) {
				bandwidthTypes.add(_ctx.stringValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].BandwidthTypes["+ j +"]"));
			}
			supportResource.setBandwidthTypes(bandwidthTypes);

			List<String> ensRegionIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].EnsRegionIds.Length"); j++) {
				ensRegionIds.add(_ctx.stringValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].EnsRegionIds["+ j +"]"));
			}
			supportResource.setEnsRegionIds(ensRegionIds);

			List<EnsRegionId> ensRegionIdsExtends = new ArrayList<EnsRegionId>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].EnsRegionIdsExtends.Length"); j++) {
				EnsRegionId ensRegionId = new EnsRegionId();
				ensRegionId.setArea(_ctx.stringValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].EnsRegionIdsExtends["+ j +"].Area"));
				ensRegionId.setEnName(_ctx.stringValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].EnsRegionIdsExtends["+ j +"].EnName"));
				ensRegionId.setEnsRegionId(_ctx.stringValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].EnsRegionIdsExtends["+ j +"].EnsRegionId"));
				ensRegionId.setProvince(_ctx.stringValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].EnsRegionIdsExtends["+ j +"].Province"));
				ensRegionId.setName(_ctx.stringValue("DescribeAvailableResourceInfoResponse.SupportResources["+ i +"].EnsRegionIdsExtends["+ j +"].Name"));

				ensRegionIdsExtends.add(ensRegionId);
			}
			supportResource.setEnsRegionIdsExtends(ensRegionIdsExtends);

			supportResources.add(supportResource);
		}
		describeAvailableResourceInfoResponse.setSupportResources(supportResources);

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableResourceInfoResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setImageName(_ctx.stringValue("DescribeAvailableResourceInfoResponse.Images["+ i +"].ImageName"));
			image.setImageSize(_ctx.integerValue("DescribeAvailableResourceInfoResponse.Images["+ i +"].ImageSize"));
			image.setImageId(_ctx.stringValue("DescribeAvailableResourceInfoResponse.Images["+ i +"].ImageId"));

			images.add(image);
		}
		describeAvailableResourceInfoResponse.setImages(images);
	 
	 	return describeAvailableResourceInfoResponse;
	}
}