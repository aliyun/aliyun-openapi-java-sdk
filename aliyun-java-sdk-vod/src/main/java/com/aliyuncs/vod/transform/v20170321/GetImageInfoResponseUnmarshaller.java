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

	public static GetImageInfoResponse unmarshall(GetImageInfoResponse getImageInfoResponse, UnmarshallerContext _ctx) {
		
		getImageInfoResponse.setRequestId(_ctx.stringValue("GetImageInfoResponse.RequestId"));

		ImageInfo imageInfo = new ImageInfo();
		imageInfo.setImageId(_ctx.stringValue("GetImageInfoResponse.ImageInfo.ImageId"));
		imageInfo.setTitle(_ctx.stringValue("GetImageInfoResponse.ImageInfo.Title"));
		imageInfo.setCreationTime(_ctx.stringValue("GetImageInfoResponse.ImageInfo.CreationTime"));
		imageInfo.setImageType(_ctx.stringValue("GetImageInfoResponse.ImageInfo.ImageType"));
		imageInfo.setTags(_ctx.stringValue("GetImageInfoResponse.ImageInfo.Tags"));
		imageInfo.setURL(_ctx.stringValue("GetImageInfoResponse.ImageInfo.URL"));
		imageInfo.setCateId(_ctx.longValue("GetImageInfoResponse.ImageInfo.CateId"));
		imageInfo.setCateName(_ctx.stringValue("GetImageInfoResponse.ImageInfo.CateName"));
		imageInfo.setDescription(_ctx.stringValue("GetImageInfoResponse.ImageInfo.Description"));
		imageInfo.setStorageLocation(_ctx.stringValue("GetImageInfoResponse.ImageInfo.StorageLocation"));
		imageInfo.setStatus(_ctx.stringValue("GetImageInfoResponse.ImageInfo.Status"));
		imageInfo.setAppId(_ctx.stringValue("GetImageInfoResponse.ImageInfo.AppId"));
		imageInfo.setRegionId(_ctx.stringValue("GetImageInfoResponse.ImageInfo.RegionId"));
		imageInfo.setAuditStatus(_ctx.stringValue("GetImageInfoResponse.ImageInfo.AuditStatus"));

		Mezzanine mezzanine = new Mezzanine();
		mezzanine.setOriginalFileName(_ctx.stringValue("GetImageInfoResponse.ImageInfo.Mezzanine.OriginalFileName"));
		mezzanine.setFileSize(_ctx.stringValue("GetImageInfoResponse.ImageInfo.Mezzanine.FileSize"));
		mezzanine.setWidth(_ctx.integerValue("GetImageInfoResponse.ImageInfo.Mezzanine.Width"));
		mezzanine.setHeight(_ctx.integerValue("GetImageInfoResponse.ImageInfo.Mezzanine.Height"));
		mezzanine.setFileURL(_ctx.stringValue("GetImageInfoResponse.ImageInfo.Mezzanine.FileURL"));
		imageInfo.setMezzanine(mezzanine);
		getImageInfoResponse.setImageInfo(imageInfo);
	 
	 	return getImageInfoResponse;
	}
}