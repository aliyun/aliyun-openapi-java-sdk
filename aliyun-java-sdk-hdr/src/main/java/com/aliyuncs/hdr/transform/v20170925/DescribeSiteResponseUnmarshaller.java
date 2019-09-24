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

import com.aliyuncs.hdr.model.v20170925.DescribeSiteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSiteResponseUnmarshaller {

	public static DescribeSiteResponse unmarshall(DescribeSiteResponse describeSiteResponse, UnmarshallerContext _ctx) {
		
		describeSiteResponse.setRequestId(_ctx.stringValue("DescribeSiteResponse.RequestId"));
		describeSiteResponse.setSuccess(_ctx.booleanValue("DescribeSiteResponse.Success"));
		describeSiteResponse.setCode(_ctx.stringValue("DescribeSiteResponse.Code"));
		describeSiteResponse.setMessage(_ctx.stringValue("DescribeSiteResponse.Message"));
		describeSiteResponse.setSiteId(_ctx.stringValue("DescribeSiteResponse.SiteId"));
		describeSiteResponse.setName(_ctx.stringValue("DescribeSiteResponse.Name"));
		describeSiteResponse.setType(_ctx.stringValue("DescribeSiteResponse.Type"));
		describeSiteResponse.setRegionId(_ctx.stringValue("DescribeSiteResponse.RegionId"));
		describeSiteResponse.setVpcId(_ctx.stringValue("DescribeSiteResponse.VpcId"));
		describeSiteResponse.setZoneId(_ctx.stringValue("DescribeSiteResponse.ZoneId"));
		describeSiteResponse.setUserSecurityGroupId(_ctx.stringValue("DescribeSiteResponse.UserSecurityGroupId"));
	 
	 	return describeSiteResponse;
	}
}