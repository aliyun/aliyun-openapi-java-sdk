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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetDagResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDagResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDagResponseUnmarshaller {

	public static GetDagResponse unmarshall(GetDagResponse getDagResponse, UnmarshallerContext _ctx) {
		
		getDagResponse.setRequestId(_ctx.stringValue("GetDagResponse.RequestId"));
		getDagResponse.setSuccess(_ctx.booleanValue("GetDagResponse.Success"));
		getDagResponse.setHttpStatusCode(_ctx.integerValue("GetDagResponse.HttpStatusCode"));
		getDagResponse.setErrorCode(_ctx.stringValue("GetDagResponse.ErrorCode"));
		getDagResponse.setErrorMessage(_ctx.stringValue("GetDagResponse.ErrorMessage"));

		Data data = new Data();
		data.setProjectId(_ctx.longValue("GetDagResponse.Data.ProjectId"));
		data.setDagId(_ctx.longValue("GetDagResponse.Data.DagId"));
		data.setName(_ctx.stringValue("GetDagResponse.Data.Name"));
		data.setType(_ctx.stringValue("GetDagResponse.Data.Type"));
		data.setStatus(_ctx.stringValue("GetDagResponse.Data.Status"));
		data.setBizdate(_ctx.longValue("GetDagResponse.Data.Bizdate"));
		data.setGmtdate(_ctx.longValue("GetDagResponse.Data.Gmtdate"));
		data.setStartTime(_ctx.longValue("GetDagResponse.Data.StartTime"));
		data.setFinishTime(_ctx.longValue("GetDagResponse.Data.FinishTime"));
		data.setCreateTime(_ctx.longValue("GetDagResponse.Data.CreateTime"));
		data.setCreateUser(_ctx.stringValue("GetDagResponse.Data.CreateUser"));
		data.setModifyTime(_ctx.longValue("GetDagResponse.Data.ModifyTime"));
		getDagResponse.setData(data);
	 
	 	return getDagResponse;
	}
}