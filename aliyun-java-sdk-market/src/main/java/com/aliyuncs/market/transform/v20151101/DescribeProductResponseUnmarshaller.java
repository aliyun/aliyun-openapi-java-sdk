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

import com.aliyuncs.market.model.v20151101.DescribeProductResponse;
import com.aliyuncs.market.model.v20151101.DescribeProductResponse.ProductExtra;
import com.aliyuncs.market.model.v20151101.DescribeProductResponse.ProductSku;
import com.aliyuncs.market.model.v20151101.DescribeProductResponse.ProductSku.Module;
import com.aliyuncs.market.model.v20151101.DescribeProductResponse.ProductSku.Module.Property;
import com.aliyuncs.market.model.v20151101.DescribeProductResponse.ProductSku.Module.Property.PropertyValue;
import com.aliyuncs.market.model.v20151101.DescribeProductResponse.ProductSku.OrderPeriod;
import com.aliyuncs.market.model.v20151101.DescribeProductResponse.ShopInfo;
import com.aliyuncs.market.model.v20151101.DescribeProductResponse.ShopInfo.WangWang;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProductResponseUnmarshaller {

	public static DescribeProductResponse unmarshall(DescribeProductResponse describeProductResponse, UnmarshallerContext context) {
		
		describeProductResponse.setCode(context.stringValue("DescribeProductResponse.Code"));
		describeProductResponse.setName(context.stringValue("DescribeProductResponse.Name"));
		describeProductResponse.setType(context.stringValue("DescribeProductResponse.Type"));
		describeProductResponse.setPicUrl(context.stringValue("DescribeProductResponse.PicUrl"));
		describeProductResponse.setDescription(context.stringValue("DescribeProductResponse.Description"));
		describeProductResponse.setShortDescription(context.stringValue("DescribeProductResponse.ShortDescription"));
		describeProductResponse.setUseCount(context.longValue("DescribeProductResponse.UseCount"));
		describeProductResponse.setScore(context.floatValue("DescribeProductResponse.Score"));
		describeProductResponse.setStatus(context.stringValue("DescribeProductResponse.Status"));
		describeProductResponse.setAuditStatus(context.stringValue("DescribeProductResponse.AuditStatus"));
		describeProductResponse.setAuditFailMsg(context.stringValue("DescribeProductResponse.AuditFailMsg"));
		describeProductResponse.setAuditTime(context.longValue("DescribeProductResponse.AuditTime"));
		describeProductResponse.setGmtCreated(context.longValue("DescribeProductResponse.GmtCreated"));
		describeProductResponse.setGmtModified(context.longValue("DescribeProductResponse.GmtModified"));

		ShopInfo shopInfo = new ShopInfo();
		shopInfo.setId(context.longValue("DescribeProductResponse.ShopInfo.Id"));
		shopInfo.setName(context.stringValue("DescribeProductResponse.ShopInfo.Name"));
		shopInfo.setEmails(context.stringValue("DescribeProductResponse.ShopInfo.Emails"));

		List<String> telephones = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeProductResponse.ShopInfo.Telephones.Length"); i++) {
			telephones.add(context.stringValue("DescribeProductResponse.ShopInfo.Telephones["+ i +"]"));
		}
		shopInfo.setTelephones(telephones);

		List<WangWang> wangWangs = new ArrayList<WangWang>();
		for (int i = 0; i < context.lengthValue("DescribeProductResponse.ShopInfo.WangWangs.Length"); i++) {
			WangWang wangWang = new WangWang();
			wangWang.setUserName(context.stringValue("DescribeProductResponse.ShopInfo.WangWangs["+ i +"].UserName"));
			wangWang.setRemark(context.stringValue("DescribeProductResponse.ShopInfo.WangWangs["+ i +"].Remark"));

			wangWangs.add(wangWang);
		}
		shopInfo.setWangWangs(wangWangs);
		describeProductResponse.setShopInfo(shopInfo);

		List<ProductSku> productSkus = new ArrayList<ProductSku>();
		for (int i = 0; i < context.lengthValue("DescribeProductResponse.ProductSkus.Length"); i++) {
			ProductSku productSku = new ProductSku();
			productSku.setName(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Name"));
			productSku.setCode(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Code"));
			productSku.setChargeType(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].ChargeType"));
			productSku.setConstraints(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Constraints"));
			productSku.setHidden(context.booleanValue("DescribeProductResponse.ProductSkus["+ i +"].Hidden"));

			List<OrderPeriod> orderPeriods = new ArrayList<OrderPeriod>();
			for (int j = 0; j < context.lengthValue("DescribeProductResponse.ProductSkus["+ i +"].OrderPeriods.Length"); j++) {
				OrderPeriod orderPeriod = new OrderPeriod();
				orderPeriod.setName(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].OrderPeriods["+ j +"].Name"));
				orderPeriod.setPeriodType(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].OrderPeriods["+ j +"].PeriodType"));

				orderPeriods.add(orderPeriod);
			}
			productSku.setOrderPeriods(orderPeriods);

			List<Module> modules = new ArrayList<Module>();
			for (int j = 0; j < context.lengthValue("DescribeProductResponse.ProductSkus["+ i +"].Modules.Length"); j++) {
				Module module = new Module();
				module.setId(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Id"));
				module.setName(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Name"));
				module.setCode(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Code"));

				List<Property> properties = new ArrayList<Property>();
				for (int k = 0; k < context.lengthValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties.Length"); k++) {
					Property property = new Property();
					property.setName(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].Name"));
					property.setKey(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].Key"));
					property.setShowType(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].ShowType"));
					property.setDisplayUnit(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].DisplayUnit"));

					List<PropertyValue> propertyValues = new ArrayList<PropertyValue>();
					for (int l = 0; l < context.lengthValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues.Length"); l++) {
						PropertyValue propertyValue = new PropertyValue();
						propertyValue.setValue(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Value"));
						propertyValue.setDisplayName(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].DisplayName"));
						propertyValue.setType(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Type"));
						propertyValue.setMin(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Min"));
						propertyValue.setMax(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Max"));
						propertyValue.setStep(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Step"));
						propertyValue.setRemark(context.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Remark"));

						propertyValues.add(propertyValue);
					}
					property.setPropertyValues(propertyValues);

					properties.add(property);
				}
				module.setProperties(properties);

				modules.add(module);
			}
			productSku.setModules(modules);

			productSkus.add(productSku);
		}
		describeProductResponse.setProductSkus(productSkus);

		List<ProductExtra> productExtras = new ArrayList<ProductExtra>();
		for (int i = 0; i < context.lengthValue("DescribeProductResponse.ProductExtras.Length"); i++) {
			ProductExtra productExtra = new ProductExtra();
			productExtra.setKey(context.stringValue("DescribeProductResponse.ProductExtras["+ i +"].Key"));
			productExtra.setValues(context.stringValue("DescribeProductResponse.ProductExtras["+ i +"].Values"));
			productExtra.setLabel(context.stringValue("DescribeProductResponse.ProductExtras["+ i +"].Label"));
			productExtra.setOrder(context.integerValue("DescribeProductResponse.ProductExtras["+ i +"].Order"));
			productExtra.setType(context.stringValue("DescribeProductResponse.ProductExtras["+ i +"].Type"));

			productExtras.add(productExtra);
		}
		describeProductResponse.setProductExtras(productExtras);
	 
	 	return describeProductResponse;
	}
}