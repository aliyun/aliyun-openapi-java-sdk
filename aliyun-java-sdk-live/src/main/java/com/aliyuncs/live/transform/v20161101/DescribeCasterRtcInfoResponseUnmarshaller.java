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

import com.aliyuncs.live.model.v20161101.DescribeCasterRtcInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasterRtcInfoResponseUnmarshaller {

	public static DescribeCasterRtcInfoResponse unmarshall(DescribeCasterRtcInfoResponse describeCasterRtcInfoResponse, UnmarshallerContext context) {
		
		describeCasterRtcInfoResponse.setRequestId(context.stringValue("DescribeCasterRtcInfoResponse.RequestId"));
		describeCasterRtcInfoResponse.setCasterId(context.stringValue("DescribeCasterRtcInfoResponse.CasterId"));
		describeCasterRtcInfoResponse.setAuthToken(context.stringValue("DescribeCasterRtcInfoResponse.AuthToken"));
	 
	 	return describeCasterRtcInfoResponse;
	}
}