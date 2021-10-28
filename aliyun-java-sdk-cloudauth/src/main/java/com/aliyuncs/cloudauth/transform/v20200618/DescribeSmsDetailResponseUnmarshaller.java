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

package com.aliyuncs.cloudauth.transform.v20200618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth.model.v20200618.DescribeSmsDetailResponse;
import com.aliyuncs.cloudauth.model.v20200618.DescribeSmsDetailResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSmsDetailResponseUnmarshaller {

	public static DescribeSmsDetailResponse unmarshall(DescribeSmsDetailResponse describeSmsDetailResponse, UnmarshallerContext _ctx) {
		
		describeSmsDetailResponse.setRequestId(_ctx.stringValue("DescribeSmsDetailResponse.RequestId"));
		describeSmsDetailResponse.setMessage(_ctx.stringValue("DescribeSmsDetailResponse.Message"));
		describeSmsDetailResponse.setCode(_ctx.stringValue("DescribeSmsDetailResponse.Code"));
		describeSmsDetailResponse.setTotalItem(_ctx.integerValue("DescribeSmsDetailResponse.TotalItem"));
		describeSmsDetailResponse.setTotalPage(_ctx.integerValue("DescribeSmsDetailResponse.TotalPage"));
		describeSmsDetailResponse.setCurrentPage(_ctx.integerValue("DescribeSmsDetailResponse.CurrentPage"));
		describeSmsDetailResponse.setPageSize(_ctx.integerValue("DescribeSmsDetailResponse.PageSize"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSmsDetailResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setBizId(_ctx.stringValue("DescribeSmsDetailResponse.Items["+ i +"].BizId"));
			itemsItem.setOuterOrderNo(_ctx.stringValue("DescribeSmsDetailResponse.Items["+ i +"].OuterOrderNo"));
			itemsItem.setContent(_ctx.stringValue("DescribeSmsDetailResponse.Items["+ i +"].Content"));
			itemsItem.setErrorCode(_ctx.stringValue("DescribeSmsDetailResponse.Items["+ i +"].ErrorCode"));
			itemsItem.setErrorMessage(_ctx.stringValue("DescribeSmsDetailResponse.Items["+ i +"].ErrorMessage"));
			itemsItem.setSmsSize(_ctx.integerValue("DescribeSmsDetailResponse.Items["+ i +"].SmsSize"));
			itemsItem.setMobile(_ctx.stringValue("DescribeSmsDetailResponse.Items["+ i +"].Mobile"));
			itemsItem.setReceiveDate(_ctx.stringValue("DescribeSmsDetailResponse.Items["+ i +"].ReceiveDate"));
			itemsItem.setSendDate(_ctx.stringValue("DescribeSmsDetailResponse.Items["+ i +"].SendDate"));
			itemsItem.setSignName(_ctx.stringValue("DescribeSmsDetailResponse.Items["+ i +"].SignName"));
			itemsItem.setTemplateCode(_ctx.stringValue("DescribeSmsDetailResponse.Items["+ i +"].TemplateCode"));
			itemsItem.setTaskDate(_ctx.stringValue("DescribeSmsDetailResponse.Items["+ i +"].TaskDate"));
			itemsItem.setSendStatus(_ctx.stringValue("DescribeSmsDetailResponse.Items["+ i +"].SendStatus"));

			items.add(itemsItem);
		}
		describeSmsDetailResponse.setItems(items);
	 
	 	return describeSmsDetailResponse;
	}
}