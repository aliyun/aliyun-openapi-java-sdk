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

	public static DescribePricingModuleResponse unmarshall(DescribePricingModuleResponse describePricingModuleResponse, UnmarshallerContext _ctx) {
		
		describePricingModuleResponse.setRequestId(_ctx.stringValue("DescribePricingModuleResponse.RequestId"));
		describePricingModuleResponse.setSuccess(_ctx.booleanValue("DescribePricingModuleResponse.Success"));
		describePricingModuleResponse.setCode(_ctx.stringValue("DescribePricingModuleResponse.Code"));
		describePricingModuleResponse.setMessage(_ctx.stringValue("DescribePricingModuleResponse.Message"));

		Data data = new Data();

		List<Module> moduleList = new ArrayList<Module>();
		for (int i = 0; i < _ctx.lengthValue("DescribePricingModuleResponse.Data.ModuleList.Length"); i++) {
			Module module = new Module();
			module.setModuleCode(_ctx.stringValue("DescribePricingModuleResponse.Data.ModuleList["+ i +"].ModuleCode"));
			module.setModuleName(_ctx.stringValue("DescribePricingModuleResponse.Data.ModuleList["+ i +"].ModuleName"));
			module.setPriceType(_ctx.stringValue("DescribePricingModuleResponse.Data.ModuleList["+ i +"].PriceType"));
			module.setCurrency(_ctx.stringValue("DescribePricingModuleResponse.Data.ModuleList["+ i +"].Currency"));

			List<String> configList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePricingModuleResponse.Data.ModuleList["+ i +"].ConfigList.Length"); j++) {
				configList.add(_ctx.stringValue("DescribePricingModuleResponse.Data.ModuleList["+ i +"].ConfigList["+ j +"]"));
			}
			module.setConfigList(configList);

			moduleList.add(module);
		}
		data.setModuleList(moduleList);

		List<Attribute> attributeList = new ArrayList<Attribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribePricingModuleResponse.Data.AttributeList.Length"); i++) {
			Attribute attribute = new Attribute();
			attribute.setCode(_ctx.stringValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Code"));
			attribute.setName(_ctx.stringValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Name"));
			attribute.setUnit(_ctx.stringValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Unit"));

			List<AttributeValue> values = new ArrayList<AttributeValue>();
			for (int j = 0; j < _ctx.lengthValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Values.Length"); j++) {
				AttributeValue attributeValue = new AttributeValue();
				attributeValue.setType(_ctx.stringValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Values["+ j +"].Type"));
				attributeValue.setName(_ctx.stringValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Values["+ j +"].Name"));
				attributeValue.setValue(_ctx.stringValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Values["+ j +"].Value"));
				attributeValue.setRemark(_ctx.stringValue("DescribePricingModuleResponse.Data.AttributeList["+ i +"].Values["+ j +"].Remark"));

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