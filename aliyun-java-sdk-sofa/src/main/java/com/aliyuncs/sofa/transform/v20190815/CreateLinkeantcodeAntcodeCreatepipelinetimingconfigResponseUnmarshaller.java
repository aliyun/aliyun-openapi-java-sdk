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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse unmarshall(CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse createLinkeantcodeAntcodeCreatepipelinetimingconfigResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.RequestId"));
		createLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.ResultCode"));
		createLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.ResultMessage"));
		createLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.setBranch(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.Branch"));
		createLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.setCron(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.Cron"));
		createLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.setDesc(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.Desc"));
		createLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.setId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.Id"));
		createLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.setYml(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatepipelinetimingconfigResponse.Yml"));
	 
	 	return createLinkeantcodeAntcodeCreatepipelinetimingconfigResponse;
	}
}