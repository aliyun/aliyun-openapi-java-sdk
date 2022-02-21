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

	public static DescribeProductResponse unmarshall(DescribeProductResponse describeProductResponse, UnmarshallerContext _ctx) {
		
		describeProductResponse.setRequestId(_ctx.stringValue("DescribeProductResponse.RequestId"));
		describeProductResponse.setFrontCategoryId(_ctx.longValue("DescribeProductResponse.FrontCategoryId"));
		describeProductResponse.setStatus(_ctx.stringValue("DescribeProductResponse.Status"));
		describeProductResponse.setType(_ctx.stringValue("DescribeProductResponse.Type"));
		describeProductResponse.setPicUrl(_ctx.stringValue("DescribeProductResponse.PicUrl"));
		describeProductResponse.setScore(_ctx.floatValue("DescribeProductResponse.Score"));
		describeProductResponse.setUseCount(_ctx.longValue("DescribeProductResponse.UseCount"));
		describeProductResponse.setGmtModified(_ctx.longValue("DescribeProductResponse.GmtModified"));
		describeProductResponse.setSupplierPk(_ctx.longValue("DescribeProductResponse.SupplierPk"));
		describeProductResponse.setGmtCreated(_ctx.longValue("DescribeProductResponse.GmtCreated"));
		describeProductResponse.setShortDescription(_ctx.stringValue("DescribeProductResponse.ShortDescription"));
		describeProductResponse.setDescription(_ctx.stringValue("DescribeProductResponse.Description"));
		describeProductResponse.setCode(_ctx.stringValue("DescribeProductResponse.Code"));
		describeProductResponse.setAuditFailMsg(_ctx.stringValue("DescribeProductResponse.AuditFailMsg"));
		describeProductResponse.setName(_ctx.stringValue("DescribeProductResponse.Name"));
		describeProductResponse.setAuditTime(_ctx.longValue("DescribeProductResponse.AuditTime"));
		describeProductResponse.setAuditStatus(_ctx.stringValue("DescribeProductResponse.AuditStatus"));

		ShopInfo shopInfo = new ShopInfo();
		shopInfo.setName(_ctx.stringValue("DescribeProductResponse.ShopInfo.Name"));
		shopInfo.setEmails(_ctx.stringValue("DescribeProductResponse.ShopInfo.Emails"));
		shopInfo.setId(_ctx.longValue("DescribeProductResponse.ShopInfo.Id"));

		List<String> telephones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProductResponse.ShopInfo.Telephones.Length"); i++) {
			telephones.add(_ctx.stringValue("DescribeProductResponse.ShopInfo.Telephones["+ i +"]"));
		}
		shopInfo.setTelephones(telephones);

		List<WangWang> wangWangs = new ArrayList<WangWang>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProductResponse.ShopInfo.WangWangs.Length"); i++) {
			WangWang wangWang = new WangWang();
			wangWang.setRemark(_ctx.stringValue("DescribeProductResponse.ShopInfo.WangWangs["+ i +"].Remark"));
			wangWang.setUserName(_ctx.stringValue("DescribeProductResponse.ShopInfo.WangWangs["+ i +"].UserName"));

			wangWangs.add(wangWang);
		}
		shopInfo.setWangWangs(wangWangs);
		describeProductResponse.setShopInfo(shopInfo);

		List<ProductSku> productSkus = new ArrayList<ProductSku>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProductResponse.ProductSkus.Length"); i++) {
			ProductSku productSku = new ProductSku();
			productSku.setHidden(_ctx.booleanValue("DescribeProductResponse.ProductSkus["+ i +"].Hidden"));
			productSku.setCode(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Code"));
			productSku.setConstraints(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Constraints"));
			productSku.setName(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Name"));
			productSku.setChargeType(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].ChargeType"));

			List<OrderPeriod> orderPeriods = new ArrayList<OrderPeriod>();
			for (int j = 0; j < _ctx.lengthValue("DescribeProductResponse.ProductSkus["+ i +"].OrderPeriods.Length"); j++) {
				OrderPeriod orderPeriod = new OrderPeriod();
				orderPeriod.setName(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].OrderPeriods["+ j +"].Name"));
				orderPeriod.setPeriodType(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].OrderPeriods["+ j +"].PeriodType"));

				orderPeriods.add(orderPeriod);
			}
			productSku.setOrderPeriods(orderPeriods);

			List<Module> modules = new ArrayList<Module>();
			for (int j = 0; j < _ctx.lengthValue("DescribeProductResponse.ProductSkus["+ i +"].Modules.Length"); j++) {
				Module module = new Module();
				module.setCode(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Code"));
				module.setName(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Name"));
				module.setId(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Id"));

				List<Property> properties = new ArrayList<Property>();
				for (int k = 0; k < _ctx.lengthValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties.Length"); k++) {
					Property property = new Property();
					property.setKey(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].Key"));
					property.setShowType(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].ShowType"));
					property.setName(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].Name"));
					property.setDisplayUnit(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].DisplayUnit"));

					List<PropertyValue> propertyValues = new ArrayList<PropertyValue>();
					for (int l = 0; l < _ctx.lengthValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues.Length"); l++) {
						PropertyValue propertyValue = new PropertyValue();
						propertyValue.setDisplayName(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].DisplayName"));
						propertyValue.setType(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Type"));
						propertyValue.setStep(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Step"));
						propertyValue.setValue(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Value"));
						propertyValue.setMax(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Max"));
						propertyValue.setRemark(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Remark"));
						propertyValue.setMin(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Min"));

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
		for (int i = 0; i < _ctx.lengthValue("DescribeProductResponse.ProductExtras.Length"); i++) {
			ProductExtra productExtra = new ProductExtra();
			productExtra.setType(_ctx.stringValue("DescribeProductResponse.ProductExtras["+ i +"].Type"));
			productExtra.setKey(_ctx.stringValue("DescribeProductResponse.ProductExtras["+ i +"].Key"));
			productExtra.setLabel(_ctx.stringValue("DescribeProductResponse.ProductExtras["+ i +"].Label"));
			productExtra.setOrder(_ctx.integerValue("DescribeProductResponse.ProductExtras["+ i +"].Order"));
			productExtra.setValues(_ctx.stringValue("DescribeProductResponse.ProductExtras["+ i +"].Values"));

			productExtras.add(productExtra);
		}
		describeProductResponse.setProductExtras(productExtras);
	 
	 	return describeProductResponse;
	}
}