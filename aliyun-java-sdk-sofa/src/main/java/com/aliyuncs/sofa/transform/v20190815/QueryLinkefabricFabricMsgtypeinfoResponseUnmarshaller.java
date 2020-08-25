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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricMsgtypeinfoResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricMsgtypeinfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricMsgtypeinfoResponseUnmarshaller {

	public static QueryLinkefabricFabricMsgtypeinfoResponse unmarshall(QueryLinkefabricFabricMsgtypeinfoResponse queryLinkefabricFabricMsgtypeinfoResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricMsgtypeinfoResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.RequestId"));
		queryLinkefabricFabricMsgtypeinfoResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.ResultCode"));
		queryLinkefabricFabricMsgtypeinfoResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.ResultMessage"));
		queryLinkefabricFabricMsgtypeinfoResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Message"));
		queryLinkefabricFabricMsgtypeinfoResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricMsgtypeinfoResponse.ResponseStatusCode"));
		queryLinkefabricFabricMsgtypeinfoResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricMsgtypeinfoResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAction(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].Action"));
			dataItem.setClusterName(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].ClusterName"));
			dataItem.setDesc(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].Desc"));
			dataItem.setEventcode(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].Eventcode"));
			dataItem.setMsgSize(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].MsgSize"));
			dataItem.setMsgTotal(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].MsgTotal"));
			dataItem.setNormalTps(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].NormalTps"));
			dataItem.setPeakTotal(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].PeakTotal"));
			dataItem.setPeakTps(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].PeakTps"));
			dataItem.setPgroup(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].Pgroup"));
			dataItem.setReadPartition(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].ReadPartition"));
			dataItem.setReliabilityReq(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].ReliabilityReq"));
			dataItem.setTopic(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].Topic"));
			dataItem.setTypeDesc(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].TypeDesc"));
			dataItem.setUseCase(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].UseCase"));
			dataItem.setWritePartition(_ctx.stringValue("QueryLinkefabricFabricMsgtypeinfoResponse.Data["+ i +"].WritePartition"));

			data.add(dataItem);
		}
		queryLinkefabricFabricMsgtypeinfoResponse.setData(data);
	 
	 	return queryLinkefabricFabricMsgtypeinfoResponse;
	}
}