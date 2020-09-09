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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListDynamicImageResponse;
import com.aliyuncs.vod.model.v20170321.ListDynamicImageResponse.DynamicImage;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDynamicImageResponseUnmarshaller {

	public static ListDynamicImageResponse unmarshall(ListDynamicImageResponse listDynamicImageResponse, UnmarshallerContext _ctx) {
		
		listDynamicImageResponse.setRequestId(_ctx.stringValue("ListDynamicImageResponse.RequestId"));

		List<DynamicImage> dynamicImageList = new ArrayList<DynamicImage>();
		for (int i = 0; i < _ctx.lengthValue("ListDynamicImageResponse.DynamicImageList.Length"); i++) {
			DynamicImage dynamicImage = new DynamicImage();
			dynamicImage.setVideoId(_ctx.stringValue("ListDynamicImageResponse.DynamicImageList["+ i +"].VideoId"));
			dynamicImage.setDynamicImageId(_ctx.stringValue("ListDynamicImageResponse.DynamicImageList["+ i +"].DynamicImageId"));
			dynamicImage.setJobId(_ctx.stringValue("ListDynamicImageResponse.DynamicImageList["+ i +"].JobId"));
			dynamicImage.setFileURL(_ctx.stringValue("ListDynamicImageResponse.DynamicImageList["+ i +"].FileURL"));
			dynamicImage.setWidth(_ctx.stringValue("ListDynamicImageResponse.DynamicImageList["+ i +"].Width"));
			dynamicImage.setHeight(_ctx.stringValue("ListDynamicImageResponse.DynamicImageList["+ i +"].Height"));
			dynamicImage.setDuration(_ctx.stringValue("ListDynamicImageResponse.DynamicImageList["+ i +"].Duration"));
			dynamicImage.setFormat(_ctx.stringValue("ListDynamicImageResponse.DynamicImageList["+ i +"].Format"));
			dynamicImage.setFileSize(_ctx.stringValue("ListDynamicImageResponse.DynamicImageList["+ i +"].FileSize"));
			dynamicImage.setFps(_ctx.stringValue("ListDynamicImageResponse.DynamicImageList["+ i +"].Fps"));
			dynamicImage.setCreationTime(_ctx.stringValue("ListDynamicImageResponse.DynamicImageList["+ i +"].CreationTime"));

			dynamicImageList.add(dynamicImage);
		}
		listDynamicImageResponse.setDynamicImageList(dynamicImageList);
	 
	 	return listDynamicImageResponse;
	}
}