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

	public static QueryMarketImagesResponse unmarshall(QueryMarketImagesResponse queryMarketImagesResponse, UnmarshallerContext context) {
		
		queryMarketImagesResponse.setRequestId(context.stringValue("QueryMarketImagesResponse.RequestId"));
		queryMarketImagesResponse.setPageNumber(context.integerValue("QueryMarketImagesResponse.PageNumber"));
		queryMarketImagesResponse.setPageSize(context.integerValue("QueryMarketImagesResponse.PageSize"));
		queryMarketImagesResponse.setTotalCount(context.integerValue("QueryMarketImagesResponse.TotalCount"));

		List<ImageProduct> result = new ArrayList<ImageProduct>();
		for (int i = 0; i < context.lengthValue("QueryMarketImagesResponse.Result.Length"); i++) {
			ImageProduct imageProduct = new ImageProduct();
			imageProduct.setImageProductCode(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].ImageProductCode"));
			imageProduct.setProductName(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].ProductName"));
			imageProduct.setCategoryName(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].CategoryName"));
			imageProduct.setSupplierName(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].SupplierName"));
			imageProduct.setBaseSystem(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].BaseSystem"));
			imageProduct.setOsKind(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].OsKind"));
			imageProduct.setOsBit(context.integerValue("QueryMarketImagesResponse.Result["+ i +"].OsBit"));
			imageProduct.setPictureUrl(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].PictureUrl"));
			imageProduct.setSmallPicUrl(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].SmallPicUrl"));
			imageProduct.setShortDescription(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].ShortDescription"));
			imageProduct.setAgreementUrl(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].AgreementUrl"));
			imageProduct.setDetailUrl(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].DetailUrl"));
			imageProduct.setBuyUrl(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].BuyUrl"));
			imageProduct.setStoreUrl(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].StoreUrl"));
			imageProduct.setScore(context.floatValue("QueryMarketImagesResponse.Result["+ i +"].Score"));
			imageProduct.setUserCount(context.longValue("QueryMarketImagesResponse.Result["+ i +"].UserCount"));
			imageProduct.setSupportIO(context.booleanValue("QueryMarketImagesResponse.Result["+ i +"].SupportIO"));
			imageProduct.setCreatedOn(context.longValue("QueryMarketImagesResponse.Result["+ i +"].CreatedOn"));

			List<String> skuCodes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryMarketImagesResponse.Result["+ i +"].SkuCodes.Length"); j++) {
				skuCodes.add(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].SkuCodes["+ j +"]"));
			}
			imageProduct.setSkuCodes(skuCodes);

			Quota quota = new Quota();
			quota.setTotalQuota(context.longValue("QueryMarketImagesResponse.Result["+ i +"].Quota.TotalQuota"));
			quota.setUsingQuota(context.longValue("QueryMarketImagesResponse.Result["+ i +"].Quota.UsingQuota"));
			quota.setUnusedQuota(context.longValue("QueryMarketImagesResponse.Result["+ i +"].Quota.UnusedQuota"));
			imageProduct.setQuota(quota);

			PriceInfo priceInfo = new PriceInfo();

			Order order = new Order();
			order.setOriginalPrice(context.floatValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.OriginalPrice"));
			order.setDiscountPrice(context.floatValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.DiscountPrice"));
			order.setTradePrice(context.floatValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.TradePrice"));
			order.setCurrency(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.Currency"));
			order.setPeriod(context.integerValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.Period"));
			order.setPriceUnit(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.PriceUnit"));

			List<String> ruleIdSet = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.RuleIdSet.Length"); j++) {
				ruleIdSet.add(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Order.RuleIdSet["+ j +"]"));
			}
			order.setRuleIdSet(ruleIdSet);
			priceInfo.setOrder(order);

			List<Rule> rules = new ArrayList<Rule>();
			for (int j = 0; j < context.lengthValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Rules.Length"); j++) {
				Rule rule = new Rule();
				rule.setRuleId(context.longValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Rules["+ j +"].RuleId"));
				rule.setTitle(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Rules["+ j +"].Title"));
				rule.setName(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].PriceInfo.Rules["+ j +"].Name"));

				rules.add(rule);
			}
			priceInfo.setRules(rules);
			imageProduct.setPriceInfo(priceInfo);

			List<Image> images = new ArrayList<Image>();
			for (int j = 0; j < context.lengthValue("QueryMarketImagesResponse.Result["+ i +"].Images.Length"); j++) {
				Image image = new Image();
				image.setVersion(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].Version"));
				image.setVersionDescription(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].VersionDescription"));
				image.setImageId(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].ImageId"));
				image.setImageSize(context.integerValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].ImageSize"));
				image.setRegion(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].Region"));
				image.setIsDefault(context.booleanValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].IsDefault"));
				image.setSupportIO(context.booleanValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].SupportIO"));

				List<DiskDeviceMapping> diskDeviceMappings = new ArrayList<DiskDeviceMapping>();
				for (int k = 0; k < context.lengthValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings.Length"); k++) {
					DiskDeviceMapping diskDeviceMapping = new DiskDeviceMapping();
					diskDeviceMapping.setDiskType(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings["+ k +"].DiskType"));
					diskDeviceMapping.setFormat(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings["+ k +"].Format"));
					diskDeviceMapping.setSnapshotId(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings["+ k +"].SnapshotId"));
					diskDeviceMapping.setSize(context.integerValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings["+ k +"].Size"));
					diskDeviceMapping.setDevice(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings["+ k +"].Device"));
					diskDeviceMapping.setImportOSSBucket(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings["+ k +"].ImportOSSBucket"));
					diskDeviceMapping.setImportOSSObject(context.stringValue("QueryMarketImagesResponse.Result["+ i +"].Images["+ j +"].DiskDeviceMappings["+ k +"].ImportOSSObject"));

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