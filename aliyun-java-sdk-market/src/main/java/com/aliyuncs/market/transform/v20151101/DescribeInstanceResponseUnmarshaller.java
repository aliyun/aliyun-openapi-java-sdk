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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceResponseUnmarshaller {

	public static DescribeInstanceResponse unmarshall(DescribeInstanceResponse describeInstanceResponse, UnmarshallerContext context) {
		
		describeInstanceResponse.setInstanceId(context.longValue("DescribeInstanceResponse.InstanceId"));
		describeInstanceResponse.setOrderId(context.longValue("DescribeInstanceResponse.OrderId"));
		describeInstanceResponse.setSupplierName(context.stringValue("DescribeInstanceResponse.SupplierName"));
		describeInstanceResponse.setProductCode(context.stringValue("DescribeInstanceResponse.ProductCode"));
		describeInstanceResponse.setProductSkuCode(context.stringValue("DescribeInstanceResponse.ProductSkuCode"));
		describeInstanceResponse.setProductName(context.stringValue("DescribeInstanceResponse.ProductName"));
		describeInstanceResponse.setProductType(context.stringValue("DescribeInstanceResponse.ProductType"));
		describeInstanceResponse.setStatus(context.stringValue("DescribeInstanceResponse.Status"));
		describeInstanceResponse.setBeganOn(context.longValue("DescribeInstanceResponse.BeganOn"));
		describeInstanceResponse.setEndOn(context.longValue("DescribeInstanceResponse.EndOn"));
		describeInstanceResponse.setCreatedOn(context.longValue("DescribeInstanceResponse.CreatedOn"));
		describeInstanceResponse.setExtendJson(context.stringValue("DescribeInstanceResponse.ExtendJson"));
		describeInstanceResponse.setHostJson(context.stringValue("DescribeInstanceResponse.HostJson"));
		describeInstanceResponse.setAppJson(context.stringValue("DescribeInstanceResponse.AppJson"));
		describeInstanceResponse.setConstraints(context.stringValue("DescribeInstanceResponse.Constraints"));

		List<Module> modules = new ArrayList<Module>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceResponse.Modules.Length"); i++) {
			Module module = new Module();
			module.setId(context.stringValue("DescribeInstanceResponse.Modules["+ i +"].Id"));
			module.setName(context.stringValue("DescribeInstanceResponse.Modules["+ i +"].Name"));
			module.setCode(context.stringValue("DescribeInstanceResponse.Modules["+ i +"].Code"));

			List<Property> properties = new ArrayList<Property>();
			for (int j = 0; j < context.lengthValue("DescribeInstanceResponse.Modules["+ i +"].Properties.Length"); j++) {
				Property property = new Property();
				property.setName(context.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].Name"));
				property.setKey(context.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].Key"));
				property.setShowType(context.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].ShowType"));
				property.setDisplayUnit(context.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].DisplayUnit"));

				List<PropertyValue> propertyValues = new ArrayList<PropertyValue>();
				for (int k = 0; k < context.lengthValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues.Length"); k++) {
					PropertyValue propertyValue = new PropertyValue();
					propertyValue.setValue(context.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues["+ k +"].Value"));
					propertyValue.setDisplayName(context.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues["+ k +"].DisplayName"));
					propertyValue.setType(context.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues["+ k +"].Type"));
					propertyValue.setMin(context.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues["+ k +"].Min"));
					propertyValue.setMax(context.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues["+ k +"].Max"));
					propertyValue.setStep(context.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues["+ k +"].Step"));
					propertyValue.setRemark(context.stringValue("DescribeInstanceResponse.Modules["+ i +"].Properties["+ j +"].PropertyValues["+ k +"].Remark"));

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