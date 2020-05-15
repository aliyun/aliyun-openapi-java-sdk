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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ExecLinkeBahamutEnvinmultienvResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeBahamutEnvinmultienvResponse.ResultItem;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeBahamutEnvinmultienvResponse.ResultItem.PreEnvReleaseInfo;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeBahamutEnvinmultienvResponse.ResultItem.ProdEnvReleaseInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeBahamutEnvinmultienvResponseUnmarshaller {

	public static ExecLinkeBahamutEnvinmultienvResponse unmarshall(ExecLinkeBahamutEnvinmultienvResponse execLinkeBahamutEnvinmultienvResponse, UnmarshallerContext _ctx) {
		
		execLinkeBahamutEnvinmultienvResponse.setRequestId(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.RequestId"));
		execLinkeBahamutEnvinmultienvResponse.setResultCode(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.ResultCode"));
		execLinkeBahamutEnvinmultienvResponse.setResultMessage(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.ResultMessage"));
		execLinkeBahamutEnvinmultienvResponse.setErrorMessage(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.ErrorMessage"));
		execLinkeBahamutEnvinmultienvResponse.setMessage(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Message"));
		execLinkeBahamutEnvinmultienvResponse.setSuccess(_ctx.booleanValue("ExecLinkeBahamutEnvinmultienvResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeBahamutEnvinmultienvResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCloudTenantId(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].CloudTenantId"));
			resultItem.setCloudTenantName(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].CloudTenantName"));

			PreEnvReleaseInfo preEnvReleaseInfo = new PreEnvReleaseInfo();
			preEnvReleaseInfo.setEnvId(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].PreEnvReleaseInfo.EnvId"));
			preEnvReleaseInfo.setInfo(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].PreEnvReleaseInfo.Info"));
			preEnvReleaseInfo.setStatus(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].PreEnvReleaseInfo.Status"));
			preEnvReleaseInfo.setTicket(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].PreEnvReleaseInfo.Ticket"));
			preEnvReleaseInfo.setType(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].PreEnvReleaseInfo.Type"));
			preEnvReleaseInfo.setWorkspaceId(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].PreEnvReleaseInfo.WorkspaceId"));
			preEnvReleaseInfo.setWorkspaceName(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].PreEnvReleaseInfo.WorkspaceName"));
			resultItem.setPreEnvReleaseInfo(preEnvReleaseInfo);

			ProdEnvReleaseInfo prodEnvReleaseInfo = new ProdEnvReleaseInfo();
			prodEnvReleaseInfo.setEnvId(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].ProdEnvReleaseInfo.EnvId"));
			prodEnvReleaseInfo.setInfo(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].ProdEnvReleaseInfo.Info"));
			prodEnvReleaseInfo.setStatus(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].ProdEnvReleaseInfo.Status"));
			prodEnvReleaseInfo.setTicket(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].ProdEnvReleaseInfo.Ticket"));
			prodEnvReleaseInfo.setType(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].ProdEnvReleaseInfo.Type"));
			prodEnvReleaseInfo.setWorkspaceId(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].ProdEnvReleaseInfo.WorkspaceId"));
			prodEnvReleaseInfo.setWorkspaceName(_ctx.stringValue("ExecLinkeBahamutEnvinmultienvResponse.Result["+ i +"].ProdEnvReleaseInfo.WorkspaceName"));
			resultItem.setProdEnvReleaseInfo(prodEnvReleaseInfo);

			result.add(resultItem);
		}
		execLinkeBahamutEnvinmultienvResponse.setResult(result);
	 
	 	return execLinkeBahamutEnvinmultienvResponse;
	}
}