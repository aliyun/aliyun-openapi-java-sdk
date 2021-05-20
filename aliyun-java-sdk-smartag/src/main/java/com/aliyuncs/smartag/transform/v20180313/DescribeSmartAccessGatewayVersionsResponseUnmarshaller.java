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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeSmartAccessGatewayVersionsResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSmartAccessGatewayVersionsResponse.SmartAGVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSmartAccessGatewayVersionsResponseUnmarshaller {

	public static DescribeSmartAccessGatewayVersionsResponse unmarshall(DescribeSmartAccessGatewayVersionsResponse describeSmartAccessGatewayVersionsResponse, UnmarshallerContext _ctx) {
		
		describeSmartAccessGatewayVersionsResponse.setRequestId(_ctx.stringValue("DescribeSmartAccessGatewayVersionsResponse.RequestId"));

		List<SmartAGVersion> smartAGVersions = new ArrayList<SmartAGVersion>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSmartAccessGatewayVersionsResponse.SmartAGVersions.Length"); i++) {
			SmartAGVersion smartAGVersion = new SmartAGVersion();
			smartAGVersion.setVersionCode(_ctx.stringValue("DescribeSmartAccessGatewayVersionsResponse.SmartAGVersions["+ i +"].VersionCode"));
			smartAGVersion.setType(_ctx.stringValue("DescribeSmartAccessGatewayVersionsResponse.SmartAGVersions["+ i +"].Type"));
			smartAGVersion.setCreateTime(_ctx.longValue("DescribeSmartAccessGatewayVersionsResponse.SmartAGVersions["+ i +"].CreateTime"));
			smartAGVersion.setVersionName(_ctx.stringValue("DescribeSmartAccessGatewayVersionsResponse.SmartAGVersions["+ i +"].VersionName"));

			smartAGVersions.add(smartAGVersion);
		}
		describeSmartAccessGatewayVersionsResponse.setSmartAGVersions(smartAGVersions);
	 
	 	return describeSmartAccessGatewayVersionsResponse;
	}
}