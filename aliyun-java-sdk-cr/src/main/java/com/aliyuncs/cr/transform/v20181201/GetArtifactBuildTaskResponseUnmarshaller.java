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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.GetArtifactBuildTaskResponse;
import com.aliyuncs.cr.model.v20181201.GetArtifactBuildTaskResponse.SourceArtifact;
import com.aliyuncs.cr.model.v20181201.GetArtifactBuildTaskResponse.TargetArtifact;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetArtifactBuildTaskResponseUnmarshaller {

	public static GetArtifactBuildTaskResponse unmarshall(GetArtifactBuildTaskResponse getArtifactBuildTaskResponse, UnmarshallerContext _ctx) {
		
		getArtifactBuildTaskResponse.setRequestId(_ctx.stringValue("GetArtifactBuildTaskResponse.RequestId"));
		getArtifactBuildTaskResponse.setEndTime(_ctx.integerValue("GetArtifactBuildTaskResponse.EndTime"));
		getArtifactBuildTaskResponse.setStartTime(_ctx.integerValue("GetArtifactBuildTaskResponse.StartTime"));
		getArtifactBuildTaskResponse.setArtifactBuildType(_ctx.stringValue("GetArtifactBuildTaskResponse.ArtifactBuildType"));
		getArtifactBuildTaskResponse.setTaskStatus(_ctx.stringValue("GetArtifactBuildTaskResponse.TaskStatus"));
		getArtifactBuildTaskResponse.setBuildTaskId(_ctx.stringValue("GetArtifactBuildTaskResponse.BuildTaskId"));
		getArtifactBuildTaskResponse.setCode(_ctx.stringValue("GetArtifactBuildTaskResponse.Code"));
		getArtifactBuildTaskResponse.setIsSuccess(_ctx.booleanValue("GetArtifactBuildTaskResponse.IsSuccess"));

		List<String> instructions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetArtifactBuildTaskResponse.Instructions.Length"); i++) {
			instructions.add(_ctx.stringValue("GetArtifactBuildTaskResponse.Instructions["+ i +"]"));
		}
		getArtifactBuildTaskResponse.setInstructions(instructions);

		SourceArtifact sourceArtifact = new SourceArtifact();
		sourceArtifact.setRepoId(_ctx.stringValue("GetArtifactBuildTaskResponse.SourceArtifact.RepoId"));
		sourceArtifact.setVersion(_ctx.stringValue("GetArtifactBuildTaskResponse.SourceArtifact.Version"));
		sourceArtifact.setArtifactType(_ctx.stringValue("GetArtifactBuildTaskResponse.SourceArtifact.ArtifactType"));
		getArtifactBuildTaskResponse.setSourceArtifact(sourceArtifact);

		TargetArtifact targetArtifact = new TargetArtifact();
		targetArtifact.setRepoId(_ctx.stringValue("GetArtifactBuildTaskResponse.TargetArtifact.RepoId"));
		targetArtifact.setVersion(_ctx.stringValue("GetArtifactBuildTaskResponse.TargetArtifact.Version"));
		targetArtifact.setArtifactType(_ctx.stringValue("GetArtifactBuildTaskResponse.TargetArtifact.ArtifactType"));
		getArtifactBuildTaskResponse.setTargetArtifact(targetArtifact);
	 
	 	return getArtifactBuildTaskResponse;
	}
}