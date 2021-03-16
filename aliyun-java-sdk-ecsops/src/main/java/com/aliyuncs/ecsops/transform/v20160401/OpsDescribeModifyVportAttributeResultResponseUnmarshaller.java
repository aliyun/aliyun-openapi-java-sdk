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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeModifyVportAttributeResultResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeModifyVportAttributeResultResponse.FailedEniListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeModifyVportAttributeResultResponseUnmarshaller {

	public static OpsDescribeModifyVportAttributeResultResponse unmarshall(OpsDescribeModifyVportAttributeResultResponse opsDescribeModifyVportAttributeResultResponse, UnmarshallerContext _ctx) {
		
		opsDescribeModifyVportAttributeResultResponse.setRequestId(_ctx.stringValue("OpsDescribeModifyVportAttributeResultResponse.RequestId"));
		opsDescribeModifyVportAttributeResultResponse.setWorkflowToken(_ctx.stringValue("OpsDescribeModifyVportAttributeResultResponse.WorkflowToken"));

		List<FailedEniListItem> failedEniList = new ArrayList<FailedEniListItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeModifyVportAttributeResultResponse.FailedEniList.Length"); i++) {
			FailedEniListItem failedEniListItem = new FailedEniListItem();
			failedEniListItem.setEniName(_ctx.stringValue("OpsDescribeModifyVportAttributeResultResponse.FailedEniList["+ i +"].EniName"));
			failedEniListItem.setCode(_ctx.integerValue("OpsDescribeModifyVportAttributeResultResponse.FailedEniList["+ i +"].Code"));
			failedEniListItem.setMessage(_ctx.stringValue("OpsDescribeModifyVportAttributeResultResponse.FailedEniList["+ i +"].Message"));

			failedEniList.add(failedEniListItem);
		}
		opsDescribeModifyVportAttributeResultResponse.setFailedEniList(failedEniList);
	 
	 	return opsDescribeModifyVportAttributeResultResponse;
	}
}