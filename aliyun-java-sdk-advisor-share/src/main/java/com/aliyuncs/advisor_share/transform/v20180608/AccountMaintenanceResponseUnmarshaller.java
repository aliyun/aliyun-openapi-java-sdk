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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.AccountMaintenanceResponse;
import com.aliyuncs.advisor_share.model.v20180608.AccountMaintenanceResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.AccountMaintenanceResponse.Data.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AccountMaintenanceResponseUnmarshaller {

	public static AccountMaintenanceResponse unmarshall(AccountMaintenanceResponse accountMaintenanceResponse, UnmarshallerContext _ctx) {
		
		accountMaintenanceResponse.setRequestId(_ctx.stringValue("AccountMaintenanceResponse.RequestId"));
		accountMaintenanceResponse.setSuccess(_ctx.booleanValue("AccountMaintenanceResponse.Success"));

		Data data = new Data();
		data.setPageNo(_ctx.longValue("AccountMaintenanceResponse.Data.PageNo"));
		data.setPageSize(_ctx.longValue("AccountMaintenanceResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("AccountMaintenanceResponse.Data.Total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("AccountMaintenanceResponse.Data.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAliyunId(_ctx.longValue("AccountMaintenanceResponse.Data.Result["+ i +"].AliyunId"));
			resultItem.setAuthorizationTime(_ctx.stringValue("AccountMaintenanceResponse.Data.Result["+ i +"].AuthorizationTime"));
			resultItem.setNickName(_ctx.stringValue("AccountMaintenanceResponse.Data.Result["+ i +"].NickName"));

			result.add(resultItem);
		}
		data.setResult(result);
		accountMaintenanceResponse.setData(data);
	 
	 	return accountMaintenanceResponse;
	}
}