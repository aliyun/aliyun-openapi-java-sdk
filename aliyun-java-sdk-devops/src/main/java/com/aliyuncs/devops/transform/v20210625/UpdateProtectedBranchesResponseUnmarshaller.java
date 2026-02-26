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

import com.aliyuncs.devops.model.v20210625.UpdateProtectedBranchesResponse;
import com.aliyuncs.devops.model.v20210625.UpdateProtectedBranchesResponse.Result;
import com.aliyuncs.devops.model.v20210625.UpdateProtectedBranchesResponse.Result.MergeRequestSetting;
import com.aliyuncs.devops.model.v20210625.UpdateProtectedBranchesResponse.Result.TestSettingDTO;
import com.aliyuncs.devops.model.v20210625.UpdateProtectedBranchesResponse.Result.TestSettingDTO.CheckConfig;
import com.aliyuncs.devops.model.v20210625.UpdateProtectedBranchesResponse.Result.TestSettingDTO.CheckConfig.Check_items;
import com.aliyuncs.devops.model.v20210625.UpdateProtectedBranchesResponse.Result.TestSettingDTO.CheckTaskQualityConfig;
import com.aliyuncs.devops.model.v20210625.UpdateProtectedBranchesResponse.Result.TestSettingDTO.CodeGuidelinesDetection;
import com.aliyuncs.devops.model.v20210625.UpdateProtectedBranchesResponse.Result.TestSettingDTO.SensitiveInfoDetection;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateProtectedBranchesResponseUnmarshaller {

	public static UpdateProtectedBranchesResponse unmarshall(UpdateProtectedBranchesResponse updateProtectedBranchesResponse, UnmarshallerContext _ctx) {
		
		updateProtectedBranchesResponse.setRequestId(_ctx.stringValue("UpdateProtectedBranchesResponse.requestId"));
		updateProtectedBranchesResponse.setErrorMessage(_ctx.stringValue("UpdateProtectedBranchesResponse.errorMessage"));
		updateProtectedBranchesResponse.setErrorCode(_ctx.stringValue("UpdateProtectedBranchesResponse.errorCode"));
		updateProtectedBranchesResponse.setSuccess(_ctx.booleanValue("UpdateProtectedBranchesResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("UpdateProtectedBranchesResponse.result.id"));
		result.setBranch(_ctx.stringValue("UpdateProtectedBranchesResponse.result.branch"));

		List<Integer> allowPushRoles = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("UpdateProtectedBranchesResponse.result.allowPushRoles.Length"); i++) {
			allowPushRoles.add(_ctx.integerValue("UpdateProtectedBranchesResponse.result.allowPushRoles["+ i +"]"));
		}
		result.setAllowPushRoles(allowPushRoles);

		List<Long> allowPushUserIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("UpdateProtectedBranchesResponse.result.allowPushUserIds.Length"); i++) {
			allowPushUserIds.add(_ctx.longValue("UpdateProtectedBranchesResponse.result.allowPushUserIds["+ i +"]"));
		}
		result.setAllowPushUserIds(allowPushUserIds);

		List<Integer> allowMergeRoles = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("UpdateProtectedBranchesResponse.result.allowMergeRoles.Length"); i++) {
			allowMergeRoles.add(_ctx.integerValue("UpdateProtectedBranchesResponse.result.allowMergeRoles["+ i +"]"));
		}
		result.setAllowMergeRoles(allowMergeRoles);

		List<Long> allowMergeUserIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("UpdateProtectedBranchesResponse.result.allowMergeUserIds.Length"); i++) {
			allowMergeUserIds.add(_ctx.longValue("UpdateProtectedBranchesResponse.result.allowMergeUserIds["+ i +"]"));
		}
		result.setAllowMergeUserIds(allowMergeUserIds);

		MergeRequestSetting mergeRequestSetting = new MergeRequestSetting();
		mergeRequestSetting.setIsRequired(_ctx.booleanValue("UpdateProtectedBranchesResponse.result.mergeRequestSetting.isRequired"));
		mergeRequestSetting.setMrMode(_ctx.stringValue("UpdateProtectedBranchesResponse.result.mergeRequestSetting.mrMode"));
		mergeRequestSetting.setIsAllowSelfApproval(_ctx.booleanValue("UpdateProtectedBranchesResponse.result.mergeRequestSetting.isAllowSelfApproval"));
		mergeRequestSetting.setIsRequireDiscussionProcessed(_ctx.booleanValue("UpdateProtectedBranchesResponse.result.mergeRequestSetting.isRequireDiscussionProcessed"));
		mergeRequestSetting.setIsResetApprovalWhenNewPush(_ctx.booleanValue("UpdateProtectedBranchesResponse.result.mergeRequestSetting.isResetApprovalWhenNewPush"));
		mergeRequestSetting.setMinimumApproval(_ctx.integerValue("UpdateProtectedBranchesResponse.result.mergeRequestSetting.minimumApproval"));
		mergeRequestSetting.setWhiteList(_ctx.stringValue("UpdateProtectedBranchesResponse.result.mergeRequestSetting.whiteList"));

		List<Integer> allowMergeRequestRoles = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("UpdateProtectedBranchesResponse.result.mergeRequestSetting.allowMergeRequestRoles.Length"); i++) {
			allowMergeRequestRoles.add(_ctx.integerValue("UpdateProtectedBranchesResponse.result.mergeRequestSetting.allowMergeRequestRoles["+ i +"]"));
		}
		mergeRequestSetting.setAllowMergeRequestRoles(allowMergeRequestRoles);

		List<String> defaultAssignees = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateProtectedBranchesResponse.result.mergeRequestSetting.defaultAssignees.Length"); i++) {
			defaultAssignees.add(_ctx.stringValue("UpdateProtectedBranchesResponse.result.mergeRequestSetting.defaultAssignees["+ i +"]"));
		}
		mergeRequestSetting.setDefaultAssignees(defaultAssignees);
		result.setMergeRequestSetting(mergeRequestSetting);

		TestSettingDTO testSettingDTO = new TestSettingDTO();
		testSettingDTO.setIsRequired(_ctx.booleanValue("UpdateProtectedBranchesResponse.result.testSettingDTO.isRequired"));

		CodeGuidelinesDetection codeGuidelinesDetection = new CodeGuidelinesDetection();
		codeGuidelinesDetection.setEnabled(_ctx.booleanValue("UpdateProtectedBranchesResponse.result.testSettingDTO.codeGuidelinesDetection.enabled"));
		codeGuidelinesDetection.setMessage(_ctx.stringValue("UpdateProtectedBranchesResponse.result.testSettingDTO.codeGuidelinesDetection.message"));
		testSettingDTO.setCodeGuidelinesDetection(codeGuidelinesDetection);

		SensitiveInfoDetection sensitiveInfoDetection = new SensitiveInfoDetection();
		sensitiveInfoDetection.setEnabled(_ctx.booleanValue("UpdateProtectedBranchesResponse.result.testSettingDTO.sensitiveInfoDetection.enabled"));
		sensitiveInfoDetection.setMessage(_ctx.stringValue("UpdateProtectedBranchesResponse.result.testSettingDTO.sensitiveInfoDetection.message"));
		testSettingDTO.setSensitiveInfoDetection(sensitiveInfoDetection);

		CheckTaskQualityConfig checkTaskQualityConfig = new CheckTaskQualityConfig();
		checkTaskQualityConfig.setEnabled(_ctx.booleanValue("UpdateProtectedBranchesResponse.result.testSettingDTO.checkTaskQualityConfig.enabled"));
		checkTaskQualityConfig.setBizNo(_ctx.stringValue("UpdateProtectedBranchesResponse.result.testSettingDTO.checkTaskQualityConfig.bizNo"));
		checkTaskQualityConfig.setTaskName(_ctx.stringValue("UpdateProtectedBranchesResponse.result.testSettingDTO.checkTaskQualityConfig.taskName"));
		checkTaskQualityConfig.setMessage(_ctx.stringValue("UpdateProtectedBranchesResponse.result.testSettingDTO.checkTaskQualityConfig.message"));
		testSettingDTO.setCheckTaskQualityConfig(checkTaskQualityConfig);

		CheckConfig checkConfig = new CheckConfig();

		List<Check_items> checkItems = new ArrayList<Check_items>();
		for (int i = 0; i < _ctx.lengthValue("UpdateProtectedBranchesResponse.result.testSettingDTO.checkConfig.checkItems.Length"); i++) {
			Check_items check_items = new Check_items();
			check_items.setName(_ctx.stringValue("UpdateProtectedBranchesResponse.result.testSettingDTO.checkConfig.checkItems["+ i +"].name"));
			check_items.setIsRequired(_ctx.booleanValue("UpdateProtectedBranchesResponse.result.testSettingDTO.checkConfig.checkItems["+ i +"].isRequired"));

			checkItems.add(check_items);
		}
		checkConfig.setCheckItems(checkItems);
		testSettingDTO.setCheckConfig(checkConfig);
		result.setTestSettingDTO(testSettingDTO);
		updateProtectedBranchesResponse.setResult(result);
	 
	 	return updateProtectedBranchesResponse;
	}
}