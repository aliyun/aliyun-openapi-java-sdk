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

import com.aliyuncs.computenestsupplier.model.v20210521.ReleaseArtifactResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseArtifactResponseUnmarshaller {

	public static ReleaseArtifactResponse unmarshall(ReleaseArtifactResponse releaseArtifactResponse, UnmarshallerContext _ctx) {
		
		releaseArtifactResponse.setRequestId(_ctx.stringValue("ReleaseArtifactResponse.RequestId"));
		releaseArtifactResponse.setArtifactId(_ctx.stringValue("ReleaseArtifactResponse.ArtifactId"));
		releaseArtifactResponse.setArtifactType(_ctx.stringValue("ReleaseArtifactResponse.ArtifactType"));
		releaseArtifactResponse.setVersionName(_ctx.stringValue("ReleaseArtifactResponse.VersionName"));
		releaseArtifactResponse.setArtifactVersion(_ctx.stringValue("ReleaseArtifactResponse.ArtifactVersion"));
		releaseArtifactResponse.setDescription(_ctx.stringValue("ReleaseArtifactResponse.Description"));
		releaseArtifactResponse.setGmtModified(_ctx.stringValue("ReleaseArtifactResponse.GmtModified"));
		releaseArtifactResponse.setStatus(_ctx.stringValue("ReleaseArtifactResponse.Status"));
		releaseArtifactResponse.setArtifactProperty(_ctx.stringValue("ReleaseArtifactResponse.ArtifactProperty"));
	 
	 	return releaseArtifactResponse;
	}
}