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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.DescribePricingModuleResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribePricingModuleResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribePricingModuleResponse.Data.Attribute;
import com.aliyuncs.bssopenapi.model.v20171214.DescribePricingModuleResponse.Data.Attribute.AttributeValue;
import com.aliyuncs.bssopenapi.model.v20171214.DescribePricingModuleResponse.Data.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePricingModuleResponseUnmarshaller {

	public static DescribePricingModuleResponse unmarshall(DescribePricingModuleResponse describePricingModuleResponse, UnmarshallerContext context) {
		
		describePricingModuleResponse.setRequestId(context.stringValue("DescribePricingModuleResponse.RequestId"));
		describePricingModuleResponse.setSuccess(context.booleanValue("DescribePricingModuleResponse.Success"));
		describePricingModuleResponse.setCode(context.stringValue("DescribePricingModuleResponse.Code"));
		describePricingModuleResponse.setMessage(context.stringValue("DescribePricingModuleResponse.Message"));

		Data data = new Data();

		List<Module> moduleList = new ArrayList<Module>();
		for (int i = 0; i < context.lengthValue("DescribePricingModuleResponse.Data.ModuleList.Length"); i++) {
			Module module = new Module();
			module.setModuleCode(context.stringValue("DescribePricingModuleResponse.Data.ModuleList["+ i +"].ModuleCode"));
			module.setModuleName(context.stringValue("DescribePricingModuleResponse.Data.ModuleList["+ i +"].ModuleName"));
			module.setPriceType(context.stringValue("DescribePricingModuleResponse.Data.ModuleList["+ i +"].PriceType"));
			module.setCurrency(context.stringValue("DescribePricingModuleResponse.Data.ModuleList["+ i +"].Currency"));

			List<String> configList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribePricingModuleResponse.Data.ModuleList["+ i +"].ConfigList.Length"); j++) {
				configList.add(context.stringValue("DescribePricingModuleResponse.Data.ModuleList["+ i +"].ConfigList["+ j +"]"));
			}
			module.setConfigList(configList);

			moduleList.add(module);
		}
		data.setModuleList(moduleList);

		List<Attribute> attributeList = new ArrayList<Attribute>();
		for (int i = 0; i < context.lengthValue("DescribePricingModuleResponse.Data.AttributeList.Length"); i++) {
			Attribute attribute = new Attribute();
			attribute.setCode(context.stringValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Code"));
			attribute.setName(context.stringValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Name"));
			attribute.setUnit(context.stringValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Unit"));

			List<AttributeValue> values = new ArrayList<AttributeValue>();
			for (int j = 0; j < context.lengthValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Values.Length"); j++) {
				AttributeValue attributeValue = new AttributeValue();
				attributeValue.setType(context.stringValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Values["+ j +"].Type"));
				attributeValue.setName(context.stringValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Values["+ j +"].Name"));
				attributeValue.setValue(context.stringValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Values["+ j +"].Value"));
				attributeValue.setRemark(context.stringValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Values["+ j +"].Remark"));

				values.add(attributeValue);
			}
			attribute.setValues(values);

			attributeList.add(attribute);
		}
		data.setAttributeList(attributeList);
		describePricingModuleResponse.setData(data);
	 
	 	return describePricingModuleResponse;
	}
}