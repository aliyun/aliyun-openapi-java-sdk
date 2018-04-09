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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListClusterServiceConfigResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceConfigResponse.Config;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceConfigResponse.Config.ConfigValue;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceConfigResponse.Config.ConfigValue.ConfigItemValue;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceConfigResponse.Config.PropertyInfo;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceConfigResponse.Config.PropertyInfo.EffectWay;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceConfigResponse.Config.PropertyInfo.PropertyValueAttributes;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceConfigResponse.Config.PropertyInfo.PropertyValueAttributes.ValueEntryInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceConfigResponseUnmarshaller {

	public static ListClusterServiceConfigResponse unmarshall(ListClusterServiceConfigResponse listClusterServiceConfigResponse, UnmarshallerContext context) {
		
		listClusterServiceConfigResponse.setRequestId(context.stringValue("ListClusterServiceConfigResponse.RequestId"));

		List<Config> configs = new ArrayList<Config>();
		for (int i = 0; i < context.lengthValue("ListClusterServiceConfigResponse.Configs.Length"); i++) {
			Config config = new Config();
			config.setServiceName(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].ServiceName"));
			config.setConfigVersion(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].ConfigVersion"));
			config.setApplied(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].Applied"));
			config.setCreateTime(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].CreateTime"));
			config.setAuthor(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].Author"));
			config.setComment(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].Comment"));

			List<ConfigValue> configValueList = new ArrayList<ConfigValue>();
			for (int j = 0; j < context.lengthValue("ListClusterServiceConfigResponse.Configs["+ i +"].ConfigValueList.Length"); j++) {
				ConfigValue configValue = new ConfigValue();
				configValue.setConfigName(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].ConfigValueList["+ j +"].ConfigName"));
				configValue.setAllowCustom(context.booleanValue("ListClusterServiceConfigResponse.Configs["+ i +"].ConfigValueList["+ j +"].AllowCustom"));

				List<ConfigItemValue> configItemValueList = new ArrayList<ConfigItemValue>();
				for (int k = 0; k < context.lengthValue("ListClusterServiceConfigResponse.Configs["+ i +"].ConfigValueList["+ j +"].ConfigItemValueList.Length"); k++) {
					ConfigItemValue configItemValue = new ConfigItemValue();
					configItemValue.setItemName(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].ConfigValueList["+ j +"].ConfigItemValueList["+ k +"].ItemName"));
					configItemValue.setValue(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].ConfigValueList["+ j +"].ConfigItemValueList["+ k +"].Value"));
					configItemValue.setIsCustom(context.booleanValue("ListClusterServiceConfigResponse.Configs["+ i +"].ConfigValueList["+ j +"].ConfigItemValueList["+ k +"].IsCustom"));
					configItemValue.setDescription(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].ConfigValueList["+ j +"].ConfigItemValueList["+ k +"].Description"));

					configItemValueList.add(configItemValue);
				}
				configValue.setConfigItemValueList(configItemValueList);

				configValueList.add(configValue);
			}
			config.setConfigValueList(configValueList);

			List<PropertyInfo> propertyInfoList = new ArrayList<PropertyInfo>();
			for (int j = 0; j < context.lengthValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList.Length"); j++) {
				PropertyInfo propertyInfo = new PropertyInfo();
				propertyInfo.setName(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].Name"));
				propertyInfo.setValue(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].Value"));
				propertyInfo.setDescription(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].Description"));
				propertyInfo.setFileName(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].FileName"));
				propertyInfo.setDisplayName(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].DisplayName"));
				propertyInfo.setServiceName(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].ServiceName"));
				propertyInfo.setComponent(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].Component"));

				List<String> propertyTypes = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].PropertyTypes.Length"); k++) {
					propertyTypes.add(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].PropertyTypes["+ k +"]"));
				}
				propertyInfo.setPropertyTypes(propertyTypes);

				PropertyValueAttributes propertyValueAttributes = new PropertyValueAttributes();
				propertyValueAttributes.setType(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].PropertyValueAttributes.Type"));
				propertyValueAttributes.setMaximum(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].PropertyValueAttributes.Maximum"));
				propertyValueAttributes.setMimimum(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].PropertyValueAttributes.Mimimum"));
				propertyValueAttributes.setUnit(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].PropertyValueAttributes.Unit"));
				propertyValueAttributes.setReadOnly(context.booleanValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].PropertyValueAttributes.ReadOnly"));
				propertyValueAttributes.setHidden(context.booleanValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].PropertyValueAttributes.Hidden"));
				propertyValueAttributes.setIncrememtStep(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].PropertyValueAttributes.IncrememtStep"));

				List<ValueEntryInfo> entries = new ArrayList<ValueEntryInfo>();
				for (int k = 0; k < context.lengthValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].PropertyValueAttributes.Entries.Length"); k++) {
					ValueEntryInfo valueEntryInfo = new ValueEntryInfo();
					valueEntryInfo.setValue(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].PropertyValueAttributes.Entries["+ k +"].Value"));
					valueEntryInfo.setLabel(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].PropertyValueAttributes.Entries["+ k +"].Label"));
					valueEntryInfo.setDescription(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].PropertyValueAttributes.Entries["+ k +"].Description"));

					entries.add(valueEntryInfo);
				}
				propertyValueAttributes.setEntries(entries);
				propertyInfo.setPropertyValueAttributes(propertyValueAttributes);

				EffectWay effectWay = new EffectWay();
				effectWay.setEffectType(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].EffectWay.EffectType"));
				effectWay.setInvokeServiceName(context.stringValue("ListClusterServiceConfigResponse.Configs["+ i +"].PropertyInfoList["+ j +"].EffectWay.InvokeServiceName"));
				propertyInfo.setEffectWay(effectWay);

				propertyInfoList.add(propertyInfo);
			}
			config.setPropertyInfoList(propertyInfoList);

			configs.add(config);
		}
		listClusterServiceConfigResponse.setConfigs(configs);
	 
	 	return listClusterServiceConfigResponse;
	}
}