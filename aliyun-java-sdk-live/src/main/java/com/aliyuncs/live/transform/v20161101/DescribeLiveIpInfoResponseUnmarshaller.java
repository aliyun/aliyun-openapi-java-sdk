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

package com.aliyuncs.live.transform.v20161101;

import com.aliyuncs.live.model.v20161101.DescribeLiveIpInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveIpInfoResponseUnmarshaller {

	public static DescribeLiveIpInfoResponse unmarshall(DescribeLiveIpInfoResponse describeLiveIpInfoResponse, UnmarshallerContext _ctx) {
		
		describeLiveIpInfoResponse.setRequestId(_ctx.stringValue("DescribeLiveIpInfoResponse.RequestId"));
		describeLiveIpInfoResponse.setISP(_ctx.stringValue("DescribeLiveIpInfoResponse.ISP"));
		describeLiveIpInfoResponse.setIspEname(_ctx.stringValue("DescribeLiveIpInfoResponse.IspEname"));
		describeLiveIpInfoResponse.setRegion(_ctx.stringValue("DescribeLiveIpInfoResponse.Region"));
		describeLiveIpInfoResponse.setRegionEname(_ctx.stringValue("DescribeLiveIpInfoResponse.RegionEname"));
	 
	 	return describeLiveIpInfoResponse;
	}
}