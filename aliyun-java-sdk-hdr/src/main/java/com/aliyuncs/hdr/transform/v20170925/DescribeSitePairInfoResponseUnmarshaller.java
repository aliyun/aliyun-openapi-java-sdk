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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.DescribeSitePairInfoResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeSitePairInfoResponse.PrimarySiteInfo;
import com.aliyuncs.hdr.model.v20170925.DescribeSitePairInfoResponse.SecondarySiteInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSitePairInfoResponseUnmarshaller {

	public static DescribeSitePairInfoResponse unmarshall(DescribeSitePairInfoResponse describeSitePairInfoResponse, UnmarshallerContext _ctx) {
		
		describeSitePairInfoResponse.setRequestId(_ctx.stringValue("DescribeSitePairInfoResponse.RequestId"));
		describeSitePairInfoResponse.setSuccess(_ctx.booleanValue("DescribeSitePairInfoResponse.Success"));
		describeSitePairInfoResponse.setCode(_ctx.stringValue("DescribeSitePairInfoResponse.Code"));
		describeSitePairInfoResponse.setMessage(_ctx.stringValue("DescribeSitePairInfoResponse.Message"));

		PrimarySiteInfo primarySiteInfo = new PrimarySiteInfo();
		primarySiteInfo.setNumberOfProtectedServers(_ctx.integerValue("DescribeSitePairInfoResponse.PrimarySiteInfo.NumberOfProtectedServers"));
		primarySiteInfo.setNumberOfUnProtectedServers(_ctx.integerValue("DescribeSitePairInfoResponse.PrimarySiteInfo.NumberOfUnProtectedServers"));
		primarySiteInfo.setDiskSizeOfProtectedServers(_ctx.longValue("DescribeSitePairInfoResponse.PrimarySiteInfo.DiskSizeOfProtectedServers"));
		primarySiteInfo.setNumberOfShadowServers(_ctx.integerValue("DescribeSitePairInfoResponse.PrimarySiteInfo.NumberOfShadowServers"));
		primarySiteInfo.setDiskSizeOfShadowServers(_ctx.longValue("DescribeSitePairInfoResponse.PrimarySiteInfo.DiskSizeOfShadowServers"));
		primarySiteInfo.setNumberOfRecoveryPoints(_ctx.integerValue("DescribeSitePairInfoResponse.PrimarySiteInfo.NumberOfRecoveryPoints"));
		describeSitePairInfoResponse.setPrimarySiteInfo(primarySiteInfo);

		SecondarySiteInfo secondarySiteInfo = new SecondarySiteInfo();
		secondarySiteInfo.setNumberOfProtectedServers(_ctx.integerValue("DescribeSitePairInfoResponse.SecondarySiteInfo.NumberOfProtectedServers"));
		secondarySiteInfo.setNumberOfUnProtectedServers(_ctx.integerValue("DescribeSitePairInfoResponse.SecondarySiteInfo.NumberOfUnProtectedServers"));
		secondarySiteInfo.setDiskSizeOfProtectedServers(_ctx.longValue("DescribeSitePairInfoResponse.SecondarySiteInfo.DiskSizeOfProtectedServers"));
		secondarySiteInfo.setNumberOfShadowServers(_ctx.integerValue("DescribeSitePairInfoResponse.SecondarySiteInfo.NumberOfShadowServers"));
		secondarySiteInfo.setDiskSizeOfShadowServers(_ctx.longValue("DescribeSitePairInfoResponse.SecondarySiteInfo.DiskSizeOfShadowServers"));
		secondarySiteInfo.setNumberOfRecoveryPoints(_ctx.integerValue("DescribeSitePairInfoResponse.SecondarySiteInfo.NumberOfRecoveryPoints"));
		describeSitePairInfoResponse.setSecondarySiteInfo(secondarySiteInfo);
	 
	 	return describeSitePairInfoResponse;
	}
}