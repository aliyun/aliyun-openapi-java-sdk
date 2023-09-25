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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetInstanceConsumeTimeRankResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetInstanceConsumeTimeRankResponse.InstanceConsumeTimeRank;
import com.aliyuncs.dataworks_public.model.v20200518.GetInstanceConsumeTimeRankResponse.InstanceConsumeTimeRank.ConsumeTimeRankItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceConsumeTimeRankResponseUnmarshaller {

	public static GetInstanceConsumeTimeRankResponse unmarshall(GetInstanceConsumeTimeRankResponse getInstanceConsumeTimeRankResponse, UnmarshallerContext _ctx) {
		
		getInstanceConsumeTimeRankResponse.setRequestId(_ctx.stringValue("GetInstanceConsumeTimeRankResponse.RequestId"));

		InstanceConsumeTimeRank instanceConsumeTimeRank = new InstanceConsumeTimeRank();
		instanceConsumeTimeRank.setUpdateTime(_ctx.longValue("GetInstanceConsumeTimeRankResponse.InstanceConsumeTimeRank.UpdateTime"));

		List<ConsumeTimeRankItem> consumeTimeRank = new ArrayList<ConsumeTimeRankItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceConsumeTimeRankResponse.InstanceConsumeTimeRank.ConsumeTimeRank.Length"); i++) {
			ConsumeTimeRankItem consumeTimeRankItem = new ConsumeTimeRankItem();
			consumeTimeRankItem.setOwner(_ctx.stringValue("GetInstanceConsumeTimeRankResponse.InstanceConsumeTimeRank.ConsumeTimeRank["+ i +"].Owner"));
			consumeTimeRankItem.setNodeName(_ctx.stringValue("GetInstanceConsumeTimeRankResponse.InstanceConsumeTimeRank.ConsumeTimeRank["+ i +"].NodeName"));
			consumeTimeRankItem.setBizdate(_ctx.longValue("GetInstanceConsumeTimeRankResponse.InstanceConsumeTimeRank.ConsumeTimeRank["+ i +"].Bizdate"));
			consumeTimeRankItem.setInstanceId(_ctx.longValue("GetInstanceConsumeTimeRankResponse.InstanceConsumeTimeRank.ConsumeTimeRank["+ i +"].InstanceId"));
			consumeTimeRankItem.setPrgType(_ctx.integerValue("GetInstanceConsumeTimeRankResponse.InstanceConsumeTimeRank.ConsumeTimeRank["+ i +"].PrgType"));
			consumeTimeRankItem.setNodeId(_ctx.longValue("GetInstanceConsumeTimeRankResponse.InstanceConsumeTimeRank.ConsumeTimeRank["+ i +"].NodeId"));
			consumeTimeRankItem.setConsumed(_ctx.longValue("GetInstanceConsumeTimeRankResponse.InstanceConsumeTimeRank.ConsumeTimeRank["+ i +"].Consumed"));

			consumeTimeRank.add(consumeTimeRankItem);
		}
		instanceConsumeTimeRank.setConsumeTimeRank(consumeTimeRank);
		getInstanceConsumeTimeRankResponse.setInstanceConsumeTimeRank(instanceConsumeTimeRank);
	 
	 	return getInstanceConsumeTimeRankResponse;
	}
}