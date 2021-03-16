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

import com.aliyuncs.ens.model.v20171110.DescribeAvailableResourceResponse;
import com.aliyuncs.ens.model.v20171110.DescribeAvailableResourceResponse.Image;
import com.aliyuncs.ens.model.v20171110.DescribeAvailableResourceResponse.SupportResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableResourceResponseUnmarshaller {

	public static DescribeAvailableResourceResponse unmarshall(DescribeAvailableResourceResponse describeAvailableResourceResponse, UnmarshallerContext _ctx) {
		
		describeAvailableResourceResponse.setRequestId(_ctx.stringValue("DescribeAvailableResourceResponse.RequestId"));
		describeAvailableResourceResponse.setCode(_ctx.integerValue("DescribeAvailableResourceResponse.Code"));

		List<SupportResource> supportResources = new ArrayList<SupportResource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableResourceResponse.SupportResources.Length"); i++) {
			SupportResource supportResource = new SupportResource();
			supportResource.setInstanceSpec(_ctx.stringValue("DescribeAvailableResourceResponse.SupportResources["+ i +"].InstanceSpec"));
			supportResource.setSystemDiskSize(_ctx.stringValue("DescribeAvailableResourceResponse.SupportResources["+ i +"].SystemDiskSize"));
			supportResource.setSupportResourcesCount(_ctx.stringValue("DescribeAvailableResourceResponse.SupportResources["+ i +"].SupportResourcesCount"));
			supportResource.setDataDiskSize(_ctx.stringValue("DescribeAvailableResourceResponse.SupportResources["+ i +"].DataDiskSize"));
			supportResource.setEnsRegionId(_ctx.stringValue("DescribeAvailableResourceResponse.SupportResources["+ i +"].EnsRegionId"));

			supportResources.add(supportResource);
		}
		describeAvailableResourceResponse.setSupportResources(supportResources);

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableResourceResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setImageName(_ctx.stringValue("DescribeAvailableResourceResponse.Images["+ i +"].ImageName"));
			image.setImageId(_ctx.stringValue("DescribeAvailableResourceResponse.Images["+ i +"].ImageId"));

			images.add(image);
		}
		describeAvailableResourceResponse.setImages(images);
	 
	 	return describeAvailableResourceResponse;
	}
}