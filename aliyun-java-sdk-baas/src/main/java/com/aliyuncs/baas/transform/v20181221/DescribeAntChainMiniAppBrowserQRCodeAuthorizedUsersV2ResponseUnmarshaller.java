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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.Result.AuthorizedUserListItem;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.Result.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseUnmarshaller {

	public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response unmarshall(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.setRequestId(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.RequestId"));
		describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.setResultCode(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.ResultCode"));
		describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.ResultMessage"));
		describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.Success"));
		describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.HttpStatusCode"));
		describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.setCode(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.Code"));
		describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.setMessage(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.Message"));

		Result result = new Result();
		result.setAntChainId(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.Result.AntChainId"));
		result.setQRCodeType(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.Result.QRCodeType"));
		result.setAuthorizationType(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.Result.AuthorizationType"));

		Pagination pagination = new Pagination();
		pagination.setPageSize(_ctx.integerValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.Result.Pagination.PageSize"));
		pagination.setPageNumber(_ctx.integerValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.Result.Pagination.PageNumber"));
		pagination.setTotalCount(_ctx.integerValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.Result.Pagination.TotalCount"));
		result.setPagination(pagination);

		List<AuthorizedUserListItem> authorizedUserList = new ArrayList<AuthorizedUserListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.Result.AuthorizedUserList.Length"); i++) {
			AuthorizedUserListItem authorizedUserListItem = new AuthorizedUserListItem();
			authorizedUserListItem.setPhone(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.Result.AuthorizedUserList["+ i +"].Phone"));
			authorizedUserListItem.setGmtAuthorized(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.Result.AuthorizedUserList["+ i +"].GmtAuthorized"));

			authorizedUserList.add(authorizedUserListItem);
		}
		result.setAuthorizedUserList(authorizedUserList);
		describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response.setResult(result);
	 
	 	return describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response;
	}
}