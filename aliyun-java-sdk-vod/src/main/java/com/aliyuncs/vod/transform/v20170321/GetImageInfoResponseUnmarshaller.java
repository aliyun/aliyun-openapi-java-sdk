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

import com.aliyuncs.vod.model.v20170321.GetImageInfoResponse;
import com.aliyuncs.vod.model.v20170321.GetImageInfoResponse.ImageInfo;
import com.aliyuncs.vod.model.v20170321.GetImageInfoResponse.ImageInfo.Mezzanine;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageInfoResponseUnmarshaller {

	public static GetImageInfoResponse unmarshall(GetImageInfoResponse getImageInfoResponse, UnmarshallerContext context) {
		
		getImageInfoResponse.setRequestId(context.stringValue("GetImageInfoResponse.RequestId"));

		ImageInfo imageInfo = new ImageInfo();
		imageInfo.setImageId(context.stringValue("GetImageInfoResponse.ImageInfo.ImageId"));
		imageInfo.setTitle(context.stringValue("GetImageInfoResponse.ImageInfo.Title"));
		imageInfo.setCreationTime(context.stringValue("GetImageInfoResponse.ImageInfo.CreationTime"));
		imageInfo.setImageType(context.stringValue("GetImageInfoResponse.ImageInfo.ImageType"));
		imageInfo.setTags(context.stringValue("GetImageInfoResponse.ImageInfo.Tags"));
		imageInfo.setURL(context.stringValue("GetImageInfoResponse.ImageInfo.URL"));
		imageInfo.setCateId(context.longValue("GetImageInfoResponse.ImageInfo.CateId"));
		imageInfo.setCateName(context.stringValue("GetImageInfoResponse.ImageInfo.CateName"));
		imageInfo.setDescription(context.stringValue("GetImageInfoResponse.ImageInfo.Description"));
		imageInfo.setStorageLocation(context.stringValue("GetImageInfoResponse.ImageInfo.StorageLocation"));
		imageInfo.setStatus(context.stringValue("GetImageInfoResponse.ImageInfo.Status"));
		imageInfo.setAppId(context.stringValue("GetImageInfoResponse.ImageInfo.AppId"));
		imageInfo.setRegionId(context.stringValue("GetImageInfoResponse.ImageInfo.RegionId"));

		Mezzanine mezzanine = new Mezzanine();
		mezzanine.setOriginalFileName(context.stringValue("GetImageInfoResponse.ImageInfo.Mezzanine.OriginalFileName"));
		mezzanine.setFileSize(context.stringValue("GetImageInfoResponse.ImageInfo.Mezzanine.FileSize"));
		mezzanine.setWidth(context.integerValue("GetImageInfoResponse.ImageInfo.Mezzanine.Width"));
		mezzanine.setHeight(context.integerValue("GetImageInfoResponse.ImageInfo.Mezzanine.Height"));
		mezzanine.setFileURL(context.stringValue("GetImageInfoResponse.ImageInfo.Mezzanine.FileURL"));
		imageInfo.setMezzanine(mezzanine);
		getImageInfoResponse.setImageInfo(imageInfo);
	 
	 	return getImageInfoResponse;
	}
}