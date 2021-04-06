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

import com.aliyuncs.dataworks_public.model.v20200518.TopTenErrorTimesInstanceResponse;
import com.aliyuncs.dataworks_public.model.v20200518.TopTenErrorTimesInstanceResponse.InstanceErrorRank;
import com.aliyuncs.dataworks_public.model.v20200518.TopTenErrorTimesInstanceResponse.InstanceErrorRank.ErrorRankItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TopTenErrorTimesInstanceResponseUnmarshaller {

	public static TopTenErrorTimesInstanceResponse unmarshall(TopTenErrorTimesInstanceResponse topTenErrorTimesInstanceResponse, UnmarshallerContext _ctx) {
		
		topTenErrorTimesInstanceResponse.setRequestId(_ctx.stringValue("TopTenErrorTimesInstanceResponse.RequestId"));

		InstanceErrorRank instanceErrorRank = new InstanceErrorRank();
		instanceErrorRank.setUpdateTime(_ctx.longValue("TopTenErrorTimesInstanceResponse.InstanceErrorRank.UpdateTime"));

		List<ErrorRankItem> errorRank = new ArrayList<ErrorRankItem>();
		for (int i = 0; i < _ctx.lengthValue("TopTenErrorTimesInstanceResponse.InstanceErrorRank.ErrorRank.Length"); i++) {
			ErrorRankItem errorRankItem = new ErrorRankItem();
			errorRankItem.setNodeId(_ctx.longValue("TopTenErrorTimesInstanceResponse.InstanceErrorRank.ErrorRank["+ i +"].NodeId"));
			errorRankItem.setNodeName(_ctx.stringValue("TopTenErrorTimesInstanceResponse.InstanceErrorRank.ErrorRank["+ i +"].NodeName"));
			errorRankItem.setOwner(_ctx.stringValue("TopTenErrorTimesInstanceResponse.InstanceErrorRank.ErrorRank["+ i +"].Owner"));
			errorRankItem.setCount(_ctx.integerValue("TopTenErrorTimesInstanceResponse.InstanceErrorRank.ErrorRank["+ i +"].Count"));
			errorRankItem.setProjectId(_ctx.longValue("TopTenErrorTimesInstanceResponse.InstanceErrorRank.ErrorRank["+ i +"].ProjectId"));
			errorRankItem.setProgramType(_ctx.integerValue("TopTenErrorTimesInstanceResponse.InstanceErrorRank.ErrorRank["+ i +"].ProgramType"));

			errorRank.add(errorRankItem);
		}
		instanceErrorRank.setErrorRank(errorRank);
		topTenErrorTimesInstanceResponse.setInstanceErrorRank(instanceErrorRank);
	 
	 	return topTenErrorTimesInstanceResponse;
	}
}