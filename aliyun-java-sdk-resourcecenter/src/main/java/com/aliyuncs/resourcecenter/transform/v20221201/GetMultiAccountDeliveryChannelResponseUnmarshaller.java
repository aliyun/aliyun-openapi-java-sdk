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

package com.aliyuncs.resourcecenter.transform.v20221201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcecenter.model.v20221201.GetMultiAccountDeliveryChannelResponse;
import com.aliyuncs.resourcecenter.model.v20221201.GetMultiAccountDeliveryChannelResponse.DeliveryChannelFilter;
import com.aliyuncs.resourcecenter.model.v20221201.GetMultiAccountDeliveryChannelResponse.ResourceChangeDelivery;
import com.aliyuncs.resourcecenter.model.v20221201.GetMultiAccountDeliveryChannelResponse.ResourceChangeDelivery.SlsProperties;
import com.aliyuncs.resourcecenter.model.v20221201.GetMultiAccountDeliveryChannelResponse.ResourceSnapshotDelivery;
import com.aliyuncs.resourcecenter.model.v20221201.GetMultiAccountDeliveryChannelResponse.ResourceSnapshotDelivery.SlsProperties1;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMultiAccountDeliveryChannelResponseUnmarshaller {

	public static GetMultiAccountDeliveryChannelResponse unmarshall(GetMultiAccountDeliveryChannelResponse getMultiAccountDeliveryChannelResponse, UnmarshallerContext _ctx) {
		
		getMultiAccountDeliveryChannelResponse.setRequestId(_ctx.stringValue("GetMultiAccountDeliveryChannelResponse.RequestId"));
		getMultiAccountDeliveryChannelResponse.setDeliveryChannelDescription(_ctx.stringValue("GetMultiAccountDeliveryChannelResponse.DeliveryChannelDescription"));
		getMultiAccountDeliveryChannelResponse.setDeliveryChannelId(_ctx.stringValue("GetMultiAccountDeliveryChannelResponse.DeliveryChannelId"));
		getMultiAccountDeliveryChannelResponse.setDeliveryChannelName(_ctx.stringValue("GetMultiAccountDeliveryChannelResponse.DeliveryChannelName"));

		DeliveryChannelFilter deliveryChannelFilter = new DeliveryChannelFilter();

		List<String> accountScopes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetMultiAccountDeliveryChannelResponse.DeliveryChannelFilter.AccountScopes.Length"); i++) {
			accountScopes.add(_ctx.stringValue("GetMultiAccountDeliveryChannelResponse.DeliveryChannelFilter.AccountScopes["+ i +"]"));
		}
		deliveryChannelFilter.setAccountScopes(accountScopes);

		List<String> resourceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetMultiAccountDeliveryChannelResponse.DeliveryChannelFilter.ResourceTypes.Length"); i++) {
			resourceTypes.add(_ctx.stringValue("GetMultiAccountDeliveryChannelResponse.DeliveryChannelFilter.ResourceTypes["+ i +"]"));
		}
		deliveryChannelFilter.setResourceTypes(resourceTypes);
		getMultiAccountDeliveryChannelResponse.setDeliveryChannelFilter(deliveryChannelFilter);

		ResourceChangeDelivery resourceChangeDelivery = new ResourceChangeDelivery();
		resourceChangeDelivery.setTargetArn(_ctx.stringValue("GetMultiAccountDeliveryChannelResponse.ResourceChangeDelivery.TargetArn"));
		resourceChangeDelivery.setTargetType(_ctx.stringValue("GetMultiAccountDeliveryChannelResponse.ResourceChangeDelivery.TargetType"));

		SlsProperties slsProperties = new SlsProperties();
		slsProperties.setOversizedDataOssTargetArn(_ctx.stringValue("GetMultiAccountDeliveryChannelResponse.ResourceChangeDelivery.SlsProperties.OversizedDataOssTargetArn"));
		resourceChangeDelivery.setSlsProperties(slsProperties);
		getMultiAccountDeliveryChannelResponse.setResourceChangeDelivery(resourceChangeDelivery);

		ResourceSnapshotDelivery resourceSnapshotDelivery = new ResourceSnapshotDelivery();
		resourceSnapshotDelivery.setDeliveryTime(_ctx.stringValue("GetMultiAccountDeliveryChannelResponse.ResourceSnapshotDelivery.DeliveryTime"));
		resourceSnapshotDelivery.setTargetArn(_ctx.stringValue("GetMultiAccountDeliveryChannelResponse.ResourceSnapshotDelivery.TargetArn"));
		resourceSnapshotDelivery.setTargetType(_ctx.stringValue("GetMultiAccountDeliveryChannelResponse.ResourceSnapshotDelivery.TargetType"));
		resourceSnapshotDelivery.setCustomExpression(_ctx.stringValue("GetMultiAccountDeliveryChannelResponse.ResourceSnapshotDelivery.CustomExpression"));

		SlsProperties1 slsProperties1 = new SlsProperties1();
		slsProperties1.setOversizedDataOssTargetArn(_ctx.stringValue("GetMultiAccountDeliveryChannelResponse.ResourceSnapshotDelivery.SlsProperties.OversizedDataOssTargetArn"));
		resourceSnapshotDelivery.setSlsProperties1(slsProperties1);
		getMultiAccountDeliveryChannelResponse.setResourceSnapshotDelivery(resourceSnapshotDelivery);
	 
	 	return getMultiAccountDeliveryChannelResponse;
	}
}