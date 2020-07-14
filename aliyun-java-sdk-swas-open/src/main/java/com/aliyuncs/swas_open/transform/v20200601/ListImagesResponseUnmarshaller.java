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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.ListImagesResponse;
import com.aliyuncs.swas_open.model.v20200601.ListImagesResponse.ImageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListImagesResponseUnmarshaller {

	public static ListImagesResponse unmarshall(ListImagesResponse listImagesResponse, UnmarshallerContext _ctx) {
		
		listImagesResponse.setRequestId(_ctx.stringValue("ListImagesResponse.RequestId"));

		List<ImageInfo> images = new ArrayList<ImageInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListImagesResponse.Images.Length"); i++) {
			ImageInfo imageInfo = new ImageInfo();
			imageInfo.setImageId(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageId"));
			imageInfo.setImageName(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageName"));
			imageInfo.setDescription(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Description"));
			imageInfo.setImageType(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageType"));
			imageInfo.setCustom(_ctx.booleanValue("ListImagesResponse.Images["+ i +"].Custom"));

			images.add(imageInfo);
		}
		listImagesResponse.setImages(images);
	 
	 	return listImagesResponse;
	}
}