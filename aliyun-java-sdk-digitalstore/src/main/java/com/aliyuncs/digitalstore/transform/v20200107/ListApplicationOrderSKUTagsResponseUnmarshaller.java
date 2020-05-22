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

import com.aliyuncs.digitalstore.model.v20200107.ListApplicationOrderSKUTagsResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListApplicationOrderSKUTagsResponse.ApplyOrderSKUTagsBiz;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationOrderSKUTagsResponseUnmarshaller {

	public static ListApplicationOrderSKUTagsResponse unmarshall(ListApplicationOrderSKUTagsResponse listApplicationOrderSKUTagsResponse, UnmarshallerContext _ctx) {
		
		listApplicationOrderSKUTagsResponse.setRequestId(_ctx.stringValue("ListApplicationOrderSKUTagsResponse.RequestId"));
		listApplicationOrderSKUTagsResponse.setPageSize(_ctx.integerValue("ListApplicationOrderSKUTagsResponse.PageSize"));
		listApplicationOrderSKUTagsResponse.setTotalCount(_ctx.integerValue("ListApplicationOrderSKUTagsResponse.TotalCount"));
		listApplicationOrderSKUTagsResponse.setPageNumber(_ctx.integerValue("ListApplicationOrderSKUTagsResponse.PageNumber"));
		listApplicationOrderSKUTagsResponse.setSuccess(_ctx.booleanValue("ListApplicationOrderSKUTagsResponse.Success"));

		List<ApplyOrderSKUTagsBiz> sKUTags = new ArrayList<ApplyOrderSKUTagsBiz>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationOrderSKUTagsResponse.SKUTags.Length"); i++) {
			ApplyOrderSKUTagsBiz applyOrderSKUTagsBiz = new ApplyOrderSKUTagsBiz();
			applyOrderSKUTagsBiz.setBarcode(_ctx.stringValue("ListApplicationOrderSKUTagsResponse.SKUTags["+ i +"].Barcode"));
			applyOrderSKUTagsBiz.setCaseId(_ctx.stringValue("ListApplicationOrderSKUTagsResponse.SKUTags["+ i +"].CaseId"));
			applyOrderSKUTagsBiz.setTagValue(_ctx.stringValue("ListApplicationOrderSKUTagsResponse.SKUTags["+ i +"].TagValue"));
			applyOrderSKUTagsBiz.setCaseCode(_ctx.stringValue("ListApplicationOrderSKUTagsResponse.SKUTags["+ i +"].CaseCode"));

			sKUTags.add(applyOrderSKUTagsBiz);
		}
		listApplicationOrderSKUTagsResponse.setSKUTags(sKUTags);
	 
	 	return listApplicationOrderSKUTagsResponse;
	}
}