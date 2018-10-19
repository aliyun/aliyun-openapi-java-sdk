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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryGuideItemGroupResponseUnmarshaller {

	public static QueryGuideItemGroupResponse unmarshall(QueryGuideItemGroupResponse queryGuideItemGroupResponse, UnmarshallerContext context) {
		
		queryGuideItemGroupResponse.setRequestId(context.stringValue("QueryGuideItemGroupResponse.RequestId"));
		queryGuideItemGroupResponse.setCode(context.stringValue("QueryGuideItemGroupResponse.Code"));
		queryGuideItemGroupResponse.setMessage(context.stringValue("QueryGuideItemGroupResponse.Message"));
		queryGuideItemGroupResponse.setSubCode(context.stringValue("QueryGuideItemGroupResponse.SubCode"));
		queryGuideItemGroupResponse.setSubMessage(context.stringValue("QueryGuideItemGroupResponse.SubMessage"));
		queryGuideItemGroupResponse.setSuccess(context.booleanValue("QueryGuideItemGroupResponse.Success"));

		List<ItemInfo> guideItemGroup = new ArrayList<ItemInfo>();
		for (int i = 0; i < context.lengthValue("QueryGuideItemGroupResponse.GuideItemGroup.Length"); i++) {
			ItemInfo itemInfo = new ItemInfo();
			itemInfo.setItemId(context.longValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].ItemId"));
			itemInfo.setItemTitle(context.stringValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].ItemTitle"));
			itemInfo.setMainPicUrl(context.stringValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].MainPicUrl"));
			itemInfo.setItemUrl(context.stringValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].ItemUrl"));
			itemInfo.setPriceCent(context.longValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].PriceCent"));
			itemInfo.setPoints(context.longValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].Points"));
			itemInfo.setReservePrice(context.longValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].ReservePrice"));
			itemInfo.setPointsAmount(context.longValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].PointsAmount"));
			itemInfo.setPointPrice(context.longValue("QueryGuideItemGroupResponse.GuideItemGroup["+ i +"].PointPrice"));

			guideItemGroup.add(itemInfo);
		}
		queryGuideItemGroupResponse.setGuideItemGroup(guideItemGroup);
	 
	 	return queryGuideItemGroupResponse;
	}
}