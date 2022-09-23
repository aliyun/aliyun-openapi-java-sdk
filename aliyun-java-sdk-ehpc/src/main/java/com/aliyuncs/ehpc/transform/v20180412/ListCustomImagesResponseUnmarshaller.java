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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListCustomImagesResponse;
import com.aliyuncs.ehpc.model.v20180412.ListCustomImagesResponse.ImageInfo;
import com.aliyuncs.ehpc.model.v20180412.ListCustomImagesResponse.ImageInfo.BaseOsTag;
import com.aliyuncs.ehpc.model.v20180412.ListCustomImagesResponse.ImageInfo.OsTag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomImagesResponseUnmarshaller {

	public static ListCustomImagesResponse unmarshall(ListCustomImagesResponse listCustomImagesResponse, UnmarshallerContext _ctx) {
		
		listCustomImagesResponse.setRequestId(_ctx.stringValue("ListCustomImagesResponse.RequestId"));

		List<ImageInfo> images = new ArrayList<ImageInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomImagesResponse.Images.Length"); i++) {
			ImageInfo imageInfo = new ImageInfo();
			imageInfo.setStatus(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].Status"));
			imageInfo.setPostInstallScript(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].PostInstallScript"));
			imageInfo.setDescription(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].Description"));
			imageInfo.setSize(_ctx.integerValue("ListCustomImagesResponse.Images["+ i +"].Size"));
			imageInfo.setImageOwnerAlias(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].ImageOwnerAlias"));
			imageInfo.setImageName(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].ImageName"));
			imageInfo.setSkuCode(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].SkuCode"));
			imageInfo.setPricingCycle(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].PricingCycle"));
			imageInfo.setImageId(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].ImageId"));
			imageInfo.setProductCode(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].ProductCode"));
			imageInfo.setUid(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].Uid"));

			BaseOsTag baseOsTag = new BaseOsTag();
			baseOsTag.setPlatform(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].BaseOsTag.Platform"));
			baseOsTag.setOsTag(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].BaseOsTag.OsTag"));
			baseOsTag.setVersion(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].BaseOsTag.Version"));
			baseOsTag.setArchitecture(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].BaseOsTag.Architecture"));
			imageInfo.setBaseOsTag(baseOsTag);

			OsTag osTag = new OsTag();
			osTag.setPlatform(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].OsTag.Platform"));
			osTag.setOsTag(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].OsTag.OsTag"));
			osTag.setVersion(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].OsTag.Version"));
			osTag.setArchitecture(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].OsTag.Architecture"));
			osTag.setBaseOsTag(_ctx.stringValue("ListCustomImagesResponse.Images["+ i +"].OsTag.BaseOsTag"));
			imageInfo.setOsTag(osTag);

			images.add(imageInfo);
		}
		listCustomImagesResponse.setImages(images);
	 
	 	return listCustomImagesResponse;
	}
}