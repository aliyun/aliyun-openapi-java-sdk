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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.Result.AuthorizedUserListItem;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.Result.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseUnmarshaller {

	public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse unmarshall(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse describeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse, UnmarshallerContext _ctx) {
		
		describeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.setRequestId(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.RequestId"));

		Result result = new Result();
		result.setAntChainId(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.Result.AntChainId"));
		result.setAuthorizationType(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.Result.AuthorizationType"));
		result.setQRCodeType(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.Result.QRCodeType"));

		Pagination pagination = new Pagination();
		pagination.setPageNumber(_ctx.integerValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.Result.Pagination.PageNumber"));
		pagination.setPageSize(_ctx.integerValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.Result.Pagination.PageSize"));
		pagination.setTotalCount(_ctx.integerValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.Result.Pagination.TotalCount"));
		result.setPagination(pagination);

		List<AuthorizedUserListItem> authorizedUserList = new ArrayList<AuthorizedUserListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.Result.AuthorizedUserList.Length"); i++) {
			AuthorizedUserListItem authorizedUserListItem = new AuthorizedUserListItem();
			authorizedUserListItem.setGmtAuthorized(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.Result.AuthorizedUserList["+ i +"].GmtAuthorized"));
			authorizedUserListItem.setPhone(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.Result.AuthorizedUserList["+ i +"].Phone"));

			authorizedUserList.add(authorizedUserListItem);
		}
		result.setAuthorizedUserList(authorizedUserList);
		describeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.setResult(result);
	 
	 	return describeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse;
	}
}