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

import com.aliyuncs.computenestsupplier.model.v20210521.ListArtifactsResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.ListArtifactsResponse.Artifact;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListArtifactsResponseUnmarshaller {

	public static ListArtifactsResponse unmarshall(ListArtifactsResponse listArtifactsResponse, UnmarshallerContext _ctx) {
		
		listArtifactsResponse.setRequestId(_ctx.stringValue("ListArtifactsResponse.RequestId"));
		listArtifactsResponse.setNextToken(_ctx.stringValue("ListArtifactsResponse.NextToken"));
		listArtifactsResponse.setMaxResults(_ctx.stringValue("ListArtifactsResponse.MaxResults"));
		listArtifactsResponse.setTotalCount(_ctx.stringValue("ListArtifactsResponse.TotalCount"));

		List<Artifact> artifacts = new ArrayList<Artifact>();
		for (int i = 0; i < _ctx.lengthValue("ListArtifactsResponse.Artifacts.Length"); i++) {
			Artifact artifact = new Artifact();
			artifact.setArtifactId(_ctx.stringValue("ListArtifactsResponse.Artifacts["+ i +"].ArtifactId"));
			artifact.setArtifactType(_ctx.stringValue("ListArtifactsResponse.Artifacts["+ i +"].ArtifactType"));
			artifact.setName(_ctx.stringValue("ListArtifactsResponse.Artifacts["+ i +"].Name"));
			artifact.setMaxVersion(_ctx.stringValue("ListArtifactsResponse.Artifacts["+ i +"].MaxVersion"));
			artifact.setDescription(_ctx.stringValue("ListArtifactsResponse.Artifacts["+ i +"].Description"));
			artifact.setGmtModified(_ctx.stringValue("ListArtifactsResponse.Artifacts["+ i +"].GmtModified"));
			artifact.setStatus(_ctx.stringValue("ListArtifactsResponse.Artifacts["+ i +"].Status"));

			artifacts.add(artifact);
		}
		listArtifactsResponse.setArtifacts(artifacts);
	 
	 	return listArtifactsResponse;
	}
}