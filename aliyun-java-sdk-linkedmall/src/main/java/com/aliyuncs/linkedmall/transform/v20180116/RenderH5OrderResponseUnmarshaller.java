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

import com.aliyuncs.linkedmall.model.v20180116.RenderH5OrderResponse;
import com.aliyuncs.linkedmall.model.v20180116.RenderH5OrderResponse.Model;
import com.aliyuncs.linkedmall.model.v20180116.RenderH5OrderResponse.Model.AddressInfo;
import com.aliyuncs.linkedmall.model.v20180116.RenderH5OrderResponse.Model.DeliveryInfo;
import com.aliyuncs.linkedmall.model.v20180116.RenderH5OrderResponse.Model.InvoiceInfo;
import com.aliyuncs.linkedmall.model.v20180116.RenderH5OrderResponse.Model.LmItemInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenderH5OrderResponseUnmarshaller {

	public static RenderH5OrderResponse unmarshall(RenderH5OrderResponse renderH5OrderResponse, UnmarshallerContext _ctx) {
		
		renderH5OrderResponse.setRequestId(_ctx.stringValue("RenderH5OrderResponse.RequestId"));
		renderH5OrderResponse.setCode(_ctx.stringValue("RenderH5OrderResponse.Code"));
		renderH5OrderResponse.setMessage(_ctx.stringValue("RenderH5OrderResponse.Message"));
		renderH5OrderResponse.setSubCode(_ctx.stringValue("RenderH5OrderResponse.SubCode"));
		renderH5OrderResponse.setSubMessage(_ctx.stringValue("RenderH5OrderResponse.SubMessage"));
		renderH5OrderResponse.setLogsId(_ctx.stringValue("RenderH5OrderResponse.LogsId"));
		renderH5OrderResponse.setSuccess(_ctx.booleanValue("RenderH5OrderResponse.Success"));
		renderH5OrderResponse.setTotalCount(_ctx.longValue("RenderH5OrderResponse.TotalCount"));

		Model model = new Model();
		model.setBuyerCurrentPoints(_ctx.longValue("RenderH5OrderResponse.Model.BuyerCurrentPoints"));
		model.setExtInfo(_ctx.mapValue("RenderH5OrderResponse.Model.ExtInfo"));

		InvoiceInfo invoiceInfo = new InvoiceInfo();
		invoiceInfo.setType(_ctx.stringValue("RenderH5OrderResponse.Model.InvoiceInfo.Type"));
		invoiceInfo.setDesc(_ctx.stringValue("RenderH5OrderResponse.Model.InvoiceInfo.Desc"));
		model.setInvoiceInfo(invoiceInfo);

		List<LmItemInfo> lmItemInfoList = new ArrayList<LmItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("RenderH5OrderResponse.Model.LmItemInfoList.Length"); i++) {
			LmItemInfo lmItemInfo = new LmItemInfo();
			lmItemInfo.setLmItemId(_ctx.stringValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].LmItemId"));
			lmItemInfo.setItemId(_ctx.longValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].ItemId"));
			lmItemInfo.setItemName(_ctx.stringValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].ItemName"));
			lmItemInfo.setSkuName(_ctx.stringValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].SkuName"));
			lmItemInfo.setSkuId(_ctx.longValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].SkuId"));
			lmItemInfo.setSellerId(_ctx.longValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].SellerId"));
			lmItemInfo.setTbShopName(_ctx.stringValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].TbShopName"));
			lmItemInfo.setSellerNick(_ctx.stringValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].SellerNick"));
			lmItemInfo.setCash(_ctx.longValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].Cash"));
			lmItemInfo.setPoints(_ctx.longValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].Points"));
			lmItemInfo.setActualPrice(_ctx.longValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].ActualPrice"));
			lmItemInfo.setQuantity(_ctx.integerValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].Quantity"));
			lmItemInfo.setItemUrl(_ctx.stringValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].ItemUrl"));
			lmItemInfo.setItemPicUrl(_ctx.stringValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].ItemPicUrl"));
			lmItemInfo.setCanSell(_ctx.booleanValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].CanSell"));
			lmItemInfo.setMessage(_ctx.stringValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].Message"));
			lmItemInfo.setVirtualItemType(_ctx.stringValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].VirtualItemType"));
			lmItemInfo.setFeatures(_ctx.mapValue("RenderH5OrderResponse.Model.LmItemInfoList["+ i +"].Features"));

			lmItemInfoList.add(lmItemInfo);
		}
		model.setLmItemInfoList(lmItemInfoList);

		List<DeliveryInfo> deliveryInfoList = new ArrayList<DeliveryInfo>();
		for (int i = 0; i < _ctx.lengthValue("RenderH5OrderResponse.Model.DeliveryInfoList.Length"); i++) {
			DeliveryInfo deliveryInfo = new DeliveryInfo();
			deliveryInfo.setId(_ctx.stringValue("RenderH5OrderResponse.Model.DeliveryInfoList["+ i +"].Id"));
			deliveryInfo.setDisplayName(_ctx.stringValue("RenderH5OrderResponse.Model.DeliveryInfoList["+ i +"].DisplayName"));
			deliveryInfo.setPostFee(_ctx.longValue("RenderH5OrderResponse.Model.DeliveryInfoList["+ i +"].PostFee"));
			deliveryInfo.setServiceType(_ctx.longValue("RenderH5OrderResponse.Model.DeliveryInfoList["+ i +"].ServiceType"));

			deliveryInfoList.add(deliveryInfo);
		}
		model.setDeliveryInfoList(deliveryInfoList);

		List<AddressInfo> addressInfoList = new ArrayList<AddressInfo>();
		for (int i = 0; i < _ctx.lengthValue("RenderH5OrderResponse.Model.AddressInfoList.Length"); i++) {
			AddressInfo addressInfo = new AddressInfo();
			addressInfo.setAddressId(_ctx.longValue("RenderH5OrderResponse.Model.AddressInfoList["+ i +"].AddressId"));
			addressInfo.setReceiver(_ctx.stringValue("RenderH5OrderResponse.Model.AddressInfoList["+ i +"].Receiver"));
			addressInfo.setReceiverPhone(_ctx.stringValue("RenderH5OrderResponse.Model.AddressInfoList["+ i +"].ReceiverPhone"));
			addressInfo.setAddressDetail(_ctx.stringValue("RenderH5OrderResponse.Model.AddressInfoList["+ i +"].AddressDetail"));
			addressInfo.setDivisionCode(_ctx.stringValue("RenderH5OrderResponse.Model.AddressInfoList["+ i +"].DivisionCode"));
			addressInfo.set_Default(_ctx.booleanValue("RenderH5OrderResponse.Model.AddressInfoList["+ i +"].Default"));

			addressInfoList.add(addressInfo);
		}
		model.setAddressInfoList(addressInfoList);
		renderH5OrderResponse.setModel(model);
	 
	 	return renderH5OrderResponse;
	}
}