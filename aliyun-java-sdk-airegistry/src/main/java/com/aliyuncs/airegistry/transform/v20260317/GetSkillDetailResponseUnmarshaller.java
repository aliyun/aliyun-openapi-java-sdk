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

package com.aliyuncs.airegistry.transform.v20260317;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airegistry.model.v20260317.GetSkillDetailResponse;
import com.aliyuncs.airegistry.model.v20260317.GetSkillDetailResponse.Data;
import com.aliyuncs.airegistry.model.v20260317.GetSkillDetailResponse.Data.Version;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSkillDetailResponseUnmarshaller {

	public static GetSkillDetailResponse unmarshall(GetSkillDetailResponse getSkillDetailResponse, UnmarshallerContext _ctx) {
		
		getSkillDetailResponse.setRequestId(_ctx.stringValue("GetSkillDetailResponse.RequestId"));

		Data data = new Data();
		data.setWriteable(_ctx.booleanValue("GetSkillDetailResponse.Data.Writeable"));
		data.setUpdateTime(_ctx.longValue("GetSkillDetailResponse.Data.UpdateTime"));
		data.setEnable(_ctx.booleanValue("GetSkillDetailResponse.Data.Enable"));
		data.setBizTags(_ctx.stringValue("GetSkillDetailResponse.Data.BizTags"));
		data.setFrom(_ctx.stringValue("GetSkillDetailResponse.Data.From"));
		data.setScope(_ctx.stringValue("GetSkillDetailResponse.Data.Scope"));
		data.setLabels(_ctx.mapValue("GetSkillDetailResponse.Data.Labels"));
		data.setEditingVersion(_ctx.stringValue("GetSkillDetailResponse.Data.EditingVersion"));
		data.setReviewingVersion(_ctx.stringValue("GetSkillDetailResponse.Data.ReviewingVersion"));
		data.setOnlineCnt(_ctx.integerValue("GetSkillDetailResponse.Data.OnlineCnt"));
		data.setDownloadCount(_ctx.longValue("GetSkillDetailResponse.Data.DownloadCount"));
		data.setNamespaceId(_ctx.stringValue("GetSkillDetailResponse.Data.NamespaceId"));
		data.setName(_ctx.stringValue("GetSkillDetailResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("GetSkillDetailResponse.Data.Description"));
		data.setOwner(_ctx.stringValue("GetSkillDetailResponse.Data.Owner"));

		List<Version> versions = new ArrayList<Version>();
		for (int i = 0; i < _ctx.lengthValue("GetSkillDetailResponse.Data.Versions.Length"); i++) {
			Version version = new Version();
			version.setVersion(_ctx.stringValue("GetSkillDetailResponse.Data.Versions["+ i +"].Version"));
			version.setStatus(_ctx.stringValue("GetSkillDetailResponse.Data.Versions["+ i +"].Status"));
			version.setAuthor(_ctx.stringValue("GetSkillDetailResponse.Data.Versions["+ i +"].Author"));
			version.setDescription(_ctx.stringValue("GetSkillDetailResponse.Data.Versions["+ i +"].Description"));
			version.setCreateTime(_ctx.longValue("GetSkillDetailResponse.Data.Versions["+ i +"].CreateTime"));
			version.setUpdateTime(_ctx.longValue("GetSkillDetailResponse.Data.Versions["+ i +"].UpdateTime"));
			version.setPublishPipelineInfo(_ctx.stringValue("GetSkillDetailResponse.Data.Versions["+ i +"].PublishPipelineInfo"));
			version.setDownloadCount(_ctx.longValue("GetSkillDetailResponse.Data.Versions["+ i +"].DownloadCount"));
			version.setCommitMsg(_ctx.stringValue("GetSkillDetailResponse.Data.Versions["+ i +"].CommitMsg"));

			versions.add(version);
		}
		data.setVersions(versions);
		getSkillDetailResponse.setData(data);
	 
	 	return getSkillDetailResponse;
	}
}