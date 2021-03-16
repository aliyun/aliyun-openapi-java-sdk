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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeAuthorizedSystemImagesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeAuthorizedSystemImagesResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeAuthorizedSystemImagesResponseUnmarshaller {

	public static OpsDescribeAuthorizedSystemImagesResponse unmarshall(OpsDescribeAuthorizedSystemImagesResponse opsDescribeAuthorizedSystemImagesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeAuthorizedSystemImagesResponse.setRequestId(_ctx.stringValue("OpsDescribeAuthorizedSystemImagesResponse.RequestId"));
		opsDescribeAuthorizedSystemImagesResponse.setTotalCount(_ctx.integerValue("OpsDescribeAuthorizedSystemImagesResponse.TotalCount"));
		opsDescribeAuthorizedSystemImagesResponse.setPageNumber(_ctx.integerValue("OpsDescribeAuthorizedSystemImagesResponse.PageNumber"));
		opsDescribeAuthorizedSystemImagesResponse.setPageSize(_ctx.integerValue("OpsDescribeAuthorizedSystemImagesResponse.PageSize"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeAuthorizedSystemImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setDbId(_ctx.longValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].DbId"));
			image.setAliUid(_ctx.longValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].AliUid"));
			image.setImageId(_ctx.stringValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].ImageId"));
			image.setOsName(_ctx.stringValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].OsName"));
			image.setImageCategory(_ctx.stringValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].ImageCategory"));
			image.setVirtBaseImageId(_ctx.longValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].VirtBaseImageId"));
			image.setRegionId(_ctx.stringValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].RegionId"));
			image.setStatus(_ctx.stringValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].Status"));
			image.setCreationTime(_ctx.stringValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].CreationTime"));
			image.setModifyTime(_ctx.stringValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].ModifyTime"));
			image.setPlatform(_ctx.stringValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].Platform"));
			image.setOsType(_ctx.stringValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].OsType"));
			image.setImageName(_ctx.stringValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].ImageName"));
			image.setImageSize(_ctx.integerValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].ImageSize"));
			image.setVersion(_ctx.stringValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].Version"));
			image.setDescription(_ctx.stringValue("OpsDescribeAuthorizedSystemImagesResponse.Images["+ i +"].Description"));

			images.add(image);
		}
		opsDescribeAuthorizedSystemImagesResponse.setImages(images);
	 
	 	return opsDescribeAuthorizedSystemImagesResponse;
	}
}