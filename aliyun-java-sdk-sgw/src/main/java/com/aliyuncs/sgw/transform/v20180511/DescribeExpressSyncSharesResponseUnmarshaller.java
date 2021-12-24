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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeExpressSyncSharesResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeExpressSyncSharesResponse.Share;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpressSyncSharesResponseUnmarshaller {

	public static DescribeExpressSyncSharesResponse unmarshall(DescribeExpressSyncSharesResponse describeExpressSyncSharesResponse, UnmarshallerContext _ctx) {
		
		describeExpressSyncSharesResponse.setRequestId(_ctx.stringValue("DescribeExpressSyncSharesResponse.RequestId"));
		describeExpressSyncSharesResponse.setMessage(_ctx.stringValue("DescribeExpressSyncSharesResponse.Message"));
		describeExpressSyncSharesResponse.setCode(_ctx.stringValue("DescribeExpressSyncSharesResponse.Code"));
		describeExpressSyncSharesResponse.setSuccess(_ctx.booleanValue("DescribeExpressSyncSharesResponse.Success"));

		List<Share> shares = new ArrayList<Share>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExpressSyncSharesResponse.Shares.Length"); i++) {
			Share share = new Share();
			share.setMnsQueue(_ctx.stringValue("DescribeExpressSyncSharesResponse.Shares["+ i +"].MnsQueue"));
			share.setExpressSyncId(_ctx.stringValue("DescribeExpressSyncSharesResponse.Shares["+ i +"].ExpressSyncId"));
			share.setGatewayId(_ctx.stringValue("DescribeExpressSyncSharesResponse.Shares["+ i +"].GatewayId"));
			share.setExpressSyncState(_ctx.stringValue("DescribeExpressSyncSharesResponse.Shares["+ i +"].ExpressSyncState"));
			share.setGatewayName(_ctx.stringValue("DescribeExpressSyncSharesResponse.Shares["+ i +"].GatewayName"));
			share.setStorageBundleId(_ctx.stringValue("DescribeExpressSyncSharesResponse.Shares["+ i +"].StorageBundleId"));
			share.setSyncProgress(_ctx.integerValue("DescribeExpressSyncSharesResponse.Shares["+ i +"].SyncProgress"));
			share.setGatewayRegion(_ctx.stringValue("DescribeExpressSyncSharesResponse.Shares["+ i +"].GatewayRegion"));
			share.setShareName(_ctx.stringValue("DescribeExpressSyncSharesResponse.Shares["+ i +"].ShareName"));

			shares.add(share);
		}
		describeExpressSyncSharesResponse.setShares(shares);
	 
	 	return describeExpressSyncSharesResponse;
	}
}