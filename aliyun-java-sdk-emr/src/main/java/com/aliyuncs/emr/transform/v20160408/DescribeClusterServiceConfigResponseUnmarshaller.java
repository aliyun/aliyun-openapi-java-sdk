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

import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigResponse.Config;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigResponse.Config.ConfigValue;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigResponse.Config.ConfigValue.ConfigItemValue;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigResponse.Config.PropertyInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigResponse.Config.PropertyInfo.EffectWay;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigResponse.Config.PropertyInfo.PropertyValueAttributes;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigResponse.Config.PropertyInfo.PropertyValueAttributes.ValueEntryInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterServiceConfigResponseUnmarshaller {

	public static DescribeClusterServiceConfigResponse unmarshall(DescribeClusterServiceConfigResponse describeClusterServiceConfigResponse, UnmarshallerContext context) {
		
		describeClusterServiceConfigResponse.setRequestId(context.stringValue("DescribeClusterServiceConfigResponse.RequestId"));

		Config config = new Config();
		config.setServiceName(context.stringValue("DescribeClusterServiceConfigResponse.Config.ServiceName"));
		config.setConfigVersion(context.stringValue("DescribeClusterServiceConfigResponse.Config.ConfigVersion"));
		config.setApplied(context.stringValue("DescribeClusterServiceConfigResponse.Config.Applied"));
		config.setCreateTime(context.stringValue("DescribeClusterServiceConfigResponse.Config.CreateTime"));
		config.setAuthor(context.stringValue("DescribeClusterServiceConfigResponse.Config.Author"));
		config.setComment(context.stringValue("DescribeClusterServiceConfigResponse.Config.Comment"));

		List<ConfigValue> configValueList = new ArrayList<ConfigValue>();
		for (int i = 0; i < context.lengthValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList.Length"); i++) {
			ConfigValue configValue = new ConfigValue();
			configValue.setConfigName(context.stringValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList["+ i +"].ConfigName"));
			configValue.setAllowCustom(context.booleanValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList["+ i +"].AllowCustom"));

			List<ConfigItemValue> configItemValueList = new ArrayList<ConfigItemValue>();
			for (int j = 0; j < context.lengthValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList["+ i +"].ConfigItemValueList.Length"); j++) {
				ConfigItemValue configItemValue = new ConfigItemValue();
				configItemValue.setItemName(context.stringValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList["+ i +"].ConfigItemValueList["+ j +"].ItemName"));
				configItemValue.setValue(context.stringValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList["+ i +"].ConfigItemValueList["+ j +"].Value"));
				configItemValue.setIsCustom(context.booleanValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList["+ i +"].ConfigItemValueList["+ j +"].IsCustom"));
				configItemValue.setDescription(context.stringValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList["+ i +"].ConfigItemValueList["+ j +"].Description"));

				configItemValueList.add(configItemValue);
			}
			configValue.setConfigItemValueList(configItemValueList);

			configValueList.add(configValue);
		}
		config.setConfigValueList(configValueList);

		List<PropertyInfo> propertyInfoList = new ArrayList<PropertyInfo>();
		for (int i = 0; i < context.lengthValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList.Length"); i++) {
			PropertyInfo propertyInfo = new PropertyInfo();
			propertyInfo.setName(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].Name"));
			propertyInfo.setValue(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].Value"));
			propertyInfo.setDescription(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].Description"));
			propertyInfo.setFileName(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].FileName"));
			propertyInfo.setDisplayName(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].DisplayName"));
			propertyInfo.setServiceName(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].ServiceName"));
			propertyInfo.setComponent(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].Component"));

			List<String> propertyTypes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyTypes.Length"); j++) {
				propertyTypes.add(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyTypes["+ j +"]"));
			}
			propertyInfo.setPropertyTypes(propertyTypes);

			PropertyValueAttributes propertyValueAttributes = new PropertyValueAttributes();
			propertyValueAttributes.setType(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Type"));
			propertyValueAttributes.setMaximum(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Maximum"));
			propertyValueAttributes.setMimimum(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Mimimum"));
			propertyValueAttributes.setUnit(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Unit"));
			propertyValueAttributes.setReadOnly(context.booleanValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.ReadOnly"));
			propertyValueAttributes.setHidden(context.booleanValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Hidden"));
			propertyValueAttributes.setIncrememtStep(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.IncrememtStep"));

			List<ValueEntryInfo> entries = new ArrayList<ValueEntryInfo>();
			for (int j = 0; j < context.lengthValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Entries.Length"); j++) {
				ValueEntryInfo valueEntryInfo = new ValueEntryInfo();
				valueEntryInfo.setValue(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Entries["+ j +"].Value"));
				valueEntryInfo.setLabel(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Entries["+ j +"].Label"));
				valueEntryInfo.setDescription(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Entries["+ j +"].Description"));

				entries.add(valueEntryInfo);
			}
			propertyValueAttributes.setEntries(entries);
			propertyInfo.setPropertyValueAttributes(propertyValueAttributes);

			EffectWay effectWay = new EffectWay();
			effectWay.setEffectType(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].EffectWay.EffectType"));
			effectWay.setInvokeServiceName(context.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].EffectWay.InvokeServiceName"));
			propertyInfo.setEffectWay(effectWay);

			propertyInfoList.add(propertyInfo);
		}
		config.setPropertyInfoList(propertyInfoList);
		describeClusterServiceConfigResponse.setConfig(config);
	 
	 	return describeClusterServiceConfigResponse;
	}
}