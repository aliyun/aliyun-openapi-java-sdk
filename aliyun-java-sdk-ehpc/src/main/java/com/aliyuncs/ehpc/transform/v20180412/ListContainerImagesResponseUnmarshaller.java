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

import com.aliyuncs.ehpc.model.v20180412.ListContainerImagesResponse;
import com.aliyuncs.ehpc.model.v20180412.ListContainerImagesResponse.ImagesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListContainerImagesResponseUnmarshaller {

	public static ListContainerImagesResponse unmarshall(ListContainerImagesResponse listContainerImagesResponse, UnmarshallerContext context) {
		
		listContainerImagesResponse.setRequestId(context.stringValue("ListContainerImagesResponse.RequestId"));
		listContainerImagesResponse.setTotalCount(context.integerValue("ListContainerImagesResponse.TotalCount"));
		listContainerImagesResponse.setPageNumber(context.integerValue("ListContainerImagesResponse.PageNumber"));
		listContainerImagesResponse.setPageSize(context.integerValue("ListContainerImagesResponse.PageSize"));
		listContainerImagesResponse.setDBInfo(context.stringValue("ListContainerImagesResponse.DBInfo"));

		List<ImagesItem> images = new ArrayList<ImagesItem>();
		for (int i = 0; i < context.lengthValue("ListContainerImagesResponse.Images.Length"); i++) {
			ImagesItem imagesItem = new ImagesItem();
			imagesItem.setSystem(context.stringValue("ListContainerImagesResponse.Images["+ i +"].System"));
			imagesItem.setType(context.stringValue("ListContainerImagesResponse.Images["+ i +"].Type"));
			imagesItem.setStatus(context.stringValue("ListContainerImagesResponse.Images["+ i +"].Status"));
			imagesItem.setImageId(context.stringValue("ListContainerImagesResponse.Images["+ i +"].ImageId"));
			imagesItem.setUpdateDateTime(context.stringValue("ListContainerImagesResponse.Images["+ i +"].UpdateDateTime"));
			imagesItem.setRepository(context.stringValue("ListContainerImagesResponse.Images["+ i +"].Repository"));
			imagesItem.setTag(context.stringValue("ListContainerImagesResponse.Images["+ i +"].Tag"));

			images.add(imagesItem);
		}
		listContainerImagesResponse.setImages(images);
	 
	 	return listContainerImagesResponse;
	}
}