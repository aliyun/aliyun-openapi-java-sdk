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

import com.aliyuncs.digitalstore.model.v20200107.ListProduceOrderSKUTagsResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListProduceOrderSKUTagsResponse.ProduceOrderSkuTagBiz;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProduceOrderSKUTagsResponseUnmarshaller {

	public static ListProduceOrderSKUTagsResponse unmarshall(ListProduceOrderSKUTagsResponse listProduceOrderSKUTagsResponse, UnmarshallerContext _ctx) {
		
		listProduceOrderSKUTagsResponse.setRequestId(_ctx.stringValue("ListProduceOrderSKUTagsResponse.RequestId"));
		listProduceOrderSKUTagsResponse.setPageSize(_ctx.integerValue("ListProduceOrderSKUTagsResponse.PageSize"));
		listProduceOrderSKUTagsResponse.setTotalCount(_ctx.integerValue("ListProduceOrderSKUTagsResponse.TotalCount"));
		listProduceOrderSKUTagsResponse.setPageNumber(_ctx.integerValue("ListProduceOrderSKUTagsResponse.PageNumber"));
		listProduceOrderSKUTagsResponse.setSuccess(_ctx.booleanValue("ListProduceOrderSKUTagsResponse.Success"));

		List<ProduceOrderSkuTagBiz> skuTags = new ArrayList<ProduceOrderSkuTagBiz>();
		for (int i = 0; i < _ctx.lengthValue("ListProduceOrderSKUTagsResponse.SkuTags.Length"); i++) {
			ProduceOrderSkuTagBiz produceOrderSkuTagBiz = new ProduceOrderSkuTagBiz();
			produceOrderSkuTagBiz.setBarcode(_ctx.stringValue("ListProduceOrderSKUTagsResponse.SkuTags["+ i +"].Barcode"));
			produceOrderSkuTagBiz.setCaseId(_ctx.stringValue("ListProduceOrderSKUTagsResponse.SkuTags["+ i +"].CaseId"));
			produceOrderSkuTagBiz.setTagValue(_ctx.stringValue("ListProduceOrderSKUTagsResponse.SkuTags["+ i +"].TagValue"));
			produceOrderSkuTagBiz.setCaseCode(_ctx.stringValue("ListProduceOrderSKUTagsResponse.SkuTags["+ i +"].CaseCode"));

			skuTags.add(produceOrderSkuTagBiz);
		}
		listProduceOrderSKUTagsResponse.setSkuTags(skuTags);
	 
	 	return listProduceOrderSKUTagsResponse;
	}
}