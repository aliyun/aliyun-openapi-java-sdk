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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListRepoTagResponse;
import com.aliyuncs.cr.model.v20181201.ListRepoTagResponse.ImagesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepoTagResponseUnmarshaller {

	public static ListRepoTagResponse unmarshall(ListRepoTagResponse listRepoTagResponse, UnmarshallerContext _ctx) {
		
		listRepoTagResponse.setRequestId(_ctx.stringValue("ListRepoTagResponse.RequestId"));
		listRepoTagResponse.setCode(_ctx.stringValue("ListRepoTagResponse.Code"));
		listRepoTagResponse.setPageNo(_ctx.integerValue("ListRepoTagResponse.PageNo"));
		listRepoTagResponse.setIsSuccess(_ctx.booleanValue("ListRepoTagResponse.IsSuccess"));
		listRepoTagResponse.setPageSize(_ctx.integerValue("ListRepoTagResponse.PageSize"));
		listRepoTagResponse.setTotalCount(_ctx.stringValue("ListRepoTagResponse.TotalCount"));

		List<ImagesItem> images = new ArrayList<ImagesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepoTagResponse.Images.Length"); i++) {
			ImagesItem imagesItem = new ImagesItem();
			imagesItem.setStatus(_ctx.stringValue("ListRepoTagResponse.Images["+ i +"].Status"));
			imagesItem.setImageSize(_ctx.longValue("ListRepoTagResponse.Images["+ i +"].ImageSize"));
			imagesItem.setImageCreate(_ctx.stringValue("ListRepoTagResponse.Images["+ i +"].ImageCreate"));
			imagesItem.setDigest(_ctx.stringValue("ListRepoTagResponse.Images["+ i +"].Digest"));
			imagesItem.setImageUpdate(_ctx.stringValue("ListRepoTagResponse.Images["+ i +"].ImageUpdate"));
			imagesItem.setTag(_ctx.stringValue("ListRepoTagResponse.Images["+ i +"].Tag"));
			imagesItem.setImageId(_ctx.stringValue("ListRepoTagResponse.Images["+ i +"].ImageId"));

			images.add(imagesItem);
		}
		listRepoTagResponse.setImages(images);
	 
	 	return listRepoTagResponse;
	}
}