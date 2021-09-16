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

import com.aliyuncs.live.model.v20161101.DescribeLiveEdgeTransferResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveEdgeTransferResponseUnmarshaller {

	public static DescribeLiveEdgeTransferResponse unmarshall(DescribeLiveEdgeTransferResponse describeLiveEdgeTransferResponse, UnmarshallerContext _ctx) {
		
		describeLiveEdgeTransferResponse.setRequestId(_ctx.stringValue("DescribeLiveEdgeTransferResponse.RequestId"));
		describeLiveEdgeTransferResponse.setDomainName(_ctx.stringValue("DescribeLiveEdgeTransferResponse.DomainName"));
		describeLiveEdgeTransferResponse.setAppName(_ctx.stringValue("DescribeLiveEdgeTransferResponse.AppName"));
		describeLiveEdgeTransferResponse.setStreamName(_ctx.stringValue("DescribeLiveEdgeTransferResponse.StreamName"));
		describeLiveEdgeTransferResponse.setTargetDomainList(_ctx.stringValue("DescribeLiveEdgeTransferResponse.TargetDomainList"));
		describeLiveEdgeTransferResponse.setTransferArgs(_ctx.stringValue("DescribeLiveEdgeTransferResponse.TransferArgs"));
		describeLiveEdgeTransferResponse.setHttpDns(_ctx.stringValue("DescribeLiveEdgeTransferResponse.HttpDns"));
	 
	 	return describeLiveEdgeTransferResponse;
	}
}