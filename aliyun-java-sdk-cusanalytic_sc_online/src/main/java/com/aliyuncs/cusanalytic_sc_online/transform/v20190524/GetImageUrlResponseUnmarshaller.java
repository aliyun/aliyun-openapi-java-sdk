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

package com.aliyuncs.cusanalytic_sc_online.transform.v20190524;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetImageUrlResponse;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetImageUrlResponse.ImageUrl;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageUrlResponseUnmarshaller {

	public static GetImageUrlResponse unmarshall(GetImageUrlResponse getImageUrlResponse, UnmarshallerContext _ctx) {
		
		getImageUrlResponse.setErrorMsg(_ctx.stringValue("GetImageUrlResponse.ErrorMsg"));
		getImageUrlResponse.setSuccess(_ctx.booleanValue("GetImageUrlResponse.Success"));

		List<ImageUrl> urls = new ArrayList<ImageUrl>();
		for (int i = 0; i < _ctx.lengthValue("GetImageUrlResponse.Urls.Length"); i++) {
			ImageUrl imageUrl = new ImageUrl();
			imageUrl.setObjectKey(_ctx.stringValue("GetImageUrlResponse.Urls["+ i +"].ObjectKey"));
			imageUrl.setUrl(_ctx.stringValue("GetImageUrlResponse.Urls["+ i +"].Url"));

			urls.add(imageUrl);
		}
		getImageUrlResponse.setUrls(urls);
	 
	 	return getImageUrlResponse;
	}
}