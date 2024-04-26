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

import com.aliyuncs.dms_enterprise.model.v20181101.GetTableDesignProjectInfoResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTableDesignProjectInfoResponse.ProjectInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTableDesignProjectInfoResponse.ProjectInfo.BaseDatabase;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTableDesignProjectInfoResponseUnmarshaller {

	public static GetTableDesignProjectInfoResponse unmarshall(GetTableDesignProjectInfoResponse getTableDesignProjectInfoResponse, UnmarshallerContext _ctx) {
		
		getTableDesignProjectInfoResponse.setRequestId(_ctx.stringValue("GetTableDesignProjectInfoResponse.RequestId"));
		getTableDesignProjectInfoResponse.setSuccess(_ctx.booleanValue("GetTableDesignProjectInfoResponse.Success"));
		getTableDesignProjectInfoResponse.setErrorMessage(_ctx.stringValue("GetTableDesignProjectInfoResponse.ErrorMessage"));
		getTableDesignProjectInfoResponse.setErrorCode(_ctx.stringValue("GetTableDesignProjectInfoResponse.ErrorCode"));

		ProjectInfo projectInfo = new ProjectInfo();
		projectInfo.setOrderId(_ctx.longValue("GetTableDesignProjectInfoResponse.ProjectInfo.OrderId"));
		projectInfo.setProjectId(_ctx.longValue("GetTableDesignProjectInfoResponse.ProjectInfo.ProjectId"));
		projectInfo.setGmtCreate(_ctx.stringValue("GetTableDesignProjectInfoResponse.ProjectInfo.GmtCreate"));
		projectInfo.setGmtModified(_ctx.stringValue("GetTableDesignProjectInfoResponse.ProjectInfo.GmtModified"));
		projectInfo.setStatus(_ctx.stringValue("GetTableDesignProjectInfoResponse.ProjectInfo.Status"));
		projectInfo.setTitle(_ctx.stringValue("GetTableDesignProjectInfoResponse.ProjectInfo.Title"));
		projectInfo.setDescription(_ctx.stringValue("GetTableDesignProjectInfoResponse.ProjectInfo.Description"));
		projectInfo.setCreatorId(_ctx.longValue("GetTableDesignProjectInfoResponse.ProjectInfo.CreatorId"));

		BaseDatabase baseDatabase = new BaseDatabase();
		baseDatabase.setSearchName(_ctx.stringValue("GetTableDesignProjectInfoResponse.ProjectInfo.BaseDatabase.SearchName"));
		baseDatabase.setSchemaName(_ctx.stringValue("GetTableDesignProjectInfoResponse.ProjectInfo.BaseDatabase.SchemaName"));
		baseDatabase.setDbId(_ctx.integerValue("GetTableDesignProjectInfoResponse.ProjectInfo.BaseDatabase.DbId"));
		baseDatabase.setLogic(_ctx.booleanValue("GetTableDesignProjectInfoResponse.ProjectInfo.BaseDatabase.Logic"));
		baseDatabase.setAlias(_ctx.stringValue("GetTableDesignProjectInfoResponse.ProjectInfo.BaseDatabase.Alias"));
		baseDatabase.setEnvType(_ctx.stringValue("GetTableDesignProjectInfoResponse.ProjectInfo.BaseDatabase.EnvType"));
		baseDatabase.setDbType(_ctx.stringValue("GetTableDesignProjectInfoResponse.ProjectInfo.BaseDatabase.DbType"));
		projectInfo.setBaseDatabase(baseDatabase);
		getTableDesignProjectInfoResponse.setProjectInfo(projectInfo);
	 
	 	return getTableDesignProjectInfoResponse;
	}
}