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

import com.aliyuncs.imageenhan.model.v20190930.GenerateImageWithTextResponse;
import com.aliyuncs.imageenhan.model.v20190930.GenerateImageWithTextResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateImageWithTextResponseUnmarshaller {

	public static GenerateImageWithTextResponse unmarshall(GenerateImageWithTextResponse generateImageWithTextResponse, UnmarshallerContext _ctx) {
		
		generateImageWithTextResponse.setRequestId(_ctx.stringValue("GenerateImageWithTextResponse.RequestId"));
		generateImageWithTextResponse.setCode(_ctx.stringValue("GenerateImageWithTextResponse.Code"));
		generateImageWithTextResponse.setMessage(_ctx.stringValue("GenerateImageWithTextResponse.Message"));

		Data data = new Data();

		List<String> imageUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GenerateImageWithTextResponse.Data.ImageUrls.Length"); i++) {
			imageUrls.add(_ctx.stringValue("GenerateImageWithTextResponse.Data.ImageUrls["+ i +"]"));
		}
		data.setImageUrls(imageUrls);
		generateImageWithTextResponse.setData(data);
	 
	 	return generateImageWithTextResponse;
	}
}