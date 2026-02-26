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

import com.aliyuncs.computenestsupplier.model.v20210521.GetArtifactResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.GetArtifactResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetArtifactResponseUnmarshaller {

	public static GetArtifactResponse unmarshall(GetArtifactResponse getArtifactResponse, UnmarshallerContext _ctx) {
		
		getArtifactResponse.setRequestId(_ctx.stringValue("GetArtifactResponse.RequestId"));
		getArtifactResponse.setArtifactId(_ctx.stringValue("GetArtifactResponse.ArtifactId"));
		getArtifactResponse.setArtifactType(_ctx.stringValue("GetArtifactResponse.ArtifactType"));
		getArtifactResponse.setName(_ctx.stringValue("GetArtifactResponse.Name"));
		getArtifactResponse.setVersionName(_ctx.stringValue("GetArtifactResponse.VersionName"));
		getArtifactResponse.setArtifactVersion(_ctx.stringValue("GetArtifactResponse.ArtifactVersion"));
		getArtifactResponse.setDescription(_ctx.stringValue("GetArtifactResponse.Description"));
		getArtifactResponse.setGmtModified(_ctx.stringValue("GetArtifactResponse.GmtModified"));
		getArtifactResponse.setStatus(_ctx.stringValue("GetArtifactResponse.Status"));
		getArtifactResponse.setMaxVersion(_ctx.longValue("GetArtifactResponse.MaxVersion"));
		getArtifactResponse.setArtifactProperty(_ctx.stringValue("GetArtifactResponse.ArtifactProperty"));
		getArtifactResponse.setSupportRegionIds(_ctx.stringValue("GetArtifactResponse.SupportRegionIds"));
		getArtifactResponse.setProgress(_ctx.stringValue("GetArtifactResponse.Progress"));
		getArtifactResponse.setResourceGroupId(_ctx.stringValue("GetArtifactResponse.ResourceGroupId"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetArtifactResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("GetArtifactResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("GetArtifactResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		getArtifactResponse.setTags(tags);
	 
	 	return getArtifactResponse;
	}
}