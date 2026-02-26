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
		data.setAppId(_ctx.stringValue("GetCommitResponse.Data.AppId"));
		data.setCommitId(_ctx.stringValue("GetCommitResponse.Data.CommitId"));
		data.setCreateTime(_ctx.stringValue("GetCommitResponse.Data.CreateTime"));
		data.setCommitLog(_ctx.stringValue("GetCommitResponse.Data.CommitLog"));
		data.setMainModuleCommitId(_ctx.stringValue("GetCommitResponse.Data.MainModuleCommitId"));
		data.setMainModuleId(_ctx.stringValue("GetCommitResponse.Data.MainModuleId"));
		data.setModelDataPath(_ctx.stringValue("GetCommitResponse.Data.ModelDataPath"));
		data.setModifiedTime(_ctx.stringValue("GetCommitResponse.Data.ModifiedTime"));
		data.setModuleId(_ctx.stringValue("GetCommitResponse.Data.ModuleId"));
		data.setResourceDataPath(_ctx.stringValue("GetCommitResponse.Data.ResourceDataPath"));
		data.setRollbackToCommitId(_ctx.stringValue("GetCommitResponse.Data.RollbackToCommitId"));
		data.setRollbackType(_ctx.stringValue("GetCommitResponse.Data.RollbackType"));
		data.setSchemaVersion(_ctx.stringValue("GetCommitResponse.Data.SchemaVersion"));
		data.setCommitType(_ctx.stringValue("GetCommitResponse.Data.CommitType"));
		data.setModelDigest(_ctx.mapValue("GetCommitResponse.Data.ModelDigest"));
		data.setResourceDigest(_ctx.mapValue("GetCommitResponse.Data.ResourceDigest"));
		data.setCommitDigest(_ctx.stringValue("GetCommitResponse.Data.CommitDigest"));

		List<String> modelPack = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCommitResponse.Data.ModelPack.Length"); i++) {
			modelPack.add(_ctx.stringValue("GetCommitResponse.Data.ModelPack["+ i +"]"));
		}
		data.setModelPack(modelPack);

		List<Map<Object, Object>> resourcePack = _ctx.listMapValue("GetCommitResponse.Data.ResourcePack");
		data.setResourcePack(resourcePack);
		getCommitResponse.setData(data);
	 
	 	return getCommitResponse;
	}
}