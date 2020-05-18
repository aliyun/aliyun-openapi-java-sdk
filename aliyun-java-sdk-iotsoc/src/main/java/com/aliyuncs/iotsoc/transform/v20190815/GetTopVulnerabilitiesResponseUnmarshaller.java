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

package com.aliyuncs.iotsoc.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotsoc.model.v20190815.GetTopVulnerabilitiesResponse;
import com.aliyuncs.iotsoc.model.v20190815.GetTopVulnerabilitiesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTopVulnerabilitiesResponseUnmarshaller {

	public static GetTopVulnerabilitiesResponse unmarshall(GetTopVulnerabilitiesResponse getTopVulnerabilitiesResponse, UnmarshallerContext _ctx) {
		
		getTopVulnerabilitiesResponse.setRequestId(_ctx.stringValue("GetTopVulnerabilitiesResponse.RequestId"));
		getTopVulnerabilitiesResponse.setSuccess(_ctx.booleanValue("GetTopVulnerabilitiesResponse.Success"));
		getTopVulnerabilitiesResponse.setCode(_ctx.stringValue("GetTopVulnerabilitiesResponse.Code"));
		getTopVulnerabilitiesResponse.setMessage(_ctx.stringValue("GetTopVulnerabilitiesResponse.Message"));

		Data data = new Data();

		List<String> vulnerabilities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTopVulnerabilitiesResponse.Data.Vulnerabilities.Length"); i++) {
			vulnerabilities.add(_ctx.stringValue("GetTopVulnerabilitiesResponse.Data.Vulnerabilities["+ i +"]"));
		}
		data.setVulnerabilities(vulnerabilities);

		List<String> affectedDevices = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTopVulnerabilitiesResponse.Data.AffectedDevices.Length"); i++) {
			affectedDevices.add(_ctx.stringValue("GetTopVulnerabilitiesResponse.Data.AffectedDevices["+ i +"]"));
		}
		data.setAffectedDevices(affectedDevices);
		getTopVulnerabilitiesResponse.setData(data);
	 
	 	return getTopVulnerabilitiesResponse;
	}
}