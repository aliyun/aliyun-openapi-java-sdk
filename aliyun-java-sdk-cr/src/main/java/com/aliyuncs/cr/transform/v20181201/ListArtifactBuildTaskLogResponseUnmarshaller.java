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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListArtifactBuildTaskLogResponse;
import com.aliyuncs.cr.model.v20181201.ListArtifactBuildTaskLogResponse.BuildTaskLogsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListArtifactBuildTaskLogResponseUnmarshaller {

	public static ListArtifactBuildTaskLogResponse unmarshall(ListArtifactBuildTaskLogResponse listArtifactBuildTaskLogResponse, UnmarshallerContext _ctx) {
		
		listArtifactBuildTaskLogResponse.setRequestId(_ctx.stringValue("ListArtifactBuildTaskLogResponse.RequestId"));
		listArtifactBuildTaskLogResponse.setCode(_ctx.stringValue("ListArtifactBuildTaskLogResponse.Code"));
		listArtifactBuildTaskLogResponse.setIsSuccess(_ctx.booleanValue("ListArtifactBuildTaskLogResponse.IsSuccess"));
		listArtifactBuildTaskLogResponse.setTotalCount(_ctx.integerValue("ListArtifactBuildTaskLogResponse.TotalCount"));

		List<BuildTaskLogsItem> buildTaskLogs = new ArrayList<BuildTaskLogsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListArtifactBuildTaskLogResponse.BuildTaskLogs.Length"); i++) {
			BuildTaskLogsItem buildTaskLogsItem = new BuildTaskLogsItem();
			buildTaskLogsItem.setMessage(_ctx.stringValue("ListArtifactBuildTaskLogResponse.BuildTaskLogs["+ i +"].Message"));
			buildTaskLogsItem.setLineNumber(_ctx.integerValue("ListArtifactBuildTaskLogResponse.BuildTaskLogs["+ i +"].LineNumber"));

			buildTaskLogs.add(buildTaskLogsItem);
		}
		listArtifactBuildTaskLogResponse.setBuildTaskLogs(buildTaskLogs);
	 
	 	return listArtifactBuildTaskLogResponse;
	}
}