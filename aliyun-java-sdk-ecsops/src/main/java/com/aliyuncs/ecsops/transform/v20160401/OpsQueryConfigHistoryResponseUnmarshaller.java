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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryConfigHistoryResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryConfigHistoryResponse.OpsCommitRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryConfigHistoryResponseUnmarshaller {

	public static OpsQueryConfigHistoryResponse unmarshall(OpsQueryConfigHistoryResponse opsQueryConfigHistoryResponse, UnmarshallerContext _ctx) {
		
		opsQueryConfigHistoryResponse.setRequestId(_ctx.stringValue("OpsQueryConfigHistoryResponse.RequestId"));

		List<OpsCommitRecord> opsCommitRecords = new ArrayList<OpsCommitRecord>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryConfigHistoryResponse.OpsCommitRecords.Length"); i++) {
			OpsCommitRecord opsCommitRecord = new OpsCommitRecord();
			opsCommitRecord.setUniqueKey(_ctx.stringValue("OpsQueryConfigHistoryResponse.OpsCommitRecords["+ i +"].UniqueKey"));
			opsCommitRecord.setCommitDate(_ctx.stringValue("OpsQueryConfigHistoryResponse.OpsCommitRecords["+ i +"].CommitDate"));
			opsCommitRecord.setDescription(_ctx.stringValue("OpsQueryConfigHistoryResponse.OpsCommitRecords["+ i +"].Description"));
			opsCommitRecord.setCommitId(_ctx.stringValue("OpsQueryConfigHistoryResponse.OpsCommitRecords["+ i +"].CommitId"));
			opsCommitRecord.setAuthor(_ctx.stringValue("OpsQueryConfigHistoryResponse.OpsCommitRecords["+ i +"].Author"));

			opsCommitRecords.add(opsCommitRecord);
		}
		opsQueryConfigHistoryResponse.setOpsCommitRecords(opsCommitRecords);
	 
	 	return opsQueryConfigHistoryResponse;
	}
}