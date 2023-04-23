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

import com.aliyuncs.retailadvqa.model.v20230417.PageMembersResponse;
import com.aliyuncs.retailadvqa.model.v20230417.PageMembersResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageMembersResponseUnmarshaller {

	public static PageMembersResponse unmarshall(PageMembersResponse pageMembersResponse, UnmarshallerContext _ctx) {
		
		pageMembersResponse.setRequestId(_ctx.stringValue("PageMembersResponse.RequestId"));
		pageMembersResponse.setTotalCount(_ctx.integerValue("PageMembersResponse.TotalCount"));
		pageMembersResponse.setSuccess(_ctx.booleanValue("PageMembersResponse.Success"));
		pageMembersResponse.setErrorCode(_ctx.stringValue("PageMembersResponse.ErrorCode"));
		pageMembersResponse.setErrorMessage(_ctx.stringValue("PageMembersResponse.ErrorMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("PageMembersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setOpenMerchantId(_ctx.stringValue("PageMembersResponse.Data["+ i +"].OpenMerchantId"));
			dataItem.setOuterMemberId(_ctx.stringValue("PageMembersResponse.Data["+ i +"].OuterMemberId"));
			dataItem.setName(_ctx.stringValue("PageMembersResponse.Data["+ i +"].Name"));
			dataItem.setMobile(_ctx.stringValue("PageMembersResponse.Data["+ i +"].Mobile"));
			dataItem.setMixMobile(_ctx.stringValue("PageMembersResponse.Data["+ i +"].MixMobile"));
			dataItem.setBirthday(_ctx.stringValue("PageMembersResponse.Data["+ i +"].Birthday"));
			dataItem.setProvince(_ctx.stringValue("PageMembersResponse.Data["+ i +"].Province"));
			dataItem.setCity(_ctx.stringValue("PageMembersResponse.Data["+ i +"].City"));
			dataItem.setSex(_ctx.stringValue("PageMembersResponse.Data["+ i +"].Sex"));
			dataItem.setEmail(_ctx.stringValue("PageMembersResponse.Data["+ i +"].Email"));
			dataItem.setLevelNum(_ctx.integerValue("PageMembersResponse.Data["+ i +"].LevelNum"));
			dataItem.setLevelPoints(_ctx.stringValue("PageMembersResponse.Data["+ i +"].LevelPoints"));
			dataItem.setConsumePoints(_ctx.stringValue("PageMembersResponse.Data["+ i +"].ConsumePoints"));
			dataItem.setSiteUsers(_ctx.stringValue("PageMembersResponse.Data["+ i +"].SiteUsers"));

			data.add(dataItem);
		}
		pageMembersResponse.setData(data);
	 
	 	return pageMembersResponse;
	}
}