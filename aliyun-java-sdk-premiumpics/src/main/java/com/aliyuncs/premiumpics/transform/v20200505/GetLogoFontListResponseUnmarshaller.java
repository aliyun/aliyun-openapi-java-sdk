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

package com.aliyuncs.premiumpics.transform.v20200505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.premiumpics.model.v20200505.GetLogoFontListResponse;
import com.aliyuncs.premiumpics.model.v20200505.GetLogoFontListResponse.FontsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLogoFontListResponseUnmarshaller {

	public static GetLogoFontListResponse unmarshall(GetLogoFontListResponse getLogoFontListResponse, UnmarshallerContext _ctx) {
		
		getLogoFontListResponse.setRequestId(_ctx.stringValue("GetLogoFontListResponse.RequestId"));
		getLogoFontListResponse.setSuccess(_ctx.booleanValue("GetLogoFontListResponse.Success"));

		List<FontsItem> fonts = new ArrayList<FontsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLogoFontListResponse.Fonts.Length"); i++) {
			FontsItem fontsItem = new FontsItem();
			fontsItem.setFontId(_ctx.stringValue("GetLogoFontListResponse.Fonts["+ i +"].FontId"));
			fontsItem.setName(_ctx.stringValue("GetLogoFontListResponse.Fonts["+ i +"].Name"));
			fontsItem.setImage(_ctx.stringValue("GetLogoFontListResponse.Fonts["+ i +"].Image"));

			fonts.add(fontsItem);
		}
		getLogoFontListResponse.setFonts(fonts);
	 
	 	return getLogoFontListResponse;
	}
}