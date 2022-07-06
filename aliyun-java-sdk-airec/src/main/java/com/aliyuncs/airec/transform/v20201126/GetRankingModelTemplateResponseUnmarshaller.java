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

import com.aliyuncs.airec.model.v20201126.GetRankingModelTemplateResponse;
import com.aliyuncs.airec.model.v20201126.GetRankingModelTemplateResponse.Result;
import com.aliyuncs.airec.model.v20201126.GetRankingModelTemplateResponse.Result.Meta;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRankingModelTemplateResponseUnmarshaller {

	public static GetRankingModelTemplateResponse unmarshall(GetRankingModelTemplateResponse getRankingModelTemplateResponse, UnmarshallerContext _ctx) {
		
		getRankingModelTemplateResponse.setRequestId(_ctx.stringValue("GetRankingModelTemplateResponse.requestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("GetRankingModelTemplateResponse.result.Status"));
		result.setVersionNum(_ctx.longValue("GetRankingModelTemplateResponse.result.VersionNum"));
		result.setTemplateId(_ctx.stringValue("GetRankingModelTemplateResponse.result.TemplateId"));

		Meta meta = new Meta();
		meta.setAuthorized(_ctx.booleanValue("GetRankingModelTemplateResponse.result.Meta.Authorized"));
		meta.setAutoRun(_ctx.booleanValue("GetRankingModelTemplateResponse.result.Meta.AutoRun"));
		meta.setAutoRunTime(_ctx.longValue("GetRankingModelTemplateResponse.result.Meta.AutoRunTime"));
		meta.setAutoRunType(_ctx.stringValue("GetRankingModelTemplateResponse.result.Meta.AutoRunType"));
		meta.setConf(_ctx.stringValue("GetRankingModelTemplateResponse.result.Meta.Conf"));
		meta.setLastEditTime(_ctx.stringValue("GetRankingModelTemplateResponse.result.Meta.LastEditTime"));
		meta.setOssArn(_ctx.stringValue("GetRankingModelTemplateResponse.result.Meta.OssArn"));
		meta.setOssBucket(_ctx.stringValue("GetRankingModelTemplateResponse.result.Meta.OssBucket"));
		meta.setOssEndpoint(_ctx.stringValue("GetRankingModelTemplateResponse.result.Meta.OssEndpoint"));
		meta.setSampleId(_ctx.stringValue("GetRankingModelTemplateResponse.result.Meta.SampleId"));
		meta.setSampleName(_ctx.stringValue("GetRankingModelTemplateResponse.result.Meta.SampleName"));
		meta.setSampleTimeWindow(_ctx.longValue("GetRankingModelTemplateResponse.result.Meta.SampleTimeWindow"));
		meta.setSampleTimeWindowType(_ctx.stringValue("GetRankingModelTemplateResponse.result.Meta.SampleTimeWindowType"));
		meta.setType(_ctx.stringValue("GetRankingModelTemplateResponse.result.Meta.Type"));
		meta.setName(_ctx.stringValue("GetRankingModelTemplateResponse.result.Meta.Name"));
		meta.setDeployStatus(_ctx.stringValue("GetRankingModelTemplateResponse.result.Meta.DeployStatus"));
		meta.setCanDeploy(_ctx.booleanValue("GetRankingModelTemplateResponse.result.Meta.CanDeploy"));
		result.setMeta(meta);
		getRankingModelTemplateResponse.setResult(result);
	 
	 	return getRankingModelTemplateResponse;
	}
}