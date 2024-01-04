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

import com.aliyuncs.devops.model.v20210625.CreateTestCaseResponse;
import com.aliyuncs.devops.model.v20210625.CreateTestCaseResponse.Testcase;
import com.aliyuncs.devops.model.v20210625.CreateTestCaseResponse.Testcase.AssignedTo;
import com.aliyuncs.devops.model.v20210625.CreateTestCaseResponse.Testcase.Creator;
import com.aliyuncs.devops.model.v20210625.CreateTestCaseResponse.Testcase.DetailInfo;
import com.aliyuncs.devops.model.v20210625.CreateTestCaseResponse.Testcase.DetailInfo.ExpectedResult;
import com.aliyuncs.devops.model.v20210625.CreateTestCaseResponse.Testcase.DetailInfo.Precondition;
import com.aliyuncs.devops.model.v20210625.CreateTestCaseResponse.Testcase.DetailInfo.StepContent;
import com.aliyuncs.devops.model.v20210625.CreateTestCaseResponse.Testcase.Directory;
import com.aliyuncs.devops.model.v20210625.CreateTestCaseResponse.Testcase.Modifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTestCaseResponseUnmarshaller {

	public static CreateTestCaseResponse unmarshall(CreateTestCaseResponse createTestCaseResponse, UnmarshallerContext _ctx) {
		
		createTestCaseResponse.setRequestId(_ctx.stringValue("CreateTestCaseResponse.requestId"));
		createTestCaseResponse.setErrorMsg(_ctx.stringValue("CreateTestCaseResponse.errorMsg"));
		createTestCaseResponse.setErrorCode(_ctx.stringValue("CreateTestCaseResponse.errorCode"));
		createTestCaseResponse.setSuccess(_ctx.booleanValue("CreateTestCaseResponse.success"));

		Testcase testcase = new Testcase();
		testcase.setIdentifier(_ctx.stringValue("CreateTestCaseResponse.testcase.identifier"));
		testcase.setSubject(_ctx.stringValue("CreateTestCaseResponse.testcase.subject"));
		testcase.setSpaceIdentifier(_ctx.stringValue("CreateTestCaseResponse.testcase.spaceIdentifier"));
		testcase.setSpaceType(_ctx.stringValue("CreateTestCaseResponse.testcase.spaceType"));
		testcase.setCategoryIdentifier(_ctx.stringValue("CreateTestCaseResponse.testcase.categoryIdentifier"));

		AssignedTo assignedTo = new AssignedTo();
		assignedTo.setAssignIdentifier(_ctx.stringValue("CreateTestCaseResponse.testcase.assignedTo.assignIdentifier"));
		assignedTo.setName(_ctx.stringValue("CreateTestCaseResponse.testcase.assignedTo.name"));
		assignedTo.setTbRoleId(_ctx.stringValue("CreateTestCaseResponse.testcase.assignedTo.tbRoleId"));
		testcase.setAssignedTo(assignedTo);

		Creator creator = new Creator();
		creator.setCreateIdentifier(_ctx.stringValue("CreateTestCaseResponse.testcase.creator.createIdentifier"));
		creator.setName(_ctx.stringValue("CreateTestCaseResponse.testcase.creator.name"));
		testcase.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setModifyIdentifier(_ctx.stringValue("CreateTestCaseResponse.testcase.modifier.modifyIdentifier"));
		modifier.setName(_ctx.stringValue("CreateTestCaseResponse.testcase.modifier.name"));
		testcase.setModifier(modifier);

		Directory directory = new Directory();
		directory.setDirectoryIdentifier(_ctx.stringValue("CreateTestCaseResponse.testcase.directory.directoryIdentifier"));
		directory.setName(_ctx.stringValue("CreateTestCaseResponse.testcase.directory.name"));
		directory.setChildIdentifier(_ctx.stringValue("CreateTestCaseResponse.testcase.directory.childIdentifier"));

		List<String> pathName = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateTestCaseResponse.testcase.directory.pathName.Length"); i++) {
			pathName.add(_ctx.stringValue("CreateTestCaseResponse.testcase.directory.pathName["+ i +"]"));
		}
		directory.setPathName(pathName);
		testcase.setDirectory(directory);

		DetailInfo detailInfo = new DetailInfo();
		detailInfo.setStepType(_ctx.stringValue("CreateTestCaseResponse.testcase.detailInfo.stepType"));

		Precondition precondition = new Precondition();
		precondition.setPreIdentifier(_ctx.stringValue("CreateTestCaseResponse.testcase.detailInfo.precondition.preIdentifier"));
		precondition.setPreContent(_ctx.stringValue("CreateTestCaseResponse.testcase.detailInfo.precondition.preContent"));
		precondition.setPreContentType(_ctx.stringValue("CreateTestCaseResponse.testcase.detailInfo.precondition.preContentType"));
		detailInfo.setPrecondition(precondition);

		StepContent stepContent = new StepContent();
		stepContent.setStepIdentifier(_ctx.stringValue("CreateTestCaseResponse.testcase.detailInfo.stepContent.stepIdentifier"));
		stepContent.setStepContent(_ctx.stringValue("CreateTestCaseResponse.testcase.detailInfo.stepContent.stepContent"));
		stepContent.setStepContentType(_ctx.stringValue("CreateTestCaseResponse.testcase.detailInfo.stepContent.stepContentType"));
		detailInfo.setStepContent(stepContent);

		ExpectedResult expectedResult = new ExpectedResult();
		expectedResult.setExpectIdentifier(_ctx.stringValue("CreateTestCaseResponse.testcase.detailInfo.expectedResult.expectIdentifier"));
		expectedResult.setExpectContent(_ctx.stringValue("CreateTestCaseResponse.testcase.detailInfo.expectedResult.expectContent"));
		expectedResult.setExpectContentType(_ctx.stringValue("CreateTestCaseResponse.testcase.detailInfo.expectedResult.expectContentType"));
		detailInfo.setExpectedResult(expectedResult);
		testcase.setDetailInfo(detailInfo);
		createTestCaseResponse.setTestcase(testcase);
	 
	 	return createTestCaseResponse;
	}
}