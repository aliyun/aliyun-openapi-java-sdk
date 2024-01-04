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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.GetPipelineResponse;
import com.aliyuncs.devops.model.v20210625.GetPipelineResponse.Pipeline;
import com.aliyuncs.devops.model.v20210625.GetPipelineResponse.Pipeline.PipelineConfig;
import com.aliyuncs.devops.model.v20210625.GetPipelineResponse.Pipeline.PipelineConfig.Source;
import com.aliyuncs.devops.model.v20210625.GetPipelineResponse.Pipeline.PipelineConfig.Source.Data;
import com.aliyuncs.devops.model.v20210625.GetPipelineResponse.Pipeline.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPipelineResponseUnmarshaller {

	public static GetPipelineResponse unmarshall(GetPipelineResponse getPipelineResponse, UnmarshallerContext _ctx) {
		
		getPipelineResponse.setRequestId(_ctx.stringValue("GetPipelineResponse.requestId"));
		getPipelineResponse.setErrorMessage(_ctx.stringValue("GetPipelineResponse.errorMessage"));
		getPipelineResponse.setSuccess(_ctx.booleanValue("GetPipelineResponse.success"));
		getPipelineResponse.setErrorCode(_ctx.stringValue("GetPipelineResponse.errorCode"));

		Pipeline pipeline = new Pipeline();
		pipeline.setCreatorAccountId(_ctx.stringValue("GetPipelineResponse.pipeline.creatorAccountId"));
		pipeline.setEnvId(_ctx.integerValue("GetPipelineResponse.pipeline.envId"));
		pipeline.setEnvName(_ctx.stringValue("GetPipelineResponse.pipeline.envName"));
		pipeline.setCreateTime(_ctx.longValue("GetPipelineResponse.pipeline.createTime"));
		pipeline.setUpdateTime(_ctx.longValue("GetPipelineResponse.pipeline.updateTime"));
		pipeline.setGroupId(_ctx.longValue("GetPipelineResponse.pipeline.groupId"));
		pipeline.setModifierAccountId(_ctx.stringValue("GetPipelineResponse.pipeline.modifierAccountId"));
		pipeline.setName(_ctx.stringValue("GetPipelineResponse.pipeline.name"));

		PipelineConfig pipelineConfig = new PipelineConfig();
		pipelineConfig.setFlow(_ctx.stringValue("GetPipelineResponse.pipeline.pipelineConfig.flow"));
		pipelineConfig.setSettings(_ctx.stringValue("GetPipelineResponse.pipeline.pipelineConfig.settings"));

		List<Source> sources = new ArrayList<Source>();
		for (int i = 0; i < _ctx.lengthValue("GetPipelineResponse.pipeline.pipelineConfig.sources.Length"); i++) {
			Source source = new Source();
			source.setSign(_ctx.stringValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].sign"));
			source.setType(_ctx.stringValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].type"));

			Data data = new Data();
			data.setBranch(_ctx.stringValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.branch"));
			data.setServiceConnectionId(_ctx.longValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.serviceConnectionId"));
			data.setLabel(_ctx.stringValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.label"));
			data.setIsTrigger(_ctx.booleanValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.isTrigger"));
			data.setRepo(_ctx.stringValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.repo"));
			data.setTriggerFilter(_ctx.stringValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.triggerFilter"));
			data.setWebhook(_ctx.stringValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.webhook"));
			data.setIsBranchMode(_ctx.booleanValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.isBranchMode"));
			data.setIsSubmodule(_ctx.booleanValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.isSubmodule"));
			data.setIsCloneDepth(_ctx.booleanValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.isCloneDepth"));
			data.setCloneDepth(_ctx.longValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.cloneDepth"));
			data.setCredentialId(_ctx.longValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.credentialId"));
			data.setCredentialType(_ctx.stringValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.credentialType"));
			data.setCredentialLabel(_ctx.stringValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.credentialLabel"));
			data.setNamespace(_ctx.stringValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.namespace"));

			List<String> events = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.events.Length"); j++) {
				events.add(_ctx.stringValue("GetPipelineResponse.pipeline.pipelineConfig.sources["+ i +"].data.events["+ j +"]"));
			}
			data.setEvents(events);
			source.setData(data);

			sources.add(source);
		}
		pipelineConfig.setSources(sources);
		pipeline.setPipelineConfig(pipelineConfig);

		List<Tag> tagList = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetPipelineResponse.pipeline.tagList.Length"); i++) {
			Tag tag = new Tag();
			tag.setId(_ctx.longValue("GetPipelineResponse.pipeline.tagList["+ i +"].id"));
			tag.setName(_ctx.stringValue("GetPipelineResponse.pipeline.tagList["+ i +"].name"));

			tagList.add(tag);
		}
		pipeline.setTagList(tagList);
		getPipelineResponse.setPipeline(pipeline);
	 
	 	return getPipelineResponse;
	}
}