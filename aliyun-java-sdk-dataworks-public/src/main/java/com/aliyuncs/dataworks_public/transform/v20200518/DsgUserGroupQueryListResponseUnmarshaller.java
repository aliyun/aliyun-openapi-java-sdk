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

import com.aliyuncs.dataworks_public.model.v20200518.DsgUserGroupQueryListResponse;
import com.aliyuncs.dataworks_public.model.v20200518.DsgUserGroupQueryListResponse.PageData;
import com.aliyuncs.dataworks_public.model.v20200518.DsgUserGroupQueryListResponse.PageData.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class DsgUserGroupQueryListResponseUnmarshaller {

	public static DsgUserGroupQueryListResponse unmarshall(DsgUserGroupQueryListResponse dsgUserGroupQueryListResponse, UnmarshallerContext _ctx) {
		
		dsgUserGroupQueryListResponse.setRequestId(_ctx.stringValue("DsgUserGroupQueryListResponse.RequestId"));
		dsgUserGroupQueryListResponse.setSuccess(_ctx.booleanValue("DsgUserGroupQueryListResponse.Success"));
		dsgUserGroupQueryListResponse.setErrorCode(_ctx.stringValue("DsgUserGroupQueryListResponse.ErrorCode"));
		dsgUserGroupQueryListResponse.setErrorMessage(_ctx.stringValue("DsgUserGroupQueryListResponse.ErrorMessage"));
		dsgUserGroupQueryListResponse.setHttpStatusCode(_ctx.integerValue("DsgUserGroupQueryListResponse.HttpStatusCode"));

		PageData pageData = new PageData();
		pageData.setPageNumber(_ctx.integerValue("DsgUserGroupQueryListResponse.PageData.PageNumber"));
		pageData.setPageSize(_ctx.integerValue("DsgUserGroupQueryListResponse.PageData.PageSize"));
		pageData.setTotalCount(_ctx.integerValue("DsgUserGroupQueryListResponse.PageData.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("DsgUserGroupQueryListResponse.PageData.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setId(_ctx.integerValue("DsgUserGroupQueryListResponse.PageData.Data["+ i +"].Id"));
			datas.setGmtCreate(_ctx.stringValue("DsgUserGroupQueryListResponse.PageData.Data["+ i +"].GmtCreate"));
			datas.setGmtModified(_ctx.stringValue("DsgUserGroupQueryListResponse.PageData.Data["+ i +"].GmtModified"));
			datas.setName(_ctx.stringValue("DsgUserGroupQueryListResponse.PageData.Data["+ i +"].Name"));
			datas.setOwner(_ctx.stringValue("DsgUserGroupQueryListResponse.PageData.Data["+ i +"].Owner"));

			List<String> accounts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DsgUserGroupQueryListResponse.PageData.Data["+ i +"].Accounts.Length"); j++) {
				accounts.add(_ctx.stringValue("DsgUserGroupQueryListResponse.PageData.Data["+ i +"].Accounts["+ j +"]"));
			}
			datas.setAccounts(accounts);

			data.add(datas);
		}
		pageData.setData(data);
		dsgUserGroupQueryListResponse.setPageData(pageData);
	 
	 	return dsgUserGroupQueryListResponse;
	}
}