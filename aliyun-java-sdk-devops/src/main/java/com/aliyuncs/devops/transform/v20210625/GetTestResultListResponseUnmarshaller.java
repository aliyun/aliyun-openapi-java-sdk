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

import com.aliyuncs.devops.model.v20210625.GetTestResultListResponse;
import com.aliyuncs.devops.model.v20210625.GetTestResultListResponse.TestcaseTestResultSummary;
import com.aliyuncs.devops.model.v20210625.GetTestResultListResponse.TestcaseTestResultSummary.AssignedTo;
import com.aliyuncs.devops.model.v20210625.GetTestResultListResponse.TestcaseTestResultSummary.FieldValueVO;
import com.aliyuncs.devops.model.v20210625.GetTestResultListResponse.TestcaseTestResultSummary.TestResultExecutor;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTestResultListResponseUnmarshaller {

	public static GetTestResultListResponse unmarshall(GetTestResultListResponse getTestResultListResponse, UnmarshallerContext _ctx) {
		
		getTestResultListResponse.setRequestId(_ctx.stringValue("GetTestResultListResponse.requestId"));
		getTestResultListResponse.setErrorMsg(_ctx.stringValue("GetTestResultListResponse.errorMsg"));
		getTestResultListResponse.setErrorCode(_ctx.stringValue("GetTestResultListResponse.errorCode"));
		getTestResultListResponse.setSuccess(_ctx.booleanValue("GetTestResultListResponse.success"));

		List<TestcaseTestResultSummary> testResult = new ArrayList<TestcaseTestResultSummary>();
		for (int i = 0; i < _ctx.lengthValue("GetTestResultListResponse.testResult.Length"); i++) {
			TestcaseTestResultSummary testcaseTestResultSummary = new TestcaseTestResultSummary();
			testcaseTestResultSummary.setTestResultIdentifier(_ctx.stringValue("GetTestResultListResponse.testResult["+ i +"].testResultIdentifier"));
			testcaseTestResultSummary.setTestResultStatus(_ctx.stringValue("GetTestResultListResponse.testResult["+ i +"].testResultStatus"));
			testcaseTestResultSummary.setTestResultGmtCreate(_ctx.longValue("GetTestResultListResponse.testResult["+ i +"].testResultGmtCreate"));
			testcaseTestResultSummary.setTestcaseIdentifier(_ctx.stringValue("GetTestResultListResponse.testResult["+ i +"].testcaseIdentifier"));
			testcaseTestResultSummary.setBugCount(_ctx.longValue("GetTestResultListResponse.testResult["+ i +"].bugCount"));
			testcaseTestResultSummary.setSubject(_ctx.stringValue("GetTestResultListResponse.testResult["+ i +"].subject"));
			testcaseTestResultSummary.setSpaceIdentifier(_ctx.stringValue("GetTestResultListResponse.testResult["+ i +"].spaceIdentifier"));
			testcaseTestResultSummary.setCategoryIdentifier(_ctx.stringValue("GetTestResultListResponse.testResult["+ i +"].categoryIdentifier"));
			testcaseTestResultSummary.setGmtCreate(_ctx.longValue("GetTestResultListResponse.testResult["+ i +"].gmtCreate"));

			TestResultExecutor testResultExecutor = new TestResultExecutor();
			testResultExecutor.setExecutorIdentifier(_ctx.stringValue("GetTestResultListResponse.testResult["+ i +"].testResultExecutor.executorIdentifier"));
			testResultExecutor.setName(_ctx.stringValue("GetTestResultListResponse.testResult["+ i +"].testResultExecutor.name"));
			testcaseTestResultSummary.setTestResultExecutor(testResultExecutor);

			AssignedTo assignedTo = new AssignedTo();
			assignedTo.setAssignedToIdenttifier(_ctx.stringValue("GetTestResultListResponse.testResult["+ i +"].assignedTo.assignedToIdenttifier"));
			assignedTo.setName(_ctx.stringValue("GetTestResultListResponse.testResult["+ i +"].assignedTo.name"));
			testcaseTestResultSummary.setAssignedTo(assignedTo);

			List<FieldValueVO> customFields = new ArrayList<FieldValueVO>();
			for (int j = 0; j < _ctx.lengthValue("GetTestResultListResponse.testResult["+ i +"].customFields.Length"); j++) {
				FieldValueVO fieldValueVO = new FieldValueVO();
				fieldValueVO.setFieldIdentifier(_ctx.stringValue("GetTestResultListResponse.testResult["+ i +"].customFields["+ j +"].fieldIdentifier"));
				fieldValueVO.setValue(_ctx.stringValue("GetTestResultListResponse.testResult["+ i +"].customFields["+ j +"].value"));
				fieldValueVO.setFieldFormat(_ctx.stringValue("GetTestResultListResponse.testResult["+ i +"].customFields["+ j +"].fieldFormat"));
				fieldValueVO.setFieldClassName(_ctx.stringValue("GetTestResultListResponse.testResult["+ i +"].customFields["+ j +"].fieldClassName"));

				customFields.add(fieldValueVO);
			}
			testcaseTestResultSummary.setCustomFields(customFields);

			testResult.add(testcaseTestResultSummary);
		}
		getTestResultListResponse.setTestResult(testResult);
	 
	 	return getTestResultListResponse;
	}
}