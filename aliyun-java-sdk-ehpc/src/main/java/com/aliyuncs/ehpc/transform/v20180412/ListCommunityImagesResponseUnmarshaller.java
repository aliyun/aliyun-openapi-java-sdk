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

import com.aliyuncs.ehpc.model.v20180412.ListCommunityImagesResponse;
import com.aliyuncs.ehpc.model.v20180412.ListCommunityImagesResponse.ImageInfo;
import com.aliyuncs.ehpc.model.v20180412.ListCommunityImagesResponse.ImageInfo.BaseOsTag;
import com.aliyuncs.ehpc.model.v20180412.ListCommunityImagesResponse.ImageInfo.OsTag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCommunityImagesResponseUnmarshaller {

	public static ListCommunityImagesResponse unmarshall(ListCommunityImagesResponse listCommunityImagesResponse, UnmarshallerContext _ctx) {
		
		listCommunityImagesResponse.setRequestId(_ctx.stringValue("ListCommunityImagesResponse.RequestId"));

		List<ImageInfo> images = new ArrayList<ImageInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListCommunityImagesResponse.Images.Length"); i++) {
			ImageInfo imageInfo = new ImageInfo();
			imageInfo.setStatus(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].Status"));
			imageInfo.setPostInstallScript(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].PostInstallScript"));
			imageInfo.setDescription(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].Description"));
			imageInfo.setSize(_ctx.integerValue("ListCommunityImagesResponse.Images["+ i +"].Size"));
			imageInfo.setImageOwnerAlias(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].ImageOwnerAlias"));
			imageInfo.setImageName(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].ImageName"));
			imageInfo.setSkuCode(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].SkuCode"));
			imageInfo.setPricingCycle(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].PricingCycle"));
			imageInfo.setImageId(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].ImageId"));
			imageInfo.setProductCode(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].ProductCode"));
			imageInfo.setUid(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].Uid"));

			BaseOsTag baseOsTag = new BaseOsTag();
			baseOsTag.setPlatform(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].BaseOsTag.Platform"));
			baseOsTag.setOsTag(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].BaseOsTag.OsTag"));
			baseOsTag.setVersion(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].BaseOsTag.Version"));
			baseOsTag.setArchitecture(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].BaseOsTag.Architecture"));
			imageInfo.setBaseOsTag(baseOsTag);

			OsTag osTag = new OsTag();
			osTag.setPlatform(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].OsTag.Platform"));
			osTag.setOsTag(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].OsTag.OsTag"));
			osTag.setVersion(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].OsTag.Version"));
			osTag.setArchitecture(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].OsTag.Architecture"));
			osTag.setBaseOsTag(_ctx.stringValue("ListCommunityImagesResponse.Images["+ i +"].OsTag.BaseOsTag"));
			imageInfo.setOsTag(osTag);

			images.add(imageInfo);
		}
		listCommunityImagesResponse.setImages(images);
	 
	 	return listCommunityImagesResponse;
	}
}