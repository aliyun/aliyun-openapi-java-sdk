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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.DescribeExtensionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExtensionResponseUnmarshaller {

	public static DescribeExtensionResponse unmarshall(DescribeExtensionResponse describeExtensionResponse, UnmarshallerContext _ctx) {
		
		describeExtensionResponse.setRequestId(_ctx.stringValue("DescribeExtensionResponse.RequestId"));
		describeExtensionResponse.setStatus(_ctx.stringValue("DescribeExtensionResponse.Status"));
		describeExtensionResponse.setExtensionName(_ctx.stringValue("DescribeExtensionResponse.ExtensionName"));
		describeExtensionResponse.setIsLatestVersion(_ctx.booleanValue("DescribeExtensionResponse.IsLatestVersion"));
		describeExtensionResponse.setDescription(_ctx.stringValue("DescribeExtensionResponse.Description"));
		describeExtensionResponse.setIsInstallNeedRestart(_ctx.booleanValue("DescribeExtensionResponse.IsInstallNeedRestart"));
		describeExtensionResponse.setLatestVersion(_ctx.stringValue("DescribeExtensionResponse.LatestVersion"));
		describeExtensionResponse.setCurrentVersion(_ctx.stringValue("DescribeExtensionResponse.CurrentVersion"));
		describeExtensionResponse.setExtensionId(_ctx.stringValue("DescribeExtensionResponse.ExtensionId"));
	 
	 	return describeExtensionResponse;
	}
}