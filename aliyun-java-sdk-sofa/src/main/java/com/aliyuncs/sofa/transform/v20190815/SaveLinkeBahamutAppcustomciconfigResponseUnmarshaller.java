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

import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutAppcustomciconfigResponse;
import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutAppcustomciconfigResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeBahamutAppcustomciconfigResponseUnmarshaller {

	public static SaveLinkeBahamutAppcustomciconfigResponse unmarshall(SaveLinkeBahamutAppcustomciconfigResponse saveLinkeBahamutAppcustomciconfigResponse, UnmarshallerContext _ctx) {
		
		saveLinkeBahamutAppcustomciconfigResponse.setRequestId(_ctx.stringValue("SaveLinkeBahamutAppcustomciconfigResponse.RequestId"));
		saveLinkeBahamutAppcustomciconfigResponse.setResultCode(_ctx.stringValue("SaveLinkeBahamutAppcustomciconfigResponse.ResultCode"));
		saveLinkeBahamutAppcustomciconfigResponse.setResultMessage(_ctx.stringValue("SaveLinkeBahamutAppcustomciconfigResponse.ResultMessage"));
		saveLinkeBahamutAppcustomciconfigResponse.setErrorMessage(_ctx.stringValue("SaveLinkeBahamutAppcustomciconfigResponse.ErrorMessage"));
		saveLinkeBahamutAppcustomciconfigResponse.setErrorMsgParamsMap(_ctx.stringValue("SaveLinkeBahamutAppcustomciconfigResponse.ErrorMsgParamsMap"));
		saveLinkeBahamutAppcustomciconfigResponse.setMessage(_ctx.stringValue("SaveLinkeBahamutAppcustomciconfigResponse.Message"));
		saveLinkeBahamutAppcustomciconfigResponse.setResponseStatusCode(_ctx.longValue("SaveLinkeBahamutAppcustomciconfigResponse.ResponseStatusCode"));
		saveLinkeBahamutAppcustomciconfigResponse.setSuccess(_ctx.booleanValue("SaveLinkeBahamutAppcustomciconfigResponse.Success"));

		Result result = new Result();
		result.setAppId(_ctx.stringValue("SaveLinkeBahamutAppcustomciconfigResponse.Result.AppId"));
		result.setBranch(_ctx.stringValue("SaveLinkeBahamutAppcustomciconfigResponse.Result.Branch"));
		result.setCreated(_ctx.longValue("SaveLinkeBahamutAppcustomciconfigResponse.Result.Created"));
		result.setCrontab(_ctx.stringValue("SaveLinkeBahamutAppcustomciconfigResponse.Result.Crontab"));
		result.setDeleted(_ctx.booleanValue("SaveLinkeBahamutAppcustomciconfigResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("SaveLinkeBahamutAppcustomciconfigResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("SaveLinkeBahamutAppcustomciconfigResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("SaveLinkeBahamutAppcustomciconfigResponse.Result.Name"));
		result.setPipelineInstanceId(_ctx.longValue("SaveLinkeBahamutAppcustomciconfigResponse.Result.PipelineInstanceId"));
		result.setPipelineTemplateId(_ctx.longValue("SaveLinkeBahamutAppcustomciconfigResponse.Result.PipelineTemplateId"));
		result.setPipelineTemplateName(_ctx.stringValue("SaveLinkeBahamutAppcustomciconfigResponse.Result.PipelineTemplateName"));
		result.setTenantId(_ctx.stringValue("SaveLinkeBahamutAppcustomciconfigResponse.Result.TenantId"));
		saveLinkeBahamutAppcustomciconfigResponse.setResult(result);
	 
	 	return saveLinkeBahamutAppcustomciconfigResponse;
	}
}