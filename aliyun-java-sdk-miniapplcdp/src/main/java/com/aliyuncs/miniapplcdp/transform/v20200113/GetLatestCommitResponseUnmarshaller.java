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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.GetLatestCommitResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetLatestCommitResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLatestCommitResponseUnmarshaller {

	public static GetLatestCommitResponse unmarshall(GetLatestCommitResponse getLatestCommitResponse, UnmarshallerContext _ctx) {
		
		getLatestCommitResponse.setRequestId(_ctx.stringValue("GetLatestCommitResponse.RequestId"));

		Data data = new Data();
		data.setCommitType(_ctx.stringValue("GetLatestCommitResponse.Data.CommitType"));
		data.setModifiedTime(_ctx.stringValue("GetLatestCommitResponse.Data.ModifiedTime"));
		data.setCommitId(_ctx.stringValue("GetLatestCommitResponse.Data.CommitId"));
		data.setAppId(_ctx.stringValue("GetLatestCommitResponse.Data.AppId"));
		data.setCreateTime(_ctx.stringValue("GetLatestCommitResponse.Data.CreateTime"));
		data.setRollbackToCommitId(_ctx.stringValue("GetLatestCommitResponse.Data.RollbackToCommitId"));
		data.setCommitLog(_ctx.stringValue("GetLatestCommitResponse.Data.CommitLog"));
		getLatestCommitResponse.setData(data);
	 
	 	return getLatestCommitResponse;
	}
}