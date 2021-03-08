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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListBusinessResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListBusinessResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListBusinessResponse.Data.BusinessItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBusinessResponseUnmarshaller {

	public static ListBusinessResponse unmarshall(ListBusinessResponse listBusinessResponse, UnmarshallerContext _ctx) {
		
		listBusinessResponse.setRequestId(_ctx.stringValue("ListBusinessResponse.RequestId"));
		listBusinessResponse.setSuccess(_ctx.booleanValue("ListBusinessResponse.Success"));
		listBusinessResponse.setErrorCode(_ctx.stringValue("ListBusinessResponse.ErrorCode"));
		listBusinessResponse.setErrorMessage(_ctx.stringValue("ListBusinessResponse.ErrorMessage"));
		listBusinessResponse.setHttpStatusCode(_ctx.integerValue("ListBusinessResponse.HttpStatusCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListBusinessResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListBusinessResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListBusinessResponse.Data.TotalCount"));

		List<BusinessItem> business = new ArrayList<BusinessItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBusinessResponse.Data.Business.Length"); i++) {
			BusinessItem businessItem = new BusinessItem();
			businessItem.setBusinessId(_ctx.longValue("ListBusinessResponse.Data.Business["+ i +"].BusinessId"));
			businessItem.setBusinessName(_ctx.stringValue("ListBusinessResponse.Data.Business["+ i +"].BusinessName"));
			businessItem.setProjectId(_ctx.longValue("ListBusinessResponse.Data.Business["+ i +"].ProjectId"));
			businessItem.setOwner(_ctx.stringValue("ListBusinessResponse.Data.Business["+ i +"].Owner"));
			businessItem.setDescription(_ctx.stringValue("ListBusinessResponse.Data.Business["+ i +"].Description"));
			businessItem.setUseType(_ctx.stringValue("ListBusinessResponse.Data.Business["+ i +"].UseType"));

			business.add(businessItem);
		}
		data.setBusiness(business);
		listBusinessResponse.setData(data);
	 
	 	return listBusinessResponse;
	}
}