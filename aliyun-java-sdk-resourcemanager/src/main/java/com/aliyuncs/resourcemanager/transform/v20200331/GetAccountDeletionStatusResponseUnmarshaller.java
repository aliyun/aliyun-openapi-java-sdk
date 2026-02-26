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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.GetAccountDeletionStatusResponse;
import com.aliyuncs.resourcemanager.model.v20200331.GetAccountDeletionStatusResponse.RdAccountDeletionStatus;
import com.aliyuncs.resourcemanager.model.v20200331.GetAccountDeletionStatusResponse.RdAccountDeletionStatus.FailReasonListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountDeletionStatusResponseUnmarshaller {

	public static GetAccountDeletionStatusResponse unmarshall(GetAccountDeletionStatusResponse getAccountDeletionStatusResponse, UnmarshallerContext _ctx) {
		
		getAccountDeletionStatusResponse.setRequestId(_ctx.stringValue("GetAccountDeletionStatusResponse.RequestId"));

		RdAccountDeletionStatus rdAccountDeletionStatus = new RdAccountDeletionStatus();
		rdAccountDeletionStatus.setStatus(_ctx.stringValue("GetAccountDeletionStatusResponse.RdAccountDeletionStatus.Status"));
		rdAccountDeletionStatus.setAccountId(_ctx.stringValue("GetAccountDeletionStatusResponse.RdAccountDeletionStatus.AccountId"));
		rdAccountDeletionStatus.setCreateTime(_ctx.stringValue("GetAccountDeletionStatusResponse.RdAccountDeletionStatus.CreateTime"));
		rdAccountDeletionStatus.setDeletionTime(_ctx.stringValue("GetAccountDeletionStatusResponse.RdAccountDeletionStatus.DeletionTime"));
		rdAccountDeletionStatus.setDeletionType(_ctx.stringValue("GetAccountDeletionStatusResponse.RdAccountDeletionStatus.DeletionType"));

		List<FailReasonListItem> failReasonList = new ArrayList<FailReasonListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAccountDeletionStatusResponse.RdAccountDeletionStatus.FailReasonList.Length"); i++) {
			FailReasonListItem failReasonListItem = new FailReasonListItem();
			failReasonListItem.setName(_ctx.stringValue("GetAccountDeletionStatusResponse.RdAccountDeletionStatus.FailReasonList["+ i +"].Name"));
			failReasonListItem.setDescription(_ctx.stringValue("GetAccountDeletionStatusResponse.RdAccountDeletionStatus.FailReasonList["+ i +"].Description"));

			failReasonList.add(failReasonListItem);
		}
		rdAccountDeletionStatus.setFailReasonList(failReasonList);
		getAccountDeletionStatusResponse.setRdAccountDeletionStatus(rdAccountDeletionStatus);
	 
	 	return getAccountDeletionStatusResponse;
	}
}