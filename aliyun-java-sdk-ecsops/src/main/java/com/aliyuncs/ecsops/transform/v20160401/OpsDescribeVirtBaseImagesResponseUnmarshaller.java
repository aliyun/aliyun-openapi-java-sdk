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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeVirtBaseImagesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeVirtBaseImagesResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeVirtBaseImagesResponseUnmarshaller {

	public static OpsDescribeVirtBaseImagesResponse unmarshall(OpsDescribeVirtBaseImagesResponse opsDescribeVirtBaseImagesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeVirtBaseImagesResponse.setRequestId(_ctx.stringValue("OpsDescribeVirtBaseImagesResponse.RequestId"));
		opsDescribeVirtBaseImagesResponse.setTotalCount(_ctx.integerValue("OpsDescribeVirtBaseImagesResponse.TotalCount"));
		opsDescribeVirtBaseImagesResponse.setPageSize(_ctx.integerValue("OpsDescribeVirtBaseImagesResponse.PageSize"));
		opsDescribeVirtBaseImagesResponse.setPageNumber(_ctx.integerValue("OpsDescribeVirtBaseImagesResponse.PageNumber"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeVirtBaseImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setDescription(_ctx.stringValue("OpsDescribeVirtBaseImagesResponse.Images["+ i +"].Description"));
			image.setHypervisor(_ctx.stringValue("OpsDescribeVirtBaseImagesResponse.Images["+ i +"].Hypervisor"));
			image.setName(_ctx.stringValue("OpsDescribeVirtBaseImagesResponse.Images["+ i +"].Name"));
			image.setImageId(_ctx.stringValue("OpsDescribeVirtBaseImagesResponse.Images["+ i +"].ImageId"));
			image.setId(_ctx.longValue("OpsDescribeVirtBaseImagesResponse.Images["+ i +"].Id"));

			images.add(image);
		}
		opsDescribeVirtBaseImagesResponse.setImages(images);
	 
	 	return opsDescribeVirtBaseImagesResponse;
	}
}