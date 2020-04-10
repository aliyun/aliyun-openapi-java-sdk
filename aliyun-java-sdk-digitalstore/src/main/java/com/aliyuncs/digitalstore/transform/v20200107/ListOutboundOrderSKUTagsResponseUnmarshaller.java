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

import com.aliyuncs.digitalstore.model.v20200107.ListOutboundOrderSKUTagsResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListOutboundOrderSKUTagsResponse.OutboundOrderSkuTagBiz;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOutboundOrderSKUTagsResponseUnmarshaller {

	public static ListOutboundOrderSKUTagsResponse unmarshall(ListOutboundOrderSKUTagsResponse listOutboundOrderSKUTagsResponse, UnmarshallerContext _ctx) {
		
		listOutboundOrderSKUTagsResponse.setRequestId(_ctx.stringValue("ListOutboundOrderSKUTagsResponse.RequestId"));
		listOutboundOrderSKUTagsResponse.setPageSize(_ctx.integerValue("ListOutboundOrderSKUTagsResponse.PageSize"));
		listOutboundOrderSKUTagsResponse.setTotalCount(_ctx.integerValue("ListOutboundOrderSKUTagsResponse.TotalCount"));
		listOutboundOrderSKUTagsResponse.setPageNumber(_ctx.integerValue("ListOutboundOrderSKUTagsResponse.PageNumber"));
		listOutboundOrderSKUTagsResponse.setSuccess(_ctx.booleanValue("ListOutboundOrderSKUTagsResponse.Success"));

		List<OutboundOrderSkuTagBiz> skuTags = new ArrayList<OutboundOrderSkuTagBiz>();
		for (int i = 0; i < _ctx.lengthValue("ListOutboundOrderSKUTagsResponse.SkuTags.Length"); i++) {
			OutboundOrderSkuTagBiz outboundOrderSkuTagBiz = new OutboundOrderSkuTagBiz();
			outboundOrderSkuTagBiz.setBarcode(_ctx.stringValue("ListOutboundOrderSKUTagsResponse.SkuTags["+ i +"].Barcode"));
			outboundOrderSkuTagBiz.setCaseId(_ctx.stringValue("ListOutboundOrderSKUTagsResponse.SkuTags["+ i +"].CaseId"));
			outboundOrderSkuTagBiz.setTagValue(_ctx.stringValue("ListOutboundOrderSKUTagsResponse.SkuTags["+ i +"].TagValue"));
			outboundOrderSkuTagBiz.setCaseCode(_ctx.stringValue("ListOutboundOrderSKUTagsResponse.SkuTags["+ i +"].CaseCode"));

			skuTags.add(outboundOrderSkuTagBiz);
		}
		listOutboundOrderSKUTagsResponse.setSkuTags(skuTags);
	 
	 	return listOutboundOrderSKUTagsResponse;
	}
}