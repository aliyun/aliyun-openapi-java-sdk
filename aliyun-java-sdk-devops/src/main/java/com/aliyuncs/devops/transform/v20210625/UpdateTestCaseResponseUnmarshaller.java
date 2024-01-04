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

import com.aliyuncs.devops.model.v20210625.UpdateTestCaseResponse;
import com.aliyuncs.devops.model.v20210625.UpdateTestCaseResponse.Testcase;
import com.aliyuncs.devops.model.v20210625.UpdateTestCaseResponse.Testcase.AssignedTo;
import com.aliyuncs.devops.model.v20210625.UpdateTestCaseResponse.Testcase.Creator;
import com.aliyuncs.devops.model.v20210625.UpdateTestCaseResponse.Testcase.DetailInfo;
import com.aliyuncs.devops.model.v20210625.UpdateTestCaseResponse.Testcase.DetailInfo.ExpectedResult;
import com.aliyuncs.devops.model.v20210625.UpdateTestCaseResponse.Testcase.DetailInfo.Precondition;
import com.aliyuncs.devops.model.v20210625.UpdateTestCaseResponse.Testcase.DetailInfo.StepContent;
import com.aliyuncs.devops.model.v20210625.UpdateTestCaseResponse.Testcase.Directory;
import com.aliyuncs.devops.model.v20210625.UpdateTestCaseResponse.Testcase.Modifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTestCaseResponseUnmarshaller {

	public static UpdateTestCaseResponse unmarshall(UpdateTestCaseResponse updateTestCaseResponse, UnmarshallerContext _ctx) {
		
		updateTestCaseResponse.setRequestId(_ctx.stringValue("UpdateTestCaseResponse.requestId"));
		updateTestCaseResponse.setErrorMsg(_ctx.stringValue("UpdateTestCaseResponse.errorMsg"));
		updateTestCaseResponse.setErrorCode(_ctx.stringValue("UpdateTestCaseResponse.errorCode"));
		updateTestCaseResponse.setSuccess(_ctx.booleanValue("UpdateTestCaseResponse.success"));

		Testcase testcase = new Testcase();
		testcase.setIdentifier(_ctx.stringValue("UpdateTestCaseResponse.Testcase.identifier"));
		testcase.setSubject(_ctx.stringValue("UpdateTestCaseResponse.Testcase.subject"));
		testcase.setSpaceIdentifier(_ctx.stringValue("UpdateTestCaseResponse.Testcase.spaceIdentifier"));
		testcase.setSpaceType(_ctx.stringValue("UpdateTestCaseResponse.Testcase.spaceType"));
		testcase.setCategoryIdentifier(_ctx.stringValue("UpdateTestCaseResponse.Testcase.categoryIdentifier"));

		AssignedTo assignedTo = new AssignedTo();
		assignedTo.setAssignIdentifier(_ctx.stringValue("UpdateTestCaseResponse.Testcase.assignedTo.assignIdentifier"));
		assignedTo.setName(_ctx.stringValue("UpdateTestCaseResponse.Testcase.assignedTo.name"));
		assignedTo.setTbRoleId(_ctx.stringValue("UpdateTestCaseResponse.Testcase.assignedTo.tbRoleId"));
		testcase.setAssignedTo(assignedTo);

		Creator creator = new Creator();
		creator.setCreateIdentifier(_ctx.stringValue("UpdateTestCaseResponse.Testcase.creator.createIdentifier"));
		creator.setName(_ctx.stringValue("UpdateTestCaseResponse.Testcase.creator.name"));
		testcase.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setModifyIdentifier(_ctx.stringValue("UpdateTestCaseResponse.Testcase.modifier.modifyIdentifier"));
		modifier.setName(_ctx.stringValue("UpdateTestCaseResponse.Testcase.modifier.name"));
		testcase.setModifier(modifier);

		Directory directory = new Directory();
		directory.setDirectoryIdentifier(_ctx.stringValue("UpdateTestCaseResponse.Testcase.directory.directoryIdentifier"));
		directory.setName(_ctx.stringValue("UpdateTestCaseResponse.Testcase.directory.name"));
		directory.setChildIdentifier(_ctx.stringValue("UpdateTestCaseResponse.Testcase.directory.childIdentifier"));

		List<String> pathName = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateTestCaseResponse.Testcase.directory.pathName.Length"); i++) {
			pathName.add(_ctx.stringValue("UpdateTestCaseResponse.Testcase.directory.pathName["+ i +"]"));
		}
		directory.setPathName(pathName);
		testcase.setDirectory(directory);

		DetailInfo detailInfo = new DetailInfo();
		detailInfo.setStepType(_ctx.stringValue("UpdateTestCaseResponse.Testcase.detailInfo.stepType"));

		Precondition precondition = new Precondition();
		precondition.setPreIdentifier(_ctx.stringValue("UpdateTestCaseResponse.Testcase.detailInfo.precondition.preIdentifier"));
		precondition.setPreContent(_ctx.stringValue("UpdateTestCaseResponse.Testcase.detailInfo.precondition.preContent"));
		precondition.setPreContentType(_ctx.stringValue("UpdateTestCaseResponse.Testcase.detailInfo.precondition.preContentType"));
		detailInfo.setPrecondition(precondition);

		StepContent stepContent = new StepContent();
		stepContent.setStepIdentifier(_ctx.stringValue("UpdateTestCaseResponse.Testcase.detailInfo.stepContent.stepIdentifier"));
		stepContent.setStepContent(_ctx.stringValue("UpdateTestCaseResponse.Testcase.detailInfo.stepContent.stepContent"));
		stepContent.setStepContentType(_ctx.stringValue("UpdateTestCaseResponse.Testcase.detailInfo.stepContent.stepContentType"));
		detailInfo.setStepContent(stepContent);

		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.setExpectIdentifier(_ctx.stringValue("UpdateTestCaseResponse.Testcase.detailInfo.expectedResult.expectIdentifier"));
		expectedResult.setExpectContent(_ctx.stringValue("UpdateTestCaseResponse.Testcase.detailInfo.expectedResult.expectContent"));
		expectedResult.setExpectContentType(_ctx.stringValue("UpdateTestCaseResponse.Testcase.detailInfo.expectedResult.expectContentType"));
		detailInfo.setExpectedResult(expectedResult);
		testcase.setDetailInfo(detailInfo);
		updateTestCaseResponse.setTestcase(testcase);
	 
	 	return updateTestCaseResponse;
	}
}