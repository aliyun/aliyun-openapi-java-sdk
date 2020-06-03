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

package com.aliyuncs.digitalstore.transform.v20200107;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.digitalstore.model.v20200107.ListInboundOrderPreboxingsResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListInboundOrderPreboxingsResponse.InboundOrderPreboxingBiz;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInboundOrderPreboxingsResponseUnmarshaller {

	public static ListInboundOrderPreboxingsResponse unmarshall(ListInboundOrderPreboxingsResponse listInboundOrderPreboxingsResponse, UnmarshallerContext _ctx) {
		
		listInboundOrderPreboxingsResponse.setRequestId(_ctx.stringValue("ListInboundOrderPreboxingsResponse.RequestId"));
		listInboundOrderPreboxingsResponse.setSuccess(_ctx.booleanValue("ListInboundOrderPreboxingsResponse.Success"));

		List<InboundOrderPreboxingBiz> inboundOrderPreboxings = new ArrayList<InboundOrderPreboxingBiz>();
		for (int i = 0; i < _ctx.lengthValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings.Length"); i++) {
			InboundOrderPreboxingBiz inboundOrderPreboxingBiz = new InboundOrderPreboxingBiz();
			inboundOrderPreboxingBiz.setOrderId(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].OrderId"));
			inboundOrderPreboxingBiz.setOrderType(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].OrderType"));
			inboundOrderPreboxingBiz.setOrderCode(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].OrderCode"));
			inboundOrderPreboxingBiz.setCaseId(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].CaseId"));
			inboundOrderPreboxingBiz.setBarcode(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].Barcode"));
			inboundOrderPreboxingBiz.setTagValue(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].TagValue"));
			inboundOrderPreboxingBiz.setQuantity(_ctx.integerValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].Quantity"));
			inboundOrderPreboxingBiz.setOperateQuantity(_ctx.integerValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].OperateQuantity"));
			inboundOrderPreboxingBiz.setStyleId(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].StyleId"));
			inboundOrderPreboxingBiz.setStyleCode(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].StyleCode"));
			inboundOrderPreboxingBiz.setStyleName(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].StyleName"));
			inboundOrderPreboxingBiz.setColorId(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].ColorId"));
			inboundOrderPreboxingBiz.setColorCode(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].ColorCode"));
			inboundOrderPreboxingBiz.setColorName(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].ColorName"));
			inboundOrderPreboxingBiz.setSizeId(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].SizeId"));
			inboundOrderPreboxingBiz.setSizeCode(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].SizeCode"));
			inboundOrderPreboxingBiz.setSizeName(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].SizeName"));
			inboundOrderPreboxingBiz.setSKUName(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].SKUName"));
			inboundOrderPreboxingBiz.setSKUId(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].SKUId"));
			inboundOrderPreboxingBiz.setCaseCode(_ctx.stringValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].CaseCode"));
			inboundOrderPreboxingBiz.setPreboxingQuantity(_ctx.integerValue("ListInboundOrderPreboxingsResponse.InboundOrderPreboxings["+ i +"].PreboxingQuantity"));

			inboundOrderPreboxings.add(inboundOrderPreboxingBiz);
		}
		listInboundOrderPreboxingsResponse.setInboundOrderPreboxings(inboundOrderPreboxings);
	 
	 	return listInboundOrderPreboxingsResponse;
	}
}