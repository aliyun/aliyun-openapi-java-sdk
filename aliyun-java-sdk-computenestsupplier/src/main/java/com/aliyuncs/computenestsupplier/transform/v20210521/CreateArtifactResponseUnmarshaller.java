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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import com.aliyuncs.computenestsupplier.model.v20210521.CreateArtifactResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateArtifactResponseUnmarshaller {

	public static CreateArtifactResponse unmarshall(CreateArtifactResponse createArtifactResponse, UnmarshallerContext _ctx) {
		
		createArtifactResponse.setRequestId(_ctx.stringValue("CreateArtifactResponse.RequestId"));
		createArtifactResponse.setArtifactId(_ctx.stringValue("CreateArtifactResponse.ArtifactId"));
		createArtifactResponse.setArtifactType(_ctx.stringValue("CreateArtifactResponse.ArtifactType"));
		createArtifactResponse.setName(_ctx.stringValue("CreateArtifactResponse.Name"));
		createArtifactResponse.setVersionName(_ctx.stringValue("CreateArtifactResponse.VersionName"));
		createArtifactResponse.setArtifactVersion(_ctx.stringValue("CreateArtifactResponse.ArtifactVersion"));
		createArtifactResponse.setDescription(_ctx.stringValue("CreateArtifactResponse.Description"));
		createArtifactResponse.setGmtModified(_ctx.stringValue("CreateArtifactResponse.GmtModified"));
		createArtifactResponse.setStatus(_ctx.stringValue("CreateArtifactResponse.Status"));
		createArtifactResponse.setMaxVersion(_ctx.longValue("CreateArtifactResponse.MaxVersion"));
		createArtifactResponse.setArtifactProperty(_ctx.stringValue("CreateArtifactResponse.ArtifactProperty"));
		createArtifactResponse.setSupportRegionIds(_ctx.stringValue("CreateArtifactResponse.SupportRegionIds"));
	 
	 	return createArtifactResponse;
	}
}