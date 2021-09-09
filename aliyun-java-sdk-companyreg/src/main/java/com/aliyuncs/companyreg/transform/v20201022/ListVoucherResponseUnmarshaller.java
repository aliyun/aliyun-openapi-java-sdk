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

package com.aliyuncs.companyreg.transform.v20201022;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20201022.ListVoucherResponse;
import com.aliyuncs.companyreg.model.v20201022.ListVoucherResponse.ResultItem;
import com.aliyuncs.companyreg.model.v20201022.ListVoucherResponse.ResultItem.DetailsItem;
import com.aliyuncs.companyreg.model.v20201022.ListVoucherResponse.ResultItem.ExtAttributes;
import com.aliyuncs.companyreg.model.v20201022.ListVoucherResponse.ResultItem.VoucherTransCategoryId;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVoucherResponseUnmarshaller {

	public static ListVoucherResponse unmarshall(ListVoucherResponse listVoucherResponse, UnmarshallerContext _ctx) {
		
		listVoucherResponse.setRequestId(_ctx.stringValue("ListVoucherResponse.RequestId"));
		listVoucherResponse.setPageCount(_ctx.integerValue("ListVoucherResponse.PageCount"));
		listVoucherResponse.setPageSize(_ctx.integerValue("ListVoucherResponse.PageSize"));
		listVoucherResponse.setTotalCount(_ctx.integerValue("ListVoucherResponse.TotalCount"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVoucherResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreatedStamp(_ctx.longValue("ListVoucherResponse.Result["+ i +"].CreatedStamp"));
			resultItem.setHasEditAuthority(_ctx.booleanValue("ListVoucherResponse.Result["+ i +"].HasEditAuthority"));
			resultItem.setId(_ctx.longValue("ListVoucherResponse.Result["+ i +"].Id"));
			resultItem.setPeriod(_ctx.stringValue("ListVoucherResponse.Result["+ i +"].Period"));
			resultItem.setRefVoucherIds(_ctx.stringValue("ListVoucherResponse.Result["+ i +"].RefVoucherIds"));
			resultItem.setRefVoucherInfo(_ctx.stringValue("ListVoucherResponse.Result["+ i +"].RefVoucherInfo"));
			resultItem.setUploadAttachmentCount(_ctx.integerValue("ListVoucherResponse.Result["+ i +"].UploadAttachmentCount"));
			resultItem.setVoucherDate(_ctx.longValue("ListVoucherResponse.Result["+ i +"].VoucherDate"));
			resultItem.setVoucherNo(_ctx.stringValue("ListVoucherResponse.Result["+ i +"].VoucherNo"));
			resultItem.setVoucherType(_ctx.stringValue("ListVoucherResponse.Result["+ i +"].VoucherType"));
			resultItem.setWrittenPerson(_ctx.stringValue("ListVoucherResponse.Result["+ i +"].WrittenPerson"));

			ExtAttributes extAttributes = new ExtAttributes();
			extAttributes.setIsSupervisor(_ctx.integerValue("ListVoucherResponse.Result["+ i +"].ExtAttributes.IsSupervisor"));
			extAttributes.setNeedCheckCreatorId(_ctx.integerValue("ListVoucherResponse.Result["+ i +"].ExtAttributes.NeedCheckCreatorId"));
			extAttributes.setUpdateAttachment(_ctx.integerValue("ListVoucherResponse.Result["+ i +"].ExtAttributes.UpdateAttachment"));
			resultItem.setExtAttributes(extAttributes);

			VoucherTransCategoryId voucherTransCategoryId = new VoucherTransCategoryId();
			voucherTransCategoryId.setName(_ctx.stringValue("ListVoucherResponse.Result["+ i +"].VoucherTransCategoryId.Name"));
			resultItem.setVoucherTransCategoryId(voucherTransCategoryId);

			List<DetailsItem> details = new ArrayList<DetailsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListVoucherResponse.Result["+ i +"].Details.Length"); j++) {
				DetailsItem detailsItem = new DetailsItem();
				detailsItem.setBasePostedCreditor(_ctx.floatValue("ListVoucherResponse.Result["+ i +"].Details["+ j +"].BasePostedCreditor"));
				detailsItem.setBasePostedDebtor(_ctx.floatValue("ListVoucherResponse.Result["+ i +"].Details["+ j +"].BasePostedDebtor"));
				detailsItem.setComments(_ctx.stringValue("ListVoucherResponse.Result["+ i +"].Details["+ j +"].Comments"));

				details.add(detailsItem);
			}
			resultItem.setDetails(details);

			result.add(resultItem);
		}
		listVoucherResponse.setResult(result);
	 
	 	return listVoucherResponse;
	}
}