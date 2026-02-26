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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlStockResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlStockResponse.SaleControlItem;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlStockResponse.SaleControlItem.SaleControlItemsItem;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlStockResponse.SaleControlItem.SaleControlItemsItem.SaleControlItem1;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlStockResponse.SaleControlItem.SaleControlItemsItem.SaleControlItem1.BasicSaleControl;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlStockResponse.SaleControlItem.SaleControlItemsItem.SaleControlItem1.BasicSaleControl.ModuleValue2;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlStockResponse.SaleControlItem.SaleControlItemsItem.SaleControlItem1.ConditionSaleControlItem;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlStockResponse.SaleControlItem.SaleControlItemsItem.SaleControlItem1.ConditionSaleControlItem.ConditionControl;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlStockResponse.SaleControlItem.SaleControlItemsItem.SaleControlItem1.ConditionSaleControlItem.ModuleValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnsSaleControlStockResponseUnmarshaller {

	public static DescribeEnsSaleControlStockResponse unmarshall(DescribeEnsSaleControlStockResponse describeEnsSaleControlStockResponse, UnmarshallerContext _ctx) {
		
		describeEnsSaleControlStockResponse.setRequestId(_ctx.stringValue("DescribeEnsSaleControlStockResponse.RequestId"));

		List<SaleControlItem> saleControl = new ArrayList<SaleControlItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnsSaleControlStockResponse.SaleControl.Length"); i++) {
			SaleControlItem saleControlItem = new SaleControlItem();
			saleControlItem.setCommodityCode(_ctx.stringValue("DescribeEnsSaleControlStockResponse.SaleControl["+ i +"].CommodityCode"));
			saleControlItem.setOrderType(_ctx.stringValue("DescribeEnsSaleControlStockResponse.SaleControl["+ i +"].OrderType"));

			List<SaleControlItemsItem> saleControlItems = new ArrayList<SaleControlItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEnsSaleControlStockResponse.SaleControl["+ i +"].SaleControlItems.Length"); j++) {
				SaleControlItemsItem saleControlItemsItem = new SaleControlItemsItem();
				saleControlItemsItem.setModuleCode(_ctx.stringValue("DescribeEnsSaleControlStockResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].ModuleCode"));

				SaleControlItem1 saleControlItem1 = new SaleControlItem1();

				BasicSaleControl basicSaleControl = new BasicSaleControl();
				basicSaleControl.setStockValue(_ctx.stringValue("DescribeEnsSaleControlStockResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.BasicSaleControl.StockValue"));

				ModuleValue2 moduleValue2 = new ModuleValue2();
				moduleValue2.setModuleMinValue(_ctx.stringValue("DescribeEnsSaleControlStockResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.BasicSaleControl.ModuleValue.ModuleMinValue"));
				moduleValue2.setModuleMaxValue(_ctx.stringValue("DescribeEnsSaleControlStockResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.BasicSaleControl.ModuleValue.ModuleMaxValue"));
				basicSaleControl.setModuleValue2(moduleValue2);
				saleControlItem1.setBasicSaleControl(basicSaleControl);

				List<ConditionSaleControlItem> conditionSaleControl = new ArrayList<ConditionSaleControlItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEnsSaleControlStockResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.ConditionSaleControl.Length"); k++) {
					ConditionSaleControlItem conditionSaleControlItem = new ConditionSaleControlItem();
					conditionSaleControlItem.setStockValue(_ctx.stringValue("DescribeEnsSaleControlStockResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.ConditionSaleControl["+ k +"].StockValue"));

					ConditionControl conditionControl = new ConditionControl();
					conditionControl.setConditionControlModuleCode(_ctx.stringValue("DescribeEnsSaleControlStockResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.ConditionSaleControl["+ k +"].ConditionControl.ConditionControlModuleCode"));
					conditionControl.setConditionControlModuleValue(_ctx.stringValue("DescribeEnsSaleControlStockResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.ConditionSaleControl["+ k +"].ConditionControl.ConditionControlModuleValue"));
					conditionSaleControlItem.setConditionControl(conditionControl);

					ModuleValue moduleValue = new ModuleValue();
					moduleValue.setModuleMinValue(_ctx.stringValue("DescribeEnsSaleControlStockResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.ConditionSaleControl["+ k +"].ModuleValue.ModuleMinValue"));
					moduleValue.setModuleMaxValue(_ctx.stringValue("DescribeEnsSaleControlStockResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.ConditionSaleControl["+ k +"].ModuleValue.ModuleMaxValue"));
					conditionSaleControlItem.setModuleValue(moduleValue);

					conditionSaleControl.add(conditionSaleControlItem);
				}
				saleControlItem1.setConditionSaleControl(conditionSaleControl);
				saleControlItemsItem.setSaleControlItem1(saleControlItem1);

				saleControlItems.add(saleControlItemsItem);
			}
			saleControlItem.setSaleControlItems(saleControlItems);

			saleControl.add(saleControlItem);
		}
		describeEnsSaleControlStockResponse.setSaleControl(saleControl);
	 
	 	return describeEnsSaleControlStockResponse;
	}
}