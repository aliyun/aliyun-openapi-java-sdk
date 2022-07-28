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

import com.aliyuncs.vod.model.v20170321.GetImageInfosResponse;
import com.aliyuncs.vod.model.v20170321.GetImageInfosResponse.Image;
import com.aliyuncs.vod.model.v20170321.GetImageInfosResponse.Image.Mezzanine;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageInfosResponseUnmarshaller {

	public static GetImageInfosResponse unmarshall(GetImageInfosResponse getImageInfosResponse, UnmarshallerContext _ctx) {
		
		getImageInfosResponse.setRequestId(_ctx.stringValue("GetImageInfosResponse.RequestId"));

		List<String> nonExistImageIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetImageInfosResponse.NonExistImageIds.Length"); i++) {
			nonExistImageIds.add(_ctx.stringValue("GetImageInfosResponse.NonExistImageIds["+ i +"]"));
		}
		getImageInfosResponse.setNonExistImageIds(nonExistImageIds);

		List<Image> imageInfo = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("GetImageInfosResponse.ImageInfo.Length"); i++) {
			Image image = new Image();
			image.setCreationTime(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].CreationTime"));
			image.setStorageLocation(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].StorageLocation"));
			image.setStatus(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].Status"));
			image.setCateId(_ctx.longValue("GetImageInfosResponse.ImageInfo["+ i +"].CateId"));
			image.setTags(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].Tags"));
			image.setRegionId(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].RegionId"));
			image.setImageType(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].ImageType"));
			image.setCateName(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].CateName"));
			image.setDescription(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].Description"));
			image.setAppId(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].AppId"));
			image.setURL(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].URL"));
			image.setTitle(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].Title"));
			image.setImageId(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].ImageId"));
			image.setAuditStatus(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].AuditStatus"));

			Mezzanine mezzanine = new Mezzanine();
			mezzanine.setFileURL(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].Mezzanine.FileURL"));
			mezzanine.setOriginalFileName(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].Mezzanine.OriginalFileName"));
			mezzanine.setWidth(_ctx.integerValue("GetImageInfosResponse.ImageInfo["+ i +"].Mezzanine.Width"));
			mezzanine.setHeight(_ctx.integerValue("GetImageInfosResponse.ImageInfo["+ i +"].Mezzanine.Height"));
			mezzanine.setFileSize(_ctx.stringValue("GetImageInfosResponse.ImageInfo["+ i +"].Mezzanine.FileSize"));
			image.setMezzanine(mezzanine);

			imageInfo.add(image);
		}
		getImageInfosResponse.setImageInfo(imageInfo);
	 
	 	return getImageInfosResponse;
	}
}