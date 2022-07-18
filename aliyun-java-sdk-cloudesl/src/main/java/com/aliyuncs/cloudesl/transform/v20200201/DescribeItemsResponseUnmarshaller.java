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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribeItemsResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeItemsResponse.ItemInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeItemsResponseUnmarshaller {

	public static DescribeItemsResponse unmarshall(DescribeItemsResponse describeItemsResponse, UnmarshallerContext _ctx) {
		
		describeItemsResponse.setRequestId(_ctx.stringValue("DescribeItemsResponse.RequestId"));
		describeItemsResponse.setTemplateSceneId(_ctx.stringValue("DescribeItemsResponse.TemplateSceneId"));
		describeItemsResponse.setErrorMessage(_ctx.stringValue("DescribeItemsResponse.ErrorMessage"));
		describeItemsResponse.setSuccess(_ctx.booleanValue("DescribeItemsResponse.Success"));
		describeItemsResponse.setMessage(_ctx.stringValue("DescribeItemsResponse.Message"));
		describeItemsResponse.setDynamicMessage(_ctx.stringValue("DescribeItemsResponse.DynamicMessage"));
		describeItemsResponse.setTotalCount(_ctx.integerValue("DescribeItemsResponse.TotalCount"));
		describeItemsResponse.setDynamicCode(_ctx.stringValue("DescribeItemsResponse.DynamicCode"));
		describeItemsResponse.setErrorCode(_ctx.stringValue("DescribeItemsResponse.ErrorCode"));
		describeItemsResponse.setCode(_ctx.stringValue("DescribeItemsResponse.Code"));
		describeItemsResponse.setPageNumber(_ctx.integerValue("DescribeItemsResponse.PageNumber"));
		describeItemsResponse.setPageSize(_ctx.integerValue("DescribeItemsResponse.PageSize"));

		List<ItemInfo> items = new ArrayList<ItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeItemsResponse.Items.Length"); i++) {
			ItemInfo itemInfo = new ItemInfo();
			itemInfo.setActionPrice(_ctx.integerValue("DescribeItemsResponse.Items["+ i +"].ActionPrice"));
			itemInfo.setItemTitle(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ItemTitle"));
			itemInfo.setBrandName(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].BrandName"));
			itemInfo.setSourceCode(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].SourceCode"));
			itemInfo.setPriceUnit(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PriceUnit"));
			itemInfo.setForestFirstId(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ForestFirstId"));
			itemInfo.setCustomizeFeatureF(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureF"));
			itemInfo.setCustomizeFeatureA(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureA"));
			itemInfo.setCustomizeFeatureK(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureK"));
			itemInfo.setTemplateSceneId(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].TemplateSceneId"));
			itemInfo.setCustomizeFeatureD(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureD"));
			itemInfo.setMemberPrice(_ctx.integerValue("DescribeItemsResponse.Items["+ i +"].MemberPrice"));
			itemInfo.setPromotionStart(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionStart"));
			itemInfo.setModelNumber(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ModelNumber"));
			itemInfo.setCategoryName(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CategoryName"));
			itemInfo.setCustomizeFeatureE(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureE"));
			itemInfo.setSuggestPrice(_ctx.integerValue("DescribeItemsResponse.Items["+ i +"].SuggestPrice"));
			itemInfo.setSaleSpec(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].SaleSpec"));
			itemInfo.setPromotionText(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionText"));
			itemInfo.setRank(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].Rank"));
			itemInfo.setPromotionReason(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionReason"));
			itemInfo.setCustomizeFeatureG(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureG"));
			itemInfo.setSalesPrice(_ctx.integerValue("DescribeItemsResponse.Items["+ i +"].SalesPrice"));
			itemInfo.setCustomizeFeatureH(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureH"));
			itemInfo.setOriginalPrice(_ctx.integerValue("DescribeItemsResponse.Items["+ i +"].OriginalPrice"));
			itemInfo.setGmtModified(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].GmtModified"));
			itemInfo.setCustomizeFeatureI(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureI"));
			itemInfo.setProductionPlace(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ProductionPlace"));
			itemInfo.setCustomizeFeatureB(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureB"));
			itemInfo.setItemShortTitle(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ItemShortTitle"));
			itemInfo.setCustomizeFeatureN(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureN"));
			itemInfo.setBeMember(_ctx.booleanValue("DescribeItemsResponse.Items["+ i +"].BeMember"));
			itemInfo.setTaxFee(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].TaxFee"));
			itemInfo.setInventoryStatus(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].InventoryStatus"));
			itemInfo.setSupplierName(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].SupplierName"));
			itemInfo.setItemPicUrl(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ItemPicUrl"));
			itemInfo.setEnergyEfficiency(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].EnergyEfficiency"));
			itemInfo.setCustomizeFeatureL(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureL"));
			itemInfo.setCustomizeFeatureC(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureC"));
			itemInfo.setItemId(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ItemId"));
			itemInfo.setManufacturer(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].Manufacturer"));
			itemInfo.setMaterial(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].Material"));
			itemInfo.setCustomizeFeatureO(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureO"));
			itemInfo.setCustomizeFeatureP(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureP"));
			itemInfo.setCustomizeFeatureQ(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureQ"));
			itemInfo.setCustomizeFeatureR(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureR"));
			itemInfo.setCustomizeFeatureS(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureS"));
			itemInfo.setCustomizeFeatureT(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureT"));
			itemInfo.setCustomizeFeatureU(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureU"));
			itemInfo.setCustomizeFeatureV(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureV"));
			itemInfo.setCustomizeFeatureW(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureW"));
			itemInfo.setCustomizeFeatureX(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureX"));
			itemInfo.setCustomizeFeatureY(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureY"));
			itemInfo.setCustomizeFeatureZ(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureZ"));
			itemInfo.setCustomizeFeatureJ(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureJ"));
			itemInfo.setGmtCreate(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].GmtCreate"));
			itemInfo.setCustomizeFeatureM(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].CustomizeFeatureM"));
			itemInfo.setBePromotion(_ctx.booleanValue("DescribeItemsResponse.Items["+ i +"].BePromotion"));
			itemInfo.setSkuId(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].SkuId"));
			itemInfo.setBeSourceCode(_ctx.booleanValue("DescribeItemsResponse.Items["+ i +"].BeSourceCode"));
			itemInfo.setForestSecondId(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ForestSecondId"));
			itemInfo.setItemQrCode(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ItemQrCode"));
			itemInfo.setItemInfoIndex(_ctx.integerValue("DescribeItemsResponse.Items["+ i +"].ItemInfoIndex"));
			itemInfo.setPromotionEnd(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].PromotionEnd"));
			itemInfo.setItemBarCode(_ctx.stringValue("DescribeItemsResponse.Items["+ i +"].ItemBarCode"));
			itemInfo.setBeClearance(_ctx.booleanValue("DescribeItemsResponse.Items["+ i +"].BeClearance"));

			items.add(itemInfo);
		}
		describeItemsResponse.setItems(items);
	 
	 	return describeItemsResponse;
	}
}