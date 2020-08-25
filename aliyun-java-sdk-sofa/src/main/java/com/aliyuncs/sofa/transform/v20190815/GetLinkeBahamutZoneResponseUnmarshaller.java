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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutZoneResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutZoneResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutZoneResponseUnmarshaller {

	public static GetLinkeBahamutZoneResponse unmarshall(GetLinkeBahamutZoneResponse getLinkeBahamutZoneResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutZoneResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutZoneResponse.RequestId"));
		getLinkeBahamutZoneResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutZoneResponse.ResultCode"));
		getLinkeBahamutZoneResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutZoneResponse.ResultMessage"));
		getLinkeBahamutZoneResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutZoneResponse.ErrorMessage"));
		getLinkeBahamutZoneResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutZoneResponse.ErrorMsgParamsMap"));
		getLinkeBahamutZoneResponse.setMessage(_ctx.stringValue("GetLinkeBahamutZoneResponse.Message"));
		getLinkeBahamutZoneResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutZoneResponse.ResponseStatusCode"));
		getLinkeBahamutZoneResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutZoneResponse.Success"));

		Result result = new Result();
		result.setStation(_ctx.stringValue("GetLinkeBahamutZoneResponse.Result.Station"));

		List<String> zones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutZoneResponse.Result.Zones.Length"); i++) {
			zones.add(_ctx.stringValue("GetLinkeBahamutZoneResponse.Result.Zones["+ i +"]"));
		}
		result.setZones(zones);
		getLinkeBahamutZoneResponse.setResult(result);
	 
	 	return getLinkeBahamutZoneResponse;
	}
}