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

import com.aliyuncs.resourcecenter.model.v20221201.GetDeliveryChannelResponse;
import com.aliyuncs.resourcecenter.model.v20221201.GetDeliveryChannelResponse.DeliveryChannelFilter;
import com.aliyuncs.resourcecenter.model.v20221201.GetDeliveryChannelResponse.ResourceChangeDelivery;
import com.aliyuncs.resourcecenter.model.v20221201.GetDeliveryChannelResponse.ResourceChangeDelivery.SlsProperties;
import com.aliyuncs.resourcecenter.model.v20221201.GetDeliveryChannelResponse.ResourceSnapshotDelivery;
import com.aliyuncs.resourcecenter.model.v20221201.GetDeliveryChannelResponse.ResourceSnapshotDelivery.SlsProperties1;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeliveryChannelResponseUnmarshaller {

	public static GetDeliveryChannelResponse unmarshall(GetDeliveryChannelResponse getDeliveryChannelResponse, UnmarshallerContext _ctx) {
		
		getDeliveryChannelResponse.setRequestId(_ctx.stringValue("GetDeliveryChannelResponse.RequestId"));
		getDeliveryChannelResponse.setDeliveryChannelDescription(_ctx.stringValue("GetDeliveryChannelResponse.DeliveryChannelDescription"));
		getDeliveryChannelResponse.setDeliveryChannelId(_ctx.stringValue("GetDeliveryChannelResponse.DeliveryChannelId"));
		getDeliveryChannelResponse.setDeliveryChannelName(_ctx.stringValue("GetDeliveryChannelResponse.DeliveryChannelName"));

		DeliveryChannelFilter deliveryChannelFilter = new DeliveryChannelFilter();

		List<String> resourceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDeliveryChannelResponse.DeliveryChannelFilter.ResourceTypes.Length"); i++) {
			resourceTypes.add(_ctx.stringValue("GetDeliveryChannelResponse.DeliveryChannelFilter.ResourceTypes["+ i +"]"));
		}
		deliveryChannelFilter.setResourceTypes(resourceTypes);
		getDeliveryChannelResponse.setDeliveryChannelFilter(deliveryChannelFilter);

		ResourceChangeDelivery resourceChangeDelivery = new ResourceChangeDelivery();
		resourceChangeDelivery.setTargetArn(_ctx.stringValue("GetDeliveryChannelResponse.ResourceChangeDelivery.TargetArn"));
		resourceChangeDelivery.setTargetType(_ctx.stringValue("GetDeliveryChannelResponse.ResourceChangeDelivery.TargetType"));

		SlsProperties slsProperties = new SlsProperties();
		slsProperties.setOversizedDataOssTargetArn(_ctx.stringValue("GetDeliveryChannelResponse.ResourceChangeDelivery.SlsProperties.OversizedDataOssTargetArn"));
		resourceChangeDelivery.setSlsProperties(slsProperties);
		getDeliveryChannelResponse.setResourceChangeDelivery(resourceChangeDelivery);

		ResourceSnapshotDelivery resourceSnapshotDelivery = new ResourceSnapshotDelivery();
		resourceSnapshotDelivery.setDeliveryTime(_ctx.stringValue("GetDeliveryChannelResponse.ResourceSnapshotDelivery.DeliveryTime"));
		resourceSnapshotDelivery.setTargetArn(_ctx.stringValue("GetDeliveryChannelResponse.ResourceSnapshotDelivery.TargetArn"));
		resourceSnapshotDelivery.setTargetType(_ctx.stringValue("GetDeliveryChannelResponse.ResourceSnapshotDelivery.TargetType"));
		resourceSnapshotDelivery.setCustomExpression(_ctx.stringValue("GetDeliveryChannelResponse.ResourceSnapshotDelivery.CustomExpression"));

		SlsProperties1 slsProperties1 = new SlsProperties1();
		slsProperties1.setOversizedDataOssTargetArn(_ctx.stringValue("GetDeliveryChannelResponse.ResourceSnapshotDelivery.SlsProperties.OversizedDataOssTargetArn"));
		resourceSnapshotDelivery.setSlsProperties1(slsProperties1);
		getDeliveryChannelResponse.setResourceSnapshotDelivery(resourceSnapshotDelivery);
	 
	 	return getDeliveryChannelResponse;
	}
}