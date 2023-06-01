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

import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlResponse.SaleControlItem;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlResponse.SaleControlItem.SaleControlItemsItem;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlResponse.SaleControlItem.SaleControlItemsItem.SaleControlItem1;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlResponse.SaleControlItem.SaleControlItemsItem.SaleControlItem1.BasicSaleControl;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlResponse.SaleControlItem.SaleControlItemsItem.SaleControlItem1.BasicSaleControl.ModuleValue3;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlResponse.SaleControlItem.SaleControlItemsItem.SaleControlItem1.ConditionSaleControlItem;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlResponse.SaleControlItem.SaleControlItemsItem.SaleControlItem1.ConditionSaleControlItem.ConditionControl;
import com.aliyuncs.ens.model.v20171110.DescribeEnsSaleControlResponse.SaleControlItem.SaleControlItemsItem.SaleControlItem1.ConditionSaleControlItem.ModuleValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnsSaleControlResponseUnmarshaller {

	public static DescribeEnsSaleControlResponse unmarshall(DescribeEnsSaleControlResponse describeEnsSaleControlResponse, UnmarshallerContext _ctx) {
		
		describeEnsSaleControlResponse.setRequestId(_ctx.stringValue("DescribeEnsSaleControlResponse.RequestId"));

		List<SaleControlItem> saleControl = new ArrayList<SaleControlItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnsSaleControlResponse.SaleControl.Length"); i++) {
			SaleControlItem saleControlItem = new SaleControlItem();
			saleControlItem.setCommodityCode(_ctx.stringValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].CommodityCode"));
			saleControlItem.setOrderType(_ctx.stringValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].OrderType"));

			List<SaleControlItemsItem> saleControlItems = new ArrayList<SaleControlItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems.Length"); j++) {
				SaleControlItemsItem saleControlItemsItem = new SaleControlItemsItem();
				saleControlItemsItem.setModuleCode(_ctx.stringValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].ModuleCode"));

				SaleControlItem1 saleControlItem1 = new SaleControlItem1();

				BasicSaleControl basicSaleControl = new BasicSaleControl();
				basicSaleControl.setDescription(_ctx.stringValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.BasicSaleControl.Description"));
				basicSaleControl.setOperator(_ctx.stringValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.BasicSaleControl.Operator"));

				ModuleValue3 moduleValue3 = new ModuleValue3();
				moduleValue3.setModuleMinValue(_ctx.stringValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.BasicSaleControl.ModuleValue.ModuleMinValue"));
				moduleValue3.setModuleMaxValue(_ctx.stringValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.BasicSaleControl.ModuleValue.ModuleMaxValue"));

				List<String> moduleValue4 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.BasicSaleControl.ModuleValue.ModuleValue.Length"); k++) {
					moduleValue4.add(_ctx.stringValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.BasicSaleControl.ModuleValue.ModuleValue["+ k +"]"));
				}
				moduleValue3.setModuleValue4(moduleValue4);
				basicSaleControl.setModuleValue3(moduleValue3);
				saleControlItem1.setBasicSaleControl(basicSaleControl);

				List<ConditionSaleControlItem> conditionSaleControl = new ArrayList<ConditionSaleControlItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.ConditionSaleControl.Length"); k++) {
					ConditionSaleControlItem conditionSaleControlItem = new ConditionSaleControlItem();
					conditionSaleControlItem.setDescription(_ctx.stringValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.ConditionSaleControl["+ k +"].Description"));
					conditionSaleControlItem.setOperator(_ctx.stringValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.ConditionSaleControl["+ k +"].Operator"));

					ConditionControl conditionControl = new ConditionControl();
					conditionControl.setConditionControlModuleCode(_ctx.stringValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.ConditionSaleControl["+ k +"].ConditionControl.ConditionControlModuleCode"));
					conditionControl.setConditionControlModuleValue(_ctx.stringValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.ConditionSaleControl["+ k +"].ConditionControl.ConditionControlModuleValue"));
					conditionSaleControlItem.setConditionControl(conditionControl);

					ModuleValue moduleValue = new ModuleValue();
					moduleValue.setModuleMinValue(_ctx.stringValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.ConditionSaleControl["+ k +"].ModuleValue.ModuleMinValue"));
					moduleValue.setModuleMaxValue(_ctx.stringValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.ConditionSaleControl["+ k +"].ModuleValue.ModuleMaxValue"));

					List<String> moduleValue2 = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.ConditionSaleControl["+ k +"].ModuleValue.ModuleValue.Length"); l++) {
						moduleValue2.add(_ctx.stringValue("DescribeEnsSaleControlResponse.SaleControl["+ i +"].SaleControlItems["+ j +"].SaleControlItem.ConditionSaleControl["+ k +"].ModuleValue.ModuleValue["+ l +"]"));
					}
					moduleValue.setModuleValue2(moduleValue2);
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
		describeEnsSaleControlResponse.setSaleControl(saleControl);
	 
	 	return describeEnsSaleControlResponse;
	}
}