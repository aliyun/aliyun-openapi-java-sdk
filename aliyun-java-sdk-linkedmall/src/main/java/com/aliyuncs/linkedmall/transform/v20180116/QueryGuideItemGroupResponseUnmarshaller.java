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

import com.aliyuncs.linkedmall.model.v20180116.QueryGuideItemGroupResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryGuideItemGroupResponse.ItemInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryGuideItemGroupResponseUnmarshaller {

	public static QueryGuideItemGroupResponse unmarshall(QueryGuideItemGroupResponse queryGuideItemGroupResponse, UnmarshallerContext _ctx) {
		
		queryGuideItemGroupResponse.setRequestId(_ctx.stringValue("QueryGuideItemGroupResponse.RequestId"));
		queryGuideItemGroupResponse.setCode(_ctx.stringValue("QueryGuideItemGroupResponse.Code"));
		queryGuideItemGroupResponse.setMessage(_ctx.stringValue("QueryGuideItemGroupResponse.Message"));
		queryGuideItemGroupResponse.setSubCode(_ctx.stringValue("QueryGuideItemGroupResponse.SubCode"));
		queryGuideItemGroupResponse.setSubMessage(_ctx.stringValue("QueryGuideItemGroupResponse.SubMessage"));
		queryGuideItemGroupResponse.setSuccess(_ctx.booleanValue("QueryGuideItemGroupResponse.Success"));

		List<ItemInfo> guideItemGroup = new ArrayList<ItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryGuideItemGroupResponse.GuideItemGroup.Length"); i++) {
			ItemInfo itemInfo = new ItemInfo();
			itemInfo.setItemId(_ctx.longValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].ItemId"));
			itemInfo.setItemTitle(_ctx.stringValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].ItemTitle"));
			itemInfo.setMainPicUrl(_ctx.stringValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].MainPicUrl"));
			itemInfo.setItemUrl(_ctx.stringValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].ItemUrl"));
			itemInfo.setPriceCent(_ctx.longValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].PriceCent"));
			itemInfo.setPoints(_ctx.longValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].Points"));
			itemInfo.setReservePrice(_ctx.stringValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].ReservePrice"));
			itemInfo.setPointsAmount(_ctx.longValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].PointsAmount"));
			itemInfo.setPointPrice(_ctx.longValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].PointPrice"));
			itemInfo.setLmItemId(_ctx.stringValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].LmItemId"));

			guideItemGroup.add(itemInfo);
		}
		queryGuideItemGroupResponse.setGuideItemGroup(guideItemGroup);
	 
	 	return queryGuideItemGroupResponse;
	}
}