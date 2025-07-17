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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paifeaturestore.model.v20230621.CheckModelFeatureFGFeatureResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.CheckModelFeatureFGFeatureResponse.FGCheckResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckModelFeatureFGFeatureResponseUnmarshaller {

	public static CheckModelFeatureFGFeatureResponse unmarshall(CheckModelFeatureFGFeatureResponse checkModelFeatureFGFeatureResponse, UnmarshallerContext _ctx) {
		
		checkModelFeatureFGFeatureResponse.setRequestId(_ctx.stringValue("CheckModelFeatureFGFeatureResponse.requestId"));

		List<FGCheckResultsItem> fGCheckResults = new ArrayList<FGCheckResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("CheckModelFeatureFGFeatureResponse.FGCheckResults.Length"); i++) {
			FGCheckResultsItem fGCheckResultsItem = new FGCheckResultsItem();
			fGCheckResultsItem.setRuleCode(_ctx.stringValue("CheckModelFeatureFGFeatureResponse.FGCheckResults["+ i +"].RuleCode"));
			fGCheckResultsItem.setStatus(_ctx.booleanValue("CheckModelFeatureFGFeatureResponse.FGCheckResults["+ i +"].Status"));
			fGCheckResultsItem.setMessage(_ctx.stringValue("CheckModelFeatureFGFeatureResponse.FGCheckResults["+ i +"].Message"));

			fGCheckResults.add(fGCheckResultsItem);
		}
		checkModelFeatureFGFeatureResponse.setFGCheckResults(fGCheckResults);
	 
	 	return checkModelFeatureFGFeatureResponse;
	}
}