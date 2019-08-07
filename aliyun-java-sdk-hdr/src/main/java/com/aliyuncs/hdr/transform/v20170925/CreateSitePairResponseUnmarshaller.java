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

import com.aliyuncs.hdr.model.v20170925.CreateSitePairResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSitePairResponseUnmarshaller {

	public static CreateSitePairResponse unmarshall(CreateSitePairResponse createSitePairResponse, UnmarshallerContext _ctx) {
		
		createSitePairResponse.setRequestId(_ctx.stringValue("CreateSitePairResponse.RequestId"));
		createSitePairResponse.setSuccess(_ctx.booleanValue("CreateSitePairResponse.Success"));
		createSitePairResponse.setCode(_ctx.stringValue("CreateSitePairResponse.Code"));
		createSitePairResponse.setMessage(_ctx.stringValue("CreateSitePairResponse.Message"));
		createSitePairResponse.setSitePairId(_ctx.stringValue("CreateSitePairResponse.SitePairId"));
		createSitePairResponse.setBucketName(_ctx.stringValue("CreateSitePairResponse.BucketName"));
		createSitePairResponse.setGatewayId(_ctx.stringValue("CreateSitePairResponse.GatewayId"));
		createSitePairResponse.setUid(_ctx.longValue("CreateSitePairResponse.Uid"));
		createSitePairResponse.setPrimarySiteId(_ctx.stringValue("CreateSitePairResponse.PrimarySiteId"));
		createSitePairResponse.setSecondarySiteId(_ctx.stringValue("CreateSitePairResponse.SecondarySiteId"));
	 
	 	return createSitePairResponse;
	}
}