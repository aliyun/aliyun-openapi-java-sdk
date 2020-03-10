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

package com.aliyuncs.acms_open.transform.v20200206;

import com.aliyuncs.acms_open.model.v20200206.DescribeConfigurationResponse;
import com.aliyuncs.acms_open.model.v20200206.DescribeConfigurationResponse.Configuration;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigurationResponseUnmarshaller {

	public static DescribeConfigurationResponse unmarshall(DescribeConfigurationResponse describeConfigurationResponse, UnmarshallerContext _ctx) {
		
		describeConfigurationResponse.setRequestId(_ctx.stringValue("DescribeConfigurationResponse.RequestId"));
		describeConfigurationResponse.setMessage(_ctx.stringValue("DescribeConfigurationResponse.Message"));
		describeConfigurationResponse.setCode(_ctx.stringValue("DescribeConfigurationResponse.Code"));

		Configuration configuration = new Configuration();
		configuration.setDataId(_ctx.stringValue("DescribeConfigurationResponse.Configuration.DataId"));
		configuration.setGroup(_ctx.stringValue("DescribeConfigurationResponse.Configuration.Group"));
		configuration.setContent(_ctx.stringValue("DescribeConfigurationResponse.Configuration.Content"));
		configuration.setMd5(_ctx.stringValue("DescribeConfigurationResponse.Configuration.Md5"));
		configuration.setAppName(_ctx.stringValue("DescribeConfigurationResponse.Configuration.AppName"));
		configuration.setDesc(_ctx.stringValue("DescribeConfigurationResponse.Configuration.Desc"));
		configuration.setTags(_ctx.stringValue("DescribeConfigurationResponse.Configuration.Tags"));
		describeConfigurationResponse.setConfiguration(configuration);
	 
	 	return describeConfigurationResponse;
	}
}