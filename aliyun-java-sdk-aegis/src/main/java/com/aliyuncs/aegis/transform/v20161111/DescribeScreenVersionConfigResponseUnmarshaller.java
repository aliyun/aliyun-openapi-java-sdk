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

package com.aliyuncs.aegis.transform.v20161111;

import com.aliyuncs.aegis.model.v20161111.DescribeScreenVersionConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScreenVersionConfigResponseUnmarshaller {

	public static DescribeScreenVersionConfigResponse unmarshall(DescribeScreenVersionConfigResponse describeScreenVersionConfigResponse, UnmarshallerContext context) {
		
		describeScreenVersionConfigResponse.setRequestId(context.stringValue("DescribeScreenVersionConfigResponse.RequestId"));
		describeScreenVersionConfigResponse.setAssetLevel(context.integerValue("DescribeScreenVersionConfigResponse.AssetLevel"));
		describeScreenVersionConfigResponse.setAvdsFlag(context.integerValue("DescribeScreenVersionConfigResponse.AvdsFlag"));
		describeScreenVersionConfigResponse.setCreateTime(context.longValue("DescribeScreenVersionConfigResponse.CreateTime"));
		describeScreenVersionConfigResponse.setFlag(context.integerValue("DescribeScreenVersionConfigResponse.Flag"));
		describeScreenVersionConfigResponse.setInstanceId(context.stringValue("DescribeScreenVersionConfigResponse.InstanceId"));
		describeScreenVersionConfigResponse.setIsSasOpening(context.booleanValue("DescribeScreenVersionConfigResponse.IsSasOpening"));
		describeScreenVersionConfigResponse.setIsTrialVersion(context.integerValue("DescribeScreenVersionConfigResponse.IsTrialVersion"));
		describeScreenVersionConfigResponse.setLogCapacity(context.integerValue("DescribeScreenVersionConfigResponse.LogCapacity"));
		describeScreenVersionConfigResponse.setLogTime(context.integerValue("DescribeScreenVersionConfigResponse.LogTime"));
		describeScreenVersionConfigResponse.setReleaseTime(context.longValue("DescribeScreenVersionConfigResponse.ReleaseTime"));
		describeScreenVersionConfigResponse.setSasLog(context.integerValue("DescribeScreenVersionConfigResponse.SasLog"));
		describeScreenVersionConfigResponse.setSasScreen(context.integerValue("DescribeScreenVersionConfigResponse.SasScreen"));
		describeScreenVersionConfigResponse.setVersion(context.integerValue("DescribeScreenVersionConfigResponse.Version"));
	 
	 	return describeScreenVersionConfigResponse;
	}
}