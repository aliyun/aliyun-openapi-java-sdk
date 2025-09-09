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

package com.aliyuncs.websitebuild.transform.v20250429;

import com.aliyuncs.websitebuild.model.v20250429.GetIcpFilingInfoForPartnerResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetIcpFilingInfoForPartnerResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIcpFilingInfoForPartnerResponseUnmarshaller {

	public static GetIcpFilingInfoForPartnerResponse unmarshall(GetIcpFilingInfoForPartnerResponse getIcpFilingInfoForPartnerResponse, UnmarshallerContext _ctx) {
		
		getIcpFilingInfoForPartnerResponse.setRequestId(_ctx.stringValue("GetIcpFilingInfoForPartnerResponse.RequestId"));

		Data data = new Data();
		data.setIcpNumber(_ctx.stringValue("GetIcpFilingInfoForPartnerResponse.Data.IcpNumber"));
		data.setRecorded(_ctx.booleanValue("GetIcpFilingInfoForPartnerResponse.Data.Recorded"));
		data.setSiteRecordNumber(_ctx.stringValue("GetIcpFilingInfoForPartnerResponse.Data.SiteRecordNumber"));
		getIcpFilingInfoForPartnerResponse.setData(data);
	 
	 	return getIcpFilingInfoForPartnerResponse;
	}
}