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

package com.aliyuncs.ehpcinstant.transform.v20230701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpcinstant.model.v20230701.ListImagesResponse;
import com.aliyuncs.ehpcinstant.model.v20230701.ListImagesResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListImagesResponseUnmarshaller {

	public static ListImagesResponse unmarshall(ListImagesResponse listImagesResponse, UnmarshallerContext _ctx) {
		
		listImagesResponse.setRequestId(_ctx.stringValue("ListImagesResponse.RequestId"));
		listImagesResponse.setSuccess(_ctx.booleanValue("ListImagesResponse.Success"));
		listImagesResponse.setTotalCount(_ctx.integerValue("ListImagesResponse.TotalCount"));
		listImagesResponse.setPageSize(_ctx.longValue("ListImagesResponse.PageSize"));
		listImagesResponse.setPageNumber(_ctx.longValue("ListImagesResponse.PageNumber"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("ListImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setImageType(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageType"));
			image.setImageId(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageId"));
			image.setAppId(_ctx.stringValue("ListImagesResponse.Images["+ i +"].AppId"));
			image.setName(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Name"));
			image.setVersion(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Version"));
			image.setLabel(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Label"));
			image.setDescription(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Description"));
			image.setSize(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Size"));
			image.setCreateTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].CreateTime"));
			image.setStatus(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Status"));

			images.add(image);
		}
		listImagesResponse.setImages(images);
	 
	 	return listImagesResponse;
	}
}