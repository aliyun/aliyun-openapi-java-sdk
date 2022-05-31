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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribeStoreConfigResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeStoreConfigResponse.StoreConfigInfo;
import com.aliyuncs.cloudesl.model.v20200201.DescribeStoreConfigResponse.StoreConfigInfo.SubscribeContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStoreConfigResponseUnmarshaller {

	public static DescribeStoreConfigResponse unmarshall(DescribeStoreConfigResponse describeStoreConfigResponse, UnmarshallerContext _ctx) {
		
		describeStoreConfigResponse.setRequestId(_ctx.stringValue("DescribeStoreConfigResponse.RequestId"));
		describeStoreConfigResponse.setErrorMessage(_ctx.stringValue("DescribeStoreConfigResponse.ErrorMessage"));
		describeStoreConfigResponse.setSuccess(_ctx.booleanValue("DescribeStoreConfigResponse.Success"));
		describeStoreConfigResponse.setErrorCode(_ctx.stringValue("DescribeStoreConfigResponse.ErrorCode"));
		describeStoreConfigResponse.setCode(_ctx.stringValue("DescribeStoreConfigResponse.Code"));
		describeStoreConfigResponse.setMessage(_ctx.stringValue("DescribeStoreConfigResponse.Message"));
		describeStoreConfigResponse.setDynamicMessage(_ctx.stringValue("DescribeStoreConfigResponse.DynamicMessage"));
		describeStoreConfigResponse.setDynamicCode(_ctx.stringValue("DescribeStoreConfigResponse.DynamicCode"));

		StoreConfigInfo storeConfigInfo = new StoreConfigInfo();
		storeConfigInfo.setStoreId(_ctx.stringValue("DescribeStoreConfigResponse.StoreConfigInfo.StoreId"));
		storeConfigInfo.setEnableNotification(_ctx.booleanValue("DescribeStoreConfigResponse.StoreConfigInfo.EnableNotification"));
		storeConfigInfo.setNotificationWebHook(_ctx.stringValue("DescribeStoreConfigResponse.StoreConfigInfo.NotificationWebHook"));
		storeConfigInfo.setNotificationSilentTimes(_ctx.stringValue("DescribeStoreConfigResponse.StoreConfigInfo.NotificationSilentTimes"));

		List<SubscribeContent> subscribeContents = new ArrayList<SubscribeContent>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStoreConfigResponse.StoreConfigInfo.SubscribeContents.Length"); i++) {
			SubscribeContent subscribeContent = new SubscribeContent();
			subscribeContent.setCategory(_ctx.stringValue("DescribeStoreConfigResponse.StoreConfigInfo.SubscribeContents["+ i +"].Category"));
			subscribeContent.setEnable(_ctx.booleanValue("DescribeStoreConfigResponse.StoreConfigInfo.SubscribeContents["+ i +"].Enable"));
			subscribeContent.setThreshold(_ctx.stringValue("DescribeStoreConfigResponse.StoreConfigInfo.SubscribeContents["+ i +"].Threshold"));
			subscribeContent.setAtAll(_ctx.booleanValue("DescribeStoreConfigResponse.StoreConfigInfo.SubscribeContents["+ i +"].AtAll"));
			subscribeContent.setAtMobileList(_ctx.stringValue("DescribeStoreConfigResponse.StoreConfigInfo.SubscribeContents["+ i +"].AtMobileList"));

			subscribeContents.add(subscribeContent);
		}
		storeConfigInfo.setSubscribeContents(subscribeContents);
		describeStoreConfigResponse.setStoreConfigInfo(storeConfigInfo);
	 
	 	return describeStoreConfigResponse;
	}
}