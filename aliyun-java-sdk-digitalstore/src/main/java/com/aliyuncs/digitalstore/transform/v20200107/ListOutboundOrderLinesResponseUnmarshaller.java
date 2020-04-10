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

import com.aliyuncs.digitalstore.model.v20200107.ListOutboundOrderLinesResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListOutboundOrderLinesResponse.OutboundOrderLineBiz;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOutboundOrderLinesResponseUnmarshaller {

	public static ListOutboundOrderLinesResponse unmarshall(ListOutboundOrderLinesResponse listOutboundOrderLinesResponse, UnmarshallerContext _ctx) {
		
		listOutboundOrderLinesResponse.setRequestId(_ctx.stringValue("ListOutboundOrderLinesResponse.RequestId"));
		listOutboundOrderLinesResponse.setPageSize(_ctx.integerValue("ListOutboundOrderLinesResponse.PageSize"));
		listOutboundOrderLinesResponse.setTotalCount(_ctx.integerValue("ListOutboundOrderLinesResponse.TotalCount"));
		listOutboundOrderLinesResponse.setPageNumber(_ctx.integerValue("ListOutboundOrderLinesResponse.PageNumber"));
		listOutboundOrderLinesResponse.setSuccess(_ctx.booleanValue("ListOutboundOrderLinesResponse.Success"));

		List<OutboundOrderLineBiz> outboundOrderLines = new ArrayList<OutboundOrderLineBiz>();
		for (int i = 0; i < _ctx.lengthValue("ListOutboundOrderLinesResponse.OutboundOrderLines.Length"); i++) {
			OutboundOrderLineBiz outboundOrderLineBiz = new OutboundOrderLineBiz();
			outboundOrderLineBiz.setBarcode(_ctx.stringValue("ListOutboundOrderLinesResponse.OutboundOrderLines["+ i +"].Barcode"));
			outboundOrderLineBiz.setOperateQuantity(_ctx.integerValue("ListOutboundOrderLinesResponse.OutboundOrderLines["+ i +"].OperateQuantity"));
			outboundOrderLineBiz.setQuantity(_ctx.integerValue("ListOutboundOrderLinesResponse.OutboundOrderLines["+ i +"].Quantity"));
			outboundOrderLineBiz.setConfirmQuantity(_ctx.integerValue("ListOutboundOrderLinesResponse.OutboundOrderLines["+ i +"].ConfirmQuantity"));

			outboundOrderLines.add(outboundOrderLineBiz);
		}
		listOutboundOrderLinesResponse.setOutboundOrderLines(outboundOrderLines);
	 
	 	return listOutboundOrderLinesResponse;
	}
}