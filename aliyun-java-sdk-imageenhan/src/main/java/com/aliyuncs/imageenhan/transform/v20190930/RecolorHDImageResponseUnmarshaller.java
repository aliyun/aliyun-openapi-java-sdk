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

import com.aliyuncs.imageenhan.model.v20190930.RecolorHDImageResponse;
import com.aliyuncs.imageenhan.model.v20190930.RecolorHDImageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecolorHDImageResponseUnmarshaller {

	public static RecolorHDImageResponse unmarshall(RecolorHDImageResponse recolorHDImageResponse, UnmarshallerContext _ctx) {
		
		recolorHDImageResponse.setRequestId(_ctx.stringValue("RecolorHDImageResponse.RequestId"));

		Data data = new Data();

		List<String> imageList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecolorHDImageResponse.Data.ImageList.Length"); i++) {
			imageList.add(_ctx.stringValue("RecolorHDImageResponse.Data.ImageList["+ i +"]"));
		}
		data.setImageList(imageList);
		recolorHDImageResponse.setData(data);
	 
	 	return recolorHDImageResponse;
	}
}