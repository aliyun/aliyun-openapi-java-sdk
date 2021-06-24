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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsAddDiagnoseFeedbackInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsAddDiagnoseFeedbackInfoResponseUnmarshaller {

	public static OpsAddDiagnoseFeedbackInfoResponse unmarshall(OpsAddDiagnoseFeedbackInfoResponse opsAddDiagnoseFeedbackInfoResponse, UnmarshallerContext _ctx) {
		
		opsAddDiagnoseFeedbackInfoResponse.setRequestId(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.RequestId"));
		opsAddDiagnoseFeedbackInfoResponse.setResult(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.Result"));

		List<DiagnoseFeedbackContent> diagnoseFeedbackContents = new ArrayList<DiagnoseFeedbackContent>();
		for (int i = 0; i < _ctx.lengthValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents.Length"); i++) {
			DiagnoseFeedbackContent diagnoseFeedbackContent = new DiagnoseFeedbackContent();
			diagnoseFeedbackContent.setSrcErrorDesc(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].SrcErrorDesc"));
			diagnoseFeedbackContent.setCompareResult(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].CompareResult"));
			diagnoseFeedbackContent.setSrcExceptionName(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].SrcExceptionName"));
			diagnoseFeedbackContent.setSuggestExceptionName(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].SuggestExceptionName"));
			diagnoseFeedbackContent.setFeedbackUserId(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].FeedbackUserId"));
			diagnoseFeedbackContent.setNcIp(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].NcIp"));
			diagnoseFeedbackContent.setSrcTeams(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].SrcTeams"));
			diagnoseFeedbackContent.setSrcExceptionTime(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].SrcExceptionTime"));
			diagnoseFeedbackContent.setGmtCreated(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].GmtCreated"));
			diagnoseFeedbackContent.setSrcExceptionType(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].SrcExceptionType"));
			diagnoseFeedbackContent.setMatchedFeatures(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].MatchedFeatures"));
			diagnoseFeedbackContent.setSuggestErrorDesc(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].SuggestErrorDesc"));
			diagnoseFeedbackContent.setSuggestTeams(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].SuggestTeams"));
			diagnoseFeedbackContent.setFeedbackUserName(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].FeedbackUserName"));
			diagnoseFeedbackContent.setSuggestOthers(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].SuggestOthers"));
			diagnoseFeedbackContent.setSrcReason(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].SrcReason"));
			diagnoseFeedbackContent.setSuggestReason(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].SuggestReason"));
			diagnoseFeedbackContent.setMachineId(_ctx.stringValue("OpsAddDiagnoseFeedbackInfoResponse.DiagnoseFeedbackContents["+ i +"].MachineId"));

			diagnoseFeedbackContents.add(diagnoseFeedbackContent);
		}
		opsAddDiagnoseFeedbackInfoResponse.setDiagnoseFeedbackContents(diagnoseFeedbackContents);
	 
	 	return opsAddDiagnoseFeedbackInfoResponse;
	}
}