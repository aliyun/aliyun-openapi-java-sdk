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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeImagesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeImagesResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeImagesResponseUnmarshaller {

	public static OpsDescribeImagesResponse unmarshall(OpsDescribeImagesResponse opsDescribeImagesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeImagesResponse.setRequestId(_ctx.stringValue("OpsDescribeImagesResponse.RequestId"));
		opsDescribeImagesResponse.setTotalCount(_ctx.integerValue("OpsDescribeImagesResponse.TotalCount"));
		opsDescribeImagesResponse.setPageSize(_ctx.integerValue("OpsDescribeImagesResponse.PageSize"));
		opsDescribeImagesResponse.setPageNumber(_ctx.integerValue("OpsDescribeImagesResponse.PageNumber"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setStatus(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].Status"));
			image.setDisplayName(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].DisplayName"));
			image.setSupportIoOptimizedInstance(_ctx.booleanValue("OpsDescribeImagesResponse.Images["+ i +"].SupportIoOptimizedInstance"));
			image.setImageOwnerAlias(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].ImageOwnerAlias"));
			image.setOSSubType(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].OSSubType"));
			image.setImageVersion(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].ImageVersion"));
			image.setUsage(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].Usage"));
			image.setBid(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].Bid"));
			image.setRegionId(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].RegionId"));
			image.setResourceOwnerId(_ctx.longValue("OpsDescribeImagesResponse.Images["+ i +"].ResourceOwnerId"));
			image.setModifiedTime(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].ModifiedTime"));
			image.setDescription(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].Description"));
			image.setSnapshotId(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].SnapshotId"));
			image.setOSMemo(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].OSMemo"));
			image.setSize(_ctx.integerValue("OpsDescribeImagesResponse.Images["+ i +"].Size"));
			image.setPlatform(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].Platform"));
			image.setImageName(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].ImageName"));
			image.setOSName(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].OSName"));
			image.setCreatedTime(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].CreatedTime"));
			image.setImageId(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].ImageId"));
			image.setOSType(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].OSType"));
			image.setProductCode(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].ProductCode"));
			image.setArchitecture(_ctx.stringValue("OpsDescribeImagesResponse.Images["+ i +"].Architecture"));

			images.add(image);
		}
		opsDescribeImagesResponse.setImages(images);
	 
	 	return opsDescribeImagesResponse;
	}
}