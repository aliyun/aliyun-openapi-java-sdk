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

import com.aliyuncs.swas.model.v20170810.GetContainerImageTagsResponse;
import com.aliyuncs.swas.model.v20170810.GetContainerImageTagsResponse.ImageTag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContainerImageTagsResponseUnmarshaller {

	public static GetContainerImageTagsResponse unmarshall(GetContainerImageTagsResponse getContainerImageTagsResponse, UnmarshallerContext _ctx) {
		
		getContainerImageTagsResponse.setRequestId(_ctx.stringValue("GetContainerImageTagsResponse.RequestId"));
		getContainerImageTagsResponse.setIsSuccess(_ctx.booleanValue("GetContainerImageTagsResponse.IsSuccess"));
		getContainerImageTagsResponse.setCode(_ctx.stringValue("GetContainerImageTagsResponse.Code"));

		List<ImageTag> imageTags = new ArrayList<ImageTag>();
		for (int i = 0; i < _ctx.lengthValue("GetContainerImageTagsResponse.ImageTags.Length"); i++) {
			ImageTag imageTag = new ImageTag();
			imageTag.setTag(_ctx.stringValue("GetContainerImageTagsResponse.ImageTags["+ i +"].Tag"));
			imageTag.setImageId(_ctx.stringValue("GetContainerImageTagsResponse.ImageTags["+ i +"].ImageId"));
			imageTag.setImageSize(_ctx.longValue("GetContainerImageTagsResponse.ImageTags["+ i +"].ImageSize"));
			imageTag.setStatus(_ctx.stringValue("GetContainerImageTagsResponse.ImageTags["+ i +"].Status"));
			imageTag.setDigest(_ctx.stringValue("GetContainerImageTagsResponse.ImageTags["+ i +"].Digest"));

			imageTags.add(imageTag);
		}
		getContainerImageTagsResponse.setImageTags(imageTags);
	 
	 	return getContainerImageTagsResponse;
	}
}