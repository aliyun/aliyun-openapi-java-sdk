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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeItemsResponseUnmarshaller {

	public static DescribeItemsResponse unmarshall(DescribeItemsResponse describeItemsResponse, UnmarshallerContext context) {
		
		describeItemsResponse.setRequestId(context.stringValue("DescribeItemsResponse.RequestId"));
		describeItemsResponse.setSuccess(context.booleanValue("DescribeItemsResponse.Success"));
		describeItemsResponse.setMessage(context.stringValue("DescribeItemsResponse.Message"));
		describeItemsResponse.setErrorCode(context.stringValue("DescribeItemsResponse.ErrorCode"));
		describeItemsResponse.setTotalCount(context.integerValue("DescribeItemsResponse.TotalCount"));
		describeItemsResponse.setPageNumber(context.integerValue("DescribeItemsResponse.PageNumber"));
		describeItemsResponse.setPageSize(context.integerValue("DescribeItemsResponse.PageSize"));

		List<ItemInfo> items = new ArrayList<ItemInfo>();
		for (int i = 0; i < context.lengthValue("DescribeItemsResponse.Items.Length"); i++) {
			ItemInfo itemInfo = new ItemInfo();
			itemInfo.setCompanyId(context.stringValue("DescribeItemsResponse.Items["+ i +"].CompanyId"));
			itemInfo.setStoreId(context.stringValue("DescribeItemsResponse.Items["+ i +"].StoreId"));
			itemInfo.setPriceUnit(context.stringValue("DescribeItemsResponse.Items["+ i +"].PriceUnit"));
			itemInfo.setActionPrice(context.integerValue("DescribeItemsResponse.Items["+ i +"].ActionPrice"));
			itemInfo.setItemBarCode(context.stringValue("DescribeItemsResponse.Items["+ i +"].ItemBarCode"));
			itemInfo.setItemTitle(context.stringValue("DescribeItemsResponse.Items["+ i +"].ItemTitle"));
			itemInfo.setItemId(context.longValue("DescribeItemsResponse.Items["+ i +"].ItemId"));
			itemInfo.setModelNumber(context.stringValue("DescribeItemsResponse.Items["+ i +"].ModelNumber"));
			itemInfo.setBrandName(context.stringValue("DescribeItemsResponse.Items["+ i +"].BrandName"));
			itemInfo.setSaleSpec(context.stringValue("DescribeItemsResponse.Items["+ i +"].SaleSpec"));
			itemInfo.setCategoryName(context.stringValue("DescribeItemsResponse.Items["+ i +"].CategoryName"));
			itemInfo.setRank(context.stringValue("DescribeItemsResponse.Items["+ i +"].Rank"));
			itemInfo.setEnergyEfficiency(context.stringValue("DescribeItemsResponse.Items["+ i +"].EnergyEfficiency"));
			itemInfo.setSkuId(context.stringValue("DescribeItemsResponse.Items["+ i +"].SkuId"));
			itemInfo.setPromotionStart(context.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionStart"));
			itemInfo.setPromotionEnd(context.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionEnd"));
			itemInfo.setPromotionText(context.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionText"));
			itemInfo.setPromotionReason(context.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionReason"));
			itemInfo.setBePromotion(context.booleanValue("DescribeItemsResponse.Items["+ i +"].BePromotion"));
			itemInfo.setItemQrCode(context.stringValue("DescribeItemsResponse.Items["+ i +"].ItemQrCode"));
			itemInfo.setOriginalPrice(context.integerValue("DescribeItemsResponse.Items["+ i +"].OriginalPrice"));
			itemInfo.setMemberPrice(context.integerValue("DescribeItemsResponse.Items["+ i +"].MemberPrice"));
			itemInfo.setSuggestPrice(context.integerValue("DescribeItemsResponse.Items["+ i +"].SuggestPrice"));
			itemInfo.setItemShortTitle(context.stringValue("DescribeItemsResponse.Items["+ i +"].ItemShortTitle"));
			itemInfo.setOptionGroups(context.stringValue("DescribeItemsResponse.Items["+ i +"].OptionGroups"));
			itemInfo.setProductionPlace(context.stringValue("DescribeItemsResponse.Items["+ i +"].ProductionPlace"));
			itemInfo.setPositionCode(context.stringValue("DescribeItemsResponse.Items["+ i +"].PositionCode"));
			itemInfo.setExtraAttribute(context.stringValue("DescribeItemsResponse.Items["+ i +"].ExtraAttribute"));
			itemInfo.setBeSourceCode(context.booleanValue("DescribeItemsResponse.Items["+ i +"].BeSourceCode"));
			itemInfo.setSourceCode(context.stringValue("DescribeItemsResponse.Items["+ i +"].SourceCode"));
			itemInfo.setForestFirstId(context.stringValue("DescribeItemsResponse.Items["+ i +"].ForestFirstId"));
			itemInfo.setForestSecondId(context.stringValue("DescribeItemsResponse.Items["+ i +"].ForestSecondId"));
			itemInfo.setCustomizeFeatureA(context.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureA"));
			itemInfo.setCustomizeFeatureB(context.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureB"));
			itemInfo.setCustomizeFeatureC(context.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureC"));
			itemInfo.setCustomizeFeatureD(context.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureD"));
			itemInfo.setCustomizeFeatureE(context.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureE"));
			itemInfo.setCustomizeFeatureF(context.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureF"));
			itemInfo.setCustomizeFeatureG(context.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureG"));
			itemInfo.setCustomizeFeatureH(context.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureH"));
			itemInfo.setCustomizeFeatureI(context.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureI"));
			itemInfo.setCustomizeFeatureJ(context.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureJ"));

			items.add(itemInfo);
		}
		describeItemsResponse.setItems(items);
	 
	 	return describeItemsResponse;
	}
}