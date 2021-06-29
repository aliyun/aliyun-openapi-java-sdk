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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.VerifyDeviceResponse;
import com.aliyuncs.vcs.model.v20200515.VerifyDeviceResponse.VerifyDeviceResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyDeviceResponseUnmarshaller {

	public static VerifyDeviceResponse unmarshall(VerifyDeviceResponse verifyDeviceResponse, UnmarshallerContext _ctx) {
		
		verifyDeviceResponse.setRequestId(_ctx.stringValue("VerifyDeviceResponse.RequestId"));
		verifyDeviceResponse.setMessage(_ctx.stringValue("VerifyDeviceResponse.Message"));
		verifyDeviceResponse.setCode(_ctx.stringValue("VerifyDeviceResponse.Code"));

		List<VerifyDeviceResult> data = new ArrayList<VerifyDeviceResult>();
		for (int i = 0; i < _ctx.lengthValue("VerifyDeviceResponse.Data.Length"); i++) {
			VerifyDeviceResult verifyDeviceResult = new VerifyDeviceResult();
			verifyDeviceResult.setOriginalGbId(_ctx.stringValue("VerifyDeviceResponse.Data["+ i +"].OriginalGbId"));
			verifyDeviceResult.setSuggestGbId(_ctx.stringValue("VerifyDeviceResponse.Data["+ i +"].SuggestGbId"));
			verifyDeviceResult.setMessage(_ctx.stringValue("VerifyDeviceResponse.Data["+ i +"].Message"));
			verifyDeviceResult.setCode(_ctx.stringValue("VerifyDeviceResponse.Data["+ i +"].Code"));
			verifyDeviceResult.setRowNumber(_ctx.longValue("VerifyDeviceResponse.Data["+ i +"].RowNumber"));
			verifyDeviceResult.setId(_ctx.stringValue("VerifyDeviceResponse.Data["+ i +"].Id"));

			data.add(verifyDeviceResult);
		}
		verifyDeviceResponse.setData(data);
	 
	 	return verifyDeviceResponse;
	}
}