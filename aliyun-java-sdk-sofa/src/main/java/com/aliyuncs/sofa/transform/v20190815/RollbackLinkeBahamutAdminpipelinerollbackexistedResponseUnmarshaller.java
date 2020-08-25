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

import com.aliyuncs.sofa.model.v20190815.RollbackLinkeBahamutAdminpipelinerollbackexistedResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RollbackLinkeBahamutAdminpipelinerollbackexistedResponseUnmarshaller {

	public static RollbackLinkeBahamutAdminpipelinerollbackexistedResponse unmarshall(RollbackLinkeBahamutAdminpipelinerollbackexistedResponse rollbackLinkeBahamutAdminpipelinerollbackexistedResponse, UnmarshallerContext _ctx) {
		
		rollbackLinkeBahamutAdminpipelinerollbackexistedResponse.setRequestId(_ctx.stringValue("RollbackLinkeBahamutAdminpipelinerollbackexistedResponse.RequestId"));
		rollbackLinkeBahamutAdminpipelinerollbackexistedResponse.setResultCode(_ctx.stringValue("RollbackLinkeBahamutAdminpipelinerollbackexistedResponse.ResultCode"));
		rollbackLinkeBahamutAdminpipelinerollbackexistedResponse.setResultMessage(_ctx.stringValue("RollbackLinkeBahamutAdminpipelinerollbackexistedResponse.ResultMessage"));
		rollbackLinkeBahamutAdminpipelinerollbackexistedResponse.setErrorMessage(_ctx.stringValue("RollbackLinkeBahamutAdminpipelinerollbackexistedResponse.ErrorMessage"));
		rollbackLinkeBahamutAdminpipelinerollbackexistedResponse.setErrorMsgParamsMap(_ctx.stringValue("RollbackLinkeBahamutAdminpipelinerollbackexistedResponse.ErrorMsgParamsMap"));
		rollbackLinkeBahamutAdminpipelinerollbackexistedResponse.setMessage(_ctx.stringValue("RollbackLinkeBahamutAdminpipelinerollbackexistedResponse.Message"));
		rollbackLinkeBahamutAdminpipelinerollbackexistedResponse.setResponseStatusCode(_ctx.longValue("RollbackLinkeBahamutAdminpipelinerollbackexistedResponse.ResponseStatusCode"));
		rollbackLinkeBahamutAdminpipelinerollbackexistedResponse.setResult(_ctx.booleanValue("RollbackLinkeBahamutAdminpipelinerollbackexistedResponse.Result"));
		rollbackLinkeBahamutAdminpipelinerollbackexistedResponse.setSuccess(_ctx.booleanValue("RollbackLinkeBahamutAdminpipelinerollbackexistedResponse.Success"));
	 
	 	return rollbackLinkeBahamutAdminpipelinerollbackexistedResponse;
	}
}