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

package com.aliyuncs.retailadvqa.transform.v20230417;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa.model.v20230417.PageIncrementMembersResponse;
import com.aliyuncs.retailadvqa.model.v20230417.PageIncrementMembersResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageIncrementMembersResponseUnmarshaller {

	public static PageIncrementMembersResponse unmarshall(PageIncrementMembersResponse pageIncrementMembersResponse, UnmarshallerContext _ctx) {
		
		pageIncrementMembersResponse.setRequestId(_ctx.stringValue("PageIncrementMembersResponse.RequestId"));
		pageIncrementMembersResponse.setTotalCount(_ctx.integerValue("PageIncrementMembersResponse.TotalCount"));
		pageIncrementMembersResponse.setSuccess(_ctx.stringValue("PageIncrementMembersResponse.Success"));
		pageIncrementMembersResponse.setErrorCode(_ctx.stringValue("PageIncrementMembersResponse.ErrorCode"));
		pageIncrementMembersResponse.setErrorMessage(_ctx.stringValue("PageIncrementMembersResponse.ErrorMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("PageIncrementMembersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setOpenMerchantId(_ctx.stringValue("PageIncrementMembersResponse.Data["+ i +"].OpenMerchantId"));
			dataItem.setOuterMemberId(_ctx.stringValue("PageIncrementMembersResponse.Data["+ i +"].OuterMemberId"));
			dataItem.setName(_ctx.stringValue("PageIncrementMembersResponse.Data["+ i +"].Name"));
			dataItem.setMobile(_ctx.stringValue("PageIncrementMembersResponse.Data["+ i +"].Mobile"));
			dataItem.setMixMobile(_ctx.stringValue("PageIncrementMembersResponse.Data["+ i +"].MixMobile"));
			dataItem.setBirthday(_ctx.stringValue("PageIncrementMembersResponse.Data["+ i +"].Birthday"));
			dataItem.setProvince(_ctx.stringValue("PageIncrementMembersResponse.Data["+ i +"].Province"));
			dataItem.setCity(_ctx.stringValue("PageIncrementMembersResponse.Data["+ i +"].City"));
			dataItem.setSex(_ctx.stringValue("PageIncrementMembersResponse.Data["+ i +"].Sex"));
			dataItem.setEmail(_ctx.stringValue("PageIncrementMembersResponse.Data["+ i +"].Email"));
			dataItem.setLevelNum(_ctx.integerValue("PageIncrementMembersResponse.Data["+ i +"].LevelNum"));
			dataItem.setLevelPoints(_ctx.stringValue("PageIncrementMembersResponse.Data["+ i +"].LevelPoints"));
			dataItem.setConsumePoints(_ctx.stringValue("PageIncrementMembersResponse.Data["+ i +"].ConsumePoints"));
			dataItem.setSiteUsers(_ctx.stringValue("PageIncrementMembersResponse.Data["+ i +"].SiteUsers"));

			data.add(dataItem);
		}
		pageIncrementMembersResponse.setData(data);
	 
	 	return pageIncrementMembersResponse;
	}
}