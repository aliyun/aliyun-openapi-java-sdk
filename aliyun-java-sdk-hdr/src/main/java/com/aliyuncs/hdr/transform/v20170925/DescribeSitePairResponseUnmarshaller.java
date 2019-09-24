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

import com.aliyuncs.hdr.model.v20170925.DescribeSitePairResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSitePairResponseUnmarshaller {

	public static DescribeSitePairResponse unmarshall(DescribeSitePairResponse describeSitePairResponse, UnmarshallerContext _ctx) {
		
		describeSitePairResponse.setRequestId(_ctx.stringValue("DescribeSitePairResponse.RequestId"));
		describeSitePairResponse.setSuccess(_ctx.booleanValue("DescribeSitePairResponse.Success"));
		describeSitePairResponse.setCode(_ctx.stringValue("DescribeSitePairResponse.Code"));
		describeSitePairResponse.setMessage(_ctx.stringValue("DescribeSitePairResponse.Message"));
		describeSitePairResponse.setSitePairId(_ctx.stringValue("DescribeSitePairResponse.SitePairId"));
		describeSitePairResponse.setSitePairType(_ctx.stringValue("DescribeSitePairResponse.SitePairType"));
		describeSitePairResponse.setLocalSiteName(_ctx.stringValue("DescribeSitePairResponse.LocalSiteName"));
		describeSitePairResponse.setCloudSiteName(_ctx.stringValue("DescribeSitePairResponse.CloudSiteName"));
		describeSitePairResponse.setPrimarySiteId(_ctx.stringValue("DescribeSitePairResponse.PrimarySiteId"));
		describeSitePairResponse.setSecondarySiteId(_ctx.stringValue("DescribeSitePairResponse.SecondarySiteId"));
		describeSitePairResponse.setPrimarySiteName(_ctx.stringValue("DescribeSitePairResponse.PrimarySiteName"));
		describeSitePairResponse.setSecondarySiteName(_ctx.stringValue("DescribeSitePairResponse.SecondarySiteName"));
		describeSitePairResponse.setBucketName(_ctx.stringValue("DescribeSitePairResponse.BucketName"));
		describeSitePairResponse.setCreatedTime(_ctx.longValue("DescribeSitePairResponse.CreatedTime"));
	 
	 	return describeSitePairResponse;
	}
}