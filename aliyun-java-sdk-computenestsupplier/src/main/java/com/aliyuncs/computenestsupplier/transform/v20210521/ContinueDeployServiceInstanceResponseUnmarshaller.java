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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.ContinueDeployServiceInstanceResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.ContinueDeployServiceInstanceResponse.DryRunResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ContinueDeployServiceInstanceResponseUnmarshaller {

	public static ContinueDeployServiceInstanceResponse unmarshall(ContinueDeployServiceInstanceResponse continueDeployServiceInstanceResponse, UnmarshallerContext _ctx) {
		
		continueDeployServiceInstanceResponse.setRequestId(_ctx.stringValue("ContinueDeployServiceInstanceResponse.RequestId"));
		continueDeployServiceInstanceResponse.setServiceInstanceId(_ctx.stringValue("ContinueDeployServiceInstanceResponse.ServiceInstanceId"));

		DryRunResult dryRunResult = new DryRunResult();

		List<String> parametersNotAllowedToBeModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ContinueDeployServiceInstanceResponse.DryRunResult.ParametersNotAllowedToBeModified.Length"); i++) {
			parametersNotAllowedToBeModified.add(_ctx.stringValue("ContinueDeployServiceInstanceResponse.DryRunResult.ParametersNotAllowedToBeModified["+ i +"]"));
		}
		dryRunResult.setParametersNotAllowedToBeModified(parametersNotAllowedToBeModified);

		List<String> parametersConditionallyAllowedToBeModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ContinueDeployServiceInstanceResponse.DryRunResult.ParametersConditionallyAllowedToBeModified.Length"); i++) {
			parametersConditionallyAllowedToBeModified.add(_ctx.stringValue("ContinueDeployServiceInstanceResponse.DryRunResult.ParametersConditionallyAllowedToBeModified["+ i +"]"));
		}
		dryRunResult.setParametersConditionallyAllowedToBeModified(parametersConditionallyAllowedToBeModified);

		List<String> parametersAllowedToBeModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ContinueDeployServiceInstanceResponse.DryRunResult.ParametersAllowedToBeModified.Length"); i++) {
			parametersAllowedToBeModified.add(_ctx.stringValue("ContinueDeployServiceInstanceResponse.DryRunResult.ParametersAllowedToBeModified["+ i +"]"));
		}
		dryRunResult.setParametersAllowedToBeModified(parametersAllowedToBeModified);
		continueDeployServiceInstanceResponse.setDryRunResult(dryRunResult);
	 
	 	return continueDeployServiceInstanceResponse;
	}
}