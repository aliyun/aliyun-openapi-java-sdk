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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.miniapplcdp.model.v20200113.GetCommitResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetCommitResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCommitResponseUnmarshaller {

	public static GetCommitResponse unmarshall(GetCommitResponse getCommitResponse, UnmarshallerContext _ctx) {
		
		getCommitResponse.setRequestId(_ctx.stringValue("GetCommitResponse.RequestId"));

		Data data = new Data();
		data.setCommitType(_ctx.stringValue("GetCommitResponse.Data.CommitType"));
		data.setModifiedTime(_ctx.stringValue("GetCommitResponse.Data.ModifiedTime"));
		data.setCommitId(_ctx.stringValue("GetCommitResponse.Data.CommitId"));
		data.setAppId(_ctx.stringValue("GetCommitResponse.Data.AppId"));
		data.setCreateTime(_ctx.stringValue("GetCommitResponse.Data.CreateTime"));
		data.setRollbackToCommitId(_ctx.stringValue("GetCommitResponse.Data.RollbackToCommitId"));
		data.setAppModel(_ctx.mapValue("GetCommitResponse.Data.AppModel"));
		data.setCommitLog(_ctx.stringValue("GetCommitResponse.Data.CommitLog"));

		List<Map<Object, Object>> logicModels = _ctx.listMapValue("GetCommitResponse.Data.LogicModels");
		data.setLogicModels(logicModels);

		List<Map<Object, Object>> pageModels = _ctx.listMapValue("GetCommitResponse.Data.PageModels");
		data.setPageModels(pageModels);

		List<Map<Object, Object>> dataModels = _ctx.listMapValue("GetCommitResponse.Data.DataModels");
		data.setDataModels(dataModels);
		getCommitResponse.setData(data);
	 
	 	return getCommitResponse;
	}
}