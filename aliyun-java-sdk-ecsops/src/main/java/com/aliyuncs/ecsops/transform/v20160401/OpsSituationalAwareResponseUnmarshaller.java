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

import com.aliyuncs.ecsops.model.v20160401.OpsSituationalAwareResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsSituationalAwareResponse.RootCause;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSituationalAwareResponseUnmarshaller {

	public static OpsSituationalAwareResponse unmarshall(OpsSituationalAwareResponse opsSituationalAwareResponse, UnmarshallerContext _ctx) {
		
		opsSituationalAwareResponse.setRequestId(_ctx.stringValue("OpsSituationalAwareResponse.RequestId"));
		opsSituationalAwareResponse.setStatus(_ctx.stringValue("OpsSituationalAwareResponse.Status"));
		opsSituationalAwareResponse.setFinished(_ctx.booleanValue("OpsSituationalAwareResponse.Finished"));
		opsSituationalAwareResponse.setToken(_ctx.stringValue("OpsSituationalAwareResponse.Token"));
		opsSituationalAwareResponse.setIterationQuery(_ctx.booleanValue("OpsSituationalAwareResponse.IterationQuery"));
		opsSituationalAwareResponse.setValidMachineIdCount(_ctx.integerValue("OpsSituationalAwareResponse.ValidMachineIdCount"));
		opsSituationalAwareResponse.setErrorInfo(_ctx.stringValue("OpsSituationalAwareResponse.ErrorInfo"));

		List<String> iterationTokens = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsSituationalAwareResponse.IterationTokens.Length"); i++) {
			iterationTokens.add(_ctx.stringValue("OpsSituationalAwareResponse.IterationTokens["+ i +"]"));
		}
		opsSituationalAwareResponse.setIterationTokens(iterationTokens);

		List<String> validMachineIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsSituationalAwareResponse.ValidMachineIds.Length"); i++) {
			validMachineIds.add(_ctx.stringValue("OpsSituationalAwareResponse.ValidMachineIds["+ i +"]"));
		}
		opsSituationalAwareResponse.setValidMachineIds(validMachineIds);

		List<RootCause> rootCauseList = new ArrayList<RootCause>();
		for (int i = 0; i < _ctx.lengthValue("OpsSituationalAwareResponse.RootCauseList.Length"); i++) {
			RootCause rootCause = new RootCause();
			rootCause.setAdditionalInfo(_ctx.stringValue("OpsSituationalAwareResponse.RootCauseList["+ i +"].AdditionalInfo"));
			rootCause.setNcIp(_ctx.stringValue("OpsSituationalAwareResponse.RootCauseList["+ i +"].NcIp"));
			rootCause.setExceptionTime(_ctx.stringValue("OpsSituationalAwareResponse.RootCauseList["+ i +"].ExceptionTime"));
			rootCause.setLevel(_ctx.integerValue("OpsSituationalAwareResponse.RootCauseList["+ i +"].Level"));
			rootCause.setMachineId(_ctx.stringValue("OpsSituationalAwareResponse.RootCauseList["+ i +"].MachineId"));
			rootCause.setExceptionType(_ctx.stringValue("OpsSituationalAwareResponse.RootCauseList["+ i +"].ExceptionType"));
			rootCause.setInstanceType(_ctx.stringValue("OpsSituationalAwareResponse.RootCauseList["+ i +"].InstanceType"));
			rootCause.setReason(_ctx.stringValue("OpsSituationalAwareResponse.RootCauseList["+ i +"].Reason"));
			rootCause.setExceptionName(_ctx.stringValue("OpsSituationalAwareResponse.RootCauseList["+ i +"].ExceptionName"));
			rootCause.setWarningLevel(_ctx.stringValue("OpsSituationalAwareResponse.RootCauseList["+ i +"].WarningLevel"));
			rootCause.setWarningValue(_ctx.stringValue("OpsSituationalAwareResponse.RootCauseList["+ i +"].WarningValue"));
			rootCause.setMessage(_ctx.stringValue("OpsSituationalAwareResponse.RootCauseList["+ i +"].Message"));
			rootCause.setDesc(_ctx.stringValue("OpsSituationalAwareResponse.RootCauseList["+ i +"].Desc"));

			List<String> supportTeams = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsSituationalAwareResponse.RootCauseList["+ i +"].SupportTeams.Length"); j++) {
				supportTeams.add(_ctx.stringValue("OpsSituationalAwareResponse.RootCauseList["+ i +"].SupportTeams["+ j +"]"));
			}
			rootCause.setSupportTeams(supportTeams);

			rootCauseList.add(rootCause);
		}
		opsSituationalAwareResponse.setRootCauseList(rootCauseList);
	 
	 	return opsSituationalAwareResponse;
	}
}