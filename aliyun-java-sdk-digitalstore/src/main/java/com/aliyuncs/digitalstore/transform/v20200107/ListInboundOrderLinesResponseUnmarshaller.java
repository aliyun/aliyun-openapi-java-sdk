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

import com.aliyuncs.digitalstore.model.v20200107.ListInboundOrderLinesResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListInboundOrderLinesResponse.InboundOrderLineBiz;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInboundOrderLinesResponseUnmarshaller {

	public static ListInboundOrderLinesResponse unmarshall(ListInboundOrderLinesResponse listInboundOrderLinesResponse, UnmarshallerContext _ctx) {
		
		listInboundOrderLinesResponse.setRequestId(_ctx.stringValue("ListInboundOrderLinesResponse.RequestId"));
		listInboundOrderLinesResponse.setTotalCount(_ctx.integerValue("ListInboundOrderLinesResponse.TotalCount"));
		listInboundOrderLinesResponse.setPageSize(_ctx.integerValue("ListInboundOrderLinesResponse.PageSize"));
		listInboundOrderLinesResponse.setPageNumber(_ctx.integerValue("ListInboundOrderLinesResponse.PageNumber"));
		listInboundOrderLinesResponse.setSuccess(_ctx.booleanValue("ListInboundOrderLinesResponse.Success"));

		List<InboundOrderLineBiz> inboundOrderLines = new ArrayList<InboundOrderLineBiz>();
		for (int i = 0; i < _ctx.lengthValue("ListInboundOrderLinesResponse.InboundOrderLines.Length"); i++) {
			InboundOrderLineBiz inboundOrderLineBiz = new InboundOrderLineBiz();
			inboundOrderLineBiz.setBarcode(_ctx.stringValue("ListInboundOrderLinesResponse.InboundOrderLines["+ i +"].Barcode"));
			inboundOrderLineBiz.setOperateQuantity(_ctx.integerValue("ListInboundOrderLinesResponse.InboundOrderLines["+ i +"].OperateQuantity"));
			inboundOrderLineBiz.setQuantity(_ctx.integerValue("ListInboundOrderLinesResponse.InboundOrderLines["+ i +"].Quantity"));
			inboundOrderLineBiz.setConfirmQuantity(_ctx.integerValue("ListInboundOrderLinesResponse.InboundOrderLines["+ i +"].ConfirmQuantity"));
			inboundOrderLineBiz.setSKUId(_ctx.stringValue("ListInboundOrderLinesResponse.InboundOrderLines["+ i +"].SKUId"));
			inboundOrderLineBiz.setSKUName(_ctx.stringValue("ListInboundOrderLinesResponse.InboundOrderLines["+ i +"].SKUName"));
			inboundOrderLineBiz.setStyleId(_ctx.stringValue("ListInboundOrderLinesResponse.InboundOrderLines["+ i +"].StyleId"));
			inboundOrderLineBiz.setStyleCode(_ctx.stringValue("ListInboundOrderLinesResponse.InboundOrderLines["+ i +"].StyleCode"));
			inboundOrderLineBiz.setStyleName(_ctx.stringValue("ListInboundOrderLinesResponse.InboundOrderLines["+ i +"].StyleName"));
			inboundOrderLineBiz.setSizeId(_ctx.stringValue("ListInboundOrderLinesResponse.InboundOrderLines["+ i +"].SizeId"));
			inboundOrderLineBiz.setSizeCode(_ctx.stringValue("ListInboundOrderLinesResponse.InboundOrderLines["+ i +"].SizeCode"));
			inboundOrderLineBiz.setSizeName(_ctx.stringValue("ListInboundOrderLinesResponse.InboundOrderLines["+ i +"].SizeName"));
			inboundOrderLineBiz.setColorId(_ctx.stringValue("ListInboundOrderLinesResponse.InboundOrderLines["+ i +"].ColorId"));
			inboundOrderLineBiz.setColorCode(_ctx.stringValue("ListInboundOrderLinesResponse.InboundOrderLines["+ i +"].ColorCode"));
			inboundOrderLineBiz.setColorName(_ctx.stringValue("ListInboundOrderLinesResponse.InboundOrderLines["+ i +"].ColorName"));

			inboundOrderLines.add(inboundOrderLineBiz);
		}
		listInboundOrderLinesResponse.setInboundOrderLines(inboundOrderLines);
	 
	 	return listInboundOrderLinesResponse;
	}
}