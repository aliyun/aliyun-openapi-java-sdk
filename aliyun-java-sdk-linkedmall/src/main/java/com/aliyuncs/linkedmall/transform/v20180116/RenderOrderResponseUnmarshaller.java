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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.RenderOrderResponse;
import com.aliyuncs.linkedmall.model.v20180116.RenderOrderResponse.Model;
import com.aliyuncs.linkedmall.model.v20180116.RenderOrderResponse.Model.RenderOrderInfosItem;
import com.aliyuncs.linkedmall.model.v20180116.RenderOrderResponse.Model.RenderOrderInfosItem.DeliveryInfosItem;
import com.aliyuncs.linkedmall.model.v20180116.RenderOrderResponse.Model.RenderOrderInfosItem.LmItemInfosItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenderOrderResponseUnmarshaller {

	public static RenderOrderResponse unmarshall(RenderOrderResponse renderOrderResponse, UnmarshallerContext _ctx) {
		
		renderOrderResponse.setRequestId(_ctx.stringValue("RenderOrderResponse.RequestId"));
		renderOrderResponse.setCode(_ctx.stringValue("RenderOrderResponse.Code"));
		renderOrderResponse.setMessage(_ctx.stringValue("RenderOrderResponse.Message"));
		renderOrderResponse.setSubCode(_ctx.stringValue("RenderOrderResponse.SubCode"));
		renderOrderResponse.setSubMessage(_ctx.stringValue("RenderOrderResponse.SubMessage"));
		renderOrderResponse.setLogsId(_ctx.stringValue("RenderOrderResponse.LogsId"));
		renderOrderResponse.setSuccess(_ctx.booleanValue("RenderOrderResponse.Success"));
		renderOrderResponse.setTotalCount(_ctx.longValue("RenderOrderResponse.TotalCount"));

		Model model = new Model();

		List<RenderOrderInfosItem> renderOrderInfos = new ArrayList<RenderOrderInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("RenderOrderResponse.Model.RenderOrderInfos.Length"); i++) {
			RenderOrderInfosItem renderOrderInfosItem = new RenderOrderInfosItem();
			renderOrderInfosItem.setExtInfo(_ctx.mapValue("RenderOrderResponse.Model.RenderOrderInfos["+ i +"].ExtInfo"));

			List<LmItemInfosItem> lmItemInfos = new ArrayList<LmItemInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("RenderOrderResponse.Model.RenderOrderInfos["+ i +"].LmItemInfos.Length"); j++) {
				LmItemInfosItem lmItemInfosItem = new LmItemInfosItem();
				lmItemInfosItem.setItemId(_ctx.longValue("RenderOrderResponse.Model.RenderOrderInfos["+ i +"].LmItemInfos["+ j +"].ItemId"));
				lmItemInfosItem.setSkuId(_ctx.longValue("RenderOrderResponse.Model.RenderOrderInfos["+ i +"].LmItemInfos["+ j +"].SkuId"));
				lmItemInfosItem.setQuantity(_ctx.integerValue("RenderOrderResponse.Model.RenderOrderInfos["+ i +"].LmItemInfos["+ j +"].Quantity"));
				lmItemInfosItem.setCanSell(_ctx.booleanValue("RenderOrderResponse.Model.RenderOrderInfos["+ i +"].LmItemInfos["+ j +"].CanSell"));
				lmItemInfosItem.setMessage(_ctx.stringValue("RenderOrderResponse.Model.RenderOrderInfos["+ i +"].LmItemInfos["+ j +"].Message"));

				lmItemInfos.add(lmItemInfosItem);
			}
			renderOrderInfosItem.setLmItemInfos(lmItemInfos);

			List<DeliveryInfosItem> deliveryInfos = new ArrayList<DeliveryInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("RenderOrderResponse.Model.RenderOrderInfos["+ i +"].DeliveryInfos.Length"); j++) {
				DeliveryInfosItem deliveryInfosItem = new DeliveryInfosItem();
				deliveryInfosItem.setId(_ctx.stringValue("RenderOrderResponse.Model.RenderOrderInfos["+ i +"].DeliveryInfos["+ j +"].Id"));
				deliveryInfosItem.setDisplayName(_ctx.stringValue("RenderOrderResponse.Model.RenderOrderInfos["+ i +"].DeliveryInfos["+ j +"].DisplayName"));
				deliveryInfosItem.setPostFee(_ctx.longValue("RenderOrderResponse.Model.RenderOrderInfos["+ i +"].DeliveryInfos["+ j +"].PostFee"));
				deliveryInfosItem.setServiceType(_ctx.longValue("RenderOrderResponse.Model.RenderOrderInfos["+ i +"].DeliveryInfos["+ j +"].ServiceType"));

				deliveryInfos.add(deliveryInfosItem);
			}
			renderOrderInfosItem.setDeliveryInfos(deliveryInfos);

			renderOrderInfos.add(renderOrderInfosItem);
		}
		model.setRenderOrderInfos(renderOrderInfos);
		renderOrderResponse.setModel(model);
	 
	 	return renderOrderResponse;
	}
}