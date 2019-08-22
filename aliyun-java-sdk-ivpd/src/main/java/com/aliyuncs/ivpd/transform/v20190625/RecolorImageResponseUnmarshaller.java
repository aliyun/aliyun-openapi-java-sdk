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

package com.aliyuncs.ivpd.transform.v20190625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivpd.model.v20190625.RecolorImageResponse;
import com.aliyuncs.ivpd.model.v20190625.RecolorImageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecolorImageResponseUnmarshaller {

	public static RecolorImageResponse unmarshall(RecolorImageResponse recolorImageResponse, UnmarshallerContext _ctx) {
		
		recolorImageResponse.setRequestId(_ctx.stringValue("RecolorImageResponse.RequestId"));
		recolorImageResponse.setCode(_ctx.stringValue("RecolorImageResponse.Code"));
		recolorImageResponse.setMessage(_ctx.stringValue("RecolorImageResponse.Message"));

		Data data = new Data();

		List<String> imageList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecolorImageResponse.Data.ImageList.Length"); i++) {
			imageList.add(_ctx.stringValue("RecolorImageResponse.Data.ImageList["+ i +"]"));
		}
		data.setImageList(imageList);
		recolorImageResponse.setData(data);
	 
	 	return recolorImageResponse;
	}
}