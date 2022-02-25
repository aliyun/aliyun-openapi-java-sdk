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

package com.aliyuncs.cloudphone.transform.v20201230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphone.model.v20201230.ListImagesResponse;
import com.aliyuncs.cloudphone.model.v20201230.ListImagesResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListImagesResponseUnmarshaller {

	public static ListImagesResponse unmarshall(ListImagesResponse listImagesResponse, UnmarshallerContext _ctx) {
		
		listImagesResponse.setRequestId(_ctx.stringValue("ListImagesResponse.RequestId"));
		listImagesResponse.setNextToken(_ctx.stringValue("ListImagesResponse.NextToken"));
		listImagesResponse.setTotalCount(_ctx.integerValue("ListImagesResponse.TotalCount"));
		listImagesResponse.setMaxResults(_ctx.integerValue("ListImagesResponse.MaxResults"));
		listImagesResponse.setRegionId(_ctx.stringValue("ListImagesResponse.RegionId"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("ListImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setStatus(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Status"));
			image.setCreationTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].CreationTime"));
			image.setProgress(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Progress"));
			image.setUsage(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Usage"));
			image.setIsSelfShared(_ctx.booleanValue("ListImagesResponse.Images["+ i +"].IsSelfShared"));
			image.setDescription(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Description"));
			image.setImageName(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageName"));
			image.setOSNameEn(_ctx.stringValue("ListImagesResponse.Images["+ i +"].OSNameEn"));
			image.setPlatform(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Platform"));
			image.setImageCategory(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageCategory"));
			image.setOSName(_ctx.stringValue("ListImagesResponse.Images["+ i +"].OSName"));
			image.setImageId(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageId"));
			image.setOSType(_ctx.stringValue("ListImagesResponse.Images["+ i +"].OSType"));

			images.add(image);
		}
		listImagesResponse.setImages(images);
	 
	 	return listImagesResponse;
	}
}