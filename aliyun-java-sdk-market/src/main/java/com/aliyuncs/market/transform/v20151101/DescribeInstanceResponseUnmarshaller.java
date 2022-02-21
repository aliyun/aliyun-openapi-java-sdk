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

import com.aliyuncs.market.model.v20151101.DescribeInstanceResponse;
import com.aliyuncs.market.model.v20151101.DescribeInstanceResponse.Module;
import com.aliyuncs.market.model.v20151101.DescribeInstanceResponse.Module.Property;
import com.aliyuncs.market.model.v20151101.DescribeInstanceResponse.Module.Property.PropertyValue;
import com.aliyuncs.market.model.v20151101.DescribeInstanceResponse.RelationalData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceResponseUnmarshaller {

	public static DescribeInstanceResponse unmarshall(DescribeInstanceResponse describeInstanceResponse, UnmarshallerContext _ctx) {
		
		describeInstanceResponse.setStatus(_ctx.stringValue("DescribeInstanceResponse.Status"));
		describeInstanceResponse.setAppJson(_ctx.stringValue("DescribeInstanceResponse.AppJson"));
		describeInstanceResponse.setProductName(_ctx.stringValue("DescribeInstanceResponse.ProductName"));
		describeInstanceResponse.setInstanceId(_ctx.longValue("DescribeInstanceResponse.InstanceId"));
		describeInstanceResponse.setExtendJson(_ctx.stringValue("DescribeInstanceResponse.ExtendJson"));
		describeInstanceResponse.setIsTrial(_ctx.booleanValue("DescribeInstanceResponse.IsTrial"));
		describeInstanceResponse.setBeganOn(_ctx.longValue("DescribeInstanceResponse.BeganOn"));
		describeInstanceResponse.setComponentJson(_ctx.stringValue("DescribeInstanceResponse.ComponentJson"));
		describeInstanceResponse.setConstraints(_ctx.stringValue("DescribeInstanceResponse.Constraints"));
		describeInstanceResponse.setProductType(_ctx.stringValue("DescribeInstanceResponse.ProductType"));
		describeInstanceResponse.setHostJson(_ctx.stringValue("DescribeInstanceResponse.HostJson"));
		describeInstanceResponse.setProductSkuCode(_ctx.stringValue("DescribeInstanceResponse.ProductSkuCode"));
		describeInstanceResponse.setCreatedOn(_ctx.longValue("DescribeInstanceResponse.CreatedOn"));
		describeInstanceResponse.setEndOn(_ctx.longValue("DescribeInstanceResponse.EndOn"));
		describeInstanceResponse.setOrderId(_ctx.longValue("DescribeInstanceResponse.OrderId"));
		describeInstanceResponse.setProductCode(_ctx.stringValue("DescribeInstanceResponse.ProductCode"));
		describeInstanceResponse.setSupplierName(_ctx.stringValue("DescribeInstanceResponse.SupplierName"));

		RelationalData relationalData = new RelationalData();
		relationalData.setServiceStatus(_ctx.stringValue("DescribeInstanceResponse.RelationalData.ServiceStatus"));
		describeInstanceResponse.setRelationalData(relationalData);

		List<Module> modules = new ArrayList<Module>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Modules.Length"); i++) {
			Module module = new Module();
			module.setCode(_ctx.stringValue("DescribeInstanceResponse.Modules["+ i +"].Code"));
			module.setName(_ctx.stringValue("DescribeInstanceResponse.Modules["+ i +"].Name"));
			module.setId(_ctx.stringValue("DescribeInstanceResponse.Modules["+ i +"].Id"));

			List<Property> properties = new ArrayList<Property>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceResponse.Modules["+ i +"].Properties.Length"); j++) {
				Property property = new Property();
				property.setKey(_ctx.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].Key"));
				property.setShowType(_ctx.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].ShowType"));
				property.setName(_ctx.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].Name"));
				property.setDisplayUnit(_ctx.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].DisplayUnit"));

				List<PropertyValue> propertyValues = new ArrayList<PropertyValue>();
				for (int k = 0; k < _ctx.lengthValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues.Length"); k++) {
					PropertyValue propertyValue = new PropertyValue();
					propertyValue.setDisplayName(_ctx.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues["+ k +"].DisplayName"));
					propertyValue.setType(_ctx.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues["+ k +"].Type"));
					propertyValue.setStep(_ctx.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues["+ k +"].Step"));
					propertyValue.setValue(_ctx.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues["+ k +"].Value"));
					propertyValue.setMax(_ctx.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues["+ k +"].Max"));
					propertyValue.setRemark(_ctx.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues["+ k +"].Remark"));
					propertyValue.setMin(_ctx.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues["+ k +"].Min"));

					propertyValues.add(propertyValue);
				}
				property.setPropertyValues(propertyValues);

				properties.add(property);
			}
			module.setProperties(properties);

			modules.add(module);
		}
		describeInstanceResponse.setModules(modules);
	 
	 	return describeInstanceResponse;
	}
}