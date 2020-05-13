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

import com.aliyuncs.digitalstore.model.v20200107.ListInboundOrderSKUTagsResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListInboundOrderSKUTagsResponse.InboundOrderSkuTagBiz;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInboundOrderSKUTagsResponseUnmarshaller {

	public static ListInboundOrderSKUTagsResponse unmarshall(ListInboundOrderSKUTagsResponse listInboundOrderSKUTagsResponse, UnmarshallerContext _ctx) {
		
		listInboundOrderSKUTagsResponse.setRequestId(_ctx.stringValue("ListInboundOrderSKUTagsResponse.RequestId"));
		listInboundOrderSKUTagsResponse.setPageSize(_ctx.integerValue("ListInboundOrderSKUTagsResponse.PageSize"));
		listInboundOrderSKUTagsResponse.setTotalCount(_ctx.integerValue("ListInboundOrderSKUTagsResponse.TotalCount"));
		listInboundOrderSKUTagsResponse.setPageNumber(_ctx.integerValue("ListInboundOrderSKUTagsResponse.PageNumber"));
		listInboundOrderSKUTagsResponse.setSuccess(_ctx.booleanValue("ListInboundOrderSKUTagsResponse.Success"));

		List<InboundOrderSkuTagBiz> skuTags = new ArrayList<InboundOrderSkuTagBiz>();
		for (int i = 0; i < _ctx.lengthValue("ListInboundOrderSKUTagsResponse.SkuTags.Length"); i++) {
			InboundOrderSkuTagBiz inboundOrderSkuTagBiz = new InboundOrderSkuTagBiz();
			inboundOrderSkuTagBiz.setBarcode(_ctx.stringValue("ListInboundOrderSKUTagsResponse.SkuTags["+ i +"].Barcode"));
			inboundOrderSkuTagBiz.setCaseId(_ctx.stringValue("ListInboundOrderSKUTagsResponse.SkuTags["+ i +"].CaseId"));
			inboundOrderSkuTagBiz.setTagValue(_ctx.stringValue("ListInboundOrderSKUTagsResponse.SkuTags["+ i +"].TagValue"));
			inboundOrderSkuTagBiz.setCaseCode(_ctx.stringValue("ListInboundOrderSKUTagsResponse.SkuTags["+ i +"].CaseCode"));
			inboundOrderSkuTagBiz.setSKUId(_ctx.stringValue("ListInboundOrderSKUTagsResponse.SkuTags["+ i +"].SKUId"));
			inboundOrderSkuTagBiz.setSKUName(_ctx.stringValue("ListInboundOrderSKUTagsResponse.SkuTags["+ i +"].SKUName"));
			inboundOrderSkuTagBiz.setStyleId(_ctx.stringValue("ListInboundOrderSKUTagsResponse.SkuTags["+ i +"].StyleId"));
			inboundOrderSkuTagBiz.setStyleCode(_ctx.stringValue("ListInboundOrderSKUTagsResponse.SkuTags["+ i +"].StyleCode"));
			inboundOrderSkuTagBiz.setStyleName(_ctx.stringValue("ListInboundOrderSKUTagsResponse.SkuTags["+ i +"].StyleName"));
			inboundOrderSkuTagBiz.setSizeId(_ctx.stringValue("ListInboundOrderSKUTagsResponse.SkuTags["+ i +"].SizeId"));
			inboundOrderSkuTagBiz.setSizeCode(_ctx.stringValue("ListInboundOrderSKUTagsResponse.SkuTags["+ i +"].SizeCode"));
			inboundOrderSkuTagBiz.setSizeName(_ctx.stringValue("ListInboundOrderSKUTagsResponse.SkuTags["+ i +"].SizeName"));
			inboundOrderSkuTagBiz.setColorId(_ctx.stringValue("ListInboundOrderSKUTagsResponse.SkuTags["+ i +"].ColorId"));
			inboundOrderSkuTagBiz.setColorCode(_ctx.stringValue("ListInboundOrderSKUTagsResponse.SkuTags["+ i +"].ColorCode"));
			inboundOrderSkuTagBiz.setColorName(_ctx.stringValue("ListInboundOrderSKUTagsResponse.SkuTags["+ i +"].ColorName"));

			skuTags.add(inboundOrderSkuTagBiz);
		}
		listInboundOrderSKUTagsResponse.setSkuTags(skuTags);
	 
	 	return listInboundOrderSKUTagsResponse;
	}
}