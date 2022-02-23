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

import com.aliyuncs.config.model.v20200907.DeleteAggregateRemediationsResponse;
import com.aliyuncs.config.model.v20200907.DeleteAggregateRemediationsResponse.RemediationDeleteResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAggregateRemediationsResponseUnmarshaller {

	public static DeleteAggregateRemediationsResponse unmarshall(DeleteAggregateRemediationsResponse deleteAggregateRemediationsResponse, UnmarshallerContext _ctx) {
		
		deleteAggregateRemediationsResponse.setRequestId(_ctx.stringValue("DeleteAggregateRemediationsResponse.RequestId"));

		List<RemediationDeleteResult> remediationDeleteResults = new ArrayList<RemediationDeleteResult>();
		for (int i = 0; i < _ctx.lengthValue("DeleteAggregateRemediationsResponse.RemediationDeleteResults.Length"); i++) {
			RemediationDeleteResult remediationDeleteResult = new RemediationDeleteResult();
			remediationDeleteResult.setRemediationId(_ctx.stringValue("DeleteAggregateRemediationsResponse.RemediationDeleteResults["+ i +"].RemediationId"));
			remediationDeleteResult.setErrorMessage(_ctx.stringValue("DeleteAggregateRemediationsResponse.RemediationDeleteResults["+ i +"].ErrorMessage"));
			remediationDeleteResult.setSuccess(_ctx.booleanValue("DeleteAggregateRemediationsResponse.RemediationDeleteResults["+ i +"].Success"));

			remediationDeleteResults.add(remediationDeleteResult);
		}
		deleteAggregateRemediationsResponse.setRemediationDeleteResults(remediationDeleteResults);
	 
	 	return deleteAggregateRemediationsResponse;
	}
}