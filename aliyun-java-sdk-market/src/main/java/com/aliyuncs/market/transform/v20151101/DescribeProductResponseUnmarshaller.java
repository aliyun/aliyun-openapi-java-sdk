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
		
		describeProductResponse.setCode(_ctx.stringValue("DescribeProductResponse.Code"));
		describeProductResponse.setName(_ctx.stringValue("DescribeProductResponse.Name"));
		describeProductResponse.setType(_ctx.stringValue("DescribeProductResponse.Type"));
		describeProductResponse.setPicUrl(_ctx.stringValue("DescribeProductResponse.PicUrl"));
		describeProductResponse.setDescription(_ctx.stringValue("DescribeProductResponse.Description"));
		describeProductResponse.setShortDescription(_ctx.stringValue("DescribeProductResponse.ShortDescription"));
		describeProductResponse.setUseCount(_ctx.longValue("DescribeProductResponse.UseCount"));
		describeProductResponse.setScore(_ctx.floatValue("DescribeProductResponse.Score"));
		describeProductResponse.setStatus(_ctx.stringValue("DescribeProductResponse.Status"));
		describeProductResponse.setAuditStatus(_ctx.stringValue("DescribeProductResponse.AuditStatus"));
		describeProductResponse.setAuditFailMsg(_ctx.stringValue("DescribeProductResponse.AuditFailMsg"));
		describeProductResponse.setAuditTime(_ctx.longValue("DescribeProductResponse.AuditTime"));
		describeProductResponse.setGmtCreated(_ctx.longValue("DescribeProductResponse.GmtCreated"));
		describeProductResponse.setGmtModified(_ctx.longValue("DescribeProductResponse.GmtModified"));

		ShopInfo shopInfo = new ShopInfo();
		shopInfo.setId(_ctx.longValue("DescribeProductResponse.ShopInfo.Id"));
		shopInfo.setName(_ctx.stringValue("DescribeProductResponse.ShopInfo.Name"));
		shopInfo.setEmails(_ctx.stringValue("DescribeProductResponse.ShopInfo.Emails"));

		List<String> telephones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProductResponse.ShopInfo.Telephones.Length"); i++) {
			telephones.add(_ctx.stringValue("DescribeProductResponse.ShopInfo.Telephones["+ i +"]"));
		}
		shopInfo.setTelephones(telephones);

		List<WangWang> wangWangs = new ArrayList<WangWang>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProductResponse.ShopInfo.WangWangs.Length"); i++) {
			WangWang wangWang = new WangWang();
			wangWang.setUserName(_ctx.stringValue("DescribeProductResponse.ShopInfo.WangWangs["+ i +"].UserName"));
			wangWang.setRemark(_ctx.stringValue("DescribeProductResponse.ShopInfo.WangWangs["+ i +"].Remark"));

			wangWangs.add(wangWang);
		}
		shopInfo.setWangWangs(wangWangs);
		describeProductResponse.setShopInfo(shopInfo);

		List<ProductSku> productSkus = new ArrayList<ProductSku>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProductResponse.ProductSkus.Length"); i++) {
			ProductSku productSku = new ProductSku();
			productSku.setName(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Name"));
			productSku.setCode(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Code"));
			productSku.setChargeType(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].ChargeType"));
			productSku.setConstraints(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Constraints"));
			productSku.setHidden(_ctx.booleanValue("DescribeProductResponse.ProductSkus["+ i +"].Hidden"));

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
				module.setId(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Id"));
				module.setName(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Name"));
				module.setCode(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Code"));

				List<Property> properties = new ArrayList<Property>();
				for (int k = 0; k < _ctx.lengthValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties.Length"); k++) {
					Property property = new Property();
					property.setName(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].Name"));
					property.setKey(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].Key"));
					property.setShowType(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].ShowType"));
					property.setDisplayUnit(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].DisplayUnit"));

					List<PropertyValue> propertyValues = new ArrayList<PropertyValue>();
					for (int l = 0; l < _ctx.lengthValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues.Length"); l++) {
						PropertyValue propertyValue = new PropertyValue();
						propertyValue.setValue(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Value"));
						propertyValue.setDisplayName(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].DisplayName"));
						propertyValue.setType(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Type"));
						propertyValue.setMin(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Min"));
						propertyValue.setMax(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Max"));
						propertyValue.setStep(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Step"));
						propertyValue.setRemark(_ctx.stringValue("DescribeProductResponse.ProductSkus["+ i +"].Modules["+ j +"].Properties["+ k +"].PropertyValues["+ l +"].Remark"));

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
			productExtra.setKey(_ctx.stringValue("DescribeProductResponse.ProductExtras["+ i +"].Key"));
			productExtra.setValues(_ctx.stringValue("DescribeProductResponse.ProductExtras["+ i +"].Values"));
			productExtra.setLabel(_ctx.stringValue("DescribeProductResponse.ProductExtras["+ i +"].Label"));
			productExtra.setOrder(_ctx.integerValue("DescribeProductResponse.ProductExtras["+ i +"].Order"));
			productExtra.setType(_ctx.stringValue("DescribeProductResponse.ProductExtras["+ i +"].Type"));

			productExtras.add(productExtra);
		}
		describeProductResponse.setProductExtras(productExtras);
	 
	 	return describeProductResponse;
	}
}