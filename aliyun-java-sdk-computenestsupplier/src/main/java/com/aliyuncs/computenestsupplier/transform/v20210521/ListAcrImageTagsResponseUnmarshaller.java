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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.ListAcrImageTagsResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.ListAcrImageTagsResponse.ImagesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAcrImageTagsResponseUnmarshaller {

	public static ListAcrImageTagsResponse unmarshall(ListAcrImageTagsResponse listAcrImageTagsResponse, UnmarshallerContext _ctx) {
		
		listAcrImageTagsResponse.setRequestId(_ctx.stringValue("ListAcrImageTagsResponse.RequestId"));
		listAcrImageTagsResponse.setNextToken(_ctx.stringValue("ListAcrImageTagsResponse.NextToken"));
		listAcrImageTagsResponse.setMaxResults(_ctx.integerValue("ListAcrImageTagsResponse.MaxResults"));
		listAcrImageTagsResponse.setTotalCount(_ctx.integerValue("ListAcrImageTagsResponse.TotalCount"));

		List<ImagesItem> images = new ArrayList<ImagesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAcrImageTagsResponse.Images.Length"); i++) {
			ImagesItem imagesItem = new ImagesItem();
			imagesItem.setTag(_ctx.stringValue("ListAcrImageTagsResponse.Images["+ i +"].Tag"));
			imagesItem.setImageSize(_ctx.stringValue("ListAcrImageTagsResponse.Images["+ i +"].ImageSize"));
			imagesItem.setCreateTime(_ctx.stringValue("ListAcrImageTagsResponse.Images["+ i +"].CreateTime"));
			imagesItem.setModifiedTime(_ctx.stringValue("ListAcrImageTagsResponse.Images["+ i +"].ModifiedTime"));

			images.add(imagesItem);
		}
		listAcrImageTagsResponse.setImages(images);
	 
	 	return listAcrImageTagsResponse;
	}
}