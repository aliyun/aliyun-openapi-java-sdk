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

import com.aliyuncs.airegistry.model.v20260317.GetPromptResponse;
import com.aliyuncs.airegistry.model.v20260317.GetPromptResponse.Data;
import com.aliyuncs.airegistry.model.v20260317.GetPromptResponse.Data.VersionDetail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPromptResponseUnmarshaller {

	public static GetPromptResponse unmarshall(GetPromptResponse getPromptResponse, UnmarshallerContext _ctx) {
		
		getPromptResponse.setRequestId(_ctx.stringValue("GetPromptResponse.RequestId"));

		Data data = new Data();
		data.setSchemaVersion(_ctx.integerValue("GetPromptResponse.Data.SchemaVersion"));
		data.setPromptKey(_ctx.stringValue("GetPromptResponse.Data.PromptKey"));
		data.setDescription(_ctx.stringValue("GetPromptResponse.Data.Description"));
		data.setLatestVersion(_ctx.stringValue("GetPromptResponse.Data.LatestVersion"));
		data.setGmtModified(_ctx.longValue("GetPromptResponse.Data.GmtModified"));
		data.setEditingVersion(_ctx.stringValue("GetPromptResponse.Data.EditingVersion"));
		data.setReviewingVersion(_ctx.stringValue("GetPromptResponse.Data.ReviewingVersion"));
		data.setOnlineCnt(_ctx.integerValue("GetPromptResponse.Data.OnlineCnt"));
		data.setLabels(_ctx.mapValue("GetPromptResponse.Data.Labels"));

		List<String> bizTags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPromptResponse.Data.BizTags.Length"); i++) {
			bizTags.add(_ctx.stringValue("GetPromptResponse.Data.BizTags["+ i +"]"));
		}
		data.setBizTags(bizTags);

		List<String> versions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPromptResponse.Data.Versions.Length"); i++) {
			versions.add(_ctx.stringValue("GetPromptResponse.Data.Versions["+ i +"]"));
		}
		data.setVersions(versions);

		List<VersionDetail> versionDetails = new ArrayList<VersionDetail>();
		for (int i = 0; i < _ctx.lengthValue("GetPromptResponse.Data.VersionDetails.Length"); i++) {
			VersionDetail versionDetail = new VersionDetail();
			versionDetail.setPromptKey(_ctx.stringValue("GetPromptResponse.Data.VersionDetails["+ i +"].PromptKey"));
			versionDetail.setVersion(_ctx.stringValue("GetPromptResponse.Data.VersionDetails["+ i +"].Version"));
			versionDetail.setStatus(_ctx.stringValue("GetPromptResponse.Data.VersionDetails["+ i +"].Status"));
			versionDetail.setCommitMsg(_ctx.stringValue("GetPromptResponse.Data.VersionDetails["+ i +"].CommitMsg"));
			versionDetail.setSrcUser(_ctx.stringValue("GetPromptResponse.Data.VersionDetails["+ i +"].SrcUser"));
			versionDetail.setGmtModified(_ctx.longValue("GetPromptResponse.Data.VersionDetails["+ i +"].GmtModified"));

			versionDetails.add(versionDetail);
		}
		data.setVersionDetails(versionDetails);
		getPromptResponse.setData(data);
	 
	 	return getPromptResponse;
	}
}