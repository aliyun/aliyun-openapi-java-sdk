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

import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigTagForAdminResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigTagForAdminResponse.ConfigTag;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigTagForAdminResponse.ConfigTag.Value;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterServiceConfigTagForAdminResponseUnmarshaller {

	public static DescribeClusterServiceConfigTagForAdminResponse unmarshall(DescribeClusterServiceConfigTagForAdminResponse describeClusterServiceConfigTagForAdminResponse, UnmarshallerContext _ctx) {
		
		describeClusterServiceConfigTagForAdminResponse.setRequestId(_ctx.stringValue("DescribeClusterServiceConfigTagForAdminResponse.RequestId"));

		List<ConfigTag> configTagList = new ArrayList<ConfigTag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterServiceConfigTagForAdminResponse.ConfigTagList.Length"); i++) {
			ConfigTag configTag = new ConfigTag();
			configTag.setTag(_ctx.stringValue("DescribeClusterServiceConfigTagForAdminResponse.ConfigTagList["+ i +"].Tag"));
			configTag.setTagDesc(_ctx.stringValue("DescribeClusterServiceConfigTagForAdminResponse.ConfigTagList["+ i +"].TagDesc"));

			List<Value> valueList = new ArrayList<Value>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterServiceConfigTagForAdminResponse.ConfigTagList["+ i +"].ValueList.Length"); j++) {
				Value value = new Value();
				value.setValue(_ctx.stringValue("DescribeClusterServiceConfigTagForAdminResponse.ConfigTagList["+ i +"].ValueList["+ j +"].Value"));
				value.setValueDesc(_ctx.stringValue("DescribeClusterServiceConfigTagForAdminResponse.ConfigTagList["+ i +"].ValueList["+ j +"].ValueDesc"));

				valueList.add(value);
			}
			configTag.setValueList(valueList);

			configTagList.add(configTag);
		}
		describeClusterServiceConfigTagForAdminResponse.setConfigTagList(configTagList);
	 
	 	return describeClusterServiceConfigTagForAdminResponse;
	}
}