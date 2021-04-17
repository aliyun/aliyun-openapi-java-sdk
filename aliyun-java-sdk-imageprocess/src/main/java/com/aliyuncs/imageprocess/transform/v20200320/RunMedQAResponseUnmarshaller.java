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

package com.aliyuncs.imageprocess.transform.v20200320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imageprocess.model.v20200320.RunMedQAResponse;
import com.aliyuncs.imageprocess.model.v20200320.RunMedQAResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RunMedQAResponseUnmarshaller {

	public static RunMedQAResponse unmarshall(RunMedQAResponse runMedQAResponse, UnmarshallerContext _ctx) {
		
		runMedQAResponse.setRequestId(_ctx.stringValue("RunMedQAResponse.RequestId"));
		runMedQAResponse.setMessage(_ctx.stringValue("RunMedQAResponse.Message"));
		runMedQAResponse.setCode(_ctx.stringValue("RunMedQAResponse.Code"));

		Data data = new Data();
		data.setReports(_ctx.mapValue("RunMedQAResponse.Data.Reports"));
		data.setQuestionType(_ctx.stringValue("RunMedQAResponse.Data.QuestionType"));
		data.setAnswerType(_ctx.stringValue("RunMedQAResponse.Data.AnswerType"));
		data.setQuestion(_ctx.stringValue("RunMedQAResponse.Data.Question"));
		data.setSessionId(_ctx.stringValue("RunMedQAResponse.Data.SessionId"));

		List<String> options = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RunMedQAResponse.Data.Options.Length"); i++) {
			options.add(_ctx.stringValue("RunMedQAResponse.Data.Options["+ i +"]"));
		}
		data.setOptions(options);
		runMedQAResponse.setData(data);
	 
	 	return runMedQAResponse;
	}
}