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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.UpdateStackResponse;
import com.aliyuncs.ros.model.v20190910.UpdateStackResponse.DryRunResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateStackResponseUnmarshaller {

	public static UpdateStackResponse unmarshall(UpdateStackResponse updateStackResponse, UnmarshallerContext _ctx) {
		
		updateStackResponse.setRequestId(_ctx.stringValue("UpdateStackResponse.RequestId"));
		updateStackResponse.setStackId(_ctx.stringValue("UpdateStackResponse.StackId"));

		DryRunResult dryRunResult = new DryRunResult();

		List<String> parametersAllowedToBeModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateStackResponse.DryRunResult.ParametersAllowedToBeModified.Length"); i++) {
			parametersAllowedToBeModified.add(_ctx.stringValue("UpdateStackResponse.DryRunResult.ParametersAllowedToBeModified["+ i +"]"));
		}
		dryRunResult.setParametersAllowedToBeModified(parametersAllowedToBeModified);

		List<String> parametersConditionallyAllowedToBeModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateStackResponse.DryRunResult.ParametersConditionallyAllowedToBeModified.Length"); i++) {
			parametersConditionallyAllowedToBeModified.add(_ctx.stringValue("UpdateStackResponse.DryRunResult.ParametersConditionallyAllowedToBeModified["+ i +"]"));
		}
		dryRunResult.setParametersConditionallyAllowedToBeModified(parametersConditionallyAllowedToBeModified);

		List<String> parametersUncertainlyAllowedToBeModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateStackResponse.DryRunResult.ParametersUncertainlyAllowedToBeModified.Length"); i++) {
			parametersUncertainlyAllowedToBeModified.add(_ctx.stringValue("UpdateStackResponse.DryRunResult.ParametersUncertainlyAllowedToBeModified["+ i +"]"));
		}
		dryRunResult.setParametersUncertainlyAllowedToBeModified(parametersUncertainlyAllowedToBeModified);

		List<String> parametersNotAllowedToBeModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateStackResponse.DryRunResult.ParametersNotAllowedToBeModified.Length"); i++) {
			parametersNotAllowedToBeModified.add(_ctx.stringValue("UpdateStackResponse.DryRunResult.ParametersNotAllowedToBeModified["+ i +"]"));
		}
		dryRunResult.setParametersNotAllowedToBeModified(parametersNotAllowedToBeModified);

		List<String> parametersCauseInterruptionIfModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateStackResponse.DryRunResult.ParametersCauseInterruptionIfModified.Length"); i++) {
			parametersCauseInterruptionIfModified.add(_ctx.stringValue("UpdateStackResponse.DryRunResult.ParametersCauseInterruptionIfModified["+ i +"]"));
		}
		dryRunResult.setParametersCauseInterruptionIfModified(parametersCauseInterruptionIfModified);

		List<String> parametersConditionallyCauseInterruptionIfModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateStackResponse.DryRunResult.ParametersConditionallyCauseInterruptionIfModified.Length"); i++) {
			parametersConditionallyCauseInterruptionIfModified.add(_ctx.stringValue("UpdateStackResponse.DryRunResult.ParametersConditionallyCauseInterruptionIfModified["+ i +"]"));
		}
		dryRunResult.setParametersConditionallyCauseInterruptionIfModified(parametersConditionallyCauseInterruptionIfModified);

		List<String> parametersUncertainlyCauseInterruptionIfModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateStackResponse.DryRunResult.ParametersUncertainlyCauseInterruptionIfModified.Length"); i++) {
			parametersUncertainlyCauseInterruptionIfModified.add(_ctx.stringValue("UpdateStackResponse.DryRunResult.ParametersUncertainlyCauseInterruptionIfModified["+ i +"]"));
		}
		dryRunResult.setParametersUncertainlyCauseInterruptionIfModified(parametersUncertainlyCauseInterruptionIfModified);

		List<String> parametersCauseReplacementIfModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateStackResponse.DryRunResult.ParametersCauseReplacementIfModified.Length"); i++) {
			parametersCauseReplacementIfModified.add(_ctx.stringValue("UpdateStackResponse.DryRunResult.ParametersCauseReplacementIfModified["+ i +"]"));
		}
		dryRunResult.setParametersCauseReplacementIfModified(parametersCauseReplacementIfModified);

		List<String> parametersConditionallyCauseReplacementIfModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateStackResponse.DryRunResult.ParametersConditionallyCauseReplacementIfModified.Length"); i++) {
			parametersConditionallyCauseReplacementIfModified.add(_ctx.stringValue("UpdateStackResponse.DryRunResult.ParametersConditionallyCauseReplacementIfModified["+ i +"]"));
		}
		dryRunResult.setParametersConditionallyCauseReplacementIfModified(parametersConditionallyCauseReplacementIfModified);

		List<String> parametersUncertainlyCauseReplacementIfModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateStackResponse.DryRunResult.ParametersUncertainlyCauseReplacementIfModified.Length"); i++) {
			parametersUncertainlyCauseReplacementIfModified.add(_ctx.stringValue("UpdateStackResponse.DryRunResult.ParametersUncertainlyCauseReplacementIfModified["+ i +"]"));
		}
		dryRunResult.setParametersUncertainlyCauseReplacementIfModified(parametersUncertainlyCauseReplacementIfModified);
		updateStackResponse.setDryRunResult(dryRunResult);
	 
	 	return updateStackResponse;
	}
}