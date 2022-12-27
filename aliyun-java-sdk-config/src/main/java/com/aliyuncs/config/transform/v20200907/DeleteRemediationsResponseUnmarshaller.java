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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.DeleteRemediationsResponse;
import com.aliyuncs.config.model.v20200907.DeleteRemediationsResponse.RemediationDeleteResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRemediationsResponseUnmarshaller {

	public static DeleteRemediationsResponse unmarshall(DeleteRemediationsResponse deleteRemediationsResponse, UnmarshallerContext _ctx) {
		
		deleteRemediationsResponse.setRequestId(_ctx.stringValue("DeleteRemediationsResponse.RequestId"));

		List<RemediationDeleteResult> remediationDeleteResults = new ArrayList<RemediationDeleteResult>();
		for (int i = 0; i < _ctx.lengthValue("DeleteRemediationsResponse.RemediationDeleteResults.Length"); i++) {
			RemediationDeleteResult remediationDeleteResult = new RemediationDeleteResult();
			remediationDeleteResult.setRemediationId(_ctx.stringValue("DeleteRemediationsResponse.RemediationDeleteResults["+ i +"].RemediationId"));
			remediationDeleteResult.setErrorMessage(_ctx.stringValue("DeleteRemediationsResponse.RemediationDeleteResults["+ i +"].ErrorMessage"));
			remediationDeleteResult.setSuccess(_ctx.booleanValue("DeleteRemediationsResponse.RemediationDeleteResults["+ i +"].Success"));

			remediationDeleteResults.add(remediationDeleteResult);
		}
		deleteRemediationsResponse.setRemediationDeleteResults(remediationDeleteResults);
	 
	 	return deleteRemediationsResponse;
	}
}