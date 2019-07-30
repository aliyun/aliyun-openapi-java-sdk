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

import com.aliyuncs.ens.model.v20171110.DescribeReservedResourceResponse;
import com.aliyuncs.ens.model.v20171110.DescribeReservedResourceResponse.Image;
import com.aliyuncs.ens.model.v20171110.DescribeReservedResourceResponse.SupportResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReservedResourceResponseUnmarshaller {

	public static DescribeReservedResourceResponse unmarshall(DescribeReservedResourceResponse describeReservedResourceResponse, UnmarshallerContext _ctx) {
		
		describeReservedResourceResponse.setRequestId(_ctx.stringValue("DescribeReservedResourceResponse.RequestId"));
		describeReservedResourceResponse.setCode(_ctx.integerValue("DescribeReservedResourceResponse.Code"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReservedResourceResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setImageId(_ctx.stringValue("DescribeReservedResourceResponse.Images["+ i +"].ImageId"));
			image.setImageName(_ctx.stringValue("DescribeReservedResourceResponse.Images["+ i +"].ImageName"));

			images.add(image);
		}
		describeReservedResourceResponse.setImages(images);

		List<SupportResource> supportResources = new ArrayList<SupportResource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReservedResourceResponse.SupportResources.Length"); i++) {
			SupportResource supportResource = new SupportResource();
			supportResource.setEnsRegionId(_ctx.stringValue("DescribeReservedResourceResponse.SupportResources["+ i +"].EnsRegionId"));
			supportResource.setSupportResourcesCount(_ctx.stringValue("DescribeReservedResourceResponse.SupportResources["+ i +"].SupportResourcesCount"));
			supportResource.setInstanceSpec(_ctx.stringValue("DescribeReservedResourceResponse.SupportResources["+ i +"].InstanceSpec"));

			List<String> systemDiskSizes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReservedResourceResponse.SupportResources["+ i +"].SystemDiskSizes.Length"); j++) {
				systemDiskSizes.add(_ctx.stringValue("DescribeReservedResourceResponse.SupportResources["+ i +"].SystemDiskSizes["+ j +"]"));
			}
			supportResource.setSystemDiskSizes(systemDiskSizes);

			List<String> dataDiskSizes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReservedResourceResponse.SupportResources["+ i +"].DataDiskSizes.Length"); j++) {
				dataDiskSizes.add(_ctx.stringValue("DescribeReservedResourceResponse.SupportResources["+ i +"].DataDiskSizes["+ j +"]"));
			}
			supportResource.setDataDiskSizes(dataDiskSizes);

			supportResources.add(supportResource);
		}
		describeReservedResourceResponse.setSupportResources(supportResources);
	 
	 	return describeReservedResourceResponse;
	}
}