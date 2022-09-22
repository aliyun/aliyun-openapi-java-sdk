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

package com.aliyuncs.linkcard.transform.v20210520;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkcard.model.v20210520.ListOrderResponse;
import com.aliyuncs.linkcard.model.v20210520.ListOrderResponse.Data;
import com.aliyuncs.linkcard.model.v20210520.ListOrderResponse.Data.OrderListVO;
import com.aliyuncs.linkcard.model.v20210520.ListOrderResponse.Data.OrderListVO.DeliveryInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOrderResponseUnmarshaller {

	public static ListOrderResponse unmarshall(ListOrderResponse listOrderResponse, UnmarshallerContext _ctx) {
		
		listOrderResponse.setRequestId(_ctx.stringValue("ListOrderResponse.RequestId"));
		listOrderResponse.setCode(_ctx.stringValue("ListOrderResponse.Code"));
		listOrderResponse.setErrorMessage(_ctx.stringValue("ListOrderResponse.ErrorMessage"));
		listOrderResponse.setSuccess(_ctx.booleanValue("ListOrderResponse.Success"));
		listOrderResponse.setLocalizedMessage(_ctx.stringValue("ListOrderResponse.LocalizedMessage"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("ListOrderResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListOrderResponse.Data.PageSize"));
		data.setPageCount(_ctx.integerValue("ListOrderResponse.Data.PageCount"));
		data.setTotal(_ctx.integerValue("ListOrderResponse.Data.Total"));

		List<OrderListVO> list = new ArrayList<OrderListVO>();
		for (int i = 0; i < _ctx.lengthValue("ListOrderResponse.Data.List.Length"); i++) {
			OrderListVO orderListVO = new OrderListVO();
			orderListVO.setBillingCycle(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].BillingCycle"));
			orderListVO.setBuyNum(_ctx.integerValue("ListOrderResponse.Data.List["+ i +"].BuyNum"));
			orderListVO.setPoolCapacityUnit(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].PoolCapacityUnit"));
			orderListVO.setCardPayCount(_ctx.integerValue("ListOrderResponse.Data.List["+ i +"].CardPayCount"));
			orderListVO.setCredentialPackage(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].CredentialPackage"));
			orderListVO.setVendor(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].Vendor"));
			orderListVO.setDataLevel(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].DataLevel"));
			orderListVO.setPayDuration(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].PayDuration"));
			orderListVO.setAliFee(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].AliFee"));
			orderListVO.setOrderStatus(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].OrderStatus"));
			orderListVO.setPoolNo(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].PoolNo"));
			orderListVO.setFunctionFee(_ctx.integerValue("ListOrderResponse.Data.List["+ i +"].FunctionFee"));
			orderListVO.setPayTime(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].PayTime"));
			orderListVO.setFlowType(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].FlowType"));
			orderListVO.setPoolCapacity(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].PoolCapacity"));
			orderListVO.setOrderInfo(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].OrderInfo"));
			orderListVO.setOrderType(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].OrderType"));
			orderListVO.setOrderId(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].OrderId"));
			orderListVO.setCredentialNo(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].CredentialNo"));
			orderListVO.setOrderDetailUrl(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].OrderDetailUrl"));

			List<String> expressNoList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListOrderResponse.Data.List["+ i +"].ExpressNoList.Length"); j++) {
				expressNoList.add(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].ExpressNoList["+ j +"]"));
			}
			orderListVO.setExpressNoList(expressNoList);

			DeliveryInfo deliveryInfo = new DeliveryInfo();
			deliveryInfo.setZipCode(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].DeliveryInfo.ZipCode"));
			deliveryInfo.setAddress(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].DeliveryInfo.Address"));
			deliveryInfo.setMail(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].DeliveryInfo.Mail"));
			deliveryInfo.setReceiver(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].DeliveryInfo.Receiver"));
			deliveryInfo.setBuyerMessage(_ctx.stringValue("ListOrderResponse.Data.List["+ i +"].DeliveryInfo.BuyerMessage"));
			orderListVO.setDeliveryInfo(deliveryInfo);

			list.add(orderListVO);
		}
		data.setList(list);
		listOrderResponse.setData(data);
	 
	 	return listOrderResponse;
	}
}