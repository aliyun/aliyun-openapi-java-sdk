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

import com.aliyuncs.dataworks_public.model.v20200518.TopTenElapsedTimeInstanceResponse;
import com.aliyuncs.dataworks_public.model.v20200518.TopTenElapsedTimeInstanceResponse.InstanceConsumeTimeRank;
import com.aliyuncs.dataworks_public.model.v20200518.TopTenElapsedTimeInstanceResponse.InstanceConsumeTimeRank.ConsumeTimeRankItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TopTenElapsedTimeInstanceResponseUnmarshaller {

	public static TopTenElapsedTimeInstanceResponse unmarshall(TopTenElapsedTimeInstanceResponse topTenElapsedTimeInstanceResponse, UnmarshallerContext _ctx) {
		
		topTenElapsedTimeInstanceResponse.setRequestId(_ctx.stringValue("TopTenElapsedTimeInstanceResponse.RequestId"));

		InstanceConsumeTimeRank instanceConsumeTimeRank = new InstanceConsumeTimeRank();
		instanceConsumeTimeRank.setUpdateTime(_ctx.longValue("TopTenElapsedTimeInstanceResponse.InstanceConsumeTimeRank.UpdateTime"));

		List<ConsumeTimeRankItem> consumeTimeRank = new ArrayList<ConsumeTimeRankItem>();
		for (int i = 0; i < _ctx.lengthValue("TopTenElapsedTimeInstanceResponse.InstanceConsumeTimeRank.ConsumeTimeRank.Length"); i++) {
			ConsumeTimeRankItem consumeTimeRankItem = new ConsumeTimeRankItem();
			consumeTimeRankItem.setNodeName(_ctx.stringValue("TopTenElapsedTimeInstanceResponse.InstanceConsumeTimeRank.ConsumeTimeRank["+ i +"].NodeName"));
			consumeTimeRankItem.setNodeId(_ctx.longValue("TopTenElapsedTimeInstanceResponse.InstanceConsumeTimeRank.ConsumeTimeRank["+ i +"].NodeId"));
			consumeTimeRankItem.setBusinessDate(_ctx.longValue("TopTenElapsedTimeInstanceResponse.InstanceConsumeTimeRank.ConsumeTimeRank["+ i +"].BusinessDate"));
			consumeTimeRankItem.setOwner(_ctx.stringValue("TopTenElapsedTimeInstanceResponse.InstanceConsumeTimeRank.ConsumeTimeRank["+ i +"].Owner"));
			consumeTimeRankItem.setConsumed(_ctx.longValue("TopTenElapsedTimeInstanceResponse.InstanceConsumeTimeRank.ConsumeTimeRank["+ i +"].Consumed"));
			consumeTimeRankItem.setInstanceId(_ctx.longValue("TopTenElapsedTimeInstanceResponse.InstanceConsumeTimeRank.ConsumeTimeRank["+ i +"].InstanceId"));
			consumeTimeRankItem.setProgramType(_ctx.integerValue("TopTenElapsedTimeInstanceResponse.InstanceConsumeTimeRank.ConsumeTimeRank["+ i +"].ProgramType"));

			consumeTimeRank.add(consumeTimeRankItem);
		}
		instanceConsumeTimeRank.setConsumeTimeRank(consumeTimeRank);
		topTenElapsedTimeInstanceResponse.setInstanceConsumeTimeRank(instanceConsumeTimeRank);
	 
	 	return topTenElapsedTimeInstanceResponse;
	}
}