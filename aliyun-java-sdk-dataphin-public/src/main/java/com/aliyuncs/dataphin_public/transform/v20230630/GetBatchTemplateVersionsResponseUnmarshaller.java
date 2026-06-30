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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTemplateVersionsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTemplateVersionsResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTemplateVersionsResponse.Data.TemplateVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBatchTemplateVersionsResponseUnmarshaller {

	public static GetBatchTemplateVersionsResponse unmarshall(GetBatchTemplateVersionsResponse getBatchTemplateVersionsResponse, UnmarshallerContext _ctx) {
		
		getBatchTemplateVersionsResponse.setRequestId(_ctx.stringValue("GetBatchTemplateVersionsResponse.RequestId"));
		getBatchTemplateVersionsResponse.setSuccess(_ctx.booleanValue("GetBatchTemplateVersionsResponse.Success"));
		getBatchTemplateVersionsResponse.setHttpStatusCode(_ctx.integerValue("GetBatchTemplateVersionsResponse.HttpStatusCode"));
		getBatchTemplateVersionsResponse.setCode(_ctx.stringValue("GetBatchTemplateVersionsResponse.Code"));
		getBatchTemplateVersionsResponse.setMessage(_ctx.stringValue("GetBatchTemplateVersionsResponse.Message"));

		Data data = new Data();

		List<TemplateVersion> templateVersionList = new ArrayList<TemplateVersion>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList.Length"); i++) {
			TemplateVersion templateVersion = new TemplateVersion();
			templateVersion.setId(_ctx.longValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].Id"));
			templateVersion.setProjectId(_ctx.longValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].ProjectId"));
			templateVersion.setName(_ctx.stringValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].Name"));
			templateVersion.setOperatorType(_ctx.integerValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].OperatorType"));
			templateVersion.setEngine(_ctx.stringValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].Engine"));
			templateVersion.setContent(_ctx.stringValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].Content"));
			templateVersion.setVersion(_ctx.longValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].Version"));
			templateVersion.setStatus(_ctx.stringValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].Status"));
			templateVersion.setDescription(_ctx.stringValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].Description"));
			templateVersion.setOwner(_ctx.stringValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].Owner"));
			templateVersion.setOwnerId(_ctx.stringValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].OwnerId"));
			templateVersion.setComment(_ctx.stringValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].Comment"));
			templateVersion.setModifier(_ctx.stringValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].Modifier"));
			templateVersion.setModifierId(_ctx.stringValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].ModifierId"));
			templateVersion.setGmtCreate(_ctx.stringValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].GmtCreate"));
			templateVersion.setGmtModified(_ctx.stringValue("GetBatchTemplateVersionsResponse.Data.TemplateVersionList["+ i +"].GmtModified"));

			templateVersionList.add(templateVersion);
		}
		data.setTemplateVersionList(templateVersionList);
		getBatchTemplateVersionsResponse.setData(data);
	 
	 	return getBatchTemplateVersionsResponse;
	}
}