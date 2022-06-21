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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetContainerImagesResponse;
import com.aliyuncs.swas.model.v20170810.GetContainerImagesResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContainerImagesResponseUnmarshaller {

	public static GetContainerImagesResponse unmarshall(GetContainerImagesResponse getContainerImagesResponse, UnmarshallerContext _ctx) {
		
		getContainerImagesResponse.setRequestId(_ctx.stringValue("GetContainerImagesResponse.RequestId"));
		getContainerImagesResponse.setIsSuccess(_ctx.booleanValue("GetContainerImagesResponse.IsSuccess"));
		getContainerImagesResponse.setPageSize(_ctx.integerValue("GetContainerImagesResponse.PageSize"));
		getContainerImagesResponse.setPageNumber(_ctx.integerValue("GetContainerImagesResponse.PageNumber"));
		getContainerImagesResponse.setTotalCount(_ctx.integerValue("GetContainerImagesResponse.TotalCount"));
		getContainerImagesResponse.setCode(_ctx.stringValue("GetContainerImagesResponse.Code"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("GetContainerImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setRepoName(_ctx.stringValue("GetContainerImagesResponse.Images["+ i +"].RepoName"));
			image.setLogo(_ctx.stringValue("GetContainerImagesResponse.Images["+ i +"].Logo"));
			image.setRepoType(_ctx.stringValue("GetContainerImagesResponse.Images["+ i +"].RepoType"));
			image.setRepoOriginType(_ctx.stringValue("GetContainerImagesResponse.Images["+ i +"].RepoOriginType"));

			images.add(image);
		}
		getContainerImagesResponse.setImages(images);
	 
	 	return getContainerImagesResponse;
	}
}