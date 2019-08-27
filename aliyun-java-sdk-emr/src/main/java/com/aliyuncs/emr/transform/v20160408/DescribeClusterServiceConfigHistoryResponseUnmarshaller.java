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

import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigHistoryResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigHistoryResponse.Config;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigHistoryResponse.Config.ConfigValue;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigHistoryResponse.Config.ConfigValue.ConfigItemValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterServiceConfigHistoryResponseUnmarshaller {

	public static DescribeClusterServiceConfigHistoryResponse unmarshall(DescribeClusterServiceConfigHistoryResponse describeClusterServiceConfigHistoryResponse, UnmarshallerContext _ctx) {
		
		describeClusterServiceConfigHistoryResponse.setRequestId(_ctx.stringValue("DescribeClusterServiceConfigHistoryResponse.RequestId"));

		Config config = new Config();
		config.setServiceName(_ctx.stringValue("DescribeClusterServiceConfigHistoryResponse.Config.ServiceName"));
		config.setConfigVersion(_ctx.stringValue("DescribeClusterServiceConfigHistoryResponse.Config.ConfigVersion"));
		config.setApplied(_ctx.booleanValue("DescribeClusterServiceConfigHistoryResponse.Config.Applied"));
		config.setCreateTime(_ctx.stringValue("DescribeClusterServiceConfigHistoryResponse.Config.CreateTime"));
		config.setAuthor(_ctx.stringValue("DescribeClusterServiceConfigHistoryResponse.Config.Author"));
		config.setComment(_ctx.stringValue("DescribeClusterServiceConfigHistoryResponse.Config.Comment"));

		List<ConfigValue> configValueList = new ArrayList<ConfigValue>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterServiceConfigHistoryResponse.Config.ConfigValueList.Length"); i++) {
			ConfigValue configValue = new ConfigValue();
			configValue.setConfigName(_ctx.stringValue("DescribeClusterServiceConfigHistoryResponse.Config.ConfigValueList["+ i +"].ConfigName"));

			List<ConfigItemValue> configItemValueList = new ArrayList<ConfigItemValue>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterServiceConfigHistoryResponse.Config.ConfigValueList["+ i +"].ConfigItemValueList.Length"); j++) {
				ConfigItemValue configItemValue = new ConfigItemValue();
				configItemValue.setItemName(_ctx.stringValue("DescribeClusterServiceConfigHistoryResponse.Config.ConfigValueList["+ i +"].ConfigItemValueList["+ j +"].ItemName"));
				configItemValue.setValue(_ctx.stringValue("DescribeClusterServiceConfigHistoryResponse.Config.ConfigValueList["+ i +"].ConfigItemValueList["+ j +"].Value"));
				configItemValue.setOldValue(_ctx.stringValue("DescribeClusterServiceConfigHistoryResponse.Config.ConfigValueList["+ i +"].ConfigItemValueList["+ j +"].OldValue"));
				configItemValue.setChangeType(_ctx.stringValue("DescribeClusterServiceConfigHistoryResponse.Config.ConfigValueList["+ i +"].ConfigItemValueList["+ j +"].ChangeType"));

				configItemValueList.add(configItemValue);
			}
			configValue.setConfigItemValueList(configItemValueList);

			configValueList.add(configValue);
		}
		config.setConfigValueList(configValueList);
		describeClusterServiceConfigHistoryResponse.setConfig(config);
	 
	 	return describeClusterServiceConfigHistoryResponse;
	}
}