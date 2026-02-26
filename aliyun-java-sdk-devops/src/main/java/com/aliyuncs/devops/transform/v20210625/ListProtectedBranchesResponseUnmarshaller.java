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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListProtectedBranchesResponse;
import com.aliyuncs.devops.model.v20210625.ListProtectedBranchesResponse.ResultItem;
import com.aliyuncs.devops.model.v20210625.ListProtectedBranchesResponse.ResultItem.Allow_merge_users;
import com.aliyuncs.devops.model.v20210625.ListProtectedBranchesResponse.ResultItem.Allow_push_users;
import com.aliyuncs.devops.model.v20210625.ListProtectedBranchesResponse.ResultItem.MergeRequestSetting;
import com.aliyuncs.devops.model.v20210625.ListProtectedBranchesResponse.ResultItem.MergeRequestSetting.Default_assignees;
import com.aliyuncs.devops.model.v20210625.ListProtectedBranchesResponse.ResultItem.TestSettingDTO;
import com.aliyuncs.devops.model.v20210625.ListProtectedBranchesResponse.ResultItem.TestSettingDTO.CheckConfig;
import com.aliyuncs.devops.model.v20210625.ListProtectedBranchesResponse.ResultItem.TestSettingDTO.CheckConfig.Check_items;
import com.aliyuncs.devops.model.v20210625.ListProtectedBranchesResponse.ResultItem.TestSettingDTO.CheckTaskQualityConfig;
import com.aliyuncs.devops.model.v20210625.ListProtectedBranchesResponse.ResultItem.TestSettingDTO.CodeGuidelinesDetection;
import com.aliyuncs.devops.model.v20210625.ListProtectedBranchesResponse.ResultItem.TestSettingDTO.SensitiveInfoDetection;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProtectedBranchesResponseUnmarshaller {

	public static ListProtectedBranchesResponse unmarshall(ListProtectedBranchesResponse listProtectedBranchesResponse, UnmarshallerContext _ctx) {
		
		listProtectedBranchesResponse.setRequestId(_ctx.stringValue("ListProtectedBranchesResponse.requestId"));
		listProtectedBranchesResponse.setErrorMessage(_ctx.stringValue("ListProtectedBranchesResponse.errorMessage"));
		listProtectedBranchesResponse.setErrorCode(_ctx.stringValue("ListProtectedBranchesResponse.errorCode"));
		listProtectedBranchesResponse.setSuccess(_ctx.booleanValue("ListProtectedBranchesResponse.success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProtectedBranchesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("ListProtectedBranchesResponse.result["+ i +"].id"));
			resultItem.setBranch(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].branch"));
			resultItem.setCreatedAt(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].createdAt"));
			resultItem.setUpdatedAt(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].updatedAt"));

			List<Integer> allowPushRoles = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("ListProtectedBranchesResponse.result["+ i +"].allowPushRoles.Length"); j++) {
				allowPushRoles.add(_ctx.integerValue("ListProtectedBranchesResponse.result["+ i +"].allowPushRoles["+ j +"]"));
			}
			resultItem.setAllowPushRoles(allowPushRoles);

			List<Long> allowPushUserIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListProtectedBranchesResponse.result["+ i +"].allowPushUserIds.Length"); j++) {
				allowPushUserIds.add(_ctx.longValue("ListProtectedBranchesResponse.result["+ i +"].allowPushUserIds["+ j +"]"));
			}
			resultItem.setAllowPushUserIds(allowPushUserIds);

			List<Integer> allowMergeRoles = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("ListProtectedBranchesResponse.result["+ i +"].allowMergeRoles.Length"); j++) {
				allowMergeRoles.add(_ctx.integerValue("ListProtectedBranchesResponse.result["+ i +"].allowMergeRoles["+ j +"]"));
			}
			resultItem.setAllowMergeRoles(allowMergeRoles);

			List<Long> allowMergeUserIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListProtectedBranchesResponse.result["+ i +"].allowMergeUserIds.Length"); j++) {
				allowMergeUserIds.add(_ctx.longValue("ListProtectedBranchesResponse.result["+ i +"].allowMergeUserIds["+ j +"]"));
			}
			resultItem.setAllowMergeUserIds(allowMergeUserIds);

			List<String> matches = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListProtectedBranchesResponse.result["+ i +"].matches.Length"); j++) {
				matches.add(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].matches["+ j +"]"));
			}
			resultItem.setMatches(matches);

			MergeRequestSetting mergeRequestSetting = new MergeRequestSetting();
			mergeRequestSetting.setIsRequired(_ctx.booleanValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.isRequired"));
			mergeRequestSetting.setMrMode(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.mrMode"));
			mergeRequestSetting.setIsAllowSelfApproval(_ctx.booleanValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.isAllowSelfApproval"));
			mergeRequestSetting.setIsRequireDiscussionProcessed(_ctx.booleanValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.isRequireDiscussionProcessed"));
			mergeRequestSetting.setIsResetApprovalWhenNewPush(_ctx.booleanValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.isResetApprovalWhenNewPush"));
			mergeRequestSetting.setMinimumApproval(_ctx.integerValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.minimumApproval"));
			mergeRequestSetting.setWhiteList(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.whiteList"));

			List<Integer> allowMergeRequestRoles = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.allowMergeRequestRoles.Length"); j++) {
				allowMergeRequestRoles.add(_ctx.integerValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.allowMergeRequestRoles["+ j +"]"));
			}
			mergeRequestSetting.setAllowMergeRequestRoles(allowMergeRequestRoles);

			List<Default_assignees> defaultAssignees = new ArrayList<Default_assignees>();
			for (int j = 0; j < _ctx.lengthValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.defaultAssignees.Length"); j++) {
				Default_assignees default_assignees = new Default_assignees();
				default_assignees.setId(_ctx.longValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.defaultAssignees["+ j +"].id"));
				default_assignees.setUsername(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.defaultAssignees["+ j +"].username"));
				default_assignees.setName(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.defaultAssignees["+ j +"].name"));
				default_assignees.setEmail(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.defaultAssignees["+ j +"].email"));
				default_assignees.setAvatar(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.defaultAssignees["+ j +"].avatar"));
				default_assignees.setTbUserId(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].mergeRequestSetting.defaultAssignees["+ j +"].tbUserId"));

				defaultAssignees.add(default_assignees);
			}
			mergeRequestSetting.setDefaultAssignees(defaultAssignees);
			resultItem.setMergeRequestSetting(mergeRequestSetting);

			TestSettingDTO testSettingDTO = new TestSettingDTO();
			testSettingDTO.setIsRequired(_ctx.booleanValue("ListProtectedBranchesResponse.result["+ i +"].testSettingDTO.isRequired"));

			CodeGuidelinesDetection codeGuidelinesDetection = new CodeGuidelinesDetection();
			codeGuidelinesDetection.setEnabled(_ctx.booleanValue("ListProtectedBranchesResponse.result["+ i +"].testSettingDTO.codeGuidelinesDetection.enabled"));
			codeGuidelinesDetection.setMessage(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].testSettingDTO.codeGuidelinesDetection.message"));
			testSettingDTO.setCodeGuidelinesDetection(codeGuidelinesDetection);

			SensitiveInfoDetection sensitiveInfoDetection = new SensitiveInfoDetection();
			sensitiveInfoDetection.setEnabled(_ctx.booleanValue("ListProtectedBranchesResponse.result["+ i +"].testSettingDTO.sensitiveInfoDetection.enabled"));
			sensitiveInfoDetection.setMessage(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].testSettingDTO.sensitiveInfoDetection.message"));
			testSettingDTO.setSensitiveInfoDetection(sensitiveInfoDetection);

			CheckTaskQualityConfig checkTaskQualityConfig = new CheckTaskQualityConfig();
			checkTaskQualityConfig.setEnabled(_ctx.booleanValue("ListProtectedBranchesResponse.result["+ i +"].testSettingDTO.checkTaskQualityConfig.enabled"));
			checkTaskQualityConfig.setBizNo(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].testSettingDTO.checkTaskQualityConfig.bizNo"));
			checkTaskQualityConfig.setTaskName(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].testSettingDTO.checkTaskQualityConfig.taskName"));
			checkTaskQualityConfig.setMessage(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].testSettingDTO.checkTaskQualityConfig.message"));
			testSettingDTO.setCheckTaskQualityConfig(checkTaskQualityConfig);

			CheckConfig checkConfig = new CheckConfig();

			List<Check_items> checkItems = new ArrayList<Check_items>();
			for (int j = 0; j < _ctx.lengthValue("ListProtectedBranchesResponse.result["+ i +"].testSettingDTO.checkConfig.checkItems.Length"); j++) {
				Check_items check_items = new Check_items();
				check_items.setName(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].testSettingDTO.checkConfig.checkItems["+ j +"].name"));
				check_items.setIsRequired(_ctx.booleanValue("ListProtectedBranchesResponse.result["+ i +"].testSettingDTO.checkConfig.checkItems["+ j +"].isRequired"));

				checkItems.add(check_items);
			}
			checkConfig.setCheckItems(checkItems);
			testSettingDTO.setCheckConfig(checkConfig);
			resultItem.setTestSettingDTO(testSettingDTO);

			List<Allow_push_users> allowPushUsers = new ArrayList<Allow_push_users>();
			for (int j = 0; j < _ctx.lengthValue("ListProtectedBranchesResponse.result["+ i +"].allowPushUsers.Length"); j++) {
				Allow_push_users allow_push_users = new Allow_push_users();
				allow_push_users.setId(_ctx.longValue("ListProtectedBranchesResponse.result["+ i +"].allowPushUsers["+ j +"].id"));
				allow_push_users.setName(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].allowPushUsers["+ j +"].name"));
				allow_push_users.setUsername(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].allowPushUsers["+ j +"].username"));
				allow_push_users.setEmail(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].allowPushUsers["+ j +"].email"));
				allow_push_users.setAvatar(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].allowPushUsers["+ j +"].avatar"));
				allow_push_users.setTbUserId(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].allowPushUsers["+ j +"].tbUserId"));

				allowPushUsers.add(allow_push_users);
			}
			resultItem.setAllowPushUsers(allowPushUsers);

			List<Allow_merge_users> allowMergeUsers = new ArrayList<Allow_merge_users>();
			for (int j = 0; j < _ctx.lengthValue("ListProtectedBranchesResponse.result["+ i +"].allowMergeUsers.Length"); j++) {
				Allow_merge_users allow_merge_users = new Allow_merge_users();
				allow_merge_users.setId(_ctx.longValue("ListProtectedBranchesResponse.result["+ i +"].allowMergeUsers["+ j +"].id"));
				allow_merge_users.setName(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].allowMergeUsers["+ j +"].name"));
				allow_merge_users.setUsername(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].allowMergeUsers["+ j +"].username"));
				allow_merge_users.setEmail(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].allowMergeUsers["+ j +"].email"));
				allow_merge_users.setAvatar(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].allowMergeUsers["+ j +"].avatar"));
				allow_merge_users.setTbUserId(_ctx.stringValue("ListProtectedBranchesResponse.result["+ i +"].allowMergeUsers["+ j +"].tbUserId"));

				allowMergeUsers.add(allow_merge_users);
			}
			resultItem.setAllowMergeUsers(allowMergeUsers);

			result.add(resultItem);
		}
		listProtectedBranchesResponse.setResult(result);
	 
	 	return listProtectedBranchesResponse;
	}
}