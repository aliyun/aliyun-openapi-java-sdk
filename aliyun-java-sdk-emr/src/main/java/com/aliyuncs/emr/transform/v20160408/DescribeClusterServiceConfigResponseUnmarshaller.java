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

	public static DescribeClusterServiceConfigResponse unmarshall(DescribeClusterServiceConfigResponse describeClusterServiceConfigResponse, UnmarshallerContext _ctx) {
		
		describeClusterServiceConfigResponse.setRequestId(_ctx.stringValue("DescribeClusterServiceConfigResponse.RequestId"));

		Config config = new Config();
		config.setServiceName(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.ServiceName"));
		config.setConfigVersion(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.ConfigVersion"));
		config.setApplied(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.Applied"));
		config.setCreateTime(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.CreateTime"));
		config.setAuthor(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.Author"));
		config.setComment(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.Comment"));

		List<ConfigValue> configValueList = new ArrayList<ConfigValue>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList.Length"); i++) {
			ConfigValue configValue = new ConfigValue();
			configValue.setConfigName(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList["+ i +"].ConfigName"));
			configValue.setAllowCustom(_ctx.booleanValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList["+ i +"].AllowCustom"));

			List<ConfigItemValue> configItemValueList = new ArrayList<ConfigItemValue>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList["+ i +"].ConfigItemValueList.Length"); j++) {
				ConfigItemValue configItemValue = new ConfigItemValue();
				configItemValue.setItemName(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList["+ i +"].ConfigItemValueList["+ j +"].ItemName"));
				configItemValue.setValue(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList["+ i +"].ConfigItemValueList["+ j +"].Value"));
				configItemValue.setIsCustom(_ctx.booleanValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList["+ i +"].ConfigItemValueList["+ j +"].IsCustom"));
				configItemValue.setDescription(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.ConfigValueList["+ i +"].ConfigItemValueList["+ j +"].Description"));

				configItemValueList.add(configItemValue);
			}
			configValue.setConfigItemValueList(configItemValueList);

			configValueList.add(configValue);
		}
		config.setConfigValueList(configValueList);

		List<PropertyInfo> propertyInfoList = new ArrayList<PropertyInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList.Length"); i++) {
			PropertyInfo propertyInfo = new PropertyInfo();
			propertyInfo.setName(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].Name"));
			propertyInfo.setValue(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].Value"));
			propertyInfo.setDescription(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].Description"));
			propertyInfo.setFileName(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].FileName"));
			propertyInfo.setDisplayName(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].DisplayName"));
			propertyInfo.setServiceName(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].ServiceName"));
			propertyInfo.setComponent(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].Component"));

			List<String> propertyTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyTypes.Length"); j++) {
				propertyTypes.add(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyTypes["+ j +"]"));
			}
			propertyInfo.setPropertyTypes(propertyTypes);

			PropertyValueAttributes propertyValueAttributes = new PropertyValueAttributes();
			propertyValueAttributes.setType(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Type"));
			propertyValueAttributes.setMaximum(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Maximum"));
			propertyValueAttributes.setMimimum(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Mimimum"));
			propertyValueAttributes.setUnit(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Unit"));
			propertyValueAttributes.setReadOnly(_ctx.booleanValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.ReadOnly"));
			propertyValueAttributes.setHidden(_ctx.booleanValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Hidden"));
			propertyValueAttributes.setIncrememtStep(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.IncrememtStep"));

			List<ValueEntryInfo> entries = new ArrayList<ValueEntryInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Entries.Length"); j++) {
				ValueEntryInfo valueEntryInfo = new ValueEntryInfo();
				valueEntryInfo.setValue(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Entries["+ j +"].Value"));
				valueEntryInfo.setLabel(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Entries["+ j +"].Label"));
				valueEntryInfo.setDescription(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].PropertyValueAttributes.Entries["+ j +"].Description"));

				entries.add(valueEntryInfo);
			}
			propertyValueAttributes.setEntries(entries);
			propertyInfo.setPropertyValueAttributes(propertyValueAttributes);

			EffectWay effectWay = new EffectWay();
			effectWay.setEffectType(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].EffectWay.EffectType"));
			effectWay.setInvokeServiceName(_ctx.stringValue("DescribeClusterServiceConfigResponse.Config.PropertyInfoList["+ i +"].EffectWay.InvokeServiceName"));
			propertyInfo.setEffectWay(effectWay);

			propertyInfoList.add(propertyInfo);
		}
		config.setPropertyInfoList(propertyInfoList);
		describeClusterServiceConfigResponse.setConfig(config);
	 
	 	return describeClusterServiceConfigResponse;
	}
}