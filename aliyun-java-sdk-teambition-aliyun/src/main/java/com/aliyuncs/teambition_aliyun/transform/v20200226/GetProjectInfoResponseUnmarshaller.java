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

package com.aliyuncs.teambition_aliyun.transform.v20200226;

import com.aliyuncs.teambition_aliyun.model.v20200226.GetProjectInfoResponse;
import com.aliyuncs.teambition_aliyun.model.v20200226.GetProjectInfoResponse.Object;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectInfoResponseUnmarshaller {

	public static GetProjectInfoResponse unmarshall(GetProjectInfoResponse getProjectInfoResponse, UnmarshallerContext _ctx) {
		
		getProjectInfoResponse.setRequestId(_ctx.stringValue("GetProjectInfoResponse.RequestId"));
		getProjectInfoResponse.setSuccessful(_ctx.booleanValue("GetProjectInfoResponse.Successful"));
		getProjectInfoResponse.setErrorCode(_ctx.stringValue("GetProjectInfoResponse.ErrorCode"));
		getProjectInfoResponse.setErrorMsg(_ctx.stringValue("GetProjectInfoResponse.ErrorMsg"));

		Object object = new Object();
		object.setRootCollectionId(_ctx.stringValue("GetProjectInfoResponse.Object.RootCollectionId"));
		object.setEndDate(_ctx.stringValue("GetProjectInfoResponse.Object.EndDate"));
		object.setIsArchived(_ctx.booleanValue("GetProjectInfoResponse.Object.IsArchived"));
		object.setModifierId(_ctx.stringValue("GetProjectInfoResponse.Object.ModifierId"));
		object.setSourceId(_ctx.stringValue("GetProjectInfoResponse.Object.SourceId"));
		object.setDescription(_ctx.stringValue("GetProjectInfoResponse.Object.Description"));
		object.setPy(_ctx.stringValue("GetProjectInfoResponse.Object.Py"));
		object.setDefaultRoleId(_ctx.stringValue("GetProjectInfoResponse.Object.DefaultRoleId"));
		object.setCustomfields(_ctx.stringValue("GetProjectInfoResponse.Object.Customfields"));
		object.setIsDeleted(_ctx.booleanValue("GetProjectInfoResponse.Object.IsDeleted"));
		object.setUniqueIdPrefix(_ctx.stringValue("GetProjectInfoResponse.Object.UniqueIdPrefix"));
		object.setNextTaskUniqueId(_ctx.integerValue("GetProjectInfoResponse.Object.NextTaskUniqueId"));
		object.setCreatorId(_ctx.stringValue("GetProjectInfoResponse.Object.CreatorId"));
		object.setLogo(_ctx.stringValue("GetProjectInfoResponse.Object.Logo"));
		object.setDefaultCollectionId(_ctx.stringValue("GetProjectInfoResponse.Object.DefaultCollectionId"));
		object.setIsSuspended(_ctx.booleanValue("GetProjectInfoResponse.Object.IsSuspended"));
		object.setVisibility(_ctx.stringValue("GetProjectInfoResponse.Object.Visibility"));
		object.setNormalType(_ctx.stringValue("GetProjectInfoResponse.Object.NormalType"));
		object.setCreated(_ctx.stringValue("GetProjectInfoResponse.Object.Created"));
		object.setOrganizationId(_ctx.stringValue("GetProjectInfoResponse.Object.OrganizationId"));
		object.setSortMethod(_ctx.stringValue("GetProjectInfoResponse.Object.SortMethod"));
		object.setPinyin(_ctx.stringValue("GetProjectInfoResponse.Object.Pinyin"));
		object.setSourceType(_ctx.stringValue("GetProjectInfoResponse.Object.SourceType"));
		object.setIsTemplate(_ctx.booleanValue("GetProjectInfoResponse.Object.IsTemplate"));
		object.setName(_ctx.stringValue("GetProjectInfoResponse.Object.Name"));
		object.setId(_ctx.stringValue("GetProjectInfoResponse.Object.Id"));
		object.setCategory(_ctx.stringValue("GetProjectInfoResponse.Object.Category"));
		object.setUpdated(_ctx.stringValue("GetProjectInfoResponse.Object.Updated"));
		object.setStartDate(_ctx.stringValue("GetProjectInfoResponse.Object.StartDate"));
		getProjectInfoResponse.setObject(object);
	 
	 	return getProjectInfoResponse;
	}
}