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

import com.aliyuncs.digitalstore.model.v20200107.ListApplicationOrderLinesResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListApplicationOrderLinesResponse.ApplyOrderLineBiz;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationOrderLinesResponseUnmarshaller {

	public static ListApplicationOrderLinesResponse unmarshall(ListApplicationOrderLinesResponse listApplicationOrderLinesResponse, UnmarshallerContext _ctx) {
		
		listApplicationOrderLinesResponse.setRequestId(_ctx.stringValue("ListApplicationOrderLinesResponse.RequestId"));
		listApplicationOrderLinesResponse.setPageSize(_ctx.integerValue("ListApplicationOrderLinesResponse.PageSize"));
		listApplicationOrderLinesResponse.setTotalCount(_ctx.integerValue("ListApplicationOrderLinesResponse.TotalCount"));
		listApplicationOrderLinesResponse.setPageNumber(_ctx.integerValue("ListApplicationOrderLinesResponse.PageNumber"));
		listApplicationOrderLinesResponse.setSuccess(_ctx.booleanValue("ListApplicationOrderLinesResponse.Success"));

		List<ApplyOrderLineBiz> applyOrderLines = new ArrayList<ApplyOrderLineBiz>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationOrderLinesResponse.ApplyOrderLines.Length"); i++) {
			ApplyOrderLineBiz applyOrderLineBiz = new ApplyOrderLineBiz();
			applyOrderLineBiz.setBarcode(_ctx.stringValue("ListApplicationOrderLinesResponse.ApplyOrderLines["+ i +"].Barcode"));
			applyOrderLineBiz.setOperateQuantity(_ctx.integerValue("ListApplicationOrderLinesResponse.ApplyOrderLines["+ i +"].OperateQuantity"));
			applyOrderLineBiz.setInboundQuantity(_ctx.integerValue("ListApplicationOrderLinesResponse.ApplyOrderLines["+ i +"].InboundQuantity"));
			applyOrderLineBiz.setSKUId(_ctx.stringValue("ListApplicationOrderLinesResponse.ApplyOrderLines["+ i +"].SKUId"));
			applyOrderLineBiz.setSKUName(_ctx.stringValue("ListApplicationOrderLinesResponse.ApplyOrderLines["+ i +"].SKUName"));
			applyOrderLineBiz.setStyleId(_ctx.stringValue("ListApplicationOrderLinesResponse.ApplyOrderLines["+ i +"].StyleId"));
			applyOrderLineBiz.setStyleCode(_ctx.stringValue("ListApplicationOrderLinesResponse.ApplyOrderLines["+ i +"].StyleCode"));
			applyOrderLineBiz.setStyleName(_ctx.stringValue("ListApplicationOrderLinesResponse.ApplyOrderLines["+ i +"].StyleName"));
			applyOrderLineBiz.setSizeId(_ctx.stringValue("ListApplicationOrderLinesResponse.ApplyOrderLines["+ i +"].SizeId"));
			applyOrderLineBiz.setSizeCode(_ctx.stringValue("ListApplicationOrderLinesResponse.ApplyOrderLines["+ i +"].SizeCode"));
			applyOrderLineBiz.setSizeName(_ctx.stringValue("ListApplicationOrderLinesResponse.ApplyOrderLines["+ i +"].SizeName"));
			applyOrderLineBiz.setColorId(_ctx.stringValue("ListApplicationOrderLinesResponse.ApplyOrderLines["+ i +"].ColorId"));
			applyOrderLineBiz.setColorCode(_ctx.stringValue("ListApplicationOrderLinesResponse.ApplyOrderLines["+ i +"].ColorCode"));
			applyOrderLineBiz.setColorName(_ctx.stringValue("ListApplicationOrderLinesResponse.ApplyOrderLines["+ i +"].ColorName"));

			applyOrderLines.add(applyOrderLineBiz);
		}
		listApplicationOrderLinesResponse.setApplyOrderLines(applyOrderLines);
	 
	 	return listApplicationOrderLinesResponse;
	}
}