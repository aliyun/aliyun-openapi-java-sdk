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

import com.aliyuncs.ecsops.model.v20160401.OpsCreateChangeGuestOSDiagnoseResultResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsCreateChangeGuestOSDiagnoseResultResponse.GuestOSDiagnoseResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsCreateChangeGuestOSDiagnoseResultResponseUnmarshaller {

	public static OpsCreateChangeGuestOSDiagnoseResultResponse unmarshall(OpsCreateChangeGuestOSDiagnoseResultResponse opsCreateChangeGuestOSDiagnoseResultResponse, UnmarshallerContext _ctx) {
		
		opsCreateChangeGuestOSDiagnoseResultResponse.setRequestId(_ctx.stringValue("OpsCreateChangeGuestOSDiagnoseResultResponse.RequestId"));

		List<GuestOSDiagnoseResult> data = new ArrayList<GuestOSDiagnoseResult>();
		for (int i = 0; i < _ctx.lengthValue("OpsCreateChangeGuestOSDiagnoseResultResponse.Data.Length"); i++) {
			GuestOSDiagnoseResult guestOSDiagnoseResult = new GuestOSDiagnoseResult();
			guestOSDiagnoseResult.setStatus(_ctx.stringValue("OpsCreateChangeGuestOSDiagnoseResultResponse.Data["+ i +"].Status"));
			guestOSDiagnoseResult.setParameters(_ctx.stringValue("OpsCreateChangeGuestOSDiagnoseResultResponse.Data["+ i +"].Parameters"));
			guestOSDiagnoseResult.setName(_ctx.stringValue("OpsCreateChangeGuestOSDiagnoseResultResponse.Data["+ i +"].Name"));

			data.add(guestOSDiagnoseResult);
		}
		opsCreateChangeGuestOSDiagnoseResultResponse.setData(data);
	 
	 	return opsCreateChangeGuestOSDiagnoseResultResponse;
	}
}