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

import com.aliyuncs.dataworks_public.model.v20200518.DsgUserGroupQueryUserListResponse;
import com.aliyuncs.dataworks_public.model.v20200518.DsgUserGroupQueryUserListResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class DsgUserGroupQueryUserListResponseUnmarshaller {

	public static DsgUserGroupQueryUserListResponse unmarshall(DsgUserGroupQueryUserListResponse dsgUserGroupQueryUserListResponse, UnmarshallerContext _ctx) {
		
		dsgUserGroupQueryUserListResponse.setRequestId(_ctx.stringValue("DsgUserGroupQueryUserListResponse.RequestId"));
		dsgUserGroupQueryUserListResponse.setSuccess(_ctx.booleanValue("DsgUserGroupQueryUserListResponse.Success"));
		dsgUserGroupQueryUserListResponse.setErrorCode(_ctx.stringValue("DsgUserGroupQueryUserListResponse.ErrorCode"));
		dsgUserGroupQueryUserListResponse.setErrorMessage(_ctx.stringValue("DsgUserGroupQueryUserListResponse.ErrorMessage"));
		dsgUserGroupQueryUserListResponse.setHttpStatusCode(_ctx.integerValue("DsgUserGroupQueryUserListResponse.HttpStatusCode"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("DsgUserGroupQueryUserListResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setAccountName(_ctx.stringValue("DsgUserGroupQueryUserListResponse.Data["+ i +"].AccountName"));
			datas.setYunAccount(_ctx.stringValue("DsgUserGroupQueryUserListResponse.Data["+ i +"].YunAccount"));
			datas.setAccountType(_ctx.integerValue("DsgUserGroupQueryUserListResponse.Data["+ i +"].AccountType"));
			datas.setBaseId(_ctx.stringValue("DsgUserGroupQueryUserListResponse.Data["+ i +"].BaseId"));
			datas.setParentAccountId(_ctx.stringValue("DsgUserGroupQueryUserListResponse.Data["+ i +"].ParentAccountId"));

			data.add(datas);
		}
		dsgUserGroupQueryUserListResponse.setData(data);
	 
	 	return dsgUserGroupQueryUserListResponse;
	}
}