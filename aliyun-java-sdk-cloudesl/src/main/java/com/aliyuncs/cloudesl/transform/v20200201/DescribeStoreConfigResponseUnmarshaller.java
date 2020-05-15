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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.DescribeStoreConfigResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeStoreConfigResponse.StoreConfigInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStoreConfigResponseUnmarshaller {

	public static DescribeStoreConfigResponse unmarshall(DescribeStoreConfigResponse describeStoreConfigResponse, UnmarshallerContext _ctx) {
		
		describeStoreConfigResponse.setRequestId(_ctx.stringValue("DescribeStoreConfigResponse.RequestId"));
		describeStoreConfigResponse.setErrorMessage(_ctx.stringValue("DescribeStoreConfigResponse.ErrorMessage"));
		describeStoreConfigResponse.setErrorCode(_ctx.stringValue("DescribeStoreConfigResponse.ErrorCode"));
		describeStoreConfigResponse.setMessage(_ctx.stringValue("DescribeStoreConfigResponse.Message"));
		describeStoreConfigResponse.setDynamicCode(_ctx.stringValue("DescribeStoreConfigResponse.DynamicCode"));
		describeStoreConfigResponse.setCode(_ctx.stringValue("DescribeStoreConfigResponse.Code"));
		describeStoreConfigResponse.setDynamicMessage(_ctx.stringValue("DescribeStoreConfigResponse.DynamicMessage"));
		describeStoreConfigResponse.setSuccess(_ctx.booleanValue("DescribeStoreConfigResponse.Success"));

		StoreConfigInfo storeConfigInfo = new StoreConfigInfo();
		storeConfigInfo.setEnableNotification(_ctx.booleanValue("DescribeStoreConfigResponse.StoreConfigInfo.EnableNotification"));
		storeConfigInfo.setNotificationWebHook(_ctx.stringValue("DescribeStoreConfigResponse.StoreConfigInfo.NotificationWebHook"));
		storeConfigInfo.setNotificationSilentTimes(_ctx.stringValue("DescribeStoreConfigResponse.StoreConfigInfo.NotificationSilentTimes"));
		storeConfigInfo.setStoreId(_ctx.stringValue("DescribeStoreConfigResponse.StoreConfigInfo.StoreId"));
		describeStoreConfigResponse.setStoreConfigInfo(storeConfigInfo);
	 
	 	return describeStoreConfigResponse;
	}
}