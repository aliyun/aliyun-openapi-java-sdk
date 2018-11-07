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

import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigTagResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigTagResponse.ConfigTag;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceConfigTagResponse.ConfigTag.Value;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterServiceConfigTagResponseUnmarshaller {

	public static DescribeClusterServiceConfigTagResponse unmarshall(DescribeClusterServiceConfigTagResponse describeClusterServiceConfigTagResponse, UnmarshallerContext context) {
		
		describeClusterServiceConfigTagResponse.setRequestId(context.stringValue("DescribeClusterServiceConfigTagResponse.RequestId"));

		List<ConfigTag> configTagList = new ArrayList<ConfigTag>();
		for (int i = 0; i < context.lengthValue("DescribeClusterServiceConfigTagResponse.ConfigTagList.Length"); i++) {
			ConfigTag configTag = new ConfigTag();
			configTag.setTag(context.stringValue("DescribeClusterServiceConfigTagResponse.ConfigTagList["+ i +"].Tag"));
			configTag.setTagDesc(context.stringValue("DescribeClusterServiceConfigTagResponse.ConfigTagList["+ i +"].TagDesc"));

			List<Value> valueList = new ArrayList<Value>();
			for (int j = 0; j < context.lengthValue("DescribeClusterServiceConfigTagResponse.ConfigTagList["+ i +"].ValueList.Length"); j++) {
				Value value = new Value();
				value.setValue(context.stringValue("DescribeClusterServiceConfigTagResponse.ConfigTagList["+ i +"].ValueList["+ j +"].Value"));
				value.setValueDesc(context.stringValue("DescribeClusterServiceConfigTagResponse.ConfigTagList["+ i +"].ValueList["+ j +"].ValueDesc"));

				valueList.add(value);
			}
			configTag.setValueList(valueList);

			configTagList.add(configTag);
		}
		describeClusterServiceConfigTagResponse.setConfigTagList(configTagList);
	 
	 	return describeClusterServiceConfigTagResponse;
	}
}