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

package com.aliyuncs.devops_rdc.transform.v20200303;

import com.aliyuncs.devops_rdc.model.v20200303.GetDevopsProjectInfoResponse;
import com.aliyuncs.devops_rdc.model.v20200303.GetDevopsProjectInfoResponse.Object;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDevopsProjectInfoResponseUnmarshaller {

	public static GetDevopsProjectInfoResponse unmarshall(GetDevopsProjectInfoResponse getDevopsProjectInfoResponse, UnmarshallerContext _ctx) {
		
		getDevopsProjectInfoResponse.setRequestId(_ctx.stringValue("GetDevopsProjectInfoResponse.RequestId"));
		getDevopsProjectInfoResponse.setErrorMsg(_ctx.stringValue("GetDevopsProjectInfoResponse.ErrorMsg"));
		getDevopsProjectInfoResponse.setSuccessful(_ctx.booleanValue("GetDevopsProjectInfoResponse.Successful"));
		getDevopsProjectInfoResponse.setErrorCode(_ctx.stringValue("GetDevopsProjectInfoResponse.ErrorCode"));

		Object object = new Object();
		object.setSortMethod(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.SortMethod"));
		object.setUniqueIdPrefix(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.UniqueIdPrefix"));
		object.setNormalType(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.NormalType"));
		object.setModifierId(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.ModifierId"));
		object.setSourceType(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.SourceType"));
		object.setIsTemplate(_ctx.booleanValue("GetDevopsProjectInfoResponse.Object.IsTemplate"));
		object.setDescription(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.Description"));
		object.setDefaultRoleId(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.DefaultRoleId"));
		object.setRootCollectionId(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.RootCollectionId"));
		object.setIsDeleted(_ctx.booleanValue("GetDevopsProjectInfoResponse.Object.IsDeleted"));
		object.setUpdated(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.Updated"));
		object.setName(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.Name"));
		object.setIsArchived(_ctx.booleanValue("GetDevopsProjectInfoResponse.Object.IsArchived"));
		object.setEndDate(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.EndDate"));
		object.setLogo(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.Logo"));
		object.setStartDate(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.StartDate"));
		object.setPinyin(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.Pinyin"));
		object.setCreatorId(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.CreatorId"));
		object.setSourceId(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.SourceId"));
		object.setDefaultCollectionId(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.DefaultCollectionId"));
		object.setIsSuspended(_ctx.booleanValue("GetDevopsProjectInfoResponse.Object.IsSuspended"));
		object.setOrganizationId(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.OrganizationId"));
		object.setVisibility(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.Visibility"));
		object.setPy(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.Py"));
		object.setCategory(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.Category"));
		object.setNextTaskUniqueId(_ctx.integerValue("GetDevopsProjectInfoResponse.Object.NextTaskUniqueId"));
		object.setCustomfields(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.Customfields"));
		object.setCreated(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.Created"));
		object.setId(_ctx.stringValue("GetDevopsProjectInfoResponse.Object.Id"));
		getDevopsProjectInfoResponse.setObject(object);
	 
	 	return getDevopsProjectInfoResponse;
	}
}