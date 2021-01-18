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

package com.aliyuncs.codeup.transform.v20200414;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.codeup.model.v20200414.CreateRepositoryProtectedBranchResponse;
import com.aliyuncs.codeup.model.v20200414.CreateRepositoryProtectedBranchResponse.Result;
import com.aliyuncs.codeup.model.v20200414.CreateRepositoryProtectedBranchResponse.Result.MergeRequestSetting;
import com.aliyuncs.codeup.model.v20200414.CreateRepositoryProtectedBranchResponse.Result.TestSetting;
import com.aliyuncs.codeup.model.v20200414.CreateRepositoryProtectedBranchResponse.Result.TestSetting.CheckConfig;
import com.aliyuncs.codeup.model.v20200414.CreateRepositoryProtectedBranchResponse.Result.TestSetting.CheckConfig.CheckItemsItem;
import com.aliyuncs.codeup.model.v20200414.CreateRepositoryProtectedBranchResponse.Result.TestSetting.CodingGuidelinesDetection;
import com.aliyuncs.codeup.model.v20200414.CreateRepositoryProtectedBranchResponse.Result.TestSetting.SensitiveInfoDetection;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRepositoryProtectedBranchResponseUnmarshaller {

	public static CreateRepositoryProtectedBranchResponse unmarshall(CreateRepositoryProtectedBranchResponse createRepositoryProtectedBranchResponse, UnmarshallerContext _ctx) {
		
		createRepositoryProtectedBranchResponse.setRequestId(_ctx.stringValue("CreateRepositoryProtectedBranchResponse.RequestId"));
		createRepositoryProtectedBranchResponse.setErrorCode(_ctx.stringValue("CreateRepositoryProtectedBranchResponse.ErrorCode"));
		createRepositoryProtectedBranchResponse.setErrorMessage(_ctx.stringValue("CreateRepositoryProtectedBranchResponse.ErrorMessage"));
		createRepositoryProtectedBranchResponse.setSuccess(_ctx.booleanValue("CreateRepositoryProtectedBranchResponse.Success"));

		Result result = new Result();
		result.setId(_ctx.longValue("CreateRepositoryProtectedBranchResponse.Result.Id"));
		result.setBranch(_ctx.stringValue("CreateRepositoryProtectedBranchResponse.Result.Branch"));

		List<Integer> allowPushRoles = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("CreateRepositoryProtectedBranchResponse.Result.AllowPushRoles.Length"); i++) {
			allowPushRoles.add(_ctx.integerValue("CreateRepositoryProtectedBranchResponse.Result.AllowPushRoles["+ i +"]"));
		}
		result.setAllowPushRoles(allowPushRoles);

		List<Integer> allowMergeRoles = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("CreateRepositoryProtectedBranchResponse.Result.AllowMergeRoles.Length"); i++) {
			allowMergeRoles.add(_ctx.integerValue("CreateRepositoryProtectedBranchResponse.Result.AllowMergeRoles["+ i +"]"));
		}
		result.setAllowMergeRoles(allowMergeRoles);

		MergeRequestSetting mergeRequestSetting = new MergeRequestSetting();
		mergeRequestSetting.setRequired(_ctx.booleanValue("CreateRepositoryProtectedBranchResponse.Result.MergeRequestSetting.Required"));
		mergeRequestSetting.setMergeRequestMode(_ctx.stringValue("CreateRepositoryProtectedBranchResponse.Result.MergeRequestSetting.MergeRequestMode"));
		mergeRequestSetting.setAllowSelfApproval(_ctx.booleanValue("CreateRepositoryProtectedBranchResponse.Result.MergeRequestSetting.AllowSelfApproval"));
		mergeRequestSetting.setIsRequireDiscussionProcessed(_ctx.booleanValue("CreateRepositoryProtectedBranchResponse.Result.MergeRequestSetting.IsRequireDiscussionProcessed"));
		mergeRequestSetting.setIsResetApprovalWhenNewPush(_ctx.booleanValue("CreateRepositoryProtectedBranchResponse.Result.MergeRequestSetting.IsResetApprovalWhenNewPush"));
		mergeRequestSetting.setMinimualApproval(_ctx.integerValue("CreateRepositoryProtectedBranchResponse.Result.MergeRequestSetting.MinimualApproval"));

		List<Integer> allowMergeRequestRoles = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("CreateRepositoryProtectedBranchResponse.Result.MergeRequestSetting.AllowMergeRequestRoles.Length"); i++) {
			allowMergeRequestRoles.add(_ctx.integerValue("CreateRepositoryProtectedBranchResponse.Result.MergeRequestSetting.AllowMergeRequestRoles["+ i +"]"));
		}
		mergeRequestSetting.setAllowMergeRequestRoles(allowMergeRequestRoles);

		List<String> defaultAssignees = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateRepositoryProtectedBranchResponse.Result.MergeRequestSetting.DefaultAssignees.Length"); i++) {
			defaultAssignees.add(_ctx.stringValue("CreateRepositoryProtectedBranchResponse.Result.MergeRequestSetting.DefaultAssignees["+ i +"]"));
		}
		mergeRequestSetting.setDefaultAssignees(defaultAssignees);
		result.setMergeRequestSetting(mergeRequestSetting);

		TestSetting testSetting = new TestSetting();
		testSetting.setRequired(_ctx.booleanValue("CreateRepositoryProtectedBranchResponse.Result.TestSetting.Required"));

		CodingGuidelinesDetection codingGuidelinesDetection = new CodingGuidelinesDetection();
		codingGuidelinesDetection.setEnabled(_ctx.booleanValue("CreateRepositoryProtectedBranchResponse.Result.TestSetting.CodingGuidelinesDetection.Enabled"));
		codingGuidelinesDetection.setMessage(_ctx.stringValue("CreateRepositoryProtectedBranchResponse.Result.TestSetting.CodingGuidelinesDetection.Message"));
		testSetting.setCodingGuidelinesDetection(codingGuidelinesDetection);

		SensitiveInfoDetection sensitiveInfoDetection = new SensitiveInfoDetection();
		sensitiveInfoDetection.setEnabled(_ctx.booleanValue("CreateRepositoryProtectedBranchResponse.Result.TestSetting.SensitiveInfoDetection.Enabled"));
		sensitiveInfoDetection.setMessage(_ctx.stringValue("CreateRepositoryProtectedBranchResponse.Result.TestSetting.SensitiveInfoDetection.Message"));
		testSetting.setSensitiveInfoDetection(sensitiveInfoDetection);

		CheckConfig checkConfig = new CheckConfig();

		List<CheckItemsItem> checkItems = new ArrayList<CheckItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateRepositoryProtectedBranchResponse.Result.TestSetting.CheckConfig.CheckItems.Length"); i++) {
			CheckItemsItem checkItemsItem = new CheckItemsItem();
			checkItemsItem.setName(_ctx.stringValue("CreateRepositoryProtectedBranchResponse.Result.TestSetting.CheckConfig.CheckItems["+ i +"].Name"));
			checkItemsItem.setRequired(_ctx.booleanValue("CreateRepositoryProtectedBranchResponse.Result.TestSetting.CheckConfig.CheckItems["+ i +"].Required"));

			checkItems.add(checkItemsItem);
		}
		checkConfig.setCheckItems(checkItems);
		testSetting.setCheckConfig(checkConfig);
		result.setTestSetting(testSetting);
		createRepositoryProtectedBranchResponse.setResult(result);
	 
	 	return createRepositoryProtectedBranchResponse;
	}
}