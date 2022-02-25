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

package com.aliyuncs.cloudphone.transform.v20201230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphone.model.v20201230.DeleteImagesResponse;
import com.aliyuncs.cloudphone.model.v20201230.DeleteImagesResponse.ImageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteImagesResponseUnmarshaller {

	public static DeleteImagesResponse unmarshall(DeleteImagesResponse deleteImagesResponse, UnmarshallerContext _ctx) {
		
		deleteImagesResponse.setRequestId(_ctx.stringValue("DeleteImagesResponse.RequestId"));

		List<ImageResponse> imageResponses = new ArrayList<ImageResponse>();
		for (int i = 0; i < _ctx.lengthValue("DeleteImagesResponse.ImageResponses.Length"); i++) {
			ImageResponse imageResponse = new ImageResponse();
			imageResponse.setCode(_ctx.stringValue("DeleteImagesResponse.ImageResponses["+ i +"].Code"));
			imageResponse.setMessage(_ctx.stringValue("DeleteImagesResponse.ImageResponses["+ i +"].Message"));
			imageResponse.setImageId(_ctx.stringValue("DeleteImagesResponse.ImageResponses["+ i +"].ImageId"));

			imageResponses.add(imageResponse);
		}
		deleteImagesResponse.setImageResponses(imageResponses);
	 
	 	return deleteImagesResponse;
	}
}