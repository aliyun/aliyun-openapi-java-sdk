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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeUserCustomLogConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserCustomLogConfigResponseUnmarshaller {

	public static DescribeUserCustomLogConfigResponse unmarshall(DescribeUserCustomLogConfigResponse describeUserCustomLogConfigResponse, UnmarshallerContext context) {
		
		describeUserCustomLogConfigResponse.setRequestId(context.stringValue("DescribeUserCustomLogConfigResponse.RequestId"));

		List<String> configIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeUserCustomLogConfigResponse.ConfigIds.Length"); i++) {
			configIds.add(context.stringValue("DescribeUserCustomLogConfigResponse.ConfigIds["+ i +"]"));
		}
		describeUserCustomLogConfigResponse.setConfigIds(configIds);
	 
	 	return describeUserCustomLogConfigResponse;
	}
}