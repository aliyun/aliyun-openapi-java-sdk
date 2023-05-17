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

package com.aliyuncs.cs.transform.v20151215;

import com.aliyuncs.cs.model.v20151215.DescribeClusterAddonInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterAddonInstanceResponseUnmarshaller {

	public static DescribeClusterAddonInstanceResponse unmarshall(DescribeClusterAddonInstanceResponse describeClusterAddonInstanceResponse, UnmarshallerContext _ctx) {
		
		describeClusterAddonInstanceResponse.setName(_ctx.stringValue("DescribeClusterAddonInstanceResponse.name"));
		describeClusterAddonInstanceResponse.setVersion(_ctx.stringValue("DescribeClusterAddonInstanceResponse.version"));
		describeClusterAddonInstanceResponse.setState(_ctx.stringValue("DescribeClusterAddonInstanceResponse.state"));
		describeClusterAddonInstanceResponse.setConfig(_ctx.stringValue("DescribeClusterAddonInstanceResponse.config"));
	 
	 	return describeClusterAddonInstanceResponse;
	}
}