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

package com.aliyuncs.imgsearch.transform.v20200320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imgsearch.model.v20200320.ListImagesResponse;
import com.aliyuncs.imgsearch.model.v20200320.ListImagesResponse.Data;
import com.aliyuncs.imgsearch.model.v20200320.ListImagesResponse.Data.ImageListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListImagesResponseUnmarshaller {

	public static ListImagesResponse unmarshall(ListImagesResponse listImagesResponse, UnmarshallerContext _ctx) {
		
		listImagesResponse.setRequestId(_ctx.stringValue("ListImagesResponse.RequestId"));

		Data data = new Data();
		data.setToken(_ctx.stringValue("ListImagesResponse.Data.Token"));
		data.setTotalCount(_ctx.integerValue("ListImagesResponse.Data.TotalCount"));

		List<ImageListItem> imageList = new ArrayList<ImageListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListImagesResponse.Data.ImageList.Length"); i++) {
			ImageListItem imageListItem = new ImageListItem();
			imageListItem.setDataId(_ctx.stringValue("ListImagesResponse.Data.ImageList["+ i +"].DataId"));
			imageListItem.setExtraData(_ctx.stringValue("ListImagesResponse.Data.ImageList["+ i +"].ExtraData"));
			imageListItem.setEntityId(_ctx.stringValue("ListImagesResponse.Data.ImageList["+ i +"].EntityId"));
			imageListItem.setUpdatedAt(_ctx.longValue("ListImagesResponse.Data.ImageList["+ i +"].UpdatedAt"));
			imageListItem.setCreatedAt(_ctx.longValue("ListImagesResponse.Data.ImageList["+ i +"].CreatedAt"));

			imageList.add(imageListItem);
		}
		data.setImageList(imageList);
		listImagesResponse.setData(data);
	 
	 	return listImagesResponse;
	}
}