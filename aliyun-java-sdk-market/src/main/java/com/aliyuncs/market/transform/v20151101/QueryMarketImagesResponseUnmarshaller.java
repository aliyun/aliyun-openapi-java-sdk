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

package com.aliyuncs.market.transform.v20151101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market.model.v20151101.QueryMarketImagesResponse;
import com.aliyuncs.market.model.v20151101.QueryMarketImagesResponse.ImageProduct;
import com.aliyuncs.market.model.v20151101.QueryMarketImagesResponse.ImageProduct.Image;
import com.aliyuncs.market.model.v20151101.QueryMarketImagesResponse.ImageProduct.Image.DiskDeviceMapping;
import com.aliyuncs.market.model.v20151101.QueryMarketImagesResponse.ImageProduct.PriceInfo;
import com.aliyuncs.market.model.v20151101.QueryMarketImagesResponse.ImageProduct.PriceInfo.Order;
import com.aliyuncs.market.model.v20151101.QueryMarketImagesResponse.ImageProduct.PriceInfo.Rule;
import com.aliyuncs.market.model.v20151101.QueryMarketImagesResponse.ImageProduct.Quota;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMarketImagesResponseUnmarshaller {

	public static QueryMarketImagesResponse unmarshall(QueryMarketImagesResponse queryMarketImagesResponse, UnmarshallerContext _ctx) {
		
		queryMarketImagesResponse.setRequestId(_ctx.stringValue("QueryMarketImagesResponse.RequestId"));
		queryMarketImagesResponse.setPageNumber(_ctx.integerValue("QueryMarketImagesResponse.PageNumber"));
		queryMarketImagesResponse.setPageSize(_ctx.integerValue("QueryMarketImagesResponse.PageSize"));
		queryMarketImagesResponse.setTotalCount(_ctx.integerValue("QueryMarketImagesResponse.TotalCount"));

		List<ImageProduct> result = new ArrayList<ImageProduct>();
		for (int i = 0; i < _ctx.lengthValue("QueryMarketImagesResponse.Result.Length"); i++) {
			ImageProduct imageProduct = new ImageProduct();
			imageProduct.setImageProductCode(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].ImageProductCode"));
			imageProduct.setProductName(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].ProductName"));
			imageProduct.setCategoryName(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].CategoryName"));
			imageProduct.setSupplierName(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].SupplierName"));
			imageProduct.setBaseSystem(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].BaseSystem"));
			imageProduct.setOsKind(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].OsKind"));
			imageProduct.setOsBit(_ctx.integerValue("QueryMarketImagesResponse.Result["+ i +"].OsBit"));
			imageProduct.setPictureUrl(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].PictureUrl"));
			imageProduct.setSmallPicUrl(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].SmallPicUrl"));
			imageProduct.setShortDescription(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].ShortDescription"));
			imageProduct.setAgreementUrl(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].AgreementUrl"));
			imageProduct.setDetailUrl(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].DetailUrl"));
			imageProduct.setBuyUrl(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].BuyUrl"));
			imageProduct.setStoreUrl(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].StoreUrl"));
			imageProduct.setScore(_ctx.floatValue("QueryMarketImagesResponse.Result["+ i +"].Score"));
			imageProduct.setUserCount(_ctx.longValue("QueryMarketImagesResponse.Result["+ i +"].UserCount"));
			imageProduct.setSupportIO(_ctx.booleanValue("QueryMarketImagesResponse.Result["+ i +"].SupportIO"));
			imageProduct.setCreatedOn(_ctx.longValue("QueryMarketImagesResponse.Result["+ i +"].CreatedOn"));

			List<String> skuCodes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryMarketImagesResponse.Result["+ i +"].SkuCodes.Length"); j++) {
				skuCodes.add(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].SkuCodes["+ j +"]"));
			}
			imageProduct.setSkuCodes(skuCodes);

			Quota quota = new Quota();
			quota.setTotalQuota(_ctx.longValue("QueryMarketImagesResponse.Result["+ i +"].Quota.TotalQuota"));
			quota.setUsingQuota(_ctx.longValue("QueryMarketImagesResponse.Result["+ i +"].Quota.UsingQuota"));
			quota.setUnusedQuota(_ctx.longValue("QueryMarketImagesResponse.Result["+ i +"].Quota.UnusedQuota"));
			imageProduct.setQuota(quota);

			PriceInfo priceInfo = new PriceInfo();

			Order order = new Order();
			order.setOriginalPrice(_ctx.floatValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.OriginalPrice"));
			order.setDiscountPrice(_ctx.floatValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.DiscountPrice"));
			order.setTradePrice(_ctx.floatValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.TradePrice"));
			order.setCurrency(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.Currency"));
			order.setPeriod(_ctx.integerValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.Period"));
			order.setPriceUnit(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.PriceUnit"));

			List<String> ruleIdSet = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.RuleIdSet.Length"); j++) {
				ruleIdSet.add(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.RuleIdSet["+ j +"]"));
			}
			order.setRuleIdSet(ruleIdSet);
			priceInfo.setOrder(order);

			List<Rule> rules = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Rules.Length"); j++) {
				Rule rule = new Rule();
				rule.setRuleId(_ctx.longValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Rules["+ j +"].RuleId"));
				rule.setTitle(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Rules["+ j +"].Title"));
				rule.setName(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Rules["+ j +"].Name"));

				rules.add(rule);
			}
			priceInfo.setRules(rules);
			imageProduct.setPriceInfo(priceInfo);

			List<Image> images = new ArrayList<Image>();
			for (int j = 0; j < _ctx.lengthValue("QueryMarketImagesResponse.Result["+ i +"].Images.Length"); j++) {
				Image image = new Image();
				image.setVersion(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].Version"));
				image.setVersionDescription(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].VersionDescription"));
				image.setImageId(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].ImageId"));
				image.setImageSize(_ctx.integerValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].ImageSize"));
				image.setRegion(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].Region"));
				image.setIsDefault(_ctx.booleanValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].IsDefault"));
				image.setSupportIO(_ctx.booleanValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].SupportIO"));

				List<DiskDeviceMapping> diskDeviceMappings = new ArrayList<DiskDeviceMapping>();
				for (int k = 0; k < _ctx.lengthValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings.Length"); k++) {
					DiskDeviceMapping diskDeviceMapping = new DiskDeviceMapping();
					diskDeviceMapping.setDiskType(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings["+ k +"].DiskType"));
					diskDeviceMapping.setFormat(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings["+ k +"].Format"));
					diskDeviceMapping.setSnapshotId(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings["+ k +"].SnapshotId"));
					diskDeviceMapping.setSize(_ctx.integerValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings["+ k +"].Size"));
					diskDeviceMapping.setDevice(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings["+ k +"].Device"));
					diskDeviceMapping.setImportOSSBucket(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings["+ k +"].ImportOSSBucket"));
					diskDeviceMapping.setImportOSSObject(_ctx.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings["+ k +"].ImportOSSObject"));

					diskDeviceMappings.add(diskDeviceMapping);
				}
				image.setDiskDeviceMappings(diskDeviceMappings);

				images.add(image);
			}
			imageProduct.setImages(images);

			result.add(imageProduct);
		}
		queryMarketImagesResponse.setResult(result);
	 
	 	return queryMarketImagesResponse;
	}
}