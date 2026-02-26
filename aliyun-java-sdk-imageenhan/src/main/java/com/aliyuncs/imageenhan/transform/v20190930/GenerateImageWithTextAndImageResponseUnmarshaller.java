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

package com.aliyuncs.imageenhan.transform.v20190930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imageenhan.model.v20190930.GenerateImageWithTextAndImageResponse;
import com.aliyuncs.imageenhan.model.v20190930.GenerateImageWithTextAndImageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateImageWithTextAndImageResponseUnmarshaller {

	public static GenerateImageWithTextAndImageResponse unmarshall(GenerateImageWithTextAndImageResponse generateImageWithTextAndImageResponse, UnmarshallerContext _ctx) {
		
		generateImageWithTextAndImageResponse.setRequestId(_ctx.stringValue("GenerateImageWithTextAndImageResponse.RequestId"));
		generateImageWithTextAndImageResponse.setCode(_ctx.stringValue("GenerateImageWithTextAndImageResponse.Code"));
		generateImageWithTextAndImageResponse.setMessage(_ctx.stringValue("GenerateImageWithTextAndImageResponse.Message"));

		Data data = new Data();

		List<String> imageUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GenerateImageWithTextAndImageResponse.Data.ImageUrls.Length"); i++) {
			imageUrls.add(_ctx.stringValue("GenerateImageWithTextAndImageResponse.Data.ImageUrls["+ i +"]"));
		}
		data.setImageUrls(imageUrls);
		generateImageWithTextAndImageResponse.setData(data);
	 
	 	return generateImageWithTextAndImageResponse;
	}
}