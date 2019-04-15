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

import com.aliyuncs.aegis.model.v20161111.DescribeVersionConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVersionConfigResponseUnmarshaller {

	public static DescribeVersionConfigResponse unmarshall(DescribeVersionConfigResponse describeVersionConfigResponse, UnmarshallerContext context) {
		
		describeVersionConfigResponse.setRequestId(context.stringValue("DescribeVersionConfigResponse.RequestId"));
		describeVersionConfigResponse.setAssetLevel(context.integerValue("DescribeVersionConfigResponse.AssetLevel"));
		describeVersionConfigResponse.setAvdsFlag(context.integerValue("DescribeVersionConfigResponse.AvdsFlag"));
		describeVersionConfigResponse.setCreateTime(context.longValue("DescribeVersionConfigResponse.CreateTime"));
		describeVersionConfigResponse.setFlag(context.integerValue("DescribeVersionConfigResponse.Flag"));
		describeVersionConfigResponse.setInstanceId(context.stringValue("DescribeVersionConfigResponse.InstanceId"));
		describeVersionConfigResponse.setIsSasOpening(context.booleanValue("DescribeVersionConfigResponse.IsSasOpening"));
		describeVersionConfigResponse.setIsTrialVersion(context.integerValue("DescribeVersionConfigResponse.IsTrialVersion"));
		describeVersionConfigResponse.setLogCapacity(context.integerValue("DescribeVersionConfigResponse.LogCapacity"));
		describeVersionConfigResponse.setLogTime(context.integerValue("DescribeVersionConfigResponse.LogTime"));
		describeVersionConfigResponse.setReleaseTime(context.longValue("DescribeVersionConfigResponse.ReleaseTime"));
		describeVersionConfigResponse.setSasLog(context.integerValue("DescribeVersionConfigResponse.SasLog"));
		describeVersionConfigResponse.setSasScreen(context.integerValue("DescribeVersionConfigResponse.SasScreen"));
		describeVersionConfigResponse.setVersion(context.integerValue("DescribeVersionConfigResponse.Version"));
		describeVersionConfigResponse.setUserDefinedAlarms(context.integerValue("DescribeVersionConfigResponse.UserDefinedAlarms"));
		describeVersionConfigResponse.setWebLock(context.integerValue("DescribeVersionConfigResponse.WebLock"));
		describeVersionConfigResponse.setWebLockAuthCount(context.longValue("DescribeVersionConfigResponse.WebLockAuthCount"));
		describeVersionConfigResponse.setAppWhiteListAuthCount(context.longValue("DescribeVersionConfigResponse.AppWhiteListAuthCount"));
		describeVersionConfigResponse.setAppWhiteList(context.integerValue("DescribeVersionConfigResponse.AppWhiteList"));
		describeVersionConfigResponse.setSlsCapacity(context.longValue("DescribeVersionConfigResponse.SlsCapacity"));
	 
	 	return describeVersionConfigResponse;
	}
}