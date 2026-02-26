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

import com.aliyuncs.dataphin_public.model.v20230630.GetTransferInfoResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetTransferInfoResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetTransferInfoResponse.Data.Creator;
import com.aliyuncs.dataphin_public.model.v20230630.GetTransferInfoResponse.Data.LastModifier;
import com.aliyuncs.dataphin_public.model.v20230630.GetTransferInfoResponse.Data.NewOwner;
import com.aliyuncs.dataphin_public.model.v20230630.GetTransferInfoResponse.Data.OldOwner;
import com.aliyuncs.dataphin_public.model.v20230630.GetTransferInfoResponse.Data.PrivilegeTransferResultEntriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTransferInfoResponseUnmarshaller {

	public static GetTransferInfoResponse unmarshall(GetTransferInfoResponse getTransferInfoResponse, UnmarshallerContext _ctx) {
		
		getTransferInfoResponse.setRequestId(_ctx.stringValue("GetTransferInfoResponse.RequestId"));
		getTransferInfoResponse.setSuccess(_ctx.booleanValue("GetTransferInfoResponse.Success"));
		getTransferInfoResponse.setHttpStatusCode(_ctx.integerValue("GetTransferInfoResponse.HttpStatusCode"));
		getTransferInfoResponse.setCode(_ctx.stringValue("GetTransferInfoResponse.Code"));
		getTransferInfoResponse.setMessage(_ctx.stringValue("GetTransferInfoResponse.Message"));

		Data data = new Data();
		data.setProposalId(_ctx.longValue("GetTransferInfoResponse.Data.ProposalId"));
		data.setFlowId(_ctx.longValue("GetTransferInfoResponse.Data.FlowId"));
		data.setTitle(_ctx.stringValue("GetTransferInfoResponse.Data.Title"));
		data.setPrivilegeTransferMode(_ctx.stringValue("GetTransferInfoResponse.Data.PrivilegeTransferMode"));
		data.setTransferComment(_ctx.stringValue("GetTransferInfoResponse.Data.TransferComment"));
		data.setTransferStatus(_ctx.stringValue("GetTransferInfoResponse.Data.TransferStatus"));
		data.setGmtCreate(_ctx.stringValue("GetTransferInfoResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("GetTransferInfoResponse.Data.GmtModified"));

		Creator creator = new Creator();
		creator.setUserId(_ctx.stringValue("GetTransferInfoResponse.Data.Creator.UserId"));
		creator.setDisplayName(_ctx.stringValue("GetTransferInfoResponse.Data.Creator.DisplayName"));
		data.setCreator(creator);

		OldOwner oldOwner = new OldOwner();
		oldOwner.setUserId(_ctx.stringValue("GetTransferInfoResponse.Data.OldOwner.UserId"));
		oldOwner.setDisplayName(_ctx.stringValue("GetTransferInfoResponse.Data.OldOwner.DisplayName"));
		data.setOldOwner(oldOwner);

		NewOwner newOwner = new NewOwner();
		newOwner.setUserId(_ctx.stringValue("GetTransferInfoResponse.Data.NewOwner.UserId"));
		newOwner.setDisplayName(_ctx.stringValue("GetTransferInfoResponse.Data.NewOwner.DisplayName"));
		data.setNewOwner(newOwner);

		LastModifier lastModifier = new LastModifier();
		lastModifier.setUserId(_ctx.stringValue("GetTransferInfoResponse.Data.LastModifier.UserId"));
		lastModifier.setDisplayName(_ctx.stringValue("GetTransferInfoResponse.Data.LastModifier.DisplayName"));
		data.setLastModifier(lastModifier);

		List<PrivilegeTransferResultEntriesItem> privilegeTransferResultEntries = new ArrayList<PrivilegeTransferResultEntriesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTransferInfoResponse.Data.PrivilegeTransferResultEntries.Length"); i++) {
			PrivilegeTransferResultEntriesItem privilegeTransferResultEntriesItem = new PrivilegeTransferResultEntriesItem();
			privilegeTransferResultEntriesItem.setStatus(_ctx.stringValue("GetTransferInfoResponse.Data.PrivilegeTransferResultEntries["+ i +"].Status"));
			privilegeTransferResultEntriesItem.setPrivilegeDisplayName(_ctx.stringValue("GetTransferInfoResponse.Data.PrivilegeTransferResultEntries["+ i +"].PrivilegeDisplayName"));
			privilegeTransferResultEntriesItem.setErrMsg(_ctx.stringValue("GetTransferInfoResponse.Data.PrivilegeTransferResultEntries["+ i +"].ErrMsg"));

			privilegeTransferResultEntries.add(privilegeTransferResultEntriesItem);
		}
		data.setPrivilegeTransferResultEntries(privilegeTransferResultEntries);
		getTransferInfoResponse.setData(data);
	 
	 	return getTransferInfoResponse;
	}
}