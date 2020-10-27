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

package com.aliyuncs.cloudesl.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20180801.DescribeItemsResponse;
import com.aliyuncs.cloudesl.model.v20180801.DescribeItemsResponse.ItemInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeItemsResponseUnmarshaller {

	public static DescribeItemsResponse unmarshall(DescribeItemsResponse describeItemsResponse, UnmarshallerContext _ctx) {
		
		describeItemsResponse.setRequestId(_ctx.stringValue("DescribeItemsResponse.RequestId"));
		describeItemsResponse.setSuccess(_ctx.booleanValue("DescribeItemsResponse.Success"));
		describeItemsResponse.setMessage(_ctx.stringValue("DescribeItemsResponse.Message"));
		describeItemsResponse.setErrorCode(_ctx.stringValue("DescribeItemsResponse.ErrorCode"));
		describeItemsResponse.setTotalCount(_ctx.integerValue("DescribeItemsResponse.TotalCount"));
		describeItemsResponse.setPageNumber(_ctx.integerValue("DescribeItemsResponse.PageNumber"));
		describeItemsResponse.setPageSize(_ctx.integerValue("DescribeItemsResponse.PageSize"));

		List<ItemInfo> items = new ArrayList<ItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeItemsResponse.Items.Length"); i++) {
			ItemInfo itemInfo = new ItemInfo();
			itemInfo.setCompanyId(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CompanyId"));
			itemInfo.setStoreId(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].StoreId"));
			itemInfo.setPriceUnit(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PriceUnit"));
			itemInfo.setActionPrice(_ctx.integerValue("DescribeItemsResponse.Items["+ i +"].ActionPrice"));
			itemInfo.setItemBarCode(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ItemBarCode"));
			itemInfo.setItemTitle(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ItemTitle"));
			itemInfo.setItemId(_ctx.longValue("DescribeItemsResponse.Items["+ i +"].ItemId"));
			itemInfo.setModelNumber(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ModelNumber"));
			itemInfo.setBrandName(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].BrandName"));
			itemInfo.setSaleSpec(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].SaleSpec"));
			itemInfo.setCategoryName(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CategoryName"));
			itemInfo.setRank(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].Rank"));
			itemInfo.setEnergyEfficiency(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].EnergyEfficiency"));
			itemInfo.setSkuId(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].SkuId"));
			itemInfo.setPromotionStart(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionStart"));
			itemInfo.setPromotionEnd(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionEnd"));
			itemInfo.setPromotionText(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionText"));
			itemInfo.setPromotionReason(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionReason"));
			itemInfo.setBePromotion(_ctx.booleanValue("DescribeItemsResponse.Items["+ i +"].BePromotion"));
			itemInfo.setItemQrCode(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ItemQrCode"));
			itemInfo.setOriginalPrice(_ctx.integerValue("DescribeItemsResponse.Items["+ i +"].OriginalPrice"));
			itemInfo.setMemberPrice(_ctx.integerValue("DescribeItemsResponse.Items["+ i +"].MemberPrice"));
			itemInfo.setSuggestPrice(_ctx.integerValue("DescribeItemsResponse.Items["+ i +"].SuggestPrice"));
			itemInfo.setItemShortTitle(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ItemShortTitle"));
			itemInfo.setOptionGroups(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].OptionGroups"));
			itemInfo.setProductionPlace(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ProductionPlace"));
			itemInfo.setPositionCode(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PositionCode"));
			itemInfo.setExtraAttribute(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ExtraAttribute"));
			itemInfo.setBeSourceCode(_ctx.booleanValue("DescribeItemsResponse.Items["+ i +"].BeSourceCode"));
			itemInfo.setSourceCode(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].SourceCode"));
			itemInfo.setForestFirstId(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ForestFirstId"));
			itemInfo.setForestSecondId(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ForestSecondId"));
			itemInfo.setCustomizeFeatureA(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureA"));
			itemInfo.setCustomizeFeatureB(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureB"));
			itemInfo.setCustomizeFeatureC(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureC"));
			itemInfo.setCustomizeFeatureD(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureD"));
			itemInfo.setCustomizeFeatureE(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureE"));
			itemInfo.setCustomizeFeatureF(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureF"));
			itemInfo.setCustomizeFeatureG(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureG"));
			itemInfo.setCustomizeFeatureH(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureH"));
			itemInfo.setCustomizeFeatureI(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureI"));
			itemInfo.setCustomizeFeatureJ(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureJ"));

			items.add(itemInfo);
		}
		describeItemsResponse.setItems(items);
	 
	 	return describeItemsResponse;
	}
}