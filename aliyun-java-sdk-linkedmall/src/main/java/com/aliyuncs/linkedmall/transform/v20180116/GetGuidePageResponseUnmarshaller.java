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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.GetGuidePageResponse;
import com.aliyuncs.linkedmall.model.v20180116.GetGuidePageResponse.MiniShopInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGuidePageResponseUnmarshaller {

	public static GetGuidePageResponse unmarshall(GetGuidePageResponse getGuidePageResponse, UnmarshallerContext _ctx) {
		
		getGuidePageResponse.setRequestId(_ctx.stringValue("GetGuidePageResponse.RequestId"));
		getGuidePageResponse.setCode(_ctx.stringValue("GetGuidePageResponse.Code"));
		getGuidePageResponse.setMessage(_ctx.stringValue("GetGuidePageResponse.Message"));

		List<MiniShopInfoItem> miniShopInfo = new ArrayList<MiniShopInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("GetGuidePageResponse.MiniShopInfo.Length"); i++) {
			MiniShopInfoItem miniShopInfoItem = new MiniShopInfoItem();
			miniShopInfoItem.setBizId(_ctx.stringValue("GetGuidePageResponse.MiniShopInfo["+ i +"].BizId"));
			miniShopInfoItem.setName(_ctx.stringValue("GetGuidePageResponse.MiniShopInfo["+ i +"].Name"));
			miniShopInfoItem.setSrc(_ctx.stringValue("GetGuidePageResponse.MiniShopInfo["+ i +"].Src"));
			miniShopInfoItem.setLiteShopId(_ctx.stringValue("GetGuidePageResponse.MiniShopInfo["+ i +"].LiteShopId"));

			miniShopInfo.add(miniShopInfoItem);
		}
		getGuidePageResponse.setMiniShopInfo(miniShopInfo);
	 
	 	return getGuidePageResponse;
	}
}