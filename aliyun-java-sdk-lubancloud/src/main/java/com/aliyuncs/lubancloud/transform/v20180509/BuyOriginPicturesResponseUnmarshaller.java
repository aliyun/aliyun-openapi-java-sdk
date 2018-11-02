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

package com.aliyuncs.lubancloud.transform.v20180509;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lubancloud.model.v20180509.BuyOriginPicturesResponse;
import com.aliyuncs.lubancloud.model.v20180509.BuyOriginPicturesResponse.Picture;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class BuyOriginPicturesResponseUnmarshaller {

	public static BuyOriginPicturesResponse unmarshall(BuyOriginPicturesResponse buyOriginPicturesResponse, UnmarshallerContext context) {
		
		buyOriginPicturesResponse.setRequestId(context.stringValue("BuyOriginPicturesResponse.RequestId"));

		List<Picture> pictures = new ArrayList<Picture>();
		for (int i = 0; i < context.lengthValue("BuyOriginPicturesResponse.Pictures.Length"); i++) {
			Picture picture = new Picture();
			picture.setId(context.longValue("BuyOriginPicturesResponse.Pictures["+ i +"].Id"));
			picture.setOriginalPictureUrl(context.stringValue("BuyOriginPicturesResponse.Pictures["+ i +"].OriginalPictureUrl"));

			pictures.add(picture);
		}
		buyOriginPicturesResponse.setPictures(pictures);
	 
	 	return buyOriginPicturesResponse;
	}
}