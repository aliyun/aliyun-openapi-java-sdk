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

import com.aliyuncs.airec.model.v20201126.ModifyRankingModelTemplateResponse;
import com.aliyuncs.airec.model.v20201126.ModifyRankingModelTemplateResponse.Result;
import com.aliyuncs.airec.model.v20201126.ModifyRankingModelTemplateResponse.Result.Meta;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyRankingModelTemplateResponseUnmarshaller {

	public static ModifyRankingModelTemplateResponse unmarshall(ModifyRankingModelTemplateResponse modifyRankingModelTemplateResponse, UnmarshallerContext _ctx) {
		
		modifyRankingModelTemplateResponse.setRequestId(_ctx.stringValue("ModifyRankingModelTemplateResponse.requestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("ModifyRankingModelTemplateResponse.result.Status"));
		result.setVersionNum(_ctx.longValue("ModifyRankingModelTemplateResponse.result.VersionNum"));
		result.setTemplateId(_ctx.stringValue("ModifyRankingModelTemplateResponse.result.TemplateId"));

		Meta meta = new Meta();
		meta.setAuthorized(_ctx.booleanValue("ModifyRankingModelTemplateResponse.result.Meta.Authorized"));
		meta.setAutoRun(_ctx.booleanValue("ModifyRankingModelTemplateResponse.result.Meta.AutoRun"));
		meta.setAutoRunTime(_ctx.longValue("ModifyRankingModelTemplateResponse.result.Meta.AutoRunTime"));
		meta.setAutoRunType(_ctx.stringValue("ModifyRankingModelTemplateResponse.result.Meta.AutoRunType"));
		meta.setConf(_ctx.stringValue("ModifyRankingModelTemplateResponse.result.Meta.Conf"));
		meta.setLastEditTime(_ctx.stringValue("ModifyRankingModelTemplateResponse.result.Meta.LastEditTime"));
		meta.setOssArn(_ctx.stringValue("ModifyRankingModelTemplateResponse.result.Meta.OssArn"));
		meta.setOssBucket(_ctx.stringValue("ModifyRankingModelTemplateResponse.result.Meta.OssBucket"));
		meta.setOssEndpoint(_ctx.stringValue("ModifyRankingModelTemplateResponse.result.Meta.OssEndpoint"));
		meta.setSampleId(_ctx.stringValue("ModifyRankingModelTemplateResponse.result.Meta.SampleId"));
		meta.setSampleName(_ctx.stringValue("ModifyRankingModelTemplateResponse.result.Meta.SampleName"));
		meta.setSampleTimeWindow(_ctx.longValue("ModifyRankingModelTemplateResponse.result.Meta.SampleTimeWindow"));
		meta.setSampleTimeWindowType(_ctx.stringValue("ModifyRankingModelTemplateResponse.result.Meta.SampleTimeWindowType"));
		meta.setType(_ctx.stringValue("ModifyRankingModelTemplateResponse.result.Meta.Type"));
		meta.setName(_ctx.stringValue("ModifyRankingModelTemplateResponse.result.Meta.Name"));
		meta.setDeployStatus(_ctx.stringValue("ModifyRankingModelTemplateResponse.result.Meta.DeployStatus"));
		meta.setCanDeploy(_ctx.booleanValue("ModifyRankingModelTemplateResponse.result.Meta.CanDeploy"));
		result.setMeta(meta);
		modifyRankingModelTemplateResponse.setResult(result);
	 
	 	return modifyRankingModelTemplateResponse;
	}
}