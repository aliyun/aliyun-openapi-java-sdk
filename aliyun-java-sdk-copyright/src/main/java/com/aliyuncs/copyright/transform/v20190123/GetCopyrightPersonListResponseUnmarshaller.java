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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.GetCopyrightPersonListResponse;
import com.aliyuncs.copyright.model.v20190123.GetCopyrightPersonListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCopyrightPersonListResponseUnmarshaller {

	public static GetCopyrightPersonListResponse unmarshall(GetCopyrightPersonListResponse getCopyrightPersonListResponse, UnmarshallerContext _ctx) {
		
		getCopyrightPersonListResponse.setRequestId(_ctx.stringValue("GetCopyrightPersonListResponse.RequestId"));
		getCopyrightPersonListResponse.setPageNum(_ctx.integerValue("GetCopyrightPersonListResponse.PageNum"));
		getCopyrightPersonListResponse.setPageSize(_ctx.integerValue("GetCopyrightPersonListResponse.PageSize"));
		getCopyrightPersonListResponse.setSuccess(_ctx.booleanValue("GetCopyrightPersonListResponse.Success"));
		getCopyrightPersonListResponse.setTotalItemNum(_ctx.integerValue("GetCopyrightPersonListResponse.TotalItemNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCopyrightPersonListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setLegalPersonType(_ctx.stringValue("GetCopyrightPersonListResponse.Data["+ i +"].LegalPersonType"));
			dataItem.setRoleType(_ctx.integerValue("GetCopyrightPersonListResponse.Data["+ i +"].RoleType"));
			dataItem.setCity(_ctx.stringValue("GetCopyrightPersonListResponse.Data["+ i +"].City"));
			dataItem.setUseType(_ctx.integerValue("GetCopyrightPersonListResponse.Data["+ i +"].UseType"));
			dataItem.setPhone(_ctx.stringValue("GetCopyrightPersonListResponse.Data["+ i +"].Phone"));
			dataItem.setCounty(_ctx.stringValue("GetCopyrightPersonListResponse.Data["+ i +"].County"));
			dataItem.setUserPk(_ctx.stringValue("GetCopyrightPersonListResponse.Data["+ i +"].UserPk"));
			dataItem.setCardType(_ctx.stringValue("GetCopyrightPersonListResponse.Data["+ i +"].CardType"));
			dataItem.setEmail(_ctx.stringValue("GetCopyrightPersonListResponse.Data["+ i +"].Email"));
			dataItem.setExpiredDate(_ctx.stringValue("GetCopyrightPersonListResponse.Data["+ i +"].ExpiredDate"));
			dataItem.setCardNum(_ctx.stringValue("GetCopyrightPersonListResponse.Data["+ i +"].CardNum"));
			dataItem.setAddress(_ctx.stringValue("GetCopyrightPersonListResponse.Data["+ i +"].Address"));
			dataItem.setOwnerType(_ctx.integerValue("GetCopyrightPersonListResponse.Data["+ i +"].OwnerType"));
			dataItem.setName(_ctx.stringValue("GetCopyrightPersonListResponse.Data["+ i +"].Name"));
			dataItem.setPersonId(_ctx.stringValue("GetCopyrightPersonListResponse.Data["+ i +"].PersonId"));
			dataItem.setAuditStatus(_ctx.integerValue("GetCopyrightPersonListResponse.Data["+ i +"].AuditStatus"));
			dataItem.setProvince(_ctx.stringValue("GetCopyrightPersonListResponse.Data["+ i +"].Province"));

			data.add(dataItem);
		}
		getCopyrightPersonListResponse.setData(data);
	 
	 	return getCopyrightPersonListResponse;
	}
}