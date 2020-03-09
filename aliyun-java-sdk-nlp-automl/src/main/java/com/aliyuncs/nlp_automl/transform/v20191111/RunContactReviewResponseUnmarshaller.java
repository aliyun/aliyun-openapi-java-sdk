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

package com.aliyuncs.nlp_automl.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nlp_automl.model.v20191111.RunContactReviewResponse;
import com.aliyuncs.nlp_automl.model.v20191111.RunContactReviewResponse.ContactContent;
import com.aliyuncs.nlp_automl.model.v20191111.RunContactReviewResponse.ContactContent.ReviewResult;
import com.aliyuncs.nlp_automl.model.v20191111.RunContactReviewResponse.ContactContent.StructureResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class RunContactReviewResponseUnmarshaller {

	public static RunContactReviewResponse unmarshall(RunContactReviewResponse runContactReviewResponse, UnmarshallerContext _ctx) {
		
		runContactReviewResponse.setRequestId(_ctx.stringValue("RunContactReviewResponse.RequestId"));
		runContactReviewResponse.setRawContractContent(_ctx.stringValue("RunContactReviewResponse.RawContractContent"));

		ContactContent contactContent = new ContactContent();

		List<ReviewResult> reviewResults = new ArrayList<ReviewResult>();
		for (int i = 0; i < _ctx.lengthValue("RunContactReviewResponse.ContactContent.ReviewResults.Length"); i++) {
			ReviewResult reviewResult = new ReviewResult();
			reviewResult.setRiskLevel(_ctx.stringValue("RunContactReviewResponse.ContactContent.ReviewResults["+ i +"].RiskLevel"));
			reviewResult.setReason(_ctx.stringValue("RunContactReviewResponse.ContactContent.ReviewResults["+ i +"].Reason"));
			reviewResult.setType(_ctx.stringValue("RunContactReviewResponse.ContactContent.ReviewResults["+ i +"].Type"));
			reviewResult.setModificationSuggestion(_ctx.stringValue("RunContactReviewResponse.ContactContent.ReviewResults["+ i +"].ModificationSuggestion"));

			List<String> value = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("RunContactReviewResponse.ContactContent.ReviewResults["+ i +"].Value.Length"); j++) {
				value.add(_ctx.stringValue("RunContactReviewResponse.ContactContent.ReviewResults["+ i +"].Value["+ j +"]"));
			}
			reviewResult.setValue(value);

			List<String> endPosition = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("RunContactReviewResponse.ContactContent.ReviewResults["+ i +"].EndPosition.Length"); j++) {
				endPosition.add(_ctx.stringValue("RunContactReviewResponse.ContactContent.ReviewResults["+ i +"].EndPosition["+ j +"]"));
			}
			reviewResult.setEndPosition(endPosition);

			List<String> startPosition = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("RunContactReviewResponse.ContactContent.ReviewResults["+ i +"].StartPosition.Length"); j++) {
				startPosition.add(_ctx.stringValue("RunContactReviewResponse.ContactContent.ReviewResults["+ i +"].StartPosition["+ j +"]"));
			}
			reviewResult.setStartPosition(startPosition);

			reviewResults.add(reviewResult);
		}
		contactContent.setReviewResults(reviewResults);

		List<StructureResult> structureResults = new ArrayList<StructureResult>();
		for (int i = 0; i < _ctx.lengthValue("RunContactReviewResponse.ContactContent.StructureResults.Length"); i++) {
			StructureResult structureResult = new StructureResult();
			structureResult.setName(_ctx.stringValue("RunContactReviewResponse.ContactContent.StructureResults["+ i +"].Name"));
			structureResult.setType(_ctx.stringValue("RunContactReviewResponse.ContactContent.StructureResults["+ i +"].Type"));

			List<String> value1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("RunContactReviewResponse.ContactContent.StructureResults["+ i +"].Value.Length"); j++) {
				value1.add(_ctx.stringValue("RunContactReviewResponse.ContactContent.StructureResults["+ i +"].Value["+ j +"]"));
			}
			structureResult.setValue1(value1);

			List<String> endPosition2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("RunContactReviewResponse.ContactContent.StructureResults["+ i +"].EndPosition.Length"); j++) {
				endPosition2.add(_ctx.stringValue("RunContactReviewResponse.ContactContent.StructureResults["+ i +"].EndPosition["+ j +"]"));
			}
			structureResult.setEndPosition2(endPosition2);

			List<String> startPosition3 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("RunContactReviewResponse.ContactContent.StructureResults["+ i +"].StartPosition.Length"); j++) {
				startPosition3.add(_ctx.stringValue("RunContactReviewResponse.ContactContent.StructureResults["+ i +"].StartPosition["+ j +"]"));
			}
			structureResult.setStartPosition3(startPosition3);

			structureResults.add(structureResult);
		}
		contactContent.setStructureResults(structureResults);
		runContactReviewResponse.setContactContent(contactContent);
	 
	 	return runContactReviewResponse;
	}
}