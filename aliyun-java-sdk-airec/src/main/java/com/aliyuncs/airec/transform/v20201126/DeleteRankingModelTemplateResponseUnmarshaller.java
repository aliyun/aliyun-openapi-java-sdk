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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.DeleteRankingModelTemplateResponse;
import com.aliyuncs.airec.model.v20201126.DeleteRankingModelTemplateResponse.Result;
import com.aliyuncs.airec.model.v20201126.DeleteRankingModelTemplateResponse.Result.Meta;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRankingModelTemplateResponseUnmarshaller {

	public static DeleteRankingModelTemplateResponse unmarshall(DeleteRankingModelTemplateResponse deleteRankingModelTemplateResponse, UnmarshallerContext _ctx) {
		
		deleteRankingModelTemplateResponse.setRequestId(_ctx.stringValue("DeleteRankingModelTemplateResponse.requestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("DeleteRankingModelTemplateResponse.result.Status"));
		result.setVersionNum(_ctx.longValue("DeleteRankingModelTemplateResponse.result.VersionNum"));
		result.setTemplateId(_ctx.stringValue("DeleteRankingModelTemplateResponse.result.TemplateId"));

		Meta meta = new Meta();
		meta.setAuthorized(_ctx.booleanValue("DeleteRankingModelTemplateResponse.result.Meta.Authorized"));
		meta.setAutoRun(_ctx.booleanValue("DeleteRankingModelTemplateResponse.result.Meta.AutoRun"));
		meta.setAutoRunTime(_ctx.longValue("DeleteRankingModelTemplateResponse.result.Meta.AutoRunTime"));
		meta.setAutoRunType(_ctx.stringValue("DeleteRankingModelTemplateResponse.result.Meta.AutoRunType"));
		meta.setConf(_ctx.stringValue("DeleteRankingModelTemplateResponse.result.Meta.Conf"));
		meta.setLastEditTime(_ctx.stringValue("DeleteRankingModelTemplateResponse.result.Meta.LastEditTime"));
		meta.setOssArn(_ctx.stringValue("DeleteRankingModelTemplateResponse.result.Meta.OssArn"));
		meta.setOssBucket(_ctx.stringValue("DeleteRankingModelTemplateResponse.result.Meta.OssBucket"));
		meta.setOssEndpoint(_ctx.stringValue("DeleteRankingModelTemplateResponse.result.Meta.OssEndpoint"));
		meta.setSampleId(_ctx.stringValue("DeleteRankingModelTemplateResponse.result.Meta.SampleId"));
		meta.setSampleName(_ctx.stringValue("DeleteRankingModelTemplateResponse.result.Meta.SampleName"));
		meta.setSampleTimeWindow(_ctx.longValue("DeleteRankingModelTemplateResponse.result.Meta.SampleTimeWindow"));
		meta.setSampleTimeWindowType(_ctx.stringValue("DeleteRankingModelTemplateResponse.result.Meta.SampleTimeWindowType"));
		meta.setType(_ctx.stringValue("DeleteRankingModelTemplateResponse.result.Meta.Type"));
		meta.setName(_ctx.stringValue("DeleteRankingModelTemplateResponse.result.Meta.Name"));
		meta.setDeployStatus(_ctx.stringValue("DeleteRankingModelTemplateResponse.result.Meta.DeployStatus"));
		meta.setCanDeploy(_ctx.booleanValue("DeleteRankingModelTemplateResponse.result.Meta.CanDeploy"));
		result.setMeta(meta);
		deleteRankingModelTemplateResponse.setResult(result);
	 
	 	return deleteRankingModelTemplateResponse;
	}
}