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

package com.aliyuncs.reid.transform.v20190928;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid.model.v20190928.GetImageUrlResponse;
import com.aliyuncs.reid.model.v20190928.GetImageUrlResponse.ImageUrl;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageUrlResponseUnmarshaller {

	public static GetImageUrlResponse unmarshall(GetImageUrlResponse getImageUrlResponse, UnmarshallerContext _ctx) {
		
		getImageUrlResponse.setRequestId(_ctx.stringValue("GetImageUrlResponse.RequestId"));
		getImageUrlResponse.setErrorCode(_ctx.stringValue("GetImageUrlResponse.ErrorCode"));
		getImageUrlResponse.setErrorMessage(_ctx.stringValue("GetImageUrlResponse.ErrorMessage"));
		getImageUrlResponse.setMessage(_ctx.stringValue("GetImageUrlResponse.Message"));
		getImageUrlResponse.setCode(_ctx.stringValue("GetImageUrlResponse.Code"));
		getImageUrlResponse.setDynamicCode(_ctx.stringValue("GetImageUrlResponse.DynamicCode"));
		getImageUrlResponse.setSuccess(_ctx.booleanValue("GetImageUrlResponse.Success"));
		getImageUrlResponse.setDynamicMessage(_ctx.stringValue("GetImageUrlResponse.DynamicMessage"));

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