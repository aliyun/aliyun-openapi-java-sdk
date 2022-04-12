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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListDAGVersionsResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDAGVersionsResponse.DagVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDAGVersionsResponseUnmarshaller {

	public static ListDAGVersionsResponse unmarshall(ListDAGVersionsResponse listDAGVersionsResponse, UnmarshallerContext _ctx) {
		
		listDAGVersionsResponse.setRequestId(_ctx.stringValue("ListDAGVersionsResponse.RequestId"));
		listDAGVersionsResponse.setErrorCode(_ctx.stringValue("ListDAGVersionsResponse.ErrorCode"));
		listDAGVersionsResponse.setErrorMessage(_ctx.stringValue("ListDAGVersionsResponse.ErrorMessage"));
		listDAGVersionsResponse.setSuccess(_ctx.booleanValue("ListDAGVersionsResponse.Success"));
		listDAGVersionsResponse.setTotalCount(_ctx.integerValue("ListDAGVersionsResponse.TotalCount"));

		List<DagVersion> dagVersionList = new ArrayList<DagVersion>();
		for (int i = 0; i < _ctx.lengthValue("ListDAGVersionsResponse.DagVersionList.Length"); i++) {
			DagVersion dagVersion = new DagVersion();
			dagVersion.setDagName(_ctx.stringValue("ListDAGVersionsResponse.DagVersionList["+ i +"].DagName"));
			dagVersion.setDagOwnerId(_ctx.stringValue("ListDAGVersionsResponse.DagVersionList["+ i +"].DagOwnerId"));
			dagVersion.setDagOwnerNickName(_ctx.stringValue("ListDAGVersionsResponse.DagVersionList["+ i +"].DagOwnerNickName"));
			dagVersion.setVersionComments(_ctx.stringValue("ListDAGVersionsResponse.DagVersionList["+ i +"].VersionComments"));
			dagVersion.setVersionId(_ctx.longValue("ListDAGVersionsResponse.DagVersionList["+ i +"].VersionId"));
			dagVersion.setLastVersionId(_ctx.longValue("ListDAGVersionsResponse.DagVersionList["+ i +"].LastVersionId"));

			dagVersionList.add(dagVersion);
		}
		listDAGVersionsResponse.setDagVersionList(dagVersionList);
	 
	 	return listDAGVersionsResponse;
	}
}