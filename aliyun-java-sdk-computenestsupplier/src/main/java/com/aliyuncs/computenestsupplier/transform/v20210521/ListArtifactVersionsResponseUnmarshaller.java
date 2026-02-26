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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.ListArtifactVersionsResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.ListArtifactVersionsResponse.Artifact;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListArtifactVersionsResponseUnmarshaller {

	public static ListArtifactVersionsResponse unmarshall(ListArtifactVersionsResponse listArtifactVersionsResponse, UnmarshallerContext _ctx) {
		
		listArtifactVersionsResponse.setRequestId(_ctx.stringValue("ListArtifactVersionsResponse.RequestId"));
		listArtifactVersionsResponse.setNextToken(_ctx.stringValue("ListArtifactVersionsResponse.NextToken"));
		listArtifactVersionsResponse.setMaxResults(_ctx.integerValue("ListArtifactVersionsResponse.MaxResults"));
		listArtifactVersionsResponse.setTotalCount(_ctx.integerValue("ListArtifactVersionsResponse.TotalCount"));

		List<Artifact> artifacts = new ArrayList<Artifact>();
		for (int i = 0; i < _ctx.lengthValue("ListArtifactVersionsResponse.Artifacts.Length"); i++) {
			Artifact artifact = new Artifact();
			artifact.setArtifactId(_ctx.stringValue("ListArtifactVersionsResponse.Artifacts["+ i +"].ArtifactId"));
			artifact.setArtifactType(_ctx.stringValue("ListArtifactVersionsResponse.Artifacts["+ i +"].ArtifactType"));
			artifact.setVersionName(_ctx.stringValue("ListArtifactVersionsResponse.Artifacts["+ i +"].VersionName"));
			artifact.setArtifactVersion(_ctx.stringValue("ListArtifactVersionsResponse.Artifacts["+ i +"].ArtifactVersion"));
			artifact.setStatus(_ctx.stringValue("ListArtifactVersionsResponse.Artifacts["+ i +"].Status"));
			artifact.setArtifactProperty(_ctx.stringValue("ListArtifactVersionsResponse.Artifacts["+ i +"].ArtifactProperty"));
			artifact.setSupportRegionIds(_ctx.stringValue("ListArtifactVersionsResponse.Artifacts["+ i +"].SupportRegionIds"));
			artifact.setGmtModified(_ctx.stringValue("ListArtifactVersionsResponse.Artifacts["+ i +"].GmtModified"));
			artifact.setProgress(_ctx.stringValue("ListArtifactVersionsResponse.Artifacts["+ i +"].Progress"));
			artifact.setGmtCreate(_ctx.stringValue("ListArtifactVersionsResponse.Artifacts["+ i +"].GmtCreate"));
			artifact.setImageDelivery(_ctx.mapValue("ListArtifactVersionsResponse.Artifacts["+ i +"].ImageDelivery"));
			artifact.setSecurityAuditResult(_ctx.stringValue("ListArtifactVersionsResponse.Artifacts["+ i +"].SecurityAuditResult"));
			artifact.setResultFile(_ctx.stringValue("ListArtifactVersionsResponse.Artifacts["+ i +"].ResultFile"));

			artifacts.add(artifact);
		}
		listArtifactVersionsResponse.setArtifacts(artifacts);
	 
	 	return listArtifactVersionsResponse;
	}
}