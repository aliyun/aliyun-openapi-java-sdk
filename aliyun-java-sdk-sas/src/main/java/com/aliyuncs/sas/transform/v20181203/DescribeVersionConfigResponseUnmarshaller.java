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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeVersionConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVersionConfigResponseUnmarshaller {

	public static DescribeVersionConfigResponse unmarshall(DescribeVersionConfigResponse describeVersionConfigResponse, UnmarshallerContext _ctx) {
		
		describeVersionConfigResponse.setRequestId(_ctx.stringValue("DescribeVersionConfigResponse.RequestId"));
		describeVersionConfigResponse.setMVAuthCount(_ctx.integerValue("DescribeVersionConfigResponse.MVAuthCount"));
		describeVersionConfigResponse.setSasLog(_ctx.integerValue("DescribeVersionConfigResponse.SasLog"));
		describeVersionConfigResponse.setLogCapacity(_ctx.integerValue("DescribeVersionConfigResponse.LogCapacity"));
		describeVersionConfigResponse.setSasScreen(_ctx.integerValue("DescribeVersionConfigResponse.SasScreen"));
		describeVersionConfigResponse.setHoneypotCapacity(_ctx.longValue("DescribeVersionConfigResponse.HoneypotCapacity"));
		describeVersionConfigResponse.setCreateTime(_ctx.longValue("DescribeVersionConfigResponse.CreateTime"));
		describeVersionConfigResponse.setMVUnusedAuthCount(_ctx.integerValue("DescribeVersionConfigResponse.MVUnusedAuthCount"));
		describeVersionConfigResponse.setWebLock(_ctx.integerValue("DescribeVersionConfigResponse.WebLock"));
		describeVersionConfigResponse.setAppWhiteListAuthCount(_ctx.longValue("DescribeVersionConfigResponse.AppWhiteListAuthCount"));
		describeVersionConfigResponse.setLogTime(_ctx.integerValue("DescribeVersionConfigResponse.LogTime"));
		describeVersionConfigResponse.setFlag(_ctx.integerValue("DescribeVersionConfigResponse.Flag"));
		describeVersionConfigResponse.setLastInstanceReleaseTime(_ctx.longValue("DescribeVersionConfigResponse.LastInstanceReleaseTime"));
		describeVersionConfigResponse.setLastTrailEndTime(_ctx.longValue("DescribeVersionConfigResponse.LastTrailEndTime"));
		describeVersionConfigResponse.setVersion(_ctx.integerValue("DescribeVersionConfigResponse.Version"));
		describeVersionConfigResponse.setWebLockAuthCount(_ctx.longValue("DescribeVersionConfigResponse.WebLockAuthCount"));
		describeVersionConfigResponse.setReleaseTime(_ctx.longValue("DescribeVersionConfigResponse.ReleaseTime"));
		describeVersionConfigResponse.setHighestVersion(_ctx.integerValue("DescribeVersionConfigResponse.HighestVersion"));
		describeVersionConfigResponse.setAssetLevel(_ctx.integerValue("DescribeVersionConfigResponse.AssetLevel"));
		describeVersionConfigResponse.setAvdsFlag(_ctx.integerValue("DescribeVersionConfigResponse.AvdsFlag"));
		describeVersionConfigResponse.setIsPaidUser(_ctx.booleanValue("DescribeVersionConfigResponse.IsPaidUser"));
		describeVersionConfigResponse.setIsOverBalance(_ctx.booleanValue("DescribeVersionConfigResponse.IsOverBalance"));
		describeVersionConfigResponse.setInstanceId(_ctx.stringValue("DescribeVersionConfigResponse.InstanceId"));
		describeVersionConfigResponse.setSlsCapacity(_ctx.longValue("DescribeVersionConfigResponse.SlsCapacity"));
		describeVersionConfigResponse.setVmCores(_ctx.integerValue("DescribeVersionConfigResponse.VmCores"));
		describeVersionConfigResponse.setAllowPartialBuy(_ctx.integerValue("DescribeVersionConfigResponse.AllowPartialBuy"));
		describeVersionConfigResponse.setAppWhiteList(_ctx.integerValue("DescribeVersionConfigResponse.AppWhiteList"));
		describeVersionConfigResponse.setIsSasOpening(_ctx.booleanValue("DescribeVersionConfigResponse.IsSasOpening"));
		describeVersionConfigResponse.setGmtCreate(_ctx.longValue("DescribeVersionConfigResponse.GmtCreate"));
		describeVersionConfigResponse.setImageScanCapacity(_ctx.longValue("DescribeVersionConfigResponse.ImageScanCapacity"));
		describeVersionConfigResponse.setIsTrialVersion(_ctx.integerValue("DescribeVersionConfigResponse.IsTrialVersion"));
		describeVersionConfigResponse.setUserDefinedAlarms(_ctx.integerValue("DescribeVersionConfigResponse.UserDefinedAlarms"));
		describeVersionConfigResponse.setOpenTime(_ctx.longValue("DescribeVersionConfigResponse.OpenTime"));
		describeVersionConfigResponse.setIsNewContainerVersion(_ctx.booleanValue("DescribeVersionConfigResponse.IsNewContainerVersion"));
	 
	 	return describeVersionConfigResponse;
	}
}