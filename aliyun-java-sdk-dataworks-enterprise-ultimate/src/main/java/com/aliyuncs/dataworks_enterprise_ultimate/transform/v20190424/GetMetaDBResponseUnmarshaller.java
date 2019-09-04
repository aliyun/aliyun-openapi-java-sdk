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

package com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424;

import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.GetMetaDBResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.GetMetaDBResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaDBResponseUnmarshaller {

	public static GetMetaDBResponse unmarshall(GetMetaDBResponse getMetaDBResponse, UnmarshallerContext _ctx) {
		
		getMetaDBResponse.setRequestId(_ctx.stringValue("GetMetaDBResponse.RequestId"));
		getMetaDBResponse.setErrCode(_ctx.stringValue("GetMetaDBResponse.ErrCode"));
		getMetaDBResponse.setErrMsg(_ctx.stringValue("GetMetaDBResponse.ErrMsg"));

		Data data = new Data();
		data.setAppGuid(_ctx.stringValue("GetMetaDBResponse.Data.AppGuid"));
		data.setProjectName(_ctx.stringValue("GetMetaDBResponse.Data.ProjectName"));
		data.setOwnerId(_ctx.stringValue("GetMetaDBResponse.Data.OwnerId"));
		data.setProjectNameCn(_ctx.stringValue("GetMetaDBResponse.Data.ProjectNameCn"));
		data.setComment(_ctx.stringValue("GetMetaDBResponse.Data.Comment"));
		data.setCreateTime(_ctx.stringValue("GetMetaDBResponse.Data.CreateTime"));
		data.setModifyTime(_ctx.stringValue("GetMetaDBResponse.Data.ModifyTime"));
		getMetaDBResponse.setData(data);
	 
	 	return getMetaDBResponse;
	}
}