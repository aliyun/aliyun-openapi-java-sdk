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

package com.aliyuncs.afs.transform.v20180112;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.afs.model.v20180112.DescribeConfigNameResponse;
import com.aliyuncs.afs.model.v20180112.DescribeConfigNameResponse.ConfigName;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigNameResponseUnmarshaller {

	public static DescribeConfigNameResponse unmarshall(DescribeConfigNameResponse describeConfigNameResponse, UnmarshallerContext context) {
		
		describeConfigNameResponse.setRequestId(context.stringValue("DescribeConfigNameResponse.RequestId"));
		describeConfigNameResponse.setHasConfig(context.booleanValue("DescribeConfigNameResponse.HasConfig"));
		describeConfigNameResponse.setBizCode(context.stringValue("DescribeConfigNameResponse.BizCode"));

		List<ConfigName> configNames = new ArrayList<ConfigName>();
		for (int i = 0; i < context.lengthValue("DescribeConfigNameResponse.ConfigNames.Length"); i++) {
			ConfigName configName = new ConfigName();
			configName.setAliUid(context.stringValue("DescribeConfigNameResponse.ConfigNames["+ i +"].AliUid"));
			configName.setConfigName(context.stringValue("DescribeConfigNameResponse.ConfigNames["+ i +"].ConfigName"));
			configName.setRefExtId(context.stringValue("DescribeConfigNameResponse.ConfigNames["+ i +"].RefExtId"));

			configNames.add(configName);
		}
		describeConfigNameResponse.setConfigNames(configNames);
	 
	 	return describeConfigNameResponse;
	}
}