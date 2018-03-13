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
package com.aliyuncs.yundun.transform.v20150416;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.yundun.model.v20150416.WafInfoResponse;
import com.aliyuncs.yundun.model.v20150416.WafInfoResponse.WafInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class WafInfoResponseUnmarshaller {

	public static WafInfoResponse unmarshall(WafInfoResponse wafInfoResponse, UnmarshallerContext context) {
		
		wafInfoResponse.setRequestId(context.stringValue("WafInfoResponse.RequestId"));
		wafInfoResponse.setWafDomainNum(context.integerValue("WafInfoResponse.WafDomainNum"));

		List<WafInfo> wafInfos = new ArrayList<WafInfo>();
		for (int i = 0; i < context.lengthValue("WafInfoResponse.WafInfos.Length"); i++) {
			WafInfo  wafInfo = new WafInfo();
			wafInfo.setId(context.integerValue("WafInfoResponse.WafInfos["+ i +"].Id"));
			wafInfo.setDomain(context.stringValue("WafInfoResponse.WafInfos["+ i +"].Domain"));
			wafInfo.setCname(context.stringValue("WafInfoResponse.WafInfos["+ i +"].Cname"));
			wafInfo.setStatus(context.integerValue("WafInfoResponse.WafInfos["+ i +"].Status"));

			wafInfos.add(wafInfo);
		}
		wafInfoResponse.setWafInfos(wafInfos);
	 
	 	return wafInfoResponse;
	}
}