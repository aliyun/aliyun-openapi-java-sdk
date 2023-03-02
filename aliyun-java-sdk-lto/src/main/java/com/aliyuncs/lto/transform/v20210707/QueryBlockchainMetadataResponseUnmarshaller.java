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

package com.aliyuncs.lto.transform.v20210707;

import com.aliyuncs.lto.model.v20210707.QueryBlockchainMetadataResponse;
import com.aliyuncs.lto.model.v20210707.QueryBlockchainMetadataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBlockchainMetadataResponseUnmarshaller {

	public static QueryBlockchainMetadataResponse unmarshall(QueryBlockchainMetadataResponse queryBlockchainMetadataResponse, UnmarshallerContext _ctx) {
		
		queryBlockchainMetadataResponse.setRequestId(_ctx.stringValue("QueryBlockchainMetadataResponse.RequestId"));
		queryBlockchainMetadataResponse.setCode(_ctx.stringValue("QueryBlockchainMetadataResponse.Code"));
		queryBlockchainMetadataResponse.setMessage(_ctx.stringValue("QueryBlockchainMetadataResponse.Message"));
		queryBlockchainMetadataResponse.setSuccess(_ctx.booleanValue("QueryBlockchainMetadataResponse.Success"));

		Data data = new Data();
		data.setProductKey(_ctx.stringValue("QueryBlockchainMetadataResponse.Data.ProductKey"));
		data.setMemberName(_ctx.stringValue("QueryBlockchainMetadataResponse.Data.MemberName"));
		data.setTimestamp(_ctx.longValue("QueryBlockchainMetadataResponse.Data.Timestamp"));
		data.setTxHash(_ctx.stringValue("QueryBlockchainMetadataResponse.Data.TxHash"));
		data.setBlockHash(_ctx.stringValue("QueryBlockchainMetadataResponse.Data.BlockHash"));
		data.setBlockNumber(_ctx.stringValue("QueryBlockchainMetadataResponse.Data.BlockNumber"));
		data.setIotId(_ctx.stringValue("QueryBlockchainMetadataResponse.Data.IotId"));
		queryBlockchainMetadataResponse.setData(data);
	 
	 	return queryBlockchainMetadataResponse;
	}
}