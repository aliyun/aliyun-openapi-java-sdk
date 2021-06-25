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

import com.aliyuncs.premiumpics.model.v20200505.GetTextLogoListResponse;
import com.aliyuncs.premiumpics.model.v20200505.GetTextLogoListResponse.LogosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTextLogoListResponseUnmarshaller {

	public static GetTextLogoListResponse unmarshall(GetTextLogoListResponse getTextLogoListResponse, UnmarshallerContext _ctx) {
		
		getTextLogoListResponse.setRequestId(_ctx.stringValue("GetTextLogoListResponse.RequestId"));
		getTextLogoListResponse.setSuccess(_ctx.booleanValue("GetTextLogoListResponse.Success"));
		getTextLogoListResponse.setLogoVersion(_ctx.stringValue("GetTextLogoListResponse.LogoVersion"));

		List<LogosItem> logos = new ArrayList<LogosItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTextLogoListResponse.Logos.Length"); i++) {
			LogosItem logosItem = new LogosItem();
			logosItem.setGoodsId(_ctx.stringValue("GetTextLogoListResponse.Logos["+ i +"].GoodsId"));
			logosItem.setUrl(_ctx.stringValue("GetTextLogoListResponse.Logos["+ i +"].Url"));

			logos.add(logosItem);
		}
		getTextLogoListResponse.setLogos(logos);
	 
	 	return getTextLogoListResponse;
	}
}