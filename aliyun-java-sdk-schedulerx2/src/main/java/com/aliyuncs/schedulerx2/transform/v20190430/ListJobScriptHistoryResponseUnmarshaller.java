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

package com.aliyuncs.schedulerx2.transform.v20190430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx2.model.v20190430.ListJobScriptHistoryResponse;
import com.aliyuncs.schedulerx2.model.v20190430.ListJobScriptHistoryResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.ListJobScriptHistoryResponse.Data.JobScriptHistoryInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobScriptHistoryResponseUnmarshaller {

	public static ListJobScriptHistoryResponse unmarshall(ListJobScriptHistoryResponse listJobScriptHistoryResponse, UnmarshallerContext _ctx) {
		
		listJobScriptHistoryResponse.setRequestId(_ctx.stringValue("ListJobScriptHistoryResponse.RequestId"));
		listJobScriptHistoryResponse.setCode(_ctx.integerValue("ListJobScriptHistoryResponse.Code"));
		listJobScriptHistoryResponse.setMessage(_ctx.stringValue("ListJobScriptHistoryResponse.Message"));
		listJobScriptHistoryResponse.setSuccess(_ctx.booleanValue("ListJobScriptHistoryResponse.Success"));

		Data data = new Data();

		List<JobScriptHistoryInfo> jobScriptHistoryInfos = new ArrayList<JobScriptHistoryInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListJobScriptHistoryResponse.Data.JobScriptHistoryInfos.Length"); i++) {
			JobScriptHistoryInfo jobScriptHistoryInfo = new JobScriptHistoryInfo();
			jobScriptHistoryInfo.setVersionesDescription(_ctx.stringValue("ListJobScriptHistoryResponse.Data.JobScriptHistoryInfos["+ i +"].VersionesDescription"));
			jobScriptHistoryInfo.setCreator(_ctx.stringValue("ListJobScriptHistoryResponse.Data.JobScriptHistoryInfos["+ i +"].Creator"));
			jobScriptHistoryInfo.setCreateTime(_ctx.stringValue("ListJobScriptHistoryResponse.Data.JobScriptHistoryInfos["+ i +"].CreateTime"));
			jobScriptHistoryInfo.setScriptContent(_ctx.stringValue("ListJobScriptHistoryResponse.Data.JobScriptHistoryInfos["+ i +"].ScriptContent"));

			jobScriptHistoryInfos.add(jobScriptHistoryInfo);
		}
		data.setJobScriptHistoryInfos(jobScriptHistoryInfos);
		listJobScriptHistoryResponse.setData(data);
	 
	 	return listJobScriptHistoryResponse;
	}
}