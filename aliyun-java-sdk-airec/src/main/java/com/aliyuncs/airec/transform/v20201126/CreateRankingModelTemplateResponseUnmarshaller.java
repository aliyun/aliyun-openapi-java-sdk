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

import com.aliyuncs.airec.model.v20201126.CreateRankingModelTemplateResponse;
import com.aliyuncs.airec.model.v20201126.CreateRankingModelTemplateResponse.Result;
import com.aliyuncs.airec.model.v20201126.CreateRankingModelTemplateResponse.Result.Meta;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRankingModelTemplateResponseUnmarshaller {

	public static CreateRankingModelTemplateResponse unmarshall(CreateRankingModelTemplateResponse createRankingModelTemplateResponse, UnmarshallerContext _ctx) {
		
		createRankingModelTemplateResponse.setRequestId(_ctx.stringValue("CreateRankingModelTemplateResponse.requestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("CreateRankingModelTemplateResponse.result.Status"));
		result.setVersionNum(_ctx.longValue("CreateRankingModelTemplateResponse.result.VersionNum"));
		result.setTemplateId(_ctx.stringValue("CreateRankingModelTemplateResponse.result.TemplateId"));

		Meta meta = new Meta();
		meta.setAuthorized(_ctx.booleanValue("CreateRankingModelTemplateResponse.result.Meta.Authorized"));
		meta.setAutoRun(_ctx.booleanValue("CreateRankingModelTemplateResponse.result.Meta.AutoRun"));
		meta.setAutoRunTime(_ctx.longValue("CreateRankingModelTemplateResponse.result.Meta.AutoRunTime"));
		meta.setAutoRunType(_ctx.stringValue("CreateRankingModelTemplateResponse.result.Meta.AutoRunType"));
		meta.setConf(_ctx.stringValue("CreateRankingModelTemplateResponse.result.Meta.Conf"));
		meta.setLastEditTime(_ctx.stringValue("CreateRankingModelTemplateResponse.result.Meta.LastEditTime"));
		meta.setOssArn(_ctx.stringValue("CreateRankingModelTemplateResponse.result.Meta.OssArn"));
		meta.setOssBucket(_ctx.stringValue("CreateRankingModelTemplateResponse.result.Meta.OssBucket"));
		meta.setOssEndpoint(_ctx.stringValue("CreateRankingModelTemplateResponse.result.Meta.OssEndpoint"));
		meta.setSampleId(_ctx.stringValue("CreateRankingModelTemplateResponse.result.Meta.SampleId"));
		meta.setSampleName(_ctx.stringValue("CreateRankingModelTemplateResponse.result.Meta.SampleName"));
		meta.setSampleTimeWindow(_ctx.longValue("CreateRankingModelTemplateResponse.result.Meta.SampleTimeWindow"));
		meta.setSampleTimeWindowType(_ctx.stringValue("CreateRankingModelTemplateResponse.result.Meta.SampleTimeWindowType"));
		meta.setType(_ctx.stringValue("CreateRankingModelTemplateResponse.result.Meta.Type"));
		meta.setName(_ctx.stringValue("CreateRankingModelTemplateResponse.result.Meta.Name"));
		meta.setDeployStatus(_ctx.stringValue("CreateRankingModelTemplateResponse.result.Meta.DeployStatus"));
		meta.setCanDeploy(_ctx.booleanValue("CreateRankingModelTemplateResponse.result.Meta.CanDeploy"));
		result.setMeta(meta);
		createRankingModelTemplateResponse.setResult(result);
	 
	 	return createRankingModelTemplateResponse;
	}
}