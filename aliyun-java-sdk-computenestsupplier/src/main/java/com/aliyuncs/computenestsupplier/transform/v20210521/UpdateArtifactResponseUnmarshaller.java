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

import com.aliyuncs.computenestsupplier.model.v20210521.UpdateArtifactResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateArtifactResponseUnmarshaller {

	public static UpdateArtifactResponse unmarshall(UpdateArtifactResponse updateArtifactResponse, UnmarshallerContext _ctx) {
		
		updateArtifactResponse.setRequestId(_ctx.stringValue("UpdateArtifactResponse.RequestId"));
		updateArtifactResponse.setArtifactId(_ctx.stringValue("UpdateArtifactResponse.ArtifactId"));
		updateArtifactResponse.setArtifactType(_ctx.stringValue("UpdateArtifactResponse.ArtifactType"));
		updateArtifactResponse.setVersionName(_ctx.stringValue("UpdateArtifactResponse.VersionName"));
		updateArtifactResponse.setArtifactVersion(_ctx.stringValue("UpdateArtifactResponse.ArtifactVersion"));
		updateArtifactResponse.setDescription(_ctx.stringValue("UpdateArtifactResponse.Description"));
		updateArtifactResponse.setGmtModified(_ctx.stringValue("UpdateArtifactResponse.GmtModified"));
		updateArtifactResponse.setStatus(_ctx.stringValue("UpdateArtifactResponse.Status"));
		updateArtifactResponse.setArtifactProperty(_ctx.stringValue("UpdateArtifactResponse.ArtifactProperty"));
		updateArtifactResponse.setSupportRegionIds(_ctx.stringValue("UpdateArtifactResponse.SupportRegionIds"));
	 
	 	return updateArtifactResponse;
	}
}